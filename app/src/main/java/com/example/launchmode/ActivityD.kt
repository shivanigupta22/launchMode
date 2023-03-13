package com.example.launchmode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    fun onClicked(view: View) {
        /*launching activity with single top when it is not on top will create another instance of that activity*/
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun onClicked2(view: View) {
        /*launching activity with single task when it is already there in stack will result in destroying activities on top on that activity and call onnewintent of that activity*/

        startActivity(Intent(this, ActivityC::class.java))

    }

    fun onClicked3(view: View) {
        /*launching activity with single instance will result in creating new task for that activity*/
        startActivity(Intent(this, ActivityE::class.java))
    }
}