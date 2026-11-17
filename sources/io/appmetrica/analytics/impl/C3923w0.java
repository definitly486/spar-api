package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3923w0 implements Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3948x0 f48258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f48259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f48260c;

    public C3923w0(C3948x0 c3948x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f48258a = c3948x0;
        this.f48259b = appMetricaConfig;
        this.f48260c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final Cc a() {
        C3948x0 c3948x0 = this.f48258a;
        return c3948x0.f48362g.a(this.f48259b, this.f48260c, c3948x0.f48364i.f46854g);
    }
}
