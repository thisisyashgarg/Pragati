package com.code.pragati

import android.drm.DrmRights
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.core.content.ContextCompat

class SplashActivity : AppCompatActivity() {

    lateinit var topAnimation: Animation
    lateinit var bottomAnimation: Animation
    lateinit var bubbleTopLeft: ImageView
    lateinit var bubbleTopRight: ImageView
    lateinit var bubbleBottomRight: ImageView
    lateinit var bubbleBottomLeft: ImageView
    lateinit var bubbleBottom: ImageView
    lateinit var logo: ImageView
    lateinit var logoText: ImageView

    private val splashDisplayLength: Long = 3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.primary_light)


        setContentView(R.layout.activity_splash)

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        logo = findViewById(R.id.logo)
        logoText = findViewById(R.id.logoText)
        bubbleTopLeft = findViewById(R.id.bubbleTopLeft)
        bubbleTopRight = findViewById(R.id.bubbleTopRight)
        bubbleBottomLeft = findViewById(R.id.bubbleBottomLeft)
        bubbleBottomRight = findViewById(R.id.bubbleBottomRight)
        bubbleBottom = findViewById(R.id.bubbleBottom)

        bubbleTopRight.animation = topAnimation
        bubbleTopLeft.animation = topAnimation
        bubbleBottomRight.animation = bottomAnimation
        bubbleBottomLeft.animation = bottomAnimation
        //bubbleBottom.animation = bottomAnimation
//        logo.animation = topAnimation
//        logoText.animation = bottomAnimation

    }
}