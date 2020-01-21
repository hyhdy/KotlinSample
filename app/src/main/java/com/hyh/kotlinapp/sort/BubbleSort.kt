package com.hyh.kotlinapp.sort

import android.util.Log

/**
 * created by curdyhuang on 2019-11-06
 */
class BubbleSort: Sort {
    override fun sort(datas: Array<Int>) {
        sort2(datas)
    }

    /**
     * IntArray表示整形数组类型
     */
    fun sort1(datas:IntArray){
        //val相当于java中的final，赋值后就不能再该变值
        val index = datas.size-1

        //根据下标遍历数组
        for(i in 0..index) {
            for (j in 0..index-1-i) {
                if(datas[j]>datas[j+1]){
                    val tmp = datas[j];
                    datas[j] = datas[j+1];
                    datas[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 返回值Unit相当于java的void，可以直接省略不写
     * Array<Int>表示整型数组
     */
    fun sort2(datas:Array<Int>):Unit{
        //var赋值后可以再改变值，隐式声明变量类型
        var size = datas.size;
        //显示声明变量类型
        var size2:Int = datas.size;

        //根据下标遍历数组
        for(i in 0..size-1) {
            for (j in 0..size-2-i) {
                if(datas[j]>datas[j+1]){
                    val tmp = datas[j];
                    datas[j] = datas[j+1];
                    datas[j+1] = tmp;
                }
            }
        }
    }
}