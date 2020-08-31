package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v:View){
        var radioButtonId: Int = radio_group.checkedRadioButtonId
        var radioButton: RadioButton = findViewById(radioButtonId)
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("sendData" , Employee(edit_name.text.toString(), radioButton.text.toString()
            ,edit_Email.text.toString(),edit_salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        edit_name.text.clear()
        edit_Email.text.clear()
        edit_salary.text.clear()
        radio_group.clearCheck()
    }
}