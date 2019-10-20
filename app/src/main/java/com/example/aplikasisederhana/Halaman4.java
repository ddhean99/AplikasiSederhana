package com.example.aplikasisederhana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);

        Button btn42;

        Button btn41 = (Button) findViewById(R.id.btnHal41);
        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
                startActivity(intent);
            }
        });
        btn42 = (Button) findViewById(R.id.btnHal42);
        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent (getApplicationContext(),Syntax4.class);
                startActivity(i);
            }
        });

    }

}

