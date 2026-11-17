package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4026e f48950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f48951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4036o f48952c;

    public T(C4026e c4026e, X x13, C4036o c4036o) {
        this.f48950a = c4026e;
        this.f48951b = x13;
        this.f48952c = c4036o;
    }

    public final C4026e a() {
        return this.f48950a;
    }

    public final C4036o b() {
        return this.f48952c;
    }

    public final X c() {
        return this.f48951b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.f48950a + ", serviceCaptorConfig=" + this.f48951b + ", contentObserverCaptorConfig=" + this.f48952c + ')';
    }

    public T() {
        this(new C4026e(), new X(), new C4036o());
    }
}
