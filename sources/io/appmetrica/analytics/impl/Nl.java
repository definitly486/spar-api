package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class Nl implements V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StartupParamsCallback f46290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ol f46291b;

    public Nl(Ol ol2, StartupParamsCallback startupParamsCallback) {
        this.f46291b = ol2;
        this.f46290a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.V6
    public final void a(int i13, Bundle bundle) {
        this.f46291b.b(bundle, this.f46290a);
    }
}
