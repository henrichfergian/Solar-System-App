package com.henfl.solarsystemapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TableRow
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_profile)

        supportActionBar!!.title="Profil"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val imgProfile: ImageView=findViewById(R.id.img_item_photo)
        val photoLink="https://vty5yq.bl.files.1drv.com/y4mVq9vNQHuCaK3RLh0ABepUw8159gj1xK4mxhZQ0SgDRHg-pcf2kkp7g_oVSqIbetG1l656oE00U_BY9vRNz7iGi1SdlsQHG6ErwlpBBgfRoRYd2TrThi3EvRUQdatpMP3hONoo3H4oTC-LjSkkLksQiNWdXybRIlaDJzDqXUIcowcaVbUrGNb0stywY3vgFxCv5WDsJTMgie0OUvbVmDMtg/IMG_20161021_174857.jpg?psid=1"

        Glide.with(this)
            .load(photoLink)
            .apply(RequestOptions().override(165, 165))
            .into(imgProfile)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}