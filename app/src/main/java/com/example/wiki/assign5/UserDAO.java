package com.example.wiki.assign5;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("Select * from User")
    List<User> showAll();

    @Query("Select * from user where first_name like :firstName and last_name like :lastName")
            User findByName(String firstName, String lastName);

    @Insert
    void insertAll(User users);

    @Delete
    void delete(User user);
}
