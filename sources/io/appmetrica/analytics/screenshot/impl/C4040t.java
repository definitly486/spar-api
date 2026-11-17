package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4040t implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4041u f49011a;

    public C4040t(C4041u c4041u) {
        this.f49011a = c4041u;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i13 = AbstractC4039s.f49010a[activityEvent.ordinal()];
        try {
            if (i13 == 1) {
                C4031j c4031j = this.f49011a.f49014c;
                if (c4031j == null || !c4031j.f48994a) {
                } else {
                    this.f49011a.f49012a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f49011a.f49015d);
                }
            } else if (i13 != 2) {
            } else {
                this.f49011a.f49012a.getContext().getContentResolver().unregisterContentObserver(this.f49011a.f49015d);
            }
        } catch (Throwable unused) {
        }
    }
}
