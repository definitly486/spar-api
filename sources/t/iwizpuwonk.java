package t;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {
    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, jyumaefscl jyumaefsclVar, boolean z13) {
        return wkgbmnqykcVar.eablkybsjg(new PointerHoverIconModifierElement(jyumaefsclVar, z13));
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, jyumaefscl jyumaefsclVar, boolean z13, z.kcexrzcfyt kcexrzcfytVar) {
        return wkgbmnqykcVar.eablkybsjg(new StylusHoverIconModifierElement(jyumaefsclVar, z13, kcexrzcfytVar));
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, jyumaefscl jyumaefsclVar, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadg(wkgbmnqykcVar, jyumaefsclVar, z13);
    }
}
