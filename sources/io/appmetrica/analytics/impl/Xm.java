package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Xm extends O4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final In f46789g;

    public Xm(String str, String str2, In in2, po poVar, W2 w13) {
        super(0, str, str2, poVar, w13);
        this.f46789g = in2;
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final void a(C3446co c3446co) {
        String str = (String) this.f46789g.a((String) this.f46305f);
        c3446co.f47050d.f47193a = str == null ? new byte[0] : str.getBytes();
    }

    public final In h() {
        return this.f46789g;
    }
}
