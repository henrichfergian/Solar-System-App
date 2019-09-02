package com.henfl.solarsystemapp

import android.media.tv.TvContentRating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailsOfSolarSystemActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME="extra name"
        const val EXTRA_ORBITP="extra orbit"
        const val EXTRA_ROTP="extra rotation period"
        const val EXTRA_AREA="extra area"
        const val EXTRA_MASS="extra mass"
        const val EXTRA_VOLUME="extra volume"
        const val EXTRA_DIAMETER="extra diameter"
        const val EXTRA_DESC="extra desc"
        const val EXTRA_PHOTO="extra photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_of_solar_system)


        val name = intent.getStringExtra(EXTRA_NAME)
        val orbitP = intent.getStringExtra(EXTRA_ORBITP)
        val rotP = intent.getStringExtra(EXTRA_ROTP)
        val area = intent.getStringExtra(EXTRA_AREA)
        val mass = intent.getStringExtra(EXTRA_MASS)
        val volume = intent.getStringExtra(EXTRA_VOLUME)
        val diameter = intent.getStringExtra(EXTRA_DIAMETER)
        val desc = intent.getStringExtra(EXTRA_DIAMETER)
        val photo = intent.getStringExtra(EXTRA_PHOTO)

        supportActionBar!!.title="Detail $name"
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView=findViewById(R.id.tv_item_name)
        val tvOrbitP: TextView=findViewById(R.id.tv_item_orbitP)
        val tvRotP: TextView=findViewById(R.id.tv_item_rotP)
        val tvArea: TextView=findViewById(R.id.tv_item_area)
        val tvMass: TextView=findViewById(R.id.tv_item_mass)
        val tvVol: TextView=findViewById(R.id.tv_item_volume)
        val tvDiameter: TextView=findViewById(R.id.tv_item_diameter)
        val tvDesc: TextView=findViewById(R.id.tv_item_desc)
        val imgPhoto: ImageView=findViewById(R.id.img_item_photo)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgPhoto)

        tvDesc.text=desc

        tvName.text=name
        tvOrbitP.text=orbitP
        tvRotP.text=rotP
        tvArea.text=area
        tvMass.text=mass
        tvVol.text=volume
        tvDiameter.text=diameter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
