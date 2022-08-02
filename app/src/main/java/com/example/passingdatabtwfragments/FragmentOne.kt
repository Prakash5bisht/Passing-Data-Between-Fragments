package com.example.passingdatabtwfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class FragmentOne : Fragment() {
    // TODO: Rename and change types of parameters
     private var emailField: EditText? = null
    private var passwordField: EditText? = null
    private var loginBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        emailField = view.findViewById(R.id.email)
        passwordField = view.findViewById(R.id.password)
        loginBtn = view.findViewById(R.id.login)

        loginBtn?.setOnClickListener {

            val bundle = Bundle()

            bundle.putString("email", emailField?.text.toString())
            bundle.putString("password", passwordField?.text.toString())

            val secondFragment = FragmentTwo()

            secondFragment.arguments = bundle

            parentFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
                commit()
            }


        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentOne.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentOne().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
            }
    }
}