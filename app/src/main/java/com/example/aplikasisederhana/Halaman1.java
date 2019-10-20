package com.example.aplikasisederhana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);

        Button btn12;

        Button btn11 = (Button) findViewById(R.id.btnHal11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://diandeveloper.wordpress.com/2013/11/15/android-activity/"));
                startActivity(intent);
            }
        });
        btn12 = (Button) findViewById(R.id.btnHal12);
        btn12.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i = null;
              i = new Intent (getApplicationContext(),Syntax1.class);
              startActivity(i);
          }
        });


    }

}

