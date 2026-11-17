package iwxlajgraz;

import android.view.inputmethod.EditorInfo;
import j0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class wypolnanlu {
    private static final boolean iobyxmoadg(int i13, int i14) {
        return (i13 & i14) == i14;
    }

    public static /* synthetic */ void ppxfxbqfkf(EditorInfo editorInfo, CharSequence charSequence, long j13, p0.zdlpuopuiu zdlpuopuiuVar, String[] strArr, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            strArr = null;
        }
        zoijcleaow(editorInfo, charSequence, j13, zdlpuopuiuVar, strArr);
    }

    public static final void zoijcleaow(EditorInfo editorInfo, CharSequence charSequence, long j13, p0.zdlpuopuiu zdlpuopuiuVar, String[] strArr) {
        int iEablkybsjg = zdlpuopuiuVar.eablkybsjg();
        p0.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = p0.kcexrzcfyt.f75246zoijcleaow;
        int i13 = 3;
        int i14 = 6;
        if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.iobyxmoadg())) {
            if (!zdlpuopuiuVar.nufgyqmvbu()) {
                i14 = 0;
            }
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.eablkybsjg())) {
            i14 = 1;
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.ppxfxbqfkf())) {
            i14 = 2;
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.wkgbmnqykc())) {
            i14 = 5;
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.gxszxtbevo())) {
            i14 = 7;
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.lqeggnwhkg())) {
            i14 = 3;
        } else if (p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.nufgyqmvbu())) {
            i14 = 4;
        } else if (!p0.kcexrzcfyt.wflxmlrfwp(iEablkybsjg, iobyxmoadgVar.zoijcleaow())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i14;
        zdlpuopuiuVar.lqeggnwhkg();
        mhtqkkgtqm.f49901iobyxmoadg.iobyxmoadg(editorInfo, zdlpuopuiuVar.wkgbmnqykc());
        int iGxszxtbevo = zdlpuopuiuVar.gxszxtbevo();
        p0.lereixgezr.iobyxmoadg iobyxmoadgVar2 = p0.lereixgezr.f75258zoijcleaow;
        if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.nufgyqmvbu())) {
            i13 = 1;
        } else if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.iobyxmoadg())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i13 = 1;
        } else if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.wkgbmnqykc())) {
            i13 = 2;
        } else if (!p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.lqeggnwhkg())) {
            if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.btonecajqb())) {
                i13 = 17;
            } else if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.ppxfxbqfkf())) {
                i13 = 33;
            } else if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.gxszxtbevo())) {
                i13 = 129;
            } else if (p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.eablkybsjg())) {
                i13 = 18;
            } else {
                if (!p0.lereixgezr.agtfadlqog(iGxszxtbevo, iobyxmoadgVar2.zoijcleaow())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i13 = 8194;
            }
        }
        editorInfo.inputType = i13;
        if (!zdlpuopuiuVar.nufgyqmvbu() && iobyxmoadg(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (p0.kcexrzcfyt.wflxmlrfwp(zdlpuopuiuVar.eablkybsjg(), iobyxmoadgVar.iobyxmoadg())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (iobyxmoadg(editorInfo.inputType, 1)) {
            int iPpxfxbqfkf = zdlpuopuiuVar.ppxfxbqfkf();
            p0.esjtqupxsv.iobyxmoadg iobyxmoadgVar3 = p0.esjtqupxsv.f75216zoijcleaow;
            if (p0.esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.iobyxmoadg())) {
                editorInfo.inputType |= 4096;
            } else if (p0.esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.eablkybsjg())) {
                editorInfo.inputType |= 8192;
            } else if (p0.esjtqupxsv.dxjokdxxww(iPpxfxbqfkf, iobyxmoadgVar3.ppxfxbqfkf())) {
                editorInfo.inputType |= 16384;
            }
            if (zdlpuopuiuVar.zoijcleaow()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = l.agtfadlqog(j13);
        editorInfo.initialSelEnd = l.dxjokdxxww(j13);
        y1.iobyxmoadg.eablkybsjg(editorInfo, charSequence);
        if (strArr != null) {
            y1.iobyxmoadg.ppxfxbqfkf(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!uawqvzlxes.zoijcleaow.iobyxmoadg() || p0.lereixgezr.agtfadlqog(zdlpuopuiuVar.gxszxtbevo(), iobyxmoadgVar2.gxszxtbevo()) || p0.lereixgezr.agtfadlqog(zdlpuopuiuVar.gxszxtbevo(), iobyxmoadgVar2.eablkybsjg())) {
            y1.iobyxmoadg.gxszxtbevo(editorInfo, false);
        } else {
            y1.iobyxmoadg.gxszxtbevo(editorInfo, true);
            dsvhmnatus.f49842iobyxmoadg.iobyxmoadg(editorInfo);
        }
    }
}
