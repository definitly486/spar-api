package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f46470a;

    public Rk(uo uoVar) {
        this.f46470a = uoVar;
    }

    public final long a() {
        long jOptLong;
        uo uoVar = this.f46470a;
        synchronized (uoVar) {
            jOptLong = uoVar.f48216a.a().optLong("session_id", -1L);
        }
        long j13 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f46470a.c(j13);
        return j13;
    }
}
