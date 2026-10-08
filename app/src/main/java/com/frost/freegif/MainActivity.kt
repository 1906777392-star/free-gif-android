package com.frost.freegif

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnVideoToGif).setOnClickListener {
            comingSoon(getString(R.string.video_to_gif))
        }
        findViewById<Button>(R.id.btnImageToGif).setOnClickListener {
            comingSoon(getString(R.string.image_to_gif))
        }
        findViewById<Button>(R.id.btnGallery).setOnClickListener {
            comingSoon(getString(R.string.gallery))
        }
        findViewById<Button>(R.id.btnSettings).setOnClickListener {
            comingSoon(getString(R.string.settings))
        }
    }

    private fun comingSoon(name: String) {
        Toast.makeText(this, getString(R.string.coming_soon, name), Toast.LENGTH_SHORT).show()
    }
}
