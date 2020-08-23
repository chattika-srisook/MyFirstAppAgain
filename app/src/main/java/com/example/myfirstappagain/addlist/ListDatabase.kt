package com.example.myfirstappagain.addlist

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ListData::class],version = 1)
abstract  class ListDatabase : RoomDatabase() {

    //ดูแบบมาจาก 6.1
    companion object {
        @Volatile
        private var model: ListDatabase? = null
        fun getDatabase(context: Context): ListDatabase? {
            synchronized(this) {
                var _model = model

                if (_model == null) {
                 model = Room.databaseBuilder(
                        context.applicationContext,
                        ListDatabase::class.java,
                        "contact_list_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    model = _model
                }
                return _model
            }
        }
    }

}


