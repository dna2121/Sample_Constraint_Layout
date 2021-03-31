package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FormActivity extends AppCompatActivity {
    //variable edit text
    EditText edtNama, edtAlamat, edtPass, edtRepass, edtEmail;

    //variable float button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        fab = findViewById(R.id.fabSimpan);
        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.edEmail);
        edtPass = findViewById(R.id.edPass);
        edtRepass = findViewById(R.id.edrepas);

        //method untuk floating button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat kondisi untuk mengecek apakah edtext kosong atau tidak
                if(edtNama.getText().toString().isEmpty() ||
                    edtAlamat.getText().toString().isEmpty() ||
                    edtEmail.getText().toString().isEmpty() ||
                    edtPass.getText().toString().isEmpty() ||
                    edtRepass.getText().toString().isEmpty())
                {
                    //show pesan notifikasi jika seluruh edit text wajib diisi
                    Snackbar.make(view, "Wajib isi seluruh data!!!!!!!😫", Snackbar.LENGTH_LONG).show();
                }
                else {
                    //membuat kondisi untuk mengecek apakah isi dari edittext password edt repass sama/ga
                    if (edtPass.getText().toString().equals(edtRepass.getText().toString())){
                        //show notif kalau pendaftaran berhasilll
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil.... :D", Toast.LENGTH_LONG).show();

                        //method untuk kembali ke activity Main
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else{
                        //menampilkan pesan bahwa isi dari edt pass dan repass tidak sama
                        Snackbar.make(view,"Ooooooopppps, password dan repassword tidak sama.", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}