package torres.river.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: AppCompatButton = findViewById(R.id.button_cold_drinks)

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductsActivity::class.java)
            startActivity(intent)


        }
    }
}