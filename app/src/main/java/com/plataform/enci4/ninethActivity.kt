package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nineth.*

class ninethActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nineth)

        button9.setOnClickListener {
        openNextActivity()
        }

    }
        private fun openNextActivity() {
         val intent = Intent(this, tenthActivity::class.java)
            startActivity(intent)
        }
}
