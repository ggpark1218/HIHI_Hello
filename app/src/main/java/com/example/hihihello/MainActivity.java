package com.example.hihihello;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtCount);
    }

    public void onToastClick(View view) {
        //메세지 박스 띄우기
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void onCountClick(View view) {
        //count++ 하면서 textview에 보이기
        count++;
        textView.setText(count + ""); //int 에서 text로 바꾸기
    }
}