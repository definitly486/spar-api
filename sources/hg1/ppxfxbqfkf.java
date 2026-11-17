package hg1;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.nufgyqmvbu;
import androidx.compose.ui.wkgbmnqykc;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.eablkybsjg;
import czzsidtyhn.vdvldrhtss;
import czzsidtyhn.wflxmlrfwp;
import et0.oxmwwwfdhm;
import et0.yadqdtsiqt;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;
import x.zynmafqrjb;
import z.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(wkgbmnqykc wkgbmnqykcVar, List list, int i13, rgvfuqvkyq rgvfuqvkyqVar, int i14, int i15, draadjrbmk draadjrbmkVar, int i16) {
        ppxfxbqfkf(wkgbmnqykcVar, list, i13, rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i14 | 1), i15);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void ppxfxbqfkf(wkgbmnqykc wkgbmnqykcVar, final List products, final int i13, final rgvfuqvkyq onProductClicked, draadjrbmk draadjrbmkVar, final int i14, final int i15) {
        wkgbmnqykc wkgbmnqykcVar2;
        int i16;
        draadjrbmk draadjrbmkVar2;
        final wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1425900108);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            wkgbmnqykcVar2 = wkgbmnqykcVar;
        } else if ((i14 & 6) == 0) {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar2) ? 4 : 2) | i14;
        } else {
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            i16 = i14;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.lmojexxdyd(products) ? 32 : 16;
        }
        if ((i15 & 4) != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = 2048;
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClicked) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i19 = i16;
        if ((i19 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            wkgbmnqykc wkgbmnqykcVar4 = i17 != 0 ? wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(1425900108, i19, -1, "ru.myspar.proloyalty.orders.impl.screens.specific.presentation.compose.RemovedOrderProduct (RemovedOrderProduct.kt:19)");
            }
            wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(wkgbmnqykcVar4, 0.0f, 1, null);
            zynmafqrjb zynmafqrjbVarIobyxmoadg = wflxmlrfwp.iobyxmoadg(eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
            lqeggnwhkg.iobyxmoadg iobyxmoadgVar = lqeggnwhkg.f127047oxmwwwfdhm;
            tg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (draadjrbmkVarBtonecajqb.draadjrbmk() == null) {
                nufgyqmvbu.wkgbmnqykc();
            }
            draadjrbmkVarBtonecajqb.pkzmftpjix();
            if (draadjrbmkVarBtonecajqb.lqeggnwhkg()) {
                draadjrbmkVarBtonecajqb.lereixgezr(iobyxmoadgVarIobyxmoadg);
            } else {
                draadjrbmkVarBtonecajqb.yggfygwlhe();
            }
            draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            vdvldrhtss vdvldrhtssVar = vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1280067223);
            Iterator it = products.iterator();
            while (it.hasNext()) {
                final jt0.wkgbmnqykc wkgbmnqykcVar5 = (jt0.wkgbmnqykc) it.next();
                js0.zoijcleaow zoijcleaowVar = js0.zoijcleaow.PRICE_AND_AMOUNT;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-699136928);
                boolean zLmojexxdyd = ((i19 & 7168) == i18) | draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar5);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: hg1.iobyxmoadg
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return ppxfxbqfkf.wkgbmnqykc(onProductClicked, wkgbmnqykcVar5);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmk draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                yadqdtsiqt.dxjokdxxww(wkgbmnqykcVar5, false, false, false, false, false, true, zoijcleaowVar, null, false, 0, null, (tg.iobyxmoadg) objYadqdtsiqt, null, null, null, null, null, null, draadjrbmkVar3, jt0.wkgbmnqykc.f52317jyumaefscl | 14380464, 0, 519936);
                oxmwwwfdhm.zoijcleaow(esjtqupxsv.rgvfuqvkyq(wkgbmnqykc.f7471iobyxmoadg, w0.nufgyqmvbu.lqeggnwhkg(i13), 0.0f, 2, null), draadjrbmkVar3, 0, 0);
                draadjrbmkVarBtonecajqb = draadjrbmkVar3;
                wkgbmnqykcVar4 = wkgbmnqykcVar4;
                i18 = i18;
            }
            wkgbmnqykc wkgbmnqykcVar6 = wkgbmnqykcVar4;
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar6;
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hg1.zoijcleaow
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ppxfxbqfkf.eablkybsjg(wkgbmnqykcVar3, products, i13, onProductClicked, i14, i15, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar, jt0.wkgbmnqykc wkgbmnqykcVar) {
        rgvfuqvkyqVar.invoke(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.agtfadlqog());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
