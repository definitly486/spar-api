package tr;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iozdgvuglv {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(tg.vdvldrhtss vdvldrhtssVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel product, ProductCardEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        vdvldrhtssVar.invoke(product.getId(), event, itemFeed);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(tg.rgvfuqvkyq rgvfuqvkyqVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(it.getId(), itemFeed);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(tg.vdvldrhtss vdvldrhtssVar, uu.zoijcleaow zoijcleaowVar, ProductUiModel product, HintUiModel hint) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        vdvldrhtssVar.invoke(hint, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName()), new AnalyticsLocation.ItemFeed(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(tg.draadjrbmk draadjrbmkVar, ProductUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(it.getId());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final void lqeggnwhkg(final List recommendations, final tg.rgvfuqvkyq onFavoriteClick, final tg.vdvldrhtss onProductChange, final tg.rgvfuqvkyq onProductClick, final tg.draadjrbmk onClickPurchaseLists, final tg.vdvldrhtss onHintClick, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFavoriteClick, "onFavoriteClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChange, "onProductChange");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClick, "onProductClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickPurchaseLists, "onClickPurchaseLists");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClick, "onHintClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(710041305);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(recommendations) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = 16;
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onFavoriteClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductChange) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickPurchaseLists) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClick) ? 131072 : 65536;
        }
        if ((74899 & i14) == 74898 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(710041305, i14, -1, "ru.myspar.catalog.impl.specific_product.presentation.compose.RecommendationsBlock (RecommendationsBlock.kt:21)");
            }
            Iterator it = recommendations.iterator();
            while (it.hasNext()) {
                final uu.zoijcleaow zoijcleaowVar = (uu.zoijcleaow) it.next();
                final AnalyticsLocation.ItemFeed itemFeed = new AnalyticsLocation.ItemFeed(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf());
                String strPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                boolean z13 = !mj.kcexrzcfyt.zfvoamnweg(zoijcleaowVar.ppxfxbqfkf());
                List listIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                float f13 = i16;
                Iterator it2 = it;
                czzsidtyhn.ydmasvzmpa ydmasvzmpaVarLqeggnwhkg = androidx.compose.foundation.layout.esjtqupxsv.lqeggnwhkg(w0.nufgyqmvbu.lqeggnwhkg(f13), 0.0f, i15, null);
                draadjrbmkVarBtonecajqb.sopmlzcsov(1940842162);
                boolean zLmojexxdyd = ((i14 & 7168) == 2048) | draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: tr.lereixgezr
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return iozdgvuglv.nufgyqmvbu(onProductClick, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1940844887);
                boolean zLmojexxdyd2 = ((458752 & i14) == 131072) | draadjrbmkVarBtonecajqb.lmojexxdyd(zoijcleaowVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.rgvfuqvkyq() { // from class: tr.pmvmpeiblj
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return iozdgvuglv.dxjokdxxww(onHintClick, zoijcleaowVar, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar = (tg.rgvfuqvkyq) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1940860461);
                boolean zLmojexxdyd3 = ((i14 & 896) == 256) | draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.rgvfuqvkyq() { // from class: tr.zynmafqrjb
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return iozdgvuglv.btonecajqb(onProductChange, itemFeed, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar2 = (tg.rgvfuqvkyq) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1940864869);
                boolean z14 = (57344 & i14) == 16384;
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: tr.istkbnxepw
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return iozdgvuglv.gtknphoqwx(onClickPurchaseLists, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(1940866899);
                boolean zLmojexxdyd4 = ((i14 & 112) == 32) | draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: tr.cdpycssgdh
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return iozdgvuglv.draadjrbmk(onFavoriteClick, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar4 = draadjrbmkVarBtonecajqb;
                hu.vdvldrhtss.dxjokdxxww(strPpxfxbqfkf, z13, "", false, null, 0L, 0L, false, 2, listIobyxmoadg, false, false, ydmasvzmpaVarLqeggnwhkg, 0, null, draadjrbmkVar2, rgvfuqvkyqVar, rgvfuqvkyqVar2, draadjrbmkVar3, (tg.draadjrbmk) objYadqdtsiqt5, draadjrbmkVar4, 113249664, 438, 24688);
                draadjrbmkVarBtonecajqb = draadjrbmkVar4;
                i50.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(f13), draadjrbmkVarBtonecajqb, 6);
                it = it2;
                i16 = 16;
                i15 = i15;
                i14 = i14;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: tr.yadqdtsiqt
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return iozdgvuglv.wflxmlrfwp(recommendations, onFavoriteClick, onProductChange, onProductClick, onClickPurchaseLists, onHintClick, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn nufgyqmvbu(tg.rgvfuqvkyq rgvfuqvkyqVar, AnalyticsLocation.ItemFeed itemFeed, ProductUiModel it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        rgvfuqvkyqVar.invoke(it.getId(), itemFeed);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(List list, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        lqeggnwhkg(list, rgvfuqvkyqVar, vdvldrhtssVar, rgvfuqvkyqVar2, draadjrbmkVar, vdvldrhtssVar2, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
