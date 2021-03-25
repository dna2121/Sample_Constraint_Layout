package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Hasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__hasil);

        //menghubungkan txemail dengan kompoonen textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan txpassword dengan komponen texxtview pada layout
        txPassword = findViewById(R.id.tvPassword);

        //membuat object bundle dan mengambil data yang dikirimkan dari activity sebelumnya
        Bundle bundle = getIntent().getExtras();

        /*membuat variable string yang digunakan untuk menyimpan data yang
        dikirimkan dari activity sebelumnya dengan kunci "a" dan "b"
         */
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        //menampilkan value dari variable email ke dalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variable pass ke dalam txPassword
        txPassword.setText(pass);

    }
}