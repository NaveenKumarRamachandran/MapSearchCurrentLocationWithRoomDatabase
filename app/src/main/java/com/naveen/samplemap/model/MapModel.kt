package com.naveen.samplemap.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class MapModel {
    @ColumnInfo(name = "name")
    lateinit var name: String

    @ColumnInfo(name = "latitude")
    lateinit var latitude:String

    @ColumnInfo(name = "longitude")
    lateinit var longitude:String

    @ColumnInfo(name="founded")
    var boolean: Boolean = false

    @ColumnInfo(name="type")
    lateinit var type: String

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
}
