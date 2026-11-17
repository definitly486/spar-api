package g31;

import a.eablkybsjg;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.foundation.layout.wflxmlrfwp;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import bfopjjpdmp.lqeggnwhkg;
import gg.wwaezpbzkn;
import igdgnonuha.w6;
import igdgnonuha.z;
import j0.h;
import j0.i;
import j0.n;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import tg.rgvfuqvkyq;
import v0.btonecajqb;
import w0.nufgyqmvbu;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, String str, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, str, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, int i13, int i14, int i15, draadjrbmk draadjrbmkVar, int i16) {
        ppxfxbqfkf(wkgbmnqykcVar, i13, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final int i13, draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        int i16;
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2118464228);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        if ((i16 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i17 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(2118464228, i16, -1, "ru.myspar.proloyalty.core.ui.compose.components.badge.MySparBadge (MySparBadge.kt:52)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1874111792);
            boolean z13 = (i16 & 112) == 32;
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = wkgbmnqykc.zoijcleaow(Integer.valueOf(i13));
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            String str = (String) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            if (str != null && !kcexrzcfyt.zfvoamnweg(str)) {
                wkgbmnqykc(wkgbmnqykcVar, str, draadjrbmkVarBtonecajqb, i16 & 14, 0);
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: g31.iobyxmoadg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.gxszxtbevo(wkgbmnqykcVar, i13, i14, i15, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final String badgeText, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(badgeText, "badgeText");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1354831502);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13 | (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2);
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(badgeText) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-1354831502, i15, -1, "ru.myspar.proloyalty.core.ui.compose.components.badge.MySparBadge (MySparBadge.kt:24)");
            }
            h hVarIobyxmoadg = i.iobyxmoadg(0, draadjrbmkVarBtonecajqb, 0, 1);
            z zVar = z.f44180iobyxmoadg;
            int i17 = z.f44181zoijcleaow;
            n nVarEablkybsjg = l41.ppxfxbqfkf.zoijcleaow(zVar, draadjrbmkVarBtonecajqb, i17).zoijcleaow().eablkybsjg();
            nufgyqmvbu nufgyqmvbuVarIobyxmoadg = wkgbmnqykc.iobyxmoadg(hVarIobyxmoadg, nVarEablkybsjg, badgeText, draadjrbmkVarBtonecajqb, (i15 << 3) & 896);
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarAgtfadlqog = esjtqupxsv.agtfadlqog(androidx.compose.foundation.zoijcleaow.ppxfxbqfkf(wkgbmnqykcVar3, l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i17).dxjokdxxww(), lqeggnwhkg.gxszxtbevo()), nufgyqmvbu.lqeggnwhkg(3));
            zynmafqrjb zynmafqrjbVarDxjokdxxww = androidx.compose.foundation.layout.nufgyqmvbu.dxjokdxxww(eablkybsjg.f20iobyxmoadg.eablkybsjg(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarAgtfadlqog);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarDxjokdxxww, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f4892iobyxmoadg;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(badgeText, wkgbmnqykc.ppxfxbqfkf(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, nufgyqmvbuVarIobyxmoadg), zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i17).lqeggnwhkg(), 0L, null, null, null, 0L, null, btonecajqb.nufgyqmvbu(btonecajqb.f114934zoijcleaow.iobyxmoadg()), 0L, 0, false, 0, 0, null, nVarEablkybsjg, draadjrbmkVar2, (i15 >> 3) & 14, 0, 65016);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar4;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: g31.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.eablkybsjg(wkgbmnqykcVar2, badgeText, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
