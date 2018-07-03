package com.example.Java_Poc.service;

import com.example.Java_Poc.Repo.ChannelRepo;
import com.example.Java_Poc.Repo.ClassificationRepo;
import com.example.Java_Poc.model.Channel;
import com.example.Java_Poc.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelService {

    @Autowired
    ClassificationRepo classificationRepo;
    @Autowired
    ChannelRepo channelRepo;

    public List<Channel> getAllblog() {

        List<Channel> channel = new ArrayList<>();
        channelRepo.findAll().forEach(channel::add);
        return channel;
    }

    public void addChannel(Channel aPack, Long classificationId) {
        Classification attachToPackage = classificationRepo.findByClassificationId(classificationId);
        aPack.setClassification(attachToPackage);
         channelRepo.save(aPack);
    }
}
