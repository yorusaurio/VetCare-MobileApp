package com.example.vetcare_mobileapp.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(com.example.vetcare_mobileapp.R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(com.example.vetcare_mobileapp.R.id.btVet)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ivEmergency = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivEmergency)
        val ivAdvice = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivAdvice)
        val ivShop = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivShop)
        val ivUbication = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivUbication)
        val ivAppointment = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivAppointment)
        val ivComunity = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.ivComunity)
        val ivToolbar = findViewById<ImageView>(com.example.vetcare_mobileapp.R.id.btconfig)

        ivToolbar.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                ProfileUser::class.java
            )
            startActivity(intent)
        }

        ivAdvice.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                ListCareAdviceActivity::class.java
            )
            startActivity(intent)
        }

        ivUbication.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                MapsUbication::class.java
            )
            startActivity(intent)
        }

        ivEmergency.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                EmergencyActivity::class.java
            )
            startActivity(intent)
        }

        ivShop.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                ListProductActivity::class.java
            )
            startActivity(intent)
        }

        ivAppointment.setOnClickListener { // Crear un Intent para iniciar ConsultMedicActivity
            android.widget.Toast.makeText(this, "image_10 clicked", android.widget.Toast.LENGTH_SHORT).show()
            val intent = Intent(
                this@MainActivity,
                ConsultMedicActivity::class.java
            )
            // Iniciar la actividad ConsultMedicActivity
            startActivity(intent)
        }

        ivComunity.setOnClickListener{
            val intent = Intent(
                this@MainActivity,
                ForumActivity::class.java
            )
            startActivity(intent)
        }

    }
}