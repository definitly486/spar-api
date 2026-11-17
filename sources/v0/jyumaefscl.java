package v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyumaefscl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f114986iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f114989zoijcleaow = gxszxtbevo(1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f114987ppxfxbqfkf = gxszxtbevo(2);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f114988wkgbmnqykc = gxszxtbevo(3);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f114984eablkybsjg = gxszxtbevo(4);

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int f114985gxszxtbevo = gxszxtbevo(5);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int eablkybsjg() {
            return jyumaefscl.f114988wkgbmnqykc;
        }

        public final int iobyxmoadg() {
            return jyumaefscl.f114989zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return jyumaefscl.f114985gxszxtbevo;
        }

        public final int wkgbmnqykc() {
            return jyumaefscl.f114984eablkybsjg;
        }

        public final int zoijcleaow() {
            return jyumaefscl.f114987ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    public static String dxjokdxxww(int i13) {
        if (lqeggnwhkg(i13, f114989zoijcleaow)) {
            return "Clip";
        }
        if (lqeggnwhkg(i13, f114987ppxfxbqfkf)) {
            return "Ellipsis";
        }
        if (lqeggnwhkg(i13, f114985gxszxtbevo)) {
            return "MiddleEllipsis";
        }
        if (lqeggnwhkg(i13, f114988wkgbmnqykc)) {
            return "Visible";
        }
        return lqeggnwhkg(i13, f114984eablkybsjg) ? "StartEllipsis" : "Invalid";
    }

    public static int gxszxtbevo(int i13) {
        return i13;
    }

    public static final boolean lqeggnwhkg(int i13, int i14) {
        return i13 == i14;
    }

    public static int nufgyqmvbu(int i13) {
        return Integer.hashCode(i13);
    }
}
