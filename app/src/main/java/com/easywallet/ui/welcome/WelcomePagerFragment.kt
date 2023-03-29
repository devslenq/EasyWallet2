package com.easywallet.ui.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import com.easywallet.R
import com.easywallet.core.BaseFragment
import com.easywallet.data.models.WelcomeScreenModel
import com.easywallet.databinding.ItemWelcomeViewpagerBinding

class WelcomePagerFragment: BaseFragment<ItemWelcomeViewpagerBinding>() {

    private lateinit var item: WelcomeScreenModel

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = ItemWelcomeViewpagerBinding.inflate(inflater, container, false)

    override fun ItemWelcomeViewpagerBinding.setupLayout() {
        title.text = getString(item.title)
        body.text = getString(item.body)
        image.setImageResource(item.image)
    }

    companion object {
        fun getInstance(position: Int) = WelcomePagerFragment().apply {
            this.item = welcomeScreens[position]
        }

        fun getScreenSize() = welcomeScreens.size

        private val welcomeScreens = listOf(
            WelcomeScreenModel(
                image = R.drawable.ic_pig_moneybox,
                title = R.string.welcome_title_1,
                body = R.string.welcome_body_1),
            WelcomeScreenModel(
                image = R.drawable.ic_business_analytics_graph,
                title = R.string.welcome_title_2,
                body = R.string.welcome_body_2),
            WelcomeScreenModel(
                image = R.drawable.ic_line_chart,
                title = R.string.welcome_title_3,
                body = R.string.welcome_body_3),
        )

    }
}