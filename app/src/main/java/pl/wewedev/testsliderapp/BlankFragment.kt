package pl.wewedev.testsliderapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById(R.id.button) as? Button ?: return
        button.setOnClickListener {
            replace(SliderFragment.newInstance())
        }

        val button2 = view.findViewById(R.id.button2) as? Button ?: return
        button2.setOnClickListener {
            replaceWithStartEndTransition(SliderFragment.newInstance())
        }
    }

    companion object {
        fun newInstance() = BlankFragment()
    }
}
