package com.example.UTSAZHAR

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailClubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_club)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val clubActivity = intent.getParcelableExtra<ClubActivity>(MainActivity.INTENT_PARCELABLE)

        val imgclub = findViewById<ImageView>(R.id.img_item_photo)
        val nameclub= findViewById<TextView>(R.id.tv_item_name)
        val deskclub = findViewById<TextView>(R.id.tv_item_description)
        val didirikan = findViewById<TextView>(R.id.tv_item_didirikan)
        val anggotaclub = findViewById<TextView>(R.id.tv_item_anggota)

        imgclub.setImageResource(clubActivity?.imgclub!!)
        nameclub.text = clubActivity.namaclub
        deskclub.text = clubActivity.deskclub
        didirikan.text= clubActivity.didirikan
        anggotaclub.text =clubActivity.anggotaclub

    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}