package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3593ij extends AbstractC3490eh {
    public C3593ij(C3828s5 c3828s5) {
        super(c3828s5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        String str = c3655l6.f47638h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f47182a.f48032c.j(str).b();
        return false;
    }
}
