package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/** import android.view.Gravity;
import android.widget.Toast; **/

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView getResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        getResult = findViewById(R.id.getResult);

        Button btnSalir = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(View -> {
                finish(); // Cierra la actividad actual.
                System.exit(0); // Cierra completamente la aplicación
        });
    }

        public void sumar (View view){
            /*
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }
             */
            if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty()){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Sumar:");
                builder.setMessage("Ingrese ambos números para la operación");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }

            if (num1.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Sumar:");
                builder.setMessage("Ingrese el primer número");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            if (num2.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Sumar:");
                builder.setMessage("Ingrese el segundo número ");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            int valor1 = Integer.parseInt(num1.getText().toString());
            int valor2 = Integer.parseInt(num2.getText().toString());
            getResult.setText(String.valueOf(valor1 + valor2));
            num1.setText("");
            num2.setText("");
        }
        public void restar (View view){
           /* if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
            if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty()){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Restar:");
                builder.setMessage("Ingrese ambos números para la operación");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }

            if (num1.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Restar:");
                builder.setMessage("Ingrese el primer número");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            if (num2.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Restar:");
                builder.setMessage("Ingrese el segundo número ");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            int valor1 = Integer.parseInt(num1.getText().toString());
            int valor2 = Integer.parseInt(num2.getText().toString());
            getResult.setText(String.valueOf(valor1 - valor2));
            num1.setText("");
            num2.setText("");
        }
        public void multiplicar (View view){
           /* if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
            if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty()){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Multiplicar:");
                builder.setMessage("Ingrese ambos números para la operación");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }

            if (num1.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Multiplicar:");
                builder.setMessage("Ingrese el primer número");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            if (num2.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Multiplicar:");
                builder.setMessage("Ingrese el segundo número ");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            int valor1 = Integer.parseInt(num1.getText().toString());
            int valor2 = Integer.parseInt(num2.getText().toString());
            getResult.setText(String.valueOf(valor1 * valor2));
            num1.setText("");
            num2.setText("");
        }
        public void dividir (View view){
            /*if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast msgToast = Toast.makeText(MainActivity.this, "Debe ingresar ambos números", Toast.LENGTH_SHORT);
                msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70);
                msgToast.show();
                return;
            }*/
            if (num1.getText().toString().isEmpty() && num2.getText().toString().isEmpty()){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Dividir:");
                builder.setMessage("Ingrese ambos números para la operación");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }

            if (num1.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Dividir:");
                builder.setMessage("Ingrese el primer número");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            if (num2.getText().toString().isEmpty()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Para Dividir:");
                builder.setMessage("Ingrese el segundo número ");
                builder.setPositiveButton("Aceptar", null);
                AlertDialog dialog = builder.create();
                dialog.show();
                return;
            }
            int valor1 = Integer.parseInt(num1.getText().toString());
            int valor2 = Integer.parseInt(num2.getText().toString());
            getResult.setText(String.valueOf((float) valor1 / valor2));
            num1.setText("");
            num2.setText("");
        }
    }