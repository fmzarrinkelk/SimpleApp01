package edu.fullerton.fz.cs411.simpleapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 1

    private lateinit var nextButton: Button
    private lateinit var prevButton: Button
    private lateinit var counterView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.NextButton)
        prevButton = findViewById(R.id.PrevButton)
        counterView = findViewById(R.id.counterView)

        nextButton.setOnClickListener {
            // this is a stupid example for the sake of learning
            var myButton: Button = (it as Button)
            if (myButton.text == "I got clicked") {
                myButton.text = "Next"
            } else {
                myButton.text = "I got clicked"
            }
            counter++
            counterView.text = counter.toString()
        }

        // parentheses for the following call are unnecessary
        prevButton.setOnClickListener ( { view: View ->
            // view is never used here
            counter--
            counterView.text = counter.toString()
        } )

    }


}