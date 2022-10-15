package com.example.basketball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.basketball.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var i : String
        var j : Int
        var puntajeLocal : String
        var puntajeVisitante : String
        binding.masUnoLocal.setOnClickListener{
            i = binding.puntosLocal.text.toString()
            j = i.toInt()
            j = j+1
            binding.puntosLocal.text = j.toString()
        }
        binding.menosLocal.setOnClickListener {
            i = binding.puntosLocal.text.toString()
            j = i.toInt()
            if (j != 0){
                j = j-1
                binding.puntosLocal.text = j.toString()
            }else
                Toast.makeText(this,"Ya es 0", Toast.LENGTH_LONG).show()
        }
        binding.masDosLocal.setOnClickListener {
            i = binding.puntosLocal.text.toString()
            j = i.toInt()
            j = j+2
            binding.puntosLocal.text = j.toString()
        }
        binding.masUnoVisitante.setOnClickListener{
            i = binding.puntosVisitante.text.toString()
            j = i.toInt()
            j = j+1
            binding.puntosVisitante.text = j.toString()
        }
        binding.menosVisitante.setOnClickListener {
            i = binding.puntosVisitante.text.toString()
            j = i.toInt()
            if (j != 0){
                j = j-1
                binding.puntosVisitante.text = j.toString()
            }else
                Toast.makeText(this,"Ya es 0", Toast.LENGTH_LONG).show()
        }
        binding.masDosVisitante.setOnClickListener {
            i = binding.puntosVisitante.text.toString()
            j = i.toInt()
            j = j+2
            binding.puntosVisitante.text = j.toString()
        }
        binding.reset.setOnClickListener {
            j=0
            binding.puntosLocal.text = j.toString()
            binding.puntosVisitante.text = j.toString()
        }
        binding.score.setOnClickListener {
            puntajeLocal = binding.puntosLocal.text.toString()
            puntajeVisitante = binding.puntosVisitante.text.toString()
            var k = Intent(applicationContext,ScoreActivity::class.java)
            k.apply {
                putExtra("puntosLocal",puntajeLocal)
                putExtra("puntosVisitante",puntajeVisitante)
            }
            startActivity(k)
        }
    }
}

