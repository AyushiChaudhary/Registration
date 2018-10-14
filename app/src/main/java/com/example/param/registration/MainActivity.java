package com.example.param.registration;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText fName;
    private EditText lName;
    private EditText rEmail;
    private EditText rPassword;
    private EditText cpassword;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fName=(EditText)findViewById(R.id.etName);
        lName=(EditText)findViewById(R.id.etName1);
        rEmail=(EditText)findViewById(R.id.etEmail);
        rPassword=(EditText)findViewById(R.id.etPassword);
        cpassword=(EditText)findViewById(R.id.etConfirm);
        b1=(Button)findViewById(R.id.btRegister);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=fName.getText().toString();
                String name1=lName.getText().toString();
                String email=rEmail.getText().toString();
                String password=rPassword.getText().toString();
                String cp=cpassword.getText().toString();
                if(TextUtils.isEmpty(name)||TextUtils.isEmpty(name1)||TextUtils.isEmpty(email)|| TextUtils.isEmpty(password)||!password.equals(cp)){
                    Toast.makeText(MainActivity.this,"Must Fill All Field",Toast.LENGTH_LONG).show();
                }
                else{
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Register");
                    builder.setMessage("Registered successfully!");
                    builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i= new Intent(MainActivity.this,Login.class);
                            startActivity(i);

                            Toast.makeText(MainActivity.this,"Login Page",Toast.LENGTH_LONG).show();
                        }
                    });
                    builder.setNegativeButton("Ok",null).setCancelable(false);
                    AlertDialog alert=builder.create();
                    alert.show();



                }



            }
        });


    }
}
