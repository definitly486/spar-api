package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Ig {
    public Ig(InterfaceC3610jb interfaceC3610jb) {
    }

    public static InterfaceC3610jb a(Context context, IHandlerExecutor iHandlerExecutor) {
        C3914vg c3914vg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c3914vg = new C3914vg(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c3914vg = null;
            }
        } else {
            c3914vg = null;
        }
        return c3914vg == null ? new Hg() : c3914vg;
    }
}
