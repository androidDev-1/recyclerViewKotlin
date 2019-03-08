package com.example.newuser.firstkotlinsampleproject

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val animalList: ArrayList<String>, val context: Context) : RecyclerView.Adapter<AnimalAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return animalList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.tvAnimalItem?.text = animalList.get(position)
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvAnimalItem = view.tv_animal_type

        init {
            tvAnimalItem.setOnClickListener {
                val intent = Intent(view.context, AnimalImage::class.java)
                intent.putExtra("animalName", tvAnimalItem.text.toString())
                view.context.startActivity(intent)
            }
        }

    }

}

