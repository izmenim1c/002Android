package com.example.a002android003;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Lesson003_04 extends AppCompatActivity implements View.OnClickListener {

    private TextView textCounter1;  // пользовательский элемент 1-го счетчика
    private TextView textCounter2;  // пользовательский элемент 2-го счетчика
    private TextView textCounter3; // пользовательский элемент 3-го счетчика
    //private TextView textCounter4; // пользовательский элемент 4-го счетчика

    private Counters counters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main003_04);
        initView();
        counters = new Counters();
    }

        private void initView() {
        // Получить пользовательские элементы по идентификатору
        textCounter1 = findViewById(R.id.textView1);
        textCounter2 = findViewById(R.id.textView2);
        textCounter3 = findViewById(R.id.textView3);
        //textCounter4 = findViewById(R.id.textView4);

        initButton2ClickListener();
        initButton3ClickListener();
        //initButton4ClickListener();
    }
    // Обработка кнопки через атрибут onClick в макете
    public void button1_onClick(View view) {
       // counters.incrementCounter2();
        //setTextCounter(textCounter1, counters.getCounter2());

        counters.incrementCounter1();
        setTextCounter(textCounter1,counters.getCounter1() );
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

    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counters.incrementCounter2();
                setTextCounter(textCounter2, counters.getCounter2());
            }
        });
    }

    private void initButton3ClickListener(){
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Если на экране один пользовательский элемент, то такая обработка имеет смысл,
        // но если на экране несколько элементов, здесь придется создавать "лишние" условия.
        counters.incrementCounter3();
        setTextCounter(textCounter3, counters.getCounter3());
    }
}
