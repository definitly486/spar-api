package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3538gd implements InterfaceC3747on {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f47330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CellularNetworkTypeExtractor f47331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CachedDataProvider.CachedData f47332d;

    public C3538gd(Context context) {
        this.f47329a = context;
        this.f47330b = AndroidUtils.isApiAchieved(29) ? new SinglePermissionStrategy(Ia.j().i(), "android.permission.READ_PHONE_STATE") : new AlwaysAllowPermissionStrategy();
        this.f47331c = new CellularNetworkTypeExtractor(context);
        long millis = TimeUnit.SECONDS.toMillis(20L);
        this.f47332d = new CachedDataProvider.CachedData(millis, millis * ((long) 2), "mobile-connection");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3747on
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized C3512fd a() {
        C3512fd c3512fd;
        try {
            c3512fd = (C3512fd) this.f47332d.getData();
            if (c3512fd == null || this.f47332d.shouldUpdateData()) {
                c3512fd = new C3512fd(this.f47330b.hasNecessaryPermissions(this.f47329a) ? this.f47331c.getNetworkType() : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                this.f47332d.setData(c3512fd);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c3512fd;
    }
}
