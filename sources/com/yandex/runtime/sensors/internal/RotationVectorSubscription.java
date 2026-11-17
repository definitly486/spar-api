package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class RotationVectorSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public RotationVectorSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 11, i13);
    }

    public static boolean isRotationVectorAvailable() {
        return SensorSubscription.isSensorAvailable(11);
    }

    private static native void rotationVectorChanged(NativeObject nativeObject, float f13, float f14, float f15, int i13, long j13);

    private static native void rotationVectorChangedScalar(NativeObject nativeObject, float f13, float f14, float f15, float f16, int i13, long j13);

    private static native void rotationVectorUnavailable(NativeObject nativeObject);

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        float[] fArr = sensorEvent.values;
        if (fArr.length == 3) {
            rotationVectorChanged(this.nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, jEventAgeMilliseconds);
        } else {
            rotationVectorChangedScalar(this.nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], sensorEvent.accuracy, jEventAgeMilliseconds);
        }
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        rotationVectorUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
