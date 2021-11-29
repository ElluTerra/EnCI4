package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eighthy.*

class eighthyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighthy)

        button10.setOnClickListener {
        openNextActivity()

        }
    }
        private fun openNextActivity() {
        val intent = Intent(this, ninethActivity::class.java)
            startActivity(intent)
        }
}
