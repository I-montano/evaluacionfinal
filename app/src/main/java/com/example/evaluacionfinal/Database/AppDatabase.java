package com.example.evaluacionfinal.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.evaluacionfinal.DAO.TextDao;
import com.example.evaluacionfinal.Models.Text;

@Database(entities = {Text.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TextDao textDao();
}
