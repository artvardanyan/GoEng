package com.insta.goeng

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.insta.goeng.databinding.FragmentRegistrBinding

class RegistrFragment : Fragment() {

    private var binding: FragmentRegistrBinding? = null
    private lateinit var mPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegistrBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.clickReg?.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.add(R.id.container, RegistrationPageFragment())
                ?.addToBackStack("false")
                ?.commit()
        }



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}