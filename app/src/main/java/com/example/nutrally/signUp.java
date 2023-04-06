package com.example.nutrally;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class signUp extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        /*
         * @Author With Sam
         * @reference https://www.youtube.com/watch?v=dm-jan0YORg
         * @ Uploaded 7th April 2019
         * @ Retrieved 29th March 2023
         */


        button=(Button) findViewById(R.id.returnToLogBtn4);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(signUp.this,logInScreen.class);
                startActivity(intent);

            }
        });



    }
}