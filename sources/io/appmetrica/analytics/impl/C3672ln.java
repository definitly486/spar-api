package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3672ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3722nn f47670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3722nn f47671b;

    public C3672ln(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f47670a = new Y2(new C3720nl(context));
            this.f47671b = new Y2(new C3538gd(context));
        } else {
            this.f47670a = new C3831s8();
            this.f47671b = new C3831s8();
        }
    }
}
