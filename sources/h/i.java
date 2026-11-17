package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f38905iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f38908zoijcleaow = eablkybsjg(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f38906ppxfxbqfkf = eablkybsjg(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f38907wkgbmnqykc = eablkybsjg(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f38904eablkybsjg = eablkybsjg(3);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return i.f38908zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return i.f38907wkgbmnqykc;
        }

        public final int wkgbmnqykc() {
            return i.f38906ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return i.f38904eablkybsjg;
        }

        private iobyxmoadg() {
        }
    }

    public static int eablkybsjg(int i13) {
        return i13;
    }

    public static final boolean gxszxtbevo(int i13, int i14) {
        return i13 == i14;
    }

    public static int lqeggnwhkg(int i13) {
        return Integer.hashCode(i13);
    }

    public static String nufgyqmvbu(int i13) {
        if (gxszxtbevo(i13, f38908zoijcleaow)) {
            return "Clamp";
        }
        if (gxszxtbevo(i13, f38906ppxfxbqfkf)) {
            return "Repeated";
        }
        if (gxszxtbevo(i13, f38907wkgbmnqykc)) {
            return "Mirror";
        }
        return gxszxtbevo(i13, f38904eablkybsjg) ? "Decal" : "Unknown";
    }
}
