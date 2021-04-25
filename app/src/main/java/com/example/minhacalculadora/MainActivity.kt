package com.example.minhacalculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultados

        btCalcular.setOnClickListener{
           /* val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())
*/
            /*if(media >=6 && faltas <=10){
                resultado.setText("Aluno foi aprovado\n Nota Final $media \n Faltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno foi reprovado\n Nota Final $media \n Faltas: $faltas")
                resultado.setTextColor(Color.RED)
            }*/

            // IntArray
            /*val values = IntArray(5)
            values[0]=1
            values[1]=1
            values[2]=4
            values[3]=3
            values[4]=5
             */
            //intArrayOf
            //val values = intArrayOf(2,3,4,1,10,7)
/*
            iterações com IntArray

            for (valor in values){
                texto+= valor.toString()
            }
            for (index in values.indices){
                texto+=" "+values[index].toString()
            }
            values.forEach{valor->
                texto+=" "+ valor.toString()
            }
            values.sort()
            values.forEach{valor->
                texto+=" "+ valor.toString()
            }

 */         /*  Array
            val nomes = Array<String>(3){""}
            nomes[0] = "Maria"
            nomes[1] = "João"
            nomes[2] = "José"
            */
            /* arrayOf
            val nomes = arrayOf("Maria", "Zaza", "Pedro")


            nomes.sort()
            */
            var texto : String = ""
            val salarios = DoubleArray(3)
            salarios[0] = 1000.0
            salarios[1] = 3000.0
            salarios[2] = 500.0

            salarios.forEachIndexed  { index, salario ->
                salarios[index] = salario * 1.1
            }

            val bonus = doubleArrayOf(1500.0, 1250.0, 5000.0)
            bonus.sort()

            for (valor in salarios){
                texto+= valor.toString() +" "
            }

            resultado.setText("nomes  $texto")

        }
    }

}