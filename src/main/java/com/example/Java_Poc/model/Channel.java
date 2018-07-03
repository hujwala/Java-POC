package com.example.Java_Poc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="channel")
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long channelId;
    private String name;
    private long amount;

    @ManyToOne
    @JoinColumn(name="classificationId" , referencedColumnName="classificationId")
    private Classification classification;


    public Channel(){

    }

    public Channel(Long channelId, String name, long amount) {
        channelId = channelId;
        this.name = name;
        this.amount = amount;
    }



    public Long getId() {
        return channelId;
    }

    public void setId(Long id) {
        channelId = channelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
}



