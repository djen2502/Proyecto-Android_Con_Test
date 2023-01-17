package com.example.iesmurgi.u3_r2_holamundopersonalizado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity_Segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        mostrarNombre()
        val bottonVolver:Button=findViewById(R.id.buttonFinalizar)
        bottonVolver.setOnClickListener { onBackPressed() }
    }

    private fun mostrarNombre(){


        val mibundle= intent.extras
        val nombre=mibundle?.getString("SALUDO")
        val tvsaludoPer=findViewById<TextView>(R.id.tvSaludoPer)
        tvsaludoPer.text="Bienvenido "+nombre.toString()
    }


}