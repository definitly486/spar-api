package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3927w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f48264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3978y5 f48265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ka f48267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f48268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D4 f48269f;

    public C3927w4(Context context, C3978y5 c3978y5) {
        this(context, c3978y5, new D4());
    }

    public final A4 a(C3653l4 c3653l4, K4 k13) {
        A4 a4A;
        synchronized (this.f48264a) {
            try {
                a4A = (A4) this.f48266c.get(c3653l4);
                if (a4A == null) {
                    this.f48269f.getClass();
                    a4A = D4.a(c3653l4).a(this.f48268e, this.f48265b, c3653l4, k13);
                    this.f48266c.put(c3653l4, a4A);
                    this.f48267d.a(new C3902v4(c3653l4.f47625b, c3653l4.f47626c, c3653l4.f47627d), c3653l4);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a4A;
    }

    public C3927w4(Context context, C3978y5 c3978y5, D4 d13) {
        this.f48264a = new Object();
        this.f48266c = new HashMap();
        this.f48267d = new Ka();
        this.f48268e = context.getApplicationContext();
        this.f48265b = c3978y5;
        this.f48269f = d13;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f48264a) {
            try {
                Ka ka3 = this.f48267d;
                Collection collection = (Collection) ka3.f46140a.remove(new C3902v4(str, num, str2));
                if (!io.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((A4) this.f48266c.remove((C3653l4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((A4) it2.next()).a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
