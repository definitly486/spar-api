package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3695ml implements FunctionWithThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3720nl f47715a;

    public C3695ml(C3720nl c3720nl) {
        this.f47715a = c3720nl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C3720nl c3720nl = this.f47715a;
        if (c3720nl.f47780b.hasPermission(c3720nl.f47779a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
