package com.androiddev.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Получаем ссылки на кнопки и текстовые поля
        Button multiply = findViewById(R.id.multiply_btn);
        Button division = findViewById(R.id.division_btn);
        TextView result = findViewById(R.id.result_et);
        EditText first_numb = findViewById(R.id.first_numb_et);
        EditText sec_numb = findViewById(R.id.sec_numb_et);

        //Реализация событий для кнопок
        //Функция умножения
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Проверка на пустое поле
                if ((sec_numb.getText().length() != 0) || (first_numb.getText().length() != 0))
                    result.setText(String.valueOf(Integer.parseInt(first_numb.getText().toString()) * Integer.parseInt(sec_numb.getText().toString())));
                else {
                    Toast.makeText(getApplicationContext(), "Пустое поле", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Функция деления
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ловим ошибку на возможное деление на ноль
                try{
                    //Проверка на пустое поле
                    if ((sec_numb.getText().length() != 0) || (first_numb.getText().length() != 0))
                        result.setText(String.valueOf(Integer.parseInt(first_numb.getText().toString()) / Integer.parseInt(sec_numb.getText().toString())));
                    else {
                        Toast.makeText(getApplicationContext(), "Пустая строка", Toast.LENGTH_LONG).show();
                    }
                }
                catch(ArithmeticException e){
                    Toast.makeText(getApplicationContext(), "Деление на ноль", Toast.LENGTH_LONG).show();
                }
            }
        });




    }

    //Реализация функциий для кнопок
    //Функция прибавления
    public void plusClick(View view) {
        //Получаем ссылки текстовые поля
        TextView result = findViewById(R.id.result_et);
        EditText first_numb = findViewById(R.id.first_numb_et);
        EditText sec_numb = findViewById(R.id.sec_numb_et);

        //Проверка на пустое поле
        if ((sec_numb.getText().length() != 0) || (first_numb.getText().length() != 0))
            result.setText(String.valueOf(Integer.parseInt(first_numb.getText().toString()) + Integer.parseInt(sec_numb.getText().toString())));
        else Toast.makeText(getApplicationContext(), "Пустое поле", Toast.LENGTH_LONG).show();
    }

    //Функция отнимания
    public void minusClick(View view) {
        //Получаем ссылки текстовые поля
        TextView result = findViewById(R.id.result_et);
        EditText first_numb = findViewById(R.id.first_numb_et);
        EditText sec_numb = findViewById(R.id.sec_numb_et);

        //Проверка на пустое поле
        if ((sec_numb.getText().length() != 0) || (first_numb.getText().length() != 0))
            result.setText(String.valueOf(Integer.parseInt(first_numb.getText().toString()) - Integer.parseInt(sec_numb.getText().toString())));
        else Toast.makeText(getApplicationContext(), "Пустое поле", Toast.LENGTH_LONG).show();
    }

}
