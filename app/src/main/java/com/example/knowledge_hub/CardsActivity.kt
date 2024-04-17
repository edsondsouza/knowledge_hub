package com.example.knowledge_hub

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class CardsActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val android = findViewById<CardView>(R.id.androidCard)
        val web = findViewById<CardView>(R.id.webCard)
        val data = findViewById<CardView>(R.id.dataCard)
        val mlearning = findViewById<CardView>(R.id.mlCard)
        val blockchain = findViewById<CardView>(R.id.blockCard)
        val llm = findViewById<CardView>(R.id.llmCard)
        val contact = findViewById<Button>(R.id.contact)

//        android
        android.setOnClickListener() {
            val intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }

//        web
        web.setOnClickListener() {
            val intent = Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }

//        data
        data.setOnClickListener() {
            val intent = Intent(applicationContext, DataActivity::class.java)
            startActivity(intent)
        }

//        machine learning
        mlearning.setOnClickListener() {
            val intent = Intent(applicationContext, MachineActivity::class.java)
            startActivity(intent)
        }

//        blockchain
        blockchain.setOnClickListener() {
            val intent = Intent(applicationContext, BlockchainActivity::class.java)
            startActivity(intent)
        }

//        llm
        llm.setOnClickListener() {
            val intent = Intent(applicationContext, LargeLanguageModelActivity::class.java)
            startActivity(intent)
        }

//        contact
        contact.setOnClickListener() {
            val phNumber: String = "+919398819356"
            val intent = Intent(Intent.ACTION_VIEW)
            val uri = Uri.parse("tel:$phNumber")
            intent.setData(uri)
            startActivity(intent)
        }
    }
}