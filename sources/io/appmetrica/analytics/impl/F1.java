package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f45774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f45775c;

    public F1(I1 i13, int i14, Bundle bundle) {
        this.f45775c = i13;
        this.f45773a = i14;
        this.f45774b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45775c.f45963b.reportData(this.f45773a, this.f45774b);
    }
}
