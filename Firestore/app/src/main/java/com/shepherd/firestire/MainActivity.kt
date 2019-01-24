package com.shepherd.firestire

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.firebase.firestore.FirebaseFirestore
import com.shepherd.firestire.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mikeUID = "7Zqjyup8b7CKLyHi6usg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val eventsSnapshot = FirebaseFirestore.getInstance().collection("users").get()

        binding.apply {
            rvEventList.hasFixedSize()
            rvEventList
        }

    }

    companion object {
        val TAG = MainActivity.toString()
    }
}
