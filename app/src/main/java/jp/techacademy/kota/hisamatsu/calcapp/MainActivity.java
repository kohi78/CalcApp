package jp.techacademy.kota.hisamatsu.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;
    Button mButtonAdd;
    Button mButtonSub;
    Button mButtonMul;
    Button mButtonDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        mButtonAdd = (Button) findViewById(R.id.buttonAdd);
        mButtonAdd.setOnClickListener(this);

        mButtonSub = (Button) findViewById(R.id.buttonSub);
        mButtonSub.setOnClickListener(this);

        mButtonMul = (Button) findViewById(R.id.buttonMul);
        mButtonMul.setOnClickListener(this);

        mButtonDiv = (Button) findViewById(R.id.buttonDiv);
        mButtonDiv.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        if (v.getId() == R.id.buttonAdd) {
            calculate("add");
        } else if (v.getId() == R.id.buttonSub) {
            calculate("sub");
        } else if (v.getId() == R.id.buttonMul) {
            calculate("mul");
        } else if (v.getId() == R.id.buttonDiv) {
            calculate("div");
        }
    }

    private void calculate (String op) {
        Intent intent = new Intent(this, AnswerActivity.class);
        if (mEditText2.getText() != null) {
            intent.putExtra("value1", Double.valueOf(mEditText1.getText().toString()));
        }
        if (mEditText2.getText() != null) {
            intent.putExtra("value2", Double.valueOf(mEditText2.getText().toString()));
        }
        intent.putExtra("op", op);
        startActivity(intent);
    }
}
