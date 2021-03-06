package com.example.p2pcs_app.SearchResult

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.p2pcs_app.SearchResult.SearchResultList.FragmentSearchResultList
import com.example.p2pcs_app.SearchResult.SearchResultMap.FragmentSearchResultMap

class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 2

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = FragmentSearchResultList()
            1 -> fragment = FragmentSearchResultMap()
        }

        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position==0)
            return "Elenco"
        else
            return "Mappa"
    }
}