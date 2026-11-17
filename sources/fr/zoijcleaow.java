package fr;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.ntlheqmsrt;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.impl.product_list.domain.State;
import ru.myspar.catalog.impl.product_list.domain.model.ProductListFeatureToggles;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.catalog.CatalogBanner;
import ru.myspar.core.domain.models.catalog.CatalogSection;
import ru.myspar.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.domain.feature.filters.store.FiltersArgs;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.story.domain.model.StoryItem;
import ru.myspar.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends e8.iobyxmoadg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final h20.nufgyqmvbu f34721agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final u10.iobyxmoadg f34722btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final h20.draadjrbmk f34723cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private List f34724cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final k00.iobyxmoadg f34725cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final h20.gxszxtbevo f34726draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final gg.gtknphoqwx f34727dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ye0.iobyxmoadg f34728dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final l00.gtknphoqwx f34729eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final f20.ppxfxbqfkf f34730esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final j00.zoijcleaow f34731gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lo.zoijcleaow f34732gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f34733hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private String f34734hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private tg.iobyxmoadg f34735iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final z10.iobyxmoadg f34736istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final o20.iobyxmoadg f34737iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private String f34738jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final t20.zoijcleaow f34739jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final sm.iobyxmoadg f34740kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final a20.iobyxmoadg f34741lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private auzgnhcxok f34742lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final f20.btonecajqb f34743lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final na0.iobyxmoadg f34744nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final h20.btonecajqb f34745ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final j20.iobyxmoadg f34746oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f34747pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final a20.zoijcleaow f34748pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f34749ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final h20.agtfadlqog f34750rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final z10.gxszxtbevo f34751vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final h20.wflxmlrfwp f34752wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f34753wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private auzgnhcxok f34754wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private y00.iobyxmoadg f34755yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final yy1.iobyxmoadg f34756yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private auzgnhcxok f34757ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final b82.iobyxmoadg f34758zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final z10.nufgyqmvbu f34759zynmafqrjb;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private static final iobyxmoadg f34720wypolnanlu = new iobyxmoadg(null);

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    public static final int f34719stevsuqkhv = 8;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34761zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34761zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f34740kcexrzcfyt;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f34761zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.crxdokpmqz(new fr.gxszxtbevo.btonecajqb(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f34762iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ y00.iobyxmoadg f34763jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f34764yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34765zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, y00.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34764yggfygwlhe = str;
            this.f34763jyumaefscl = iobyxmoadgVar;
            this.f34762iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f34764yggfygwlhe, this.f34763jyumaefscl, this.f34762iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34765zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    h20.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = new h20.nufgyqmvbu.iobyxmoadg(this.f34764yggfygwlhe, this.f34763jyumaefscl.wkgbmnqykc());
                    zoijcleaow zoijcleaowVar = this.f34762iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    h20.nufgyqmvbu nufgyqmvbuVar = zoijcleaowVar.f34721agtfadlqog;
                    this.f34765zdlpuopuiu = 1;
                    obj = nufgyqmvbuVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((CatalogWithSubCatalogs) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = this.f34762iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.ulzqkzuiru(new fr.lqeggnwhkg.vdvldrhtss((CatalogWithSubCatalogs) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.M(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cdpycssgdh extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34767yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34768zdlpuopuiu;

        cdpycssgdh(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            cdpycssgdh cdpycssgdhVar = zoijcleaow.this.new cdpycssgdh(gxszxtbevoVar);
            cdpycssgdhVar.f34767yggfygwlhe = obj;
            return cdpycssgdhVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34768zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f34767yggfygwlhe;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zoijcleaowVar.O((gr.zoijcleaow) it.next());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cdpycssgdh) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34770yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34771zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = zoijcleaow.this.new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f34770yggfygwlhe = obj;
            return cqumvgiudrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34771zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f34770yggfygwlhe;
            zoijcleaow.this.ulzqkzuiru(new fr.lqeggnwhkg.gxszxtbevo(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34773zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34773zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(fr.lqeggnwhkg.ojitshcjhn.f34704iobyxmoadg);
                    h20.draadjrbmk.iobyxmoadg iobyxmoadgVar = new h20.draadjrbmk.iobyxmoadg(zoijcleaow.this.f34738jpowsppfya);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    h20.draadjrbmk draadjrbmkVar = zoijcleaowVar.f34723cdpycssgdh;
                    this.f34773zdlpuopuiu = 1;
                    obj = draadjrbmkVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.ulzqkzuiru(new fr.lqeggnwhkg.dxjokdxxww((ProductRecommendationsBlock) hg.jyumaefscl.weqkydbzbr((List) objWkgbmnqykc)));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.ulzqkzuiru(new fr.lqeggnwhkg.dxjokdxxww(null));
                zoijcleaowVar2.crxdokpmqz(new fr.gxszxtbevo.oxmwwwfdhm(thDxjokdxxww));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f34774jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ fr.eablkybsjg f34775yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34776zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(fr.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34775yggfygwlhe = eablkybsjgVar;
            this.f34774jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f34775yggfygwlhe, this.f34774jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f34776zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    fr.eablkybsjg eablkybsjgVar = this.f34775yggfygwlhe;
                    if (!(eablkybsjgVar instanceof fr.eablkybsjg.iobyxmoadg)) {
                        if (!(eablkybsjgVar instanceof fr.eablkybsjg.ppxfxbqfkf)) {
                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.wkgbmnqykc.f34645iobyxmoadg)) {
                                if (eablkybsjgVar instanceof fr.eablkybsjg.C0767eablkybsjg) {
                                    zoijcleaow zoijcleaowVar = this.f34774jyumaefscl;
                                    String strIobyxmoadg = ((fr.eablkybsjg.C0767eablkybsjg) this.f34775yggfygwlhe).iobyxmoadg();
                                    this.f34776zdlpuopuiu = 2;
                                    if (zoijcleaowVar.B(strIobyxmoadg, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.gxszxtbevo.f34620iobyxmoadg)) {
                                    zoijcleaow zoijcleaowVar2 = this.f34774jyumaefscl;
                                    this.f34776zdlpuopuiu = 3;
                                    if (zoijcleaowVar2.h(this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.lqeggnwhkg) {
                                    this.f34774jyumaefscl.A(((fr.eablkybsjg.lqeggnwhkg) this.f34775yggfygwlhe).zoijcleaow(), ((fr.eablkybsjg.lqeggnwhkg) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.nufgyqmvbu) {
                                    zoijcleaow zoijcleaowVar3 = this.f34774jyumaefscl;
                                    ComboSetProduct comboSetProductIobyxmoadg = ((fr.eablkybsjg.nufgyqmvbu) this.f34775yggfygwlhe).iobyxmoadg();
                                    ComboSetProduct comboSetProductZoijcleaow = ((fr.eablkybsjg.nufgyqmvbu) this.f34775yggfygwlhe).zoijcleaow();
                                    this.f34776zdlpuopuiu = 5;
                                    if (zoijcleaowVar3.D(comboSetProductIobyxmoadg, comboSetProductZoijcleaow, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.dxjokdxxww) {
                                    this.f34774jyumaefscl.Y(((fr.eablkybsjg.dxjokdxxww) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.btonecajqb) {
                                    zoijcleaow zoijcleaowVar4 = this.f34774jyumaefscl;
                                    String strIobyxmoadg2 = ((fr.eablkybsjg.btonecajqb) this.f34775yggfygwlhe).iobyxmoadg();
                                    String str = this.f34774jyumaefscl.f34738jpowsppfya;
                                    if (str == null) {
                                        str = "";
                                    }
                                    this.f34776zdlpuopuiu = 6;
                                    if (zoijcleaowVar4.C(strIobyxmoadg2, str, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.gtknphoqwx.f34619iobyxmoadg)) {
                                    this.f34774jyumaefscl.E();
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.wflxmlrfwp) {
                                    this.f34774jyumaefscl.F(((fr.eablkybsjg.wflxmlrfwp) this.f34775yggfygwlhe).ppxfxbqfkf(), ((fr.eablkybsjg.wflxmlrfwp) this.f34775yggfygwlhe).iobyxmoadg(), ((fr.eablkybsjg.wflxmlrfwp) this.f34775yggfygwlhe).zoijcleaow());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.agtfadlqog) {
                                    this.f34774jyumaefscl.hkdspvbjdz(((fr.eablkybsjg.agtfadlqog) this.f34775yggfygwlhe).iobyxmoadg(), zoijcleaow.c(this.f34774jyumaefscl).getPayload().wflxmlrfwp());
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.ojitshcjhn.f34632iobyxmoadg)) {
                                    this.f34774jyumaefscl.crxdokpmqz(fr.gxszxtbevo.ppxfxbqfkf.f34679iobyxmoadg);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.rgvfuqvkyq.f34638iobyxmoadg)) {
                                    this.f34774jyumaefscl.G();
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.vdvldrhtss) {
                                    zoijcleaow zoijcleaowVar5 = this.f34774jyumaefscl;
                                    String strZoijcleaow = ((fr.eablkybsjg.vdvldrhtss) this.f34775yggfygwlhe).zoijcleaow();
                                    ProductCardEvent productCardEventPpxfxbqfkf = ((fr.eablkybsjg.vdvldrhtss) this.f34775yggfygwlhe).ppxfxbqfkf();
                                    AnalyticsLocation analyticsLocationIobyxmoadg = ((fr.eablkybsjg.vdvldrhtss) this.f34775yggfygwlhe).iobyxmoadg();
                                    this.f34776zdlpuopuiu = 7;
                                    if (zoijcleaowVar5.H(strZoijcleaow, productCardEventPpxfxbqfkf, analyticsLocationIobyxmoadg, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.oxmwwwfdhm) {
                                    this.f34774jyumaefscl.z(((fr.eablkybsjg.oxmwwwfdhm) this.f34775yggfygwlhe).wkgbmnqykc(), ((fr.eablkybsjg.oxmwwwfdhm) this.f34775yggfygwlhe).ppxfxbqfkf(), ((fr.eablkybsjg.oxmwwwfdhm) this.f34775yggfygwlhe).zoijcleaow(), ((fr.eablkybsjg.oxmwwwfdhm) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.kcexrzcfyt.f34625iobyxmoadg)) {
                                    zoijcleaow.S(this.f34774jyumaefscl, false, 1, null);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.zdlpuopuiu.f34647iobyxmoadg)) {
                                    this.f34774jyumaefscl.y();
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.yggfygwlhe.f34646iobyxmoadg)) {
                                    zoijcleaow.k0(this.f34774jyumaefscl, AnalyticsPage.Scan.f84344iwizpuwonk, null, null, 6, null);
                                    this.f34774jyumaefscl.crxdokpmqz(fr.gxszxtbevo.nufgyqmvbu.f34675iobyxmoadg);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.jyumaefscl.f34624iobyxmoadg)) {
                                    this.f34774jyumaefscl.I();
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, fr.eablkybsjg.iwizpuwonk.f34623iobyxmoadg)) {
                                    this.f34774jyumaefscl.U();
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.cqumvgiudr) {
                                    this.f34774jyumaefscl.J(((fr.eablkybsjg.cqumvgiudr) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.lereixgezr) {
                                    this.f34774jyumaefscl.K(((fr.eablkybsjg.lereixgezr) this.f34775yggfygwlhe).zoijcleaow(), ((fr.eablkybsjg.lereixgezr) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.draadjrbmk) {
                                    this.f34774jyumaefscl.W(((fr.eablkybsjg.draadjrbmk) this.f34775yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof fr.eablkybsjg.esjtqupxsv) {
                                    this.f34774jyumaefscl.X(((fr.eablkybsjg.esjtqupxsv) this.f34775yggfygwlhe).iobyxmoadg());
                                } else {
                                    if (!(eablkybsjgVar instanceof fr.eablkybsjg.zoijcleaow)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f34774jyumaefscl.L(((fr.eablkybsjg.zoijcleaow) this.f34775yggfygwlhe).ppxfxbqfkf(), ((fr.eablkybsjg.zoijcleaow) this.f34775yggfygwlhe).zoijcleaow(), ((fr.eablkybsjg.zoijcleaow) this.f34775yggfygwlhe).iobyxmoadg());
                                }
                                break;
                            } else {
                                this.f34774jyumaefscl.crxdokpmqz(new fr.gxszxtbevo.iobyxmoadg(zoijcleaow.c(this.f34774jyumaefscl).getPayload().getWasOpenedViaNavLink()));
                                break;
                            }
                        } else {
                            this.f34774jyumaefscl.ylkuphrtab(((fr.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                            break;
                        }
                    } else {
                        zoijcleaow zoijcleaowVar6 = this.f34774jyumaefscl;
                        String strIobyxmoadg3 = ((fr.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg();
                        double dZoijcleaow = ((fr.eablkybsjg.iobyxmoadg) this.f34775yggfygwlhe).zoijcleaow();
                        this.f34776zdlpuopuiu = 1;
                        if (zoijcleaowVar6.g(strIobyxmoadg3, dZoijcleaow, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f34778esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f34779iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f34780jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34781yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34782zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34779iwizpuwonk = obj;
            this.f34778esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.g(null, 0.0d, this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34783yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34784zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34784zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f34783yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            esjtqupxsv esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            esjtqupxsvVar.f34783yggfygwlhe = th2;
            return esjtqupxsvVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        int f34785cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f34786cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f34787esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        boolean f34789istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f34790iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f34791jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f34792lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        final /* synthetic */ int f34793lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        final /* synthetic */ boolean f34794pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f34795pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        final /* synthetic */ boolean f34796wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private /* synthetic */ Object f34797yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34798yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        final /* synthetic */ boolean f34799ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34800zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f34801zynmafqrjb;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f34802cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ y00.iobyxmoadg f34803iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f34804jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ int f34805yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f34806zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(int i13, String str, y00.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f34805yggfygwlhe = i13;
                this.f34804jyumaefscl = str;
                this.f34803iwizpuwonk = iobyxmoadgVar;
                this.f34802cqumvgiudr = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f34805yggfygwlhe, this.f34804jyumaefscl, this.f34803iwizpuwonk, this.f34802cqumvgiudr, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objWkgbmnqykc;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f34806zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        if (this.f34805yggfygwlhe != 1 || this.f34804jyumaefscl == null) {
                            return null;
                        }
                        h20.gxszxtbevo.iobyxmoadg iobyxmoadgVar = new h20.gxszxtbevo.iobyxmoadg(this.f34803iwizpuwonk.wkgbmnqykc(), this.f34804jyumaefscl);
                        zoijcleaow zoijcleaowVar = this.f34802cqumvgiudr;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        h20.gxszxtbevo gxszxtbevoVar = zoijcleaowVar.f34726draadjrbmk;
                        this.f34806zdlpuopuiu = 1;
                        obj = gxszxtbevoVar.zoijcleaow(iobyxmoadgVar, this);
                        if (obj == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
                } catch (Throwable th2) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
                return (List) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(int i13, boolean z13, boolean z14, boolean z15, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34793lmojexxdyd = i13;
            this.f34796wwaezpbzkn = z13;
            this.f34799ylkuphrtab = z14;
            this.f34794pkzmftpjix = z15;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            gtknphoqwx gtknphoqwxVar = zoijcleaow.this.new gtknphoqwx(this.f34793lmojexxdyd, this.f34796wwaezpbzkn, this.f34799ylkuphrtab, this.f34794pkzmftpjix, gxszxtbevoVar);
            gtknphoqwxVar.f34797yadqdtsiqt = obj;
            return gtknphoqwxVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x018f  */
        /* JADX WARN: Code duplicated, block: B:39:0x01b3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:43:0x01dc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:47:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:49:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:50:0x01f1  */
        /* JADX WARN: Code duplicated, block: B:53:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:57:0x020a  */
        /* JADX WARN: Code duplicated, block: B:61:0x0216  */
        /* JADX WARN: Code duplicated, block: B:68:0x0240  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cllcsxoeiz cllcsxoeizVar;
            int i13;
            String str;
            Object objZoijcleaow;
            String str2;
            String str3;
            h20.wflxmlrfwp.iobyxmoadg iobyxmoadgVar;
            ntlheqmsrt ntlheqmsrtVarZoijcleaow;
            zoijcleaow zoijcleaowVar;
            int i14;
            Object objZoijcleaow2;
            Object objWkgbmnqykc;
            zoijcleaow zoijcleaowVar2;
            int i15;
            boolean z13;
            boolean z14;
            boolean z15;
            ProductListData productListData;
            Object objU;
            Object obj2;
            zoijcleaow zoijcleaowVar3;
            boolean z16;
            zoijcleaow zoijcleaowVar4;
            int i16;
            int i17;
            boolean z17;
            ProductListData productListData2;
            DeliveryCode deliveryCode;
            Object objLqeggnwhkg;
            boolean z18;
            zoijcleaow zoijcleaowVar5;
            zoijcleaow zoijcleaowVar6;
            DeliveryCode deliveryCode2;
            int i18;
            Throwable thDxjokdxxww;
            List listWflxmlrfwp;
            boolean z19;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i19 = this.f34785cdpycssgdh;
            try {
                if (i19 != 0) {
                    if (i19 == 1) {
                        int i23 = this.f34787esjtqupxsv;
                        str = (String) this.f34791jyumaefscl;
                        String str4 = (String) this.f34798yggfygwlhe;
                        String str5 = (String) this.f34800zdlpuopuiu;
                        cllcsxoeizVar = (cllcsxoeiz) this.f34797yadqdtsiqt;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow = obj;
                        str2 = str4;
                        str3 = str5;
                        i13 = i23;
                    } else {
                        if (i19 == 2) {
                            i14 = this.f34787esjtqupxsv;
                            ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f34797yadqdtsiqt;
                            try {
                                gg.zdlpuopuiu.zoijcleaow(obj);
                                objZoijcleaow2 = obj;
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
                            } catch (Throwable th2) {
                                th = th2;
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                            }
                            zoijcleaowVar2 = zoijcleaow.this;
                            i15 = this.f34793lmojexxdyd;
                            z13 = this.f34796wwaezpbzkn;
                            z14 = this.f34799ylkuphrtab;
                            z15 = this.f34794pkzmftpjix;
                            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                                productListData = (ProductListData) objWkgbmnqykc;
                                zoijcleaowVar2.f34747pkzmftpjix = i15;
                                this.f34797yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                                this.f34800zdlpuopuiu = objWkgbmnqykc;
                                this.f34798yggfygwlhe = zoijcleaowVar2;
                                this.f34791jyumaefscl = zoijcleaowVar2;
                                this.f34790iwizpuwonk = productListData;
                                this.f34786cqumvgiudr = productListData;
                                this.f34787esjtqupxsv = i14;
                                this.f34792lereixgezr = i15;
                                this.f34795pmvmpeiblj = z13;
                                this.f34801zynmafqrjb = z14;
                                this.f34789istkbnxepw = z15;
                                this.f34785cdpycssgdh = 3;
                                objU = zoijcleaowVar2.u(this);
                                if (objU == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                obj2 = objWkgbmnqykc;
                                zoijcleaowVar3 = zoijcleaowVar2;
                                z16 = z15;
                                zoijcleaowVar4 = zoijcleaowVar3;
                                i16 = i15;
                                i17 = i14;
                                z17 = z13;
                                productListData2 = productListData;
                                deliveryCode = (DeliveryCode) objU;
                                this.f34797yadqdtsiqt = obj2;
                                this.f34800zdlpuopuiu = zoijcleaowVar3;
                                this.f34798yggfygwlhe = zoijcleaowVar4;
                                this.f34791jyumaefscl = productListData2;
                                this.f34790iwizpuwonk = productListData;
                                this.f34786cqumvgiudr = deliveryCode;
                                this.f34787esjtqupxsv = i17;
                                this.f34792lereixgezr = i16;
                                this.f34795pmvmpeiblj = z17;
                                this.f34801zynmafqrjb = z14;
                                this.f34789istkbnxepw = z16;
                                this.f34785cdpycssgdh = 4;
                                objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                                if (objLqeggnwhkg == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                z18 = z14;
                                zoijcleaowVar5 = zoijcleaowVar4;
                                zoijcleaowVar6 = zoijcleaowVar3;
                                int i24 = i16;
                                deliveryCode2 = deliveryCode;
                                i18 = i24;
                            }
                            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                            if (thDxjokdxxww != null && !(thDxjokdxxww instanceof CancellationException) && zoijcleaow.c(zoijcleaowVar2).getProductListData() == null) {
                                zoijcleaowVar2.crxdokpmqz(new fr.gxszxtbevo.iobyxmoadg(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                            }
                            zoijcleaow.this.Z(false);
                            if (i14 != 0) {
                                zoijcleaow.this.b0(false);
                            }
                            zoijcleaow.this.f34732gxszxtbevo.zoijcleaow(new oo.lqeggnwhkg.iobyxmoadg(null, 1, null));
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (i19 == 3) {
                            z16 = this.f34789istkbnxepw;
                            boolean z23 = this.f34801zynmafqrjb;
                            z17 = this.f34795pmvmpeiblj;
                            i16 = this.f34792lereixgezr;
                            i17 = this.f34787esjtqupxsv;
                            ProductListData productListData3 = (ProductListData) this.f34786cqumvgiudr;
                            ProductListData productListData4 = (ProductListData) this.f34790iwizpuwonk;
                            zoijcleaowVar4 = (zoijcleaow) this.f34791jyumaefscl;
                            zoijcleaow zoijcleaowVar7 = (zoijcleaow) this.f34798yggfygwlhe;
                            Object obj3 = this.f34800zdlpuopuiu;
                            ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f34797yadqdtsiqt;
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            obj2 = obj3;
                            zoijcleaowVar3 = zoijcleaowVar7;
                            productListData = productListData3;
                            productListData2 = productListData4;
                            z14 = z23;
                            objU = obj;
                            deliveryCode = (DeliveryCode) objU;
                            this.f34797yadqdtsiqt = obj2;
                            this.f34800zdlpuopuiu = zoijcleaowVar3;
                            this.f34798yggfygwlhe = zoijcleaowVar4;
                            this.f34791jyumaefscl = productListData2;
                            this.f34790iwizpuwonk = productListData;
                            this.f34786cqumvgiudr = deliveryCode;
                            this.f34787esjtqupxsv = i17;
                            this.f34792lereixgezr = i16;
                            this.f34795pmvmpeiblj = z17;
                            this.f34801zynmafqrjb = z14;
                            this.f34789istkbnxepw = z16;
                            this.f34785cdpycssgdh = 4;
                            objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                            if (objLqeggnwhkg == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            z18 = z14;
                            zoijcleaowVar5 = zoijcleaowVar4;
                            zoijcleaowVar6 = zoijcleaowVar3;
                            int i25 = i16;
                            deliveryCode2 = deliveryCode;
                            i18 = i25;
                        } else {
                            if (i19 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z16 = this.f34789istkbnxepw;
                            z18 = this.f34801zynmafqrjb;
                            boolean z24 = this.f34795pmvmpeiblj;
                            i18 = this.f34792lereixgezr;
                            int i26 = this.f34787esjtqupxsv;
                            deliveryCode2 = (DeliveryCode) this.f34786cqumvgiudr;
                            ProductListData productListData5 = (ProductListData) this.f34790iwizpuwonk;
                            productListData2 = (ProductListData) this.f34791jyumaefscl;
                            zoijcleaowVar5 = (zoijcleaow) this.f34798yggfygwlhe;
                            zoijcleaowVar6 = (zoijcleaow) this.f34800zdlpuopuiu;
                            Object obj4 = this.f34797yadqdtsiqt;
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            obj2 = obj4;
                            productListData = productListData5;
                            i17 = i26;
                            z17 = z24;
                            objLqeggnwhkg = obj;
                        }
                    }
                    listWflxmlrfwp = (List) objLqeggnwhkg;
                    if (listWflxmlrfwp == null) {
                        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                    }
                    if (i18 == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zoijcleaowVar6.ulzqkzuiru(new fr.lqeggnwhkg.draadjrbmk(productListData, deliveryCode2, listWflxmlrfwp, z19));
                    if (z17) {
                        zoijcleaowVar6.m(productListData2.getAdditionalBlocksOption());
                    }
                    zoijcleaowVar6.c0(productListData2, i18);
                    if (z18 || z16) {
                        zoijcleaowVar6.T();
                    }
                    objWkgbmnqykc = obj2;
                    i14 = i17;
                    zoijcleaowVar2 = zoijcleaowVar5;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar2.crxdokpmqz(new fr.gxszxtbevo.iobyxmoadg(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                    }
                    zoijcleaow.this.Z(false);
                    if (i14 != 0) {
                        zoijcleaow.this.b0(false);
                    }
                    zoijcleaow.this.f34732gxszxtbevo.zoijcleaow(new oo.lqeggnwhkg.iobyxmoadg(null, 1, null));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeizVar = (cllcsxoeiz) this.f34797yadqdtsiqt;
                State stateC = zoijcleaow.c(zoijcleaow.this);
                boolean zIsEmpty = stateC.iwizpuwonk().isEmpty();
                i13 = !zIsEmpty ? 1 : 0;
                if (!zIsEmpty) {
                    zoijcleaow.this.b0(true);
                }
                String brandId = stateC.getPayload().getBrandId();
                String strLqeggnwhkg = stateC.getSelectedSort().lqeggnwhkg();
                str = zoijcleaow.this.f34738jpowsppfya;
                z10.iobyxmoadg iobyxmoadgVar3 = zoijcleaow.this.f34736istkbnxepw;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f34797yadqdtsiqt = cllcsxoeizVar;
                this.f34800zdlpuopuiu = brandId;
                this.f34798yggfygwlhe = strLqeggnwhkg;
                this.f34791jyumaefscl = str;
                this.f34787esjtqupxsv = i13;
                this.f34785cdpycssgdh = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str2 = strLqeggnwhkg;
                str3 = brandId;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                h20.wflxmlrfwp wflxmlrfwpVar = zoijcleaowVar.f34752wflxmlrfwp;
                this.f34797yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                this.f34800zdlpuopuiu = null;
                this.f34798yggfygwlhe = null;
                this.f34791jyumaefscl = null;
                this.f34787esjtqupxsv = i13;
                this.f34785cdpycssgdh = 2;
                objZoijcleaow2 = wflxmlrfwpVar.zoijcleaow(iobyxmoadgVar, this);
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i14 = i13;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
                zoijcleaowVar2 = zoijcleaow.this;
                i15 = this.f34793lmojexxdyd;
                z13 = this.f34796wwaezpbzkn;
                z14 = this.f34799ylkuphrtab;
                z15 = this.f34794pkzmftpjix;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    productListData = (ProductListData) objWkgbmnqykc;
                    zoijcleaowVar2.f34747pkzmftpjix = i15;
                    this.f34797yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                    this.f34800zdlpuopuiu = objWkgbmnqykc;
                    this.f34798yggfygwlhe = zoijcleaowVar2;
                    this.f34791jyumaefscl = zoijcleaowVar2;
                    this.f34790iwizpuwonk = productListData;
                    this.f34786cqumvgiudr = productListData;
                    this.f34787esjtqupxsv = i14;
                    this.f34792lereixgezr = i15;
                    this.f34795pmvmpeiblj = z13;
                    this.f34801zynmafqrjb = z14;
                    this.f34789istkbnxepw = z15;
                    this.f34785cdpycssgdh = 3;
                    objU = zoijcleaowVar2.u(this);
                    if (objU == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    obj2 = objWkgbmnqykc;
                    zoijcleaowVar3 = zoijcleaowVar2;
                    z16 = z15;
                    zoijcleaowVar4 = zoijcleaowVar3;
                    i16 = i15;
                    i17 = i14;
                    z17 = z13;
                    productListData2 = productListData;
                    deliveryCode = (DeliveryCode) objU;
                    this.f34797yadqdtsiqt = obj2;
                    this.f34800zdlpuopuiu = zoijcleaowVar3;
                    this.f34798yggfygwlhe = zoijcleaowVar4;
                    this.f34791jyumaefscl = productListData2;
                    this.f34790iwizpuwonk = productListData;
                    this.f34786cqumvgiudr = deliveryCode;
                    this.f34787esjtqupxsv = i17;
                    this.f34792lereixgezr = i16;
                    this.f34795pmvmpeiblj = z17;
                    this.f34801zynmafqrjb = z14;
                    this.f34789istkbnxepw = z16;
                    this.f34785cdpycssgdh = 4;
                    objLqeggnwhkg = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
                    if (objLqeggnwhkg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    z18 = z14;
                    zoijcleaowVar5 = zoijcleaowVar4;
                    zoijcleaowVar6 = zoijcleaowVar3;
                    int i27 = i16;
                    deliveryCode2 = deliveryCode;
                    i18 = i27;
                    listWflxmlrfwp = (List) objLqeggnwhkg;
                    if (listWflxmlrfwp == null) {
                        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                    }
                    if (i18 == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zoijcleaowVar6.ulzqkzuiru(new fr.lqeggnwhkg.draadjrbmk(productListData, deliveryCode2, listWflxmlrfwp, z19));
                    if (z17) {
                        zoijcleaowVar6.m(productListData2.getAdditionalBlocksOption());
                    }
                    zoijcleaowVar6.c0(productListData2, i18);
                    if (z18) {
                        zoijcleaowVar6.T();
                    } else {
                        zoijcleaowVar6.T();
                    }
                    objWkgbmnqykc = obj2;
                    i14 = i17;
                    zoijcleaowVar2 = zoijcleaowVar5;
                }
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    zoijcleaowVar2.crxdokpmqz(new fr.gxszxtbevo.iobyxmoadg(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                }
                zoijcleaow.this.Z(false);
                if (i14 != 0) {
                    zoijcleaow.this.b0(false);
                }
                zoijcleaow.this.f34732gxszxtbevo.zoijcleaow(new oo.lqeggnwhkg.iobyxmoadg(null, 1, null));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                th = th3;
                i14 = i13;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
            y00.iobyxmoadg iobyxmoadgVar6 = (y00.iobyxmoadg) objZoijcleaow;
            iobyxmoadgVar = new h20.wflxmlrfwp.iobyxmoadg(iobyxmoadgVar6.wkgbmnqykc(), iobyxmoadgVar6.ppxfxbqfkf(), str, str3, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(this.f34793lmojexxdyd), str2, zoijcleaow.this.f34724cllcsxoeiz, zoijcleaow.this.f34734hkdspvbjdz, null, null, 1536, null);
            zoijcleaow.this.i0(this.f34793lmojexxdyd, iobyxmoadgVar6);
            ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(this.f34793lmojexxdyd, str, iobyxmoadgVar6, zoijcleaow.this, null), 3, null);
            zoijcleaowVar = zoijcleaow.this;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f34807cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f34809jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f34810yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34811zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34809jyumaefscl = obj;
            this.f34807cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.h(this);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class istkbnxepw implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f34812zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f34813zdlpuopuiu;

            /* JADX INFO: renamed from: fr.zoijcleaow$istkbnxepw$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0771iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f34815yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f34816zdlpuopuiu;

                public C0771iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f34816zdlpuopuiu = obj;
                    this.f34815yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f34813zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0771iobyxmoadg c0771iobyxmoadg;
                if (gxszxtbevoVar instanceof C0771iobyxmoadg) {
                    c0771iobyxmoadg = (C0771iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0771iobyxmoadg.f34815yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0771iobyxmoadg.f34815yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0771iobyxmoadg = new C0771iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0771iobyxmoadg = new C0771iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0771iobyxmoadg.f34816zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0771iobyxmoadg.f34815yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f34813zdlpuopuiu;
                    gr.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new gr.zoijcleaow.ppxfxbqfkf((Double) obj);
                    c0771iobyxmoadg.f34815yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c0771iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public istkbnxepw(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f34812zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f34812zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34817yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34818zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34818zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f34817yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f34817yggfygwlhe = th2;
            return iwizpuwonkVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34820yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34821zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = zoijcleaow.this.new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f34820yggfygwlhe = obj;
            return jyumaefsclVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34821zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            u10.iobyxmoadg.C2774iobyxmoadg c2774iobyxmoadg = (u10.iobyxmoadg.C2774iobyxmoadg) this.f34820yggfygwlhe;
            zoijcleaow.this.f34724cllcsxoeiz = c2774iobyxmoadg.iobyxmoadg();
            zoijcleaow.this.Z(true);
            zoijcleaow.r(zoijcleaow.this, 1, false, false, false, 14, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u10.iobyxmoadg.C2774iobyxmoadg c2774iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(c2774iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f34822jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34824zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        kcexrzcfyt(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34822jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new kcexrzcfyt(this.f34822jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            CatalogSection rootCatalogSection;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34824zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                State stateC = zoijcleaow.c(zoijcleaow.this);
                CatalogWithSubCatalogs catalogSection = stateC.getCatalogSection();
                String name = (catalogSection == null || (rootCatalogSection = catalogSection.getRootCatalogSection()) == null) ? null : rootCatalogSection.getName();
                String productsTitle = stateC.getPayload().getProductsTitle();
                if (productsTitle != null) {
                    name = productsTitle;
                } else if (name == null) {
                    name = "";
                }
                ye0.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f34728dxjokdxxww;
                ze0.iobyxmoadg.wkgbmnqykc wkgbmnqykcVar = new ze0.iobyxmoadg.wkgbmnqykc(this.f34822jyumaefscl);
                AnalyticsPage.ProductList productList = new AnalyticsPage.ProductList(name, this.f34822jyumaefscl);
                this.f34824zdlpuopuiu = 1;
                if (iobyxmoadgVar.lqeggnwhkg(wkgbmnqykcVar, productList, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class lereixgezr implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f34825yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f34826zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ boolean f34827yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f34828zdlpuopuiu;

            /* JADX INFO: renamed from: fr.zoijcleaow$lereixgezr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0772iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f34830yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f34831zdlpuopuiu;

                public C0772iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f34831zdlpuopuiu = obj;
                    this.f34830yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, boolean z13) {
                this.f34828zdlpuopuiu = nufgyqmvbuVar;
                this.f34827yggfygwlhe = z13;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0772iobyxmoadg c0772iobyxmoadg;
                if (gxszxtbevoVar instanceof C0772iobyxmoadg) {
                    c0772iobyxmoadg = (C0772iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0772iobyxmoadg.f34830yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0772iobyxmoadg.f34830yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0772iobyxmoadg = new C0772iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0772iobyxmoadg = new C0772iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0772iobyxmoadg.f34831zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0772iobyxmoadg.f34830yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f34828zdlpuopuiu;
                    if (this.f34827yggfygwlhe) {
                        c0772iobyxmoadg.f34830yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0772iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public lereixgezr(sj.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
            this.f34826zdlpuopuiu = lqeggnwhkgVar;
            this.f34825yggfygwlhe = z13;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f34826zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f34825yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f34832cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f34834iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f34835jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f34836yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34837zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f34838yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f34839zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f34838yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f34838yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f34839zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    na0.iobyxmoadg iobyxmoadgVar = this.f34838yggfygwlhe.f34744nufgyqmvbu;
                    this.f34839zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.vdvldrhtss(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f34840yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f34841zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f34840yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f34840yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f34841zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    na0.iobyxmoadg iobyxmoadgVar = this.f34840yggfygwlhe.f34744nufgyqmvbu;
                    this.f34841zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.rgvfuqvkyq(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: fr.zoijcleaow$lqeggnwhkg$zoijcleaow, reason: collision with other inner class name */
        static final class C0773zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f34842yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f34843zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0773zoijcleaow(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f34842yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C0773zoijcleaow(this.f34842yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f34843zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    na0.iobyxmoadg iobyxmoadgVar = this.f34842yggfygwlhe.f34744nufgyqmvbu;
                    this.f34843zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.btonecajqb(this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return obj;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C0773zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lqeggnwhkg lqeggnwhkgVar = zoijcleaow.this.new lqeggnwhkg(gxszxtbevoVar);
            lqeggnwhkgVar.f34832cqumvgiudr = obj;
            return lqeggnwhkgVar;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ntlheqmsrt ntlheqmsrtVar;
            ntlheqmsrt ntlheqmsrtVar2;
            boolean z13;
            ntlheqmsrt ntlheqmsrtVar3;
            boolean zBooleanValue;
            Object objLqeggnwhkg;
            boolean z14;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34834iwizpuwonk;
            if (i13 != 0) {
                if (i13 == 1) {
                    ntlheqmsrtVar2 = (ntlheqmsrt) this.f34837zdlpuopuiu;
                    ntlheqmsrtVar = (ntlheqmsrt) this.f34832cqumvgiudr;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    z13 = this.f34836yggfygwlhe;
                    ntlheqmsrtVar3 = (ntlheqmsrt) this.f34832cqumvgiudr;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    this.f34832cqumvgiudr = null;
                    this.f34836yggfygwlhe = z13;
                    this.f34835jyumaefscl = zBooleanValue;
                    this.f34834iwizpuwonk = 3;
                    objLqeggnwhkg = ntlheqmsrtVar3.lqeggnwhkg(this);
                    if (objLqeggnwhkg == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    z14 = zBooleanValue;
                    obj = objLqeggnwhkg;
                } else {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z14 = this.f34835jyumaefscl;
                    z13 = this.f34836yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zoijcleaow.this.ulzqkzuiru(new fr.lqeggnwhkg.ppxfxbqfkf(new ProductListFeatureToggles(z13, z14, ((Boolean) obj).booleanValue())));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f34832cqumvgiudr;
            ntlheqmsrt ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(zoijcleaow.this, null), 3, null);
            ntlheqmsrt ntlheqmsrtVarZoijcleaow2 = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new ppxfxbqfkf(zoijcleaow.this, null), 3, null);
            ntlheqmsrt ntlheqmsrtVarZoijcleaow3 = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C0773zoijcleaow(zoijcleaow.this, null), 3, null);
            this.f34832cqumvgiudr = ntlheqmsrtVarZoijcleaow2;
            this.f34837zdlpuopuiu = ntlheqmsrtVarZoijcleaow3;
            this.f34834iwizpuwonk = 1;
            Object objLqeggnwhkg2 = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
            if (objLqeggnwhkg2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ntlheqmsrtVar = ntlheqmsrtVarZoijcleaow2;
            ntlheqmsrtVar2 = ntlheqmsrtVarZoijcleaow3;
            obj = objLqeggnwhkg2;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            this.f34832cqumvgiudr = ntlheqmsrtVar2;
            this.f34837zdlpuopuiu = null;
            this.f34836yggfygwlhe = zBooleanValue2;
            this.f34834iwizpuwonk = 2;
            Object objLqeggnwhkg3 = ntlheqmsrtVar.lqeggnwhkg(this);
            if (objLqeggnwhkg3 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ntlheqmsrt ntlheqmsrtVar4 = ntlheqmsrtVar2;
            z13 = zBooleanValue2;
            obj = objLqeggnwhkg3;
            ntlheqmsrtVar3 = ntlheqmsrtVar4;
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.f34832cqumvgiudr = null;
            this.f34836yggfygwlhe = z13;
            this.f34835jyumaefscl = zBooleanValue;
            this.f34834iwizpuwonk = 3;
            objLqeggnwhkg = ntlheqmsrtVar3.lqeggnwhkg(this);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z14 = zBooleanValue;
            obj = objLqeggnwhkg;
            zoijcleaow.this.ulzqkzuiru(new fr.lqeggnwhkg.ppxfxbqfkf(new ProductListFeatureToggles(z13, z14, ((Boolean) obj).booleanValue())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f34844cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f34846jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34847yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34848zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34846jyumaefscl = obj;
            this.f34844cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.j(null, this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f34849cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f34851jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f34852yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34853zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34851jyumaefscl = obj;
            this.f34849cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.B(null, this);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f34854jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34856zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34854jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new oxmwwwfdhm(this.f34854jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34856zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarV = zoijcleaow.this.v();
                ChangeProductParams changeProductParams = this.f34854jyumaefscl;
                this.f34856zdlpuopuiu = 1;
                if (btonecajqbVarV.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class pmvmpeiblj implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f34857zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f34858zdlpuopuiu;

            /* JADX INFO: renamed from: fr.zoijcleaow$pmvmpeiblj$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0774iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f34860yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f34861zdlpuopuiu;

                public C0774iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f34861zdlpuopuiu = obj;
                    this.f34860yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f34858zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0774iobyxmoadg c0774iobyxmoadg;
                if (gxszxtbevoVar instanceof C0774iobyxmoadg) {
                    c0774iobyxmoadg = (C0774iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0774iobyxmoadg.f34860yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0774iobyxmoadg.f34860yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0774iobyxmoadg = new C0774iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0774iobyxmoadg = new C0774iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0774iobyxmoadg.f34861zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0774iobyxmoadg.f34860yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f34858zdlpuopuiu;
                    gr.zoijcleaow.C0872zoijcleaow c0872zoijcleaow = new gr.zoijcleaow.C0872zoijcleaow((y00.iobyxmoadg) obj);
                    c0774iobyxmoadg.f34860yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c0872zoijcleaow, c0774iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public pmvmpeiblj(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f34857zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f34857zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f34862iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34864yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34865zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34864yggfygwlhe = obj;
            this.f34862iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.e(null, null, this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f34866jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34868zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f34866jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new rgvfuqvkyq(this.f34866jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34868zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                h20.btonecajqb btonecajqbVar = zoijcleaow.this.f34745ojitshcjhn;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f34868zdlpuopuiu = 1;
                obj = btonecajqbVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.ulzqkzuiru(new fr.lqeggnwhkg.eablkybsjg(((Boolean) obj).booleanValue()));
            if (zoijcleaow.c(zoijcleaow.this).getProductListData() != null) {
                zoijcleaow.this.Z(true);
            }
            zoijcleaow.r(zoijcleaow.this, 1, false, this.f34866jyumaefscl, true, 2, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34870zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34870zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f34870zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(100L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.crxdokpmqz(fr.gxszxtbevo.gtknphoqwx.f34663iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34872zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007f  */
        /* JADX WARN: Code duplicated, block: B:28:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            List listWflxmlrfwp;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f34872zdlpuopuiu;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
                    if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                        objWkgbmnqykc = null;
                    }
                    listWflxmlrfwp = (List) objWkgbmnqykc;
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    if (listWflxmlrfwp == null) {
                        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
                    }
                    zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.zoijcleaow(listWflxmlrfwp));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                zoijcleaow.this.ulzqkzuiru(fr.lqeggnwhkg.agtfadlqog.f34690iobyxmoadg);
                z10.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f34736istkbnxepw;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f34872zdlpuopuiu = 1;
                obj = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) obj;
                j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow zoijcleaowVar2 = new j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow(iobyxmoadgVar2.wkgbmnqykc(), w00.zoijcleaow.CATALOG_SCREEN, iobyxmoadgVar2.ppxfxbqfkf(), zoijcleaow.this.f34738jpowsppfya, null, 16, null);
                zoijcleaow zoijcleaowVar3 = zoijcleaow.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                j20.iobyxmoadg iobyxmoadgVar4 = zoijcleaowVar3.f34746oxmwwwfdhm;
                this.f34872zdlpuopuiu = 2;
                obj = iobyxmoadgVar4.zoijcleaow(zoijcleaowVar2, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            listWflxmlrfwp = (List) objWkgbmnqykc;
            zoijcleaow zoijcleaowVar4 = zoijcleaow.this;
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            zoijcleaowVar4.ulzqkzuiru(new fr.lqeggnwhkg.zoijcleaow(listWflxmlrfwp));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f34873iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34875yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f34876zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f34875yggfygwlhe = obj;
            this.f34873iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.f(null, null, this);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f34877yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f34878zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f34879yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f34880zdlpuopuiu;

            /* JADX INFO: renamed from: fr.zoijcleaow$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0775iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f34882yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f34883zdlpuopuiu;

                public C0775iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f34883zdlpuopuiu = obj;
                    this.f34882yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f34880zdlpuopuiu = nufgyqmvbuVar;
                this.f34879yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0775iobyxmoadg c0775iobyxmoadg;
                if (gxszxtbevoVar instanceof C0775iobyxmoadg) {
                    c0775iobyxmoadg = (C0775iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0775iobyxmoadg.f34882yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0775iobyxmoadg.f34882yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0775iobyxmoadg = new C0775iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0775iobyxmoadg = new C0775iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0775iobyxmoadg.f34883zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0775iobyxmoadg.f34882yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f34880zdlpuopuiu;
                    if (hg.jyumaefscl.rgvfuqvkyq(this.f34879yggfygwlhe.f34738jpowsppfya, zoijcleaow.c(this.f34879yggfygwlhe).getPayload().getBrandId()).contains(((u10.iobyxmoadg.C2774iobyxmoadg) obj).zoijcleaow())) {
                        c0775iobyxmoadg.f34882yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0775iobyxmoadg) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f34878zdlpuopuiu = lqeggnwhkgVar;
            this.f34877yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f34878zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f34877yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f34885yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f34886zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zdlpuopuiu zdlpuopuiuVar = zoijcleaow.this.new zdlpuopuiu(gxszxtbevoVar);
            zdlpuopuiuVar.f34885yggfygwlhe = obj;
            return zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f34886zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            l00.eablkybsjg eablkybsjgVar = (l00.eablkybsjg) this.f34885yggfygwlhe;
            if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                zoijcleaow.this.M(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                zoijcleaow.this.P(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: fr.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public /* synthetic */ class C0776zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f34887iobyxmoadg;

        static {
            int[] iArr = new int[k10.ppxfxbqfkf.values().length];
            try {
                iArr[k10.ppxfxbqfkf.COMBO_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k10.ppxfxbqfkf.FEED_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k10.ppxfxbqfkf.COMBO_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k10.ppxfxbqfkf.FEED_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f34887iobyxmoadg = iArr;
        }
    }

    public static final class zynmafqrjb implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f34888zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f34889zdlpuopuiu;

            /* JADX INFO: renamed from: fr.zoijcleaow$zynmafqrjb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0777iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f34891yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f34892zdlpuopuiu;

                public C0777iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f34892zdlpuopuiu = obj;
                    this.f34891yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f34889zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0777iobyxmoadg c0777iobyxmoadg;
                if (gxszxtbevoVar instanceof C0777iobyxmoadg) {
                    c0777iobyxmoadg = (C0777iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0777iobyxmoadg.f34891yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0777iobyxmoadg.f34891yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0777iobyxmoadg = new C0777iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0777iobyxmoadg = new C0777iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0777iobyxmoadg.f34892zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0777iobyxmoadg.f34891yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f34889zdlpuopuiu;
                    gr.zoijcleaow.iobyxmoadg iobyxmoadgVar = new gr.zoijcleaow.iobyxmoadg((List) obj);
                    c0777iobyxmoadg.f34891yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c0777iobyxmoadg) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public zynmafqrjb(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f34888zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f34888zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(c20.eablkybsjg isLoggedInUseCase, l00.gtknphoqwx productChangesSourceProvider, lo.zoijcleaow analyticsTracker, f20.btonecajqb subscribeToOrderDeliveryPriceUseCase, na0.iobyxmoadg featureManager, ye0.iobyxmoadg loymaxPopupsObserver, u10.iobyxmoadg changeCatalogFiltersObserver, j00.zoijcleaow changeFavoritesInteractor, h20.gxszxtbevo getCatalogBannersUseCase, h20.wflxmlrfwp getProductsUseCase, h20.nufgyqmvbu getCatalogWithChildUseCase, h20.btonecajqb getIsProductsGridUseCase, h20.agtfadlqog setIsProductsGridUseCase, z10.gxszxtbevo getOrderDeliveryType, j20.iobyxmoadg getComboSetUseCase, sm.iobyxmoadg getUserAddressFlowInfo, b82.iobyxmoadg getOnboardingStoryUseCase, yy1.iobyxmoadg purchasesListComponentApi, t20.zoijcleaow getIqosAgreementsStatusUseCase, o20.iobyxmoadg addComboSetEditOrderUseCase, k00.iobyxmoadg cartInteractor, f20.ppxfxbqfkf clearCartUseCase, a20.iobyxmoadg changeAdultCheckedUseCase, a20.zoijcleaow isAdultCheckedUseCase, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, z10.iobyxmoadg getCurrentDeliveryDataUseCase, h20.draadjrbmk getProductRecommendationsUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loymaxPopupsObserver, "loymaxPopupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogBannersUseCase, "getCatalogBannersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogWithChildUseCase, "getCatalogWithChildUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIsProductsGridUseCase, "getIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIsProductsGridUseCase, "setIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderDeliveryType, "getOrderDeliveryType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIqosAgreementsStatusUseCase, "getIqosAgreementsStatusUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addComboSetEditOrderUseCase, "addComboSetEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductRecommendationsUseCase, "getProductRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f34749ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f34753wkgbmnqykc = isLoggedInUseCase;
        this.f34729eablkybsjg = productChangesSourceProvider;
        this.f34732gxszxtbevo = analyticsTracker;
        this.f34743lqeggnwhkg = subscribeToOrderDeliveryPriceUseCase;
        this.f34744nufgyqmvbu = featureManager;
        this.f34728dxjokdxxww = loymaxPopupsObserver;
        this.f34722btonecajqb = changeCatalogFiltersObserver;
        this.f34731gtknphoqwx = changeFavoritesInteractor;
        this.f34726draadjrbmk = getCatalogBannersUseCase;
        this.f34752wflxmlrfwp = getProductsUseCase;
        this.f34721agtfadlqog = getCatalogWithChildUseCase;
        this.f34745ojitshcjhn = getIsProductsGridUseCase;
        this.f34750rgvfuqvkyq = setIsProductsGridUseCase;
        this.f34751vdvldrhtss = getOrderDeliveryType;
        this.f34746oxmwwwfdhm = getComboSetUseCase;
        this.f34740kcexrzcfyt = getUserAddressFlowInfo;
        this.f34758zdlpuopuiu = getOnboardingStoryUseCase;
        this.f34756yggfygwlhe = purchasesListComponentApi;
        this.f34739jyumaefscl = getIqosAgreementsStatusUseCase;
        this.f34737iwizpuwonk = addComboSetEditOrderUseCase;
        this.f34725cqumvgiudr = cartInteractor;
        this.f34730esjtqupxsv = clearCartUseCase;
        this.f34741lereixgezr = changeAdultCheckedUseCase;
        this.f34748pmvmpeiblj = isAdultCheckedUseCase;
        this.f34759zynmafqrjb = subscribeToCurrentDeliveryDataUseCase;
        this.f34736istkbnxepw = getCurrentDeliveryDataUseCase;
        this.f34723cdpycssgdh = getProductRecommendationsUseCase;
        this.f34747pkzmftpjix = 1;
        this.f34727dsvhmnatus = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: fr.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zoijcleaow.Q(this.f34689zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(ComboSetProduct comboSetProduct, mo.zoijcleaow zoijcleaowVar) {
        String article = comboSetProduct.getArticle();
        String name = comboSetProduct.getName();
        j0(new AnalyticsPage.ItemDetail(article, name), new AnalyticElement.ProductItemElement(article, name), new AnalyticsLocation.Combo(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        crxdokpmqz(new fr.gxszxtbevo.C0768gxszxtbevo(article, ((State) jlmebxxoox()).getPayload().getOrderEditId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(String str, lg.gxszxtbevo gxszxtbevoVar) {
        ojitshcjhn ojitshcjhnVar;
        Object next;
        CatalogBanner catalogBanner;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ojitshcjhn) {
            ojitshcjhnVar = (ojitshcjhn) gxszxtbevoVar;
            int i13 = ojitshcjhnVar.f34849cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ojitshcjhnVar.f34849cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            }
        } else {
            ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
        }
        Object objZoijcleaow = ojitshcjhnVar.f34851jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ojitshcjhnVar.f34849cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            State state = (State) jlmebxxoox();
            if (state.getPayload().wflxmlrfwp()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            Iterator it = state.getBanners().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogBanner) next).getId(), str));
            catalogBanner = (CatalogBanner) next;
            if (catalogBanner == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            String onboardingId = catalogBanner.getOnboardingId();
            if (onboardingId != null) {
                b82.iobyxmoadg.C0266iobyxmoadg c0266iobyxmoadg = new b82.iobyxmoadg.C0266iobyxmoadg(onboardingId);
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    b82.iobyxmoadg iobyxmoadgVar2 = this.f34758zdlpuopuiu;
                    ojitshcjhnVar.f34853zdlpuopuiu = this;
                    ojitshcjhnVar.f34852yggfygwlhe = catalogBanner;
                    ojitshcjhnVar.f34849cqumvgiudr = 1;
                    objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c0266iobyxmoadg, ojitshcjhnVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } catch (Throwable th2) {
                    th = th2;
                    zoijcleaowVar = this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                String strValueOf = String.valueOf(state.getBanners().indexOf(catalogBanner) + 1);
                String str2 = this.f34738jpowsppfya;
                if (str2 == null) {
                    str2 = "";
                }
                crxdokpmqz(new fr.gxszxtbevo.draadjrbmk(new AnalyticsPayload(new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str2), new AnalyticsLocation.BannerFeed(null, null, 3, null), new AnalyticElement.BannerItemElement(catalogBanner.getId(), strValueOf)), catalogBanner));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        catalogBanner = (CatalogBanner) ojitshcjhnVar.f34852yggfygwlhe;
        zoijcleaowVar = (zoijcleaow) ojitshcjhnVar.f34853zdlpuopuiu;
        try {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        } catch (Throwable th3) {
            th = th3;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((StoryItem) objZoijcleaow);
        StoryItem storyItem = (StoryItem) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (storyItem != null) {
            zoijcleaowVar.crxdokpmqz(new fr.gxszxtbevo.esjtqupxsv(storyItem, new StoryNavLink(catalogBanner.getNavigationLink().dxjokdxxww(), catalogBanner.getReference())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        Object next;
        State state = (State) jlmebxxoox();
        Iterator it = state.iwizpuwonk().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getId(), str));
        Product product = (Product) next;
        if (product == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objLqeggnwhkg = this.f34731gtknphoqwx.lqeggnwhkg(product.getId(), product.getIsFavorite(), new no.zoijcleaow.C1522zoijcleaow(new AnalyticsPage.ProductList(state.gtknphoqwx(), str2), null, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName())), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        boolean zWflxmlrfwp = ((State) jlmebxxoox()).getPayload().wflxmlrfwp();
        c20.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg();
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) eablkybsjgVarEablkybsjg.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            Z(false);
            if (!zWflxmlrfwp) {
                crxdokpmqz(new fr.gxszxtbevo.eablkybsjg(NonAuthorizedPayload.zoijcleaow.BUY));
            }
            return wwaezpbzknVar;
        }
        if (zWflxmlrfwp) {
            Object objF = f(comboSetProduct, comboSetProduct2, gxszxtbevoVar);
            return objF == mg.zoijcleaow.gxszxtbevo() ? objF : wwaezpbzknVar;
        }
        Object objE = e(comboSetProduct, comboSetProduct2, gxszxtbevoVar);
        return objE == mg.zoijcleaow.gxszxtbevo() ? objE : wwaezpbzknVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        k0(this, AnalyticsPage.ProductListFilters.f84327iwizpuwonk, null, null, 6, null);
        String str = this.f34738jpowsppfya;
        String brandId = ((State) jlmebxxoox()).getPayload().getBrandId();
        List list = this.f34724cllcsxoeiz;
        String str2 = this.f34734hkdspvbjdz;
        ProductListData productListData = ((State) jlmebxxoox()).getProductListData();
        crxdokpmqz(new fr.gxszxtbevo.wkgbmnqykc(new FiltersArgs(str, brandId, null, list, str2, productListData != null ? productListData.getColorsModel() : null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        String str = this.f34738jpowsppfya;
        if (str == null) {
            str = "";
        }
        crxdokpmqz(new fr.gxszxtbevo.jyumaefscl(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str), analyticsLocation)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        Paging paging;
        auzgnhcxok auzgnhcxokVar = this.f34742lmojexxdyd;
        boolean z13 = false;
        if (auzgnhcxokVar != null && !auzgnhcxokVar.agtfadlqog()) {
            z13 = true;
        }
        ProductListData productListData = ((State) jlmebxxoox()).getProductListData();
        if ((productListData == null || (paging = productListData.getPaging()) == null || this.f34747pkzmftpjix < paging.getPagesCount()) && !z13) {
            r(this, this.f34747pkzmftpjix + 1, false, false, false, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:71:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final Object H(String str, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation, lg.gxszxtbevo gxszxtbevoVar) {
        Iterator it;
        Object next;
        Iterator it2;
        Object next2;
        List limits;
        List limits2;
        Object wflxmlrfwpVar;
        State state = (State) jlmebxxoox();
        Product productYadqdtsiqt = state.yadqdtsiqt();
        Object obj = null;
        if (productYadqdtsiqt == null) {
            it = state.getRecommendations().getProducts().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getArticle(), str));
            productYadqdtsiqt = (Product) next;
            if (productYadqdtsiqt == null) {
                it2 = state.iwizpuwonk().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next2).getArticle(), str));
                productYadqdtsiqt = (Product) next2;
                if (productYadqdtsiqt == null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productYadqdtsiqt.getArticle(), str)) {
                productYadqdtsiqt = null;
            }
            if (productYadqdtsiqt == null) {
                it = state.getRecommendations().getProducts().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getArticle(), str));
                productYadqdtsiqt = (Product) next;
                if (productYadqdtsiqt == null) {
                    it2 = state.iwizpuwonk().iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next2).getArticle(), str));
                    productYadqdtsiqt = (Product) next2;
                    if (productYadqdtsiqt == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
            }
        }
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                wflxmlrfwpVar = new fr.lqeggnwhkg.iobyxmoadg(productYadqdtsiqt.getId());
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                wflxmlrfwpVar = new fr.lqeggnwhkg.wflxmlrfwp(productYadqdtsiqt.getId());
            }
            ulzqkzuiru(wflxmlrfwpVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        for (Object obj2 : state.getProductDataList()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), productYadqdtsiqt.getId())) {
                obj = obj2;
                break;
            }
        }
        ProductUIData productUIData = (ProductUIData) obj;
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        String str2 = this.f34738jpowsppfya;
        if (str2 == null) {
            str2 = "";
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str2), analyticsLocation, productYadqdtsiqt.getName());
        String id2 = productYadqdtsiqt.getId();
        String article = productYadqdtsiqt.getArticle();
        boolean isAvailableToBuy = productYadqdtsiqt.getIsAvailableToBuy();
        boolean isPmProduct = productYadqdtsiqt.getIsPmProduct();
        boolean availableOnlyForPickup = productYadqdtsiqt.getAvailableOnlyForPickup();
        MeasureTypeModel measureTypeModel = productYadqdtsiqt.getMeasureTypeModel();
        Double avgWeight = productYadqdtsiqt.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = k30.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = productYadqdtsiqt.getLimits();
        }
        Object objJ = j(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, availableOnlyForPickup, measureTypeModel, avgWeight, limits, changeProductAnalyticParams), gxszxtbevoVar);
        return objJ == mg.zoijcleaow.gxszxtbevo() ? objJ : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        k0(this, AnalyticsPage.Search.f84345iwizpuwonk, null, null, 6, null);
        crxdokpmqz(new fr.gxszxtbevo.dxjokdxxww(((State) jlmebxxoox()).getPayload()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(v00.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13 = ((State) jlmebxxoox()).getSelectedSort() != ppxfxbqfkfVar;
        ulzqkzuiru(new fr.lqeggnwhkg.nufgyqmvbu(ppxfxbqfkfVar));
        Z(true);
        r(this, 1, z13, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public final void K(String str, String str2) {
        boolean ageCheckedNeeded;
        List childCatalogSections;
        Object next;
        CatalogWithSubCatalogs catalogSection = ((State) jlmebxxoox()).getCatalogSection();
        if (catalogSection == null || (childCatalogSections = catalogSection.getChildCatalogSections()) == null) {
            ageCheckedNeeded = false;
        } else {
            Iterator it = childCatalogSections.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogSection) next).getId(), str2));
            CatalogSection catalogSection2 = (CatalogSection) next;
            if (catalogSection2 != null) {
                ageCheckedNeeded = catalogSection2.getAgeCheckedNeeded();
            } else {
                ageCheckedNeeded = false;
            }
        }
        boolean zBooleanValue = ((Boolean) this.f34748pmvmpeiblj.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (!ageCheckedNeeded || zBooleanValue) {
            N(str, str2);
        } else {
            crxdokpmqz(new fr.gxszxtbevo.wflxmlrfwp(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z13, String str, String str2) {
        if (z13) {
            this.f34741lereixgezr.zoijcleaow(Boolean.TRUE);
            N(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(Throwable th2) {
        crxdokpmqz(new fr.gxszxtbevo.oxmwwwfdhm(th2));
    }

    private final void N(String str, String str2) {
        ulzqkzuiru(new fr.lqeggnwhkg.btonecajqb(str2));
        this.f34724cllcsxoeiz = hg.jyumaefscl.wflxmlrfwp();
        if (((State) jlmebxxoox()).getPayload().getSelectionId() != null) {
            this.f34734hkdspvbjdz = str2;
        } else {
            this.f34738jpowsppfya = str2;
        }
        k0(this, new AnalyticsPage.ProductList(str, str2), null, null, 6, null);
        R(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(gr.zoijcleaow zoijcleaowVar) {
        if (!(zoijcleaowVar instanceof gr.zoijcleaow.C0872zoijcleaow)) {
            if (zoijcleaowVar instanceof gr.zoijcleaow.iobyxmoadg) {
                ulzqkzuiru(new fr.lqeggnwhkg.rgvfuqvkyq(((gr.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                return;
            } else {
                if (!(zoijcleaowVar instanceof gr.zoijcleaow.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(fr.gxszxtbevo.yggfygwlhe.f34686iobyxmoadg);
                return;
            }
        }
        gr.zoijcleaow.C0872zoijcleaow c0872zoijcleaow = (gr.zoijcleaow.C0872zoijcleaow) zoijcleaowVar;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kcexrzcfyt(), c0872zoijcleaow.iobyxmoadg())) {
            ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
            String catalogId = payload.getCatalogId();
            if (catalogId != null) {
                if (payload.getSelectionId() != null) {
                    catalogId = null;
                }
                if (catalogId != null) {
                    p(catalogId, c0872zoijcleaow.iobyxmoadg());
                }
            }
            S(this, false, 1, null);
        }
        V(c0872zoijcleaow.iobyxmoadg());
        tg.iobyxmoadg iobyxmoadgVarT = t();
        if (iobyxmoadgVarT != null) {
            iobyxmoadgVarT.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new fr.gxszxtbevo.pmvmpeiblj(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb Q(zoijcleaow zoijcleaowVar) {
        ProductListPayload payload = ((State) zoijcleaowVar.jlmebxxoox()).getPayload();
        String orderEditId = payload.getOrderEditId();
        return zoijcleaowVar.f34729eablkybsjg.iobyxmoadg((!payload.wflxmlrfwp() || orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? l00.btonecajqb.iobyxmoadg.zoijcleaow.f61220iobyxmoadg : new l00.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId));
    }

    private final void R(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(z13, null), 3, null);
    }

    static /* synthetic */ void S(zoijcleaow zoijcleaowVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        zoijcleaowVar.R(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    public final void U() {
        v00.ppxfxbqfkf sortType;
        List childCatalogSections;
        Object next;
        State state = (State) jlmebxxoox();
        k0(this, AnalyticsPage.ProductSort.f84330iwizpuwonk, null, null, 6, null);
        CatalogWithSubCatalogs catalogSection = state.getCatalogSection();
        if (catalogSection == null || (childCatalogSections = catalogSection.getChildCatalogSections()) == null) {
            sortType = null;
        } else {
            Iterator it = childCatalogSections.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CatalogSection) next).getId(), state.getPayload().getSectionId()));
            CatalogSection catalogSection2 = (CatalogSection) next;
            if (catalogSection2 != null) {
                sortType = catalogSection2.getSortType();
            } else {
                sortType = null;
            }
        }
        List listWkgbmnqykc = v00.wkgbmnqykc.wkgbmnqykc(v00.ppxfxbqfkf.f115048yggfygwlhe, sortType);
        v00.ppxfxbqfkf selectedSort = state.getSelectedSort();
        ProductListData productListData = state.getProductListData();
        crxdokpmqz(new fr.gxszxtbevo.cqumvgiudr(selectedSort, listWkgbmnqykc, productListData != null ? productListData.getColorsModel() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(String str) {
        Object next;
        Iterator it = ((State) jlmebxxoox()).getComboSetList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ComboSet) next).getId(), str));
        ComboSet comboSet = (ComboSet) next;
        if (comboSet == null) {
            return;
        }
        crxdokpmqz(new fr.gxszxtbevo.rgvfuqvkyq(comboSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(boolean z13) {
        ulzqkzuiru(new fr.lqeggnwhkg.gtknphoqwx(z13));
    }

    private final void a0(String str) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new kcexrzcfyt(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(boolean z13) {
        ulzqkzuiru(new fr.lqeggnwhkg.C0769lqeggnwhkg(z13));
    }

    public static final /* synthetic */ State c(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(ProductListData productListData, int i13) {
        String textModal = productListData.getTextModal();
        if (textModal == null || this.f34733hcddaimhww || i13 != 1) {
            return;
        }
        crxdokpmqz(new fr.gxszxtbevo.kcexrzcfyt(new gr.iobyxmoadg(productListData.getHeaderModal(), textModal, productListData.getButtonModal())));
        this.f34733hcddaimhww = true;
    }

    private final void d0() {
        this.f34732gxszxtbevo.wkgbmnqykc(new oo.lqeggnwhkg.iobyxmoadg(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objVdvldrhtss;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f34862iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f34862iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f34864yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f34862iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(true));
            k00.iobyxmoadg iobyxmoadgVar = this.f34725cqumvgiudr;
            ppxfxbqfkfVar.f34865zdlpuopuiu = this;
            ppxfxbqfkfVar.f34862iwizpuwonk = 1;
            objVdvldrhtss = iobyxmoadgVar.vdvldrhtss(comboSetProduct, comboSetProduct2, ppxfxbqfkfVar);
            if (objVdvldrhtss == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f34865zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objVdvldrhtss = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objVdvldrhtss)) {
            Warning warningZoijcleaow = ((t00.iobyxmoadg) objVdvldrhtss).zoijcleaow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warningZoijcleaow, Warning.Empty.f87479jyumaefscl)) {
                zoijcleaowVar.crxdokpmqz(fr.gxszxtbevo.ojitshcjhn.f34676iobyxmoadg);
            } else if ((warningZoijcleaow instanceof Warning.WithCodeAndMessage) || (warningZoijcleaow instanceof Warning.DailyLimit)) {
                zoijcleaowVar.crxdokpmqz(new fr.gxszxtbevo.pmvmpeiblj(warningZoijcleaow.getMessage()));
            } else if (!(warningZoijcleaow instanceof Warning.AvailableOnlyForPickup) && !(warningZoijcleaow instanceof Warning.Interval)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objVdvldrhtss);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.M(thDxjokdxxww);
        }
        zoijcleaowVar.ppxfxbqfkf(null);
        zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void e0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(v().zoijcleaow(), new zdlpuopuiu(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f34873iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f34873iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f34875yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f34873iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(true));
            String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            if (orderEditId == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            o20.iobyxmoadg.C1549iobyxmoadg c1549iobyxmoadg = new o20.iobyxmoadg.C1549iobyxmoadg(orderEditId, comboSetProduct, comboSetProduct2);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                o20.iobyxmoadg iobyxmoadgVar2 = this.f34737iwizpuwonk;
                wkgbmnqykcVar.f34876zdlpuopuiu = this;
                wkgbmnqykcVar.f34873iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c1549iobyxmoadg, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f34876zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            Warning warning = (Warning) objWkgbmnqykc;
            if (warning instanceof Warning.Empty) {
                zoijcleaowVar.crxdokpmqz(fr.gxszxtbevo.lereixgezr.f34672iobyxmoadg);
            } else if (warning instanceof Warning.DailyLimit) {
                zoijcleaowVar.crxdokpmqz(new fr.gxszxtbevo.pmvmpeiblj(((Warning.DailyLimit) warning).getMessage()));
            } else if (warning instanceof Warning.WithCodeAndMessage) {
                zoijcleaowVar.P(warning);
            } else if (!(warning instanceof Warning.AvailableOnlyForPickup) && !(warning instanceof Warning.Interval)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.M(thDxjokdxxww);
        }
        zoijcleaowVar.ppxfxbqfkf(null);
        zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void f0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new yggfygwlhe(this.f34722btonecajqb.btonecajqb(), this), new jyumaefscl(null)), new iwizpuwonk(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:91:0x009c A[SYNTHETIC] */
    public final Object g(String str, double d13, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        Iterator it;
        Object next;
        Product product;
        Object next2;
        ProductUIData productUIData;
        zoijcleaow zoijcleaowVar;
        Product product2;
        Object objWkgbmnqykc;
        MeasureType currentMeasure;
        double basketDefault;
        MeasureType measureType;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f34778esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f34778esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f34779iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f34778esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c20.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) eablkybsjgVarEablkybsjg.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(new fr.gxszxtbevo.eablkybsjg(NonAuthorizedPayload.zoijcleaow.DEFAULT));
                return wwaezpbzknVar;
            }
            State state = (State) jlmebxxoox();
            Product productYadqdtsiqt = state.yadqdtsiqt();
            if (productYadqdtsiqt == null) {
                it = state.iwizpuwonk().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getId(), str));
                product = (Product) next;
                if (product == null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                productYadqdtsiqt = product;
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productYadqdtsiqt.getId(), str)) {
                    productYadqdtsiqt = null;
                }
                if (productYadqdtsiqt == null) {
                    it = state.iwizpuwonk().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getId(), str));
                    product = (Product) next;
                    if (product == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    productYadqdtsiqt = product;
                }
            }
            Iterator it2 = state.getProductDataList().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next2).getId(), productYadqdtsiqt.getId()));
            productUIData = (ProductUIData) next2;
            ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar2 = this.f34756yggfygwlhe;
                eablkybsjgVar.f34782zdlpuopuiu = this;
                eablkybsjgVar.f34781yggfygwlhe = productYadqdtsiqt;
                eablkybsjgVar.f34780jyumaefscl = productUIData;
                eablkybsjgVar.f34778esjtqupxsv = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(eablkybsjgVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
                product2 = productYadqdtsiqt;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                product2 = productYadqdtsiqt;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productUIData = (ProductUIData) eablkybsjgVar.f34780jyumaefscl;
            product2 = (Product) eablkybsjgVar.f34781yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) eablkybsjgVar.f34782zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            List list = (List) objWkgbmnqykc;
            if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.L(product2.getMeasureTypeModel())) == null) {
                currentMeasure = product2.getMeasureTypeModel().getCurrentMeasure();
            }
            String article = product2.getArticle();
            if (productUIData != null) {
                Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(productUIData.getQuantity());
                Double d14 = dZoijcleaow.doubleValue() > 0.0d ? dZoijcleaow : null;
                if (d14 != null) {
                    basketDefault = d14.doubleValue();
                } else {
                    basketDefault = currentMeasure.getBasketDefault();
                }
            } else {
                basketDefault = currentMeasure.getBasketDefault();
            }
            zoijcleaowVar.crxdokpmqz(new fr.gxszxtbevo.vdvldrhtss(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list)));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.M(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void g0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f34731gtknphoqwx.dxjokdxxww(), new cqumvgiudr(null)), new esjtqupxsv(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        int i13;
        Throwable th2;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i14 = gxszxtbevoVar2.f34807cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f34807cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object obj = gxszxtbevoVar2.f34809jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = gxszxtbevoVar2.f34807cqumvgiudr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            boolean z13 = !((State) jlmebxxoox()).getIsGridType();
            h20.agtfadlqog.iobyxmoadg iobyxmoadgVar = new h20.agtfadlqog.iobyxmoadg(z13);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                h20.agtfadlqog agtfadlqogVar = this.f34750rgvfuqvkyq;
                gxszxtbevoVar2.f34811zdlpuopuiu = this;
                gxszxtbevoVar2.f34810yggfygwlhe = z13 ? 1 : 0;
                gxszxtbevoVar2.f34807cqumvgiudr = 1;
                if (agtfadlqogVar.zoijcleaow(iobyxmoadgVar, gxszxtbevoVar2) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
                i13 = z13 ? 1 : 0;
            } catch (Throwable th3) {
                i13 = z13 ? 1 : 0;
                th2 = th3;
                zoijcleaowVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = gxszxtbevoVar2.f34810yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar2.f34811zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th4) {
                th2 = th4;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.eablkybsjg(i13 != 0));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.M(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void h0(String str, boolean z13) {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(os.lqeggnwhkg.iobyxmoadg(w(), new pmvmpeiblj(this.f34759zynmafqrjb.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)), new zynmafqrjb(v().iobyxmoadg()), new istkbnxepw(new lereixgezr(this.f34743lqeggnwhkg.zoijcleaow(str), z13))), new cdpycssgdh(null)), sopmlzcsov());
    }

    private final void i() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i13, y00.iobyxmoadg iobyxmoadgVar) {
        State state = (State) jlmebxxoox();
        String brandId = state.getPayload().getBrandId();
        String strLqeggnwhkg = state.getSelectedSort().lqeggnwhkg();
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        String strValueOf = String.valueOf(i13);
        String str = this.f34738jpowsppfya;
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strName = deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.name() : null;
        List listWflxmlrfwp = this.f34724cllcsxoeiz;
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        this.f34732gxszxtbevo.eablkybsjg(new oo.lqeggnwhkg.iobyxmoadg(strWkgbmnqykc, strValueOf, str, strName, brandId, strLqeggnwhkg, listWflxmlrfwp.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        Object next;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f34844cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f34844cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objZoijcleaow = nufgyqmvbuVar.f34846jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f34844cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                t20.zoijcleaow zoijcleaowVar2 = this.f34739jyumaefscl;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                nufgyqmvbuVar.f34848zdlpuopuiu = this;
                nufgyqmvbuVar.f34847yggfygwlhe = changeProductParams;
                nufgyqmvbuVar.f34844cqumvgiudr = 1;
                objZoijcleaow = zoijcleaowVar2.zoijcleaow(wwaezpbzknVar, nufgyqmvbuVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            changeProductParams = (ChangeProductParams) nufgyqmvbuVar.f34847yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) nufgyqmvbuVar.f34848zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objZoijcleaow).booleanValue()));
        Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = boolIobyxmoadg;
        }
        boolean zBooleanValue = ((Boolean) objWkgbmnqykc).booleanValue();
        Iterator it = ((State) zoijcleaowVar.jlmebxxoox()).getProductDataList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), changeProductParams.getProductId()));
        boolean z13 = next != null;
        if (zBooleanValue || !changeProductParams.getIsPmProduct() || z13) {
            zoijcleaowVar.hkdspvbjdz(changeProductParams, ((State) zoijcleaowVar.jlmebxxoox()).getPayload().wflxmlrfwp());
        } else {
            zoijcleaowVar.crxdokpmqz(new fr.gxszxtbevo.zdlpuopuiu(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void j0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        String strGtknphoqwx = ((State) jlmebxxoox()).gtknphoqwx();
        String str = this.f34738jpowsppfya;
        if (str == null) {
            str = "";
        }
        this.f34732gxszxtbevo.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.ProductList(strGtknphoqwx, str), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void k0(zoijcleaow zoijcleaowVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        zoijcleaowVar.j0(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(k10.ppxfxbqfkf ppxfxbqfkfVar) {
        if (((State) jlmebxxoox()).getPayload().wflxmlrfwp() || !((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            n(this);
            o(this);
            return;
        }
        int i13 = ppxfxbqfkfVar == null ? -1 : C0776zoijcleaow.f34887iobyxmoadg[ppxfxbqfkfVar.ordinal()];
        if (i13 == -1) {
            n(this);
            o(this);
            return;
        }
        if (i13 == 1) {
            o(this);
            x();
        } else if (i13 == 2) {
            n(this);
            s();
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            x();
            s();
        }
    }

    private static final void n(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.zoijcleaow(hg.jyumaefscl.wflxmlrfwp()));
    }

    private static final void o(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.ulzqkzuiru(new fr.lqeggnwhkg.dxjokdxxww(null));
    }

    private final void p(String str, y00.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(str, iobyxmoadgVar, this, null), 3, null);
    }

    private final void q(int i13, boolean z13, boolean z14, boolean z15) {
        ms.iobyxmoadg.iobyxmoadg(this.f34742lmojexxdyd);
        this.f34742lmojexxdyd = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(i13, z15, z13, z14, null), 3, null);
    }

    static /* synthetic */ void r(zoijcleaow zoijcleaowVar, int i13, boolean z13, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        if ((i14 & 8) != 0) {
            z15 = false;
        }
        zoijcleaowVar.q(i13, z13, z14, z15);
    }

    private final void s() {
        auzgnhcxok auzgnhcxokVar = this.f34757ylkuphrtab;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f34757ylkuphrtab = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(lg.gxszxtbevo gxszxtbevoVar) {
        ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
        v00.iobyxmoadg flow = payload.getFlow();
        String orderEditId = payload.getOrderEditId();
        y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
        return this.f34751vdvldrhtss.zoijcleaow(new z10.gxszxtbevo.iobyxmoadg(flow, iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null, orderEditId), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb v() {
        return (l00.btonecajqb) this.f34727dsvhmnatus.getValue();
    }

    private final void x() {
        ms.iobyxmoadg.iobyxmoadg(this.f34754wwaezpbzkn);
        this.f34754wwaezpbzkn = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
        if (orderEditId != null) {
            crxdokpmqz(new fr.gxszxtbevo.zoijcleaow(orderEditId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str, String str2, String str3, AnalyticsLocation analyticsLocation) {
        k0(this, new AnalyticsPage.ItemDetail(str3, str), null, analyticsLocation, 2, null);
        crxdokpmqz(new fr.gxszxtbevo.lqeggnwhkg(str2, ((State) jlmebxxoox()).getPayload().getOrderEditId()));
    }

    public void V(y00.iobyxmoadg iobyxmoadgVar) {
        this.f34755yadqdtsiqt = iobyxmoadgVar;
    }

    public void W(boolean z13) {
        this.f34749ppxfxbqfkf.eablkybsjg(z13);
    }

    public void X(boolean z13) {
        this.f34749ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f34753wkgbmnqykc;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        crxdokpmqz(new fr.gxszxtbevo.agtfadlqog(params, str));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(fr.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.zoijcleaow.f34718iobyxmoadg)) {
            this.f34738jpowsppfya = ((State) jlmebxxoox()).getPayload().getSectionId();
            this.f34734hkdspvbjdz = ((State) jlmebxxoox()).getPayload().getSelectionId();
            d0();
            ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
            String orderEditId = payload.getOrderEditId();
            h0(orderEditId != null ? orderEditId : "", payload.wflxmlrfwp());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.iobyxmoadg.f34715iobyxmoadg)) {
            i();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.ppxfxbqfkf.f34716iobyxmoadg)) {
            if (((State) jlmebxxoox()).getPayload().wflxmlrfwp()) {
                return;
            }
            String str = this.f34738jpowsppfya;
            a0(str != null ? str : "");
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.eablkybsjg.f34713iobyxmoadg)) {
            f0();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.gxszxtbevo.f34714iobyxmoadg)) {
            g0();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, fr.wkgbmnqykc.C0770wkgbmnqykc.f34717iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            e0();
        }
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f34755yadqdtsiqt;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(fr.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(intent, this, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f34735iozdgvuglv = iobyxmoadgVar;
    }

    public tg.iobyxmoadg t() {
        return this.f34735iozdgvuglv;
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        crxdokpmqz(fr.gxszxtbevo.iwizpuwonk.f34667iobyxmoadg);
    }

    public sj.lqeggnwhkg w() {
        return this.f34749ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new oxmwwwfdhm(params, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        crxdokpmqz(new fr.gxszxtbevo.eablkybsjg(NonAuthorizedPayload.zoijcleaow.BUY));
    }
}
