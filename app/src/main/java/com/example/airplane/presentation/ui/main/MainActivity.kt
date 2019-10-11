package com.example.airplane.presentation.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.airplane.R
import com.example.airplane.interfaces.views.main.DrawerFragmentInterface
import com.example.airplane.interfaces.views.main.MainView
import com.example.airplane.presentation.ui.menu.MenuFragment

class MainActivity : AppCompatActivity(),MainView {

    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager
        replaceFragment(MenuFragment.getInstance())
    }

    override fun replaceFragment(fragment: DrawerFragmentInterface) {
        fragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment, fragment as Fragment)
            .commit()
    }

}
