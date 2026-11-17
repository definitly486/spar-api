package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class Ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f45756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f45757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hk f45758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicLong f45761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Tk f45763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f45766k;

    public Ek(C3828s5 c3828s5, Vk vk2, Hk hk2, SystemTimeProvider systemTimeProvider) {
        this.f45756a = c3828s5;
        this.f45757b = vk2;
        this.f45758c = hk2;
        this.f45766k = systemTimeProvider;
        a();
    }

    public final void a() {
        Hk hk2 = this.f45758c;
        long jElapsedRealtime = this.f45766k.elapsedRealtime();
        Long l13 = hk2.f45939c;
        if (l13 != null) {
            jElapsedRealtime = l13.longValue();
        }
        this.f45760e = jElapsedRealtime;
        Long l14 = this.f45758c.f45938b;
        this.f45759d = l14 == null ? -1L : l14.longValue();
        Long l15 = this.f45758c.f45941e;
        this.f45761f = new AtomicLong(l15 == null ? 0L : l15.longValue());
        Boolean bool = this.f45758c.f45942f;
        this.f45762g = bool == null ? true : bool.booleanValue();
        Long l16 = this.f45758c.f45943g;
        long jLongValue = l16 != null ? l16.longValue() : 0L;
        this.f45764i = jLongValue;
        Hk hk3 = this.f45758c;
        long jLongValue2 = jLongValue - this.f45760e;
        Long l17 = hk3.f45944h;
        if (l17 != null) {
            jLongValue2 = l17.longValue();
        }
        this.f45765j = jLongValue2;
    }

    public final String toString() {
        return "Session{id=" + this.f45759d + ", creationTime=" + this.f45760e + ", currentReportId=" + this.f45761f + ", sessionRequestParams=" + this.f45763h + ", sleepStart=" + this.f45764i + '}';
    }
}
