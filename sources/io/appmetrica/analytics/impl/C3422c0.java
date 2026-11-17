package io.appmetrica.analytics.impl;

import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3422c0 implements InterfaceC4021zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3448d0 f47000a;

    public C3422c0(C3448d0 c3448d0) {
        this.f47000a = c3448d0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final Thread a() {
        return this.f47000a.f47058b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final StackTraceElement[] b() {
        C3448d0 c3448d0 = this.f47000a;
        return (StackTraceElement[]) c3448d0.f47057a.get(c3448d0.f47058b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f47000a.f47057a;
    }
}
