package com.example.two_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    public EditText nameCus;
    public EditText surnameCus;
    public EditText ageCus;
    public EditText highestCus;
    public EditText weightCus;
    public EditText moneyCus;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameCus = findViewById(R.id.Nombre);
        surnameCus = findViewById(R.id.Apellido);
        ageCus = findViewById(R.id.Edad);
        highestCus = findViewById(R.id.Estatura);
        weightCus = findViewById(R.id.Peso);
        moneyCus = findViewById(R.id.Dinero);
        enviar = findViewById(R.id.Enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validar()){
                String name_Cus = nameCus.getText().toString();
                String surname_Cus = surnameCus.getText().toString();
                int age_cus = Integer.parseInt(ageCus.getText().toString());
                double highest_cus = Double.parseDouble(weightCus.getText().toString());
                double weight_cus = Integer.parseInt(weightCus.getText().toString());
                int money_cus = Integer.parseInt(moneyCus.getText().toString());

                Cliente c = new Cliente(name_Cus, surname_Cus, age_cus, highest_cus, weight_cus, money_cus);

                Intent intent = new Intent(MainActivity.this, Activity_2.class);


                Bundle bundle = new Bundle();
                bundle.putSerializable("cliente", c);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
    });

}
    public boolean validar() {
        boolean result = true;

        String valor = nameCus.getText().toString();
        String valor1 = surnameCus.getText().toString();
        String valor2 = ageCus.getText().toString();
        String valor3 = highestCus.getText().toString();
        String valor4 = weightCus.getText().toString();
        String valor5 = moneyCus.getText().toString();

        if(valor.isEmpty()){
            nameCus.setError("Diligencie este espacio");
            result = false;
        }
        if(valor1.isEmpty()){
            surnameCus.setError("Diligencie este espacio");
            result = false;
        }
        if(valor2.isEmpty()){
            ageCus.setError("Diligencie este espacio");
            result = false;
        }
        if(valor3.isEmpty()){
            highestCus.setError("Diligencie este espacio");
            result = false;
        }
        if(valor4.isEmpty()){
            weightCus.setError("Diligencie este espacio");
            result = false;
        }
        if(valor5.isEmpty()){
            moneyCus.setError("Diligencie este espacio");
            result = false;
        }
        return result;
    }

}
