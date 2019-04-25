package com.example.lokesh.ciesplit;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.lokesh.CieSplit.R;

public class cie1 extends AppCompatActivity {
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
        setContentView(R.layout.activity_cie1);
        dm=(Button) findViewById(R.id.dm);
        poc=(Button) findViewById(R.id.poc);
        java=(Button) findViewById(R.id.java);
        toc=(Button) findViewById(R.id.toc);
        ds=(Button) findViewById(R.id.ds);
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Data mining");
                //intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        poc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Principles of compiler design");
                //intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Advanced java");
                //intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        toc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Theory of computation");
                //intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });
        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),marks.class);
                intent.putExtra("regno",regno);
                intent.putExtra("dm","Distributed systems");
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                //intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
                finish();
            }
        });

    }
}
