package com.example.iesmurgi.u3_r2_holamundopersonalizado


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSiguiente: Button = findViewById<Button>(R.id.buttonSiguiente)
        btnSiguiente.setOnClickListener { chequear() }
    }

    fun chequear(){
        //comprobar si el usuario ha escrito su nbr
        val etNombre:EditText
        etNombre=findViewById<EditText>(R.id.etNombre)


    if(etNombre.text.isNotEmpty()) {
        //iremos a la nueva activity
        val enviar= Intent (this, Activity_Segunda::class.java)
        enviar.putExtra("SALUDO",etNombre.text.toString())
        startActivity(enviar)
    }
        else{
            //Mostramos un mensaje de que no tenemos nbre
            mostrarErrorNbre()
    }
    }

    private fun mostrarErrorNbre() {

        Toast.makeText(this,"El nombre del usuario no puede estar sin cumplimentar",Toast.LENGTH_SHORT).show()
    }
}