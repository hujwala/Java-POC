package com.example.Java_Poc.Repo;

import com.example.Java_Poc.model.Classification;
import com.example.Java_Poc.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepo extends JpaRepository<Subscription,Long> {
}
