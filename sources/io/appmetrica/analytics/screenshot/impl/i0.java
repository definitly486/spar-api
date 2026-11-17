package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48993b;

    public i0(boolean z13, long j13) {
        this.f48992a = z13;
        this.f48993b = j13;
    }

    public final long a() {
        return this.f48993b;
    }

    public final boolean b() {
        return this.f48992a;
    }

    public final String toString() {
        return "ServiceSideServiceCaptorConfig(enabled=" + this.f48992a + ", delaySeconds=" + this.f48993b + ')';
    }

    public i0(X x13) {
        this(x13.b(), x13.a());
    }
}
