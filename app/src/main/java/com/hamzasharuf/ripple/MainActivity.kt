package com.hamzasharuf.ripple

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_up.setOnClickListener {image.setImageType(Type.UP_ARROW, Color.RED)}
        button_down.setOnClickListener {image.setImageType(Type.DOWN_ARROW, Color.RED)}
        button_left.setOnClickListener {image.setImageType(Type.LEFT_ARROW, Color.RED)}
        button_right.setOnClickListener {image.setImageType(Type.RIGHT_ARROW, Color.RED)}

        button_play.setOnClickListener { image.setImageType(Type.PLAY, Color.BLUE) }
        button_stop.setOnClickListener { image.setImageType(Type.STOP, Color.BLUE) }
        button_pause.setOnClickListener { image.setImageType(Type.PAUSE, Color.BLUE) }
    }
}