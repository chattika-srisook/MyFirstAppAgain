package com.example.myfirstappagain.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class AddListViewModel (
    val database: AddListDatabase, application: Application
): AndroidViewModel(application){
}