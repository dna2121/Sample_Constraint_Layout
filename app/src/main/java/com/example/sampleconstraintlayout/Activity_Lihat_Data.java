package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Lihat_Data extends AppCompatActivity {
    //Deklarasi variabel dengan jenis data TextView
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__lihat__data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        //membuat variable dengan jenis data bundle dan
        //assign value dari variable tersebut dengan
        //getintent().getextras()
        Bundle bundle = getIntent().getExtras();

        //membuat variable nama dan assign value dari pesan
        //yang dikirimkan dari act sebelumnya
        String nama = bundle.getString("a");

        switch (nama) {
            case "Jimin":
                tvnama.setText("Park Jimin");
                tvnomor.setText("1238929");
                break;
            case "Yasmin":
                tvnama.setText("Yasmina Azza");
                tvnomor.setText("243739");
                break;
            case "Sekara":
                tvnama.setText("Sekara Pure");
                tvnomor.setText("32387923");
                break;
            case "Karin":
                tvnama.setText("Karina Nur");
                tvnomor.setText("4372732");
                break;
            case "Jungkook":
                tvnama.setText("Jeon Jungkook");
                tvnomor.setText("5983239");
                break;
            case "Taehyung":
                tvnama.setText("Kim Taehyung");
                tvnomor.setText("623989832");
                break;
            case "Suga":
                tvnama.setText("Min Suga");
                tvnomor.setText("72399237");
                break;
            case "Seokjin":
                tvnama.setText("Kim Seokjin");
                tvnomor.setText("8237323");
                break;
            case "Namjoon":
                tvnama.setText("Kim Namjoon");
                tvnomor.setText("9238723");
                break;
            case "Hoba":
                tvnama.setText("Jung Hoba");
                tvnomor.setText("10329832");
                break;
        }
    }
}