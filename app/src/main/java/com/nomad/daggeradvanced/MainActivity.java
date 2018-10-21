package com.nomad.daggeradvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nomad.domain.Computer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Computer().init();
    }
}
