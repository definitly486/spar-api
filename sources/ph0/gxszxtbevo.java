package ph0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.draadjrbmk;
import androidx.compose.runtime.f;
import androidx.compose.runtime.jyumaefscl;
import czzsidtyhn.ydmasvzmpa;
import fh0.lqeggnwhkg;
import gg.wwaezpbzkn;
import hu.vdvldrhtss;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.components.special_products.api.models.Action;
import ru.myspar.core.domain.models.ProductCardEvent;
import tg.rgvfuqvkyq;
import w0.dxjokdxxww;
import w0.nufgyqmvbu;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn btonecajqb(esjtqupxsv esjtqupxsvVar, yh0.iobyxmoadg.btonecajqb btonecajqbVar, ProductUiModel uiModel, ProductCardEvent event) {
        zdlpuopuiu.btonecajqb(uiModel, "uiModel");
        zdlpuopuiu.btonecajqb(event, "event");
        yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg abstractC3155iobyxmoadg = (yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) btonecajqbVar;
        esjtqupxsvVar.wflxmlrfwp().invoke(uiModel, event, new AnalyticsLocation.ItemFeed(abstractC3155iobyxmoadg.lqeggnwhkg().wkgbmnqykc(), abstractC3155iobyxmoadg.lqeggnwhkg().lqeggnwhkg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dxjokdxxww(esjtqupxsv esjtqupxsvVar, ProductUiModel product, HintUiModel hint) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(hint, "hint");
        esjtqupxsvVar.dxjokdxxww().invoke(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gtknphoqwx(yh0.iobyxmoadg.btonecajqb btonecajqbVar, esjtqupxsv esjtqupxsvVar, int i13, draadjrbmk draadjrbmkVar, int i14) {
        gxszxtbevo(btonecajqbVar, esjtqupxsvVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void gxszxtbevo(final yh0.iobyxmoadg.btonecajqb item, final esjtqupxsv sectionsCallbacks, draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        draadjrbmk draadjrbmkVar2;
        draadjrbmk draadjrbmkVar3;
        zdlpuopuiu.btonecajqb(item, "item");
        zdlpuopuiu.btonecajqb(sectionsCallbacks, "sectionsCallbacks");
        draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(307457583);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(sectionsCallbacks) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
        } else {
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.ntlheqmsrt(307457583, i14, -1, "ru.myspar.myspar.impl.presentation.compose.special_product.SpecialProductsSection (SpecialProductsSection.kt:23)");
            }
            if (item instanceof yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) {
                draadjrbmkVarBtonecajqb.sopmlzcsov(946931404);
                yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg abstractC3155iobyxmoadg = (yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) item;
                if (abstractC3155iobyxmoadg.lqeggnwhkg().eablkybsjg().isEmpty()) {
                    draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                } else {
                    boolean z13 = abstractC3155iobyxmoadg.lqeggnwhkg().gxszxtbevo().length() > 0 && abstractC3155iobyxmoadg.lqeggnwhkg().ppxfxbqfkf() != Action.UNDEFINED;
                    wh0.wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = abstractC3155iobyxmoadg.lqeggnwhkg();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246543281);
                    boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(wkgbmnqykcVarLqeggnwhkg);
                    Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (zUlzqkzuiru || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt = Boolean.valueOf(abstractC3155iobyxmoadg.lqeggnwhkg().eablkybsjg().size() > 3);
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                    }
                    boolean zBooleanValue = ((Boolean) objYadqdtsiqt).booleanValue();
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    String strLqeggnwhkg = abstractC3155iobyxmoadg.lqeggnwhkg().lqeggnwhkg();
                    boolean z14 = !kcexrzcfyt.zfvoamnweg(abstractC3155iobyxmoadg.lqeggnwhkg().lqeggnwhkg());
                    String strPpxfxbqfkf = e0.gxszxtbevo.ppxfxbqfkf(s40.draadjrbmk.special_products_more, draadjrbmkVarBtonecajqb, 0);
                    List listEablkybsjg = abstractC3155iobyxmoadg.lqeggnwhkg().eablkybsjg();
                    ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(nufgyqmvbu.lqeggnwhkg(!zBooleanValue ? 16 : 0), 0.0f, 2, null);
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246502825);
                    int i15 = i14 & 112;
                    int i16 = i14 & 14;
                    boolean z15 = (i16 == 4) | (i15 == 32);
                    Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z15 || objYadqdtsiqt2 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ph0.iobyxmoadg
                            @Override // tg.iobyxmoadg
                            public final Object invoke() {
                                return gxszxtbevo.lqeggnwhkg(sectionsCallbacks, item);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                    }
                    tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246519625);
                    boolean z16 = (i15 == 32) | (i16 == 4);
                    Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z16 || objYadqdtsiqt3 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ph0.zoijcleaow
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj) {
                                return gxszxtbevo.nufgyqmvbu(sectionsCallbacks, item, (ProductUiModel) obj);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                    }
                    tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246516192);
                    boolean z17 = i15 == 32;
                    Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z17 || objYadqdtsiqt4 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt4 = new rgvfuqvkyq() { // from class: ph0.ppxfxbqfkf
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return gxszxtbevo.dxjokdxxww(sectionsCallbacks, (ProductUiModel) obj, (HintUiModel) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                    }
                    rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) objYadqdtsiqt4;
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246499212);
                    boolean z18 = (i15 == 32) | (i16 == 4);
                    Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                    if (z18 || objYadqdtsiqt5 == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                        objYadqdtsiqt5 = new rgvfuqvkyq() { // from class: ph0.wkgbmnqykc
                            @Override // tg.rgvfuqvkyq
                            public final Object invoke(Object obj, Object obj2) {
                                return gxszxtbevo.btonecajqb(sectionsCallbacks, item, (ProductUiModel) obj, (ProductCardEvent) obj2);
                            }
                        };
                        draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                    }
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
                    vdvldrhtss.dxjokdxxww(strLqeggnwhkg, z14, strPpxfxbqfkf, z13, null, 0L, 0L, true, 2, listEablkybsjg, zBooleanValue, zBooleanValue, ydmasvzmpaVarLqeggnwhkg, 0, iobyxmoadgVar, draadjrbmkVar4, rgvfuqvkyqVar, (rgvfuqvkyq) objYadqdtsiqt5, null, null, draadjrbmkVar3, 113246208, 0, 794736);
                }
                draadjrbmkVar3.stevsuqkhv();
                draadjrbmkVar2 = draadjrbmkVar3;
            } else {
                if (!(item instanceof yh0.iobyxmoadg.btonecajqb.zoijcleaow)) {
                    draadjrbmkVarBtonecajqb.sopmlzcsov(-246550357);
                    draadjrbmkVarBtonecajqb.stevsuqkhv();
                    throw new NoWhenBranchMatchedException();
                }
                draadjrbmkVar2 = draadjrbmkVarBtonecajqb;
                draadjrbmkVar2.sopmlzcsov(948950062);
                lqeggnwhkg.ppxfxbqfkf(dxjokdxxww.iobyxmoadg(nufgyqmvbu.lqeggnwhkg(130), nufgyqmvbu.lqeggnwhkg(178)), androidx.compose.foundation.layout.esjtqupxsv.oxmwwwfdhm(androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg, 0.0f, nufgyqmvbu.lqeggnwhkg(14), 0.0f, 0.0f, 13, null), false, draadjrbmkVar2, 54, 4);
                draadjrbmkVar2.stevsuqkhv();
            }
            if (jyumaefscl.jpowsppfya()) {
                jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar2.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ph0.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return gxszxtbevo.gtknphoqwx(item, sectionsCallbacks, i13, (draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lqeggnwhkg(esjtqupxsv esjtqupxsvVar, yh0.iobyxmoadg.btonecajqb btonecajqbVar) {
        esjtqupxsvVar.kcexrzcfyt().invoke(((yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) btonecajqbVar).lqeggnwhkg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nufgyqmvbu(esjtqupxsv esjtqupxsvVar, yh0.iobyxmoadg.btonecajqb btonecajqbVar, ProductUiModel it) {
        zdlpuopuiu.btonecajqb(it, "it");
        esjtqupxsvVar.oxmwwwfdhm().invoke(it, ((yh0.iobyxmoadg.btonecajqb.AbstractC3155iobyxmoadg) btonecajqbVar).lqeggnwhkg());
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
