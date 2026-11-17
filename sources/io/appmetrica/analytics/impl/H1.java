package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class H1 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f45875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f45876b;

    public H1(I1 i13, Bundle bundle) {
        this.f45876b = i13;
        this.f45875a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f45876b.f45963b.pauseUserSession(this.f45875a);
    }
}
