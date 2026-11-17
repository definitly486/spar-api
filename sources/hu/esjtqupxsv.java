package hu;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import ku.yadqdtsiqt;
import ru.myspar.common.view.hint.model.HintUiModel;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class esjtqupxsv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(tg.rgvfuqvkyq rgvfuqvkyqVar, pu.wkgbmnqykc wkgbmnqykcVar) {
        rgvfuqvkyqVar.invoke(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.agtfadlqog());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.rgvfuqvkyq rgvfuqvkyqVar, pu.wkgbmnqykc wkgbmnqykcVar, HintUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(it, wkgbmnqykcVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        wkgbmnqykc(list, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(final List products, final tg.rgvfuqvkyq onProductClicked, final tg.rgvfuqvkyq onHintClicked, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-2015633888);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(products) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 32;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClicked) ? 32 : 16;
        }
        int i16 = i13 & 384;
        int i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        if (i16 == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i14 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2015633888, i14, -1, "ru.myspar.common.view.product.compose.list.horizontal.ProductOrderCardHorizontalList (ProductOrderCardHorizontalList.kt:23)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
            boolean z13 = false;
            zynmafqrjb zynmafqrjbVarIobyxmoadg = czzsidtyhn.wflxmlrfwp.iobyxmoadg(czzsidtyhn.eablkybsjg.f26292iobyxmoadg.dxjokdxxww(), a.eablkybsjg.f20iobyxmoadg.gtknphoqwx(), draadjrbmkVarBtonecajqb, 0);
            int iHashCode = Long.hashCode(androidx.compose.runtime.nufgyqmvbu.zoijcleaow(draadjrbmkVarBtonecajqb, 0));
            androidx.compose.runtime.wwaezpbzkn wwaezpbzknVarKcexrzcfyt = draadjrbmkVarBtonecajqb.kcexrzcfyt();
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarEablkybsjg = androidx.compose.ui.ppxfxbqfkf.eablkybsjg(draadjrbmkVarBtonecajqb, wkgbmnqykcVarNufgyqmvbu);
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
            androidx.compose.runtime.draadjrbmk draadjrbmkVarIobyxmoadg = m1.iobyxmoadg(draadjrbmkVarBtonecajqb);
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, zynmafqrjbVarIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf());
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wwaezpbzknVarKcexrzcfyt, iobyxmoadgVar.eablkybsjg());
            tg.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
            if (draadjrbmkVarIobyxmoadg.lqeggnwhkg() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVarIobyxmoadg.yadqdtsiqt(), Integer.valueOf(iHashCode))) {
                draadjrbmkVarIobyxmoadg.jyumaefscl(Integer.valueOf(iHashCode));
                draadjrbmkVarIobyxmoadg.zdlpuopuiu(Integer.valueOf(iHashCode), rgvfuqvkyqVarZoijcleaow);
            }
            m1.zoijcleaow(draadjrbmkVarIobyxmoadg, wkgbmnqykcVarEablkybsjg, iobyxmoadgVar.wkgbmnqykc());
            czzsidtyhn.vdvldrhtss vdvldrhtssVar = czzsidtyhn.vdvldrhtss.f26487iobyxmoadg;
            draadjrbmkVarBtonecajqb.sopmlzcsov(1530762475);
            Iterator it = products.iterator();
            while (it.hasNext()) {
                final pu.wkgbmnqykc wkgbmnqykcVar = (pu.wkgbmnqykc) it.next();
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarPmvmpeiblj = l50.draadjrbmk.pmvmpeiblj(iobyxmoadgVar2, "PRODUCT_CARD_HORIZONTAL" + wkgbmnqykcVar.draadjrbmk(), null, null, false, 14, null);
                qt.zoijcleaow zoijcleaowVar = qt.zoijcleaow.PRICE_AND_AMOUNT;
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1817460128);
                boolean zLmojexxdyd = ((i14 & 112) == i15 ? true : z13) | draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: hu.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.eablkybsjg(onProductClicked, wkgbmnqykcVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1817457682);
                boolean zLmojexxdyd2 = ((i14 & 896) == i17 ? true : z13) | draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: hu.iwizpuwonk
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return esjtqupxsv.gxszxtbevo(onHintClicked, wkgbmnqykcVar, (HintUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                yadqdtsiqt.dxjokdxxww(wkgbmnqykcVar, false, false, false, false, false, false, zoijcleaowVar, wkgbmnqykcVarPmvmpeiblj, false, 0, null, iobyxmoadgVar3, (tg.draadjrbmk) objYadqdtsiqt2, null, null, null, null, null, draadjrbmkVar3, 14380464, 0, 511488);
                ku.oxmwwwfdhm.zoijcleaow(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVar3, 6, 0);
                draadjrbmkVarBtonecajqb = draadjrbmkVar3;
                z13 = false;
                i17 = i17;
                i15 = i15;
                i14 = i14;
            }
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
            draadjrbmkVar2.stevsuqkhv();
            draadjrbmkVar2.cqumvgiudr();
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: hu.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.lqeggnwhkg(products, onProductClicked, onHintClicked, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
