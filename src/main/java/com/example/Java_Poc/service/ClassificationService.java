package com.example.Java_Poc.service;

import com.example.Java_Poc.Repo.ClassificationRepo;
import com.example.Java_Poc.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClassificationService {


    @Autowired
    ClassificationRepo classificationRepo;


    public Classification addClassification(Classification classification) {
        Classification saveClassification = classificationRepo.save(classification);
        return saveClassification;

    }

    public List<Classification> getAllClassification() {
        List<Classification> classification = new ArrayList<>();
        classificationRepo.findAll().forEach(classification::add);
        return classification;

    }
}
