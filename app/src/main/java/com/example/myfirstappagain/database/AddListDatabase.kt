package com.example.myfirstappagain.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AddListData::class],version = 1)
abstract class AddListDatabase : RoomDatabase() {
    companion object {
        @Volatile
        private var model: AddListDatabase? = null
        fun getDatabase(context: Context): AddListDatabase? {
            synchronized(this) {
                var _model = model
                if (_model == null) {
                    model = Room.databaseBuilder(
                        context.applicationContext,
                        AddListDatabase::class.java,
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