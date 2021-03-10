package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin; //deklarasi variable untuk button
    EditText edemail, edpassword; //deklarasi variable untuk edittext
    String nama, password; //deklarasi variable untuk menyimpan email dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variable btnLogin dengan komponen button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //menghubungkan variable edemail dengan componen button pada layout
        edemail = findViewById(R.id.edEmail);

        edpassword = findViewById(R.id.edPassword);

    //membuat fungsi onClick pada button btnLogin
    btnLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //menyimpan input user di edittext email ke dalam variable nama
            nama = edemail.getText().toString();

            //menyimpan input user di edittext password ke dalam variable password
            password = edpassword.getText().toString();

            //membuat variable toast dan membuat toast dengan menambahkan variable nama dan password
            Toast toast = Toast.makeText(getApplicationContext(),
                    "email anda: "+nama+" dan Password anda: "+password+"", Toast.LENGTH_LONG);

            //menampilkan toast
            toast.show();
        }
    });
    }
}