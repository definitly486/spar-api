package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f48669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f48670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f48671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f48672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f48673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f48675h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f48676i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Location f48677j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f48668a = context;
        this.f48670c = pVar;
        this.f48669b = permissionExtractor;
        this.f48671d = iHandlerExecutor;
        this.f48672e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f48673f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f48670c.f48688b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f48675h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location locationA;
        locationA = this.f48677j;
        if (locationA == null) {
            locationA = a();
        }
        return locationA;
    }

    public final synchronized void d() {
        try {
            this.f48673f.startUpdates();
            Iterator it = this.f48676i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e() {
        this.f48673f.stopUpdates();
        Iterator it = this.f48676i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f48674g) {
            this.f48674g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f48674g) {
            this.f48674g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f48675h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f48676i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f48674g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f48671d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f48668a, this.f48669b, this.f48671d, this.f48672e);
        this.f48675h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f48674g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f48677j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f48668a, this.f48669b, this.f48671d, this.f48672e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f48676i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f48674g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.f48677j = location;
        }
    }
}
