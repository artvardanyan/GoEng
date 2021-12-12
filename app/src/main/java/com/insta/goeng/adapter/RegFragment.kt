package com.insta.goeng.adapter

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.insta.goeng.databinding.FragmentRegBinding

const val ARG_OBJECT = "object"

class RegFragment : Fragment() {

    private var binding: FragmentRegBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.userReg?.addTextChangedListener(loginTextWatcher);
        binding?.email?.addTextChangedListener(loginTextWatcher);
        binding?.password?.addTextChangedListener(loginTextWatcher);
        binding?.passwordRepeat?.addTextChangedListener(loginTextWatcher);
    }

    private val loginTextWatcher: TextWatcher = object : TextWatcher {

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            val usernameInput: String = binding?.userReg?.text.toString().trim()
            val emailInput: String = binding?.email?.text.toString().trim()
            val passwordInput: String = binding?.password?.text.toString().trim()
            val passwordRepeatInput: String = binding?.passwordRepeat?.text.toString().trim()

            binding?.reg?.isEnabled =
                usernameInput.isNotEmpty() && emailInput.isNotEmpty() && passwordInput.isNotEmpty() && passwordRepeatInput.isNotEmpty()
        }

        override fun afterTextChanged(s: Editable) {}
    }

}