package com.example.wiki.assign5;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    private int userId;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "age")
    private int age;

    public int getUserId()
    {
        return userId;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setUserId(int userId1)
    {
        userId = userId1;
    }
    public  void setFirstName(String firstName1)
    {
        firstName = firstName1;
    }
    public void setLastName(String lastName1)
    {
        lastName = lastName1;
    }
    public void setAge(int age1)
    {
        age = age1;
    }
}
