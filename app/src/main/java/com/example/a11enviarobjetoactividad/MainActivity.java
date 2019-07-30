package com.example.a11enviarobjetoactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String NOMBRE = "Nombre";
    public static final String APELLIDO = "Apellido";
    public static final String EDAD = "Edad";
    public static final String USUARIO = "Usuario";

    EditText etNombre, etApellido, etEdad;
    Button btnCancelar, btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.tvNombre);
        etApellido = findViewById(R.id.tvApellido);
        etEdad = findViewById(R.id.tvEdad);
        btnCancelar = findViewById(R.id.btnCancelar);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }

    public void onClickRegistrar(View view) {
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        Integer edad = Integer.parseInt(etEdad.getText().toString());

        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);

        Bundle bundleUsuario = new Bundle();
        bundleUsuario.putString(NOMBRE, nombre);
        bundleUsuario.putString(APELLIDO, apellido);
        bundleUsuario.putInt(EDAD, edad);

        intent.putExtra (USUARIO, bundleUsuario);

        startActivity(intent);
    }

    public void onClickCancelar(View view) {
        etNombre.setText("");
        etApellido.setText("");
        etEdad.setText("");
    }
}
