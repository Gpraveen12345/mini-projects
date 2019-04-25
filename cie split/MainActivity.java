package com.example.lokesh.ciesplit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText pass;
    private Button login;
    private Button signup;
    String id,p;
    //  private TextView result;
     DatabaseReference databaseReference;
     FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        login=(Button) findViewById(R.id.login);
        signup=(Button) findViewById(R.id.signup);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    id = user.getText().toString();
                    p = pass.getText().toString();
                    int n1 = Integer.parseInt(user.getText().toString());
                    if ((n1 > 1515106000) && (n1 < 1515106130)) {
                        //Toast.makeText(getApplicationContext(),id,Toast.LENGTH_SHORT).show();
                        //Toast.makeText(getApplicationContext(),"yes",Toast.LENGTH_SHORT).show();
                        //databaseReference.child("login").child("uname").setValue(user.getText().toString());

                        //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                        databaseReference.addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                try {
                                    if (dataSnapshot.child("login").child(id).child("pass").getValue() == null) {
                                        Intent intent = new Intent(getApplicationContext(), SignUp.class);
                                        startActivity(intent);
                                        Toast.makeText(getApplicationContext(), "please register", Toast.LENGTH_SHORT).show();
                                    }
                                    String st = dataSnapshot.child("login").child(id).child("pass").getValue().toString();

                                    // String s = st.toString();

                                    // Toast.makeText(getApplicationContext(),st,Toast.LENGTH_SHORT).show();
                                    // if(s.equals(null)) {

                                    if (st.equals(p)) {
                                        Intent intent = new Intent(getApplicationContext(), cie.class);
                                        intent.putExtra("regno", id);
                                        startActivity(intent);

                                    } else {
                                        Toast.makeText(getApplicationContext(), "Incorrect password", Toast.LENGTH_SHORT).show();
                                    }
                                } catch (Exception e) {
                                    //Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();

                                }

                                //Log.d("FB",st);
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
                    } else
                        Toast.makeText(getApplicationContext(), "please enter within your department range", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "all fields must be filled ", Toast.LENGTH_SHORT).show();
                }

            }

        });

        signup.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          //databaseReference.child("login").child("uname").setValue(user.getText().toString());
                                          Intent intent = new Intent(getApplicationContext(),SignUp.class);
                                          startActivity(intent);
                                         // String id = user.getText().toString();
                                          //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                                          //Toast.makeText(getApplicationContext(),"registered sucessfully",Toast.LENGTH_SHORT).show();
                                      }
                                  });


    }
        /*n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText)findViewById(R.id.num2);
        add = (Button)findViewById(R.id.Add);
        result = (TextView)findViewById(R.id.result);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(n1.getText().toString());
                int number2 = Integer.parseInt(n2.getText().toString());
                int sum = number1  + number2;
                result.setText(String.valueOf(sum));
            }
        });
        //Toast.makeText(getApplicationContext(),"HAI",Toast.LENGTH_SHORT).show();
        */
        public void save(View view)
        {

        }
    }



