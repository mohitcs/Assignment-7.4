package com.example.mohit.ass74;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Mohit on 05/12/2017.
 */

public class Activity2 extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intentObject = getIntent();
        String userNameBundle=intentObject.getExtras().getString("BundleUserName");
       Toast.makeText(getApplicationContext(),"Welcome in new screen by bundle method : " + userNameBundle,  Toast.LENGTH_LONG).show();
    }

}
