package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3651l2 f45811a = new C3651l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G6 f45812b = new G6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3946wn f45813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45815e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC3735ob interfaceC3735ob) {
        if (this.f45815e) {
            return;
        }
        hg.jyumaefscl.cdpycssgdh(this.f45812b.f45845a, new InterfaceC3381ab[]{this.f45811a.a(context, appMetricaConfig, interfaceC3735ob)});
        this.f45815e = true;
    }

    public final synchronized void b() {
        if (this.f45814d) {
            return;
        }
        G6 g13 = this.f45812b;
        ArrayList arrayList = C3952x4.l().f48379i.f47618a;
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g13.f45845a.addAll(arrayList2);
        this.f45814d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f45813c != null) {
                return;
            }
            U1 u13 = new U1(this.f45812b);
            this.f45813c = new C3946wn(u13);
            C3921vn c3921vn = new C3921vn();
            c3921vn.f48252a.add(u13);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c3921vn.f48252a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c3921vn);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a() {
        this.f45812b.f45845a.clear();
        this.f45814d = false;
        this.f45815e = false;
    }
}
