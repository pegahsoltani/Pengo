package com.example.pengout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeActivity extends AppCompatActivity {


    Button buttonGoChat;

    DatabaseReference databaseUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("inHomeActivity", "inHomeActivity:success");
        setContentView(R.layout.activity_home);

        //getting the reference of artists node
        databaseUsers = FirebaseDatabase.getInstance().getReference("users");

        //getting chat button
        buttonGoChat =  findViewById(R.id.buttonGoChat);


        //adding an onclicklistener to button
        buttonGoChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //calling the method addArtist()
                //the method is defined below
                //this method is actually performing the write operation
                Intent intent = new Intent(getApplicationContext(), ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
