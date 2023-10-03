package com.example.androiduidesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.action_bar_layout)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://shorturl.at/couTU", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://shorturl.at/fituw", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://shorturl.at/efCLV", ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)
    }
}