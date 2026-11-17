package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class BarometerSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public BarometerSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 6, i13);
    }

    private static native void barometerUnavailable(NativeObject nativeObject);

    public static boolean isBarometerAvailable() {
        return SensorSubscription.isSensorAvailable(6);
    }

    private static native void pressureChanged(NativeObject nativeObject, float f13, int i13, long j13);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        pressureChanged(this.nativeObject, sensorEvent.values[0], sensorEvent.accuracy, TimeHelpers.eventAgeMilliseconds(sensorEvent));
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        barometerUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
