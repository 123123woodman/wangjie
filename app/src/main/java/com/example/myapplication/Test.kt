package com.example.myapplication

import android.util.Log

class Test(val firstName: String, val simple: Int?): TestThree(){
    override fun testtest() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.i("TTT", "王捷你好啊")
    }

    constructor(firstName: String, simple: Int?, con2: String): this(firstName, simple) {
        Log.i("TTT", "firstName:" + firstName + "simple:" + simple + "con2:" + con2)
    }

    init{
        Log.i("TTT", "王捷王捷" + firstName)
    }

    var allByDef: Int? = null
    var initialized = ""

    var test: String = "asd"
        get() = field.toUpperCase()
        set(value) {
            field = firstName
        }

    fun method1(str: String) {
        Log.i("TTT", "str----->" + str)
    }

}
