package com.uisrael.leonardoherrera_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText et1,et2;
    String et3= new String("estudiante2020");
    String et4= new String("uisrael2020");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=findViewById(R.id.edt1);
        et2=findViewById(R.id.edt2);
    }

    public void Valida(View v){
        String d1,d2;
        d1=et1.getText().toString();
        d2=et2.getText().toString();

        if(d1.equals(et3)&&d2.equals(et4)){
            Intent intAbrir=new Intent(Login.this,Registro.class);
            intAbrir.putExtra("abrir",et1.getText().toString());
            startActivity(intAbrir);
            Toast.makeText(this,"Bienvenido",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Usuario o Contraseña invalidos",Toast.LENGTH_SHORT).show();
        }

    }


}
