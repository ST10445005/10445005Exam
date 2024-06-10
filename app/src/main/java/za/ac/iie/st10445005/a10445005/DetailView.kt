package za.ac.iie.st10445005.a10445005

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailView : AppCompatActivity() {
    private val arrTemp = IntArray(7)

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        // Calculate average temperature to be displayed
        calculationOfAverageTemperature()

        // Setting the click listener for the "Return" button
        findViewById<Button>(R.id.RetunBtn).setOnClickListener {
            locateToMainScreen()
        }
    }

    private fun calculationOfAverageTemperature() {
        val totalTemp = arrTemp.sum()
        val averageTemp = totalTemp.toDouble() / arrTemp.size

        findViewById<TextView>(R.id.TempTv).text = "Average Temperature: $averageTemp"
    }

    private fun locateToMainScreen() {
        // locate back to the main screen
        val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
