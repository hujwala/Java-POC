package com.example.Java_Poc.service;

import com.example.Java_Poc.Repo.SubscriptionRepo;
import com.example.Java_Poc.model.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriptionService {

    @Autowired
    SubscriptionRepo subscriptionRepo;


    public List<Subscription> getAllSub () {
        List<Subscription> sub = new ArrayList<>();
        subscriptionRepo.findAll().forEach(sub::add);
        return sub;
    }
}
