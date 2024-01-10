package com.example.mvvmusage
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel:ViewModel() {

    var result=MutableLiveData("0")
    var mrepo=MathRepository()
    fun add(number1Result:String,number2Result: String){//side effect
        CoroutineScope(Dispatchers.Main).launch{
            mrepo.add(number1Result, number2Result)
        }




        val number1=number1Result.toInt()
        val number2=number2Result.toInt()
        val add=number1+number2

        result.value=add.toString()//value=trigger

    }
    fun multiple(number1Result:String,number2Result: String){
        CoroutineScope(Dispatchers.Main).launch{
            mrepo.multiple(number1Result, number2Result)


        val number1=number1Result.toInt()
        val number2=number2Result.toInt()
        val multiple=number1*number2
        result.value=multiple.toString()

    }

}}