package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    }

    public void sumar(View view) {
       /**if(num1.getText().toString().isEmpty()){
            Toast msgToast = Toast.makeText(getApplicationContext(), "Debe ingresar los números", Toast.LENGTH_SHORT);
            msgToast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 70 );
            msgToast.show();
        }**/
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());
        getResult.setText(String.valueOf(valor1 + valor2));
        num1.setText("");
        num2.setText("");
    }
    public void restar(View view) {
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());
        getResult.setText(String.valueOf(valor1 - valor2));
        num1.setText("");
        num2.setText("");
    }
    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());
        getResult.setText(String.valueOf(valor1 * valor2));
        num1.setText("");
        num2.setText("");
    }
    public void dividir(View view) {
        int valor1 = Integer.parseInt(num1.getText().toString());
        int valor2 = Integer.parseInt(num2.getText().toString());
        getResult.setText(String.valueOf((float)valor1 / valor2));
        num1.setText("");
        num2.setText("");
    }

}