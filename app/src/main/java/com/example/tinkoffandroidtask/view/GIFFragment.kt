package com.example.tinkoffandroidtask.view

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.tinkoffandroidtask.R
import com.example.tinkoffandroidtask.model.GIFInfo
import com.example.tinkoffandroidtask.presenter.Presenter
import kotlinx.android.synthetic.main.fragment_gif.*
import java.net.URL

class GIFFragment : Fragment(), Presenter.View {

    private val presenter: Presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gif, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.getNextGIF()
    }

    override fun setGIF(Gif: GIFInfo?) {
        gif_description.text = Gif?.description ?: "Some error occurred"
        Glide.with(this)
            .load(Gif?.gifURL)
            .error(R.drawable.error)
            .into(gifImageView)
    }
}
