package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity$ScreenCaptureCallback;
import dg.ppxfxbqfkf;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4025d implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f48971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f48972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4030i f48973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gtknphoqwx f48974d = draadjrbmk.zoijcleaow(new C4022a(this));

    public C4025d(ClientContext clientContext, Q q13) {
        this.f48971a = clientContext;
        this.f48972b = q13;
    }

    public static final Activity$ScreenCaptureCallback d(C4025d c4025d) {
        return ppxfxbqfkf.iobyxmoadg(c4025d.f48974d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C4033l c4033l) {
        this.f48973c = c4033l != null ? c4033l.f48999a : null;
    }

    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f48971a.getActivityLifecycleRegistry().registerListener(new C4024c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
