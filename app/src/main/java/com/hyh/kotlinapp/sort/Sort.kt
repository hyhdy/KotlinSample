package com.hyh.kotlinapp.sort

/**
 * created by curdyhuang on 2020-01-21
 */
interface Sort {
    /**
     * datas默认是不可null的，如果要可null可以这样声明：
     * datas: Array<Int>?
     */
    fun sort(datas: Array<Int>)
}