package com.example.quickredditkotlin.vo


import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "subreddits")
data class SubscribedSubreddits(
        @PrimaryKey
        val name: String,
        val path : String
)