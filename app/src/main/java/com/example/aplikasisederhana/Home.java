package com.example.aplikasisederhana;

import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;
public class Home extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = (Button) findViewById(R.id.btnHal1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),Halaman1.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnHal2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Halaman2.class);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnHal3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Halaman3.class);
                startActivity(i);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btnHal4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Halaman4.class);
                startActivity(i);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btnHal5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Halaman5.class);
                startActivity(i);
            }
        });
    }
}
