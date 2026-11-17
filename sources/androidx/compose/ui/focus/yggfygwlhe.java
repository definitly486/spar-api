package androidx.compose.ui.focus;

import androidx.compose.ui.platform.zeieaojujs;

/* JADX INFO: loaded from: classes.dex */
public abstract class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f6268iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f6271zoijcleaow = eablkybsjg(1);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int f6269ppxfxbqfkf = eablkybsjg(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f6270wkgbmnqykc = eablkybsjg(2);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return yggfygwlhe.f6271zoijcleaow;
        }

        public final int ppxfxbqfkf() {
            return yggfygwlhe.f6269ppxfxbqfkf;
        }

        public final int zoijcleaow() {
            return yggfygwlhe.f6270wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    private static int eablkybsjg(int i13) {
        return i13;
    }

    public static final boolean gxszxtbevo(int i13, int i14) {
        return i13 == i14;
    }

    public static final boolean wkgbmnqykc(int i13, z.nufgyqmvbu nufgyqmvbuVar) {
        if (gxszxtbevo(i13, f6271zoijcleaow)) {
            return true;
        }
        if (gxszxtbevo(i13, f6269ppxfxbqfkf)) {
            return true ^ p.iobyxmoadg.gxszxtbevo(((p.zoijcleaow) z.dxjokdxxww.iobyxmoadg(nufgyqmvbuVar, zeieaojujs.gtknphoqwx())).iobyxmoadg(), p.iobyxmoadg.f75180zoijcleaow.zoijcleaow());
        }
        if (gxszxtbevo(i13, f6270wkgbmnqykc)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }
}
