package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.launchmode.utils.showToast

class ActivityE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
    }

    fun onClicked(view: View) {
        /*launching some other activity with standard mode will be added to the older backstack*/
        /*on pressing back with launched activity will traverse through older stack*/
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun onClicked2(view: View) {
        /*launching again the same activity with single task will result in executing onNewIntent instead launching it again */
        startActivity(
            Intent(this, ActivityE::class.java).putExtra(
                stringExtra,
                "activity is not launched again instead onNewIntent called"
            )
        )
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        showToast(intent?.getStringExtra(stringExtra).toString())
    }
}