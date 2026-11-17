package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4024c implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4025d f48969a;

    public C4024c(C4025d c4025d) {
        this.f48969a = c4025d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @SuppressLint({"MissingPermission", "NewApi"})
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i13 = AbstractC4023b.f48967a[activityEvent.ordinal()];
        try {
            if (i13 == 1) {
                C4030i c4030i = this.f48969a.f48973c;
                if (c4030i == null || !c4030i.f48991a) {
                } else {
                    activity.registerScreenCaptureCallback(this.f48969a.f48971a.getContext().getMainExecutor(), C4025d.d(this.f48969a));
                }
            } else if (i13 != 2) {
            } else {
                activity.unregisterScreenCaptureCallback(C4025d.d(this.f48969a));
            }
        } catch (Throwable unused) {
        }
    }
}
