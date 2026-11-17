package gq0;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;

/* JADX INFO: loaded from: classes5.dex */
public abstract class pmvmpeiblj {
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
    public static final gg.wwaezpbzkn dxjokdxxww(tg.vdvldrhtss vdvldrhtssVar, ot0.zoijcleaow zoijcleaowVar, ProductUiModel product, HintUiModel hint) {
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

    public static final void lqeggnwhkg(final List recommendations, final czzsidtyhn.ydmasvzmpa contentPadding, final tg.rgvfuqvkyq rgvfuqvkyqVar, final tg.vdvldrhtss vdvldrhtssVar, final tg.rgvfuqvkyq rgvfuqvkyqVar2, final tg.draadjrbmk draadjrbmkVar, final tg.vdvldrhtss vdvldrhtssVar2, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVar3;
        final tg.rgvfuqvkyq onFavoriteClick = rgvfuqvkyqVar;
        final tg.vdvldrhtss onProductChange = vdvldrhtssVar;
        final tg.rgvfuqvkyq onProductClick = rgvfuqvkyqVar2;
        final tg.draadjrbmk onClickPurchaseLists = draadjrbmkVar;
        final tg.vdvldrhtss onHintClick = vdvldrhtssVar2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(contentPadding, "contentPadding");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onFavoriteClick, "onFavoriteClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductChange, "onProductChange");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onProductClick, "onProductClick");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onClickPurchaseLists, "onClickPurchaseLists");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onHintClick, "onHintClick");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar2.btonecajqb(-1840411429);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(recommendations) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ulzqkzuiru(contentPadding) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onFavoriteClick) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i15 = 2048;
        if ((i13 & 3072) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductChange) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        int i16 = 16384;
        if ((i13 & 24576) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onProductClick) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onClickPurchaseLists) ? 131072 : 65536;
        }
        int i17 = 1048576;
        if ((1572864 & i13) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(onHintClick) ? 1048576 : 524288;
        }
        int i18 = i14;
        if ((599187 & i18) == 599186 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1840411429, i18, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.compose.RecommendationsBlock (RecommendationsBlock.kt:23)");
            }
            Iterator it = recommendations.iterator();
            while (it.hasNext()) {
                final ot0.zoijcleaow zoijcleaowVar = (ot0.zoijcleaow) it.next();
                final AnalyticsLocation.ItemFeed itemFeed = new AnalyticsLocation.ItemFeed(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.ppxfxbqfkf());
                String strPpxfxbqfkf = zoijcleaowVar.ppxfxbqfkf();
                boolean z13 = !mj.kcexrzcfyt.zfvoamnweg(zoijcleaowVar.ppxfxbqfkf());
                String strPpxfxbqfkf2 = q11.dxjokdxxww.ppxfxbqfkf();
                List listIobyxmoadg = zoijcleaowVar.iobyxmoadg();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41417999);
                boolean zLmojexxdyd = ((57344 & i18) == i16) | draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed);
                Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.draadjrbmk() { // from class: gq0.yggfygwlhe
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return pmvmpeiblj.nufgyqmvbu(onProductClick, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
                }
                tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41420724);
                boolean zLmojexxdyd2 = ((3670016 & i18) == i17) | draadjrbmkVarBtonecajqb.lmojexxdyd(zoijcleaowVar);
                Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.rgvfuqvkyq() { // from class: gq0.jyumaefscl
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return pmvmpeiblj.dxjokdxxww(onHintClick, zoijcleaowVar, (ProductUiModel) obj, (HintUiModel) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar3 = (tg.rgvfuqvkyq) objYadqdtsiqt2;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41436298);
                boolean zLmojexxdyd3 = ((i18 & 7168) == i15) | draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed);
                Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.rgvfuqvkyq() { // from class: gq0.iwizpuwonk
                        @Override // tg.rgvfuqvkyq
                        public final Object invoke(Object obj, Object obj2) {
                            return pmvmpeiblj.btonecajqb(onProductChange, itemFeed, (ProductUiModel) obj, (ProductCardEvent) obj2);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
                }
                tg.rgvfuqvkyq rgvfuqvkyqVar4 = (tg.rgvfuqvkyq) objYadqdtsiqt3;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41440706);
                boolean z14 = (458752 & i18) == 131072;
                Object objYadqdtsiqt4 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (z14 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: gq0.cqumvgiudr
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return pmvmpeiblj.gtknphoqwx(onClickPurchaseLists, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt4);
                }
                tg.draadjrbmk draadjrbmkVar5 = (tg.draadjrbmk) objYadqdtsiqt4;
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                draadjrbmkVarBtonecajqb.sopmlzcsov(41442736);
                boolean zLmojexxdyd4 = draadjrbmkVarBtonecajqb.lmojexxdyd(itemFeed) | ((i18 & 896) == 256);
                Object objYadqdtsiqt5 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.draadjrbmk() { // from class: gq0.esjtqupxsv
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return pmvmpeiblj.draadjrbmk(onFavoriteClick, itemFeed, (ProductUiModel) obj);
                        }
                    };
                    draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVarBtonecajqb.stevsuqkhv();
                androidx.compose.runtime.draadjrbmk draadjrbmkVar6 = draadjrbmkVarBtonecajqb;
                bt0.vdvldrhtss.dxjokdxxww(strPpxfxbqfkf, z13, strPpxfxbqfkf2, false, null, 0L, 0L, false, 2, listIobyxmoadg, false, false, contentPadding, 0, null, draadjrbmkVar4, rgvfuqvkyqVar3, rgvfuqvkyqVar4, draadjrbmkVar5, (tg.draadjrbmk) objYadqdtsiqt5, draadjrbmkVar6, 113249280, ((i18 << 3) & 896) | 54, 24688);
                t31.wkgbmnqykc.zoijcleaow(w0.nufgyqmvbu.lqeggnwhkg(16), draadjrbmkVar6, 6);
                onFavoriteClick = rgvfuqvkyqVar;
                onProductChange = vdvldrhtssVar;
                onProductClick = rgvfuqvkyqVar2;
                onClickPurchaseLists = draadjrbmkVar;
                onHintClick = vdvldrhtssVar2;
                draadjrbmkVarBtonecajqb = draadjrbmkVar6;
                i16 = 16384;
                i18 = i18;
                i15 = i15;
                i17 = i17;
            }
            draadjrbmkVar3 = draadjrbmkVarBtonecajqb;
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVar3.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: gq0.lereixgezr
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return pmvmpeiblj.wflxmlrfwp(recommendations, contentPadding, rgvfuqvkyqVar, vdvldrhtssVar, rgvfuqvkyqVar2, draadjrbmkVar, vdvldrhtssVar2, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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
    public static final gg.wwaezpbzkn wflxmlrfwp(List list, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, tg.rgvfuqvkyq rgvfuqvkyqVar, tg.vdvldrhtss vdvldrhtssVar, tg.rgvfuqvkyq rgvfuqvkyqVar2, tg.draadjrbmk draadjrbmkVar, tg.vdvldrhtss vdvldrhtssVar2, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar2, int i14) {
        lqeggnwhkg(list, ydmasvzmpaVar, rgvfuqvkyqVar, vdvldrhtssVar, rgvfuqvkyqVar2, draadjrbmkVar, vdvldrhtssVar2, draadjrbmkVar2, f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
