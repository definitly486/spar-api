package j0;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f50306iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f50305zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f50303ppxfxbqfkf = eablkybsjg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f50304wkgbmnqykc = eablkybsjg(1);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int f50302eablkybsjg = eablkybsjg(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return ojitshcjhn.f50302eablkybsjg;
        }

        public final int ppxfxbqfkf() {
            return ojitshcjhn.f50304wkgbmnqykc;
        }

        public final int zoijcleaow() {
            return ojitshcjhn.f50303ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ ojitshcjhn(int i13) {
        this.f50306iobyxmoadg = i13;
    }

    public static String dxjokdxxww(int i13) {
        if (i13 == f50303ppxfxbqfkf) {
            return "EmojiSupportMatch.Default";
        }
        if (i13 == f50304wkgbmnqykc) {
            return "EmojiSupportMatch.None";
        }
        if (i13 == f50302eablkybsjg) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i13 + ')';
    }

    private static int eablkybsjg(int i13) {
        return i13;
    }

    public static boolean gxszxtbevo(int i13, Object obj) {
        return (obj instanceof ojitshcjhn) && i13 == ((ojitshcjhn) obj).btonecajqb();
    }

    public static final boolean lqeggnwhkg(int i13, int i14) {
        return i13 == i14;
    }

    public static int nufgyqmvbu(int i13) {
        return Integer.hashCode(i13);
    }

    public static final /* synthetic */ ojitshcjhn wkgbmnqykc(int i13) {
        return new ojitshcjhn(i13);
    }

    public final /* synthetic */ int btonecajqb() {
        return this.f50306iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return gxszxtbevo(this.f50306iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f50306iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f50306iobyxmoadg);
    }
}
