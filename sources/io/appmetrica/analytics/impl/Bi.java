package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45540a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3873u0 f45541b;

    public Bi(C3873u0 c3873u0) {
        this.f45541b = c3873u0;
    }

    public static Bi a() {
        return Ai.f45472a;
    }

    public final C3866ti a(Context context, String str) {
        C3866ti c3866ti = (C3866ti) this.f45540a.get(str);
        if (c3866ti == null) {
            synchronized (this.f45540a) {
                try {
                    c3866ti = (C3866ti) this.f45540a.get(str);
                    if (c3866ti == null) {
                        IHandlerExecutor iHandlerExecutorA = C3952x4.l().f48373c.a();
                        this.f45541b.getClass();
                        if (C3848t0.f48087e == null) {
                            ((U9) iHandlerExecutorA).f46606b.post(new RunnableC4016zi(this, context));
                        }
                        c3866ti = new C3866ti(context.getApplicationContext(), str, new C3873u0());
                        this.f45540a.put(str, c3866ti);
                        c3866ti.c(str);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3866ti;
    }
}
