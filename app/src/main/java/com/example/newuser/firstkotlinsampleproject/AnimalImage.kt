package com.example.newuser.firstkotlinsampleproject

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.image_view.*

class AnimalImage : AppCompatActivity() {

    var animalName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_view)
        animalName = intent.getStringExtra("animalName")


        if (animalName.equals("dog")) {
            image_view.setImageResource(R.drawable.dog)
        } else if (animalName.equals("cat")) {
            image_view.setImageResource(R.drawable.cat)
        } else if (animalName.equals("owl")) {
            image_view.setImageResource(R.drawable.owl)
        } else if (animalName.equals("cheetah")) {
            image_view.setImageResource(R.drawable.cheetah)
        } else if (animalName.equals("raccoon")) {
            image_view.setImageResource(R.drawable.raccoon)
        } else if (animalName.equals("bird")) {
            image_view.setImageResource(R.drawable.bird)
        }
    }


}