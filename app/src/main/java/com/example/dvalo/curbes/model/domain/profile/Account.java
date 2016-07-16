package com.example.dvalo.curbes.model.domain.profile;

import java.util.Observable;

/**
 * Created by dvalo on 15.07.2016.
 */
public class Account extends Observable{

    private String name="";
    private String password="";
    private String email = "";
    private String nickname ="";
    private String  uchylka = "";
    private HovedoType hovedoType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        setChanged();
        notifyObservers();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        setChanged();
        notifyObservers();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        setChanged();
        notifyObservers();
    }

    public String getUchylka() {
        return uchylka;
    }

    public void setUchylka(String uchylka) {
        this.uchylka = uchylka;
        setChanged();
        notifyObservers();
    }

    public HovedoType getHovedoType() {
        return hovedoType;
    }

    public void setHovedoType(HovedoType hovedoType) {
        this.hovedoType = hovedoType;
        setChanged();
        notifyObservers();
    }
}
