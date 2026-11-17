package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3575i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47413a = new HashMap();

    public final synchronized C3550h0 a(C3654l5 c3654l5, PublicLogger publicLogger, C3639kf c3639kf) {
        C3550h0 c3550h0;
        c3550h0 = (C3550h0) this.f47413a.get(c3654l5.toString());
        if (c3550h0 == null) {
            C3525g0 c3525g0D = c3639kf.d();
            c3550h0 = new C3550h0(c3525g0D.f47268a, c3525g0D.f47269b, new C3819rl(publicLogger, "[App Environment]"));
            this.f47413a.put(c3654l5.toString(), c3550h0);
        }
        return c3550h0;
    }

    public final synchronized void a(C3525g0 c3525g0, C3639kf c3639kf) {
        c3639kf.a(c3525g0).b();
    }
}
