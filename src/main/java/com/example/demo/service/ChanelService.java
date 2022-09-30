package com.example.demo.service;

import com.example.demo.model.Chanel;
import com.example.demo.repository.ChanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChanelService {

    @Autowired
    private ChanelRepository chanelRepository;

    public Chanel add(Chanel chanel) {
        return chanelRepository.save(chanel);
    }

    public List<Chanel> getAll() {
        return chanelRepository.findAll();
    }

    public Chanel getOneChanel(int id) {
        Chanel oneChanel = chanelRepository.findById(id).get();
        return oneChanel;
    }

    public Chanel changeName(int id, String name) {
        Chanel oneChanel = getOneChanel(id);
        oneChanel.setChatName(name);
        return chanelRepository.save(oneChanel);
    }

}
