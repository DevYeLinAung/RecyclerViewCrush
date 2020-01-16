package com.example.recyclerviewcrush.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcrush.R
import com.example.recyclerviewcrush.model.Crush

class CrushViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var peoplePhoto = itemView.findViewById<ImageView>(R.id.people_photo)
    var peopleName = itemView.findViewById<TextView>(R.id.people_name)
    var peoplePost = itemView.findViewById<TextView>(R.id.people_post)
    var imagePost = itemView.findViewById<ImageView>(R.id.image_post)
    var love = itemView.findViewById<TextView>(R.id.txt_love)
    var comment = itemView.findViewById<TextView>(R.id.txt_comment)
    var share = itemView.findViewById<TextView>(R.id.txt_share)
}

class CrushAdapter(val crshList: ArrayList<Crush>) : RecyclerView.Adapter<CrushViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrushViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_crush, parent, false)
        return CrushViewHolder(view)

    }

    override fun getItemCount(): Int {
        return crshList.size

    }

    override fun onBindViewHolder(holder: CrushViewHolder, position: Int) {
        holder.peoplePhoto.setImageResource(crshList[position].photo)
        holder.peopleName.text = crshList[position].name
        holder.peoplePost.text = crshList[position].post
        holder.imagePost.setImageResource(crshList[position].image)
        holder.love.text = crshList[position].love
        holder.comment.text = crshList[position].comment
        holder.share.text = crshList[position].share
    }

}