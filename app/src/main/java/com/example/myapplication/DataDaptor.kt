package com.example.myapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import java.util.ArrayList

class DataDaptor(val context: Activity, val list: ArrayList<pocket>) :ArrayAdapter<String>(context,R.layout.activity_layout) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view :View = LayoutInflater.from(context).inflate(R.layout.activity_layout,null)



        val v_name:TextView = view.findViewById<TextView>(R.id.v_main)
        val v_age:TextView = view.findViewById<TextView>(R.id.v_obj)
        val v_work:TextView = view.findViewById<TextView>(R.id.v_sub)


        v_name.text = list.get(position).name
        v_age.text = list.get(position).age.toString()
        v_work.text = list.get(position).work


        return view
    }

}