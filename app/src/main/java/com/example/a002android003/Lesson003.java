package com.example.a002android003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class Lesson003 extends AppCompatActivity {

    private TextView textCounter1;  // пользовательский элемент 1-го счетчика
    private int counter1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main003);
        initView();
 //       counters = new Counters();

    }

    private void initView() {
        // Получить пользовательские элементы по идентификатору
        textCounter1 = findViewById(R.id.textView1);
        //textCounter2 = findViewById(R.id.textView2);
        //textCounter3 = findViewById(R.id.textView3);
        //textCounter4 = findViewById(R.id.textView4);

        //initButton2ClickListener();
        //initButton3ClickListener();
        //initButton4ClickListener();
    }
    // Обработка кнопки через атрибут onClick в макете
    public void button1_onClick(View view) {
       // counters.incrementCounter2();
        //setTextCounter(textCounter1, counters.getCounter2());
        counter1++;
        setTextCounter(textCounter1,counter1 );
    }
    // Отображение данных на экране
    private void setTextCounters(){
        //setTextCounter(textCounter1, counters.getCounter1());
        //setTextCounter(textCounter2, counters.getCounter2());
        //setTextCounter(textCounter3, counters.getCounter3());
        //setTextCounter(textCounter4, counters.getCounter4());
    }
    // Установить текст на TextView
    private void setTextCounter(TextView textCounter, int counter){
        textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
    }




}