package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f46166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ti f46167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f46168c;

    public L(M m13, Context context, Ti ti2) {
        this.f46168c = m13;
        this.f46166a = context;
        this.f46167b = ti2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f46168c.f46193a.a(this.f46166a, this.f46167b);
    }
}
