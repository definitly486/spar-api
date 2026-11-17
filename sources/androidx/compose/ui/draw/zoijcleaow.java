package androidx.compose.ui.draw;

import tg.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final e.ppxfxbqfkf iobyxmoadg(draadjrbmk draadjrbmkVar) {
        return new iobyxmoadg(new e.wkgbmnqykc(), draadjrbmkVar);
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new DrawWithCacheElement(draadjrbmkVar));
    }

    public static final androidx.compose.ui.wkgbmnqykc wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new DrawWithContentElement(draadjrbmkVar));
    }

    public static final androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(new DrawBehindElement(draadjrbmkVar));
    }
}
