package com.naveen.samplemap.adapter

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.naveen.samplemap.R
import com.naveen.samplemap.model.MapModel

class MapAdapter internal constructor(
private var context: Context
) : RecyclerView.Adapter<MapAdapter.MapViewHolder>() {


    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var list= emptyList<MapModel>()

    inner class MapViewHolder(itemView: View, var context: Context) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.map_search_name)
        val description: TextView = itemView.findViewById(R.id.lat_lon)
        val card: CardView = itemView.findViewById(R.id.card_list)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MapViewHolder {
        val itemView = inflater.inflate(R.layout.custom_map_history, parent, false)
        return MapViewHolder(itemView, context)
    }

    override fun onBindViewHolder(holder: MapViewHolder, position: Int) {
        val current = list?.get(position)
        holder.name.text = ""+current?.name
        holder.description.text ="latitude :"+current?.latitude+"  longitude :"+current?.longitude
    }

    internal fun setMapList(list:  List<MapModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    override
    fun getItemCount(): Int = list.size


}