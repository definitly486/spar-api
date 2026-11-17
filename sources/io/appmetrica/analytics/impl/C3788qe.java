package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3788qe implements po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47921a;

    public C3788qe(String str) {
        this.f47921a = str;
    }

    @Override // io.appmetrica.analytics.impl.po
    public final no a(Object obj) {
        if (obj != null) {
            return new no(this, true, "");
        }
        return new no(this, false, this.f47921a + " is null.");
    }

    public final String a() {
        return this.f47921a;
    }
}
