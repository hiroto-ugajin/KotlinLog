package jp.techacademy.hiroto.ugajin.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val human1 = Human("浩人", 70)
        human1.hobby = "プログラム"
        val human2 = Human("光江", 72)
        human2.hobby = "料理"

    human1.say()
        human1.think()
        human2.say()
        human2.think()
    }
}