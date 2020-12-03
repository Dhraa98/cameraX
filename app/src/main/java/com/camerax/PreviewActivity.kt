package com.camerax

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.camerax.databinding.ActivityPreviewBinding
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_preview)
        initControls()
    }

    private fun initControls() {
        binding.lifecycleOwner = this
        val savedUri = Uri.parse(intent.getStringExtra("IMAGE"))
        ivPreview.setImageURI(savedUri)
    }
}