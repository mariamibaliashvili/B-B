package com.example.myapplication.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragment1.*

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity)  {

    override fun getItemCount() = 7

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return FragmentFirst()
        }
        if (position == 1) {
            return FragmentSecond()
        }
        if (position == 2) {
            return FragmentThird()
        }
        if (position == 3) {
            return FragmentFourth()
        }
        if (position == 4) {
            return FragmentFifth()
        }
        return  if (position == 5) {
            FragmentSixth()
        } else {
            FragmentSeventh()

        }

    }
}