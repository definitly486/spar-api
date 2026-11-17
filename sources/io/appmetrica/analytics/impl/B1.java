package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class B1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f45488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1 f45491d;

    public B1(I1 i13, Intent intent, int i14, int i15) {
        this.f45491d = i13;
        this.f45488a = intent;
        this.f45489b = i14;
        this.f45490c = i15;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45491d.f45963b.a(this.f45488a, this.f45489b, this.f45490c);
    }
}
