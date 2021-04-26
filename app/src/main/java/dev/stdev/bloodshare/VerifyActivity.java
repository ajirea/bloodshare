package dev.stdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Verify Activity (Halaman verify)
 *
 * Dikerjakan Pada: 25 April 2021
 * Deskripsi Pekerjaan: Membuat verify verify dengan menggunakan constraint layout serta button custom
 * NIM: 10118068
 * Nama: Satria Aji Pura Karma J
 * Kelas: IF-2
 */
public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void submitCode(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}