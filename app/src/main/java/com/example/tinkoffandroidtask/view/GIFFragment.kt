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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [GIFFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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

    override fun setGIF(Gif: GIFInfo) {
        gif_description.text = Gif.description
        Glide.with(this)
            .load(Gif.gifURL)
            .error(R.drawable.error)
            .into(gifImageView)
    }
}
