package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourthy.*

class FourthyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthy)

        button4.setOnClickListener {
        openNextActivity()

        }
    }
    private fun openNextActivity() {
        val intent = Intent(this, fiftyActivity::class.java)
        startActivity(intent)
    }
}
