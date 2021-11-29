package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifty.*

class fiftyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifty)

        button5.setOnClickListener() {
            openNextActivity()

        }
    }

    private fun openNextActivity() {
        val intent = Intent(this, sixthyActivity::class.java)
        startActivity(intent)
    }
}
