package com.example.Java_Poc.controller;

import com.example.Java_Poc.Repo.ClassificationRepo;
import com.example.Java_Poc.Repo.ChannelRepo;
import com.example.Java_Poc.Repo.UserRepo;
import com.example.Java_Poc.model.Channel;
import com.example.Java_Poc.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChannelController {

    @Autowired
    private ChannelRepo channelRepo;

    @Autowired
    private ClassificationRepo classificationRepo;

    @Autowired
    UserRepo userRepo;
    @Autowired
    ChannelService channelService;

    @Autowired
    public ChannelController(ClassificationRepo classificationRepo) {
        this.classificationRepo = classificationRepo;
    }



    @PostMapping(value = "/channel/{classificationId}")
    public void addClassification(@PathVariable Long classificationId, @RequestBody Channel aPack) {
        channelService.addChannel(aPack, classificationId);
    }

    @GetMapping("/channels")
    public List<Channel> getAllBlog() {
        return channelService.getAllblog();
    }
}
