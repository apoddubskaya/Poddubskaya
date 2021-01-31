package com.example.tinkoffandroidtask.presenter


import com.example.tinkoffandroidtask.model.GIFInfo
import com.example.tinkoffandroidtask.model.getNextGIFUri

class Presenter(private val view: View) {

    fun getNextGIF() {
        val gif = getNextGIFUri()
        view.setGIF(gif)
    }

    interface View {
        fun setGIF(gif: GIFInfo)
    }

}