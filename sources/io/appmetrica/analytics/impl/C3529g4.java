package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3529g4 implements InterfaceC3454d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3531g6 f47279b = new C3531g6(new D5());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3977y4 f47280c = new C3977y4(C3952x4.l().b(getContext()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3909vb f47281d = new C3909vb();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3698n f47282e = C3952x4.l().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3477e4 f47283f = new C3477e4();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3662ld f47284g = new C3662ld();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3503f4 f47285h = new C3503f4();

    public C3529g4(Context context) {
        this.f47278a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.f47282e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientActivator getClientActivator() {
        return this.f47283f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.f47284g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f47280c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f47278a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.f47281d;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3454d6, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InterfaceC3505f6 getModuleAdRevenueContext() {
        return this.f47279b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ProcessDetector getProcessDetector() {
        return this.f47285h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f47279b;
    }
}
