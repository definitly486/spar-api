package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class N3 implements InterfaceC3682m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3657l8 f46250b;

    public N3(Map<String, String> map, EnumC3657l8 enumC3657l8) {
        this.f46249a = map;
        this.f46250b = enumC3657l8;
    }

    public final N3 a(Map<String, String> map, EnumC3657l8 enumC3657l8) {
        return new N3(map, enumC3657l8);
    }

    public final Map<String, String> b() {
        return this.f46249a;
    }

    public final EnumC3657l8 c() {
        return this.f46250b;
    }

    public final Map<String, String> d() {
        return this.f46249a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N3)) {
            return false;
        }
        N3 n13 = (N3) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f46249a, n13.f46249a) && this.f46250b == n13.f46250b;
    }

    public final int hashCode() {
        Map map = this.f46249a;
        return this.f46250b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f46249a + ", source=" + this.f46250b + ')';
    }

    public static N3 a(N3 n13, Map map, EnumC3657l8 enumC3657l8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = n13.f46249a;
        }
        if ((i13 & 2) != 0) {
            enumC3657l8 = n13.f46250b;
        }
        n13.getClass();
        return new N3(map, enumC3657l8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3682m8
    public final EnumC3657l8 a() {
        return this.f46250b;
    }
}
