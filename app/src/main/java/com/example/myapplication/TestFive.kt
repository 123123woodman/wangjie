package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.util.Log

class TestFive: BaseTwo {

   constructor(name: String, age: Int) : super(name) {
        Log.i("HHH", "name---->" + name + "---age---->" + age)
   }

    override fun testtest(string: String) {

    }

}