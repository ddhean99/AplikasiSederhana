package com.example.aplikasisederhana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        Button btn22;

        Button btn21 = (Button) findViewById(R.id.btnHal21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://medium.com/easyread/konsep-service-pada-android-4b37b2402a9e"));
                startActivity(intent);
            }
        });
        btn22 = (Button) findViewById(R.id.btnHal22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent (getApplicationContext(),Syntax2.class);
                startActivity(i);
            }
        });


    }

}

