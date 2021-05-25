package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChapterIIAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_chapter_iiact)

        val actionBar = supportActionBar
        actionBar!!.title = "Chapter II"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}