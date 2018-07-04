package com.example.Java_Poc.controller;

import com.example.Java_Poc.Repo.ChannelRepo;
import com.example.Java_Poc.Repo.SubscriptionRepo;
import com.example.Java_Poc.Repo.UserRepo;
import com.example.Java_Poc.model.Channel;
import com.example.Java_Poc.model.Classification;
import com.example.Java_Poc.model.Subscription;
import com.example.Java_Poc.model.User;
import com.example.Java_Poc.service.ChannelService;
import com.example.Java_Poc.service.ClassificationService;
import com.example.Java_Poc.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class SubscriptionController {

    @Autowired
    ChannelService channelService;

    @Autowired
    SubscriptionService subscriptionService;

    @Autowired
    SubscriptionRepo subscriptionRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ChannelRepo channelRepo;

    @PostMapping("/subscription")
    public Subscription addClassification(@RequestBody Subscription sub ) {
        Subscription saveClassification = subscriptionRepo.save(sub);
        return saveClassification;

    }

    @GetMapping("/subscriptions")
    public List<Subscription> getAllSub() {
        return subscriptionService.getAllSub();
    }
}
