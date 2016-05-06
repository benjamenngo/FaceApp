package theoneandonly.com.faceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//This is the splash activity that will run before the main activity
public class SplashActivity extends AppCompatActivity {

    @Override
    //overriding the onCreate Method
    protected void onCreate(Bundle savedInstanceState) {
        //calling on the parent's class's onCreateMethod
        super.onCreate(savedInstanceState);
//Creating an Intent Object and passing in the MainActivity class
        Intent intent = new Intent(this, MainActivity.class);
        //startActivity of the intent, which is the main Activity
        startActivity(intent);
        //Finish this activity
        finish();
    }
}