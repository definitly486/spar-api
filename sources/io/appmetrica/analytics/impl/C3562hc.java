package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3562hc implements InterfaceC3511fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Je f47385a = new Je();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pb f47386b = new Pb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3810rc f47387c = new C3810rc();

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void b(Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f47386b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f47387c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f47385a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void init() {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(Object obj) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(boolean z13) {
    }
}
