package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48949a;

    public S(List list) {
        this.f48949a = list;
    }

    public final void a(C4032k c4032k) {
        for (P p13 : this.f48949a) {
            C4033l c4033l = null;
            if (c4032k != null) {
                C4032k c4032k2 = c4032k.f48997a ? c4032k : null;
                if (c4032k2 != null) {
                    c4033l = c4032k2.f48998b;
                }
            }
            p13.a(c4033l);
        }
    }
}
