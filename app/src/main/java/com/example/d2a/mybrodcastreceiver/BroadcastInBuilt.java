package com.example.d2a.mybrodcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadcastInBuilt extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Battery getting low, please charge..",Toast.LENGTH_LONG).show();
    }
}
