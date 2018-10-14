package com.example.param.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
     private EditText lUser;
     private EditText lPass;
     private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        lUser=(EditText)findViewById(R.id.etEmail);
        lPass=(EditText)findViewById(R.id.etPass);
        login=(Button)findViewById(R.id.btLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLoin();
            }
        });
    }
    public void startLoin(){
        String user=lUser.getText().toString();
        String password=lPass.getText().toString();
        if(user.equals("admin") && password.equals("niet1234")){
            Intent i=new Intent(Login.this,Welcom.class);
            startActivity(i);
            Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(Login.this,"Invalid Username And Password",Toast.LENGTH_LONG).show();
        }
    }
}
