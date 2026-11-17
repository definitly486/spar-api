package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends u implements LocationReceiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f48694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48695f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f48694e = looper;
        this.f48695f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final wwaezpbzkn a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f48704d, rVar.f48695f, 0.0f, rVar.f48703c, rVar.f48694e);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final wwaezpbzkn b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f48703c);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f48702b.hasNecessaryPermissions(this.f48701a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f48701a, "location", "request location updates for " + this.f48704d + " provider", "location manager", new FunctionWithThrowable() { // from class: bg.zoijcleaow
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(this.f16094iobyxmoadg, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f48701a, "location", "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: bg.iobyxmoadg
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(this.f16092iobyxmoadg, (LocationManager) obj);
            }
        });
    }
}
