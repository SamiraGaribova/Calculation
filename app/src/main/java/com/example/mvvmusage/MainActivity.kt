package com.example.mvvmusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmusage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels() //by=delegate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivity=this


        viewModel.result.observe(this){
            binding.result=it
        }

//        binding.buttonAdd.setOnClickListener {
//
//
//        }
//
//    binding.buttonMultiple.setOnClickListener {
//
//    }
}
   fun add(number1Result:String,number2Result: String){

viewModel.add(number1Result,number2Result)
//       val number1=number1Result.toInt()
//       val number2=number2Result.toInt()
//       val add=number1+number2

//       binding.result=viewModel.result

   }
    fun multiple(number1Result:String,number2Result: String){
        viewModel.multiple(number1Result,number2Result)
//
//        val number1=number1Result.toInt()
//        val number2=number2Result.toInt()
//        val multiple=number1*number2
//        binding.result=viewModel.result

    }

}