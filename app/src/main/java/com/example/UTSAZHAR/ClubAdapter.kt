package com.example.UTSAZHAR

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClubAdapter (private val context: Context, private val clubActivities: List<ClubActivity>,
                   val listener: (ClubActivity) -> Unit)
    : RecyclerView.Adapter<ClubAdapter.ClubViewHolder>() {
    class ClubViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgclub = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaclub = view.findViewById<TextView>(R.id.tv_item_name)

        fun bindView(clubActivity: ClubActivity, listener: (ClubActivity) -> Unit) {
            imgclub.setImageResource(clubActivity.imgclub)
            namaclub.text = clubActivity.namaclub
            itemView.setOnClickListener {
                (listener(clubActivity))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClubViewHolder {
        return ClubViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_club, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ClubViewHolder, position: Int) {
        holder.bindView(clubActivities[position], listener)
    }

    override fun getItemCount(): Int = clubActivities.size

    }

