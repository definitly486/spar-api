package je1;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ct0.czzsidtyhn;
import ct0.jhduphickx;
import czzsidtyhn.ydmasvzmpa;
import df1.cqumvgiudr;
import dt0.jpowsppfya;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import tg.rgvfuqvkyq;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(cqumvgiudr cqumvgiudrVar, kt0.iobyxmoadg iobyxmoadgVar) {
        cqumvgiudrVar.gxszxtbevo().invoke(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(cqumvgiudr cqumvgiudrVar, kt0.iobyxmoadg iobyxmoadgVar) {
        cqumvgiudrVar.eablkybsjg().invoke(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        gxszxtbevo(wkgbmnqykcVar, ppxfxbqfkfVar, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.ppxfxbqfkf item, final cqumvgiudr sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        int i15;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(810471639);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVar) ? 4 : 2) | i13;
        } else {
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (i16 != 0) {
                wkgbmnqykcVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(810471639, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.combo.ComboSection (ComboSection.kt:20)");
            }
            if (item instanceof df1.iobyxmoadg.ppxfxbqfkf.zoijcleaow) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1113347229);
                List listLqeggnwhkg = ((df1.iobyxmoadg.ppxfxbqfkf.zoijcleaow) item).lqeggnwhkg();
                ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1903755766);
                boolean z13 = (i15 & 896) == 256;
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z13 || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new rgvfuqvkyq() { // from class: je1.iobyxmoadg
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return gxszxtbevo.lqeggnwhkg(sectionsCallbacks, (String) obj, (ComboSetProduct) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                jhduphickx.agtfadlqog(wkgbmnqykcVar, listLqeggnwhkg, ydmasvzmpaVarLqeggnwhkg, (rgvfuqvkyq) objYadqdtsiqt, sectionsCallbacks.eablkybsjg(), sectionsCallbacks.gxszxtbevo(), draadjrbmkVarBtonecajqb, (i15 & 14) | 384, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else if (item instanceof df1.iobyxmoadg.ppxfxbqfkf.C0561ppxfxbqfkf) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(-1112663090);
                final kt0.iobyxmoadg iobyxmoadgVarLqeggnwhkg = ((df1.iobyxmoadg.ppxfxbqfkf.C0561ppxfxbqfkf) item).lqeggnwhkg();
                androidx.compose.ui.wkgbmnqykc wkgbmnqykcVarRgvfuqvkyq = esjtqupxsv.rgvfuqvkyq(wkgbmnqykcVar, nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1903777472);
                int i17 = i15 & 896;
                boolean z14 = i17 == 256;
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: je1.zoijcleaow
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return gxszxtbevo.nufgyqmvbu(sectionsCallbacks, (ComboSetProduct) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1903784534);
                boolean zUlzqkzuiru = (i17 == 256) | draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVarLqeggnwhkg);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru || objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: je1.ppxfxbqfkf
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.dxjokdxxww(sectionsCallbacks, iobyxmoadgVarLqeggnwhkg);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1903787348);
                boolean zUlzqkzuiru2 = draadjrbmkVarBtonecajqb.ulzqkzuiru(iobyxmoadgVarLqeggnwhkg) | (i17 == 256);
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zUlzqkzuiru2 || objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: je1.wkgbmnqykc
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return gxszxtbevo.btonecajqb(sectionsCallbacks, iobyxmoadgVarLqeggnwhkg);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                czzsidtyhn.lqeggnwhkg(wkgbmnqykcVarRgvfuqvkyq, iobyxmoadgVarLqeggnwhkg, draadjrbmkVar2, iobyxmoadgVar, (tg.iobyxmoadg) objYadqdtsiqt4, draadjrbmkVarBtonecajqb, 0, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.ppxfxbqfkf.wkgbmnqykc)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(1903747186);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1903791324);
                jpowsppfya.ojitshcjhn(wkgbmnqykcVar, true, esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null), draadjrbmkVarBtonecajqb, (i15 & 14) | 432, 0);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: je1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.gtknphoqwx(wkgbmnqykcVar2, item, sectionsCallbacks, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(cqumvgiudr cqumvgiudrVar, String title, ComboSetProduct product) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(product, "product");
        cqumvgiudrVar.lqeggnwhkg().invoke(product, new wm0.zoijcleaow(product.getId(), title));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(cqumvgiudr cqumvgiudrVar, ComboSetProduct it) {
        zdlpuopuiu.btonecajqb(it, "it");
        cqumvgiudrVar.lqeggnwhkg().invoke(it, new wm0.zoijcleaow(it.getId(), it.getName()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
