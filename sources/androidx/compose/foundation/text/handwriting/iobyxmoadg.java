package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.wkgbmnqykc;
import opjhrmiecq.i1;
import t.iwizpuwonk;
import uawqvzlxes.zoijcleaow;
import w0.nufgyqmvbu;
import z.hszhottldk;
import z.kcexrzcfyt;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f5363iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final kcexrzcfyt f5364ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f5365zoijcleaow;

    static {
        float fLqeggnwhkg = nufgyqmvbu.lqeggnwhkg(40);
        f5363iobyxmoadg = fLqeggnwhkg;
        float fLqeggnwhkg2 = nufgyqmvbu.lqeggnwhkg(10);
        f5365zoijcleaow = fLqeggnwhkg2;
        f5364ppxfxbqfkf = hszhottldk.iobyxmoadg(fLqeggnwhkg2, fLqeggnwhkg, fLqeggnwhkg2, fLqeggnwhkg);
    }

    public static final kcexrzcfyt iobyxmoadg() {
        return f5364ppxfxbqfkf;
    }

    public static final wkgbmnqykc zoijcleaow(wkgbmnqykc wkgbmnqykcVar, boolean z13, boolean z14, tg.iobyxmoadg iobyxmoadgVar) {
        if (!z13 || !zoijcleaow.iobyxmoadg()) {
            return wkgbmnqykcVar;
        }
        if (z14) {
            wkgbmnqykcVar = iwizpuwonk.ppxfxbqfkf(wkgbmnqykcVar, i1.iobyxmoadg(), false, f5364ppxfxbqfkf);
        }
        return wkgbmnqykcVar.eablkybsjg(new StylusHandwritingElement(iobyxmoadgVar));
    }
}
