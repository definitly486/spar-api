package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Qi implements InterfaceC3951x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3951x3 f46428b;

    public Qi(Object obj, InterfaceC3951x3 interfaceC3951x3) {
        this.f46427a = obj;
        this.f46428b = interfaceC3951x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3951x3
    public final int getBytesTruncated() {
        return this.f46428b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f46427a + ", metaInfo=" + this.f46428b + '}';
    }
}
