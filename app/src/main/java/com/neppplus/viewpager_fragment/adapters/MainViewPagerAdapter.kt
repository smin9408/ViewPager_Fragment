package com.neppplus.viewpager_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_fragment.fragments.*

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "이름"
            1 -> "출생년도"
            else -> "인사말"
        }
    }

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> BirthYearFragment()
            else -> HelloFragment()
        }

    }


}