package com.example.lokesh.ciesplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.lokesh.CieSplit.R;

public class cie2 extends AppCompatActivity {
    private Button dm;
    private Button poc;
    private Button java;
    private Button toc;
    private Button ds;
    String regno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        regno = getIntent().getStringExtra("regno");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cie2);
        dm=(Button) findViewById(R.id.dm);
        poc=(Button) findViewById(R.id.poc);
        java=(Button) findViewById(R.id.java);
        toc=(Button) findViewById(R.id.toc);
        ds=(Button) findViewById(R.id.ds);
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks2.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Data mining");
                startActivity(intent);
                finish();
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks2.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Principles of compiler design");
                startActivity(intent);
                finish();
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks2.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Advanced java");
                startActivity(intent);
                finish();
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks2.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Theory of computation");
                startActivity(intent);
                finish();
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks2.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Distributed systems");
                startActivity(intent);
                finish();
            }
        });
    }
}
