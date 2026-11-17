package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class S4 implements Za, Ql, InterfaceC3407bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3654l5 f46482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bm f46483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Mh f46484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z4 f46485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3622jn f46486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f46487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3679m5 f46488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3989yg f46489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3753p4 f46490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Dg f46491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f46492l;

    public S4(Context context, Hl hl2, C3654l5 c3654l5, K4 k13, C3989yg c3989yg) {
        this(context, hl2, c3654l5, k13, new Mh(k13.f46125b), c3989yg, new C3679m5(), new U4(), new Dg());
    }

    public static void b(K4 k13) {
        Ia.F.b().b(!Boolean.FALSE.equals(k13.f46125b.f46067n));
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(J4 j13) {
        Mh mh2 = this.f46484d;
        mh2.f46236a = mh2.f46236a.mergeFrom(j13);
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final J4 d() {
        return this.f46484d.f46236a;
    }

    public final C3989yg e() {
        return this.f46489i;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final Context getContext() {
        return this.f46481a;
    }

    public S4(Context context, Hl hl2, C3654l5 c3654l5, K4 k13, Mh mh2, C3989yg c3989yg, C3679m5 c3679m5, U4 u13, Dg dg2) {
        this.f46487g = new ArrayList();
        this.f46492l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f46481a = applicationContext;
        this.f46482b = c3654l5;
        this.f46484d = mh2;
        this.f46488h = c3679m5;
        this.f46485e = U4.a(this);
        b(k13);
        Bm bmA = hl2.a(applicationContext, c3654l5, k13.f46124a);
        this.f46483c = bmA;
        this.f46490j = AbstractC3778q4.a(bmA, Ia.j().b());
        this.f46486f = u13.a(this, bmA);
        this.f46489i = c3989yg;
        this.f46491k = dg2;
        hl2.a(c3654l5, this);
    }

    public final synchronized void a(P4 p13) {
        this.f46488h.f47695a.add(p13);
        W6.a(p13.f46372c, this.f46490j.a(Gm.a(this.f46483c.e().f47239l)));
    }

    public final synchronized void b(P4 p13) {
        this.f46488h.f47695a.remove(p13);
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final C3654l5 b() {
        return this.f46482b;
    }

    public final void a(C3655l6 c3655l6, P4 p13) {
        Z4 z13 = this.f46485e;
        z13.getClass();
        z13.a(c3655l6, new Y4(p13));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl2, C3521fm c3521fm) {
        synchronized (this.f46492l) {
            try {
                for (C3834sb c3834sb : this.f46487g) {
                    W6.a(c3834sb.f48056a, jl2, this.f46490j.a(c3834sb.f48058c));
                }
                this.f46487g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C3521fm c3521fm) {
        synchronized (this.f46492l) {
            try {
                for (P4 p13 : this.f46488h.f47695a) {
                    W6.a(p13.f46372c, this.f46490j.a(Gm.a(c3521fm.f47239l)));
                }
                ArrayList arrayList = new ArrayList();
                for (C3834sb c3834sb : this.f46487g) {
                    if (AbstractC3444cm.a(c3521fm, c3834sb.f48057b, c3834sb.f48058c, new C3785qb())) {
                        W6.a(c3834sb.f48056a, this.f46490j.a(c3834sb.f48058c));
                    } else {
                        arrayList.add(c3834sb);
                    }
                }
                this.f46487g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f46486f.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(C3834sb c3834sb) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (c3834sb != null) {
            list = c3834sb.f48057b;
            resultReceiver = c3834sb.f48056a;
            map = c3834sb.f48058c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zA = this.f46483c.a(list, map);
        if (!zA) {
            W6.a(resultReceiver, this.f46490j.a(map));
        }
        if (!this.f46483c.g()) {
            if (zA) {
                W6.a(resultReceiver, this.f46490j.a(map));
                return;
            }
            return;
        }
        synchronized (this.f46492l) {
            if (zA && c3834sb != null) {
                try {
                    this.f46487g.add(c3834sb);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f46486f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f46491k.a(new R4(resultReceiver));
    }

    public final C3753p4 a() {
        return this.f46490j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3407bb
    public final void a(K4 k13) {
        this.f46483c.a(k13.f46124a);
        a(k13.f46125b);
    }
}
