package com.example.myapplication555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int id=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.textview);


        UserLoader userLoader = new UserLoader(textView);
        userLoader.execute("http://10.67.172.157/EgorLubyshev/");

    }
}