package co.id.absensi.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.app.DatePickerDialog
import android.widget.TextView
import java.util.Calendar

class IzinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_izin)

        val textViewDate = findViewById<TextView>(R.id.textViewDate)
        textViewDate.setOnClickListener {
            showDatePickerDialog(textViewDate)
        }

        val textViewDateBack = findViewById<TextView>(R.id.textViewDateBack)
        textViewDateBack.setOnClickListener {
            showDatePickerDialog(textViewDateBack)
        }
    }

    private fun showDatePickerDialog(textView: TextView) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDay ->
                // Update the TextView with the selected date
                val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                textView.text = selectedDate
            }, year, month, day)
        datePickerDialog.show()
    }
}
