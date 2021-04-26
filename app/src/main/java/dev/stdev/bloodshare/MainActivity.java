package dev.stdev.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.imageview.ShapeableImageView;

/**
 * Main Activity (Halaman utama)
 *
 * Dikerjakan Pada: 25 April 2021
 * Deskripsi Pekerjaan: Membuat activity main dengan constraint layout yang dikombinasikan dengan linear serta app bar layout
 *  Untuk membuat avatar, menggunakan shapeableimageview dan menu menggunakan cardview
 * NIM: 10118068
 * Nama: Satria Aji Pura Karma J
 * Kelas: IF-2
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}