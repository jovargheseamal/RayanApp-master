package com.example.user123.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

public class AddEmployee extends BaseActivity {

    TextView txtempl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.activity_add_company, contentFrameLayout);


        Toolbar tb=getToolBar();
        txtempl=(TextView)tb.findViewById(R.id.appname);
        txtempl.setText("New Employee");


    }
}
