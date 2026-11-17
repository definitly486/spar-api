package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class V1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3763pe f46638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f46639b;

    public V1(X1 x13, U7 u13) {
        this.f46638a = x13;
        this.f46639b = u13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46638a.consume(this.f46639b);
    }
}
