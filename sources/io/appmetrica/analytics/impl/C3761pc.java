package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3761pc implements PermissionStrategy, LocationControllerObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3736oc f47875b = new C3736oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f47876c = hg.jyumaefscl.rgvfuqvkyq("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f47877a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f47876c.contains(str)) {
            return !this.f47877a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f47877a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f47877a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f47877a + ", locationPermissions=" + f47876c + ')';
    }
}
