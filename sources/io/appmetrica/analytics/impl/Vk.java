package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Vk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f46687d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f46688e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46689f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46690g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f46691h = "SESSION_INIT_TIME";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f46692i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C3639kf f46694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ab f46695c;

    public Vk(C3639kf c3639kf, String str) {
        this.f46694b = c3639kf;
        this.f46693a = str;
        Ab ab3 = new Ab();
        try {
            String strH = c3639kf.h(str);
            if (!TextUtils.isEmpty(strH)) {
                ab3 = new Ab(strH);
            }
        } catch (Throwable unused) {
        }
        this.f46695c = ab3;
    }

    public final Vk a(long j13) {
        a(f46691h, Long.valueOf(j13));
        return this;
    }

    public final Vk b(long j13) {
        a(f46688e, Long.valueOf(j13));
        return this;
    }

    public final Long c() {
        return this.f46695c.a(f46691h);
    }

    public final Vk d(long j13) {
        a(f46689f, Long.valueOf(j13));
        return this;
    }

    public final Long e() {
        return this.f46695c.a(f46690g);
    }

    public final Long f() {
        return this.f46695c.a(f46689f);
    }

    public final Long g() {
        return this.f46695c.a(f46687d);
    }

    public final boolean h() {
        return this.f46695c.length() > 0;
    }

    public final Boolean i() {
        Ab ab3 = this.f46695c;
        ab3.getClass();
        try {
            return Boolean.valueOf(ab3.getBoolean(f46692i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Vk a(boolean z13) {
        a(f46692i, Boolean.valueOf(z13));
        return this;
    }

    public final void b() {
        this.f46694b.e(this.f46693a, this.f46695c.toString());
        this.f46694b.b();
    }

    public final Vk c(long j13) {
        a(f46690g, Long.valueOf(j13));
        return this;
    }

    public final Long d() {
        return this.f46695c.a(f46688e);
    }

    public final Vk e(long j13) {
        a(f46687d, Long.valueOf(j13));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f46695c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f46695c = new Ab();
        b();
    }
}
