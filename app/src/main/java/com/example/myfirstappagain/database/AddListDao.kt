package com.example.myfirstappagain.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface AddListDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(name:String,email:String)
    @Query("select * from AddListTable order by id desc")
    fun getAddContact(): LiveData<List<AddListData>>
}