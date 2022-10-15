package com.example.basketball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basketball.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val puntosLocal : String
        val puntosVisitante : String
        var total : String
        val i : Int
        val j : Int
        puntosLocal = intent.getStringExtra("puntosLocal").toString()
        puntosVisitante = intent.getStringExtra("puntosVisitante").toString()
        total = "$puntosLocal - $puntosVisitante"
        binding.puntosTotales.text = total
        i = puntosLocal.toInt()
        j = puntosVisitante.toInt()
        if (i == j)
            binding.resultado.text = "Es empate"
        else if (i > j)
            binding.resultado.text = "Gano el local"
        else
            binding.resultado.text = "Gano visitante"
    }


}