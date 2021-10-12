package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
 Button startService,stopService;
private Intent serviceintent;

    String[] language={"C","C++","Java","Python","Kotlin","JavaScript","Django"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        startService= findViewById(R.id.startService);
        stopService=findViewById(R.id.stopService);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,language);
        actv = findViewById(R.id.autoCompleteTextView);

        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.BLUE);

        Log.d("mytag", "on service command is working properly "+ Thread.currentThread().getId());
        serviceintent = new Intent(getApplicationContext(), services.class);

     startService.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
              startService(serviceintent);
         }
     });
        stopService.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        stopService(serviceintent);
    }
      });


    }
  public  void pro(View view)
  {
      Intent intent = new Intent(getApplicationContext(),Progress_bar.class);
      startActivity(intent);
  }
    public  void frag(View view)
    {
        Intent intent = new Intent(getApplicationContext(), Fragmentlife.class);
        startActivity(intent);
    }



}