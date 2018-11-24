package com.infopulse.converter;

import com.infopulse.dto.ClientDto;
import com.infopulse.entity.Client;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientConverter {
    public ClientDto convertToDto(Client client){
        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setName(client.getName());
        return clientDto;
    }

    public List<ClientDto> converToListDto(List<Client> clients){
        return clients.stream()
                .map(entity -> convertToDto(entity))
                .collect(Collectors.toList());
    }
}
