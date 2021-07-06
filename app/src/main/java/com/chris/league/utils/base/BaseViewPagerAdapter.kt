package com.chris.league.utils.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class BaseViewPagerAdapter constructor(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private val mFragmentList = mutableListOf<Fragment>()

    override fun getItemCount() = mFragmentList.size

    override fun createFragment(position: Int) = mFragmentList[position]

    fun addFragments(fragmentList: List<Fragment>) {
        this.mFragmentList.clear()
        this.mFragmentList.addAll(fragmentList)
    }
}
