package com.example.differentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvName; //отображение текста в приложении
    Button btnName; // для создания кнопок в приложении

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (TextView) findViewById(R.id.tv_name);
        btnName = (Button) findViewById(R.id.button_name); //  возвращаем объкт кнопка
        btnName.setOnClickListener(this); // присваиваем кнопкой обработчика
    }

    public void explicitCall(View view) {
        Intent intent = new Intent(getApplicationContext(), ExplicitActivity.class); // явное намерение
        startActivity(intent); //  запускаем явное намерение
    }

    public void implicitCall(View view){
        Intent intent = new Intent(".ImplicitActivity"); //  неявное намерение
        startActivity(intent); // запускаем неявное намерение
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ExplicitActivity.class);
        startActivityForResult(intent, 1); // метод для получения итого результата

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null){
            return;
        } String name = data.getStringExtra("name");
        tvName.setText("Your name is " + name); // текст который будет показан в приложении
    }
    /*public void openContacts(View view){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
        startActivity(intent);
    }*/
}
