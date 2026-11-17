package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;

/* JADX INFO: loaded from: classes3.dex */
public final class Hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3374a4 f45950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo f45951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f45952c;

    public Hn(Toggle toggle) {
        C3374a4 c3374a4 = new C3374a4(Ia.j().x());
        this.f45950a = c3374a4;
        zo zoVar = new zo();
        this.f45951b = zoVar;
        this.f45952c = new ConjunctiveCompositeThreadSafeToggle(hg.jyumaefscl.rgvfuqvkyq(c3374a4, zoVar, toggle == null ? new so() : toggle), "loc-def");
    }
}
