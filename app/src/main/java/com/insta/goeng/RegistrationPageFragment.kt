package com.insta.goeng

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.insta.goeng.adapter.RegFragment
import com.insta.goeng.adapter.SignInFragment
import com.insta.goeng.adapter.ViewPagerAdapter
import com.insta.goeng.databinding.FragmentRegistrationPageBinding

class RegistrationPageFragment : Fragment() {

    private var binding: FragmentRegistrationPageBinding? = null
    private var adapter: ViewPagerAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrationPageBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.tabLayout?.setupWithViewPager(binding?.viewpager)
        adapter = ViewPagerAdapter(parentFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        adapter?.addFragment(SignInFragment(), "Մուտք")
        adapter?.addFragment(RegFragment(), "Գրանցվել")
        binding?.viewpager?.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}