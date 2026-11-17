package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3386ag implements qo {
    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        if (!TextUtils.isEmpty(c3534g9.f47303b)) {
            try {
                byte[] bArrDecode = Base64.decode(c3534g9.f47303b, 0);
                Ag ag2 = (bArrDecode == null || bArrDecode.length == 0) ? null : new Ag(bArrDecode);
                C3590ig c3590ig = new C3590ig();
                String str = ag2.f45468a;
                c3590ig.f47448a = str == null ? new byte[0] : str.getBytes();
                c3590ig.f47450c = ag2.f45469b;
                c3590ig.f47449b = ag2.f45470c;
                int iOrdinal = ag2.f45471d.ordinal();
                int i13 = 1;
                if (iOrdinal != 1) {
                    i13 = 2;
                    if (iOrdinal != 2) {
                        i13 = 0;
                    }
                }
                c3590ig.f47451d = i13;
                return MessageNano.toByteArray(c3590ig);
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }
}
