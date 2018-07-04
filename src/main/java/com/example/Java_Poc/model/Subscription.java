package com.example.Java_Poc.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subscription implements Serializable {

    private Long userId;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long subId;

    public Subscription(){

}

    public Subscription ( Long userId, Long channelId, Long subId ) {
        this.userId = userId;
        this.subId = subId;
    }

    public void setUserId ( Long userId ) {
        this.userId = userId;
    }


    public Long getSubId () {
        return subId;
    }

    public void setSubId ( Long subId ) {
        this.subId = subId;
    }

    public Long getUserId () {
        return userId;
    }



}
