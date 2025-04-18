package com.example.myapplicationauth;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    //declaration des variables
    private TextView goToSignUp;
    private TextView forgetPassword;
    private TextView goToDashboardFerid;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
//affectation des variables
        goToSignUp = findViewById(R.id.go_to_sign_up);
        forgetPassword = findViewById(R.id.forget_password);
        goToDashboardFerid = findViewById(R.id.btn_sign_in);
        //actions
        goToSignUp.setOnClickListener(v -> {

            startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
        });
        goToDashboardFerid.setOnClickListener(v -> {

            startActivity(new Intent(SignInActivity.this, DashboardFeridActivity.class));
        });
        forgetPassword.setOnClickListener(v -> {

            startActivity(new Intent(SignInActivity.this, ResetPasswordActivity.class));
        });

    }

    //declaration des méthodes
}
