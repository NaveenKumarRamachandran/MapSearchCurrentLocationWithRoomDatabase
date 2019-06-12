package com.naveen.samplemap.activities

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.naveen.samplemap.R
import com.naveen.samplemap.adapter.MapAdapter
import com.naveen.samplemap.viewmodel.MapViewModel

import kotlinx.android.synthetic.main.activity_view_search_result.*

class ViewSearchResult : AppCompatActivity() {
    private lateinit var mapViewModel: MapViewModel
    private lateinit var recyclerView: RecyclerView
    lateinit var adapter: MapAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_search_result)
        setSupportActionBar(toolbar)


        mapViewModel= ViewModelProviders.of(this).get(MapViewModel::class.java)


        val girdLayoutManager = GridLayoutManager(this.application, 1)
        recyclerView=findViewById(R.id.map_recycler)
        recyclerView.layoutManager = girdLayoutManager
        adapter = MapAdapter(this)
        recyclerView.adapter = adapter
        mapViewModel.liveData.observe(this,
                Observer { mapList ->
                    mapList?.let {
                        adapter.setMapList(it)
                    }
                })
    }

}
