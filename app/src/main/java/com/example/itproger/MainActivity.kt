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
import com.example.itproger.data.Country
import com.example.itproger.data.CountryListAdapter


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView);
        val namesArr: Array<Country> = arrayOf(
            Country("Kazakhstan",R.drawable.kz,17_000_000),
            Country("Russia",R.drawable.ru,144_000_000),
            Country("USA",R.drawable.us,323_000_000));
        val adapter: CountryListAdapter = CountryListAdapter(this, R.layout.name_item, namesArr);
        listView.adapter = adapter;
    }
}