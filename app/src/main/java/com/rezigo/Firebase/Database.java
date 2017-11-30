package com.rezigo.Firebase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Loys on 30/11/2017.
 */

public class Database {


    FirebaseDatabase database;
    DatabaseReference myRef;


    public void testDatabase(){

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("message");


        myRef.setValue("hello, World!");
    }
}
