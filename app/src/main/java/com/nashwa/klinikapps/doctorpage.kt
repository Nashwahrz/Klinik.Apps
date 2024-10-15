package com.nashwa.klinikapps

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.klinikapps.adapter.AdapterListDoctor
import com.nashwa.klinikapps.adapter.AdapterMenuIcon
import com.nashwa.klinikapps.model.ModelIcon
import com.nashwa.klinikapps.model.ModelListDoctor

class doctorpage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctorpage)

       val rvMenu : RecyclerView = findViewById(R.id.RvMenu)
        rvMenu.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        val menuList = listOf(
            ModelIcon(R.drawable.iconheart,"Cardiologyst"),
            ModelIcon(R.drawable.iconeye1,"Opthalmologyst"),
            ModelIcon(R.drawable.icontooth,"Dentist"),

        )
        rvMenu.adapter = AdapterMenuIcon(menuList)

        val rvDoctor : RecyclerView = findViewById(R.id.RvDoctor)
        rvDoctor.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val doctorList = listOf(
            ModelListDoctor("Dr. Floyd Miles", R.drawable.dokter1,"Pediatrics", "(123 reviews)", "4.9"),
            ModelListDoctor("Dr. Guy Hawkinds", R.drawable.dokter2,"Dentist", "(85 reviews)", "4.9"),
            ModelListDoctor("Dr. Jane Cooper", R.drawable.dokter3,"Pediatrics", "(44 reviews)", "4.8"),
            ModelListDoctor("Dr. Jacob Jones", R.drawable.dokter4,"Nephrologyst", "(101 reviews)", "5.0")
        )
        rvDoctor.adapter = AdapterListDoctor(doctorList)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}