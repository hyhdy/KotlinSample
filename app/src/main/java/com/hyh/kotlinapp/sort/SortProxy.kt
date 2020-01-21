package com.hyh.kotlinapp.sort

import android.util.Log

/**
 * created by curdyhuang on 2020-01-21
 */
class SortProxy: Sort{
    //设置mSort为可空的变量
    private var mSort: Sort? = null
    private var mStartTime:Long = 0

    fun setSort(sort: Sort){
        mSort = sort
    }

    override fun sort(datas: Array<Int>) {
        beforeSort()
        //因为mSort有可能为null，这里通过?.做了安全处理，如果mSort非空，就调用mSort.sort，否则返回null
        mSort?.sort(datas)
        afterSort(datas)
    }

    fun beforeSort(){
        mStartTime = System.currentTimeMillis()
    }

    fun afterSort(datas: Array<Int>){
        DataHelper.traversal(datas)
        Log.d("hyhtest","consumeTime="+(System.currentTimeMillis()-mStartTime))
    }

}