package com.easywallet.ui.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import com.easywallet.core.BaseFragment
import com.easywallet.databinding.FragmentWelcomeBinding
import com.easywallet.ui.welcome.adapters.WelcomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class WelcomeFragment: BaseFragment<FragmentWelcomeBinding>() {
    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentWelcomeBinding.inflate(inflater, container, false)

    override fun FragmentWelcomeBinding.setupLayout() {
        WelcomePagerAdapter(childFragmentManager, lifecycle).also {
            pager.adapter = it
        }
        TabLayoutMediator(tabLayout, pager) { _, _ -> }.attach()

    }
}