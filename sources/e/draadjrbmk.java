package e;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import h.e;
import h.eslsurpljm;
import h.iwxlajgraz;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, e eVar, boolean z13, long j13, long j14) {
        return (w0.nufgyqmvbu.gxszxtbevo(f13, w0.nufgyqmvbu.lqeggnwhkg((float) 0)) > 0 || z13) ? wkgbmnqykcVar.eablkybsjg(new ShadowGraphicsLayerElement(f13, eVar, z13, j13, j14, null)) : wkgbmnqykcVar;
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, float f13, e eVar, boolean z13, long j13, long j14, int i13, Object obj) {
        boolean z14;
        e eVarIobyxmoadg = (i13 & 2) != 0 ? eslsurpljm.iobyxmoadg() : eVar;
        if ((i13 & 4) != 0) {
            z14 = false;
            if (w0.nufgyqmvbu.gxszxtbevo(f13, w0.nufgyqmvbu.lqeggnwhkg(0)) > 0) {
                z14 = true;
            }
        } else {
            z14 = z13;
        }
        return iobyxmoadg(wkgbmnqykcVar, f13, eVarIobyxmoadg, z14, (i13 & 8) != 0 ? iwxlajgraz.iobyxmoadg() : j13, (i13 & 16) != 0 ? iwxlajgraz.iobyxmoadg() : j14);
    }
}
