package com.example.mohit.ass74;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public EditText txtusername;
    public EditText txtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btnlogin = (Button) findViewById(R.id.btnlogin);
        txtusername = (EditText) findViewById(R.id.txtusername);
        txtpassword = (EditText) findViewById(R.id.txtpassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

               Intent openNewActivity = new Intent(getApplicationContext(), Activity2.class);

                String displaytext = txtusername.getText().toString();

                 Bundle dataBundle = new Bundle();
                 dataBundle.putString("BundleUserName", "Welcome :" + displaytext);

                 openNewActivity.putExtras(dataBundle);
                 openNewActivity.putExtra("data", dataBundle);

                startActivity(openNewActivity);
            }
        });
    }





}
