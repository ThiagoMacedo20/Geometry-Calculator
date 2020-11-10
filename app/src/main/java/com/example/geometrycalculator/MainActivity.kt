package com.example.geometrycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spn: Spinner = findViewById(R.id.spnConversor)
        val btprox: Button = findViewById(R.id.btprox)
        val listaConversor = arrayListOf("Selecione a forma geométrica", "Quadrado", "Retângulo", "Losango", "Triângulo", "Trapézio")

        //Adapter do spinner
        val conversorAdapter = ArrayAdapter(
                this@MainActivity,
                R.layout.spinner_item,
                listaConversor
        )


        spn.adapter = conversorAdapter


            btprox.setOnClickListener{
                val spnList = spn.selectedItem.toString()
                if (spnList.equals("Quadrado")){
                startActivity(Intent(this,QuadradoActivity::class.java).apply {
            })
            }
        }

    }
}