package jp.techacademy.kota.hisamatsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("value1", 0.0);
        double value2 = intent.getDoubleExtra("value2", 0.0);
        String op = intent.getStringExtra("op");

        TextView textAnswer = (TextView) findViewById(R.id.textAnswer);
        if (op.equals("add")) {
            textAnswer.setText(String.valueOf(value1 + value2));
        } else if (op.equals("sub")) {
            textAnswer.setText(String.valueOf(value1 - value2));
        } else if (op.equals("mul")) {
            textAnswer.setText(String.valueOf(value1 * value2));
        } else if (op.equals("div")) {
            textAnswer.setText(String.valueOf(value1 / value2));
        }
    }
}
