package com.henfl.solarsystemapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TableRow
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutProfile : AppCompatActivity(), View.OnClickListener {
    override fun onClick(view: View?) {
        val emailAddr="henrichfergian1@gmail.com"
        val sendMailIntent=Intent(Intent.ACTION_SENDTO).apply {
            data= Uri.parse("mailto:")  //only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, emailAddr)
        }

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(sendMailIntent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_profile)

        supportActionBar!!.title="Profil"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val imgProfile: ImageView=findViewById(R.id.img_item_photo)
        val photoLink="https://vty5yq.bl.files.1drv.com/y4mVq9vNQHuCaK3RLh0ABepUw8159gj1xK4mxhZQ0SgDRHg-pcf2kkp7g_oVSqIbetG1l656oE00U_BY9vRNz7iGi1SdlsQHG6ErwlpBBgfRoRYd2TrThi3EvRUQdatpMP3hONoo3H4oTC-LjSkkLksQiNWdXybRIlaDJzDqXUIcowcaVbUrGNb0stywY3vgFxCv5WDsJTMgie0OUvbVmDMtg/IMG_20161021_174857.jpg?psid=1"

        val trEmail: TableRow=findViewById(R.id.tr_email)
        trEmail.setOnClickListener(this)

        Glide.with(this)
            .load(photoLink)
            .apply(RequestOptions().override(165, 165))
            .into(imgProfile)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}