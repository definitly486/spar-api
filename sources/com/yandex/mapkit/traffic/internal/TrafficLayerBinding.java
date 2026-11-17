package com.yandex.mapkit.traffic.internal;

import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.traffic.TrafficListener;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* JADX INFO: loaded from: classes3.dex */
public class TrafficLayerBinding implements TrafficLayer {
    private final NativeObject nativeObject;
    protected Subscription<TrafficListener> trafficListenerSubscription = new Subscription<TrafficListener>(this) { // from class: com.yandex.mapkit.traffic.internal.TrafficLayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(TrafficListener trafficListener) {
            return TrafficLayerBinding.createTrafficListener(trafficListener);
        }
    };

    protected TrafficLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createTrafficListener(TrafficListener trafficListener);

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native void addTrafficListener(TrafficListener trafficListener);

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native boolean isTrafficVisible();

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native void removeTrafficListener(TrafficListener trafficListener);

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native void resetTrafficStyles();

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native boolean setTrafficStyle(int i13, String str);

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native boolean setTrafficStyle(String str);

    @Override // com.yandex.mapkit.traffic.TrafficLayer
    public native void setTrafficVisible(boolean z13);
}
