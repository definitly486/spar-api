package io.appmetrica.analytics.impl;

import android.util.Base64;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3976y3 implements qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3379a9 f48498a;

    public C3976y3() {
        this(new C3379a9());
    }

    @Override // io.appmetrica.analytics.impl.qo
    public final byte[] a(C3534g9 c3534g9, C3965xh c3965xh) {
        byte[] bArrDecode = new byte[0];
        String str = c3534g9.f47303b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        C3379a9 c3379a9 = this.f48498a;
        return ((Z8) c3379a9.f46911a.a(c3534g9.f47316o)).a(bArrDecode);
    }

    public C3976y3(C3379a9 c3379a9) {
        this.f48498a = c3379a9;
    }
}
