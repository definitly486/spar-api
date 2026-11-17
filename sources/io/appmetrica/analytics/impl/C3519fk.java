package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3519fk extends C3828s5 {
    public C3519fk(Context context, C3521fm c3521fm, C3654l5 c3654l5, J4 j13, InterfaceC3890uh interfaceC3890uh, AbstractC3779q5 abstractC3779q5, C3629k5 c3629k5) {
        this(context, c3654l5, new C3575i0(), new TimePassedChecker(), new C3953x5(context, c3654l5, j13, abstractC3779q5, c3521fm, interfaceC3890uh, Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), c3629k5), j13);
    }

    @Override // io.appmetrica.analytics.impl.C3828s5, io.appmetrica.analytics.impl.Za
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C3519fk(Context context, C3654l5 c3654l5, C3575i0 c3575i0, TimePassedChecker timePassedChecker, C3953x5 c3953x5, J4 j13) {
        super(context, c3654l5, c3575i0, timePassedChecker, c3953x5, j13);
    }
}
