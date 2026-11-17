package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class C1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f45556b;

    public C1(I1 i13, Intent intent) {
        this.f45556b = i13;
        this.f45555a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45556b.f45963b.a(this.f45555a);
    }
}
