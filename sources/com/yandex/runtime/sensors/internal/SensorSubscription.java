package com.yandex.runtime.sensors.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.yandex.runtime.Runtime;

/* JADX INFO: loaded from: classes3.dex */
public class SensorSubscription implements SensorEventListener {
    private static final int nanoSecsInMilli = 1000000;
    private SensorDataConsumer dataConsumer;
    private SensorManager manager;
    private long prevPublishedEventTime = 0;
    private int sensorDelay;
    private int sensorType;

    public SensorSubscription(SensorDataConsumer sensorDataConsumer, int i13, int i14) {
        this.sensorDelay = i14;
        this.sensorType = i13;
        this.dataConsumer = sensorDataConsumer;
        try {
            this.manager = getSensorManager();
        } catch (RuntimeException unused) {
            stop();
            this.dataConsumer.sensorUnavailable();
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.SensorSubscription.1
            @Override // java.lang.Runnable
            public void run() {
                SensorSubscription.this.start();
            }
        });
    }

    private static SensorManager getSensorManager() {
        SensorManager sensorManager = (SensorManager) Runtime.getApplicationContext().getSystemService("sensor");
        if (sensorManager != null) {
            return sensorManager;
        }
        throw new RuntimeException("Can't get SensorManager.");
    }

    public static boolean isSensorAvailable(int i13) {
        try {
            return getSensorManager().getDefaultSensor(i13) != null;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start() {
        Sensor defaultSensor = this.manager.getDefaultSensor(this.sensorType);
        if (defaultSensor != null) {
            this.manager.registerListener(this, defaultSensor, this.sensorDelay * 1000);
        } else {
            stop();
            this.dataConsumer.sensorUnavailable();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j13 = sensorEvent.timestamp;
        if ((j13 - this.prevPublishedEventTime) / 1000000 >= this.sensorDelay) {
            this.prevPublishedEventTime = j13;
            this.dataConsumer.consume(sensorEvent);
        }
    }

    public void stop() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.yandex.runtime.sensors.internal.SensorSubscription.2
            @Override // java.lang.Runnable
            public void run() {
                SensorSubscription.this.manager.unregisterListener(SensorSubscription.this);
            }
        });
    }
}
