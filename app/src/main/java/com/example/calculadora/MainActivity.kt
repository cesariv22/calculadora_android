package com.example.calculadora

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

/** import android.view.Gravity;
 * import android.widget.Toast;  */

/************ Se agrega la palabra var a las varibles   **********/
class MainActivity : AppCompatActivity() {
    private var num1: EditText? = null
    private var num2: EditText? = null
    private var getResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        getResult = findViewById(R.id.getResult)
        val btnSalir = findViewById<Button>(R.id.btnSalir)
        btnSalir.setOnClickListener { View: View? ->
            finish() // Cierra la actividad actual.
            exitProcess(0) // Cierra completamente la aplicación
        }
    }

    /************ Acá el parametro view no se utiliza   **************/
    fun sumar(view: View?) {
        /*
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }
             */
        if (num1!!.text.toString().isEmpty() && num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Sumar:")
            builder.setMessage("Ingrese ambos números para la operación")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num1!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Sumar:")
            builder.setMessage("Ingrese el primer número")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Sumar:")
            builder.setMessage("Ingrese el segundo número ")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }

        /********** Cambios significativos en la sintaxis ********/
        val valor1 = num1!!.text.toString().toInt()
        val valor2 = num2!!.text.toString().toInt()
        val resultado = valor1 + valor2
        getResult?.text = resultado.toString()
        num1?.setText("")
        num2?.setText("")
        Log.d("operacion sumar", "$resultado")
    }

    fun restar(view: View?) {
        /* if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
        if (num1!!.text.toString().isEmpty() && num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Restar:")
            builder.setMessage("Ingrese ambos números para la operación")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num1!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Restar:")
            builder.setMessage("Ingrese el primer número")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Restar:")
            builder.setMessage("Ingrese el segundo número ")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        val valor1 = num1!!.text.toString().toInt()
        val valor2 = num2!!.text.toString().toInt()
        val resultado = valor1 - valor2
        getResult!!.text = (valor1 - valor2).toString()
        num1!!.setText("")
        num2!!.setText("")
        Log.d("operacion restar", "$valor1-$valor2=$resultado")
    }

    fun multiplicar(view: View?) {
        /* if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
        if (num1!!.text.toString().isEmpty() && num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Multiplicar:")
            builder.setMessage("Ingrese ambos números para la operación")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num1!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Multiplicar:")
            builder.setMessage("Ingrese el primer número")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Multiplicar:")
            builder.setMessage("Ingrese el segundo número ")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        val valor1 = num1!!.text.toString().toInt()
        val valor2 = num2!!.text.toString().toInt()
        val resultado = valor1 * valor2
        getResult!!.text = (valor1 * valor2).toString()
        num1!!.setText("")
        num2!!.setText("")
        Log.d("operacion multiplicar","$valor1*$valor2=$resultado")
    }

    fun dividir(view: View?) {
        /*if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
        if (num1!!.text.toString().isEmpty() && num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Dividir:")
            builder.setMessage("Ingrese ambos números para la operación")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num1!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Dividir:")
            builder.setMessage("Ingrese el primer número")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        if (num2!!.text.toString().isEmpty()) {
            val builder = AlertDialog.Builder(this@MainActivity)
            builder.setTitle("Para Dividir:")
            builder.setMessage("Ingrese el segundo número ")
            builder.setPositiveButton("Aceptar", null)
            val dialog = builder.create()
            dialog.show()
            return
        }
        val valor1 = num1!!.text.toString().toInt()
        val valor2 = num2!!.text.toString().toInt()
        val resultado = valor1 / valor2
        getResult!!.text = (valor1.toFloat() / valor2).toString()
        num1!!.setText("")
        num2!!.setText("")
        Log.d("operacion dividir","$valor1/$valor2=$resultado")
    }
}