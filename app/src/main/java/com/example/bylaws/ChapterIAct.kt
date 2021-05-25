package com.example.bylaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChapterIAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_chapter_iact)

        val actionBar = supportActionBar
        actionBar!!.title = "Chapter I"

        actionBar.setDisplayHomeAsUpEnabled(true)

    }

}