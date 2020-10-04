package com.example.drawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawingapp.DrawingView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DrawingView.setSizeForBrush(20.toFloat())
    }
}