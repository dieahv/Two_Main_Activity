package com.example.two_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {
    private TextView name, surname, Imcres,Envejeres,Vrporcent_res;
    private Button ButtonImc, ButtonEnveje, Buttonvrporcent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);


        name = findViewById(R.id.nombre_1);
        surname = findViewById(R.id.apellido_2);

        Imcres = findViewById(R.id.res_imc);
        ButtonImc = findViewById(R.id.bnt_imc);

        Envejeres = findViewById(R.id.res_envej);
        ButtonEnveje = findViewById(R.id.btn_envejcer);

        Vrporcent_res = findViewById(R.id.res_vr);
        Buttonvrporcent = findViewById(R.id.btn_vr);


        Bundle sendObj = getIntent().getExtras();
        Cliente customer =null;

        if(sendObj != null){
            customer = (Cliente) sendObj.getSerializable("cliente");

            double restImc = customer.getWeightCus()/(customer.getHighestCus()*customer.getHighestCus());
            final int[] resEnvj = {customer.getAgeCus()};
            double resPorcent = customer.getMoneyCus()*0.19;
            name.setText(customer.getNameCus());
            surname.setText(customer.getsurnameCus());

            ButtonImc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Imcres.setText(String.valueOf(restImc)); ;
                }
            });
            ButtonEnveje.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Envejeres.setText(String.valueOf(++resEnvj[0])); ;
                }
            });
            Buttonvrporcent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Vrporcent_res.setText(String.valueOf(resPorcent)); ;
                }
            });

        }

    }


}