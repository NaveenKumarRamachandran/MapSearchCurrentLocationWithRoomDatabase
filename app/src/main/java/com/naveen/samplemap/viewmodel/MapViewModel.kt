package com.naveen.samplemap.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.naveen.samplemap.db.MapRoomDatabase
import com.naveen.samplemap.model.MapModel
import com.naveen.samplemap.repository.MapRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext


class MapViewModel(application: Application) : AndroidViewModel(application) {
    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)
    private val repository: MapRepository
    var liveData: LiveData<List<MapModel>>



    init {
        val mapDao = MapRoomDatabase.getDatabase(application,scope).mapDao()
        repository = MapRepository(mapDao)
        liveData = repository.getMapHistory
    }

    fun insert(mapModel: MapModel) = scope.launch(Dispatchers.IO) {
        repository.insert(mapModel)
    }
    fun delete(mapModel: MapModel) = scope.launch(Dispatchers.IO) {
        repository.delete(mapModel)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}