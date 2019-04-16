package com.etatech.saverestorinstancestate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView? = findViewById(R.id.textView)
        val editText:EditText? = findViewById(R.id.editText)
        val btn_ok: Button? = findViewById(R.id.btn_ok)
        val btn_clear: Button? = findViewById(R.id.btn_clear)


    }
}
