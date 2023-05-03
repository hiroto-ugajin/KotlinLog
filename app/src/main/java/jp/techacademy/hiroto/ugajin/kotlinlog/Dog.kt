package jp.techacademy.hiroto.ugajin.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {


    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "才)" + "「ワンワン」")
    }

    override fun move() {
            Log.d("kotlintest", this.name + "("+ this.age + "才)" + "は全力で走った。")
    }
}
