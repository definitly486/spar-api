package com.yandex.runtime.sensors.internal;

import android.location.Location;
import com.yandex.runtime.NativeObject;

/* JADX INFO: loaded from: classes3.dex */
public class NativeLocationSubscriptionWrapper {
    private final NativeObject nativeSubscription;

    public NativeLocationSubscriptionWrapper(NativeObject nativeObject) {
        this.nativeSubscription = nativeObject;
    }

    private static native void onLocationReceived(NativeObject nativeObject, double d13, double d14, boolean z13, double d15, boolean z14, double d16, boolean z15, double d17, boolean z16, double d18, boolean z17, double d19, long j13);

    private static native void onStatusReceived(NativeObject nativeObject, boolean z13);

    public void onLocationReceived(Location location) {
        onLocationReceived(this.nativeSubscription, location.getLatitude(), location.getLongitude(), location.hasAccuracy(), location.getAccuracy(), location.hasAltitude(), location.getAltitude(), location.hasVerticalAccuracy(), location.getVerticalAccuracyMeters(), location.hasSpeed(), location.getSpeed(), location.hasBearing(), location.getBearing(), TimeHelpers.locationAgeMilliseconds(location));
    }

    public void onStatusReceived(boolean z13) {
        onStatusReceived(this.nativeSubscription, z13);
    }
}
