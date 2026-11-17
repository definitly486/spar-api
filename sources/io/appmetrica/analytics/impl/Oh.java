package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: loaded from: classes3.dex */
public final class Oh extends F6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Tn f46343d;

    public Oh(Context context, Tn tn2, E6 e13, ICrashTransformer iCrashTransformer) {
        this(tn2, e13, iCrashTransformer, new C3560ha(context));
    }

    public Oh(Tn tn2, E6 e13, ICrashTransformer iCrashTransformer, C3560ha c3560ha) {
        super(e13, iCrashTransformer, c3560ha);
        this.f46343d = tn2;
    }
}
