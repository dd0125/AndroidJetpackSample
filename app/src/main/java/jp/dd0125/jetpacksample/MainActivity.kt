package jp.dd0125.jetpacksample

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import jp.dd0125.jetpacksample.fragment.DataBindingFragment
import jp.dd0125.jetpacksample.fragment.KotlinFragment
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity() {

    fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment);
        // 最後にcommitを使用することで変更を反映します
        transaction.commit();

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //
        replaceFragment(DataBindingFragment())



    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        when(item.itemId){
            R.id.action_data_binding -> {
                replaceFragment(DataBindingFragment())
            }
            R.id.action_kotlin -> {
                replaceFragment(KotlinFragment())

            }
        }

        return true
    }
}
