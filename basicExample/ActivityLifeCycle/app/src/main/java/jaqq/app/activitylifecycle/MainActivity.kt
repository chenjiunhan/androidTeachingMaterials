package jaqq.app.activitylifecycle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debug", "onCreate")

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, AnotherActivit::class.java)
            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("myAPP", "onStart")
        // The activity is about to become visible.
    }

    override fun onResume() {
        super.onResume()
        Log.d("myAPP", "onResume")
        // The activity has become visible (it is now "resumed").

        val editText = findViewById<EditText>(R.id.editText)
        val preference = PreferenceManager.getDefaultSharedPreferences(this)
        val name = preference.getString("name", "empty")
        editText.setText(name)

    }

    override fun onPause() {
        super.onPause()
        Log.d("myAPP", "onPause")
        // Another activity is taking focus (this activity is about to be "paused").

        val editText = findViewById<EditText>(R.id.editText)

        val preference = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = preference.edit()
        editor.putString("name", editText.text.toString())
        editor.commit()

    }

    override fun onStop() {
        super.onStop()
        Log.d("myAPP", "onStop")
        // The activity is no longer visible (it is now "stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myAPP", "onDestroy")
        // The activity is about to be destroyed.
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        Log.d("myAPP", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("myAPP", "onRestoreInstanceState")
    }

}

