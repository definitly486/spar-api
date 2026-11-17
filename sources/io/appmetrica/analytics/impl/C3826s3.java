package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826s3 extends Pi {
    public C3826s3(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.Pi
    public final Object a(int i13) {
        return Boolean.valueOf(this.f46393a.getResources().getBoolean(i13));
    }

    public final Boolean b(int i13) {
        return Boolean.valueOf(this.f46393a.getResources().getBoolean(i13));
    }
}
