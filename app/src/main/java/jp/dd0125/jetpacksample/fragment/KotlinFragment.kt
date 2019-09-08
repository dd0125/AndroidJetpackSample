package jp.dd0125.jetpacksample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import jp.dd0125.jetpacksample.util.ViewUtil

class KotlinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        println("KotlinFragment")

        val linearLayout = LinearLayout(activity)
        linearLayout.orientation = LinearLayout.VERTICAL

//        findViewById<TextView>(R.id.sample_text).apply {
//            println("sample_text = ${text}")
//            findViewById<TextView>(R.id.sample_text).apply {
//                println("sample_text2 = ${text}")
//
//            }
//        }


        linearLayout.addView(ViewUtil.createButton(activity, "List", View.OnClickListener {
            println("BBB")
            val mutableList2 = mutableListOf<Int>()
            mutableList2.add(292)
            println(mutableList2)
            val mutableList = mutableListOf(50, 31, 2, 3)
            mutableList.add(5)
            mutableList.remove(50);
            println(mutableList)

            val list = listOf(32, 4, 29, 89, 67)
            for (i in 1..5) {
                println("i = $i");
            }
            val map = mapOf(1 to "hogehoge", 2 to "ddd")
            println(map[2])

            var l = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).asList()
            l = l.filter { x -> x % 2 == 0 }
            l = l.sortedByDescending { it }
            l = l.sorted()
            l = l.map { it * 12 }
            l = l.take(3)
            l.forEach { println(it) }


            var sequence = generateSequence(1) { it + 1 }
            sequence = sequence.take(5)
            sequence.forEach { println("generateSequence: ${it}") }

            Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()


        }))

        return linearLayout
    }


}


