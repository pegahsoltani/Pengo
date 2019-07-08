package com.example.pengout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatActivity extends AppCompatActivity {

    DatabaseReference databaseUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("inHomeActivity", "inHomeActivity:success");
        setContentView(R.layout.activity_chat);

        //getting the reference of artists node
        databaseUsers = FirebaseDatabase.getInstance().getReference("users");
    }
}
