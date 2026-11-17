package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: loaded from: classes3.dex */
public final class jo implements InterfaceC3510fb {
    @Override // io.appmetrica.analytics.impl.InterfaceC3510fb
    public final String a(Context context) {
        IdentifiersResult identifiersResultQ = new C3614jf(C3880u7.a(context.getApplicationContext()).a()).q();
        if (TextUtils.isEmpty(identifiersResultQ.f48647id)) {
            return null;
        }
        return identifiersResultQ.f48647id;
    }
}
