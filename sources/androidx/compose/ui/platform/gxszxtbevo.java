package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static gxszxtbevo f6927eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f6928ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f6929wkgbmnqykc = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final gxszxtbevo iobyxmoadg() {
            if (gxszxtbevo.f6927eablkybsjg == null) {
                gxszxtbevo.f6927eablkybsjg = new gxszxtbevo(null);
            }
            gxszxtbevo gxszxtbevoVar = gxszxtbevo.f6927eablkybsjg;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return gxszxtbevoVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ gxszxtbevo(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final boolean btonecajqb(int i13) {
        return wkgbmnqykc().charAt(i13) != '\n' && (i13 == 0 || wkgbmnqykc().charAt(i13 - 1) == '\n');
    }

    private final boolean dxjokdxxww(int i13) {
        return i13 > 0 && wkgbmnqykc().charAt(i13 + (-1)) != '\n' && (i13 == wkgbmnqykc().length() || wkgbmnqykc().charAt(i13) == '\n');
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] iobyxmoadg(int i13) {
        int length = wkgbmnqykc().length();
        if (length <= 0 || i13 >= length) {
            return null;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        while (i13 < length && wkgbmnqykc().charAt(i13) == '\n' && !btonecajqb(i13)) {
            i13++;
        }
        if (i13 >= length) {
            return null;
        }
        int i14 = i13 + 1;
        while (i14 < length && !dxjokdxxww(i14)) {
            i14++;
        }
        return ppxfxbqfkf(i13, i14);
    }

    @Override // androidx.compose.ui.platform.lqeggnwhkg
    public int[] zoijcleaow(int i13) {
        int length = wkgbmnqykc().length();
        if (length <= 0 || i13 <= 0) {
            return null;
        }
        if (i13 > length) {
            i13 = length;
        }
        while (i13 > 0 && wkgbmnqykc().charAt(i13 - 1) == '\n' && !dxjokdxxww(i13)) {
            i13--;
        }
        if (i13 <= 0) {
            return null;
        }
        int i14 = i13 - 1;
        while (i14 > 0 && !btonecajqb(i14)) {
            i14--;
        }
        return ppxfxbqfkf(i14, i13);
    }

    private gxszxtbevo() {
    }
}
