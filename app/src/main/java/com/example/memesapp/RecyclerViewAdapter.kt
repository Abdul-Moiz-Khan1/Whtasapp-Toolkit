package com.example.memesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter(context:Context ,private val items : List<memedata>):RecyclerView.Adapter<RecyclerViewAdapter.viewholder>(){


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_item,parent,false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.viewholder, position: Int) {
        holder.decp.text = items[position].description
        holder.image.setImageResource(items[position].image)

    }

    override fun getItemCount(): Int {
       return items.size
    }
    class viewholder(itemView :View):RecyclerView.ViewHolder(itemView) {
        val image =  itemView.findViewById<ImageView>(R.id.meme_pic)
        val decp =  itemView.findViewById<TextView>(R.id.meme_description)


    }
}