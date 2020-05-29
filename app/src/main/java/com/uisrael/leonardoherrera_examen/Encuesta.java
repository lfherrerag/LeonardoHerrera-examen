package com.uisrael.leonardoherrera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {
    Bundle datoR;
    EditText pre1,eduser;
    CheckBox chk1,chk2,chk3;
    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        pre1=findViewById(R.id.p1);
        eduser=findViewById(R.id.etUser);
        chk1=findViewById(R.id.ck1);
        chk2=findViewById(R.id.ck2);
        chk3=findViewById(R.id.ck3);
        r1=findViewById(R.id.rb1);
        r2=findViewById(R.id.rb2);

        datoR=getIntent().getExtras();
        String recibir=datoR.getString("abrir");
        eduser.setText(recibir);

    }

    public void Enviar(View e){
        Intent enviar=new Intent(Encuesta.this,Resumen.class);
            enviar.putExtra("abrir",eduser.getText().toString());
            enviar.putExtra("abrir2",pre1.getText().toString());
        if(chk1.isChecked()==true){
            enviar.putExtra("ck1",chk1.getText().toString());
        }else if(chk2.isChecked()==true){
            enviar.putExtra("ck1",chk2.getText().toString());
        }else if(chk3.isChecked()==true){
            enviar.putExtra("ck1",chk3.getText().toString());
        }

        if(r1.isChecked()==true){
            enviar.putExtra("rb",r1.getText().toString());
        }else if(r2.isChecked()==true){
            enviar.putExtra("rb",r2.getText().toString());
        }
        startActivity(enviar);

    }

}
