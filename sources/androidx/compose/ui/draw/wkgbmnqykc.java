package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final androidx.compose.ui.wkgbmnqykc iobyxmoadg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, l.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, a.eablkybsjg eablkybsjgVar, x.gxszxtbevo gxszxtbevoVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar2) {
        return wkgbmnqykcVar.eablkybsjg(new PainterElement(ppxfxbqfkfVar, z13, eablkybsjgVar, gxszxtbevoVar, f13, wkgbmnqykcVar2));
    }

    public static /* synthetic */ androidx.compose.ui.wkgbmnqykc zoijcleaow(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, l.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, a.eablkybsjg eablkybsjgVar, x.gxszxtbevo gxszxtbevoVar, float f13, androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = true;
        }
        boolean z14 = z13;
        if ((i13 & 4) != 0) {
            eablkybsjgVar = a.eablkybsjg.f20iobyxmoadg.eablkybsjg();
        }
        a.eablkybsjg eablkybsjgVar2 = eablkybsjgVar;
        if ((i13 & 8) != 0) {
            gxszxtbevoVar = x.gxszxtbevo.f120816iobyxmoadg.gxszxtbevo();
        }
        x.gxszxtbevo gxszxtbevoVar2 = gxszxtbevoVar;
        if ((i13 & 16) != 0) {
            f13 = 1.0f;
        }
        float f14 = f13;
        if ((i13 & 32) != 0) {
            wkgbmnqykcVar2 = null;
        }
        return iobyxmoadg(wkgbmnqykcVar, ppxfxbqfkfVar, z14, eablkybsjgVar2, gxszxtbevoVar2, f14, wkgbmnqykcVar2);
    }
}
