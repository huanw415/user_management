package com.tw.core;

import org.springframework.context.annotation.Scope;

import javax.persistence.*;

/**
 * Created by hgwang on 5/7/15.
 */

@Entity
@Scope("session")
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
