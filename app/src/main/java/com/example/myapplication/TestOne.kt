package com.example.myapplication

import android.util.Log

class TestOne(val string: String): BaseTwo(string) {


    override fun testtest(string: String) {
        super.testtest(string)
    }

    fun method(): Int {
        return 0
        //Log.i("GGG", string)
    }

    class TestOneTwo {
        fun foo() = "大数据防守打法肯定是开发建设的副驾驶的会计法"
    }
}