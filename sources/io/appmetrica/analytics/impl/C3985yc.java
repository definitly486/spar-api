package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3985yc implements M9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F5 f48522a;

    public C3985yc(Q9 q13, C3532g7 c3532g7, C3465dh c3465dh, J4 j13, C3654l5 c3654l5, C3639kf c3639kf) {
        C3960xc c3960xc = new C3960xc(c3532g7, c3465dh, this, j13, c3639kf);
        this.f48522a = new F5(q13, c3960xc.a(), c3960xc.b(), c3654l5);
    }

    @Override // io.appmetrica.analytics.impl.M9
    public final L9 a() {
        return this.f48522a;
    }

    public final F5 b() {
        return this.f48522a;
    }
}
