package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f48970a;

    public c0(d0 d0Var) {
        this.f48970a = d0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i13 = b0.f48968a[activityEvent.ordinal()];
        try {
            if (i13 == 1) {
                C4034m c4034m = this.f48970a.f48979e;
                if (c4034m == null || !c4034m.f49002a) {
                    return;
                }
                this.f48970a.f48978d = false;
                d0 d0Var = this.f48970a;
                d0Var.f48977c.postDelayed(d0Var.f48980f, 0L);
            } else if (i13 != 2) {
            } else {
                this.f48970a.f48978d = true;
            }
        } catch (Throwable unused) {
        }
    }
}
