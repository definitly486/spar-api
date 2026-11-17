package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Qf f46477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Za f46478b;

    public S2(Qf qf2, Za za3) {
        this.f46477a = qf2;
        this.f46478b = za3;
    }

    public final boolean a(C3655l6 c3655l6, R2 r13) {
        Iterator it = ((C3783q9) this.f46477a.a(c3655l6.f47634d)).f47914a.iterator();
        while (it.hasNext()) {
            if (r13.a(it.next(), c3655l6)) {
                return true;
            }
        }
        return false;
    }

    public final Qf b() {
        return this.f46477a;
    }

    public final Za a() {
        return this.f46478b;
    }
}
