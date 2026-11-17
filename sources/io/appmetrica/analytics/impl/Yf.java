package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class Yf implements qo, R8 {
    @Override // io.appmetrica.analytics.impl.R8
    public final int a(EnumC3405b9 enumC3405b9) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        return TextUtils.isEmpty(c3534g9.f47303b) ? new byte[0] : Base64.decode(c3534g9.f47303b, 0);
    }
}
