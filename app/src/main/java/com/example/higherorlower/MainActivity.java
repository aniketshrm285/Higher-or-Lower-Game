package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int myNumber=1+rand.nextInt(20);
    public void clickFunc(View view){

        Log.i("Info","Button Pressed!!");
        EditText editText = (EditText) findViewById(R.id.editText2);
        int num=Integer.parseInt(editText.getText().toString());
        if(num==myNumber){
            Toast.makeText(this, "Absolutely Correct!! Try guessing a new number !! ", Toast.LENGTH_SHORT).show();
            myNumber=1+rand.nextInt(20);
        }
        else if(num<myNumber){
            Toast.makeText(this, "Bad Luck !! Go Higher.", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Bad Luck !! Go Lower.", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
