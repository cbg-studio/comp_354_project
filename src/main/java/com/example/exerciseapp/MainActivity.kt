package com.example.exerciseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() { //you're coding in kotlin, different syntax




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        openUserInfo()
        openGeneralSettings()



    }

    private fun openGeneralSettings() : Unit {

        val settingsButton:Button = findViewById<Button>(R.id.display_settings_button)
        settingsButton.setOnClickListener{

            val intent: Intent = (Intent(this, GeneralSettingz::class.java))
            startActivity(intent)
        }


    }

    private fun openUserInfo() : Unit {
        val userInfoButton:Button = findViewById<Button>(R.id.user_info_button)
        userInfoButton.setOnClickListener {

            val intent: Intent = (Intent(this, UserInfo::class.java))
            startActivity(intent)
        }


    }
}