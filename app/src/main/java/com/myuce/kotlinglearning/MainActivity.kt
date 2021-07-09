package com.myuce.kotlinglearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.myuce.kotlinglearning.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding


  private  var myNumber1:Int?=null
  private  var myNumber2:Int?=null
  private var myresult:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = ActivityMainBinding.inflate(layoutInflater)
      val view = binding.root
      setContentView(view)




    }

    fun addition(view:View){




      myNumber2=binding.numberEditTextText.text.toString().toIntOrNull()
      myNumber1=binding.number2ditTextText.text.toString().toIntOrNull()

      if(myNumber2==null||myNumber1==null)
      {
        Toast.makeText(this,"Please fill in required field ",Toast.LENGTH_LONG).show()
      }
      else{

        myresult=myNumber1!!+ myNumber2!!
        binding.resultTextView.text=myresult.toString()
      }
    }
    fun impact(view:View)
    {
      myNumber2=binding.numberEditTextText.text.toString().toIntOrNull()
      myNumber1=binding.number2ditTextText.text.toString().toIntOrNull()
      if(myNumber2==null||myNumber1==null)
      {
        Toast.makeText(this,"Please fill in required field ",Toast.LENGTH_LONG).show()
      }
      else{


        myresult= myNumber1!! * myNumber2!!
        binding.resultTextView.text=myresult.toString()
      }


    }
    fun division(view: View){
      myNumber2=binding.numberEditTextText.text.toString().toIntOrNull()
      myNumber1=binding.number2ditTextText.text.toString().toIntOrNull()
      if(myNumber2==null||myNumber1==null)
      {
        Toast.makeText(this,"Please fill in required field ",Toast.LENGTH_LONG).show()
      }
      else{


        myresult= myNumber1!! / myNumber2!!
        binding.resultTextView.text=myresult.toString()
      }
    }
    fun extraction(view: View){
      myNumber2=binding.numberEditTextText.text.toString().toIntOrNull()
      myNumber1=binding.number2ditTextText.text.toString().toIntOrNull()
      if(myNumber2==null||myNumber1==null)
      {
        Toast.makeText(this,"Please fill in required field ",Toast.LENGTH_LONG).show()
      }
      else{


        myresult= myNumber1!! - myNumber2!!
        binding.resultTextView.text=myresult.toString()
      }

    }
}