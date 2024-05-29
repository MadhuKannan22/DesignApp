package com.example.designapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class IntroSlideAdaptor(private val introSlides: List<IntroSlide>): RecyclerView.Adapter<IntroSlideAdaptor.IntroSlideViewholder>() {

    inner class IntroSlideViewholder(view:View) :RecyclerView.ViewHolder(view){
        private val imageIcon = view.findViewById<ImageView>(R.id.image_slide)

        fun bind(introSlide : IntroSlide){
            imageIcon.setImageResource(introSlide.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewholder {
        return IntroSlideViewholder(LayoutInflater.from(parent.context).inflate(R.layout.slide_item_container,parent,false))
    }

    override fun getItemCount(): Int {
        return introSlides.size
    }

    override fun onBindViewHolder(holder: IntroSlideViewholder, position: Int) {
        holder.bind(introSlides[position])
    }

}