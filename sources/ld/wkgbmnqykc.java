package ld;

import android.content.Context;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import md.agtfadlqog;
import nd.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private iobyxmoadg f62112eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f62113gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.perf.config.iobyxmoadg f62114iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f62115ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private iobyxmoadg f62116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f62117zoijcleaow;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private long f62120btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private long f62121dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f62122eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private double f62123gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final md.iobyxmoadg f62124iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private md.dxjokdxxww f62125lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private md.dxjokdxxww f62126nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Timer f62127ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private md.dxjokdxxww f62128wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f62129zoijcleaow;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private static final gd.iobyxmoadg f62119gtknphoqwx = gd.iobyxmoadg.eablkybsjg();

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private static final long f62118draadjrbmk = TimeUnit.SECONDS.toMicros(1);

        iobyxmoadg(md.dxjokdxxww dxjokdxxwwVar, long j13, md.iobyxmoadg iobyxmoadgVar, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar2, String str, boolean z13) {
            this.f62124iobyxmoadg = iobyxmoadgVar;
            this.f62122eablkybsjg = j13;
            this.f62128wkgbmnqykc = dxjokdxxwwVar;
            this.f62123gxszxtbevo = j13;
            this.f62127ppxfxbqfkf = iobyxmoadgVar.iobyxmoadg();
            lqeggnwhkg(iobyxmoadgVar2, str, z13);
            this.f62129zoijcleaow = z13;
        }

        private static long eablkybsjg(com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, String str) {
            return str == "Trace" ? iobyxmoadgVar.iozdgvuglv() : iobyxmoadgVar.oxmwwwfdhm();
        }

        private static long gxszxtbevo(com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, String str) {
            return str == "Trace" ? iobyxmoadgVar.zdlpuopuiu() : iobyxmoadgVar.zdlpuopuiu();
        }

        private void lqeggnwhkg(com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, String str, boolean z13) {
            long jGxszxtbevo = gxszxtbevo(iobyxmoadgVar, str);
            long jEablkybsjg = eablkybsjg(iobyxmoadgVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            md.dxjokdxxww dxjokdxxwwVar = new md.dxjokdxxww(jEablkybsjg, jGxszxtbevo, timeUnit);
            this.f62125lqeggnwhkg = dxjokdxxwwVar;
            this.f62121dxjokdxxww = jEablkybsjg;
            if (z13) {
                f62119gtknphoqwx.zoijcleaow("Foreground %s logging rate:%f, burst capacity:%d", str, dxjokdxxwwVar, Long.valueOf(jEablkybsjg));
            }
            long jWkgbmnqykc = wkgbmnqykc(iobyxmoadgVar, str);
            long jPpxfxbqfkf = ppxfxbqfkf(iobyxmoadgVar, str);
            md.dxjokdxxww dxjokdxxwwVar2 = new md.dxjokdxxww(jPpxfxbqfkf, jWkgbmnqykc, timeUnit);
            this.f62126nufgyqmvbu = dxjokdxxwwVar2;
            this.f62120btonecajqb = jPpxfxbqfkf;
            if (z13) {
                f62119gtknphoqwx.zoijcleaow("Background %s logging rate:%f, capacity:%d", str, dxjokdxxwwVar2, Long.valueOf(jPpxfxbqfkf));
            }
        }

        private static long ppxfxbqfkf(com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, String str) {
            return str == "Trace" ? iobyxmoadgVar.yadqdtsiqt() : iobyxmoadgVar.vdvldrhtss();
        }

        private static long wkgbmnqykc(com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar, String str) {
            return str == "Trace" ? iobyxmoadgVar.zdlpuopuiu() : iobyxmoadgVar.zdlpuopuiu();
        }

        synchronized void iobyxmoadg(boolean z13) {
            try {
                this.f62128wkgbmnqykc = z13 ? this.f62125lqeggnwhkg : this.f62126nufgyqmvbu;
                this.f62122eablkybsjg = z13 ? this.f62121dxjokdxxww : this.f62120btonecajqb;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized boolean zoijcleaow(nd.dxjokdxxww dxjokdxxwwVar) {
            try {
                Timer timerIobyxmoadg = this.f62124iobyxmoadg.iobyxmoadg();
                double dGxszxtbevo = (this.f62127ppxfxbqfkf.gxszxtbevo(timerIobyxmoadg) * this.f62128wkgbmnqykc.iobyxmoadg()) / f62118draadjrbmk;
                if (dGxszxtbevo > 0.0d) {
                    this.f62123gxszxtbevo = Math.min(this.f62123gxszxtbevo + dGxszxtbevo, this.f62122eablkybsjg);
                    this.f62127ppxfxbqfkf = timerIobyxmoadg;
                }
                double d13 = this.f62123gxszxtbevo;
                if (d13 >= 1.0d) {
                    this.f62123gxszxtbevo = d13 - 1.0d;
                    return true;
                }
                if (this.f62129zoijcleaow) {
                    f62119gtknphoqwx.btonecajqb("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public wkgbmnqykc(Context context, md.dxjokdxxww dxjokdxxwwVar, long j13) {
        this(dxjokdxxwwVar, j13, new md.iobyxmoadg(), zoijcleaow(), zoijcleaow(), com.google.firebase.perf.config.iobyxmoadg.lqeggnwhkg());
        this.f62113gxszxtbevo = agtfadlqog.zoijcleaow(context);
    }

    private boolean eablkybsjg() {
        return this.f62117zoijcleaow < this.f62114iobyxmoadg.kcexrzcfyt();
    }

    private boolean gxszxtbevo() {
        return this.f62117zoijcleaow < this.f62114iobyxmoadg.lmojexxdyd();
    }

    private boolean ppxfxbqfkf(List list) {
        return list.size() > 0 && ((nd.gtknphoqwx) list.get(0)).wflxmlrfwp() > 0 && ((nd.gtknphoqwx) list.get(0)).draadjrbmk(0) == draadjrbmk.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean wkgbmnqykc() {
        return this.f62115ppxfxbqfkf < this.f62114iobyxmoadg.gxszxtbevo();
    }

    static double zoijcleaow() {
        return new Random().nextDouble();
    }

    boolean btonecajqb(nd.dxjokdxxww dxjokdxxwwVar) {
        return (!dxjokdxxwwVar.wkgbmnqykc() || (!(dxjokdxxwwVar.eablkybsjg().getName().equals(md.ppxfxbqfkf.FOREGROUND_TRACE_NAME.toString()) || dxjokdxxwwVar.eablkybsjg().getName().equals(md.ppxfxbqfkf.BACKGROUND_TRACE_NAME.toString())) || dxjokdxxwwVar.eablkybsjg().cqumvgiudr() <= 0)) && !dxjokdxxwwVar.iobyxmoadg();
    }

    protected boolean dxjokdxxww(nd.dxjokdxxww dxjokdxxwwVar) {
        return dxjokdxxwwVar.wkgbmnqykc() && dxjokdxxwwVar.eablkybsjg().getName().startsWith("_st_") && dxjokdxxwwVar.eablkybsjg().yggfygwlhe("Hosting_activity");
    }

    void iobyxmoadg(boolean z13) {
        this.f62116wkgbmnqykc.iobyxmoadg(z13);
        this.f62112eablkybsjg.iobyxmoadg(z13);
    }

    boolean lqeggnwhkg(nd.dxjokdxxww dxjokdxxwwVar) {
        if (!btonecajqb(dxjokdxxwwVar)) {
            return false;
        }
        if (dxjokdxxwwVar.zoijcleaow()) {
            return !this.f62112eablkybsjg.zoijcleaow(dxjokdxxwwVar);
        }
        if (dxjokdxxwwVar.wkgbmnqykc()) {
            return !this.f62116wkgbmnqykc.zoijcleaow(dxjokdxxwwVar);
        }
        return true;
    }

    boolean nufgyqmvbu(nd.dxjokdxxww dxjokdxxwwVar) {
        if (dxjokdxxwwVar.wkgbmnqykc() && !gxszxtbevo() && !ppxfxbqfkf(dxjokdxxwwVar.eablkybsjg().yadqdtsiqt())) {
            return false;
        }
        if (!dxjokdxxww(dxjokdxxwwVar) || wkgbmnqykc() || ppxfxbqfkf(dxjokdxxwwVar.eablkybsjg().yadqdtsiqt())) {
            return !dxjokdxxwwVar.zoijcleaow() || eablkybsjg() || ppxfxbqfkf(dxjokdxxwwVar.ppxfxbqfkf().zynmafqrjb());
        }
        return false;
    }

    wkgbmnqykc(md.dxjokdxxww dxjokdxxwwVar, long j13, md.iobyxmoadg iobyxmoadgVar, double d13, double d14, com.google.firebase.perf.config.iobyxmoadg iobyxmoadgVar2) {
        this.f62116wkgbmnqykc = null;
        this.f62112eablkybsjg = null;
        boolean z13 = false;
        this.f62113gxszxtbevo = false;
        agtfadlqog.iobyxmoadg(0.0d <= d13 && d13 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d14 && d14 < 1.0d) {
            z13 = true;
        }
        agtfadlqog.iobyxmoadg(z13, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f62117zoijcleaow = d13;
        this.f62115ppxfxbqfkf = d14;
        this.f62114iobyxmoadg = iobyxmoadgVar2;
        this.f62116wkgbmnqykc = new iobyxmoadg(dxjokdxxwwVar, j13, iobyxmoadgVar, iobyxmoadgVar2, "Trace", this.f62113gxszxtbevo);
        this.f62112eablkybsjg = new iobyxmoadg(dxjokdxxwwVar, j13, iobyxmoadgVar, iobyxmoadgVar2, "Network", this.f62113gxszxtbevo);
    }
}
