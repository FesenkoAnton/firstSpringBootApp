package com.infopulse.controller;

import com.infopulse.dto.ClientDto;
import com.infopulse.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {

    private DataService dataService;

    public JsonController(DataService dataService){
        this.dataService = dataService;
    }

    @RequestMapping(value="/rest", method = RequestMethod.GET)
    public List<ClientDto> getAllClients(){
        return dataService.getAllClientDtos();
    }
}
