package com.example.evaluacionfinal.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.evaluacionfinal.Models.Text;

import java.util.List;

@Dao
public interface TextDao {
    @Query("SELECT * FROM texts")
    List<Text> getAll();

    @Query("SELECT * FROM texts where id = (:id)")
    Text getById(int id);

    @Insert
    long insert(Text text);

    @Query("DELETE FROM texts")
    void nudeTable();
}
