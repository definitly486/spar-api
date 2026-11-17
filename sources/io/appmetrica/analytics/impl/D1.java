package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class D1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f45617b;

    public D1(I1 i13, Intent intent) {
        this.f45617b = i13;
        this.f45616a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45617b.f45963b.c(this.f45616a);
    }
}
