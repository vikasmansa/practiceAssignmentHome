package com.example.anew.practicehomefirst


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


/**
 * A simple [Fragment] subclass.
 * Use the [EditContainerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EditContainerFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    private var main:MainParams?=null
    private var edit1:EditText?=null
    private var edit2:EditText?=null
    private var edit3:EditText?=null
    private var subbut:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view=inflater!!.inflate(R.layout.fragment_edit_container, container, false)
        edit1=view?.findViewById(R.id.editone)
        edit2=view?.findViewById(R.id.edittwo)
        edit3=view?.findViewById(R.id.editthree)
        subbut=view?.findViewById(R.id.buttonsubmit)
        subbut?.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                main?.params(edit1?.text.toString(),edit2?.text.toString(),edit3?.text.toString())
               // responseListener?.response(true);
                //      Log.e("Back","Back Works")
                //  this@CategorySelectFragment.pop()
            }

        });
        return view
    }

    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EditContainerFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String,mainp:MainParams): EditContainerFragment {
            val fragment = EditContainerFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            fragment.main=mainp
            return fragment
        }
    }

}// Required empty public constructor
