package com.naveen.samplemap.repository

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import com.naveen.samplemap.dao.MapDao
import com.naveen.samplemap.model.MapModel

class MapRepository(val mapDao: MapDao) {

    val getMapHistory: LiveData<List<MapModel>> = mapDao.getAllMapHistory()

    @WorkerThread
    fun insert(mapModel: MapModel) {
    mapDao.insert(mapModel)
    }

    @WorkerThread
    fun delete(mapModel: MapModel) {
        mapDao.delete(mapModel)
    }
}