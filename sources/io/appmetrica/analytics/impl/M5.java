package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class M5 implements InterfaceC3687md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46226a;

    public M5(String str) {
        this.f46226a = str;
    }

    public final M5 a(String str) {
        return new M5(str);
    }

    public final String b() {
        return this.f46226a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M5) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f46226a, ((M5) obj).f46226a);
    }

    public final int hashCode() {
        return this.f46226a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f46226a + ')';
    }

    public static M5 a(M5 m13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = m13.f46226a;
        }
        m13.getClass();
        return new M5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3687md
    public final String a() {
        return this.f46226a;
    }
}
