package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    elevationSlider.addOnChangeListener { _, value, _ ->
      ViewCompat.setElevation(shapeRounded, value)
      ViewCompat.setElevation(shapeCut, value)
      ViewCompat.setElevation(shapeRoundedSurface, value)
      ViewCompat.setElevation(shapeCutSurface, value)
    }
  }
}