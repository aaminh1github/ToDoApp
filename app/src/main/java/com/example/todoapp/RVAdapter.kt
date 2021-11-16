package com.example.kotlinpractice

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.R
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.note_row.view.*

class RVAdapter(val context: Context, val note: ArrayList<String>) :
    RecyclerView.Adapter<RVAdapter.AdapterVH>() {
    class AdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterVH {
        return AdapterVH(
            LayoutInflater.from(context).inflate(
                R.layout.note_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AdapterVH, position: Int) {
        holder.itemView.apply {
var a =note[position]
            cbNote.text=a
            if(cbNote.isChecked()){
            }
        }
    }

    override fun getItemCount() = note.size
}