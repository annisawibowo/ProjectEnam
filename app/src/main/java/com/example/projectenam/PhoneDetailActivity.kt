package com.example.projectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_detail.*


class PhoneDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)
        var intentThatStartedThisActivity = getIntent()


        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partId2 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)

            var partId3 = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            tv_item_id.text = partId
            tv_item_id2.text = partId2
            tv_item_id3.text = partId3


        }
    }
}