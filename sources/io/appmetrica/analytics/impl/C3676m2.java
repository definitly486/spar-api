package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3676m2 implements InterfaceC3843sk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f47690a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f47691b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f47692c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f47693d = new CopyOnWriteArraySet();

    public final void a(int i13) {
        this.f47690a.remove(Integer.valueOf(i13));
        a();
    }

    public final void b(int i13) {
        this.f47691b.add(Integer.valueOf(i13));
        this.f47690a.remove(Integer.valueOf(i13));
        a();
    }

    public final void c(int i13) {
        this.f47690a.add(Integer.valueOf(i13));
        this.f47691b.remove(Integer.valueOf(i13));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f47692c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onDestroy() {
        if (this.f47692c == ApplicationState.VISIBLE) {
            this.f47692c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f47693d.add(applicationStateObserver);
        }
        return this.f47692c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f47690a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f47691b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f47692c != applicationState) {
            this.f47692c = applicationState;
            Iterator it = this.f47693d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f47692c);
            }
        }
    }
}
