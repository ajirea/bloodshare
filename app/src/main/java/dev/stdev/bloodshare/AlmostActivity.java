package dev.stdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Almost Activity (Halaman almost)
 *
 * Dikerjakan Pada: 25 April 2021
 * Deskripsi Pekerjaan: Membuat activity almost dengan constraint layout serta custom tombol dengan drawable selector btn_outline_light
 * NIM: 10118068
 * Nama: Satria Aji Pura Karma J
 * Kelas: IF-2
 */
public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void sendVerificationCode(View view) {
        Intent intent = new Intent(this, VerifyActivity.class);
        startActivity(intent);
    }
}