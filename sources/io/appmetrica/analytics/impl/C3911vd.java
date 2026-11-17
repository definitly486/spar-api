package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3911vd implements ModuleServiceLifecycleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1 f48239a;

    public C3911vd(Q1 q13) {
        this.f48239a = q13;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f48239a.b(new P1() { // from class: io.appmetrica.analytics.impl.ulzqkzuiru
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                C3911vd.a(moduleServiceLifecycleObserver, intent);
            }
        });
        this.f48239a.a(new P1() { // from class: io.appmetrica.analytics.impl.sopmlzcsov
            @Override // io.appmetrica.analytics.impl.P1
            public final void a(Intent intent) {
                C3911vd.b(moduleServiceLifecycleObserver, intent);
            }
        });
    }
}
