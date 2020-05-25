package com.example.differentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ExplicitActivity extends AppCompatActivity implements View.OnClickListener {
    // работаем с явным намерением
    EditText editText; // для редактировки введенного текста
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit); // устанавливаем xml-макет для данной активности

        TextView getSecAct = (TextView) findViewById(R.id.getSecAct);
        getSecAct.setText(Calendar.getInstance().getTime().toString());
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button_name); // возвр. объект кнопка
        button.setOnClickListener(this); //  присваиваем кнопкой обработчика
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", editText.getText().toString()); // для активности, учитывая что мы работаем с намереностью
        setResult(RESULT_OK, intent); // получение результата
        finish(); //  окончание процесса

    }
}
