package com.easywallet.ui.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import com.easywallet.core.BaseFragment
import com.easywallet.databinding.FragmentWelcomeBinding

class WelcomeFragment: BaseFragment<FragmentWelcomeBinding>() {
    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentWelcomeBinding.inflate(inflater, container, false)

    override fun FragmentWelcomeBinding.setupLayout() {

    }
}