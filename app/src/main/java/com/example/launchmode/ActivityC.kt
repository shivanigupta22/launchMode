package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
/*launched with single task*/
class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }
    fun onClicked(view: View) {
        /*launched with standard*/

        startActivity(Intent(this,ActivityD::class.java))
    }
}