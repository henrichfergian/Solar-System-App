package com.henfl.solarsystemapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailsOfSolarSystemActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME="extra name"
        const val EXTRA_DESC="extra desc"
        const val EXTRA_PHOTO="extra photo"
        const val EXTRA_DATA="extra data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_of_solar_system)


        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val photo = intent.getStringExtra(EXTRA_PHOTO)
        val tData = intent.getStringExtra(EXTRA_DATA)

        supportActionBar!!.title ="Detail $name"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView=findViewById(R.id.tv_item_name)
        val tvDesc: TextView=findViewById(R.id.tv_item_desc)
        val tvTabel: TextView=findViewById(R.id.tv_item_data)
        val imgPhoto: ImageView=findViewById(R.id.img_item_photo)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgPhoto)

        tvName.text=name
        tvDesc.text=desc
        tvTabel.text=tData
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
