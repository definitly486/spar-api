package p6;

import androidx.work.OverwritingInputMerger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g6.hkdspvbjdz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final iobyxmoadg f75785esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final String f75786lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    public static final ojitshcjhn.iobyxmoadg f75787pmvmpeiblj;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public long f75788agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public g6.wkgbmnqykc f75789btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private String f75790cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public g6.iobyxmoadg f75791draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public long f75792dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public androidx.work.zoijcleaow f75793eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public int f75794gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public androidx.work.zoijcleaow f75795gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f75796iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f75797iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f75798jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f75799kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public long f75800lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public long f75801nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    public long f75802ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public g6.cdpycssgdh f75803oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public String f75804ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public long f75805rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public boolean f75806vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public long f75807wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public String f75808wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f75809yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f75810zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public hkdspvbjdz.ppxfxbqfkf f75811zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg(boolean z13, int i13, g6.iobyxmoadg backoffPolicy, long j13, long j14, int i14, boolean z14, long j15, long j16, long j17, long j18) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backoffPolicy, "backoffPolicy");
            if (j18 != Long.MAX_VALUE && z14) {
                return i14 == 0 ? j18 : zg.gtknphoqwx.lqeggnwhkg(j18, 900000 + j14);
            }
            if (z13) {
                return j14 + zg.gtknphoqwx.gtknphoqwx(backoffPolicy == g6.iobyxmoadg.LINEAR ? ((long) i13) * j13 : (long) Math.scalb(j13, i13 - 1), 18000000L);
            }
            if (!z14) {
                if (j14 == -1) {
                    return Long.MAX_VALUE;
                }
                return j14 + j15;
            }
            long j19 = i14 == 0 ? j14 + j15 : j14 + j17;
            if (j16 != j17 && i14 == 0) {
                j19 += j17 - j16;
            }
            return j19;
        }

        private iobyxmoadg() {
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private final long f75812agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private long f75813btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f75814draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private g6.iobyxmoadg f75815dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final long f75816eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private long f75817gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final long f75818gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f75819iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final g6.wkgbmnqykc f75820lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final int f75821nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private final int f75822ojitshcjhn;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final androidx.work.zoijcleaow f75823ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private final List f75824rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private final List f75825vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final int f75826wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f75827wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final hkdspvbjdz.ppxfxbqfkf f75828zoijcleaow;

        public ppxfxbqfkf(String id2, hkdspvbjdz.ppxfxbqfkf state, androidx.work.zoijcleaow output, long j13, long j14, long j15, g6.wkgbmnqykc constraints, int i13, g6.iobyxmoadg backoffPolicy, long j16, long j17, int i14, int i15, long j18, int i16, List tags, List progress) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backoffPolicy, "backoffPolicy");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tags, "tags");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(progress, "progress");
            this.f75819iobyxmoadg = id2;
            this.f75828zoijcleaow = state;
            this.f75823ppxfxbqfkf = output;
            this.f75827wkgbmnqykc = j13;
            this.f75816eablkybsjg = j14;
            this.f75818gxszxtbevo = j15;
            this.f75820lqeggnwhkg = constraints;
            this.f75821nufgyqmvbu = i13;
            this.f75815dxjokdxxww = backoffPolicy;
            this.f75813btonecajqb = j16;
            this.f75817gtknphoqwx = j17;
            this.f75814draadjrbmk = i14;
            this.f75826wflxmlrfwp = i15;
            this.f75812agtfadlqog = j18;
            this.f75822ojitshcjhn = i16;
            this.f75824rgvfuqvkyq = tags;
            this.f75825vdvldrhtss = progress;
        }

        private final long iobyxmoadg() {
            if (this.f75828zoijcleaow == hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
                return yggfygwlhe.f75785esjtqupxsv.iobyxmoadg(ppxfxbqfkf(), this.f75821nufgyqmvbu, this.f75815dxjokdxxww, this.f75813btonecajqb, this.f75817gtknphoqwx, this.f75814draadjrbmk, wkgbmnqykc(), this.f75827wkgbmnqykc, this.f75818gxszxtbevo, this.f75816eablkybsjg, this.f75812agtfadlqog);
            }
            return Long.MAX_VALUE;
        }

        private final hkdspvbjdz.zoijcleaow zoijcleaow() {
            long j13 = this.f75816eablkybsjg;
            if (j13 != 0) {
                return new hkdspvbjdz.zoijcleaow(j13, this.f75818gxszxtbevo);
            }
            return null;
        }

        public final hkdspvbjdz eablkybsjg() {
            androidx.work.zoijcleaow zoijcleaowVar = !this.f75825vdvldrhtss.isEmpty() ? (androidx.work.zoijcleaow) this.f75825vdvldrhtss.get(0) : androidx.work.zoijcleaow.f14017ppxfxbqfkf;
            UUID uuidFromString = UUID.fromString(this.f75819iobyxmoadg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uuidFromString, "fromString(id)");
            return new hkdspvbjdz(uuidFromString, this.f75828zoijcleaow, new HashSet(this.f75824rgvfuqvkyq), this.f75823ppxfxbqfkf, zoijcleaowVar, this.f75821nufgyqmvbu, this.f75826wflxmlrfwp, this.f75820lqeggnwhkg, this.f75827wkgbmnqykc, zoijcleaow(), iobyxmoadg(), this.f75822ojitshcjhn);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ppxfxbqfkf)) {
                return false;
            }
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75819iobyxmoadg, ppxfxbqfkfVar.f75819iobyxmoadg) && this.f75828zoijcleaow == ppxfxbqfkfVar.f75828zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75823ppxfxbqfkf, ppxfxbqfkfVar.f75823ppxfxbqfkf) && this.f75827wkgbmnqykc == ppxfxbqfkfVar.f75827wkgbmnqykc && this.f75816eablkybsjg == ppxfxbqfkfVar.f75816eablkybsjg && this.f75818gxszxtbevo == ppxfxbqfkfVar.f75818gxszxtbevo && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75820lqeggnwhkg, ppxfxbqfkfVar.f75820lqeggnwhkg) && this.f75821nufgyqmvbu == ppxfxbqfkfVar.f75821nufgyqmvbu && this.f75815dxjokdxxww == ppxfxbqfkfVar.f75815dxjokdxxww && this.f75813btonecajqb == ppxfxbqfkfVar.f75813btonecajqb && this.f75817gtknphoqwx == ppxfxbqfkfVar.f75817gtknphoqwx && this.f75814draadjrbmk == ppxfxbqfkfVar.f75814draadjrbmk && this.f75826wflxmlrfwp == ppxfxbqfkfVar.f75826wflxmlrfwp && this.f75812agtfadlqog == ppxfxbqfkfVar.f75812agtfadlqog && this.f75822ojitshcjhn == ppxfxbqfkfVar.f75822ojitshcjhn && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75824rgvfuqvkyq, ppxfxbqfkfVar.f75824rgvfuqvkyq) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75825vdvldrhtss, ppxfxbqfkfVar.f75825vdvldrhtss);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f75819iobyxmoadg.hashCode() * 31) + this.f75828zoijcleaow.hashCode()) * 31) + this.f75823ppxfxbqfkf.hashCode()) * 31) + Long.hashCode(this.f75827wkgbmnqykc)) * 31) + Long.hashCode(this.f75816eablkybsjg)) * 31) + Long.hashCode(this.f75818gxszxtbevo)) * 31) + this.f75820lqeggnwhkg.hashCode()) * 31) + Integer.hashCode(this.f75821nufgyqmvbu)) * 31) + this.f75815dxjokdxxww.hashCode()) * 31) + Long.hashCode(this.f75813btonecajqb)) * 31) + Long.hashCode(this.f75817gtknphoqwx)) * 31) + Integer.hashCode(this.f75814draadjrbmk)) * 31) + Integer.hashCode(this.f75826wflxmlrfwp)) * 31) + Long.hashCode(this.f75812agtfadlqog)) * 31) + Integer.hashCode(this.f75822ojitshcjhn)) * 31) + this.f75824rgvfuqvkyq.hashCode()) * 31) + this.f75825vdvldrhtss.hashCode();
        }

        public final boolean ppxfxbqfkf() {
            return this.f75828zoijcleaow == hkdspvbjdz.ppxfxbqfkf.ENQUEUED && this.f75821nufgyqmvbu > 0;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f75819iobyxmoadg + ", state=" + this.f75828zoijcleaow + ", output=" + this.f75823ppxfxbqfkf + ", initialDelay=" + this.f75827wkgbmnqykc + ", intervalDuration=" + this.f75816eablkybsjg + ", flexDuration=" + this.f75818gxszxtbevo + ", constraints=" + this.f75820lqeggnwhkg + ", runAttemptCount=" + this.f75821nufgyqmvbu + ", backoffPolicy=" + this.f75815dxjokdxxww + ", backoffDelayDuration=" + this.f75813btonecajqb + ", lastEnqueueTime=" + this.f75817gtknphoqwx + ", periodCount=" + this.f75814draadjrbmk + ", generation=" + this.f75826wflxmlrfwp + ", nextScheduleTimeOverride=" + this.f75812agtfadlqog + ", stopReason=" + this.f75822ojitshcjhn + ", tags=" + this.f75824rgvfuqvkyq + ", progress=" + this.f75825vdvldrhtss + ')';
        }

        public final boolean wkgbmnqykc() {
            return this.f75816eablkybsjg != 0;
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public String f75829iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public hkdspvbjdz.ppxfxbqfkf f75830zoijcleaow;

        public zoijcleaow(String id2, hkdspvbjdz.ppxfxbqfkf state) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
            this.f75829iobyxmoadg = id2;
            this.f75830zoijcleaow = state;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75829iobyxmoadg, zoijcleaowVar.f75829iobyxmoadg) && this.f75830zoijcleaow == zoijcleaowVar.f75830zoijcleaow;
        }

        public int hashCode() {
            return (this.f75829iobyxmoadg.hashCode() * 31) + this.f75830zoijcleaow.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f75829iobyxmoadg + ", state=" + this.f75830zoijcleaow + ')';
        }
    }

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("WorkSpec");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"WorkSpec\")");
        f75786lereixgezr = strDxjokdxxww;
        f75787pmvmpeiblj = new ojitshcjhn.iobyxmoadg() { // from class: p6.zdlpuopuiu
            @Override // ojitshcjhn.iobyxmoadg
            public final Object apply(Object obj) {
                return yggfygwlhe.zoijcleaow((List) obj);
            }
        };
    }

    public yggfygwlhe(String id2, hkdspvbjdz.ppxfxbqfkf state, String workerClassName, String inputMergerClassName, androidx.work.zoijcleaow input, androidx.work.zoijcleaow output, long j13, long j14, long j15, g6.wkgbmnqykc constraints, int i13, g6.iobyxmoadg backoffPolicy, long j16, long j17, long j18, long j19, boolean z13, g6.cdpycssgdh outOfQuotaPolicy, int i14, int i15, long j23, int i16, int i17, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClassName, "workerClassName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f75796iobyxmoadg = id2;
        this.f75811zoijcleaow = state;
        this.f75804ppxfxbqfkf = workerClassName;
        this.f75808wkgbmnqykc = inputMergerClassName;
        this.f75793eablkybsjg = input;
        this.f75795gxszxtbevo = output;
        this.f75800lqeggnwhkg = j13;
        this.f75801nufgyqmvbu = j14;
        this.f75792dxjokdxxww = j15;
        this.f75789btonecajqb = constraints;
        this.f75794gtknphoqwx = i13;
        this.f75791draadjrbmk = backoffPolicy;
        this.f75807wflxmlrfwp = j16;
        this.f75788agtfadlqog = j17;
        this.f75802ojitshcjhn = j18;
        this.f75805rgvfuqvkyq = j19;
        this.f75806vdvldrhtss = z13;
        this.f75803oxmwwwfdhm = outOfQuotaPolicy;
        this.f75799kcexrzcfyt = i14;
        this.f75810zdlpuopuiu = i15;
        this.f75809yggfygwlhe = j23;
        this.f75798jyumaefscl = i16;
        this.f75797iwizpuwonk = i17;
        this.f75790cqumvgiudr = str;
    }

    public static /* synthetic */ yggfygwlhe eablkybsjg(yggfygwlhe yggfygwlheVar, String str, hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar, String str2, String str3, androidx.work.zoijcleaow zoijcleaowVar, androidx.work.zoijcleaow zoijcleaowVar2, long j13, long j14, long j15, g6.wkgbmnqykc wkgbmnqykcVar, int i13, g6.iobyxmoadg iobyxmoadgVar, long j16, long j17, long j18, long j19, boolean z13, g6.cdpycssgdh cdpycssgdhVar, int i14, int i15, long j23, int i16, int i17, String str4, int i18, Object obj) {
        String str5 = (i18 & 1) != 0 ? yggfygwlheVar.f75796iobyxmoadg : str;
        hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar2 = (i18 & 2) != 0 ? yggfygwlheVar.f75811zoijcleaow : ppxfxbqfkfVar;
        String str6 = (i18 & 4) != 0 ? yggfygwlheVar.f75804ppxfxbqfkf : str2;
        String str7 = (i18 & 8) != 0 ? yggfygwlheVar.f75808wkgbmnqykc : str3;
        androidx.work.zoijcleaow zoijcleaowVar3 = (i18 & 16) != 0 ? yggfygwlheVar.f75793eablkybsjg : zoijcleaowVar;
        androidx.work.zoijcleaow zoijcleaowVar4 = (i18 & 32) != 0 ? yggfygwlheVar.f75795gxszxtbevo : zoijcleaowVar2;
        long j24 = (i18 & 64) != 0 ? yggfygwlheVar.f75800lqeggnwhkg : j13;
        long j25 = (i18 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? yggfygwlheVar.f75801nufgyqmvbu : j14;
        long j26 = (i18 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? yggfygwlheVar.f75792dxjokdxxww : j15;
        g6.wkgbmnqykc wkgbmnqykcVar2 = (i18 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? yggfygwlheVar.f75789btonecajqb : wkgbmnqykcVar;
        return yggfygwlheVar.wkgbmnqykc(str5, ppxfxbqfkfVar2, str6, str7, zoijcleaowVar3, zoijcleaowVar4, j24, j25, j26, wkgbmnqykcVar2, (i18 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? yggfygwlheVar.f75794gtknphoqwx : i13, (i18 & 2048) != 0 ? yggfygwlheVar.f75791draadjrbmk : iobyxmoadgVar, (i18 & 4096) != 0 ? yggfygwlheVar.f75807wflxmlrfwp : j16, (i18 & 8192) != 0 ? yggfygwlheVar.f75788agtfadlqog : j17, (i18 & 16384) != 0 ? yggfygwlheVar.f75802ojitshcjhn : j18, (i18 & 32768) != 0 ? yggfygwlheVar.f75805rgvfuqvkyq : j19, (i18 & 65536) != 0 ? yggfygwlheVar.f75806vdvldrhtss : z13, (131072 & i18) != 0 ? yggfygwlheVar.f75803oxmwwwfdhm : cdpycssgdhVar, (i18 & 262144) != 0 ? yggfygwlheVar.f75799kcexrzcfyt : i14, (i18 & 524288) != 0 ? yggfygwlheVar.f75810zdlpuopuiu : i15, (i18 & 1048576) != 0 ? yggfygwlheVar.f75809yggfygwlhe : j23, (i18 & 2097152) != 0 ? yggfygwlheVar.f75798jyumaefscl : i16, (4194304 & i18) != 0 ? yggfygwlheVar.f75797iwizpuwonk : i17, (i18 & 8388608) != 0 ? yggfygwlheVar.f75790cqumvgiudr : str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List zoijcleaow(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ppxfxbqfkf) it.next()).eablkybsjg());
        }
        return arrayList;
    }

    public final boolean agtfadlqog() {
        return this.f75801nufgyqmvbu != 0;
    }

    public final int btonecajqb() {
        return this.f75797iwizpuwonk;
    }

    public final boolean draadjrbmk() {
        return !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(g6.wkgbmnqykc.f36462gtknphoqwx, this.f75789btonecajqb);
    }

    public final int dxjokdxxww() {
        return this.f75799kcexrzcfyt;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yggfygwlhe)) {
            return false;
        }
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75796iobyxmoadg, yggfygwlheVar.f75796iobyxmoadg) && this.f75811zoijcleaow == yggfygwlheVar.f75811zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75804ppxfxbqfkf, yggfygwlheVar.f75804ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75808wkgbmnqykc, yggfygwlheVar.f75808wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75793eablkybsjg, yggfygwlheVar.f75793eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75795gxszxtbevo, yggfygwlheVar.f75795gxszxtbevo) && this.f75800lqeggnwhkg == yggfygwlheVar.f75800lqeggnwhkg && this.f75801nufgyqmvbu == yggfygwlheVar.f75801nufgyqmvbu && this.f75792dxjokdxxww == yggfygwlheVar.f75792dxjokdxxww && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75789btonecajqb, yggfygwlheVar.f75789btonecajqb) && this.f75794gtknphoqwx == yggfygwlheVar.f75794gtknphoqwx && this.f75791draadjrbmk == yggfygwlheVar.f75791draadjrbmk && this.f75807wflxmlrfwp == yggfygwlheVar.f75807wflxmlrfwp && this.f75788agtfadlqog == yggfygwlheVar.f75788agtfadlqog && this.f75802ojitshcjhn == yggfygwlheVar.f75802ojitshcjhn && this.f75805rgvfuqvkyq == yggfygwlheVar.f75805rgvfuqvkyq && this.f75806vdvldrhtss == yggfygwlheVar.f75806vdvldrhtss && this.f75803oxmwwwfdhm == yggfygwlheVar.f75803oxmwwwfdhm && this.f75799kcexrzcfyt == yggfygwlheVar.f75799kcexrzcfyt && this.f75810zdlpuopuiu == yggfygwlheVar.f75810zdlpuopuiu && this.f75809yggfygwlhe == yggfygwlheVar.f75809yggfygwlhe && this.f75798jyumaefscl == yggfygwlheVar.f75798jyumaefscl && this.f75797iwizpuwonk == yggfygwlheVar.f75797iwizpuwonk && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75790cqumvgiudr, yggfygwlheVar.f75790cqumvgiudr);
    }

    public final String gtknphoqwx() {
        return this.f75790cqumvgiudr;
    }

    public final int gxszxtbevo() {
        return this.f75810zdlpuopuiu;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.f75796iobyxmoadg.hashCode() * 31) + this.f75811zoijcleaow.hashCode()) * 31) + this.f75804ppxfxbqfkf.hashCode()) * 31) + this.f75808wkgbmnqykc.hashCode()) * 31) + this.f75793eablkybsjg.hashCode()) * 31) + this.f75795gxszxtbevo.hashCode()) * 31) + Long.hashCode(this.f75800lqeggnwhkg)) * 31) + Long.hashCode(this.f75801nufgyqmvbu)) * 31) + Long.hashCode(this.f75792dxjokdxxww)) * 31) + this.f75789btonecajqb.hashCode()) * 31) + Integer.hashCode(this.f75794gtknphoqwx)) * 31) + this.f75791draadjrbmk.hashCode()) * 31) + Long.hashCode(this.f75807wflxmlrfwp)) * 31) + Long.hashCode(this.f75788agtfadlqog)) * 31) + Long.hashCode(this.f75802ojitshcjhn)) * 31) + Long.hashCode(this.f75805rgvfuqvkyq)) * 31) + Boolean.hashCode(this.f75806vdvldrhtss)) * 31) + this.f75803oxmwwwfdhm.hashCode()) * 31) + Integer.hashCode(this.f75799kcexrzcfyt)) * 31) + Integer.hashCode(this.f75810zdlpuopuiu)) * 31) + Long.hashCode(this.f75809yggfygwlhe)) * 31) + Integer.hashCode(this.f75798jyumaefscl)) * 31) + Integer.hashCode(this.f75797iwizpuwonk)) * 31;
        String str = this.f75790cqumvgiudr;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void kcexrzcfyt(String str) {
        this.f75790cqumvgiudr = str;
    }

    public final long lqeggnwhkg() {
        return this.f75809yggfygwlhe;
    }

    public final int nufgyqmvbu() {
        return this.f75798jyumaefscl;
    }

    public final void ojitshcjhn(long j13) {
        this.f75809yggfygwlhe = j13;
    }

    public final void oxmwwwfdhm(long j13, long j14) {
        if (j13 < 900000) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f75786lereixgezr, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f75801nufgyqmvbu = zg.gtknphoqwx.lqeggnwhkg(j13, 900000L);
        if (j14 < 300000) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f75786lereixgezr, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j14 > this.f75801nufgyqmvbu) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f75786lereixgezr, "Flex duration greater than interval duration; Changed to " + j13);
        }
        this.f75792dxjokdxxww = zg.gtknphoqwx.ojitshcjhn(j14, 300000L, this.f75801nufgyqmvbu);
    }

    public final long ppxfxbqfkf() {
        return f75785esjtqupxsv.iobyxmoadg(wflxmlrfwp(), this.f75794gtknphoqwx, this.f75791draadjrbmk, this.f75807wflxmlrfwp, this.f75788agtfadlqog, this.f75799kcexrzcfyt, agtfadlqog(), this.f75800lqeggnwhkg, this.f75792dxjokdxxww, this.f75801nufgyqmvbu, this.f75809yggfygwlhe);
    }

    public final void rgvfuqvkyq(int i13) {
        this.f75798jyumaefscl = i13;
    }

    public String toString() {
        return "{WorkSpec: " + this.f75796iobyxmoadg + '}';
    }

    public final void vdvldrhtss(long j13) {
        if (j13 < 900000) {
            g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f75786lereixgezr, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        oxmwwwfdhm(zg.gtknphoqwx.lqeggnwhkg(j13, 900000L), zg.gtknphoqwx.lqeggnwhkg(j13, 900000L));
    }

    public final boolean wflxmlrfwp() {
        return this.f75811zoijcleaow == hkdspvbjdz.ppxfxbqfkf.ENQUEUED && this.f75794gtknphoqwx > 0;
    }

    public final yggfygwlhe wkgbmnqykc(String id2, hkdspvbjdz.ppxfxbqfkf state, String workerClassName, String inputMergerClassName, androidx.work.zoijcleaow input, androidx.work.zoijcleaow output, long j13, long j14, long j15, g6.wkgbmnqykc constraints, int i13, g6.iobyxmoadg backoffPolicy, long j16, long j17, long j18, long j19, boolean z13, g6.cdpycssgdh outOfQuotaPolicy, int i14, int i15, long j23, int i16, int i17, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClassName, "workerClassName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(inputMergerClassName, "inputMergerClassName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(output, "output");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constraints, "constraints");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backoffPolicy, "backoffPolicy");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new yggfygwlhe(id2, state, workerClassName, inputMergerClassName, input, output, j13, j14, j15, constraints, i13, backoffPolicy, j16, j17, j18, j19, z13, outOfQuotaPolicy, i14, i15, j23, i16, i17, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yggfygwlhe(String str, hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar, String str2, String str3, androidx.work.zoijcleaow zoijcleaowVar, androidx.work.zoijcleaow zoijcleaowVar2, long j13, long j14, long j15, g6.wkgbmnqykc wkgbmnqykcVar, int i13, g6.iobyxmoadg iobyxmoadgVar, long j16, long j17, long j18, long j19, boolean z13, g6.cdpycssgdh cdpycssgdhVar, int i14, int i15, long j23, int i16, int i17, String str4, int i18, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        String str5;
        hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar2 = (i18 & 2) != 0 ? hkdspvbjdz.ppxfxbqfkf.ENQUEUED : ppxfxbqfkfVar;
        if ((i18 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(name, "OverwritingInputMerger::class.java.name");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, ppxfxbqfkfVar2, str2, str5, (i18 & 16) != 0 ? androidx.work.zoijcleaow.f14017ppxfxbqfkf : zoijcleaowVar, (i18 & 32) != 0 ? androidx.work.zoijcleaow.f14017ppxfxbqfkf : zoijcleaowVar2, (i18 & 64) != 0 ? 0L : j13, (i18 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0L : j14, (i18 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0L : j15, (i18 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? g6.wkgbmnqykc.f36462gtknphoqwx : wkgbmnqykcVar, (i18 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : i13, (i18 & 2048) != 0 ? g6.iobyxmoadg.EXPONENTIAL : iobyxmoadgVar, (i18 & 4096) != 0 ? 30000L : j16, (i18 & 8192) != 0 ? -1L : j17, (i18 & 16384) != 0 ? 0L : j18, (32768 & i18) != 0 ? -1L : j19, (65536 & i18) != 0 ? false : z13, (131072 & i18) != 0 ? g6.cdpycssgdh.RUN_AS_NON_EXPEDITED_WORK_REQUEST : cdpycssgdhVar, (262144 & i18) != 0 ? 0 : i14, (524288 & i18) != 0 ? 0 : i15, (1048576 & i18) != 0 ? Long.MAX_VALUE : j23, (2097152 & i18) != 0 ? 0 : i16, (4194304 & i18) != 0 ? -256 : i17, (i18 & 8388608) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(String id2, String workerClassName_) {
        this(id2, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yggfygwlhe(String newId, yggfygwlhe other) {
        this(newId, other.f75811zoijcleaow, other.f75804ppxfxbqfkf, other.f75808wkgbmnqykc, new androidx.work.zoijcleaow(other.f75793eablkybsjg), new androidx.work.zoijcleaow(other.f75795gxszxtbevo), other.f75800lqeggnwhkg, other.f75801nufgyqmvbu, other.f75792dxjokdxxww, new g6.wkgbmnqykc(other.f75789btonecajqb), other.f75794gtknphoqwx, other.f75791draadjrbmk, other.f75807wflxmlrfwp, other.f75788agtfadlqog, other.f75802ojitshcjhn, other.f75805rgvfuqvkyq, other.f75806vdvldrhtss, other.f75803oxmwwwfdhm, other.f75799kcexrzcfyt, 0, other.f75809yggfygwlhe, other.f75798jyumaefscl, other.f75797iwizpuwonk, other.f75790cqumvgiudr, 524288, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newId, "newId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
    }
}
