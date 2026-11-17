package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class V8 implements qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3379a9 f46656a;

    public V8() {
        this(new C3379a9());
    }

    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        String str = c3534g9.f47303b;
        return ((Z8) this.f46656a.f46911a.a(c3534g9.f47316o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public V8(C3379a9 c3379a9) {
        this.f46656a = c3379a9;
    }
}
