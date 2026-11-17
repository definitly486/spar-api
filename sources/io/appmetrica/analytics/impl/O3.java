package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class O3 implements InterfaceC3607j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N3 f46303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46304b;

    public O3(N3 n13, List<N3> list) {
        this.f46303a = n13;
        this.f46304b = list;
    }

    public final O3 a(N3 n13, List<N3> list) {
        return new O3(n13, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3607j8
    public final Object b() {
        return this.f46303a;
    }

    public final N3 c() {
        return this.f46303a;
    }

    public final List<N3> d() {
        return this.f46304b;
    }

    public final N3 e() {
        return this.f46303a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return false;
        }
        O3 o13 = (O3) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f46303a, o13.f46303a) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f46304b, o13.f46304b);
    }

    public final int hashCode() {
        return this.f46304b.hashCode() + (this.f46303a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f46303a + ", candidates=" + this.f46304b + ')';
    }

    public static O3 a(O3 o13, N3 n13, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            n13 = o13.f46303a;
        }
        if ((i13 & 2) != 0) {
            list = o13.f46304b;
        }
        o13.getClass();
        return new O3(n13, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3607j8
    public final List<N3> a() {
        return this.f46304b;
    }
}
