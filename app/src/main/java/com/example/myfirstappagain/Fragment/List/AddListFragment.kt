package com.example.myfirstappagain.Fragment.List

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myfirstappagain.R
import kotlinx.android.synthetic.main.fragment_list.view.*

class AddListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view =  inflater.inflate(R.layout.fragment_list,container,false)


        view.floatingActionButton.setOnClickListener {
            Navigation.findNavController(view!!).navigate(R.id.action_addFragment_to_addListFragment)
        }

        return view
    }

}


