package com.emad.quizapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),TextToSpeech.OnInitListener{

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // var tts:TextToSpeech?= null
        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()) {
                Toast.makeText(this, "Please Enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent= Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())

                //tts = TextToSpeech(this, this)

                startActivity(intent)
                //tts!!.speak(et_name!!.text.toString(), TextToSpeech.QUEUE_FLUSH, null,"")
                finish()

            }
        }
    }

    override fun onInit(status: Int) {

    }
}