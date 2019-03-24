package com.example.testedm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirBotao(View view) {
        EditText n = findViewById(R.id.min);
        String s = n.getText().toString();
        int min = Integer.parseInt(s);

        EditText m = findViewById(R.id.max);
        String c = m.getText().toString();
        int max = Integer.parseInt(c);

        int res = getRandomInt(min, max);
        Toast.makeText(this, res+"", Toast.LENGTH_LONG).show();

    }

    public int getRandomInt(int min, int max){
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}


