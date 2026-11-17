package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ka f45945a = new Ka();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f45946b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3521fm f45947c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fl f45948d = new Fl(this);

    public static final Hl a() {
        return Gl.f45868a;
    }

    public final Bm a(Context context, C3654l5 c3654l5, Zl zl2) {
        Bm bm2 = (Bm) this.f45946b.get(c3654l5.f47629a);
        boolean z13 = true;
        if (bm2 == null) {
            synchronized (this.f45946b) {
                try {
                    bm2 = (Bm) this.f45946b.get(c3654l5.f47629a);
                    if (bm2 == null) {
                        bm2 = new Bm(new Cm(context, c3654l5.f47629a, zl2, this.f45948d));
                        bm2.f();
                        this.f45946b.put(c3654l5.f47629a, bm2);
                        z13 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z13) {
            bm2.a(zl2);
        }
        return bm2;
    }

    public final void a(C3654l5 c3654l5, Ql ql2) {
        synchronized (this.f45946b) {
            try {
                this.f45945a.a(c3654l5.f47629a, ql2);
                C3521fm c3521fm = this.f45947c;
                if (c3521fm != null) {
                    ql2.a(c3521fm);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
