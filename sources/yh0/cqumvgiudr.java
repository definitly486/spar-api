package yh0;

import gg.wwaezpbzkn;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cqumvgiudr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cdpycssgdh(tg.draadjrbmk draadjrbmkVar, ProductUiModel product, uu.zoijcleaow recommendations) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.jyumaefscl(recommendations, product));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cllcsxoeiz(tg.draadjrbmk draadjrbmkVar, nb0.gxszxtbevo feature, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(feature, "feature");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.draadjrbmk(feature, i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn cqumvgiudr(tg.draadjrbmk draadjrbmkVar, String orderId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(orderId, "orderId");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.dxjokdxxww(orderId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dsvhmnatus(tg.draadjrbmk draadjrbmkVar, nb0.eablkybsjg banner, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ppxfxbqfkf(banner, i13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn esjtqupxsv(tg.draadjrbmk draadjrbmkVar, wh0.eablkybsjg story) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(story, "story");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zynmafqrjb(story));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hcddaimhww(tg.draadjrbmk draadjrbmkVar, iobyxmoadg.wkgbmnqykc.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.btonecajqb(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn hkdspvbjdz(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lereixgezr.f90801iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iozdgvuglv(tg.draadjrbmk draadjrbmkVar, nb0.eablkybsjg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.esjtqupxsv(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn istkbnxepw(tg.draadjrbmk draadjrbmkVar, wh0.wkgbmnqykc specialProduct) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialProduct, "specialProduct");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.pmvmpeiblj(specialProduct));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final esjtqupxsv iwizpuwonk(tg.iobyxmoadg coroutineScope, final tg.draadjrbmk onEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(onEvent, "onEvent");
        return new esjtqupxsv(coroutineScope, new tg.draadjrbmk() { // from class: yh0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.cqumvgiudr(onEvent, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: yh0.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.esjtqupxsv(onEvent, (wh0.eablkybsjg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: yh0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return cqumvgiudr.pkzmftpjix(onEvent);
            }
        }, new tg.iobyxmoadg() { // from class: yh0.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return cqumvgiudr.hkdspvbjdz(onEvent);
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.cllcsxoeiz(onEvent, (nb0.gxszxtbevo) obj, ((Integer) obj2).intValue());
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.dsvhmnatus(onEvent, (nb0.eablkybsjg) obj, ((Integer) obj2).intValue());
            }
        }, new tg.draadjrbmk() { // from class: yh0.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.wypolnanlu(onEvent, (mb0.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: yh0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return cqumvgiudr.stevsuqkhv(onEvent);
            }
        }, new tg.iobyxmoadg() { // from class: yh0.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return cqumvgiudr.kegysxyocb(onEvent);
            }
        }, new tg.draadjrbmk() { // from class: yh0.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.tzroggbefp(onEvent, (iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow) obj);
            }
        }, new tg.vdvldrhtss() { // from class: yh0.wflxmlrfwp
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return cqumvgiudr.lereixgezr(onEvent, (ProductUiModel) obj, (ProductCardEvent) obj2, (AnalyticsLocation) obj3);
            }
        }, new tg.vdvldrhtss() { // from class: yh0.rgvfuqvkyq
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return cqumvgiudr.pmvmpeiblj(onEvent, (HintUiModel) obj, (AnalyticElement.ProductItemElement) obj2, (AnalyticsLocation) obj3);
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.vdvldrhtss
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.zynmafqrjb(onEvent, (ProductUiModel) obj, (wh0.wkgbmnqykc) obj2);
            }
        }, new tg.draadjrbmk() { // from class: yh0.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.istkbnxepw(onEvent, (wh0.wkgbmnqykc) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.kcexrzcfyt
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.cdpycssgdh(onEvent, (ProductUiModel) obj, (uu.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: yh0.zdlpuopuiu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.yadqdtsiqt(onEvent, (uu.zoijcleaow) obj);
            }
        }, new tg.draadjrbmk() { // from class: yh0.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.iozdgvuglv(onEvent, (nb0.eablkybsjg) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.jyumaefscl
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.lmojexxdyd(onEvent, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: yh0.iwizpuwonk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.wwaezpbzkn(onEvent, (qu.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: yh0.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.ylkuphrtab(onEvent, (qu.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: yh0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return cqumvgiudr.hcddaimhww(onEvent, (iobyxmoadg.wkgbmnqykc.zoijcleaow) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: yh0.gxszxtbevo
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return cqumvgiudr.jpowsppfya(onEvent, (f40.zoijcleaow) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jpowsppfya(tg.draadjrbmk draadjrbmkVar, f40.zoijcleaow navLink, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.ojitshcjhn(navLink, str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kegysxyocb(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.myspar.impl.presentation.oxmwwwfdhm.agtfadlqog.f90777iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lereixgezr(tg.draadjrbmk draadjrbmkVar, ProductUiModel specialProduct, ProductCardEvent productCardEvent, AnalyticsLocation analyticLocation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialProduct, "specialProduct");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticLocation, "analyticLocation");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.C2107oxmwwwfdhm(specialProduct, productCardEvent, analyticLocation));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn lmojexxdyd(tg.draadjrbmk draadjrbmkVar, ComboSetProduct product, mo.zoijcleaow analyticsData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.gxszxtbevo(product, analyticsData));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pkzmftpjix(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.myspar.impl.presentation.oxmwwwfdhm.yggfygwlhe.f90821iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn pmvmpeiblj(tg.draadjrbmk draadjrbmkVar, HintUiModel hint, AnalyticElement.ProductItemElement element, AnalyticsLocation analyticsLocation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wflxmlrfwp(hint, element, analyticsLocation));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn stevsuqkhv(tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(ru.myspar.myspar.impl.presentation.oxmwwwfdhm.cqumvgiudr.f90781iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(tg.draadjrbmk draadjrbmkVar, iobyxmoadg.gxszxtbevo.eablkybsjg.zoijcleaow promotionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(promotionId, "promotionId");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.zdlpuopuiu(promotionId));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wwaezpbzkn(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.nufgyqmvbu(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wypolnanlu(tg.draadjrbmk draadjrbmkVar, mb0.iobyxmoadg brand) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(brand, "brand");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.wkgbmnqykc(brand));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yadqdtsiqt(tg.draadjrbmk draadjrbmkVar, uu.zoijcleaow recommendations) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(recommendations, "recommendations");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.iwizpuwonk(recommendations));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ylkuphrtab(tg.draadjrbmk draadjrbmkVar, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.lqeggnwhkg(it.dxjokdxxww().iobyxmoadg(), it.dxjokdxxww().zoijcleaow()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zynmafqrjb(tg.draadjrbmk draadjrbmkVar, ProductUiModel product, wh0.wkgbmnqykc section) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(section, "section");
        draadjrbmkVar.invoke(new ru.myspar.myspar.impl.presentation.oxmwwwfdhm.kcexrzcfyt(product, section));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
