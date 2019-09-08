package jp.dd0125.jetpacksample.util

import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentActivity


class ViewUtil {
    companion object {
        fun createButton(activity: FragmentActivity?, text:String, onClickListener: View.OnClickListener): Button {
            val button = Button(activity)
            button.text = text
            button.setOnClickListener(onClickListener)
            return button
        }
    }
}