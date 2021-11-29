package com.plataform.enci4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifty.*
import kotlinx.android.synthetic.main.activity_sixthy.*

class sixthyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixthy)

        button6.setOnClickListener {
        openNextActivity()

        }
    }

        private fun openNextActivity () {
            val intent = Intent(this, seventhyActivity::class.java)
            startActivity(intent)
        }

}

