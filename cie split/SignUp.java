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

//import com.example.lokesh.CieSplit.R;

public class SignUp extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private EditText repassword;
    private Button signin;
    private String id,s,s1;
    DatabaseReference databaseReference;
    FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        // Toast.makeText(getApplicationContext(),"you have registered sucessfully",Toast.LENGTH_SHORT).show();
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        signin = (Button) findViewById(R.id.signin);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    //databaseReference.child("login").child("uname").setValue(user.getText().toString());

                    //databaseReference.child("login").child(id).child("pass").setValue(pass.getText().toString());
                    databaseReference.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            try {
                                id = username.getText().toString();
                                s = password.getText().toString();
                                s1 = repassword.getText().toString();
                                int n1 = Integer.parseInt(username.getText().toString());
                                if(! ((s.isEmpty()) || (s1.isEmpty())))
                                {
                                    if ((n1 > 1515106000) && (n1 < 1515106130)) {


                                        if (dataSnapshot.child("login").child(id).child("pass").getValue() == null) {

                                            if (s.equals(s1)) {
                                                //String st = dataSnapshot.child("login").child(id).child("pass").getValue().toString();
                                                //Toast.makeText(getApplicationContext(), "Account already exist or password are incorrect ", Toast.LENGTH_SHORT).show();
                                                // String sa = dataSnapshot.child("login").child(id).child("pass").getValue().toString();
                                                databaseReference.child("login").child(id).child("pass").setValue(password.getText().toString());
                                                // databaseReference.child("cie1").child("reg").setValue(username.getText().toString());
                                                databaseReference.child("cie1").child(id).child("Data mining").child("tot").setValue("0");
                                                databaseReference.child("cie1").child(id).child("Theory of computation").child("tot").setValue("0");
                                                databaseReference.child("cie1").child(id).child("Advanced java").child("tot").setValue("0");
                                                databaseReference.child("cie1").child(id).child("Principles of compiler design").child("tot").setValue("0");
                                                databaseReference.child("cie1").child(id).child("Distributed systems").child("tot").setValue("0");
                                                //databaseReference.child("cie2").child(id).setValue(username.getText().toString());
                                                databaseReference.child("cie2").child(id).child("Data mining").child("tot").setValue("0");
                                                databaseReference.child("cie2").child(id).child("Theory of computation").child("tot").setValue("0");
                                                databaseReference.child("cie2").child(id).child("Advanced java").child("tot").setValue("0");
                                                databaseReference.child("cie2").child(id).child("Principles of compiler design").child("tot").setValue("0");
                                                databaseReference.child("cie2").child(id).child("Distributed systems").child("tot").setValue("0");
                                                databaseReference.child("cie3").child(id).setValue(username.getText().toString());
                                                databaseReference.child("cie3").child(id).child("Data mining").child("tot").setValue("0");
                                                databaseReference.child("cie3").child(id).child("Theory of computation").child("tot").setValue("0");
                                                databaseReference.child("cie3").child(id).child("Advanced java").child("tot").setValue("0");
                                                databaseReference.child("cie3").child(id).child("Principles of compiler design").child("tot").setValue("0");
                                                databaseReference.child("cie3").child(id).child("Distributed systems").child("tot").setValue("0");
                                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                                startActivity(intent);
                                                Toast.makeText(getApplicationContext(), "registered", Toast.LENGTH_SHORT).show();
                                                //Toast.makeText(getApplicationContext(), "yes", Toast.LENGTH_SHORT).show();
                                                // Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                                //startActivity(intent);

                                            } else
                                                Toast.makeText(getApplicationContext(), "password are incorrect ", Toast.LENGTH_SHORT).show();
                                        } else {

                                            //Toast.makeText(getApplicationContext(), "Account is added or already present ", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                            startActivity(intent);
                                        }
                                    } else
                                        Toast.makeText(getApplicationContext(), "please enter within your department range", Toast.LENGTH_SHORT).show();
                                }else
                                {
                                    Toast.makeText(getApplicationContext(), "All fields must be filled ", Toast.LENGTH_SHORT).show();

                                }
                            }catch (Exception e) {

                                Toast.makeText(getApplicationContext(), "All fields must be filled ", Toast.LENGTH_SHORT).show();
                            }


                        }//Log.d("FB",st);


                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                        }
                    });

            }
        });
    }
}
