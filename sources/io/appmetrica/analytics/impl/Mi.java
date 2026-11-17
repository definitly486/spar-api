package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class Mi extends V4 {
    public Mi(S4 s13) {
        super(s13);
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C3655l6 c3655l6, P4 p13) {
        Bundle bundle = c3655l6.f47643m;
        this.f46655a.f46491k.a(new R4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
