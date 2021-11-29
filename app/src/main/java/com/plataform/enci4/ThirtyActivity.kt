package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_thirty.*

class ThirtyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirty)

        button3.setOnClickListener {
        openNextActivity()

        }

    }

    private fun openNextActivity() {
        val intent = Intent(this, FourthyActivity::class.java)
        startActivity(intent)
    }
}
