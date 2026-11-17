package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f46092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V2 f46093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Kb f46094c;

    public Jb(Handler handler, V2 v13) {
        this.f46092a = handler;
        this.f46093b = v13;
        this.f46094c = new Kb(handler, v13);
    }

    public static void a(Handler handler, V2 v13, Runnable runnable) {
        handler.removeCallbacks(runnable, v13.f46643b.f47066b.getApiKey());
        handler.postAtTime(runnable, v13.f46643b.f47066b.getApiKey(), SystemClock.uptimeMillis() + ((long) (((Integer) WrapUtils.getOrDefault(v13.f46643b.f47066b.getSessionTimeout(), 10)).intValue() * 500)));
    }
}
