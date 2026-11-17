package io.appmetrica.analytics.impl;

import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3427c5 implements InterfaceC3830s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47009b;

    public C3427c5(C3654l5 c3654l5) {
        this.f47008a = String.format("component_%s.db", Arrays.copyOf(new Object[]{c3654l5.d() ? "main" : c3654l5.b()}, 1));
        this.f47009b = "db_metrica_" + c3654l5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3830s7
    public final String a() {
        return this.f47009b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3830s7
    public final String b() {
        return this.f47008a;
    }
}
