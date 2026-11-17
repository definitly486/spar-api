package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: loaded from: classes3.dex */
public final class Z5 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3376a6 f46843a;

    public Z5(C3376a6 c3376a6) {
        this.f46843a = c3376a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i13 = Y5.f46797a[activityEvent.ordinal()];
        if (i13 == 1) {
            this.f46843a.f46905b.resumeSession();
        } else {
            if (i13 != 2) {
                return;
            }
            this.f46843a.f46905b.pauseSession();
        }
    }
}
