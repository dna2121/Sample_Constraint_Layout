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

            String email = "jeykey97@mail.com";
            String psw = "jjk1";

            if (nama.equals(email) && (password.equals(psw))){
                //menampilkan login sukses
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Login Success",Toast.LENGTH_LONG);

                //display toast-nya
                toast.show();
            }
            else if (!nama.equals(email) && password.equals(psw)){
                Toast toast = Toast.makeText(getApplicationContext(), "Wrong Email :(", Toast.LENGTH_LONG);

                toast.show();
            }
            else if (nama.equals(email) && !password.equals(psw)){
                Toast toast = Toast.makeText(getApplicationContext(), "Wrong Password :(", Toast.LENGTH_LONG);

                toast.show();
            }
            else{
                Toast toast = Toast.makeText(getApplicationContext(), "Wrong Email and Password", Toast.LENGTH_LONG);

                toast.show();
            }

        }
    });
    }
}