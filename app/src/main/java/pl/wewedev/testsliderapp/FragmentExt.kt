package pl.wewedev.testsliderapp

import android.view.Gravity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.transition.Slide

fun Fragment.replace(fragment: Fragment) {
    parentFragmentManager.commit {
        addToBackStack(null)
        replace(R.id.container, fragment)
    }
}

fun Fragment.replaceWithStartEndTransition(fragment: Fragment){
    parentFragmentManager.commit {
        addToBackStack(null)
        fragment.enterTransition = Slide(Gravity.END)
        fragment.exitTransition = Slide(Gravity.START)
        replace(R.id.container, fragment)
    }
}