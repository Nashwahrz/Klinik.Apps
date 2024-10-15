package com.nashwa.klinikapps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.klinikapps.R
import com.nashwa.klinikapps.model.ModelIcon
import com.nashwa.klinikapps.model.ModelListDoctor

class AdapterListDoctor (
    val itemDoctorList: List<ModelListDoctor>) :
    RecyclerView.Adapter<AdapterListDoctor.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDoctor: ImageView = itemView.findViewById(R.id.imgDoctor2)
        val nameDoctor: TextView = itemView.findViewById(R.id.nameDoctor)
        val bidangDoctor: TextView = itemView.findViewById(R.id.bidangDoctor)
        val totalReview: TextView = itemView.findViewById(R.id.totalReview)
        val angkaReview: TextView = itemView.findViewById(R.id.angkaReview)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doctor, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int
    {
        return itemDoctorList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemDoctorList[position]
        holder.imgDoctor.setImageResource(currentItem.ImageDr)
        holder.nameDoctor.setText(currentItem.NamaDr)
        holder.bidangDoctor.setText(currentItem.BidangDr)
        holder.totalReview.setText(currentItem.totalReview)
        holder.angkaReview.setText(currentItem.angkaReview)

    }




}

