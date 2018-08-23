package com.example.quickredditkotlin.db

import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.quickredditkotlin.vo.RedditPost

abstract class RedditPostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertRedditPost(repo: RedditPost):Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertRedditPosts(vararg repo: RedditPost)

    @Query("DELETE FROM reddit_post")
    abstract fun deleteAllSubredditData()

    @Query("SELECT * FROM reddit_post WHERE type = :postType")
    abstract fun fetchSubredditDataByPostType(postType : Int) : Array<RedditPost>
}