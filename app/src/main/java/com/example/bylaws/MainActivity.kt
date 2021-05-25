package com.example.bylaws
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import fragments.DashboardFragment
import fragments.InfoFragment
import kotlinx.android.synthetic.main.activity_main.*
import ui.ForumFragment


open class MainActivity : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val forumFragment = ForumFragment()
    private val infoFragment = InfoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ByLaws)
        setContentView(R.layout.activity_main)



        replaceFragment(dashboardFragment)


        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.icon_dashboard -> replaceFragment(dashboardFragment)
                R.id.icon_forum -> replaceFragment(forumFragment)
                R.id.icon_info -> replaceFragment(infoFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()

    }

    }








