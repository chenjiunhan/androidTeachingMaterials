package jaqq.app.myfristapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnClickMe = findViewById<Button>(R.id.button)
        var btn2 = findViewById<Button>(R.id.buttonNewActivity)

        btnClickMe.setOnClickListener {
            // make a toast on button click event
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()
        }

        btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

    }



}
