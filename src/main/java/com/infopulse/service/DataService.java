package com.infopulse.service;

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


}
