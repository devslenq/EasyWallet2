package com.easywallet.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T: ViewBinding>: AppCompatActivity() {
    protected var binding : T? = null

    abstract fun setupViewBinding(inflater: LayoutInflater, container: ViewGroup?): T

    open fun T.setupLayout() {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setupViewBinding(LayoutInflater.from(this), null)
        setContentView(binding?.root)
        binding?.setupLayout()
    }

    override fun onDestroy() {
        releaseViewBinding()
        super.onDestroy()
    }

    private fun releaseViewBinding() {
        binding = null
    }
}