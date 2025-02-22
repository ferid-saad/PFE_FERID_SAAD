package com.example.myapplicationauth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    //declaration des variables
    private TextView goToSignUp;
    private TextView forgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
//affectation des variables
        goToSignUp = findViewById(R.id.go_to_sign_up);
        forgetPassword = findViewById(R.id.forget_password);

        //actions
        goToSignUp.setOnClickListener(v -> {

            startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        });
        forgetPassword.setOnClickListener(v -> {

            startActivity(new Intent(SignInActivity.this, ResetPasswordActivity.class));
        });

    }

    //declaration des méthodes
}
