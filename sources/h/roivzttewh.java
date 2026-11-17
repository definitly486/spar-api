package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class roivzttewh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38955iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f38958zoijcleaow = ppxfxbqfkf(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f38956ppxfxbqfkf = ppxfxbqfkf(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f38957wkgbmnqykc = ppxfxbqfkf(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f38954eablkybsjg = ppxfxbqfkf(3);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return roivzttewh.f38956ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return roivzttewh.f38958zoijcleaow;
        }

        private iobyxmoadg() {
        }
    }

    public static int eablkybsjg(int i13) {
        return Integer.hashCode(i13);
    }

    public static String gxszxtbevo(int i13) {
        if (wkgbmnqykc(i13, f38958zoijcleaow)) {
            return "None";
        }
        if (wkgbmnqykc(i13, f38956ppxfxbqfkf)) {
            return "Low";
        }
        if (wkgbmnqykc(i13, f38957wkgbmnqykc)) {
            return "Medium";
        }
        return wkgbmnqykc(i13, f38954eablkybsjg) ? "High" : "Unknown";
    }

    public static int ppxfxbqfkf(int i13) {
        return i13;
    }

    public static final boolean wkgbmnqykc(int i13, int i14) {
        return i13 == i14;
    }
}
