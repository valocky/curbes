package com.example.dvalo.curbes.controller;

import android.util.Log;

import com.example.dvalo.curbes.model.domain.profile.Account;
import com.example.dvalo.curbes.view.LoginScreen;

/**
 * Created by dvalo on 15.07.2016.
 */
public class LoginScreenController implements IController {

    public static final String TAG =  LoginScreenController.class.getSimpleName();
    public static final String MESSAGE_LOGIN="login";

    private LoginScreen loginScreen;

    public LoginScreenController(LoginScreen loginScreen){
        this.loginScreen = loginScreen;
    }

    @Override
    public void handleMessage(String message) {

        switch (message) {
            case MESSAGE_LOGIN:
                handleLogin();
                break;
        }
    }

    private void handleLogin(){

        Account account = new Account();
        String username = loginScreen.getUsername().getText().toString();
        account.setName(username);
        String password = loginScreen.getPassword().getText().toString();
        account.setPassword(password);

        if(verifyLogin(account)){

            //databaza add user
        }else{
            Log.i(TAG,"User does not exist: "+username);
        }
    }

    private boolean verifyLogin(Account account){

        boolean existUser = false;

        //databaza check if exist
        return existUser;
    }
}
