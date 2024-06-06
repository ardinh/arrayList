package com.mobileuts.arraylist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)

        val itemList = listOf(
            ItemList(
                "judul 1",
                "Deskripsi 1",
                "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            ),
            ItemList(
                "judul 2",
                "Deskripsi 2",
                "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            ),
            ItemList(
                "judul 3",
                "Deskripsi 3",
                "https://maukuliah.ap-south-1.linodeobjects.com/gallery/043059/Gedung%201%20STTB-thumbnail.jpg"
            )
        )
        val adapter = AdapterList(itemList)
        recyclerView.adapter = adapter
    }
}