package com.emon.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MainActivityObserver())
        Log.d("MAIN", "onCreate: Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "Destroy")
    }
}