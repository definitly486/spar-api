package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class ixidwrxhsl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f73637iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f73636zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f73635ppxfxbqfkf = ppxfxbqfkf(0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return ixidwrxhsl.f73635ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ ixidwrxhsl(int i13) {
        this.f73637iobyxmoadg = i13;
    }

    public static final boolean btonecajqb(int i13) {
        return (i13 & 8) == 8;
    }

    public static String draadjrbmk(int i13) {
        return "MenuItemsAvailability(value=" + i13 + ')';
    }

    public static final boolean dxjokdxxww(int i13) {
        return (i13 & 2) == 2;
    }

    public static boolean eablkybsjg(int i13, Object obj) {
        return (obj instanceof ixidwrxhsl) && i13 == ((ixidwrxhsl) obj).wflxmlrfwp();
    }

    public static int gtknphoqwx(int i13) {
        return Integer.hashCode(i13);
    }

    public static final boolean gxszxtbevo(int i13) {
        return (i13 & 16) == 16;
    }

    public static final boolean lqeggnwhkg(int i13) {
        return (i13 & 1) == 1;
    }

    public static final boolean nufgyqmvbu(int i13) {
        return (i13 & 4) == 4;
    }

    private static int ppxfxbqfkf(int i13) {
        return i13;
    }

    public static int wkgbmnqykc(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        return ppxfxbqfkf((z13 ? 1 : 0) | (z14 ? 2 : 0) | (z15 ? 4 : 0) | (z16 ? 8 : 0) | (z17 ? 16 : 0));
    }

    public static final /* synthetic */ ixidwrxhsl zoijcleaow(int i13) {
        return new ixidwrxhsl(i13);
    }

    public boolean equals(Object obj) {
        return eablkybsjg(this.f73637iobyxmoadg, obj);
    }

    public int hashCode() {
        return gtknphoqwx(this.f73637iobyxmoadg);
    }

    public String toString() {
        return draadjrbmk(this.f73637iobyxmoadg);
    }

    public final /* synthetic */ int wflxmlrfwp() {
        return this.f73637iobyxmoadg;
    }
}
