package jp.techacademy.hiroto.ugajin.kotlinlog

import android.util.Log

class BigDog: Dog {
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
            super.say()
            Log.d("kotlintest", name+
                "は大きな犬です。")
    }
}
