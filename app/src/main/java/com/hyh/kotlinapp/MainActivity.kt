package com.hyh.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hyh.kotlinapp.sort.BubbleSort
import com.hyh.kotlinapp.sort.DataHelper
import com.hyh.kotlinapp.sort.SortProxy

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sortProxy = SortProxy()
        val bubbleSort = BubbleSort()
        sortProxy.setSort(bubbleSort)

        //隐式声明一个整型数组
        var datas = DataHelper.generateData()
        sortProxy.sort(datas)

        datas = DataHelper.generateBigData()
        sortProxy.sort(datas)
    }
}
