package com.example.minhacalculadora

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
/*
            val salarios = DoubleArray(3)
            salarios[0] = 1000.0
            salarios[1] = 3000.0
            salarios[2] = 500.0

            salarios.forEachIndexed  { index, salario ->
                salarios[index] = salario * 1.1
            }
            var texto : String = ""
            val bonus = doubleArrayOf(1500.0, 1250.0, 5000.0)
            bonus.sort()

            for (valor in salarios){
                texto+= valor.toString() +" "
            }

            resultado.setText("nomes  $texto")


            Log.d("teste", "testando")

 */
            val salarios = doubleArrayOf(500.0, 350.0, 967.0)

            for (salario in salarios){
                Log.d("VERLOG", "salario: ${salario}")
            }
            Log.d("VERLOG", "max Maior Salário: ${salarios.maxOrNull()}")
            Log.d("VERLOG", "min Menor Salário: ${salarios.minOrNull()}")
            Log.d("VERLOG", "average Media Salário: ${salarios.average()}")

            val salariosMaiorQue500 = salarios.filter{it>500}
            Log.d("VERLOG", "------------------------------------")
            salariosMaiorQue500.forEach{Log.d("VERLOG", "Mostre os salários maior que 500: $it")}
            Log.d("VERLOG", "------------------------------------")
            Log.d("VERLOG", "count . Qts salarios estão entre 500 e 3000: ${salarios.count{it in 500.0..3000.0}}")
            Log.d("VERLOG", "------------------------------------")
            Log.d("VERLOG", "find 967.0 em salarios : ${salarios.find{it == 967.0}}")

            Log.d("VERLOG", "------------------------------------")
            Log.d("VERLOG", "any existe o salario 967.0 em salarios : ${salarios.any{it == 967.0}}")

        }
    }

}