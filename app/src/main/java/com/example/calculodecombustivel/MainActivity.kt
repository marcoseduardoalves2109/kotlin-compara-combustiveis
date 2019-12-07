package com.example.calculodecombustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.novo_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.novo_layout)
        botao.setOnClickListener {
            //Log.i("AULA", "CLIQUEI NO BOTÃO")
            if (etanol.text.isBlank() || gasolina.text.isBlank()) {
                Toast.makeText(
                    this@MainActivity,
                    "É necessário que ambos os valores sejam digitados",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                var indicebase = 0.7
                var calculovalor = gasolina.text.toString().toFloat() * indicebase

                if (calculovalor > etanol.text.toString().toFloat())
                    resultado.setText("Compensa Etanol")
                else
                    resultado.setText("Compensa Gasolina")


            }
            Toast.makeText(this@MainActivity, "Apertei o botão", Toast.LENGTH_LONG).show();

        }
    }
}

