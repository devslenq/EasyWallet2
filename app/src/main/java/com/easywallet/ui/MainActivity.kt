package com.easywallet.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.easywallet.core.BaseActivity
import com.easywallet.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ActivityMainBinding.inflate(inflater, container, false)

}