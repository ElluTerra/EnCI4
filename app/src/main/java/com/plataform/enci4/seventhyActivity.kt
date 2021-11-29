package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seventhy.*

class seventhyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventhy)

        button7.setOnClickListener {
        openNextActivity()

        }
    }

    private fun openNextActivity() {
    val intent = Intent(this, eighthyActivity::class.java)
        startActivity(intent)

    }
}
