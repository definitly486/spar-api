package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f48928b;

    public G(boolean z13, T t13) {
        this.f48927a = z13;
        this.f48928b = t13;
    }

    public final T a() {
        return this.f48928b;
    }

    public final boolean b() {
        return this.f48927a;
    }

    public final String toString() {
        return "RemoteScreenshotConfig(enabled=" + this.f48927a + ", config=" + this.f48928b + ')';
    }

    public G() {
        this(new O().f48947a, new T());
    }
}
