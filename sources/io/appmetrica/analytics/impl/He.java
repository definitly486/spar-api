package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class He implements InterfaceC3658l9, Ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3532g7 f45911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f45912b;

    public He(C3532g7 c3532g7) {
        this.f45911a = c3532g7;
        this.f45912b = new AtomicLong(c3532g7.b());
        c3532g7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void a(List<Integer> list) {
        this.f45912b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void b(List<Integer> list) {
        this.f45912b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3658l9
    public final void a() {
        this.f45912b.set(this.f45911a.b());
    }

    public final long b() {
        return this.f45912b.get();
    }
}
