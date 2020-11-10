
package com.example.geometrycalculator

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import negocios.Calculator



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class QuadradoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quadrado)
        val edtLado: EditText = findViewById(R.id.edtLado)
        val btResult: Button = findViewById(R.id.btResultado)
        val textResult: TextView = findViewById(R.id.resultado)

        btResult.setOnClickListener {
            val valor = edtLado.text.toString()
            val valor2 = valor.toDouble()
            var calculator= Calculator()
            var resultado=calculator.areaQuadrado(valor2)
            textResult.text="O valor da Área é $resultado"
            
        }
    }
}