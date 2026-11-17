package p;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f75181iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C1644iobyxmoadg f75180zoijcleaow = new C1644iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f75178ppxfxbqfkf = wkgbmnqykc(1);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f75179wkgbmnqykc = wkgbmnqykc(2);

    /* JADX INFO: renamed from: p.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1644iobyxmoadg {
        public /* synthetic */ C1644iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return iobyxmoadg.f75179wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return iobyxmoadg.f75178ppxfxbqfkf;
        }

        private C1644iobyxmoadg() {
        }
    }

    private /* synthetic */ iobyxmoadg(int i13) {
        this.f75181iobyxmoadg = i13;
    }

    public static boolean eablkybsjg(int i13, Object obj) {
        return (obj instanceof iobyxmoadg) && i13 == ((iobyxmoadg) obj).dxjokdxxww();
    }

    public static final boolean gxszxtbevo(int i13, int i14) {
        return i13 == i14;
    }

    public static int lqeggnwhkg(int i13) {
        return Integer.hashCode(i13);
    }

    public static String nufgyqmvbu(int i13) {
        if (gxszxtbevo(i13, f75178ppxfxbqfkf)) {
            return "Touch";
        }
        return gxszxtbevo(i13, f75179wkgbmnqykc) ? "Keyboard" : "Error";
    }

    public static final /* synthetic */ iobyxmoadg ppxfxbqfkf(int i13) {
        return new iobyxmoadg(i13);
    }

    public static int wkgbmnqykc(int i13) {
        return i13;
    }

    public final /* synthetic */ int dxjokdxxww() {
        return this.f75181iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f75181iobyxmoadg, obj);
    }

    public int hashCode() {
        return lqeggnwhkg(this.f75181iobyxmoadg);
    }

    public String toString() {
        return nufgyqmvbu(this.f75181iobyxmoadg);
    }
}
