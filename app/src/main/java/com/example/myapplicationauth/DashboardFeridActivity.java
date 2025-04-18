package com.example.myapplicationauth;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardFeridActivity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard_ferid);


        // Récupération des boutons
       Button btnStartPump = findViewById(R.id.btn_start_pump);
       Button btnStopPump = findViewById(R.id.btn_stop_pump);
       Button btnValve1Marche = findViewById(R.id.btn_valve1_marche);
       Button  btnValve1Stop = findViewById(R.id.btn_valve1_stop);
       Button btnValve2Marche = findViewById(R.id.btn_valve2_marche);
       Button  btnValve2Stop = findViewById(R.id.btn_valve2_stop);
        // Listener pour le bouton Marche de la pompe
        btnStartPump.setOnClickListener(v -> {
            resetPumpButtonColors();
            btnStartPump.setBackgroundColor(Color.parseColor("#4CAF50")); // Vert
            btnStopPump.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
            // envoyer la commande vers ESP32 si tu veux ici
        });

        // Listener pour le bouton Arrêt de la pompe
        btnStopPump.setOnClickListener(v -> {
            resetPumpButtonColors();
            btnStopPump.setBackgroundColor(Color.parseColor("#F44336")); // Rouge
            btnStartPump.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
            // envoyer la commande vers ESP32 ici aussi
        });

        // Listener pour électrovanne 1
        btnValve1Marche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnValve1Marche.setBackgroundColor(Color.parseColor("#4CAF50")); // Marche = vert
                btnValve1Stop.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
                btnValve1Stop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btnValve1Stop.setBackgroundColor(Color.parseColor("#F44336")); // Stop = rouge
                        btnValve1Marche.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
                        // envoyer commande électrovanne 1 on
                    }
                });

                // Listener pour électrovanne 2
                btnValve2Marche.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btnValve2Marche.setBackgroundColor(Color.parseColor("#4CAF50")); // Marche = vert
                        btnValve2Stop.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
                        btnValve2Stop.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                btnValve2Stop.setBackgroundColor(Color.parseColor("#F44336")); // Stop = rouge
                                btnValve2Marche.setBackgroundColor(Color.parseColor("#03A9F4")); // Remettre l’autre à sa couleur normale
                                // envoyer commande électrovanne 2 on
                            }
                        });

                    }
                });
            }
        });
    }

    private void resetPumpButtonColors() {
    }
}