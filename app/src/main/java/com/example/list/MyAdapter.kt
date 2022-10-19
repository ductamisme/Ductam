package com.example.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.managerokr.R

class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var titles = arrayOf("user1", "user2", "user3", "user4", "user5", "user6", "user7")
    private var details = arrayOf(
        "little boy 1",
        "little boy 2",
        "little boy 3",
        "little boy 4",
        "little boy 5",
        "little boy 6",
        "little boy 7"
    )
    private var image = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
    )

    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var itemImage = item.findViewById<ImageView>(R.id.imageview_itemview_avatar)
        var itemTitle = item.findViewById<TextView>(R.id.textview_itemview_title)
        var itemDetails = item.findViewById<TextView>(R.id.textview_itemview_details)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int = titles.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(image[position])
        holder.itemTitle.text = titles[position]
        holder.itemDetails.text = details[position]
    }

}