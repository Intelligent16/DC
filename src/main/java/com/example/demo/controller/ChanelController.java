package com.example.demo.controller;

import com.example.demo.model.Chanel;
import com.example.demo.service.ChanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChanelController {

    @Autowired
    private ChanelService chanelService;

    @PostMapping
    public Chanel add(@RequestBody Chanel chanel) {
        return  chanelService.add(chanel);

    }

}
