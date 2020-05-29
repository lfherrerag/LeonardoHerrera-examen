package com.uisrael.leonardoherrera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    Bundle datos;
    EditText r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        r1=findViewById(R.id.resp1);
        r2=findViewById(R.id.resp2);
        r3=findViewById(R.id.resp3);
        r4=findViewById(R.id.resp4);

        datos=getIntent().getExtras();
        String recibir1=datos.getString("abrir");
        r1.setText(recibir1);

        String recibir2=datos.getString("ck1");
        r2.setText(recibir2);

        String recibir3=datos.getString("rb");
        r3.setText(recibir3);

        String recibir4=datos.getString("abrir2");
        r4.setText(recibir4);




    }
}
