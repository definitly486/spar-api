package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class GyroscopeUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public GyroscopeUncalibratedSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 16, i13);
    }

    private static native void angularSpeedChanged(NativeObject nativeObject, float f13, float f14, float f15, float f16, float f17, float f18, int i13, long j13);

    private static native void gyroscopeUncalibratedUnavailable(NativeObject nativeObject);

    public static boolean isGyroscopeUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(16);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        angularSpeedChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, jEventAgeMilliseconds);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        gyroscopeUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
