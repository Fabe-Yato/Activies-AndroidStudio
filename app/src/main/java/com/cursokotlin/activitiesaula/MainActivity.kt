package com.cursokotlin.activitiesaula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonProximo = findViewById<Button>(R.id.buttonNext)

        //cria uma intent para a segunda tela com os parametros(pacote, classe utilizada
        // transformada em java)
        val intentSegunda = Intent(this, SegundaActivity::class.java)

        buttonProximo.setOnClickListener {
            startActivity(intentSegunda)
        }
    }
}