package io.appmetrica.analytics.screenshot.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f48987b;

    public g0(boolean z13, h0 h0Var) {
        this.f48986a = z13;
        this.f48987b = h0Var;
    }

    public final h0 a() {
        return this.f48987b;
    }

    public final boolean b() {
        return this.f48986a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.f48986a + ", config=" + this.f48987b + ')';
    }

    public g0() {
        this(new G());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(G g13) {
        boolean zB = g13.b();
        T tA = g13.a();
        this(zB, tA != null ? new h0(tA) : null);
    }
}
