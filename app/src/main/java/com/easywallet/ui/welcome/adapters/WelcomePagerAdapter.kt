package com.easywallet.ui.welcome.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.easywallet.ui.welcome.WelcomePagerFragment

class WelcomePagerAdapter(
    manager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(manager, lifecycle) {

    override fun getItemCount() = WelcomePagerFragment.getScreenSize()

    override fun createFragment(position: Int): Fragment {
        return WelcomePagerFragment.getInstance(position)
    }


}