package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class M1 implements InterfaceC3669lk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L1 f46196b = new L1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46197c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3749p0 f46198a;

    public M1(InterfaceC3749p0 interfaceC3749p0) {
        this.f46198a = interfaceC3749p0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3669lk
    public final void reportData(int i13, Bundle bundle) {
        ((J1) this.f46198a).a(bundle);
    }
}
