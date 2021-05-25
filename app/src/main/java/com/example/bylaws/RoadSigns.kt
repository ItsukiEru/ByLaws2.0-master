package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_road_signs.*

class RoadSigns : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_road_signs)

        val actionBar = supportActionBar
        actionBar!!.title = "Road Signs"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}