package com.example.itproger

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat


class MainActivity : ComponentActivity() {
    private val namesArr = arrayOf("John","Doe","Joe","Josh", "Jack", "George");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView);
        val adapter: ArrayAdapter<String> = ArrayAdapter(this, R.layout.name_item, R.id.user_name, namesArr);
        listView.adapter = adapter;
    }
}