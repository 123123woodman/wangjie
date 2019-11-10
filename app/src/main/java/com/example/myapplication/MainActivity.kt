package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    private var lastName : String = "sdfsd";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hashMap = HashMap<String, String>()

        object : Thread() {
            override fun run() {
                super.run()
                Thread.sleep(1000)
                Log.i("LLL", "你好啊刘少华")
            }
        }.start()

        thread(true, true, null, "testThread", 3, { test("王捷1111") })
        thread(true, true, null, "testThread", 2, { test("王捷2222") })
        thread(true, true, null, "testThread", 4, { test("王捷3333") })

        Thread(Runnable { Log.i("LLL", "你好啊王捷") }).start()

        var b: Boolean = false

        if (b) {

        } else {

        }

        var test: Test = Test("wangjie", 1, "哈哈哈")
        test.test = "qweqqweqwe"
        test.method1("方法一")
        test.testtest()
        Log.i("TTT", test.test)

        var testTwo: TestTwo = TestTwo("wangjie")
        Log.i("TTT", testTwo.testTwo.toUpperCase())
        print(lastName)

        val testOne: TestOne = TestOne("sdf")
        testOne.testtest("asdasd")

        val testOneTwo: TestOne.TestOneTwo = TestOne.TestOneTwo()
        val string: String = TestOne.TestOneTwo().foo()
        Log.i("GGG", string)

        val testFour: TestFour = TestFour()
        testFour.setInterface(object : TestFour.Inte1 {
            override fun test() {
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.i("GGG", "王捷王捷王捷王捷")
            }
        })
        testFour.method()

        val testFive: TestFive = TestFive("王捷刘少华", 18)
    }

    private fun test(string: String) {
        Log.i("HHH", "王捷喜欢刘少华----->" + string)
    }
}






