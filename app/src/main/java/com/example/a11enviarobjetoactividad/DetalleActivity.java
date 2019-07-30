package com.example.a11enviarobjetoactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView tvNombre, tvApellido, tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        tvEdad = findViewById(R.id.tvEdad);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleUsuario = intent.getBundleExtra(MainActivity.USUARIO);

            String nombre = bundleUsuario.getString(MainActivity.NOMBRE);
            String apellido = bundleUsuario.getString(MainActivity.APELLIDO);
            Integer edad = bundleUsuario.getInt(MainActivity.EDAD);

            tvNombre.setText("Nombre: " + nombre);
            tvApellido.setText("Apellido: " + apellido);
            tvEdad.setText("Edad: " + edad.toString());
        }
    }
}
