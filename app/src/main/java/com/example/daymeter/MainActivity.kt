package com.example.daymeter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startMin = 600
        val startMax = 1200
        val endMin   = 2000
        val endMax   = 2400
        val STEP     = 100

        val setButton = findViewById<Button>(R.id.settingsButton)
        val seekStart = findViewById<SeekBar>(R.id.startTime)
        val seekEnd   = findViewById<SeekBar>(R.id.endTime)
        val setStart  = findViewById<TextView>(R.id.setStart)
        val setEnd    = findViewById<TextView>(R.id.setEnd)

        setButton.setOnClickListener {
            var startTime = seekStart.progress
            var endTime   = seekEnd.progress

            setStart.text = startTime.toString()
            setEnd.text   = endTime.toString()

        }
    }
}
