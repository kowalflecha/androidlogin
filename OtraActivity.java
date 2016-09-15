package com.example.alumno.myapplication;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class OtraActivity extends Activity {

    public String usuario = "Francisco";
    public String password = "1234";
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        resultado = (TextView)findViewById(R.id.resultado);

        Bundle bundle =getIntent().getExtras();

        String nombre =bundle.getString("nombre");
        String clave =bundle.getString("clave");



                        if (((nombre.compareTo(usuario)) == 0) && ((clave.compareTo(password)) == 0))
                        {

                            resultado.setText("El usuario es correcto");
                        }
                        else
                        {
                            resultado.setText("El usuario es incorrecto");


    }
}
}