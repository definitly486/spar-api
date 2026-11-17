package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Jn implements InterfaceC3951x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3951x3 f46117b;

    public Jn(Object obj, InterfaceC3951x3 interfaceC3951x3) {
        this.f46116a = obj;
        this.f46117b = interfaceC3951x3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3951x3
    public final int getBytesTruncated() {
        return this.f46117b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f46116a + ", metaInfo=" + this.f46117b + '}';
    }
}
