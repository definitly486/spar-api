package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3571hl implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3873u0 f47406a;

    public C3571hl(C3873u0 c3873u0) {
        this.f47406a = c3873u0;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(Void r13) {
        boolean z13;
        this.f47406a.getClass();
        synchronized (C3848t0.class) {
            z13 = C3848t0.f48088f;
        }
        return z13 ? new no(this, true, "") : new no(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final no a() {
        return a((Void) null);
    }
}
