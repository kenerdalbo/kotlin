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
            val joao = Funcionario("João", 1000.0, "CLT")
            val pedro = Funcionario("Pedro", 4000.0, "CLT")
            val maria = Funcionario("Maria", 3000.0,"PJ")
            val antonio = Funcionario("Antônio", 5000.0, "CLT")
            val manuel = Funcionario("Manuel", 6000.0,"PJ")

            val funcionarios = setOf( joao, pedro, maria)
            val funcionarios2 = setOf(antonio, manuel)
            val funcionarios3 = setOf(manuel)


            funcionarios.forEach{Log.d("VERLOG", it.toString())}
            Log.d("VERLOG", "------------------------")
            Log.d("VERLOG", funcionarios.find{it.nome=="Maria"}.toString())
            Log.d("VERLOG", "testando")
            imprimir+="\nsortedBy\n"
            funcionarios.sortedBy { it.salario }.forEach{
                imprimir+=it.toString()

            }

            imprimir+="\ngroupBy\n"
            funcionarios.groupBy { it.tipoContratacao }.forEach{

                imprimir+=it.toString()

            }
            imprimir+="\nunion\n"
            val resultUnion = funcionarios.union(funcionarios2)
            resultUnion.forEach{     imprimir+=it.toString()}

            imprimir+="\nsubtract\n"
            val resultSubtract = funcionarios2.subtract(funcionarios3)
            resultSubtract.forEach{
                imprimir+=it.toString()
            }

            imprimir+="\nintersect\n"
            val resultintersect = funcionarios2.intersect(funcionarios3)
            resultintersect.forEach{
                imprimir+=it.toString()
            }
            Log.d("VERLOG", "Resultado: $imprimir")
        }
    }

}