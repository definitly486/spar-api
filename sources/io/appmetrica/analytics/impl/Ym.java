package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Ym implements qo {
    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        return !TextUtils.isEmpty(c3534g9.f47303b) ? StringUtils.getUTF8Bytes(c3534g9.f47303b) : new byte[0];
    }
}
