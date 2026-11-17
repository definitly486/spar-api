package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class Qh extends C3828s5 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f46425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z6 f46426w;

    public Qh(Context context, C3654l5 c3654l5, J4 j13, Z6 z13, C3521fm c3521fm, AbstractC3779q5 abstractC3779q5, N9 n13) {
        this(context, c3654l5, new C3575i0(), new TimePassedChecker(), new C3953x5(context, c3654l5, j13, abstractC3779q5, c3521fm, new Lh(z13), Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), n13), z13, j13);
    }

    @Override // io.appmetrica.analytics.impl.C3828s5, io.appmetrica.analytics.impl.InterfaceC3635kb, io.appmetrica.analytics.impl.Za
    public final synchronized void a(J4 j13) {
        super.a(j13);
        this.f46426w.a(this.f46425v, j13.f46062i);
    }

    public Qh(Context context, C3654l5 c3654l5, C3575i0 c3575i0, TimePassedChecker timePassedChecker, C3953x5 c3953x5, Z6 z13, J4 j13) {
        super(context, c3654l5, c3575i0, timePassedChecker, c3953x5, j13);
        this.f46425v = c3654l5.b();
        this.f46426w = z13;
    }
}
