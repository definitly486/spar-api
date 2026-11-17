package com.yandex.mapkit.traffic;

/* JADX INFO: loaded from: classes3.dex */
public interface TrafficLayer {
    void addTrafficListener(TrafficListener trafficListener);

    boolean isTrafficVisible();

    boolean isValid();

    void removeTrafficListener(TrafficListener trafficListener);

    void resetTrafficStyles();

    boolean setTrafficStyle(int i13, String str);

    boolean setTrafficStyle(String str);

    void setTrafficVisible(boolean z13);
}
