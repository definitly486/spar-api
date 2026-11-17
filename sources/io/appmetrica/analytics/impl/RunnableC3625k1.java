package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3625k1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47578c;

    public RunnableC3625k1(C3750p1 c3750p1, String str, String str2) {
        this.f47578c = c3750p1;
        this.f47576a = str;
        this.f47577b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47578c).reportEvent(this.f47576a, this.f47577b);
    }
}
