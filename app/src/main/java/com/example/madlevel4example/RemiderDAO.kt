package com.example.madlevel4example

import androidx.room.*

@Dao // DAO = stands for data access object
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders(): List<Reminder> // suspend is needed so that we cannot call this method without using Coroutines

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}
