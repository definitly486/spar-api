package t;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f109054iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f109057zoijcleaow = gxszxtbevo(0);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f109055ppxfxbqfkf = gxszxtbevo(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f109056wkgbmnqykc = gxszxtbevo(2);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f109052eablkybsjg = gxszxtbevo(3);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f109053gxszxtbevo = gxszxtbevo(4);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return cllcsxoeiz.f109057zoijcleaow;
        }

        public final int iobyxmoadg() {
            return cllcsxoeiz.f109053gxszxtbevo;
        }

        public final int ppxfxbqfkf() {
            return cllcsxoeiz.f109052eablkybsjg;
        }

        public final int wkgbmnqykc() {
            return cllcsxoeiz.f109055ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return cllcsxoeiz.f109056wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public static String dxjokdxxww(int i13) {
        if (i13 == 1) {
            return "Touch";
        }
        if (i13 == 2) {
            return "Mouse";
        }
        if (i13 != 3) {
            return i13 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    private static int gxszxtbevo(int i13) {
        return i13;
    }

    public static final boolean lqeggnwhkg(int i13, int i14) {
        return i13 == i14;
    }

    public static int nufgyqmvbu(int i13) {
        return Integer.hashCode(i13);
    }
}
