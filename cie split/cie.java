package com.example.lokesh.ciesplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//import com.example.lokesh.CieSplit.R;

public class cie extends AppCompatActivity {
    private Button cie1;
    private Button cie2;
    private Button cie3;
    private Button logout;
    String regno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        regno = getIntent().getStringExtra("regno");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cie);
        cie1=(Button) findViewById(R.id.cie1);
        cie2=(Button) findViewById(R.id.cie2);
        cie3=(Button) findViewById(R.id.cie3);
        logout=(Button)findViewById(R.id.logout);
        //Toast.makeText(getApplicationContext(),regno,Toast.LENGTH_SHORT).show();
        cie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                Intent intent = new Intent(getApplicationContext(),cie1.class);
                intent.putExtra("regno",regno);
                startActivity(intent);
                //finish();
                // String id = user.getText().toString();
                //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                //Toast.makeText(getApplicationContext(),"registered sucessfully",Toast.LENGTH_SHORT).show();
            }
        });
        cie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                Intent intent = new Intent(getApplicationContext(),cie2.class);
                intent.putExtra("regno",regno);
                startActivity(intent);
                // String id = user.getText().toString();
                //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                //Toast.makeText(getApplicationContext(),"registered sucessfully",Toast.LENGTH_SHORT).show();
            }
        });
        cie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                Intent intent = new Intent(getApplicationContext(),cie3.class);
                intent.putExtra("regno",regno);
                startActivity(intent);
                // String id = user.getText().toString();
                //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                //Toast.makeText(getApplicationContext(),"registered sucessfully",Toast.LENGTH_SHORT).show();
            }
        });
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("regno", regno);
                startActivity(intent);
                finish();
            }

        });
    }
}
