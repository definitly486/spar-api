package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class E1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f45677b;

    public E1(I1 i13, Intent intent) {
        this.f45677b = i13;
        this.f45676a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45677b.f45963b.b(this.f45676a);
    }
}
