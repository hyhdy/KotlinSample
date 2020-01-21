package com.hyh.kotlinapp.sort

import android.util.Log
import kotlin.math.max

/**
 * created by curdyhuang on 2020-01-21
 * 静态类，注意类的修饰符是object不是class
 */
object DataHelper {

    fun generateData(): Array<Int>{
        return arrayOf(15,42,378,2,1)
    }

    fun generateBigData(): Array<Int>{
        val maxData = 1000
        // 创建一个 Array<Int> 初始化为 [maxData,....,0]
        val datas = Array(maxData) { i -> maxData - i}
        return datas
    }

    fun traversal(datas: Array<Int>){
        Log.d("hyhtest", "DataHelper: traversal: 开始遍历")
        val size = datas.size
        for(i in 0..size-1){
            Log.d("hyhtest", "DataHelper: traversal: data="+datas[i])
        }
    }

    fun traversal2(datas: Array<Int>){
        Log.d("hyhtest", "DataHelper: traversal2: 开始遍历")
        for(data in datas){
            Log.d("hyhtest", "DataHelper: traversal2: data="+data)
        }
    }

    fun traversal3(datas: Array<Int>){
        Log.d("hyhtest", "DataHelper: traversal3: 开始遍历")
        for(i in datas.indices){
            Log.d("hyhtest", "DataHelper: traversal3: data="+datas[i])
        }
    }

}