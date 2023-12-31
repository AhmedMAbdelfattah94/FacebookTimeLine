package com.example.facebooktimeline

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvDetails: RecyclerView
    lateinit var adapter: TimelineAdapter
    lateinit var postsList: ArrayList<TimelineDataItem>
    lateinit var linearLayoutManager: LinearLayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvDetails = findViewById(R.id.facebook_timeline_recycler_view)
        initFacebookTimeline()
        adapter = TimelineAdapter(postsList)
        rvDetails.adapter = adapter


    }

    fun initFacebookTimeline() {
        postsList = ArrayList()
        for (i in 0..1000) {
            postsList.add(
                TimelineDataItem(
                    author = "profile $i",
                    authorImage = R.drawable.me,
                    "Now",
                    postDescription = "Post Description $i",
                    postImage = R.drawable.me,
                    like = "Like $i",
                    comment = "Comment $i",
                    share = "Share $i"
                )
            )

        }

    }
}