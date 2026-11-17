package w0;

/* JADX INFO: loaded from: classes.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f118247iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f118246zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f118244ppxfxbqfkf = eablkybsjg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long f118245wkgbmnqykc = eablkybsjg(4294967296L);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final long f118243eablkybsjg = eablkybsjg(8589934592L);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return cqumvgiudr.f118243eablkybsjg;
        }

        public final long ppxfxbqfkf() {
            return cqumvgiudr.f118244ppxfxbqfkf;
        }

        public final long zoijcleaow() {
            return cqumvgiudr.f118245wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ cqumvgiudr(long j13) {
        this.f118247iobyxmoadg = j13;
    }

    public static String dxjokdxxww(long j13) {
        if (lqeggnwhkg(j13, f118244ppxfxbqfkf)) {
            return "Unspecified";
        }
        if (lqeggnwhkg(j13, f118245wkgbmnqykc)) {
            return "Sp";
        }
        return lqeggnwhkg(j13, f118243eablkybsjg) ? "Em" : "Invalid";
    }

    public static long eablkybsjg(long j13) {
        return j13;
    }

    public static boolean gxszxtbevo(long j13, Object obj) {
        return (obj instanceof cqumvgiudr) && j13 == ((cqumvgiudr) obj).btonecajqb();
    }

    public static final boolean lqeggnwhkg(long j13, long j14) {
        return j13 == j14;
    }

    public static int nufgyqmvbu(long j13) {
        return Long.hashCode(j13);
    }

    public static final /* synthetic */ cqumvgiudr wkgbmnqykc(long j13) {
        return new cqumvgiudr(j13);
    }

    public final /* synthetic */ long btonecajqb() {
        return this.f118247iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f118247iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f118247iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f118247iobyxmoadg);
    }
}
