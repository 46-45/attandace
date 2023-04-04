package co.id.absensi.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var btnAttend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnAttend = findViewById(R.id.btn_attend)

        btnAttend.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}