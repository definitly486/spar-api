package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3598j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f47498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3648l f47499b;

    public RunnableC3598j(C3648l c3648l, Activity activity) {
        this.f47499b = c3648l;
        this.f47498a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47499b.a(this.f47498a);
    }
}
