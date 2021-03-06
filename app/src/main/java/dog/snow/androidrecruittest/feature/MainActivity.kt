package dog.snow.androidrecruittest.feature

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dog.snow.androidrecruittest.R

class MainActivity : AppCompatActivity(R.layout.main_activity) {
    companion object {
        fun callingIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

}