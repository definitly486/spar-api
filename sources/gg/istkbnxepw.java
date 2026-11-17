package gg;

/* JADX INFO: loaded from: classes3.dex */
public final class istkbnxepw implements Comparable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f37109yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f37110zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ istkbnxepw(long j13) {
        this.f37110zdlpuopuiu = j13;
    }

    public static int eablkybsjg(long j13) {
        return Long.hashCode(j13);
    }

    public static String gxszxtbevo(long j13) {
        return pkzmftpjix.wkgbmnqykc(j13, 10);
    }

    public static final /* synthetic */ istkbnxepw iobyxmoadg(long j13) {
        return new istkbnxepw(j13);
    }

    public static boolean ppxfxbqfkf(long j13, Object obj) {
        return (obj instanceof istkbnxepw) && j13 == ((istkbnxepw) obj).lqeggnwhkg();
    }

    public static final boolean wkgbmnqykc(long j13, long j14) {
        return j13 == j14;
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return pkzmftpjix.zoijcleaow(lqeggnwhkg(), ((istkbnxepw) obj).lqeggnwhkg());
    }

    public boolean equals(Object obj) {
        return ppxfxbqfkf(this.f37110zdlpuopuiu, obj);
    }

    public int hashCode() {
        return eablkybsjg(this.f37110zdlpuopuiu);
    }

    public final /* synthetic */ long lqeggnwhkg() {
        return this.f37110zdlpuopuiu;
    }

    public String toString() {
        return gxszxtbevo(this.f37110zdlpuopuiu);
    }
}
