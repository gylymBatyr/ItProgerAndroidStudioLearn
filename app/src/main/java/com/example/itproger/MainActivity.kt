package com.example.itproger

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.itproger.ui.theme.ITProgerTheme
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.textView);
        val button = findViewById<Button>(R.id.button);
        val editText1 = findViewById<EditText>(R.id.editTextText1);
        val editText2 = findViewById<EditText>(R.id.editTextText2);

        button.setOnClickListener{
            val num1 = editText1.text.toString().toInt()
            val num2 = editText2.text.toString().toInt()
            val result = num1 + num2
            resultTextView.text = result.toString()
        }
//        enableEdgeToEdge()
//        setContent {
//            ITProgerTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
    // onCreate, onStart
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ITProgerTheme {
        Greeting("Android")
    }
}