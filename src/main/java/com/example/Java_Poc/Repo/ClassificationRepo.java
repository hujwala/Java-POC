package com.example.Java_Poc.Repo;

import com.example.Java_Poc.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepo extends JpaRepository<Classification,Long> {

    public Classification findByClassificationId(Long classificationId);
}
