package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChapterVAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_chapter_vact)

        val actionBar = supportActionBar
        actionBar!!.title = "Chapter V"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}