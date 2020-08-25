package com.example.myfirstappagain.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "AddListTable")
data class AddListData (
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    @ColumnInfo(name = "Name",defaultValue = "Unknown")
    var name:String,
    @ColumnInfo(name = "email")
    var email:String
)