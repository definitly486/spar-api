package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f46119b;

    public K(M m13, Context context) {
        this.f46119b = m13;
        this.f46118a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f46119b.f46193a.a(this.f46118a);
    }
}
