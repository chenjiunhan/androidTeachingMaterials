package jaqq.app.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AnotherActivit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
    }

    override fun onStart() {
        super.onStart()
        Log.d("myAPP", "onStart2")
        // The activity is about to become visible.
    }

    override fun onResume() {
        super.onResume()
        Log.d("myAPP", "onResume2")
        // The activity has become visible (it is now "resumed").
    }

    override fun onPause() {
        super.onPause()
        Log.d("myAPP", "onPause2")
        // Another activity is taking focus (this activity is about to be "paused").
    }

    override fun onStop() {
        super.onStop()
        Log.d("myAPP", "onStop2")
        // The activity is no longer visible (it is now "stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myAPP", "onDestroy2")
        // The activity is about to be destroyed.
    }
}
