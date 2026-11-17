package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public class Gn implements Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45871c = 0;

    public Gn(int i13, int i14) {
        this.f45869a = i13;
        this.f45870b = i14;
    }

    public final int a() {
        return this.f45870b;
    }

    public final boolean b() {
        int i13 = this.f45871c;
        this.f45871c = i13 + 1;
        return i13 < this.f45869a;
    }

    public final void c() {
        this.f45871c = 0;
    }
}
