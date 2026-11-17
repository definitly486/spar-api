package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O4 extends Pd {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46305f;

    public O4(int i13, String str, Object obj, po poVar, W2 w13) {
        super(i13, str, poVar, w13);
        this.f46305f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Pd, io.appmetrica.analytics.impl.InterfaceC3420bo
    public final void a(C3394ao c3394ao) {
        if (f()) {
            W2 w13 = this.f46386d;
            int i13 = this.f46384b;
            C3446co c3446coA = w13.a(c3394ao, (C3446co) ((HashMap) c3394ao.f46930a.get(i13)).get(this.f46383a), this);
            if (c3446coA != null) {
                a(c3446coA);
            }
        }
    }

    public abstract void a(C3446co c3446co);

    public final Object g() {
        return this.f46305f;
    }
}
