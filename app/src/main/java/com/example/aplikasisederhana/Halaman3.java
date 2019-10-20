package com.example.aplikasisederhana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

        Button btn32;

        Button btn31 = (Button) findViewById(R.id.btnHal31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
                startActivity(intent);
            }
        });

        btn32 = (Button) findViewById(R.id.btnHal32);
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent (getApplicationContext(),Syntax3.class);
                startActivity(i);
            }
        });
    }

}

