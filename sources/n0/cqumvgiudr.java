package n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f68240iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f68243zoijcleaow = wkgbmnqykc(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f68241ppxfxbqfkf = wkgbmnqykc(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f68242wkgbmnqykc = wkgbmnqykc(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return cqumvgiudr.f68242wkgbmnqykc;
        }

        public final int ppxfxbqfkf() {
            return cqumvgiudr.f68241ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return cqumvgiudr.f68243zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static final boolean eablkybsjg(int i13, int i14) {
        return i13 == i14;
    }

    public static int gxszxtbevo(int i13) {
        return Integer.hashCode(i13);
    }

    public static String lqeggnwhkg(int i13) {
        if (eablkybsjg(i13, f68243zoijcleaow)) {
            return "Blocking";
        }
        if (eablkybsjg(i13, f68241ppxfxbqfkf)) {
            return "Optional";
        }
        if (eablkybsjg(i13, f68242wkgbmnqykc)) {
            return "Async";
        }
        return "Invalid(value=" + i13 + ')';
    }

    private static int wkgbmnqykc(int i13) {
        return i13;
    }
}
