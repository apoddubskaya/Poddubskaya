package com.example.tinkoffandroidtask.model

import android.net.Uri

data class GIFInfo(val description: String, val gifURL: Uri)

fun getNextGIFUri() : GIFInfo {
    return GIFInfo(
        "Test GIF descriprion",
        Uri.parse("http://static.devli.ru/public/images/gifs/201401/910474ac-f3c8-4cfb-b0b2-1746f476536a.gif")
    )
}