package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {
    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar) {
        return wkgbmnqykcVar.eablkybsjg(z13 ? new FocusableElement(draadjrbmkVar) : androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg);
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, boolean z13, metgxyhuhe.draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        if ((i13 & 2) != 0) {
            draadjrbmkVar = null;
        }
        return iobyxmoadg(wkgbmnqykcVar, z13, draadjrbmkVar);
    }
}
