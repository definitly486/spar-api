package com.yandex.runtime.connectivity.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import com.yandex.runtime.connectivity.ConnectivityStatus;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectivitySubscription extends BroadcastReceiver {
    public static final String ACTION_CONNECTIVITY_CHANGED = "com.yandex.runtime.internal.CONNECTIVITY_CHANGED";
    private static final String ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED = "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED";
    private static final String TAG = "com.yandex.runtime.connectivity.internal.ConnectivitySubscription";
    private NativeObject nativePromise;
    private ConnectivityManager.NetworkCallback networkCallback;
    private boolean isRegistered = false;
    private ConnectivityManager connectivityManager = (ConnectivityManager) Runtime.getApplicationContext().getSystemService("connectivity");
    private Object jobScheduler = Runtime.getApplicationContext().getSystemService("jobscheduler");

    /* JADX INFO: Access modifiers changed from: private */
    public ConnectivityManager.NetworkCallback getNetworkCallback() {
        return new ConnectivityManager.NetworkCallback() { // from class: com.yandex.runtime.connectivity.internal.ConnectivitySubscription.3
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                ConnectivitySubscription connectivitySubscription = ConnectivitySubscription.this;
                connectivitySubscription.update(connectivitySubscription.status(networkCapabilities));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ConnectivitySubscription connectivitySubscription = ConnectivitySubscription.this;
                connectivitySubscription.update(connectivitySubscription.status(null));
            }
        };
    }

    static native void submit(NativeObject nativeObject, ConnectivityStatus connectivityStatus);

    /* JADX INFO: Access modifiers changed from: private */
    public void update(ConnectivityStatus connectivityStatus) {
        try {
            submit(this.nativePromise, connectivityStatus);
        } catch (UnsatisfiedLinkError e13) {
            Log.e(TAG, "Native libraries not loaded: " + e13.getMessage());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        ConnectivityStatus connectivityStatusStatus = status();
        update(connectivityStatusStatus);
        if ((action == ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED || action == "android.os.action.DEVICE_IDLE_MODE_CHANGED") && connectivityStatusStatus == ConnectivityStatus.NONE) {
            try {
                ((JobScheduler) this.jobScheduler).schedule(new JobInfo.Builder(4105, new ComponentName(Runtime.getApplicationContext(), (Class<?>) ConnectivityService.class)).setRequiredNetworkType(1).build());
            } catch (IllegalArgumentException e13) {
                Log.e(TAG, "Failed to schedule job", e13);
            }
        }
    }

    public ConnectivityStatus status() {
        Network activeNetwork = this.connectivityManager.getActiveNetwork();
        return activeNetwork == null ? ConnectivityStatus.NONE : status(this.connectivityManager.getNetworkCapabilities(activeNetwork));
    }

    public void subscribe(NativeObject nativeObject) {
        this.nativePromise = nativeObject;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.connectivity.internal.ConnectivitySubscription.1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                intentFilter.addAction(ConnectivitySubscription.ACTION_LIGHT_DEVICE_IDLE_MODE_CHANGED);
                try {
                    ConnectivitySubscription connectivitySubscription = ConnectivitySubscription.this;
                    connectivitySubscription.networkCallback = connectivitySubscription.getNetworkCallback();
                    ConnectivitySubscription.this.connectivityManager.registerDefaultNetworkCallback(ConnectivitySubscription.this.networkCallback);
                    Runtime.getApplicationContext().registerReceiver(ConnectivitySubscription.this, intentFilter, 4);
                    ConnectivitySubscription.this.isRegistered = true;
                    ConnectivitySubscription connectivitySubscription2 = ConnectivitySubscription.this;
                    connectivitySubscription2.update(connectivitySubscription2.status());
                } catch (SecurityException e13) {
                    Log.e(ConnectivitySubscription.TAG, "Cannot register receiver", e13);
                }
            }
        });
    }

    public void unsubscribe() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.connectivity.internal.ConnectivitySubscription.2
            @Override // java.lang.Runnable
            public void run() {
                if (ConnectivitySubscription.this.isRegistered) {
                    Runtime.getApplicationContext().unregisterReceiver(ConnectivitySubscription.this);
                    if (ConnectivitySubscription.this.networkCallback != null) {
                        ConnectivitySubscription.this.connectivityManager.unregisterNetworkCallback(ConnectivitySubscription.this.networkCallback);
                        ConnectivitySubscription.this.networkCallback = null;
                    }
                    ConnectivitySubscription.this.isRegistered = false;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConnectivityStatus status(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(2)) {
                return ConnectivityStatus.BROADBAND;
            }
            return ConnectivityStatus.CELLULAR;
        }
        return ConnectivityStatus.NONE;
    }
}
