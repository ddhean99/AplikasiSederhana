package com.example.aplikasisederhana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halaman5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman5);

        Button btn52;

        Button btn51 = (Button) findViewById(R.id.btnHal51);
        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.codepolitan.com/mempelajari-layout-pada-android-studio"));
                startActivity(intent);
            }
        });
        btn52 = (Button) findViewById(R.id.btnHal52);
        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent (getApplicationContext(),Syntax5.class);
                startActivity(i);
            }
        });

    }

}

