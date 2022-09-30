package com.example.demo.controller;

import com.example.demo.model.Chanel;
import com.example.demo.service.ChanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChanelController {

    @Autowired
    private ChanelService chanelService;

    @PostMapping
    public Chanel add(@RequestBody Chanel chanel) {
        return chanelService.add(chanel);
    }

    @GetMapping
    public List<Chanel> getAllChanel() {
        return chanelService.getAll();
    }

    @PostMapping
    public Chanel changeName(@PathVariable int id, String name) {
        return chanelService.changeName(id, name);
    }

}
