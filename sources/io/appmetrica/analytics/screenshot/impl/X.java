package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48964b;

    public X(boolean z13, long j13) {
        this.f48963a = z13;
        this.f48964b = j13;
    }

    public final long a() {
        return this.f48964b;
    }

    public final boolean b() {
        return this.f48963a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.f48963a + ", delaySeconds=" + this.f48964b + ')';
    }

    public X() {
        this(new M().f48940a, new M().f48941b);
    }
}
