package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3526g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExternalAttribution f47270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47271b;

    public RunnableC3526g1(C3750p1 c3750p1, ExternalAttribution externalAttribution) {
        this.f47271b = c3750p1;
        this.f47270a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47271b).a(this.f47270a);
    }
}
