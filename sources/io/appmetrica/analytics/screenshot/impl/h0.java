package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f48988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f48989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f48990c;

    public h0(e0 e0Var, i0 i0Var, f0 f0Var) {
        this.f48988a = e0Var;
        this.f48989b = i0Var;
        this.f48990c = f0Var;
    }

    public final e0 a() {
        return this.f48988a;
    }

    public final f0 b() {
        return this.f48990c;
    }

    public final i0 c() {
        return this.f48989b;
    }

    public final String toString() {
        return "ServiceSideScreenshotConfig(apiCaptorConfig=" + this.f48988a + ", serviceCaptorConfig=" + this.f48989b + ", contentObserverCaptorConfig=" + this.f48990c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(T t13) {
        C4026e c4026eA = t13.a();
        e0 e0Var = c4026eA != null ? new e0(c4026eA) : null;
        X xC = t13.c();
        i0 i0Var = xC != null ? new i0(xC) : null;
        C4036o c4036oB = t13.b();
        this(e0Var, i0Var, c4036oB != null ? new f0(c4036oB) : null);
    }
}
