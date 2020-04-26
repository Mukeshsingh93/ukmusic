package com.mahalakshmi.uttarakhandi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val inten = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(inten)
            finish()
//            val inten = Intent(this@SplashActivity, Activity_Login::class.java)
//            startActivity(inten)
//            finish()
        }, 6000)

    }
}
