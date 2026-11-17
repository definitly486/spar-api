package fiwbwshyhd;

import gg.wwaezpbzkn;
import h.zfvoamnweg;
import vipkmwdibw.lmojexxdyd;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(vdvldrhtss vdvldrhtssVar, boolean z13, androidx.compose.ui.graphics.lqeggnwhkg lqeggnwhkgVar) {
        lqeggnwhkgVar.nufgyqmvbu(vdvldrhtssVar.btonecajqb() - Float.intBitsToFloat((int) (lqeggnwhkgVar.zoijcleaow() & 4294967295L)));
        if (z13 && !vdvldrhtssVar.draadjrbmk()) {
            float fIobyxmoadg = lmojexxdyd.eablkybsjg().iobyxmoadg(vdvldrhtssVar.btonecajqb() / vdvldrhtssVar.wflxmlrfwp());
            if (fIobyxmoadg < 0.0f) {
                fIobyxmoadg = 0.0f;
            }
            if (fIobyxmoadg > 1.0f) {
                fIobyxmoadg = 1.0f;
            }
            lqeggnwhkgVar.ojitshcjhn(fIobyxmoadg);
            lqeggnwhkgVar.istkbnxepw(fIobyxmoadg);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final androidx.compose.ui.wkgbmnqykc ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final vdvldrhtss vdvldrhtssVar, final boolean z13) {
        return androidx.compose.ui.graphics.gxszxtbevo.iobyxmoadg(androidx.compose.ui.draw.zoijcleaow.wkgbmnqykc(wkgbmnqykcVar, new tg.draadjrbmk() { // from class: fiwbwshyhd.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.wkgbmnqykc((j.ppxfxbqfkf) obj);
            }
        }), new tg.draadjrbmk() { // from class: fiwbwshyhd.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return draadjrbmk.eablkybsjg(vdvldrhtssVar, z13, (androidx.compose.ui.graphics.lqeggnwhkg) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(j.ppxfxbqfkf ppxfxbqfkfVar) {
        int iZoijcleaow = zfvoamnweg.f38997iobyxmoadg.zoijcleaow();
        j.wkgbmnqykc wkgbmnqykcVarK = ppxfxbqfkfVar.K();
        long jZoijcleaow = wkgbmnqykcVarK.zoijcleaow();
        wkgbmnqykcVarK.gxszxtbevo().jyumaefscl();
        try {
            wkgbmnqykcVarK.wkgbmnqykc().ppxfxbqfkf(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iZoijcleaow);
            ppxfxbqfkfVar.b0();
            return wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            wkgbmnqykcVarK.gxszxtbevo().agtfadlqog();
            wkgbmnqykcVarK.nufgyqmvbu(jZoijcleaow);
        }
    }
}
