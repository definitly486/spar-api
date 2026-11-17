package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: loaded from: classes3.dex */
public final class Dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45641a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3472e f45642b;

    public Dc(InterfaceC3473e0 interfaceC3473e0) {
        this.f45642b = new C3472e(new Yb(interfaceC3473e0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C3472e c3472e = this.f45642b;
        c3472e.f47138a.add(new InterfaceC3421c() { // from class: io.appmetrica.analytics.impl.zoijcleaow
            @Override // io.appmetrica.analytics.impl.InterfaceC3421c
            public final void onAppNotResponding() {
                Dc.b(anrListener);
            }
        });
    }
}
