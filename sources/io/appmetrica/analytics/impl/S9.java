package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f46504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3858ta f46505b;

    public S9(Context context, String str) {
        this(new ReentrantLock(), new C3858ta(context, str));
    }

    public final void a() {
        this.f46504a.lock();
        this.f46505b.a();
    }

    public final void b() {
        this.f46505b.b();
        this.f46504a.unlock();
    }

    public final void c() {
        C3858ta c3858ta = this.f46505b;
        synchronized (c3858ta) {
            c3858ta.b();
            c3858ta.f48116a.delete();
        }
        this.f46504a.unlock();
    }

    public S9(ReentrantLock reentrantLock, C3858ta c3858ta) {
        this.f46504a = reentrantLock;
        this.f46505b = c3858ta;
    }
}
