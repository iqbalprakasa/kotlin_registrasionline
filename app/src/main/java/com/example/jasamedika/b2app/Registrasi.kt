package com.example.jasamedika.b2app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

    }
}
