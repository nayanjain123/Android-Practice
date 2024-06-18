package com.nayan.musicplayerapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;


public class MyCustomService extends Service {

    //MediaPLayer Object
    private MediaPlayer player;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
                player=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
                player.setLooping(true);
                player.start();

                return START_STICKY;//service shld be restarted manually after being temporarily killed eg: syncing data backup to cloud periodically
        //START_NOT_STICKY - service remains stopped until triggered by action eg: notification sound
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        //used to establish connection bw component and service
        return null;
    }
}
