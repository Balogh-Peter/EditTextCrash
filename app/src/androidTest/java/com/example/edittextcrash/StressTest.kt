package com.example.edittextcrash

import android.util.Log
import androidx.appcompat.widget.AppCompatEditText
import androidx.test.core.app.ActivityScenario
import org.junit.Test

class StressTest {

    @Test
    fun stressTest() {
        for (i in 1..500) {
            ActivityScenario.launch(MainActivity::class.java)
            Log.d("StressTest", "Launched activity number:  $i")
        }
    }
}