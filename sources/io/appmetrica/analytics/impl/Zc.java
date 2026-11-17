package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Zc implements Y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ie f46859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tg.iobyxmoadg f46860b;

    public Zc(Ie ie2, tg.iobyxmoadg iobyxmoadgVar) {
        this.f46859a = ie2;
        this.f46860b = iobyxmoadgVar;
    }

    @Override // io.appmetrica.analytics.impl.Y8
    public final boolean b() {
        return ((He) this.f46859a).f45912b.get() >= ((long) ((Number) this.f46860b.invoke()).intValue());
    }
}
