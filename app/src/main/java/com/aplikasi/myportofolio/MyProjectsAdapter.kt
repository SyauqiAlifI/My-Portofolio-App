package com.aplikasi.myportofolio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aplikasi.myportofolio.databinding.RowItemProjectsBinding

class MyProjectsAdapter(private val listProjects: ArrayList<Projects>) :
    RecyclerView.Adapter<MyProjectsAdapter.MyViewHolder>() {

    inner class MyViewHolder(val itemProjectsBinding: RowItemProjectsBinding) :
        RecyclerView.ViewHolder(itemProjectsBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemProjectsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyProjectsAdapter.MyViewHolder, position: Int) {
        holder.itemProjectsBinding.apply {
            with(listProjects[position]) {
                tvTitleProjects.text = title
                tvDescProjects.text = desc
                imgProjects.setImageResource(image)
            }
        }
    }

    override fun getItemCount(): Int = listProjects.size

}