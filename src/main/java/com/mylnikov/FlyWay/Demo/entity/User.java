package com.mylnikov.FlyWay.Demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    public Long id;

    public String name;

    public String surName;

    public String email;

}
