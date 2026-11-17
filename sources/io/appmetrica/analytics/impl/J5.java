package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J5 implements InterfaceC3793qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BaseRequestConfig f46068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseRequestConfig.RequestConfigLoader f46069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3556h6 f46070c;

    public J5(BaseRequestConfig.RequestConfigLoader<Object, C3556h6> requestConfigLoader, C3521fm c3521fm, ArgumentsMerger<Object, Object> argumentsMerger) {
        this.f46069b = requestConfigLoader;
        Ia.j().u().a(this);
        a(new C3556h6(c3521fm, Ia.j().u(), Ia.j().r(), argumentsMerger));
    }

    public final synchronized void a(C3556h6 c3556h6) {
        this.f46070c = c3556h6;
    }

    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.f46070c.componentArguments;
    }

    public final synchronized C3521fm c() {
        return this.f46070c.f47372a;
    }

    public final void d() {
        synchronized (this) {
            this.f46068a = null;
        }
    }

    public final synchronized void e() {
        this.f46068a = null;
    }

    public synchronized void a(Object obj) {
        if (!((ArgumentsMerger) this.f46070c.componentArguments).compareWithOtherArguments(obj)) {
            a(new C3556h6(c(), Ia.F.u(), Ia.F.r(), (ArgumentsMerger) ((ArgumentsMerger) this.f46070c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(C3521fm c3521fm) {
        a(new C3556h6(c3521fm, Ia.F.u(), Ia.F.r(), b()));
        e();
    }

    public final synchronized BaseRequestConfig a() {
        try {
            if (this.f46068a == null) {
                this.f46068a = this.f46069b.load(this.f46070c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46068a;
    }
}
