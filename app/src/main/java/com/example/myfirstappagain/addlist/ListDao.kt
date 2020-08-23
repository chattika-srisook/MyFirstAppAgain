package com.example.myfirstappagain.addlist

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface ListDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(name:String,email:String)
    @Query("select * from listTable order by id desc")
    fun getList():LiveData<List<ListData>>
}