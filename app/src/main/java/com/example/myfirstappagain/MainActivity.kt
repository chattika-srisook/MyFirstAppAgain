package com.example.myfirstappagain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myfirstappagain.Fragment.List.AddListFragment
import com.example.myfirstappagain.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView




class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private  lateinit var  binding:ActivityMainBinding
    private  lateinit var  drawer_layout:DrawerLayout
    private lateinit var navigation_view: NavigationView
    private  lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawer_layout = binding.drawerlayout
        navigation_view = binding.navView
        navigation_view.setNavigationItemSelectedListener(this)
        toggle = ActionBarDrawerToggle(this, drawer_layout,R.string.open,R.string.close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onBackPressed() {
        if (drawer_layout?.isDrawerOpen(GravityCompat.START)){
            drawer_layout.closeDrawer(GravityCompat.START)
        }else{

            super.onBackPressed()
        }
    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_aboutme ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,AboutMeFragment()).commit()
            }
            R.id.nav_contact ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,ContactFragment()).commit()
            }
            R.id.nav_list ->{
                supportFragmentManager.beginTransaction().replace(R.id.fragment_contain,
                    AddListFragment()
                ).commit()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}