package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class A1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f45435c;

    public A1(I1 i13, Intent intent, int i14) {
        this.f45435c = i13;
        this.f45433a = intent;
        this.f45434b = i14;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45435c.f45963b.a(this.f45433a, this.f45434b);
    }
}
