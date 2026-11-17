package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Savable;

/* JADX INFO: loaded from: classes3.dex */
public final class H implements Savable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f45872a;

    public H(I i13) {
        this.f45872a = i13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean getValue() {
        return Boolean.valueOf(this.f45872a.f45953a.a(false));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Savable
    public final /* bridge */ /* synthetic */ void setValue(Object obj) {
        a(((Boolean) obj).booleanValue());
    }

    public final void a(boolean z13) {
        this.f45872a.f45953a.e(z13);
    }
}
