package com.example.dvalo.curbes.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dvalo.curbes.R;
import com.example.dvalo.curbes.controller.LoginScreenController;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dvalo on 15.07.2016.
 */
public class LoginScreen extends Activity implements Observer{

    EditText username;
    EditText password;
    Button login;

    LoginScreenController loginScreenController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_page);
        username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
        login = (Button) findViewById(R.id.button_login);

        loginScreenController = new LoginScreenController(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loginScreenController.handleMessage(LoginScreenController.MESSAGE_LOGIN);
            }
        }
        );
    }

    public EditText getUsername() {
        return username;
    }

    public void setUsername(EditText username) {
        this.username = username;
    }

    public EditText getPassword() {
        return password;
    }

    public void setPassword(EditText password) {
        this.password = password;
    }

    public Button getLogin() {
        return login;
    }

    public void setLogin(Button login) {
        this.login = login;
    }

    @Override
    public void update(Observable observable, Object data) {
        String message = (String) data;
       /* switch (message){
            case :

            break;
        }*/
    }

    private void updateGUI(){

    }
}
