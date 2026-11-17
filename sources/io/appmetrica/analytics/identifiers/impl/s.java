package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f45426a;

    public s(IBinder iBinder) {
        this.f45426a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45426a;
    }
}
