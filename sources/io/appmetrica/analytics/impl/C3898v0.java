package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3898v0 implements Rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3948x0 f48217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f48218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f48219c;

    public C3898v0(C3948x0 c3948x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f48217a = c3948x0;
        this.f48218b = appMetricaConfig;
        this.f48219c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final Cc a() {
        C3948x0 c3948x0 = this.f48217a;
        return c3948x0.f48362g.b(this.f48218b, this.f48219c, c3948x0.f48364i.f46854g);
    }
}
