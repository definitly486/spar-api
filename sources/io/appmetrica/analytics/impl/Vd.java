package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class Vd implements InterfaceC3391al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46674a;

    public Vd(int i13) {
        this.f46674a = i13;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3391al
    public final boolean a(String str) {
        return this.f46674a != Process.myPid();
    }
}
