package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3714nf f45953a = Ia.j().x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavableToggle f45954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f45955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f45956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f45957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f45958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavableToggle f45959g;

    public I(C3521fm c3521fm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new H(this));
        this.f45954b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f45955c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f45956d = outerStateToggle2;
        this.f45957e = new ConjunctiveCompositeThreadSafeToggle(hg.jyumaefscl.rgvfuqvkyq(savableToggle, outerStateToggle), "GAID");
        this.f45958f = new ConjunctiveCompositeThreadSafeToggle(hg.jyumaefscl.rgvfuqvkyq(savableToggle, outerStateToggle2), "HOAID");
        this.f45959g = savableToggle;
        a(c3521fm);
    }

    public final void a(C3521fm c3521fm) {
        boolean z13 = c3521fm.f47243p;
        boolean z14 = true;
        this.f45955c.update(!z13 || c3521fm.f47241n.f45839c);
        OuterStateToggle outerStateToggle = this.f45956d;
        if (z13 && !c3521fm.f47241n.f45841e) {
            z14 = false;
        }
        outerStateToggle.update(z14);
    }

    public final F a() {
        int i13;
        int i14 = 3;
        int i15 = 4;
        if (this.f45957e.getActualState()) {
            i13 = 1;
        } else if (this.f45954b.getActualState()) {
            i13 = !this.f45955c.getActualState() ? 3 : 4;
        } else {
            i13 = 2;
        }
        if (this.f45958f.getActualState()) {
            i14 = 1;
        } else if (!this.f45954b.getActualState()) {
            i14 = 2;
        } else if (this.f45956d.getActualState()) {
            i14 = 4;
        }
        if (this.f45959g.getActualState()) {
            i15 = 1;
        } else if (!this.f45954b.getActualState()) {
            i15 = 2;
        }
        return new F(i13, i14, i15);
    }
}
