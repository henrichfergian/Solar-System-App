package com.henfl.solarsystemapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<SolarSystem> = arrayListOf()
    private lateinit var rvSolarSystem: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSolarSystem=findViewById(R.id.rv_solarsys)
        rvSolarSystem.setHasFixedSize(true)

        list.addAll(SolarSystemData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSolarSystem.layoutManager=LinearLayoutManager(this)
        val listSpaceObjAdapter=ListSolarSystemAdapter(list)
        rvSolarSystem.adapter = listSpaceObjAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_profile -> {
                val moveProfilIntent=Intent(this@MainActivity, AboutProfile::class.java)
                startActivity(moveProfilIntent)
            }

            R.id.action_share_app -> {
                Toast.makeText(this, "Share Aplikasi Solar System",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
