package com.example.demo.service;

import com.example.demo.model.Chanel;
import com.example.demo.repository.ChanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChanelService {

    @Autowired
    private ChanelRepository chanelRepository;

    public Chanel add(Chanel chanel) {
        return chanelRepository.save(chanel);
    }

}
