package co.id.absensi.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var btnAttend : Button

    lateinit var btnIzin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnAttend = findViewById(R.id.btn_attend)

        btnIzin = findViewById(R.id.btn_izin)

        btnIzin.setOnClickListener {
            startActivity(Intent(this, IzinActivity::class.java))
        }

        btnAttend.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}