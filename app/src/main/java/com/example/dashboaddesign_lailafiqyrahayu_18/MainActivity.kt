package com.example.dashboaddesign_lailafiqyrahayu_18

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declare the animation
        val ttb = AnimationUtils.loadAnimation(this, R.anim.ttb);

        val stb = AnimationUtils.loadAnimation(this, R.anim.stb);
        val stb2 = AnimationUtils.loadAnimation(this, R.anim.stb2);
        val stb3 = AnimationUtils.loadAnimation(this, R.anim.stb3);
        val stb4 = AnimationUtils.loadAnimation(this, R.anim.stb4);
        val stb5 = AnimationUtils.loadAnimation(this, R.anim.stb5);
        val stb6 = AnimationUtils.loadAnimation(this, R.anim.stb5);
        val stb7 = AnimationUtils.loadAnimation(this, R.anim.stb7);

        val btn = AnimationUtils.loadAnimation(this, R.anim.btn);

        val textView = findViewById(R.id.textView) as TextView

        val imageView10 = findViewById(R.id.imageView10) as ImageView
        val imageView5 = findViewById(R.id.imageView5) as ImageView
        val imageView6 = findViewById(R.id.imageView6) as ImageView
        val imageView7 = findViewById(R.id.imageView7) as ImageView
        val imageView8 = findViewById(R.id.imageView8) as ImageView
        val imageView2 = findViewById(R.id.imageView2) as ImageView
        val imageView13 = findViewById(R.id.imageView13) as ImageView

        val button = findViewById(R.id.button) as Button

        // set the animation
        textView.startAnimation(ttb)

        imageView10.startAnimation(stb)
        imageView5.startAnimation(stb2)
        imageView6.startAnimation(stb3)
        imageView7.startAnimation(stb4)
        imageView8.startAnimation(stb5)
        imageView2.startAnimation(stb6)
        imageView13.startAnimation(stb7)

        button.startAnimation(btn);

    }
}