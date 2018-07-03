package com.example.Java_Poc.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Classification {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "classificationId", nullable=false)
    private Long classificationId;
    private String name;


    public Classification(){
    }

    public Classification ( Long classificationId, String name, List<Channel> channel ) {
        this.classificationId = classificationId;
        this.name = name;
    }


    public Long getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
