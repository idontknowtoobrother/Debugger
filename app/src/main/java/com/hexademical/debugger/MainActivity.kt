package com.hexademical.debugger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    private fun division(){
        val numerator = 60
        var denominator = 4
        repeat(5){
            Log.v(TAG, "${numerator /denominator}")
            denominator--
        }
    }
    fun logging(){
        Log.v(TAG, "VERBOSE")
        Log.i(TAG, "INFO")
        Log.d(TAG, "DEBUG")
        Log.e(TAG, "ERROR")
        Log.w(TAG, "WARNING")
    }
    companion object {
        private const val TAG = "MainActivity"
    }
}