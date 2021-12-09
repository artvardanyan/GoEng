package com.insta.goeng.adapter

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.insta.goeng.RegistrationPageFragment

class ViewPagerAdapter(@NonNull fm: FragmentManager, beh: Int) : FragmentPagerAdapter(fm) {

    private val fragmentReg: ArrayList<Fragment> = ArrayList()
    private val fragmentTitle: ArrayList<String> = ArrayList()

    override fun getCount(): Int {
        return fragmentReg.size
    }

    @NonNull
    override fun getItem(position: Int): Fragment {
        return fragmentReg[position]
    }

    public fun addFragment(fragment: Fragment, title: String) {
        fragmentReg.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitle[position]
    }

}