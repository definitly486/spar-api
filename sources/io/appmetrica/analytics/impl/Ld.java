package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static S9 f46178a;

    public static final synchronized S9 a(Context context) {
        S9 s13;
        s13 = f46178a;
        if (s13 == null) {
            s13 = new S9(context, "uuid.dat");
            f46178a = s13;
        }
        return s13;
    }
}
