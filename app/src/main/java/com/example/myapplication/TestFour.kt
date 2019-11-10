package com.example.myapplication

class TestFour {
    var inte1: Inte1? = null
    val string: String = "qweqwe"

    interface Inte1 {
        fun test()
    }

    public fun method() {
        inte1?.test()
    }

    fun setInterface(inte1: Inte1) {
        this.inte1 = inte1
    }

}