package com.example.anew.practicehomefirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var frame: FrameLayout? = null
    private var  text1: TextView?=null
    private var  text2: TextView?=null
    private var  text3: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1=findViewById(R.id.text1)
        text2=findViewById(R.id.text2)
        text3=findViewById(R.id.text3)
        loadFragment();
    }

    private fun loadFragment() {
        //To change body of created functions use File | Settings | File Templates.
        frame = findViewById(R.id.containerbottom)
        supportFragmentManager.beginTransaction().replace(R.id.containerbottom, EditContainerFragment.newInstance("", "",object :MainParams{
            override fun params(string1: String, string2: String, string3: String) {
                text1?.setText(string1)
                text2?.setText(string2)
                text3?.setText(string3)
                //To change body  of created functions use File | Settings | File Templates.
            }



        })).commit()

    }
}
