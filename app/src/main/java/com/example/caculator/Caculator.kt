package com.example.caculator

object Calculator {
    fun calculate(calculationList: List<String>): Double {
        var mCurrentOperation = ""
        var mCurrentNumber = 1.0
        calculationList.forEach{
                token-> when {
            token == "+" || token == "-" || token=="/" || token=="*" -> mCurrentOperation = token
            mCurrentOperation==("-") -> mCurrentNumber -= token.toInt()
            mCurrentOperation==("+") -> mCurrentNumber += token.toInt()
            mCurrentOperation==("/") -> mCurrentNumber /= token.toDouble()
            else -> mCurrentNumber *= token.toInt()
        }
        }
        return mCurrentNumber
    }
}
