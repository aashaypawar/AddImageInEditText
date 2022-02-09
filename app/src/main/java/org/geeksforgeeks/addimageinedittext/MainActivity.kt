package org.geeksforgeeks.addimageinedittext

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.edit_text_1)

        val mDrawable: Drawable = getDrawable(R.drawable.ic_baseline_search_24)!!
        mEditText.setCompoundDrawablesWithIntrinsicBounds(null, null, mDrawable, null)
        

    }
}