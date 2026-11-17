package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3617ji implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f47541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47542c;

    public RunnableC3617ji(C3866ti c3866ti, String str, byte[] bArr) {
        this.f47542c = c3866ti;
        this.f47540a = str;
        this.f47541b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47542c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).setSessionExtra(this.f47540a, this.f47541b);
    }
}
