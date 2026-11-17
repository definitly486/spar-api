package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3824s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f48027a;

    public RunnableC3824s1(Context context) {
        this.f48027a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3442ck c3442ck = Bj.f45542a;
        Context context = this.f48027a;
        synchronized (c3442ck) {
            try {
                if (c3442ck.f47031b == null) {
                    c3442ck.f47031b = Ai.f45472a.a(context, "20799a27-fa80-4b36-b2db-0f8141f24180");
                    Iterator it = c3442ck.f47030a.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3660lb) it.next()).a(c3442ck.f47031b);
                    }
                    c3442ck.f47030a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
