package com.etatech.saverestorinstancestate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView? = findViewById(R.id.textView)
        val editText:EditText? = findViewById(R.id.editText)
        val btn_ok: Button? = findViewById(R.id.btn_ok)
        val btn_clear: Button? = findViewById(R.id.btn_clear)

        textView?.movementMethod = ScrollingMovementMethod()

        btn_ok?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                var txt:String = editText?.text.toString()
                counter++
                textView?.append("\n $txt $counter" )

            }
        })

        btn_clear?.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

                textView?.text = ""
            }

        })

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
