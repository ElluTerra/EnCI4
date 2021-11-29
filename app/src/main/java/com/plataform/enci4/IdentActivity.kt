package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ident.*

class IdentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ident)
        button2.setOnClickListener {
            openNextActivity()



        }
    }

    private fun openNextActivity () {
        val intent = Intent(this, ThirtyActivity::class.java)
        startActivity(intent)
    }
}
