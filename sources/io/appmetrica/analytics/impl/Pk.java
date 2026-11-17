package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Wk f46398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f46399b;

    public Pk(Wk wk2) {
        this.f46398a = wk2;
    }

    public final Qk a() {
        return new Qk(this);
    }

    public final Pk b() {
        this.f46399b = 3600;
        return this;
    }
}
