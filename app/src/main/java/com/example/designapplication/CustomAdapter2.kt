package com.example.designapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter2(private val items: List<ListOfItems2>) :
    RecyclerView.Adapter<CustomAdapter2.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_view2, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.textViewItem1.setImageResource(item.icon)
        holder.textViewItem2.text = item.text1
        holder.textViewItem3.text = item.button
        holder.textViewItem4.text = item.text2
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewItem1: ImageView = itemView.findViewById(R.id.icon_textbook)
        val textViewItem2: TextView = itemView.findViewById(R.id.textview_textbook)
        val textViewItem3: TextView = itemView.findViewById(R.id.btn_see)
        val textViewItem4: TextView = itemView.findViewById(R.id.textview_subtitle)

    }
}
