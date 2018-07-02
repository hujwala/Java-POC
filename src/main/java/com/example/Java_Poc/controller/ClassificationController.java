package com.example.Java_Poc.controller;

import com.example.Java_Poc.model.Classification;
import com.example.Java_Poc.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class ClassificationController {

        @Autowired
        ClassificationService classificationService;

        @PostMapping("/classification")
        public void addClassification(@RequestBody Classification classification) {
            classificationService.addClassification(classification);
        }

        @GetMapping("/classifications")
        public List<Classification> getAllGenre() {
            return classificationService.getAllClassification();
        }
    }
