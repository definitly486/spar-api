package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class LinearAccelerationSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public LinearAccelerationSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 10, i13);
    }

    public static boolean isLinearAccelerationAvailable() {
        return SensorSubscription.isSensorAvailable(10);
    }

    private static native void linearAccelerationChanged(NativeObject nativeObject, float f13, float f14, float f15, int i13, long j13);

    private static native void linearAccelerationUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        linearAccelerationChanged(nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, jEventAgeMilliseconds);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        linearAccelerationUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
