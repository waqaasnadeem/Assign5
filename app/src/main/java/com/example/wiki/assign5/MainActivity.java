package com.example.wiki.assign5;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.AsyncTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.add_user_btn);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void... voids) {
                        populateWithTestData(AppDatabase.getINSTANCE(getApplicationContext()));
                        return null;
                    }
                }.execute();


                Intent intent = new Intent(view.getContext(), ShowUsersActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }
    public static User addUser(final AppDatabase db, User user)
    {
        db.userDAO().insertAll(user);
        return user;
    }
    private  static void populateWithTestData(AppDatabase db)
    {
        User user1 = new User();
        User user2 = new User();

        user1.setFirstName("Waqas");
        user1.setLastName("Nadeem");
        user1.setAge(23);

        user2.setFirstName("Saqib");
        user2.setLastName("Ali");
        user2.setAge(23);

        addUser(db,user1);
        addUser(db,user2);

    }
}
