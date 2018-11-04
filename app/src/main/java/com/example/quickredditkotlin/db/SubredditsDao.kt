package com.example.quickredditkotlin.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.quickredditkotlin.vo.SubscribedSubreddits

@Dao
abstract class SubredditsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertSubreddit(repo: SubscribedSubreddits):Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertSubreddits(vararg repos: SubscribedSubreddits)

    @Query("SELECT * FROM subreddits")
    abstract fun getSubredditList():Array<SubscribedSubreddits>


}