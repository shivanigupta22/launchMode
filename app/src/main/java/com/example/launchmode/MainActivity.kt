package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.launchmode.utils.showToast

/*launched in standard mode*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun onClicked(
         @SuppressWarnings("unused")  view: View) {
        startActivity(Intent(this,ActivityB::class.java))
    }
    /*note:
    * Launching any activity with #task #affinity specified in manifest will result in creating new task for that activity and then stack will continue from there
   */

    override fun onPause() {
        super.onPause()
        showToast("on pause called")

    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("on destroy called")
    }
    override fun onStart() {
        super.onStart()
        showToast("on start called")
    }

    override fun onStop() {
        super.onStop()
        showToast("on stop called")

    }

    override fun onRestart() {
        super.onRestart()
        showToast("on restart called")

    }
}