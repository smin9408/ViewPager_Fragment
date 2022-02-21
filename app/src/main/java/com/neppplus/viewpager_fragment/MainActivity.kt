package com.neppplus.viewpager_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_fragment.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents(){

    }

    fun setValues(){

        mAdapter = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mAdapter

//        재사용성을 무시하도록 하는 코드 예시 (사용성 개선) 페이지수가 적을때
        mainViewPager.offscreenPageLimit = 5

//        탭 레이아웃 / 뷰페이저 연결
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}