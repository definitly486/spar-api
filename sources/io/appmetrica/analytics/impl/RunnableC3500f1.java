package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3500f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnrListener f47201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47202b;

    public RunnableC3500f1(C3750p1 c3750p1, AnrListener anrListener) {
        this.f47202b = c3750p1;
        this.f47201a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47202b).a(this.f47201a);
    }
}
