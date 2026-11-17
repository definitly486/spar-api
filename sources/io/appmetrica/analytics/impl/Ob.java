package io.appmetrica.analytics.impl;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Ob implements InterfaceC3433cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3433cb f46329a;

    public Ob(InterfaceC3433cb interfaceC3433cb) {
        this.f46329a = interfaceC3433cb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, String str2) {
        this.f46329a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final void b() {
        this.f46329a.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final boolean getBoolean(String str, boolean z13) {
        return this.f46329a.getBoolean(str, z13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final int getInt(String str, int i13) {
        return this.f46329a.getInt(str, i13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final long getLong(String str, long j13) {
        return this.f46329a.getLong(str, j13);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final String getString(String str, String str2) {
        return this.f46329a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb remove(String str) {
        this.f46329a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, long j13) {
        this.f46329a.a(str, j13);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(int i13, String str) {
        this.f46329a.a(i13, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, boolean z13) {
        this.f46329a.a(str, z13);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final InterfaceC3433cb a(String str, float f13) {
        this.f46329a.a(str, f13);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final boolean a(String str) {
        return this.f46329a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3433cb
    public final Set a() {
        return this.f46329a.a();
    }
}
