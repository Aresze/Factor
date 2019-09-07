package com.example.factor

import kotlin.math.sqrt

fun factor(num: Int): ArrayList<Int> {
    val array = ArrayList<Int>()
    var x = num
    var i = 2
    while (i <= sqrt(x.toDouble())) {
        while (x % i == 0) {
            array.add(i)
            x /= i
        }
        i++
    }
    if (x != 1) {
        array.add(x)
    }
    return array
}
