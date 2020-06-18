package com.example.sqliteproject;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.util.Log;

import com.example.sqliteproject.data.MyDbHandler;
import com.example.sqliteproject.model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db=new MyDbHandler ( this );


        //adding contact to db
        Contact kuldeep = new Contact();
        kuldeep.setPhoneNumber("565644646");
        kuldeep.setName("kdskdkwd");
//
        db.addContact ( kuldeep );

//        //adding contact to db
//        Contact rudra = new Contact();
//       rudra.setPhoneNumber("88888846");
//        rudra.setName("hjg");
//
//        db.addContact(rudra);
//
//        //adding contact to db
//        Contact om= new Contact();
//        om.setPhoneNumber("646");
//        om.setName("ommmmmmmmmmmmmmmmmm");
//        db.addContact(om);
//
////        //creating contact to db
//
//
//
//
//
//        Log.d("kuldeep db","main activity sucessfully built");
    }
}
