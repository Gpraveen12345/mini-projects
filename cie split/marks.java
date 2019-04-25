package com.example.lokesh.ciesplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.R.attr.id;

//import com.example.lokesh.CieSplit.R;

public class marks extends AppCompatActivity {
    private Button submit;
    private EditText q1;
    private EditText q2;
    private EditText q3;
    private EditText q4;
    private EditText q5;
    private EditText q6;
    private EditText q7;
    private EditText q8;
    private EditText q9a;
    private EditText q9b;
    private EditText q10a;
    private EditText q10b;
    String regno,dm,cie,str,st;
    int sum,a,n1,n2,n3,n4,n5,n6,n7,n8,n9a,n9b,n10a,n10b;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        regno = getIntent().getStringExtra("regno");
        dm = getIntent().getStringExtra("dm");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);
        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        q3 = (EditText) findViewById(R.id.q3);
        q4 = (EditText) findViewById(R.id.q4);
        q5 = (EditText) findViewById(R.id.q5);
        q6 = (EditText) findViewById(R.id.q6);
        q7 = (EditText) findViewById(R.id.q7);
        q8 = (EditText) findViewById(R.id.q8);
        q9a = (EditText) findViewById(R.id.q9a);
        q9b = (EditText) findViewById(R.id.q9b);
        q10a = (EditText) findViewById(R.id.q10a);
        q10b = (EditText) findViewById(R.id.q10b);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        //  Toast.makeText(getApplicationContext(),"registered sucessfully",Toast.LENGTH_SHORT).show();
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                        //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                        //Toast.makeText(getApplicationContext(),regno,Toast.LENGTH_SHORT).show();
                        n1 = Integer.parseInt(q1.getText().toString());
                        n2 = Integer.parseInt(q2.getText().toString());
                        n3 = Integer.parseInt(q3.getText().toString());
                        n4 = Integer.parseInt(q4.getText().toString());
                        n5 = Integer.parseInt(q5.getText().toString());
                        n6 = Integer.parseInt(q6.getText().toString());
                        n7 = Integer.parseInt(q7.getText().toString());
                        n8 = Integer.parseInt(q8.getText().toString());
                        n9a = Integer.parseInt(q9a.getText().toString());
                        n9b = Integer.parseInt(q9b.getText().toString());
                        n10a = Integer.parseInt(q10a.getText().toString());
                        n10b = Integer.parseInt(q10b.getText().toString());

                        sum = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9a + n9b + n10a + n10b;
                        str = String.valueOf(sum);
                         //Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
                        databaseReference.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {

                                st = dataSnapshot.child("cie1").child(regno).child(dm).child("tot").getValue().toString();
                                if(n1<3)
                                {
                                    if(n2<3)
                                    {
                                        if(n3<3)
                                        {
                                            if(n4<3)
                                            {
                                                if(n5<3)
                                                {
                                                    if(n6<3)
                                                    {
                                                        if(n7<6)
                                                        {
                                                            if(n8<6)
                                                            {
                                                                if(n9a<15)
                                                                {
                                                                    if(n9b<15)
                                                                    {
                                                                        if(n10a<15)
                                                                        {
                                                                            if(n10b<15)
                                                                            {
                                                                                if (st.equals(str)) {
                                                                                    if (n1 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q1").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q1").setValue(n1);
                                                                                    if (n2 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q2").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q2").setValue(n2);
                                                                                    if (n3 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q3").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q3").setValue(n3);
                                                                                    if (n4 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q4").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q4").setValue(n4);
                                                                                    if (n5 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q5").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q5").setValue(n5);
                                                                                    if (n6 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q6").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q6").setValue(n6);
                                                                                    if (n7 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q7").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q7").setValue(n7);
                                                                                    if (n8 == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q8").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q8").setValue(n8);
                                                                                    if (n9a == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q9a").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q9a").setValue(n9a);
                                                                                    if (n9b == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q9b").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("q9b").setValue(n9b);
                                                                                    if (n10a == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("qa10").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("qa10").setValue(n10a);
                                                                                    if (n10b == 0)
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("qb10").setValue("0");
                                                                                    else
                                                                                        databaseReference.child("cie1").child(regno).child(dm).child("qb10").setValue(n10b);

                                                                                    Intent intent = new Intent(getApplicationContext(), cie1.class);
                                                                                    intent.putExtra("regno", regno);
                                                                                    startActivity(intent);
                                                                                    finish();
                                                                                    Toast.makeText(getApplicationContext(),"Submitted", Toast.LENGTH_SHORT).show();
                                                                                } else
                                                                                    Toast.makeText(getApplicationContext(), "Enter the marks correctly your cie mark is" + st, Toast.LENGTH_SHORT).show();

                                                                          }
                                                                            else
                                                                                Toast.makeText(getApplicationContext(), "Enter 10b correctly", Toast.LENGTH_SHORT).show();
                                                                        }
                                                                        else
                                                                            Toast.makeText(getApplicationContext(),  "Enter 10a correctly", Toast.LENGTH_SHORT).show();
                                                                    }
                                                                    else
                                                                        Toast.makeText(getApplicationContext(), "Enter 9b correctly", Toast.LENGTH_SHORT).show();
                                                                }
                                                                else
                                                                    Toast.makeText(getApplicationContext(),  "Enter 9a correctly", Toast.LENGTH_SHORT).show();
                                                            }
                                                            else
                                                                Toast.makeText(getApplicationContext(),  "Enter 8 correctly ", Toast.LENGTH_SHORT).show();
                                                        }
                                                        else
                                                            Toast.makeText(getApplicationContext(),  "Enter 7 correctly", Toast.LENGTH_SHORT).show();
                                                    }
                                                    else
                                                        Toast.makeText(getApplicationContext(),  "Enter 6 correctly", Toast.LENGTH_SHORT).show();
                                                }
                                                else
                                                    Toast.makeText(getApplicationContext(),  "Enter 5 correctly", Toast.LENGTH_SHORT).show();

                                            }
                                            else
                                                Toast.makeText(getApplicationContext(), "Enter 4 correctly", Toast.LENGTH_SHORT).show();


                                        }
                                        else
                                            Toast.makeText(getApplicationContext(), "Enter 3 correctly", Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                        Toast.makeText(getApplicationContext(), "Enter 2 correctly ", Toast.LENGTH_SHORT).show();
                                }
                                else
                                    Toast.makeText(getApplicationContext(), "Enter 1 correctly", Toast.LENGTH_SHORT).show();


                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }

                        });
                    }
               catch(Exception e)
                    {
                        Toast.makeText(getApplicationContext(), "All fields must be filled", Toast.LENGTH_SHORT).show();
                    }

            }

            /*public void onBackPressed()
            {
                super.onBackPressed();
                Intent intent = new Intent(getApplicationContext(), cie1.class);
                intent.putExtra("regno",regno);

            }*/

        });



    }
}
