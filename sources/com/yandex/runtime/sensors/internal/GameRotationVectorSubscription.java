package com.yandex.runtime.sensors.internal;

import android.hardware.SensorEvent;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class GameRotationVectorSubscription implements SensorDataConsumer {
    private NativeObject nativeObject;
    private SensorSubscription sensorSubscription;

    public GameRotationVectorSubscription(NativeObject nativeObject, int i13) {
        this.nativeObject = nativeObject;
        this.sensorSubscription = new SensorSubscription(this, 15, i13);
    }

    private static native void gameRotationVectorChanged(NativeObject nativeObject, float f13, float f14, float f15, int i13, long j13);

    private static native void gameRotationVectorUnavailable(NativeObject nativeObject);

    public static boolean isGameRotationVectorAvailable() {
        return SensorSubscription.isSensorAvailable(15);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void consume(SensorEvent sensorEvent) {
        long jEventAgeMilliseconds = TimeHelpers.eventAgeMilliseconds(sensorEvent);
        NativeObject nativeObject = this.nativeObject;
        float[] fArr = sensorEvent.values;
        gameRotationVectorChanged(nativeObject, fArr[0], fArr[1], fArr[2], sensorEvent.accuracy, jEventAgeMilliseconds);
    }

    @Override // com.yandex.runtime.sensors.internal.SensorDataConsumer
    public void sensorUnavailable() {
        gameRotationVectorUnavailable(this.nativeObject);
    }

    public void stop() {
        this.sensorSubscription.stop();
    }
}
