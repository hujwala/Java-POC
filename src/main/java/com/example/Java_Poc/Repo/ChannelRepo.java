package com.example.Java_Poc.Repo;

import com.example.Java_Poc.model.Channel;
import com.example.Java_Poc.model.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChannelRepo extends JpaRepository<Channel,Long> {
    public Channel findByChannelId(Long channelId);


}
