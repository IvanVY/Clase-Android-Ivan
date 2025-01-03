package com.example.clase_android_ivan

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //variables globales
    /*
    modificadordeacceso
    * */
    private lateinit var numeroUsuario:EditText
    private lateinit var calcular:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        numeroUsuario=findViewById(R.id.numeroUsuario)
        calcular=findViewById(R.id.btnCalcular)
        calcular.setOnClickListener {
            calcularEdad()
        }
    }
    fun calcularEdad(){
        val edad = numeroUsuario.text.toString()
        //logica para calcular
        if(edad > 18.toString()){
            Toast.makeText(this, "Usted es mayor de edad",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Usted es menor de edad",Toast.LENGTH_SHORT).show()
        }

    }
}