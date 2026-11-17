package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class MagnetometerUncalibratedSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public MagnetometerUncalibratedSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 14, i13);
    }

    public static boolean isMagnetometerUncalibratedAvailable() {
        return SensorSubscription.isSensorAvailable(14);
    }

    private static native void magnetometerUncalibratedChanged(NativeObject nativeObject, float f13, float f14, float f15, float f16, float f17, float f18, int i13, long j13);

    private static native void magnetometerUncalibratedUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        magnetometerUncalibratedChanged(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], sensorEvent.accuracy, jEventAgeMilliseconds);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        magnetometerUncalibratedUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
