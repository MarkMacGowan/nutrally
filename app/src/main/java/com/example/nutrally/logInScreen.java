package com.example.nutrally;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
public class logInScreen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Button loginButton;
        Button registerButton;
        Button forgotPasswordButton;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);


        TextView email = (TextView) findViewById(R.id.emailTf2);
        TextView password = (TextView) findViewById(R.id.passwordTf);
        loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(view -> {
            if (email.getText().toString().equals("admin") && password.getText().toString().equals("password")) {
                Intent intent = new Intent(logInScreen.this, homeScreen.class);
                startActivity(intent);

            } else {
                Toast.makeText(logInScreen.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
            }
        });

        registerButton = (Button)  findViewById((R.id.registerBtn));
        registerButton.setOnClickListener(view -> {
            Intent intent = new Intent(logInScreen.this, signUp.class);
            startActivity(intent);
        });

        forgotPasswordButton = (Button)  findViewById((R.id.forgotPasswordBtn));
        forgotPasswordButton.setOnClickListener(view -> {
            Intent intent = new Intent(logInScreen.this, forgotPassword.class);
            startActivity(intent);
        });





    }
}