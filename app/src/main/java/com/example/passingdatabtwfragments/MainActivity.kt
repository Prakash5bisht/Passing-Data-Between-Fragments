package com.example.passingdatabtwfragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragmentOne)
            commit()
        }

    }

}