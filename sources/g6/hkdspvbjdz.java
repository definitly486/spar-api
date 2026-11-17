package g6;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class hkdspvbjdz {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final iobyxmoadg f36394wflxmlrfwp = new iobyxmoadg(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final zoijcleaow f36395btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final int f36396draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final long f36397dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.work.zoijcleaow f36398eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final long f36399gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f36400gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final UUID f36401iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f36402lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final wkgbmnqykc f36403nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f36404ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.work.zoijcleaow f36405wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ppxfxbqfkf f36406zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public enum ppxfxbqfkf {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean wkgbmnqykc() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f36414iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f36415zoijcleaow;

        public zoijcleaow(long j13, long j14) {
            this.f36414iobyxmoadg = j13;
            this.f36415zoijcleaow = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow.class, obj.getClass())) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zoijcleaowVar.f36414iobyxmoadg == this.f36414iobyxmoadg && zoijcleaowVar.f36415zoijcleaow == this.f36415zoijcleaow;
        }

        public int hashCode() {
            return (Long.hashCode(this.f36414iobyxmoadg) * 31) + Long.hashCode(this.f36415zoijcleaow);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f36414iobyxmoadg + ", flexIntervalMillis=" + this.f36415zoijcleaow + '}';
        }
    }

    public hkdspvbjdz(UUID id2, ppxfxbqfkf state, Set tags, androidx.work.zoijcleaow outputData, androidx.work.zoijcleaow progress, int i13, int i14, wkgbmnqykc constraints, long j13, zoijcleaow zoijcleaowVar, long j14, int i15) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tags, "tags");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outputData, "outputData");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(progress, "progress");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
        this.f36401iobyxmoadg = id2;
        this.f36406zoijcleaow = state;
        this.f36404ppxfxbqfkf = tags;
        this.f36405wkgbmnqykc = outputData;
        this.f36398eablkybsjg = progress;
        this.f36400gxszxtbevo = i13;
        this.f36402lqeggnwhkg = i14;
        this.f36403nufgyqmvbu = constraints;
        this.f36397dxjokdxxww = j13;
        this.f36395btonecajqb = zoijcleaowVar;
        this.f36399gtknphoqwx = j14;
        this.f36396draadjrbmk = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(hkdspvbjdz.class, obj.getClass())) {
            return false;
        }
        hkdspvbjdz hkdspvbjdzVar = (hkdspvbjdz) obj;
        if (this.f36400gxszxtbevo == hkdspvbjdzVar.f36400gxszxtbevo && this.f36402lqeggnwhkg == hkdspvbjdzVar.f36402lqeggnwhkg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36401iobyxmoadg, hkdspvbjdzVar.f36401iobyxmoadg) && this.f36406zoijcleaow == hkdspvbjdzVar.f36406zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36405wkgbmnqykc, hkdspvbjdzVar.f36405wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36403nufgyqmvbu, hkdspvbjdzVar.f36403nufgyqmvbu) && this.f36397dxjokdxxww == hkdspvbjdzVar.f36397dxjokdxxww && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36395btonecajqb, hkdspvbjdzVar.f36395btonecajqb) && this.f36399gtknphoqwx == hkdspvbjdzVar.f36399gtknphoqwx && this.f36396draadjrbmk == hkdspvbjdzVar.f36396draadjrbmk && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36404ppxfxbqfkf, hkdspvbjdzVar.f36404ppxfxbqfkf)) {
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f36398eablkybsjg, hkdspvbjdzVar.f36398eablkybsjg);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f36401iobyxmoadg.hashCode() * 31) + this.f36406zoijcleaow.hashCode()) * 31) + this.f36405wkgbmnqykc.hashCode()) * 31) + this.f36404ppxfxbqfkf.hashCode()) * 31) + this.f36398eablkybsjg.hashCode()) * 31) + this.f36400gxszxtbevo) * 31) + this.f36402lqeggnwhkg) * 31) + this.f36403nufgyqmvbu.hashCode()) * 31) + Long.hashCode(this.f36397dxjokdxxww)) * 31;
        zoijcleaow zoijcleaowVar = this.f36395btonecajqb;
        return ((((iHashCode + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0)) * 31) + Long.hashCode(this.f36399gtknphoqwx)) * 31) + Integer.hashCode(this.f36396draadjrbmk);
    }

    public final ppxfxbqfkf iobyxmoadg() {
        return this.f36406zoijcleaow;
    }

    public String toString() {
        return "WorkInfo{id='" + this.f36401iobyxmoadg + "', state=" + this.f36406zoijcleaow + ", outputData=" + this.f36405wkgbmnqykc + ", tags=" + this.f36404ppxfxbqfkf + ", progress=" + this.f36398eablkybsjg + ", runAttemptCount=" + this.f36400gxszxtbevo + ", generation=" + this.f36402lqeggnwhkg + ", constraints=" + this.f36403nufgyqmvbu + ", initialDelayMillis=" + this.f36397dxjokdxxww + ", periodicityInfo=" + this.f36395btonecajqb + ", nextScheduleTimeMillis=" + this.f36399gtknphoqwx + "}, stopReason=" + this.f36396draadjrbmk;
    }
}
