package com.hyh.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hyh.kotlinapp.sort.BubbleSort

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //实例化对象
        val bubble = BubbleSort()

        //隐式声明一个整型数组
        val datas = intArrayOf(5,4,3,2,1)
        bubble.sort(datas)
        //遍历数组的值
        for(data:Int in datas){
            Log.d("hyh", "data="+data);
        }

        //显示声明一个整型数组
        val datas2:Array<Int> = arrayOf(15,42,378,2,1)
        bubble.sort1(datas2)
        //通过索引遍历数组
        for(i in datas2.indices){
            Log.d("hyh", "data="+datas2[i]);
        }
    }
}
