package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/*launched in standard mode*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClicked(view: View) {
        startActivity(Intent(this,ActivityB::class.java))
    }
    /*note:
    * Launching any activity with #task #affinity specified in manifest will result in creating new task for that activity and then stack will continue from there
   */
}