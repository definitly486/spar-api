package ue1;

import androidx.compose.foundation.layout.esjtqupxsv;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import b31.wflxmlrfwp;
import bt0.vdvldrhtss;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import czzsidtyhn.ydmasvzmpa;
import df1.cqumvgiudr;
import gg.wwaezpbzkn;
import java.util.List;
import ke1.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.components.special_products.api.models.Action;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import w0.nufgyqmvbu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(cqumvgiudr cqumvgiudrVar, df1.iobyxmoadg.btonecajqb btonecajqbVar, ProductUiModel uiModel, ProductCardEvent event) {
        zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        zdlpuopuiu.btonecajqb(event, "event");
        df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg abstractC0530iobyxmoadg = (df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) btonecajqbVar;
        cqumvgiudrVar.wflxmlrfwp().invoke(uiModel, event, new AnalyticsLocation.ItemFeed(abstractC0530iobyxmoadg.lqeggnwhkg().wkgbmnqykc(), abstractC0530iobyxmoadg.lqeggnwhkg().lqeggnwhkg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(cqumvgiudr cqumvgiudrVar, ProductUiModel product, HintUiModel hint) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(hint, "hint");
        cqumvgiudrVar.btonecajqb().invoke(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, df1.iobyxmoadg.btonecajqb btonecajqbVar, cqumvgiudr cqumvgiudrVar, int i13, int i14, draadjrbmk draadjrbmkVar, int i15) {
        gxszxtbevo(wkgbmnqykcVar, btonecajqbVar, cqumvgiudrVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1), i14);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, final df1.iobyxmoadg.btonecajqb item, final cqumvgiudr sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13, final int i14) {
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar2;
        int i15;
        androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar3;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-346710689);
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
            i15 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i15 & 147) == 146 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
        } else {
            wkgbmnqykcVar3 = i16 != 0 ? androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg : wkgbmnqykcVar2;
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(-346710689, i15, -1, "ru.myspar.proloyalty.myspar.impl.presentation.compose.special_product.SpecialProductsSection (SpecialProductsSection.kt:24)");
            }
            if (item instanceof df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(1420024377);
                df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg abstractC0530iobyxmoadg = (df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) item;
                if (!abstractC0530iobyxmoadg.lqeggnwhkg().eablkybsjg().isEmpty()) {
                    boolean z13 = abstractC0530iobyxmoadg.lqeggnwhkg().gxszxtbevo().length() > 0 && abstractC0530iobyxmoadg.lqeggnwhkg().ppxfxbqfkf() != Action.UNDEFINED;
                    bf1.zoijcleaow zoijcleaowVarLqeggnwhkg = abstractC0530iobyxmoadg.lqeggnwhkg();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-924018964);
                    boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(zoijcleaowVarLqeggnwhkg);
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = Boolean.valueOf(abstractC0530iobyxmoadg.lqeggnwhkg().eablkybsjg().size() > 3);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    boolean zBooleanValue = ((Boolean) objYadqdtsiqt).booleanValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    String strLqeggnwhkg = abstractC0530iobyxmoadg.lqeggnwhkg().lqeggnwhkg();
                    boolean z14 = !kcexrzcfyt.zfvoamnweg(abstractC0530iobyxmoadg.lqeggnwhkg().lqeggnwhkg());
                    String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(wflxmlrfwp.proloyalty_special_products_more, draadjrbmkVarBtonecajqb, 0);
                    List listEablkybsjg = abstractC0530iobyxmoadg.lqeggnwhkg().eablkybsjg();
                    ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(16), 0.0f, 2, null);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-923976876);
                    int i17 = i15 & 896;
                    int i18 = i15 & 112;
                    boolean z15 = (i17 == 256) | (i18 == 32);
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ue1.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return gxszxtbevo.lqeggnwhkg(sectionsCallbacks, item);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-923993676);
                    boolean z16 = (i17 == 256) | (i18 == 32);
                    Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z16 || objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ue1.zoijcleaow
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return gxszxtbevo.nufgyqmvbu(sectionsCallbacks, item, (ProductUiModel) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-923990243);
                    boolean z17 = i17 == 256;
                    Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z17 || objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new rgvfuqvkyq() { // from class: ue1.ppxfxbqfkf
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return gxszxtbevo.dxjokdxxww(sectionsCallbacks, (ProductUiModel) obj, (HintUiModel) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-923973263);
                    boolean z18 = (i17 == 256) | (i18 == 32);
                    Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z18 || objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new rgvfuqvkyq() { // from class: ue1.wkgbmnqykc
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return gxszxtbevo.btonecajqb(sectionsCallbacks, item, (ProductUiModel) obj, (ProductCardEvent) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    vdvldrhtss.dxjokdxxww(strLqeggnwhkg, z14, strPpxfxbqfkf, z13, wkgbmnqykcVar3, 0L, 0L, true, 2, listEablkybsjg, zBooleanValue, zBooleanValue, ydmasvzmpaVarLqeggnwhkg, 8, iobyxmoadgVar, draadjrbmkVar2, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt5, null, null, draadjrbmkVarBtonecajqb, ((i15 << 12) & 57344) | 113246208, 3456, 786528);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            } else {
                if (!(item instanceof df1.iobyxmoadg.btonecajqb.zoijcleaow)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-924025975);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVarBtonecajqb.sopmlzcsov(1422125030);
                lqeggnwhkg.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(nufgyqmvbu.lqeggnwhkg(130), nufgyqmvbu.lqeggnwhkg(178)), wkgbmnqykcVar3, false, draadjrbmkVarBtonecajqb, ((i15 << 3) & 112) | 6, 4);
                draadjrbmkVarBtonecajqb.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            final androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar4 = wkgbmnqykcVar3;
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ue1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.gtknphoqwx(wkgbmnqykcVar4, item, sectionsCallbacks, i13, i14, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(cqumvgiudr cqumvgiudrVar, df1.iobyxmoadg.btonecajqb btonecajqbVar) {
        cqumvgiudrVar.oxmwwwfdhm().invoke(((df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) btonecajqbVar).lqeggnwhkg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(cqumvgiudr cqumvgiudrVar, df1.iobyxmoadg.btonecajqb btonecajqbVar, ProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        cqumvgiudrVar.vdvldrhtss().invoke(it, ((df1.iobyxmoadg.btonecajqb.AbstractC0530iobyxmoadg) btonecajqbVar).lqeggnwhkg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
