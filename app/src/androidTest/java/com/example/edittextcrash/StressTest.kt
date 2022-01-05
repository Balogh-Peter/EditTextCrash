package com.example.edittextcrash

import android.util.Log
import androidx.appcompat.widget.AppCompatEditText
import androidx.test.core.app.ActivityScenario
import org.junit.Test

class StressTest {

    @Test
    fun stressTest() {
        for (i in 1..500) {
            val activityScenario = ActivityScenario.launch(MainActivity::class.java)
            activityScenario.onActivity {
                it.findViewById<AppCompatEditText>(R.id.editText).requestFocus()
                it.findViewById<AppCompatEditText>(R.id.editText).clearFocus()
                Thread.sleep(500)
            }
            Log.d("StressTest", "Launched activity number:  $i")
        }
    }
}