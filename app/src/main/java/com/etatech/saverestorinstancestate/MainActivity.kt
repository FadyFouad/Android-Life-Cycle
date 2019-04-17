package com.etatech.saverestorinstancestate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

private const val TEXT_CONTENTs = "textContent"

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
        Log.d("mainActivity","onStart : Called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("mainActivity","onRestoreInstanceState : Called")
        super.onRestoreInstanceState(savedInstanceState)
        val savedText = savedInstanceState?.getString(TEXT_CONTENTs,"")
        textView?.text = savedText

        Toast.makeText(this,"Call",Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        Log.d("mainActivity","onResume : Called")
        super.onResume()
    }

    override fun onPause() {
        Log.d("mainActivity","onPause : Called")
        super.onPause()
    }
    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d("mainActivity","onSaveInstanceState : Called")
        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENTs,textView?.text.toString())
    }

    override fun onStop() {
        Log.d("mainActivity","onStop : Called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d("mainActivity","onRestart : Called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d("mainActivity","onDestroy : Called")
        super.onDestroy()
    }
}
