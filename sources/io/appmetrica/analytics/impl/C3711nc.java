package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3711nc implements InterfaceC3636kc, ToggleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f47751a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f47752b = Ia.j().w().c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Hn f47753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47754d;

    public final void a(Toggle toggle) {
        Hn hn2 = new Hn(toggle);
        this.f47753c = hn2;
        hn2.f45952c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Hn hn2 = this.f47753c;
        if (hn2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("togglesHolder");
            hn2 = null;
        }
        hn2.f45951b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z13) {
        this.f47752b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.hcddaimhww
            @Override // java.lang.Runnable
            public final void run() {
                C3711nc.a(this.f47389zdlpuopuiu, z13);
            }
        });
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z13) {
        this.f47752b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.pkzmftpjix
            @Override // java.lang.Runnable
            public final void run() {
                C3711nc.a(this.f47891zdlpuopuiu, locationControllerObserver, z13);
            }
        });
    }

    public static final void a(C3711nc c3711nc, LocationControllerObserver locationControllerObserver, boolean z13) {
        c3711nc.f47751a.add(locationControllerObserver);
        if (z13) {
            if (c3711nc.f47754d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(C3711nc c3711nc, boolean z13) {
        if (c3711nc.f47754d != z13) {
            c3711nc.f47754d = z13;
            tg.draadjrbmk draadjrbmkVar = z13 ? C3661lc.f47653a : C3686mc.f47703a;
            Iterator it = c3711nc.f47751a.iterator();
            while (it.hasNext()) {
                draadjrbmkVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Hn hn2 = this.f47753c;
        if (hn2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("togglesHolder");
            hn2 = null;
        }
        hn2.f45951b.a(obj);
    }

    public final void a(boolean z13) {
        Hn hn2 = this.f47753c;
        if (hn2 == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("togglesHolder");
            hn2 = null;
        }
        hn2.f45950a.a(z13);
    }
}
