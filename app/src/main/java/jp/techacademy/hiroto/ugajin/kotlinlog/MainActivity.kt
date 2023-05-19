package jp.techacademy.hiroto.ugajin.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val dog = Dog("ポチ", 3)
        dog.say()

        val dog2 = Dog("ハチ", 8)
        dog2.say()

        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()
        dog.move()
        Log.d("kotlintest", "犬の名前は"+bigdog.name+"、犬の年齢は"+bigdog.age+"です。")*/

        val human1 = Human ("Hiroto", 70, "programing")
//        human1.hobby = "programing"
        human1.say()
        human1.think()
        val human2 = Human("Mitsue", 72, "cocking")
//        human2.hobby = "cocking"
        human2.say()
        human2.think()
    }
}