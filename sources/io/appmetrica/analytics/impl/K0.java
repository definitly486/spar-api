package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class K0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f46121b;

    public K0(C3750p1 c3750p1, String str) {
        this.f46121b = c3750p1;
        this.f46120a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f46121b).b(this.f46120a);
    }
}
