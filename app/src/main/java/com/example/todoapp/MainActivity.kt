package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinpractice.RVAdapter

class MainActivity : AppCompatActivity() {
    private  var arr= arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvMain =findViewById<RecyclerView>(R.id.rvMain)

        var note=findViewById<EditText>(R.id.edtext)
        var btSave=findViewById<Button>(R.id.btSave)
        btSave.setOnClickListener {
            arr.add(note.text.toString())

        }
        rvMain.adapter = RVAdapter(this, arr)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter?.notifyDataSetChanged()
    }
}