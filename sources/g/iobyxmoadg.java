package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final C0804iobyxmoadg f35590iobyxmoadg = new C0804iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f35591zoijcleaow = zoijcleaow(0);

    /* JADX INFO: renamed from: g.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0804iobyxmoadg {
        public /* synthetic */ C0804iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return iobyxmoadg.f35591zoijcleaow;
        }

        private C0804iobyxmoadg() {
        }
    }

    public static String eablkybsjg(long j13) {
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.intBitsToFloat(i14)) {
            return "CornerRadius.circular(" + zoijcleaow.iobyxmoadg(Float.intBitsToFloat(i13), 1) + ')';
        }
        return "CornerRadius.elliptical(" + zoijcleaow.iobyxmoadg(Float.intBitsToFloat(i13), 1) + ", " + zoijcleaow.iobyxmoadg(Float.intBitsToFloat(i14), 1) + ')';
    }

    public static final boolean ppxfxbqfkf(long j13, long j14) {
        return j13 == j14;
    }

    public static int wkgbmnqykc(long j13) {
        return Long.hashCode(j13);
    }

    public static long zoijcleaow(long j13) {
        return j13;
    }
}
