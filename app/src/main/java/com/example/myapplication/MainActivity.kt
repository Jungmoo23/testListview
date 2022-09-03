package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val listar:ArrayList<pocket> = arrayListOf<pocket>(
        (pocket("jm",25,"software")),
        (pocket("jm",25,"software")),
        (pocket("jm",25,"software"))
    )

    val view:ListView by lazy {
        findViewById(R.id.listView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ap = DataDaptor(this,listar)
        view.adapter = ap


    }
}