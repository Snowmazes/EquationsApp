package com.snowmaze.equationsapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface EquationDAO {

    @Insert(onConflict = REPLACE)
    void insert(Equation... equations);

    @Insert(onConflict = REPLACE)
    void insertAll(Iterable<Equation> iterable);

    @Delete
    void delete(Equation equation);

    @Query("DELETE FROM Equation")
    void clearTable();

    @Query("SELECT * FROM Equation")
    List<Equation> getAllEquations();

}
