package com.example.supportsphere

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class alumniAdapter(private val alumniList: List<alumniname>) : RecyclerView.Adapter<alumniAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val Name: TextView = view.findViewById(R.id.textname)
        val AlDetails: TextView = view.findViewById(R.id.textdetail)
        val Image: ImageView = view.findViewById(R.id.alumniimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_alumni_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Alumni = alumniList[position]
        holder.Name.text = Alumni.name
        holder.AlDetails.text = Alumni.details
        holder.Image.setImageResource(Alumni.imageResourceId)
    }

    override fun getItemCount(): Int {
        return alumniList.size
    }
}
