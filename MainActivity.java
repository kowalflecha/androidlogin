package com.example.alumno.myapplication;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText txtNombre;
    private EditText txtPassword;
    private Button btnIngresar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.txtNombre);
        txtPassword= (EditText)findViewById(R.id.txtPassword);
        btnIngresar = (Button)findViewById(R.id.btnIngresar);

                btnIngresar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String usuarioIngresado = txtNombre.getText().toString();
                        String claveIngresada = txtPassword.getText().toString();


                        Intent intent = new Intent(MainActivity.this, OtraActivity.class);
                        Bundle b = new Bundle();
                        b.putString("nombre", usuarioIngresado);
                        b.putString("clave", claveIngresada);
                        intent.putExtras(b);
                        startActivity(intent);



            }

        });
    }

}
