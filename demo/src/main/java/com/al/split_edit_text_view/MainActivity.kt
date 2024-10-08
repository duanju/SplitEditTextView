package com.al.split_edit_text_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.al.open.OnInputListener
import com.al.open.SplitEditTextView
import com.al.split_edit_text_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding  // Automatically generated binding class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val splitEdit1 = binding.splitEdit1
        val splitEdit2 = binding.splitEdit2
        val splitEdit3 = binding.splitEdit3
        val btnChangeMode  = binding.btnChangeMode

        binding.btnChangeStyle.setOnClickListener {
            when (splitEdit1.inputBoxStyle) {
                SplitEditTextView.INPUT_BOX_STYLE_SINGLE -> {
                    splitEdit1.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_CONNECT
                }
                SplitEditTextView.INPUT_BOX_STYLE_CONNECT -> {
                    splitEdit1.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE
                }
                SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE -> {
                    splitEdit1.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_SINGLE
                }
            }

            when (splitEdit2.inputBoxStyle) {
                SplitEditTextView.INPUT_BOX_STYLE_SINGLE -> {
                    splitEdit2.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_CONNECT
                }
                SplitEditTextView.INPUT_BOX_STYLE_CONNECT -> {
                    splitEdit2.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE
                }
                SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE -> {
                    splitEdit2.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_SINGLE
                }
            }

            when (splitEdit3.inputBoxStyle) {
                SplitEditTextView.INPUT_BOX_STYLE_SINGLE -> {
                    splitEdit3.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_CONNECT
                }
                SplitEditTextView.INPUT_BOX_STYLE_CONNECT -> {
                    splitEdit3.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE
                }
                SplitEditTextView.INPUT_BOX_STYLE_UNDERLINE -> {
                    splitEdit3.inputBoxStyle = SplitEditTextView.INPUT_BOX_STYLE_SINGLE
                }
            }

        }

        btnChangeMode.setOnClickListener {
            if (splitEdit1.contentShowMode == SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD) {
                splitEdit1.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_TEXT
            } else {
                splitEdit1.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD
            }
            if (splitEdit2.contentShowMode == SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD) {
                splitEdit2.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_TEXT
            } else {
                splitEdit2.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD
            }
            if (splitEdit3.contentShowMode == SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD) {
                splitEdit3.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_TEXT
            } else {
                splitEdit3.contentShowMode = SplitEditTextView.CONTENT_SHOW_MODE_PASSWORD
            }
        }


        splitEdit1.setOnInputListener(object : OnInputListener() {
            override fun onInputFinished(content: String?) {
                Toast.makeText(this@MainActivity,content,Toast.LENGTH_SHORT).show()
            }

            override fun onInputChanged(text: String?) {
                //Toast.makeText(this@MainActivity,text,Toast.LENGTH_SHORT).show()
            }
        })

        splitEdit2.setOnInputListener(object : OnInputListener() {
            override fun onInputFinished(content: String?) {
                Toast.makeText(this@MainActivity,content,Toast.LENGTH_SHORT).show()
            }

        })

        splitEdit3.setOnInputListener(object : OnInputListener() {
            override fun onInputFinished(content: String?) {
                Toast.makeText(this@MainActivity,content,Toast.LENGTH_SHORT).show()
            }
        })

    }
}