package com.example.myfirstappagain.addlist

import android.app.Application
import androidx.lifecycle.AndroidViewModel


class ListViewModel(
    val database: ListDatabase, application: Application
):AndroidViewModel(application) {


}