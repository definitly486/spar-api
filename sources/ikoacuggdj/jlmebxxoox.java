package ikoacuggdj;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final g0.cdpycssgdh f44826iobyxmoadg = new g0.cdpycssgdh("MagnifierPositionInRoot", (tg.rgvfuqvkyq) null, 2, (kotlin.jvm.internal.gtknphoqwx) null);

    public static final androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar, tg.draadjrbmk draadjrbmkVar2, tg.draadjrbmk draadjrbmkVar3, float f13, boolean z13, long j13, float f14, float f15, boolean z14, yfnezrywwk yfnezrywwkVar) {
        if (wkgbmnqykc(0, 1, null)) {
            return wkgbmnqykcVar.eablkybsjg(new MagnifierElement(draadjrbmkVar, draadjrbmkVar2, draadjrbmkVar3, f13, z13, j13, f14, f15, z14, yfnezrywwkVar == null ? yfnezrywwk.f44959iobyxmoadg.iobyxmoadg() : yfnezrywwkVar, null));
        }
        return wkgbmnqykcVar;
    }

    public static final boolean iobyxmoadg(float f13, float f14) {
        return (Float.isNaN(f13) && Float.isNaN(f14)) || f13 == f14;
    }

    public static final boolean ppxfxbqfkf(int i13) {
        return i13 >= 28;
    }

    public static /* synthetic */ boolean wkgbmnqykc(int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = Build.VERSION.SDK_INT;
        }
        return ppxfxbqfkf(i13);
    }

    public static final g0.cdpycssgdh zoijcleaow() {
        return f44826iobyxmoadg;
    }
}
