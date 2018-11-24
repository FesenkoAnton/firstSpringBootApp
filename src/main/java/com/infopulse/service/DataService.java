package com.infopulse.service;

import com.infopulse.converter.ClientConverter;
import com.infopulse.dto.ClientDto;
import com.infopulse.entity.Client;
import com.infopulse.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DataService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientConverter clientConverter;

    @Transactional
    public void createClient(String name){
        Client client =new Client();
        client.setName(name);
        this.clientRepository.save(client);
    }

    @Transactional
    public List<String> getAll(){
        return
                this.clientRepository.findAll().stream()
                .map(client -> client.getName())
                .collect(Collectors.toList());
    }

    @Transactional
    public List<ClientDto> getAllClientDtos(){
        return
                clientConverter.converToListDto(this.clientRepository.findAll());

    }


}
