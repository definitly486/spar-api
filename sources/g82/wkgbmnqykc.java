package g82;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import h.oipsdeybqn;
import igdgnonuha.q;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.iobyxmoadg iobyxmoadgVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        ppxfxbqfkf(wkgbmnqykcVar, iobyxmoadgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1957149586);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(iobyxmoadgVar) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (i17 != 0) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(2095693228);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: g82.zoijcleaow
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return wkgbmnqykc.wkgbmnqykc();
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1957149586, i15, -1, "ru.myspar.story.impl.presentation.compose.control.StoryCloseButton (StoryCloseButton.kt:25)");
            }
            float f13 = 32;
            q.zoijcleaow(iobyxmoadgVar, cdpycssgdh.vdvldrhtss(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar, oipsdeybqn.f38945zoijcleaow.nufgyqmvbu(), bfopjjpdmp.lqeggnwhkg.ppxfxbqfkf(w0.nufgyqmvbu.lqeggnwhkg(f13))), w0.nufgyqmvbu.lqeggnwhkg(f13)), false, null, iobyxmoadg.f36664iobyxmoadg.iobyxmoadg(), draadjrbmkVarBtonecajqb, ((i15 >> 3) & 14) | 24576, 12);
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: g82.ppxfxbqfkf
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wkgbmnqykc.eablkybsjg(wkgbmnqykcVar, iobyxmoadgVar, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
