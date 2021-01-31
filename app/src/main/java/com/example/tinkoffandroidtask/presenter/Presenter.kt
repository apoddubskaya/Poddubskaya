package com.example.tinkoffandroidtask.presenter


import com.example.tinkoffandroidtask.model.APIClient.getNextGIFUri
import com.example.tinkoffandroidtask.model.GIFInfo

class Presenter(private val view: View) {

    fun getNextGIF() {
        val gif = getNextGIFUri()
        view.setGIF(gif)
    }

    interface View {
        fun setGIF(gif: GIFInfo?)
    }

}