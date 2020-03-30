package com.example.taskazcar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlarmManager     alarmManager= (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent   alarmIntent = new Intent(getApplicationContext(), mBroadCastReceiver.class);
        PendingIntent     pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, alarmIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),1000 * 60 * 1, pendingIntent);
    }
}
