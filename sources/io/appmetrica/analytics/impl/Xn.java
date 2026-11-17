package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Xn extends AbstractC3490eh {
    public Xn(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        String strI = this.f47182a.f48032c.i();
        String str = c3655l6.f47638h;
        this.f47182a.f48032c.j(str).b();
        if (TextUtils.equals(strI, str)) {
            return false;
        }
        this.f47182a.a(C3579i4.o());
        return false;
    }
}
