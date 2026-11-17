package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pd implements InterfaceC3420bo, InterfaceC3726o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final po f46385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W2 f46386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PublicLogger f46387e = PublicLogger.getAnonymousInstance();

    public Pd(int i13, String str, po poVar, W2 w13) {
        this.f46384b = i13;
        this.f46383a = str;
        this.f46385c = poVar;
        this.f46386d = w13;
    }

    public final C3446co a() {
        C3446co c3446co = new C3446co();
        c3446co.f47048b = this.f46384b;
        c3446co.f47047a = this.f46383a.getBytes();
        c3446co.f47050d = new C3497eo();
        c3446co.f47049c = new Cdo();
        return c3446co;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3420bo
    public abstract /* synthetic */ void a(C3394ao c3394ao);

    public final W2 b() {
        return this.f46386d;
    }

    public final String c() {
        return this.f46383a;
    }

    public final po d() {
        return this.f46385c;
    }

    public final int e() {
        return this.f46384b;
    }

    public final boolean f() {
        no noVarA = this.f46385c.a(this.f46383a);
        if (noVarA.f47784a) {
            return true;
        }
        this.f46387e.warning("Attribute " + this.f46383a + " of type " + ((String) Ln.f46192a.get(this.f46384b)) + " is skipped because " + noVarA.f47785b, new Object[0]);
        return false;
    }

    public final void a(PublicLogger publicLogger) {
        this.f46387e = publicLogger;
    }
}
