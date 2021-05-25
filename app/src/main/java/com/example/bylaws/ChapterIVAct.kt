package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChapterIVAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_chapter_ivact)

        val actionBar = supportActionBar
        actionBar!!.title = "Chapter IV"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}