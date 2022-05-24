package com.juaan.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

/*    var num0: Button?=null
    var num1: Button?=null
    var num2: Button?=null
    var num3: Button?=null
    var num4: Button?=null
    var num5: Button?=null
    var num6: Button?=null
    var num7: Button?=null
    var num8: Button?=null
    var num9: Button?=null
    var sum: Button?=null
    var rest: Button?=null
    var mult: Button?=null
    var div: Button?=null
    var igual: Button?=null
    var eliminar: Button?=null
    var limpiar: Button?=null*/

    lateinit var result: TextView

    var concat=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num0:Button=findViewById(R.id.button0)
        num0.setOnClickListener { pintar(0) }

        val num1:Button=findViewById(R.id.button1)
        num1.setOnClickListener { pintar(1) }

        val num2:Button=findViewById(R.id.button2)
        num2.setOnClickListener { pintar(2) }

        val num3:Button=findViewById(R.id.button3)
        num3.setOnClickListener { pintar(3) }

        val num4:Button=findViewById(R.id.button4)
        num4.setOnClickListener { pintar(4) }

        val num5:Button=findViewById(R.id.button5)
        num5.setOnClickListener { pintar(5) }

        val num6:Button=findViewById(R.id.button6)
        num6.setOnClickListener { pintar(6) }

        val num7:Button=findViewById(R.id.button7)
        num7.setOnClickListener { pintar(7) }

        val num8:Button=findViewById(R.id.button8)
        num8.setOnClickListener { pintar(8) }

        val num9:Button=findViewById(R.id.button9)
        num9.setOnClickListener { pintar(9) }

        val sum:Button=findViewById(R.id.buttonsum)
        sum.setOnClickListener { pintar(0) }

        val res:Button=findViewById(R.id.buttonres)
        res.setOnClickListener { pintar(0) }

        val mult:Button=findViewById(R.id.buttonmult)
        mult.setOnClickListener { pintar(0) }

        val div:Button=findViewById(R.id.buttonDiv)
        div.setOnClickListener { pintar(0) }

        val punto:Button=findViewById(R.id.buttonPoint)
        punto.setOnClickListener { pintar(0) }

        val eliminar:Button=findViewById(R.id.buttonDelete)
        eliminar.setOnClickListener { pintar(0) }

        val limpiar:Button=findViewById(R.id.buttonLimpiar)
        limpiar.setOnClickListener { eliminar() }

        val igual:Button=findViewById(R.id.buttonIgual)
        igual.setOnClickListener { pintar(0) }

        result=findViewById(R.id.result)

    }

    private fun pintar(num:Int){
        var contador:String=result.text.toString()

        result.setText(contador+num)

    }

    private  fun eliminar(){
        result.setText("")
    }

}