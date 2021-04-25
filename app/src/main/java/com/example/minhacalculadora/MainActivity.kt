package com.example.minhacalculadora

import Funcionario
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados

        btCalcular.setOnClickListener{
            var imprimir =""
            imprimir+="\nMap\n"
            val pair: Pair<String, Double> = Pair("Joao",1000.0)
            val map1= mapOf(pair)
            map1.forEach{(k,v)->imprimir+="\nChave: $k - Valor: $v"}

            val map2 = mapOf(
                    "Pedro" to 2500.0,
                    "Maria" to 3000.0

            )
            imprimir+="\n__________________\nMap usando infix\n"
            map2.forEach{(k,v)->imprimir+="\nChave: $k - Valor: $v"}
            Log.d("VERLOG", "Resultado: $imprimir")
        }
    }

}