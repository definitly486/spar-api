package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nd extends AbstractC3664lf implements InterfaceC3894ul {
    public Nd(InterfaceC3433cb interfaceC3433cb, String str) {
        super(interfaceC3433cb, str);
    }

    public final String c(String str, String str2) {
        return this.f47658a.getString(f(str), str2);
    }

    public final InterfaceC3894ul d(String str, String str2) {
        return (InterfaceC3894ul) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f47658a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC3894ul g(String str) {
        return (InterfaceC3894ul) d(f(str));
    }

    public Nd(InterfaceC3433cb interfaceC3433cb) {
        this(interfaceC3433cb, null);
    }

    public final InterfaceC3894ul d(String str, int i13) {
        return (InterfaceC3894ul) b(f(str), i13);
    }

    public final int c(String str, int i13) {
        return this.f47658a.getInt(f(str), i13);
    }

    public final InterfaceC3894ul d(String str, long j13) {
        return (InterfaceC3894ul) b(f(str), j13);
    }

    public final InterfaceC3894ul d(String str, boolean z13) {
        return (InterfaceC3894ul) b(f(str), z13);
    }

    public final long c(String str, long j13) {
        return this.f47658a.getLong(f(str), j13);
    }

    public final boolean c(String str, boolean z13) {
        return this.f47658a.getBoolean(f(str), z13);
    }
}
