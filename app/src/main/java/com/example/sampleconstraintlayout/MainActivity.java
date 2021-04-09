package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLogin; //deklarasi variable untuk button
    EditText edemail, edpassword; //deklarasi variable untuk edittext
    String nama, password; //deklarasi variable untuk menyimpan email dan password

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //method untuk menampilkan menu.
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //membuat kondisi jika yang dipilih adalah id mnDaftar
        if(item.getItemId() == R.id.mnDaftar){
            //method untuk memanggil activity 'Daftar Activity'
            Intent i = new Intent(getApplicationContext(), FormActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

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

            //set email and password
            String email = "jeykey97@mail.com";
            String psw = "jjk1";

            if (nama.isEmpty() || password.isEmpty()){
                Toast toast = Toast.makeText(getApplicationContext(), "Email dan password wajib diisi!", Toast.LENGTH_LONG);

                toast.show();
            } else {
                if (nama.equals(email) && (password.equals(psw))){
                    //menampilkan login sukses & membuat variable toast
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Login Success",Toast.LENGTH_LONG);

                    //display toast-nya
                    toast.show();

                    //membuat objek Bundle
                    Bundle b = new Bundle();

                /*memasukkan value dari variable nama dengan kunci 'a'
                dan dimasukkan ke dalam bundle*/
                    b.putString("a", nama.trim());

                /*memasukkan value dari variable password dengan kunci 'b'
                dan dimasukkan ke dalam bundle
                 */
                    b.putString("b", password.trim());

                    //membuat object intent berpindah ke activity dari mainActivity ke Home_activity
                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                    //memasukkan bundle ke dalam intent untuk dikirimkan ke ActivityHasil
                    i.putExtras(b);

                    //berpindah ke ActivityHasil
                    startActivity(i);

                }
                else if (!nama.equals(email) && password.equals(psw)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong Email :(", Toast.LENGTH_LONG);

                    toast.show();
                }
                else if (nama.equals(email) && !password.equals(psw)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong Password :(", Toast.LENGTH_LONG);

                    toast.show();
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Wrong Email and Password", Toast.LENGTH_LONG);

                    toast.show();
                }

            }
        }
    });


    }
}