package com.hello.org.imageselector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.txt_content).setOnClickListener( this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,MultiImageSelectorActivity.class);
        startActivity(intent);
    }
}
