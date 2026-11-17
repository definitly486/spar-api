package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4041u implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f49012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f49013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4031j f49014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W f49015d;

    public C4041u(ClientContext clientContext, Q q13) {
        this.f49012a = clientContext;
        this.f49013b = q13;
        this.f49015d = new W(clientContext, new r(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(C4033l c4033l) {
        this.f49014c = c4033l != null ? c4033l.f49001c : null;
        this.f49015d.f48962c = this.f49014c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f49012a.getActivityLifecycleRegistry().registerListener(new C4040t(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
