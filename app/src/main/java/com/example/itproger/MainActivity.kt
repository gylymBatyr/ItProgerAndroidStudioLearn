package com.example.itproger

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat


class MainActivity : ComponentActivity() {


//    val btn1: Button = findViewById(R.id.button1);


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mainText=findViewById<TextView>(R.id.mainTextView);
        val btn2: Button = findViewById(R.id.button2);
        val btn3: Button = findViewById(R.id.button3);
        btn2.setOnClickListener {
            showInfo(mainText.text.toString(),btn2);
        }
        btn3.setOnClickListener {
            showInfoAlert("алерт диалог");
        }
        //#region lesson 3
//        val resultTextView = findViewById<TextView>(R.id.textView);
//        val button = findViewById<Button>(R.id.button);
//        val editText1 = findViewById<EditText>(R.id.editTextText1);
//        val editText2 = findViewById<EditText>(R.id.editTextText2);
//
//        button.setOnClickListener{
//            val num1 = editText1.text.toString().toInt()
//            val num2 = editText2.text.toString().toInt()
//            val result = num1 + num2
//            resultTextView.text = result.toString()
//        }
        //#endregion
        //#region just
        //        enableEdgeToEdge()
        //            setContentView(R.layout.activity_main) {
        //            ITProgerTheme {
        //                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        //                    Greeting(
        //                        name = "Android",
        //                        modifier = Modifier.padding(innerPadding)
        //                    )
        //                }
        //            }
        //        }
        //            }
            // onCreate, onStart
        //#endregion
    }
    public fun btnClick(view: View)  {
        showInfo((view as Button).text.toString(), (view as Button));
    }
    private fun showInfoAlert(text: String) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this);
        builder.setTitle("большая подсказка")
            .setMessage(text)
            .setCancelable(false)
            .setPositiveButton("OK") { dialog, id -> finish() }
            .setNegativeButton("Cancel") { dialog, id -> dialog.cancel()}
        val alert: AlertDialog = builder.create()
        alert.show()
    }
    @SuppressLint("ResourceAsColor")
    private fun showInfo(text: String, btn: Button) {
        btn.text="уже нажата"
        btn.backgroundTintList =  ColorStateList.valueOf(R.color.teal_700);
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}