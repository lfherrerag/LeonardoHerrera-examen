package com.uisrael.leonardoherrera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    Bundle et1;
    EditText datoR,eNombre,eMonto,eMensual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        datoR=findViewById(R.id.etUenviado);
        eNombre=findViewById(R.id.etNombre);
        eMonto=findViewById(R.id.etMonto);
        eMensual=findViewById(R.id.Pmensual);

        et1=getIntent().getExtras();
        String recibir=et1.getString("abrir");
        datoR.setText(recibir);
    }

    public void Calcular(View v){
        double monto,resp,dif,porcent,div;
        monto= Double.parseDouble(eMonto.getText().toString());

        dif=(1800-monto);
        div=(dif/3);
        porcent=div*0.05;
        resp=div+porcent;
        eMensual.setText(Double.toString(resp));
    }

    public void Guardar(View vi){
        Intent intAbrir2=new Intent(Registro.this,Encuesta.class);
        intAbrir2.putExtra("abrir",eNombre.getText().toString());
        startActivity(intAbrir2);

        Toast.makeText(this,"Elemento guardado con exito",Toast.LENGTH_SHORT).show();
    }

}
