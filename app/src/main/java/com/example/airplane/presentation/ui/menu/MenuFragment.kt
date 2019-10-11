package com.example.airplane.presentation.ui.menu

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.airplane.R
import com.example.airplane.interfaces.views.main.DrawerFragmentInterface

class MenuFragment: Fragment(), DrawerFragmentInterface {

    companion object{
        private var INSTANCE: MenuFragment? = null
        fun getInstance(): MenuFragment{
            if (INSTANCE == null)
                INSTANCE = MenuFragment()
            return INSTANCE!!
        }

        fun newInstance(): MenuFragment{
            INSTANCE = MenuFragment()
            return INSTANCE!!
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.menu_fragment, container, false)

        return view
    }
}