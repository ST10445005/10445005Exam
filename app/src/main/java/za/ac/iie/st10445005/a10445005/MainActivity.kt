package za.ac.iie.st10445005.a10445005

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val arrTemp = IntArray(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting click listener for the 'Next' button
        findViewById<Button>(R.id.NextBtn).setOnClickListener{
            locateToDetailView()
        }
        //setting click listener for the 'Clear' button
        findViewById<Button>(R.id.ClearBtn).setOnClickListener{
            clearingTempData()
        }

    }
    private fun clearingTempData(){
        arrTemp.fill(0)
        Toast.makeText(this, "Refreshed", Toast.LENGTH_SHORT).show()
    }
    private fun locateToDetailView(){
        //locate to the detail view screen
        val intent = Intent(/* packageContext = */ this, /* cls = */ DetailView::class.java)
        startActivity(intent)

    }

}


