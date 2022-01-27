package com.example.tracker_data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.tracker_data.local.entity.TrackedFoodEntity
import kotlinx.coroutines.flow.Flow
import java.time.Year

@Dao
interface TrackerDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertTrackedFood(trackedFoodEntity: TrackedFoodEntity)

    @Delete
    suspend fun deleteTackedFood(trackedFoodEntity: TrackedFoodEntity)

    @Query("""
        SELECT *
        FROM trackedfoodentity
        WHERE dayOfMonth = :day AND month = :month AND year = :year
    """)
    fun getFoodsForDate(day: Int, month: Int, year: Year): Flow<List<TrackedFoodEntity>>
}