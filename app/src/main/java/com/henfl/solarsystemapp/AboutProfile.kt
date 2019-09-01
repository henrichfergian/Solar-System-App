package com.henfl.solarsystemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_profile)

        val imgProfile: ImageView=findViewById(R.id.img_item_photo)
        val photo: String="www.dicoding.com"

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgProfile)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
