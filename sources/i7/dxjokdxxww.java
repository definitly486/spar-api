package i7;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final e7.ppxfxbqfkf f42056iobyxmoadg = new e7.ppxfxbqfkf(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42057iobyxmoadg;

        static {
            int[] iArr = new int[f7.eablkybsjg.values().length];
            try {
                iArr[f7.eablkybsjg.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f7.eablkybsjg.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f7.eablkybsjg.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f42057iobyxmoadg = iArr;
        }
    }

    public static final boolean iobyxmoadg(e7.nufgyqmvbu nufgyqmvbuVar) {
        int i13 = iobyxmoadg.f42057iobyxmoadg[nufgyqmvbuVar.wwaezpbzkn().ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if ((nufgyqmvbuVar.vdvldrhtss().wflxmlrfwp() != null || !(nufgyqmvbuVar.hcddaimhww() instanceof f7.wkgbmnqykc)) && (!(nufgyqmvbuVar.hkdspvbjdz() instanceof g7.wkgbmnqykc) || !(nufgyqmvbuVar.hcddaimhww() instanceof f7.draadjrbmk) || !(((g7.wkgbmnqykc) nufgyqmvbuVar.hkdspvbjdz()).getView() instanceof ImageView) || ((g7.wkgbmnqykc) nufgyqmvbuVar.hkdspvbjdz()).getView() != ((f7.draadjrbmk) nufgyqmvbuVar.hcddaimhww()).getView())) {
                return false;
            }
        }
        return true;
    }

    public static final Drawable ppxfxbqfkf(e7.nufgyqmvbu nufgyqmvbuVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return wkgbmnqykc.iobyxmoadg(nufgyqmvbuVar.draadjrbmk(), num.intValue());
    }

    public static final e7.ppxfxbqfkf zoijcleaow() {
        return f42056iobyxmoadg;
    }
}
