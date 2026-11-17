package bt0;

import androidx.compose.foundation.layout.cdpycssgdh;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.compose.runtime.m1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import et0.yadqdtsiqt;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import x.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public abstract class esjtqupxsv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(tg.rgvfuqvkyq rgvfuqvkyqVar, jt0.wkgbmnqykc wkgbmnqykcVar) {
        rgvfuqvkyqVar.invoke(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.agtfadlqog());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(tg.rgvfuqvkyq rgvfuqvkyqVar, jt0.wkgbmnqykc wkgbmnqykcVar, HintUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(it, wkgbmnqykcVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(List list, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, int i14, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i15) {
        wkgbmnqykc(list, i13, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar, f.iobyxmoadg(i14 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void wkgbmnqykc(final List products, final int i13, final tg.rgvfuqvkyq onProductClicked, final tg.rgvfuqvkyq onHintClicked, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i14) {
        int i15;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(products, "products");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClicked, "onProductClicked");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClicked, "onHintClicked");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-216548748);
        if ((i14 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.lmojexxdyd(products) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(i13) ? 32 : 16;
        }
        int i16 = i14 & 384;
        int i17 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        if (i16 == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClicked) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i18 = 2048;
        if ((i14 & 3072) == 0) {
            i15 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClicked) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i15 & 1171) == 1170 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-216548748, i15, -1, "ru.myspar.proloyalty.common.view.product.compose.list.horizontal.ProductOrderCardHorizontalList (ProductOrderCardHorizontalList.kt:22)");
            }
            androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarNufgyqmvbu = cdpycssgdh.nufgyqmvbu(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, 1, null);
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
            draadjrbmkVarBtonecajqb.sopmlzcsov(1814725890);
            Iterator it = products.iterator();
            while (it.hasNext()) {
                final jt0.wkgbmnqykc wkgbmnqykcVar = (jt0.wkgbmnqykc) it.next();
                androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarOjitshcjhn = w31.nufgyqmvbu.ojitshcjhn(iobyxmoadgVar2, "PRODUCT_CARD_HORIZONTAL" + wkgbmnqykcVar.draadjrbmk(), null, null, false, 14, null);
                js0.zoijcleaow zoijcleaowVar = js0.zoijcleaow.PRICE_AND_AMOUNT;
                draadjrbmkVarBtonecajqb.sopmlzcsov(41129475);
                boolean zLmojexxdyd = ((i15 & 896) == i17) | draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: bt0.jyumaefscl
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return esjtqupxsv.eablkybsjg(onProductClicked, wkgbmnqykcVar);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41131921);
                boolean zLmojexxdyd2 = ((i15 & 7168) == i18) | draadjrbmkVarBtonecajqb.lmojexxdyd(wkgbmnqykcVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: bt0.iwizpuwonk
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return esjtqupxsv.gxszxtbevo(onHintClicked, wkgbmnqykcVar, (HintUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                yadqdtsiqt.dxjokdxxww(wkgbmnqykcVar, false, false, false, false, false, false, zoijcleaowVar, wkgbmnqykcVarOjitshcjhn, false, 0, null, iobyxmoadgVar3, (tg.draadjrbmk) objYadqdtsiqt2, null, null, null, null, null, draadjrbmkVar3, 14380464, 0, 511488);
                et0.oxmwwwfdhm.zoijcleaow(androidx.compose.foundation.layout.esjtqupxsv.rgvfuqvkyq(iobyxmoadgVar2, w0.nufgyqmvbu.lqeggnwhkg(i13), 0.0f, 2, null), draadjrbmkVar3, 0, 0);
                draadjrbmkVarBtonecajqb = draadjrbmkVar3;
                i18 = i18;
                i17 = i17;
                i15 = i15;
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
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: bt0.cqumvgiudr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return esjtqupxsv.lqeggnwhkg(products, i13, onProductClicked, onHintClicked, i14, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
