package com.example.designapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val items: List<ListOfItems>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private val colors = arrayOf(
        R.color.yellow,
        R.color.lightPink,
        R.color.lightblue,
        R.color.blue,
        R.color.facecolor,
        R.color.violet
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.textViewItem1.text = item.number.toString()
        holder.textViewItem2.text = item.subject
        holder.textViewItem3.text = item.subTitle
        holder.itemView.setBackgroundResource(colors[position % colors.size])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewItem1: TextView = itemView.findViewById(R.id.textview_number)
        val textViewItem2: TextView = itemView.findViewById(R.id.textview_chapters)
        val textViewItem3: TextView = itemView.findViewById(R.id.textview_sub_title)

    }
}

