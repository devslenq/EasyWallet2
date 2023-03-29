package com.easywallet.ui.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import com.easywallet.core.BaseActivity
import com.easywallet.databinding.ActivityWelcomeBinding

class WelcomeActivity: BaseActivity<ActivityWelcomeBinding>() {
    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ActivityWelcomeBinding.inflate(inflater, container, false)
}