package com.easywallet.data.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class WelcomeScreenModel(
    @DrawableRes var image: Int,
    @StringRes var title: Int,
    @StringRes var body: Int
)
