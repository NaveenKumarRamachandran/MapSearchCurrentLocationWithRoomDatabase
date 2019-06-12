package com.naveen.samplemap.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.naveen.samplemap.model.MapModel

@Dao
interface MapDao {
    @Insert
    fun insert(mapModel: MapModel)

    @Delete
    fun delete(mapModel: MapModel)

    @Query("Select * from MapModel")
    fun getAllMapHistory():LiveData<List<MapModel>>
}