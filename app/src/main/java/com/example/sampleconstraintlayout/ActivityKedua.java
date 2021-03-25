package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //mendeklarasikan variable dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //Menghubungkan variable txEmail dengan componen textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variable txPassword dengan componen textView pada layout
        txPassword = findViewById(R.id.tvPassword);

        /*mendeklarasikan variable bundle yang akan digunakan untuk mengambil pesan
        yang dikirimkan melalui method intent
         */
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
