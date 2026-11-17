package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class wizcaqwiak {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f127337iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f127338zoijcleaow = hszhottldk.ppxfxbqfkf(0, 0, 0, 0, 14, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int eablkybsjg(long j13, int i13) {
            return ((int) (j13 >> (i13 * 15))) & 32767;
        }

        private final long wkgbmnqykc(int i13, int i14) {
            return ((long) (i13 & 32767)) << (i14 * 15);
        }

        public final long ppxfxbqfkf(int i13, int i14, int i15, int i16, boolean z13) {
            return wkgbmnqykc(i14, 1) | wkgbmnqykc(i13, 0) | wkgbmnqykc(i15, 2) | wkgbmnqykc(i16, 3) | (z13 ? Long.MIN_VALUE : 0L);
        }

        public final long zoijcleaow() {
            return wizcaqwiak.f127338zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static final boolean dxjokdxxww(long j13) {
        return (j13 & Long.MIN_VALUE) != 0;
    }

    public static final int eablkybsjg(long j13) {
        return f127337iobyxmoadg.eablkybsjg(j13, 3);
    }

    public static final int gxszxtbevo(long j13) {
        return f127337iobyxmoadg.eablkybsjg(j13, 2);
    }

    public static final int lqeggnwhkg(long j13) {
        return f127337iobyxmoadg.eablkybsjg(j13, 0);
    }

    public static final int nufgyqmvbu(long j13) {
        return f127337iobyxmoadg.eablkybsjg(j13, 1);
    }

    public static final int ppxfxbqfkf(long j13, w0.zdlpuopuiu zdlpuopuiuVar) {
        return (!dxjokdxxww(j13) || zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) ? gxszxtbevo(j13) : lqeggnwhkg(j13);
    }

    public static long wkgbmnqykc(long j13) {
        return j13;
    }

    public static final int zoijcleaow(long j13, w0.zdlpuopuiu zdlpuopuiuVar) {
        return (!dxjokdxxww(j13) || zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) ? lqeggnwhkg(j13) : gxszxtbevo(j13);
    }
}
