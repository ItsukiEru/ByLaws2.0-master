package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChapterIIIAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_chapter_iiiact)
        val actionBar = supportActionBar
        actionBar!!.title = "Chapter III"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}