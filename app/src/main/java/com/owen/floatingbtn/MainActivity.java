package com.owen.floatingbtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    FloatingActionButton floatingbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        floatingbtn = (FloatingActionButton)findViewByid(R.id.checkMoreinfo_floatin));
    }
}
