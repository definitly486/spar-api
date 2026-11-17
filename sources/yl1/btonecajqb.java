package yl1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.c1;
import androidx.compose.runtime.f;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.lrnfpwlwnk;
import czzsidtyhn.roivzttewh;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import igdgnonuha.istkbnxepw;
import igdgnonuha.pkzmftpjix;
import igdgnonuha.w6;
import igdgnonuha.z;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class btonecajqb {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, am1.gxszxtbevo gxszxtbevoVar, tg.draadjrbmk draadjrbmkVar, int i13, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i15) {
        wkgbmnqykc(wkgbmnqykcVar, gxszxtbevoVar, draadjrbmkVar, draadjrbmkVar2, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private static final boolean eablkybsjg(iwxlajgraz iwxlajgrazVar) {
        return ((Boolean) iwxlajgrazVar.getValue()).booleanValue();
    }

    private static final void gxszxtbevo(iwxlajgraz iwxlajgrazVar, boolean z13) {
        iwxlajgrazVar.setValue(Boolean.valueOf(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(tg.draadjrbmk draadjrbmkVar, am1.gxszxtbevo gxszxtbevoVar, iwxlajgraz iwxlajgrazVar) {
        gxszxtbevo(iwxlajgrazVar, !eablkybsjg(iwxlajgrazVar));
        draadjrbmkVar.invoke(new vdvldrhtss(gxszxtbevoVar.getItemId(), Boolean.valueOf(eablkybsjg(iwxlajgrazVar))));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(tg.draadjrbmk draadjrbmkVar, am1.gxszxtbevo gxszxtbevoVar, iwxlajgraz iwxlajgrazVar, boolean z13) {
        gxszxtbevo(iwxlajgrazVar, z13);
        draadjrbmkVar.invoke(new vdvldrhtss(gxszxtbevoVar.getItemId(), Boolean.valueOf(z13)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final am1.gxszxtbevo item, final tg.draadjrbmk reasonChangeCallback, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(reasonChangeCallback, "reasonChangeCallback");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1179087361);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i13 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i13;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 32 : 16;
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(reasonChangeCallback) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1179087361, i15, -1, "ru.myspar.proloyalty.rate.rate_order.impl.presentation.components.RateReasonItem (RateReasonItem.kt:30)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1882175415);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.valueOf(item.eablkybsjg()), null, 2, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            final iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            float f13 = 2;
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = esjtqupxsv.oxmwwwfdhm(cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar3, 0.0f, 1, null), w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, 10, null);
            int iPpxfxbqfkf = g0.nufgyqmvbu.f35737zoijcleaow.ppxfxbqfkf();
            draadjrbmkVarBtonecajqb.sopmlzcsov(1882185107);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = metgxyhuhe.gtknphoqwx.iobyxmoadg();
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            metgxyhuhe.draadjrbmk draadjrbmkVar3 = (metgxyhuhe.draadjrbmk) objYadqdtsiqt2;
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            g0.nufgyqmvbu nufgyqmvbuVarBtonecajqb = g0.nufgyqmvbu.btonecajqb(iPpxfxbqfkf);
            draadjrbmkVarBtonecajqb.sopmlzcsov(1882186926);
            int i17 = i15 & 896;
            int i18 = i15 & 112;
            boolean z13 = (i17 == 256) | (i18 == 32);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z13 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: yl1.lqeggnwhkg
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return btonecajqb.lqeggnwhkg(reasonChangeCallback, item, iwxlajgrazVar);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = androidx.compose.foundation.eablkybsjg.gxszxtbevo(wkgbmnqykcVarOxmwwwfdhm, draadjrbmkVar3, null, false, null, nufgyqmvbuVarBtonecajqb, (tg.iobyxmoadg) objYadqdtsiqt3, 12, null);
            zynmafqrjb zynmafqrjbVarZoijcleaow = lrnfpwlwnk.zoijcleaow(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.nufgyqmvbu(), a.eablkybsjg.f20iobyxmoadg.dxjokdxxww(), draadjrbmkVarBtonecajqb, 48);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarGxszxtbevo);
            z.lqeggnwhkg.iobyxmoadg iobyxmoadgVar2 = z.lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                androidx.compose.runtime.nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarZoijcleaow, iobyxmoadgVar2.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar2.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar2.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar2.wkgbmnqykc());
            roivzttewh roivzttewhVar = roivzttewh.f26469iobyxmoadg;
            igdgnonuha.cdpycssgdh cdpycssgdhVar = igdgnonuha.cdpycssgdh.f42714iobyxmoadg;
            z zVar = z.f44180iobyxmoadg;
            int i19 = z.f44181zoijcleaow;
            istkbnxepw istkbnxepwVarIobyxmoadg = cdpycssgdhVar.iobyxmoadg(zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).btonecajqb(), zVar.iobyxmoadg(draadjrbmkVarBtonecajqb, i19).btonecajqb(), 0L, 0L, 0L, draadjrbmkVarBtonecajqb, igdgnonuha.cdpycssgdh.f42715zoijcleaow << 15, 28);
            boolean zEablkybsjg = eablkybsjg(iwxlajgrazVar);
            draadjrbmkVarBtonecajqb.sopmlzcsov(2009517747);
            boolean z14 = (i17 == 256) | (i18 == 32);
            Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (z14 || objYadqdtsiqt4 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: yl1.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return btonecajqb.nufgyqmvbu(reasonChangeCallback, item, iwxlajgrazVar, ((Boolean) obj).booleanValue());
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            pkzmftpjix.gxszxtbevo(zEablkybsjg, (tg.draadjrbmk) objYadqdtsiqt4, null, false, null, istkbnxepwVarIobyxmoadg, draadjrbmkVarBtonecajqb, 0, 28);
            String strWkgbmnqykc = item.wkgbmnqykc();
            long jIwizpuwonk = l41.ppxfxbqfkf.iobyxmoadg(zVar, draadjrbmkVarBtonecajqb, i19).iwizpuwonk();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            w6.btonecajqb(strWkgbmnqykc, null, jIwizpuwonk, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, draadjrbmkVar2, 0, 0, 131066);
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar3;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar2;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: yl1.dxjokdxxww
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return btonecajqb.dxjokdxxww(wkgbmnqykcVar4, item, reasonChangeCallback, i13, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
