package com.example.quickredditkotlin.vo

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ColumnInfo
import org.jetbrains.annotations.NotNull

@Entity(tableName = "subreddits", primaryKeys = ["id"/*, "title"*/])
data class RedditPost(
        val id : Int,
        @NotNull
        val title : String,
        val domain : String,
        val author : String,
        val score : Int,
        @ColumnInfo(name = "num_comment")
        val numberOfComments : Int,
        @ColumnInfo(name = "over_18")
        val isOver18 : String,
        @NotNull
        val subreddit : String,
        @NotNull
        @ColumnInfo(name = "created_utc")
        val createdTime : Int,
        val url : String,
        @ColumnInfo(name = "post_hint")
        val postHint : String,
        val permalink : String,
        @ColumnInfo(name = "preview_img")
        val previewImg : String,
        val type : Int
) {
}