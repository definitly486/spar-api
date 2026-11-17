package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class go implements InterfaceC3646km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilityServiceProvider f47358a;

    public go(UtilityServiceProvider utilityServiceProvider) {
        this.f47358a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3646km
    public final void a(C3521fm c3521fm) {
        this.f47358a.updateConfiguration(new UtilityServiceConfiguration(c3521fm.f47249v, c3521fm.f47248u));
    }
}
