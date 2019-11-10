package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private var lastName : String = "sdfsd"
    private lateinit var test: Test
    private lateinit var testOne: TestOne
    private lateinit var testFour: TestFour

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : Thread() {
            override fun run() {
                super.run()
                sleep(1000)
                Log.i("LLL", "你好啊刘少华")
            }
        }.start()

        thread(
            start = true,
            isDaemon = true,
            contextClassLoader = null,
            name = "testThread",
            priority = 3,
            block = { "王捷1111".test() })

        Thread(Runnable { Log.i("LLL", "你好啊王捷") }).start()

        test = Test("wangjie", 1, "哈哈哈")
        test.test = "qweqqweqwe"
        test.method1("方法一")
        test.testtest()
        Log.i("TTT", test.test)

        Log.i("TTT", TestTwo("wangjie").testTwo.toUpperCase(Locale.CHINESE))
        print(lastName)

        testOne = TestOne("sdf")
        testOne.testtest("asdasd")

        val string: String = TestOne.TestOneTwo().foo()
        Log.i("GGG", string)

        testFour = TestFour()
        testFour.setInterface(object : TestFour.Inte1 {
            override fun test() {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.i("GGG", "王捷王捷王捷王捷")
            }
        })
        testFour.method()

    }

    private fun String.test() {
        Log.i("HHH", "王捷喜欢刘少华----->" + this)
    }
}






