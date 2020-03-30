package com.example.taskazcar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;

public class mBroadCastReceiver extends BroadcastReceiver {

    MediaPlayer selectedSound;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("receive","Don");

        Log.i("onReceive","print");
        selectedSound = (MediaPlayer) MediaPlayer.create(context, R.raw.a1);
        selectedSound.start();
    }
}
