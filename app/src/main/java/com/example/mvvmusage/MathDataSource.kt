package com.example.mvvmusage

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MathDataSource {
    suspend fun add(number1Result:String,number2Result: String):String=//side effect

withContext(Dispatchers.IO) {
    val number1 = number1Result.toInt()
    val number2 = number2Result.toInt()
    val add = number1 + number2

    return@withContext add.toString()//value=trigger
}

    suspend fun multiple(number1Result:String,number2Result: String)=
withContext(Dispatchers.IO){

        val number1=number1Result.toInt()
        val number2=number2Result.toInt()
        val multiple=number1*number2
        return@withContext multiple.toString()

    }
}