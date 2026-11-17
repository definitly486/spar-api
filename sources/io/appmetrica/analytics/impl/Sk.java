package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f46516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rk f46517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3803r5 f46518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC3524g f46519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC3524g f46520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ek f46521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46522g = 0;

    public Sk(C3828s5 c3828s5, Rk rk2, C3803r5 c3803r5, Ca ca3, L2 l13) {
        this.f46516a = c3828s5;
        this.f46518c = c3803r5;
        this.f46519d = ca3;
        this.f46520e = l13;
        this.f46517b = rk2;
    }

    public final synchronized long a() {
        Ek ek2;
        ek2 = this.f46521f;
        return ek2 == null ? 10000000000L : ek2.f45759d - 1;
    }

    public final void b(Ek ek2, C3655l6 c3655l6) {
        if (ek2.f45762g && ek2.f45759d > 0) {
            C3803r5 c3803r5 = this.f46518c;
            C3655l6 c3655l6A = C3655l6.a(c3655l6, EnumC3934wb.EVENT_TYPE_ALIVE);
            Uk uk2 = new Uk();
            uk2.f46630a = ek2.f45759d;
            uk2.f46633d = ek2.f45758c.f45937a;
            long andIncrement = ek2.f45761f.getAndIncrement();
            Vk vk2 = ek2.f45757b;
            vk2.a(Vk.f46690g, Long.valueOf(ek2.f45761f.get()));
            vk2.b();
            uk2.f46631b = andIncrement;
            uk2.f46632c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ek2.f45764i - ek2.f45760e, ek2.f45765j));
            c3803r5.f47961a.f48043n.a(c3655l6A, uk2);
            if (ek2.f45762g) {
                ek2.f45762g = false;
                Vk vk3 = ek2.f45757b;
                vk3.a(Vk.f46692i, Boolean.FALSE);
                vk3.b();
            }
        }
        PublicLogger publicLogger = this.f46516a.f48042m;
        int iOrdinal = ek2.f45758c.f45937a.ordinal();
        if (iOrdinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (iOrdinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ek2) {
            Vk vk4 = ek2.f45757b;
            vk4.getClass();
            vk4.f46695c = new Ab();
            vk4.b();
            ek2.f45763h = null;
        }
    }

    public final synchronized void c(C3655l6 c3655l6) {
        try {
            if (this.f46522g == 0) {
                Ek ekB = this.f46519d.b();
                if (a(ekB, c3655l6)) {
                    this.f46521f = ekB;
                    this.f46522g = 3;
                } else {
                    Ek ekB2 = this.f46520e.b();
                    if (a(ekB2, c3655l6)) {
                        this.f46521f = ekB2;
                        this.f46522g = 2;
                    } else {
                        this.f46521f = null;
                        this.f46522g = 1;
                    }
                }
            }
            int iA = AbstractC3481e8.a(this.f46522g);
            if (iA == 0) {
                this.f46521f = a(c3655l6);
            } else if (iA == 1) {
                b(this.f46521f, c3655l6);
                this.f46521f = a(c3655l6);
            } else if (iA == 2) {
                if (a(this.f46521f, c3655l6)) {
                    Ek ek2 = this.f46521f;
                    long j13 = c3655l6.f47639i;
                    ek2.f45764i = j13;
                    Vk vk2 = ek2.f45757b;
                    vk2.a(Vk.f46687d, Long.valueOf(j13));
                    vk2.b();
                } else {
                    this.f46521f = a(c3655l6);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Ek a(C3655l6 c3655l6) {
        this.f46516a.f48042m.info("Start foreground session", new Object[0]);
        long j13 = c3655l6.f47639i;
        AbstractC3524g abstractC3524g = this.f46519d;
        Fk fk2 = new Fk(j13, c3655l6.f47640j);
        abstractC3524g.getClass();
        Ek ekA = abstractC3524g.a(fk2);
        this.f46522g = 3;
        ((F5) this.f46516a.f48045p).e();
        C3803r5 c3803r5 = this.f46518c;
        c3803r5.f47961a.f48043n.a(C3655l6.a(c3655l6, Ia.F.h()), a(ekA, j13));
        return ekA;
    }

    public static Uk a(Ek ek2, long j13) {
        Uk uk2 = new Uk();
        uk2.f46630a = ek2.f45759d;
        long andIncrement = ek2.f45761f.getAndIncrement();
        Vk vk2 = ek2.f45757b;
        vk2.a(Vk.f46690g, Long.valueOf(ek2.f45761f.get()));
        vk2.b();
        uk2.f46631b = andIncrement;
        Vk vk3 = ek2.f45757b;
        long j14 = j13 - ek2.f45760e;
        ek2.f45765j = j14;
        vk3.a(Vk.f46688e, Long.valueOf(j14));
        uk2.f46632c = TimeUnit.MILLISECONDS.toSeconds(ek2.f45765j);
        uk2.f46633d = ek2.f45758c.f45937a;
        return uk2;
    }

    public final synchronized Ek b(C3655l6 c3655l6) {
        try {
            if (this.f46522g == 0) {
                Ek ekB = this.f46519d.b();
                if (a(ekB, c3655l6)) {
                    this.f46521f = ekB;
                    this.f46522g = 3;
                } else {
                    Ek ekB2 = this.f46520e.b();
                    if (a(ekB2, c3655l6)) {
                        this.f46521f = ekB2;
                        this.f46522g = 2;
                    } else {
                        this.f46521f = null;
                        this.f46522g = 1;
                    }
                }
            }
            if (this.f46522g != 1 && !a(this.f46521f, c3655l6)) {
                this.f46522g = 1;
                this.f46521f = null;
            }
            int iA = AbstractC3481e8.a(this.f46522g);
            if (iA == 1) {
                Ek ek2 = this.f46521f;
                long j13 = c3655l6.f47639i;
                ek2.f45764i = j13;
                Vk vk2 = ek2.f45757b;
                vk2.a(Vk.f46687d, Long.valueOf(j13));
                vk2.b();
                return this.f46521f;
            }
            if (iA != 2) {
                this.f46516a.f48042m.info("Start background session", new Object[0]);
                this.f46522g = 2;
                long j14 = c3655l6.f47639i;
                AbstractC3524g abstractC3524g = this.f46520e;
                Fk fk2 = new Fk(j14, c3655l6.f47640j);
                abstractC3524g.getClass();
                Ek ekA = abstractC3524g.a(fk2);
                if (this.f46516a.f48049t.c()) {
                    C3803r5 c3803r5 = this.f46518c;
                    c3803r5.f47961a.f48043n.a(C3655l6.a(c3655l6, Ia.F.h()), a(ekA, c3655l6.f47639i));
                } else {
                    int i13 = c3655l6.f47634d;
                    EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
                    if (i13 == 6145) {
                        C3803r5 c3803r6 = this.f46518c;
                        c3803r6.f47961a.f48043n.a(c3655l6, a(ekA, j14));
                        C3803r5 c3803r7 = this.f46518c;
                        c3803r7.f47961a.f48043n.a(C3655l6.a(c3655l6, Ia.F.h()), a(ekA, j14));
                    }
                }
                this.f46521f = ekA;
                return ekA;
            }
            return this.f46521f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    public final boolean a(Ek ek2, C3655l6 c3655l6) {
        boolean z13;
        boolean z14;
        if (ek2 == null) {
            return false;
        }
        long j13 = c3655l6.f47639i;
        boolean z15 = ek2.f45759d >= 0;
        if (ek2.f45763h == null) {
            synchronized (ek2) {
                if (ek2.f45763h == null) {
                    try {
                        String asString = ek2.f45756a.f48034e.a(ek2.f45759d, ek2.f45758c.f45937a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ek2.f45763h = new Tk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Tk tk2 = ek2.f45763h;
        if (tk2 != null) {
            C3965xh c3965xh = (C3965xh) ek2.f45756a.f48040k.a();
            List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(Boolean.valueOf(TextUtils.equals(c3965xh.getAnalyticsSdkVersionName(), tk2.f46580a)), Boolean.valueOf(TextUtils.equals(c3965xh.getAnalyticsSdkBuildNumber(), tk2.f46581b)), Boolean.valueOf(TextUtils.equals(c3965xh.getAppVersion(), tk2.f46582c)), Boolean.valueOf(TextUtils.equals(c3965xh.getAppBuildNumber(), tk2.f46583d)), Boolean.valueOf(TextUtils.equals(c3965xh.getOsVersion(), tk2.f46584e)), Boolean.valueOf(tk2.f46585f == c3965xh.getOsApiLevel()), Boolean.valueOf(tk2.f46586g == c3965xh.f48446r));
            if (listRgvfuqvkyq == null || !listRgvfuqvkyq.isEmpty()) {
                Iterator it = listRgvfuqvkyq.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            z13 = false;
                        }
                    }
                }
            }
            z13 = true;
        } else {
            z13 = false;
        }
        long jElapsedRealtime = ek2.f45766k.elapsedRealtime();
        long j14 = ek2.f45764i;
        boolean z16 = jElapsedRealtime < j14;
        long j15 = j13 - j14;
        long j16 = j13 - ek2.f45760e;
        if (z16) {
            z14 = true;
        } else {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Hk hk2 = ek2.f45758c;
            int iIntValue = ((C3965xh) ek2.f45756a.f48040k.a()).f48434f;
            Integer num = hk2.f45940d;
            if (num != null) {
                iIntValue = num.intValue();
            }
            if (j15 >= timeUnit.toMillis(iIntValue) || j16 >= timeUnit.toMillis(Ik.f46039a)) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (z15 && z13 && !z14) {
            return true;
        }
        b(ek2, c3655l6);
        return false;
    }
}
