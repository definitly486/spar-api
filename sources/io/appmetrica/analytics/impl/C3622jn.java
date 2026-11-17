package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3622jn implements InterfaceC3843sk, Q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Za f47570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Kl f47571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f47572c = new AtomicBoolean(false);

    public C3622jn(Za za3, Kl kl2) {
        this.f47570a = za3;
        this.f47571b = kl2;
        Objects.toString(za3.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f47572c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f47572c.get()) {
            return;
        }
        f();
        a();
    }

    public final Za d() {
        return this.f47570a;
    }

    public final boolean e() {
        return this.f47572c.get();
    }

    public void f() {
        this.f47571b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onCreate() {
        this.f47572c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3843sk
    public final void onDestroy() {
        if (this.f47572c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(NetworkTask networkTask) {
        Ia.F.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
