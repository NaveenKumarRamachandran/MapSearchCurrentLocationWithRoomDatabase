package com.naveen.samplemap


import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.BottomSheetDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.naveen.samplemap.model.MapModel
import com.naveen.samplemap.viewmodel.MapViewModel
import kotlinx.android.synthetic.main.fragment_info_bottom.*


@SuppressLint("ValidFragment")
class InfoBottomFragment(mapModel: MapModel) : BottomSheetDialogFragment() {


    var mapModel: MapModel = mapModel
    lateinit var viewModel: MapViewModel

    private fun saveLocation(mapModel: MapModel) {
        viewModel.insert(mapModel)
        Toast.makeText(this.activity, "", Toast.LENGTH_LONG).show()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_info_bottom, container, false)
        val fav = v?.findViewById<TextView>(R.id.favorite_location)
        val starred = v?.findViewById<TextView>(R.id.starred_location)
        val wantToGo = v?.findViewById<TextView>(R.id.want_to_reach)

        viewModel = ViewModelProviders.of(this).get(MapViewModel::class.java)
        wantToGo?.setOnClickListener {
            mapModel.type = "Want to go"
            saveLocation(mapModel)
        }

        starred?.setOnClickListener {
            mapModel.type = "Starred"
            saveLocation(mapModel)
        }
        fav?.setOnClickListener {
            mapModel.type = "favorite"
            saveLocation(mapModel)
        }


/*
        if (mapModel!=null){
        Log.d(""+mapModel.longitude,""+mapModel.latitude)
        }
*/
        return v
    }


}
