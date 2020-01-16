package com.example.recyclerviewcrush

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcrush.adapter.CrushAdapter
import com.example.recyclerviewcrush.model.Crush

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.crush_recycler)
        val crushArray= ArrayList<Crush>()
        crushArray.add(Crush(R.drawable.photo,"James Wilson","posted",R.drawable.crush1,"3K","100","89"))
        crushArray.add(Crush(R.drawable.photo2,"LuWai Wai Wai","posted",R.drawable.crush2,"10K","1000","1K"))
        val crushAdapter =CrushAdapter(crushArray)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=crushAdapter




    }
}
