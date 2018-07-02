package com.example.Java_Poc.Repo;

import com.example.Java_Poc.model.Channel;
import com.example.Java_Poc.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepo extends JpaRepository<Channel,Long> {

}
