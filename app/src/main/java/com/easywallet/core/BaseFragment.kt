package com.easywallet.core

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T: ViewBinding>: Fragment() {
    protected var binding : T? = null

    abstract fun setupViewBinding(inflater: LayoutInflater, container: ViewGroup?): T

    open fun T.setupLayout() {}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = setupViewBinding(inflater, container)
        binding?.setupLayout()
        return binding!!.root
    }

    override fun onDestroy() {
        releaseViewBinding()
        super.onDestroy()
    }

    private fun releaseViewBinding() {
        binding = null
    }
}