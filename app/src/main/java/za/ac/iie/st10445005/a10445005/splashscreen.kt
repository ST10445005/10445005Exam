package za.ac.iie.st10445005.a10445005

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


@SuppressLint("CustomSplashScreen")
class SplashScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        findViewById<Button>(R.id.EnterBtn)
        findViewById<Button>(R.id.ExitBtn)

        getString(R.string.app_name)
        getString(R.string.presented_by_tshepo_tsotesti)
        getString(R.string._10445005)

        //setting click listener for buttons
        findViewById<Button>(R.id.EnterBtn).setOnClickListener {
            locateToMainActivity()
        }
        findViewById<Button>(R.id.ExitBtn).setOnClickListener{
            finish()
        }

    }

    private fun locateToMainActivity() {
        //locate to the Main Screen
        val intent= Intent(/* packageContext = */ this,/*cls=*/MainActivity::class.java
        )
        startActivity(intent)

        finish()
    }



    }
