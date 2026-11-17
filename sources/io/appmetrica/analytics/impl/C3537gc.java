package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3537gc implements InterfaceC3511fc, InterfaceC3646km, LocationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3636kc f47323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationClient f47324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3869tl f47325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3993yk f47326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f47327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f47328g;

    public C3537gc(Context context, InterfaceC3636kc interfaceC3636kc, LocationClient locationClient) {
        this.f47322a = context;
        this.f47323b = interfaceC3636kc;
        this.f47324c = locationClient;
        C3761pc c3761pc = new C3761pc();
        this.f47325d = new C3869tl(new E5(c3761pc, Ia.j().o().getAskForPermissionStrategy()));
        this.f47326e = Ia.j().o();
        ((C3711nc) interfaceC3636kc).a(c3761pc, true);
        ((C3711nc) interfaceC3636kc).a(locationClient, true);
        this.f47327f = locationClient.getLastKnownExtractorProviderFactory();
        this.f47328g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3646km
    public final void a(C3521fm c3521fm) {
        C4001z3 c4001z3 = c3521fm.f47252y;
        if (c4001z3 != null) {
            long j13 = c4001z3.f48548a;
            this.f47324c.updateCacheArguments(new CacheArguments(j13, ((long) 2) * j13));
        }
    }

    public final C3869tl b() {
        return this.f47325d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f47327f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f47328g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f47325d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f47324c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f47324c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void init() {
        this.f47324c.init(this.f47322a, this.f47325d, Ia.F.f46007d.c(), this.f47326e.e());
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceControllerF = this.f47326e.f();
        if (moduleLocationSourcesServiceControllerF != null) {
            moduleLocationSourcesServiceControllerF.init();
        } else {
            LocationClient locationClient = this.f47324c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f47324c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C3711nc) this.f47323b).a(this.f47326e.g());
        Ia.F.f46024u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((C3711nc) this.f47323b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f47324c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f47324c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f47324c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void b(Object obj) {
        ((C3711nc) this.f47323b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f47324c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f47324c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(Object obj) {
        ((C3711nc) this.f47323b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(boolean z13) {
        ((C3711nc) this.f47323b).a(z13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3511fc, io.appmetrica.analytics.impl.InterfaceC3587ic
    public final void a(Location location) {
        this.f47324c.updateUserLocation(location);
    }
}
