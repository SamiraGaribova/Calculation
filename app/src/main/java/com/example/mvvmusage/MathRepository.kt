package com.example.mvvmusage

class MathRepository {
    var mds=MathDataSource()

    suspend fun add(number1Result:String,number2Result: String):String=
        mds.add(number1Result, number2Result)



    suspend fun multiple(number1Result:String,number2Result: String)=
        mds.multiple(number1Result, number2Result)

}