package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Tb implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f46555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg.gtknphoqwx f46556b = gg.draadjrbmk.zoijcleaow(new Sb(this));

    public Tb(C3828s5 c3828s5) {
        this.f46555a = c3828s5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3965xh getConfig() {
        return (C3965xh) this.f46556b.getValue();
    }
}
