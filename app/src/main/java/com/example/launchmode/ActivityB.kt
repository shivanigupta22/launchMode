package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.launchmode.utils.showToast

const val stringExtra = "stringExtra"
/*launched in single top mode*/

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun onClicked(view: View) {
        /*launching again the same activity with single top will result in executing onNewIntent instead launching it again */
        startActivity(
            Intent(this, ActivityB::class.java).putExtra(
                stringExtra,
                "activity is not launched again instead onNewIntent called"
            )
        )
    }

    fun onClicked2(view: View) {
        /*launching activity with single task when there is no instance of activity yet will simply launch activity*/
        startActivity(Intent(this, ActivityC::class.java))
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        showToast(intent?.getStringExtra(stringExtra).toString())
    }
}