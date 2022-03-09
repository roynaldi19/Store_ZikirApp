package com.roynaldi19.zikirapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.roynaldi19.zikirapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var mediaPlayer: MediaPlayer? = null
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIstigfar.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.istigfar)
            mediaPlayer?.start()
            count++
            binding.tvCount.text = count.toString()
        }

        binding.btnTakbir.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.takbir)
            mediaPlayer?.start()
            count++
            binding.tvCount.text = count.toString()
        }

        binding.btnTahlil.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tahlil)
            mediaPlayer?.start()
            count++
            binding.tvCount.text = count.toString()
        }

        binding.btnTahmid.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tahmid)
            mediaPlayer?.start()
            count++
            binding.tvCount.text = count.toString()
        }

        binding.btnTasbih.setOnClickListener {
            mediaPlayer = MediaPlayer.create(applicationContext, R.raw.tasbih)
            mediaPlayer?.start()
            count++
            binding.tvCount.text = count.toString()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_reset -> {
                mediaPlayer?.stop()
                count = 0
                binding.tvCount.text = count.toString()
            }
        }
    }
}