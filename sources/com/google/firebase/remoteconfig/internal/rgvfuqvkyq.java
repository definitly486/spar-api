package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final Date f24778eablkybsjg = new Date(-1);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final Date f24779gxszxtbevo = new Date(-1);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences f24780iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f24783zoijcleaow = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f24781ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f24782wkgbmnqykc = new Object();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f24784iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Date f24785zoijcleaow;

        iobyxmoadg(int i13, Date date) {
            this.f24784iobyxmoadg = i13;
            this.f24785zoijcleaow = date;
        }

        Date iobyxmoadg() {
            return this.f24785zoijcleaow;
        }

        int zoijcleaow() {
            return this.f24784iobyxmoadg;
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f24786iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Date f24787zoijcleaow;

        public zoijcleaow(int i13, Date date) {
            this.f24786iobyxmoadg = i13;
            this.f24787zoijcleaow = date;
        }

        Date iobyxmoadg() {
            return this.f24787zoijcleaow;
        }

        int zoijcleaow() {
            return this.f24786iobyxmoadg;
        }
    }

    public rgvfuqvkyq(SharedPreferences sharedPreferences) {
        this.f24780iobyxmoadg = sharedPreferences;
    }

    void agtfadlqog(long j13) {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putLong("last_template_version", j13).apply();
        }
    }

    void btonecajqb() {
        ojitshcjhn(0, f24779gxszxtbevo);
    }

    public void draadjrbmk(pd.gtknphoqwx gtknphoqwxVar) {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putLong("fetch_timeout_in_seconds", gtknphoqwxVar.iobyxmoadg()).putLong("minimum_fetch_interval_in_seconds", gtknphoqwxVar.zoijcleaow()).commit();
        }
    }

    void dxjokdxxww() {
        gtknphoqwx(0, f24779gxszxtbevo);
    }

    Date eablkybsjg() {
        return new Date(this.f24780iobyxmoadg.getLong("last_fetch_time_in_millis", -1L));
    }

    void gtknphoqwx(int i13, Date date) {
        synchronized (this.f24781ppxfxbqfkf) {
            this.f24780iobyxmoadg.edit().putInt("num_failed_fetches", i13).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    long gxszxtbevo() {
        return this.f24780iobyxmoadg.getLong("last_template_version", 0L);
    }

    iobyxmoadg iobyxmoadg() {
        iobyxmoadg iobyxmoadgVar;
        synchronized (this.f24781ppxfxbqfkf) {
            iobyxmoadgVar = new iobyxmoadg(this.f24780iobyxmoadg.getInt("num_failed_fetches", 0), new Date(this.f24780iobyxmoadg.getLong("backoff_end_time_in_millis", -1L)));
        }
        return iobyxmoadgVar;
    }

    public long lqeggnwhkg() {
        return this.f24780iobyxmoadg.getLong("minimum_fetch_interval_in_seconds", wflxmlrfwp.f24800btonecajqb);
    }

    public zoijcleaow nufgyqmvbu() {
        zoijcleaow zoijcleaowVar;
        synchronized (this.f24782wkgbmnqykc) {
            zoijcleaowVar = new zoijcleaow(this.f24780iobyxmoadg.getInt("num_failed_realtime_streams", 0), new Date(this.f24780iobyxmoadg.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return zoijcleaowVar;
    }

    void ojitshcjhn(int i13, Date date) {
        synchronized (this.f24782wkgbmnqykc) {
            this.f24780iobyxmoadg.edit().putInt("num_failed_realtime_streams", i13).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void oxmwwwfdhm() {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    public pd.btonecajqb ppxfxbqfkf() {
        jyumaefscl jyumaefsclVarIobyxmoadg;
        synchronized (this.f24783zoijcleaow) {
            long j13 = this.f24780iobyxmoadg.getLong("last_fetch_time_in_millis", -1L);
            int i13 = this.f24780iobyxmoadg.getInt("last_fetch_status", 0);
            jyumaefsclVarIobyxmoadg = jyumaefscl.zoijcleaow().ppxfxbqfkf(i13).wkgbmnqykc(j13).zoijcleaow(new pd.gtknphoqwx.zoijcleaow().wkgbmnqykc(this.f24780iobyxmoadg.getLong("fetch_timeout_in_seconds", 60L)).eablkybsjg(this.f24780iobyxmoadg.getLong("minimum_fetch_interval_in_seconds", wflxmlrfwp.f24800btonecajqb)).ppxfxbqfkf()).iobyxmoadg();
        }
        return jyumaefsclVarIobyxmoadg;
    }

    void rgvfuqvkyq() {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void vdvldrhtss(Date date) {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void wflxmlrfwp(String str) {
        synchronized (this.f24783zoijcleaow) {
            this.f24780iobyxmoadg.edit().putString("last_fetch_etag", str).apply();
        }
    }

    String wkgbmnqykc() {
        return this.f24780iobyxmoadg.getString("last_fetch_etag", null);
    }

    public long zoijcleaow() {
        return this.f24780iobyxmoadg.getLong("fetch_timeout_in_seconds", 60L);
    }
}
