package com.henfl.solarsystemapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSolarSystemAdapter(private val listSolarSystem: ArrayList<SolarSystem>): RecyclerView.Adapter<ListSolarSystemAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_solar_system, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSolarSystem.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, orbitP, rotP, area, mass, volume, diameter, desc, photo) = listSolarSystem[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text=name

        val moveContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveToDetail=Intent(moveContext, DetailsOfSolarSystemActivity::class.java)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_NAME, name)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_ORBITP, orbitP)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_ROTP, rotP)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_AREA, area)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_MASS, mass)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_VOLUME, volume)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_DIAMETER, diameter)
            moveToDetail.putExtra(DetailsOfSolarSystemActivity.EXTRA_DESC, desc)
            moveToDetail.putExtra((DetailsOfSolarSystemActivity.EXTRA_PHOTO, photo)

            moveContext.startActivities(moveToDetail)
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView=itemView.findViewById(R.id.tv_item_name)
        var imgPhoto: ImageView=itemView.findViewById(R.id.img_item_photo)
    }
}