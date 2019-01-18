package com.felipeshiba.pocnavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        changeFragment(R.id.home, false)
        bottom_navigation.setOnNavigationItemSelectedListener(::navigate)
    }

    private fun navigate(item: MenuItem): Boolean {
        changeFragment(item.itemId, true)
        return when (item.itemId) {
            R.id.home, R.id.search, R.id.orders, R.id.profile -> true
            else -> false
        }
    }

    private fun changeFragment(itemId: Int, shouldAddToBackStack: Boolean = true) {
        val tag = "${navigation_container.id}:$itemId"

        val fragment = supportFragmentManager.findFragmentByTag(tag) ?: getFragment(itemId)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(navigation_container.id, fragment, tag)
        fragmentTransaction.setPrimaryNavigationFragment(fragment)
        if (shouldAddToBackStack) fragmentTransaction.addToBackStack(tag)
        fragmentTransaction.commitAllowingStateLoss()
    }

    private fun getFragment(itemId: Int): Fragment {
        return when (itemId) {
            R.id.home -> HomeFragment()
            R.id.search -> SearchFragment()
            R.id.orders -> OrdersFragment()
            R.id.profile -> ProfileFragment()
            else -> HomeFragment()
        }
    }
}
