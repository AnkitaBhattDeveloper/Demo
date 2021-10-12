package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Progress_bar extends AppCompatActivity {
 Button button;
 private ProgressDialog progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
   button = findViewById(R.id.button);
    }

    public void download(View view)
    {
progress=new ProgressDialog(this);
progress.setMessage("Download music");
progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
progress.setIndeterminate(true);
progress.setProgress(0);
progress.show();

int progresstime = 100;
Thread t = new Thread(){
    @Override
    public void run() {
       int jtime=0;
       while (jtime<progresstime)
       {
           try {
               sleep(200);
               jtime += 5;
               progress.setProgress(jtime);


           }
           catch (Exception e){
            e.printStackTrace();
           }
       }


    }
};
 t.start();

    }
}