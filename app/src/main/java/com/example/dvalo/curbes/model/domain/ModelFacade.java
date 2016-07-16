package com.example.dvalo.curbes.model.domain;

import com.example.dvalo.curbes.model.domain.profile.Account;

import java.util.HashMap;

/**
 * Created by dvalo on 15.07.2016.
 */
public class ModelFacade {

    HashMap<String,Account> activeAccounts = new HashMap<String,Account>();//connected users
    Account currentUser;

}
