package com.example.quickredditkotlin.db

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.quickredditkotlin.IConstants.DB.Companion.DATABASE_NAME
import com.example.quickredditkotlin.vo.RedditPost
import com.example.quickredditkotlin.vo.SubscribedSubreddits

@Database(
        entities = [
            RedditPost::class,
            SubscribedSubreddits::class],
        version = 1,
        exportSchema = false
)
abstract class RedditDatabase : RoomDatabase(){
    abstract fun redditPost() : RedditPost

    abstract fun subscribedSubreddits() : SubscribedSubreddits

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: RedditDatabase? = null

        fun getInstance(context: Context): RedditDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): RedditDatabase {
            return Room.databaseBuilder(context, RedditDatabase::class.java, DATABASE_NAME)
                    .addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            /*val request = OneTimeWorkRequestBuilder<SeedDatabaseWorker>().build()
                            WorkManager.getInstance().enqueue(request)*/
                        }
                    })
                    .build()
        }
    }
}