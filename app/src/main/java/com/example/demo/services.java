package com.example.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class services extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("mytag", "onStartService stopped" + Thread.currentThread().getId());
        stopSelf();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("mytag", "onStartService is working properly" + Thread.currentThread().getId());
//        stopSelf();
        
        
        return super.onStartCommand(intent, flags, startId);
    }

}
