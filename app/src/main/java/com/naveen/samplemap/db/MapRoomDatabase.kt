package com.naveen.samplemap.db

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.naveen.samplemap.dao.MapDao
import com.naveen.samplemap.model.MapModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [MapModel::class], version = 2, exportSchema = false)
abstract class MapRoomDatabase : RoomDatabase() {
    abstract fun mapDao(): MapDao

    companion object {
        @Volatile
        private var INSTANCE: MapRoomDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope
        ): MapRoomDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        MapRoomDatabase::class.java,
                        "map_database"
                )
                        .fallbackToDestructiveMigration()
                        .addCallback(Companion.MapCallback(scope))
                        .build()
                INSTANCE = instance
                //  instance
                instance

            }



        }
        private class MapCallback(private val scope: CoroutineScope
        ) : Callback() {
            /**
             * Override the onOpen method to populate the database.

             */
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                // If you want to keep the data through app restarts,
                // comment out the following line.
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.mapDao())
                    }
                }
            }
        }


        fun destroyInstance() {
            INSTANCE = null
        }

        fun populateDatabase(mapDao: MapDao) {
            // Start the app with a clean database every time.
            // Not needed if you only populate on creation.
            // mapDao.deleteAll()
            mapDao.getAllMapHistory()

        }



    }

}
