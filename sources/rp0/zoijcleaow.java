package rp0;

import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.ntlheqmsrt;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.State;
import ru.myspar.proloyalty.catalog.impl.product_list.domain.model.ProductListFeatureToggles;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogBanner;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogSection;
import ru.myspar.proloyalty.core.domain.models.catalog.CatalogWithSubCatalogs;
import ru.myspar.proloyalty.core.domain.models.catalog.ProductRecommendationsBlock;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.product.ProductsPromoBanner;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.domain.feature.filters.store.FiltersArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import ru.myspar.proloyalty.story.domain.model.StoryItem;
import ru.myspar.proloyalty.story.domain.model.StoryNavLink;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends e8.iobyxmoadg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private static final iobyxmoadg f83401dsvhmnatus = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    public static final int f83402wypolnanlu = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final r01.eablkybsjg f83403agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final i01.iobyxmoadg f83404btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private pz0.iobyxmoadg f83405cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final gg.gtknphoqwx f83406cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final p01.ppxfxbqfkf f83407cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final r01.ppxfxbqfkf f83408draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final ah1.iobyxmoadg f83409dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dz0.gtknphoqwx f83410eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ow1.zoijcleaow f83411esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lw1.iobyxmoadg f83412gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final vm0.zoijcleaow f83413gxszxtbevo;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private String f83414hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private List f83415hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private auzgnhcxok f83416iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final r01.dxjokdxxww f83417istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final cz0.iobyxmoadg f83418iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private String f83419jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final w01.iobyxmoadg f83420jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final ut1.iobyxmoadg f83421kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ow1.iwizpuwonk f83422lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private auzgnhcxok f83423lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final p01.btonecajqb f83424lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final t81.iobyxmoadg f83425nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final r01.lqeggnwhkg f83426ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final s01.iobyxmoadg f83427oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f83428pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final m01.nufgyqmvbu f83429pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f83430ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final r01.gtknphoqwx f83431rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final m01.gxszxtbevo f83432vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final r01.btonecajqb f83433wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ow1.esjtqupxsv f83434wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private auzgnhcxok f83435wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private tg.iobyxmoadg f83436yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ow1.wflxmlrfwp f83437yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f83438ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ek1.iobyxmoadg f83439zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final m01.iobyxmoadg f83440zynmafqrjb;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ boolean f83441jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83443zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83441jyumaefscl = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new agtfadlqog(this.f83441jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83443zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            r01.lqeggnwhkg lqeggnwhkgVar = zoijcleaow.this.f83426ojitshcjhn;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            zoijcleaow.this.ulzqkzuiru(new rp0.lqeggnwhkg.eablkybsjg(((Boolean) lqeggnwhkgVar.zoijcleaow(wwaezpbzknVar)).booleanValue()));
            if (zoijcleaow.c(zoijcleaow.this).getProductListData() != null) {
                zoijcleaow.this.d0(true);
            }
            zoijcleaow.t(zoijcleaow.this, 1, false, this.f83441jyumaefscl, true, 2, null);
            return wwaezpbzknVar;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        int f83444cdpycssgdh;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f83445cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f83446esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        boolean f83448istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f83449iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f83450jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f83451lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        final /* synthetic */ int f83452lmojexxdyd;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        final /* synthetic */ boolean f83453pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f83454pmvmpeiblj;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        final /* synthetic */ boolean f83455wwaezpbzkn;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private /* synthetic */ Object f83456yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83457yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        final /* synthetic */ boolean f83458ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83459zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f83460zynmafqrjb;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f83461cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ pz0.iobyxmoadg f83462iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ String f83463jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ int f83464yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f83465zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(int i13, String str, pz0.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f83464yggfygwlhe = i13;
                this.f83463jyumaefscl = str;
                this.f83462iwizpuwonk = iobyxmoadgVar;
                this.f83461cqumvgiudr = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f83464yggfygwlhe, this.f83463jyumaefscl, this.f83462iwizpuwonk, this.f83461cqumvgiudr, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objWkgbmnqykc;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f83465zdlpuopuiu;
                try {
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        if (this.f83464yggfygwlhe != 1 || this.f83463jyumaefscl == null) {
                            return null;
                        }
                        r01.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = new r01.ppxfxbqfkf.iobyxmoadg(this.f83462iwizpuwonk.wkgbmnqykc(), this.f83463jyumaefscl);
                        zoijcleaow zoijcleaowVar = this.f83461cqumvgiudr;
                        gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                        r01.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaowVar.f83408draadjrbmk;
                        this.f83465zdlpuopuiu = 1;
                        obj = ppxfxbqfkfVar.zoijcleaow(iobyxmoadgVar, this);
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
        btonecajqb(int i13, boolean z13, boolean z14, boolean z15, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83452lmojexxdyd = i13;
            this.f83455wwaezpbzkn = z13;
            this.f83458ylkuphrtab = z14;
            this.f83453pkzmftpjix = z15;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            btonecajqb btonecajqbVar = zoijcleaow.this.new btonecajqb(this.f83452lmojexxdyd, this.f83455wwaezpbzkn, this.f83458ylkuphrtab, this.f83453pkzmftpjix, gxszxtbevoVar);
            btonecajqbVar.f83456yadqdtsiqt = obj;
            return btonecajqbVar;
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
            r01.btonecajqb.iobyxmoadg iobyxmoadgVar;
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
            Object objW;
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
            int i19 = this.f83444cdpycssgdh;
            try {
                if (i19 != 0) {
                    if (i19 == 1) {
                        int i23 = this.f83446esjtqupxsv;
                        str = (String) this.f83450jyumaefscl;
                        String str4 = (String) this.f83457yggfygwlhe;
                        String str5 = (String) this.f83459zdlpuopuiu;
                        cllcsxoeizVar = (cllcsxoeiz) this.f83456yadqdtsiqt;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow = obj;
                        str2 = str4;
                        str3 = str5;
                        i13 = i23;
                    } else {
                        if (i19 == 2) {
                            i14 = this.f83446esjtqupxsv;
                            ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f83456yadqdtsiqt;
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
                            i15 = this.f83452lmojexxdyd;
                            z13 = this.f83455wwaezpbzkn;
                            z14 = this.f83458ylkuphrtab;
                            z15 = this.f83453pkzmftpjix;
                            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                                productListData = (ProductListData) objWkgbmnqykc;
                                zoijcleaowVar2.f83438ylkuphrtab = i15;
                                this.f83456yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                                this.f83459zdlpuopuiu = objWkgbmnqykc;
                                this.f83457yggfygwlhe = zoijcleaowVar2;
                                this.f83450jyumaefscl = zoijcleaowVar2;
                                this.f83449iwizpuwonk = productListData;
                                this.f83445cqumvgiudr = productListData;
                                this.f83446esjtqupxsv = i14;
                                this.f83451lereixgezr = i15;
                                this.f83454pmvmpeiblj = z13;
                                this.f83460zynmafqrjb = z14;
                                this.f83448istkbnxepw = z15;
                                this.f83444cdpycssgdh = 3;
                                objW = zoijcleaowVar2.w(this);
                                if (objW == objGxszxtbevo) {
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
                                deliveryCode = (DeliveryCode) objW;
                                this.f83456yadqdtsiqt = obj2;
                                this.f83459zdlpuopuiu = zoijcleaowVar3;
                                this.f83457yggfygwlhe = zoijcleaowVar4;
                                this.f83450jyumaefscl = productListData2;
                                this.f83449iwizpuwonk = productListData;
                                this.f83445cqumvgiudr = deliveryCode;
                                this.f83446esjtqupxsv = i17;
                                this.f83451lereixgezr = i16;
                                this.f83454pmvmpeiblj = z17;
                                this.f83460zynmafqrjb = z14;
                                this.f83448istkbnxepw = z16;
                                this.f83444cdpycssgdh = 4;
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
                                zoijcleaowVar2.crxdokpmqz(new rp0.gxszxtbevo.zoijcleaow(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                            }
                            zoijcleaow.this.d0(false);
                            if (i14 != 0) {
                                zoijcleaow.this.e0(false);
                            }
                            zoijcleaow.this.f83413gxszxtbevo.zoijcleaow(new ym0.lqeggnwhkg.iobyxmoadg(null, 1, null));
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (i19 == 3) {
                            z16 = this.f83448istkbnxepw;
                            boolean z23 = this.f83460zynmafqrjb;
                            z17 = this.f83454pmvmpeiblj;
                            i16 = this.f83451lereixgezr;
                            i17 = this.f83446esjtqupxsv;
                            ProductListData productListData3 = (ProductListData) this.f83445cqumvgiudr;
                            ProductListData productListData4 = (ProductListData) this.f83449iwizpuwonk;
                            zoijcleaowVar4 = (zoijcleaow) this.f83450jyumaefscl;
                            zoijcleaow zoijcleaowVar7 = (zoijcleaow) this.f83457yggfygwlhe;
                            Object obj3 = this.f83459zdlpuopuiu;
                            ntlheqmsrtVarZoijcleaow = (ntlheqmsrt) this.f83456yadqdtsiqt;
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            obj2 = obj3;
                            zoijcleaowVar3 = zoijcleaowVar7;
                            productListData = productListData3;
                            productListData2 = productListData4;
                            z14 = z23;
                            objW = obj;
                            deliveryCode = (DeliveryCode) objW;
                            this.f83456yadqdtsiqt = obj2;
                            this.f83459zdlpuopuiu = zoijcleaowVar3;
                            this.f83457yggfygwlhe = zoijcleaowVar4;
                            this.f83450jyumaefscl = productListData2;
                            this.f83449iwizpuwonk = productListData;
                            this.f83445cqumvgiudr = deliveryCode;
                            this.f83446esjtqupxsv = i17;
                            this.f83451lereixgezr = i16;
                            this.f83454pmvmpeiblj = z17;
                            this.f83460zynmafqrjb = z14;
                            this.f83448istkbnxepw = z16;
                            this.f83444cdpycssgdh = 4;
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
                            z16 = this.f83448istkbnxepw;
                            z18 = this.f83460zynmafqrjb;
                            boolean z24 = this.f83454pmvmpeiblj;
                            i18 = this.f83451lereixgezr;
                            int i26 = this.f83446esjtqupxsv;
                            deliveryCode2 = (DeliveryCode) this.f83445cqumvgiudr;
                            ProductListData productListData5 = (ProductListData) this.f83449iwizpuwonk;
                            productListData2 = (ProductListData) this.f83450jyumaefscl;
                            zoijcleaowVar5 = (zoijcleaow) this.f83457yggfygwlhe;
                            zoijcleaowVar6 = (zoijcleaow) this.f83459zdlpuopuiu;
                            Object obj4 = this.f83456yadqdtsiqt;
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
                    zoijcleaowVar6.ulzqkzuiru(new rp0.lqeggnwhkg.wflxmlrfwp(productListData, deliveryCode2, listWflxmlrfwp, z19));
                    if (z17) {
                        zoijcleaowVar6.m(productListData2.getAdditionalBlocks());
                    }
                    zoijcleaowVar6.g0(productListData2, i18);
                    if (z18 || z16) {
                        zoijcleaowVar6.X();
                    }
                    objWkgbmnqykc = obj2;
                    i14 = i17;
                    zoijcleaowVar2 = zoijcleaowVar5;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        zoijcleaowVar2.crxdokpmqz(new rp0.gxszxtbevo.zoijcleaow(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                    }
                    zoijcleaow.this.d0(false);
                    if (i14 != 0) {
                        zoijcleaow.this.e0(false);
                    }
                    zoijcleaow.this.f83413gxszxtbevo.zoijcleaow(new ym0.lqeggnwhkg.iobyxmoadg(null, 1, null));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeizVar = (cllcsxoeiz) this.f83456yadqdtsiqt;
                State stateC = zoijcleaow.c(zoijcleaow.this);
                boolean zIsEmpty = stateC.iwizpuwonk().isEmpty();
                i13 = !zIsEmpty ? 1 : 0;
                if (!zIsEmpty) {
                    zoijcleaow.this.e0(true);
                }
                String brandId = stateC.getPayload().getBrandId();
                String strLqeggnwhkg = stateC.getSelectedSort().lqeggnwhkg();
                str = zoijcleaow.this.f83414hcddaimhww;
                m01.iobyxmoadg iobyxmoadgVar3 = zoijcleaow.this.f83440zynmafqrjb;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f83456yadqdtsiqt = cllcsxoeizVar;
                this.f83459zdlpuopuiu = brandId;
                this.f83457yggfygwlhe = strLqeggnwhkg;
                this.f83450jyumaefscl = str;
                this.f83446esjtqupxsv = i13;
                this.f83444cdpycssgdh = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                str2 = strLqeggnwhkg;
                str3 = brandId;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                r01.btonecajqb btonecajqbVar = zoijcleaowVar.f83433wflxmlrfwp;
                this.f83456yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                this.f83459zdlpuopuiu = null;
                this.f83457yggfygwlhe = null;
                this.f83450jyumaefscl = null;
                this.f83446esjtqupxsv = i13;
                this.f83444cdpycssgdh = 2;
                objZoijcleaow2 = btonecajqbVar.zoijcleaow(iobyxmoadgVar, this);
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i14 = i13;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
                zoijcleaowVar2 = zoijcleaow.this;
                i15 = this.f83452lmojexxdyd;
                z13 = this.f83455wwaezpbzkn;
                z14 = this.f83458ylkuphrtab;
                z15 = this.f83453pkzmftpjix;
                if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                    productListData = (ProductListData) objWkgbmnqykc;
                    zoijcleaowVar2.f83438ylkuphrtab = i15;
                    this.f83456yadqdtsiqt = ntlheqmsrtVarZoijcleaow;
                    this.f83459zdlpuopuiu = objWkgbmnqykc;
                    this.f83457yggfygwlhe = zoijcleaowVar2;
                    this.f83450jyumaefscl = zoijcleaowVar2;
                    this.f83449iwizpuwonk = productListData;
                    this.f83445cqumvgiudr = productListData;
                    this.f83446esjtqupxsv = i14;
                    this.f83451lereixgezr = i15;
                    this.f83454pmvmpeiblj = z13;
                    this.f83460zynmafqrjb = z14;
                    this.f83448istkbnxepw = z15;
                    this.f83444cdpycssgdh = 3;
                    objW = zoijcleaowVar2.w(this);
                    if (objW == objGxszxtbevo) {
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
                    deliveryCode = (DeliveryCode) objW;
                    this.f83456yadqdtsiqt = obj2;
                    this.f83459zdlpuopuiu = zoijcleaowVar3;
                    this.f83457yggfygwlhe = zoijcleaowVar4;
                    this.f83450jyumaefscl = productListData2;
                    this.f83449iwizpuwonk = productListData;
                    this.f83445cqumvgiudr = deliveryCode;
                    this.f83446esjtqupxsv = i17;
                    this.f83451lereixgezr = i16;
                    this.f83454pmvmpeiblj = z17;
                    this.f83460zynmafqrjb = z14;
                    this.f83448istkbnxepw = z16;
                    this.f83444cdpycssgdh = 4;
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
                    zoijcleaowVar6.ulzqkzuiru(new rp0.lqeggnwhkg.wflxmlrfwp(productListData, deliveryCode2, listWflxmlrfwp, z19));
                    if (z17) {
                        zoijcleaowVar6.m(productListData2.getAdditionalBlocks());
                    }
                    zoijcleaowVar6.g0(productListData2, i18);
                    if (z18) {
                        zoijcleaowVar6.X();
                    } else {
                        zoijcleaowVar6.X();
                    }
                    objWkgbmnqykc = obj2;
                    i14 = i17;
                    zoijcleaowVar2 = zoijcleaowVar5;
                }
                thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww != null) {
                    zoijcleaowVar2.crxdokpmqz(new rp0.gxszxtbevo.zoijcleaow(zoijcleaow.c(zoijcleaowVar2).getPayload().getWasOpenedViaNavLink()));
                }
                zoijcleaow.this.d0(false);
                if (i14 != 0) {
                    zoijcleaow.this.e0(false);
                }
                zoijcleaow.this.f83413gxszxtbevo.zoijcleaow(new ym0.lqeggnwhkg.iobyxmoadg(null, 1, null));
                return wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th3) {
                th = th3;
                i14 = i13;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
            pz0.iobyxmoadg iobyxmoadgVar6 = (pz0.iobyxmoadg) objZoijcleaow;
            iobyxmoadgVar = new r01.btonecajqb.iobyxmoadg(iobyxmoadgVar6.wkgbmnqykc(), iobyxmoadgVar6.ppxfxbqfkf(), str, str3, null, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(this.f83452lmojexxdyd), str2, zoijcleaow.this.f83415hkdspvbjdz, zoijcleaow.this.f83419jpowsppfya, null, null, 1536, null);
            zoijcleaow.this.m0(this.f83452lmojexxdyd, iobyxmoadgVar6);
            ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(this.f83452lmojexxdyd, str, iobyxmoadgVar6, zoijcleaow.this, null), 3, null);
            zoijcleaowVar = zoijcleaow.this;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83466yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83467zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83467zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f83466yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f83466yggfygwlhe = th2;
            return cqumvgiudrVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83469zdlpuopuiu;

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
            int i13 = this.f83469zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(rp0.lqeggnwhkg.ojitshcjhn.f83381iobyxmoadg);
                    s01.iobyxmoadg.InterfaceC2556iobyxmoadg.zoijcleaow zoijcleaowVar = new s01.iobyxmoadg.InterfaceC2556iobyxmoadg.zoijcleaow(nz0.zoijcleaow.CATALOG_SCREEN, zoijcleaow.this.f83414hcddaimhww, null, 4, null);
                    zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    s01.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar2.f83427oxmwwwfdhm;
                    this.f83469zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.zoijcleaow(zoijcleaowVar, this);
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
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            List listWflxmlrfwp = (List) objWkgbmnqykc;
            if (listWflxmlrfwp == null) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            zoijcleaow.this.ulzqkzuiru(new rp0.lqeggnwhkg.zoijcleaow(listWflxmlrfwp));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83471zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83471zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            ProductListData productListData = zoijcleaow.c(zoijcleaow.this).getProductListData();
            zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.dxjokdxxww(productListData != null ? productListData.getPromoBanner() : null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private /* synthetic */ Object f83472cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f83474iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f83475jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f83476yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83477zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f83478yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f83479zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f83478yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f83478yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f83479zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t81.iobyxmoadg iobyxmoadgVar = this.f83478yggfygwlhe.f83425nufgyqmvbu;
                    s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105732jpowsppfya;
                    this.f83479zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, this);
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
            final /* synthetic */ zoijcleaow f83480yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f83481zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f83480yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f83480yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f83481zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t81.iobyxmoadg iobyxmoadgVar = this.f83480yggfygwlhe.f83425nufgyqmvbu;
                    s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105737mbcevpiqjq;
                    this.f83481zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, this);
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

        /* JADX INFO: renamed from: rp0.zoijcleaow$eablkybsjg$zoijcleaow, reason: collision with other inner class name */
        static final class C1872zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f83482yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f83483zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1872zoijcleaow(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f83482yggfygwlhe = zoijcleaowVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1872zoijcleaow(this.f83482yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f83483zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t81.iobyxmoadg iobyxmoadgVar = this.f83482yggfygwlhe.f83425nufgyqmvbu;
                    s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105724esjtqupxsv;
                    this.f83483zdlpuopuiu = 1;
                    obj = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, this);
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
                return ((C1872zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = zoijcleaow.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f83472cqumvgiudr = obj;
            return eablkybsjgVar;
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
            int i13 = this.f83474iwizpuwonk;
            if (i13 != 0) {
                if (i13 == 1) {
                    ntlheqmsrtVar2 = (ntlheqmsrt) this.f83477zdlpuopuiu;
                    ntlheqmsrtVar = (ntlheqmsrt) this.f83472cqumvgiudr;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else if (i13 == 2) {
                    z13 = this.f83476yggfygwlhe;
                    ntlheqmsrtVar3 = (ntlheqmsrt) this.f83472cqumvgiudr;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    this.f83472cqumvgiudr = null;
                    this.f83476yggfygwlhe = z13;
                    this.f83475jyumaefscl = zBooleanValue;
                    this.f83474iwizpuwonk = 3;
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
                    z14 = this.f83475jyumaefscl;
                    z13 = this.f83476yggfygwlhe;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zoijcleaow.this.ulzqkzuiru(new rp0.lqeggnwhkg.ppxfxbqfkf(new ProductListFeatureToggles(z13, z14, ((Boolean) obj).booleanValue())));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f83472cqumvgiudr;
            ntlheqmsrt ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(zoijcleaow.this, null), 3, null);
            ntlheqmsrt ntlheqmsrtVarZoijcleaow2 = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new ppxfxbqfkf(zoijcleaow.this, null), 3, null);
            ntlheqmsrt ntlheqmsrtVarZoijcleaow3 = pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C1872zoijcleaow(zoijcleaow.this, null), 3, null);
            this.f83472cqumvgiudr = ntlheqmsrtVarZoijcleaow2;
            this.f83477zdlpuopuiu = ntlheqmsrtVarZoijcleaow3;
            this.f83474iwizpuwonk = 1;
            Object objLqeggnwhkg2 = ntlheqmsrtVarZoijcleaow.lqeggnwhkg(this);
            if (objLqeggnwhkg2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ntlheqmsrtVar = ntlheqmsrtVarZoijcleaow2;
            ntlheqmsrtVar2 = ntlheqmsrtVarZoijcleaow3;
            obj = objLqeggnwhkg2;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            this.f83472cqumvgiudr = ntlheqmsrtVar2;
            this.f83477zdlpuopuiu = null;
            this.f83476yggfygwlhe = zBooleanValue2;
            this.f83474iwizpuwonk = 2;
            Object objLqeggnwhkg3 = ntlheqmsrtVar.lqeggnwhkg(this);
            if (objLqeggnwhkg3 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ntlheqmsrt ntlheqmsrtVar4 = ntlheqmsrtVar2;
            z13 = zBooleanValue2;
            obj = objLqeggnwhkg3;
            ntlheqmsrtVar3 = ntlheqmsrtVar4;
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.f83472cqumvgiudr = null;
            this.f83476yggfygwlhe = z13;
            this.f83475jyumaefscl = zBooleanValue;
            this.f83474iwizpuwonk = 3;
            objLqeggnwhkg = ntlheqmsrtVar3.lqeggnwhkg(this);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            z14 = zBooleanValue;
            obj = objLqeggnwhkg;
            zoijcleaow.this.ulzqkzuiru(new rp0.lqeggnwhkg.ppxfxbqfkf(new ProductListFeatureToggles(z13, z14, ((Boolean) obj).booleanValue())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class esjtqupxsv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ boolean f83484yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f83485zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ boolean f83486yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f83487zdlpuopuiu;

            /* JADX INFO: renamed from: rp0.zoijcleaow$esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1873iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f83489yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f83490zdlpuopuiu;

                public C1873iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f83490zdlpuopuiu = obj;
                    this.f83489yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, boolean z13) {
                this.f83487zdlpuopuiu = nufgyqmvbuVar;
                this.f83486yggfygwlhe = z13;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1873iobyxmoadg c1873iobyxmoadg;
                if (gxszxtbevoVar instanceof C1873iobyxmoadg) {
                    c1873iobyxmoadg = (C1873iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1873iobyxmoadg.f83489yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1873iobyxmoadg.f83489yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1873iobyxmoadg = new C1873iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1873iobyxmoadg = new C1873iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1873iobyxmoadg.f83490zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1873iobyxmoadg.f83489yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f83487zdlpuopuiu;
                    if (this.f83486yggfygwlhe) {
                        c1873iobyxmoadg.f83489yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1873iobyxmoadg) == objGxszxtbevo) {
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

        public esjtqupxsv(sj.lqeggnwhkg lqeggnwhkgVar, boolean z13) {
            this.f83485zdlpuopuiu = lqeggnwhkgVar;
            this.f83484yggfygwlhe = z13;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f83485zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f83484yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83492zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83492zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(rp0.lqeggnwhkg.rgvfuqvkyq.f83384iobyxmoadg);
                    r01.dxjokdxxww.iobyxmoadg iobyxmoadgVar = new r01.dxjokdxxww.iobyxmoadg(zoijcleaow.this.f83414hcddaimhww);
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    r01.dxjokdxxww dxjokdxxwwVar = zoijcleaowVar.f83417istkbnxepw;
                    this.f83492zdlpuopuiu = 1;
                    obj = dxjokdxxwwVar.zoijcleaow(iobyxmoadgVar, this);
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
                zoijcleaowVar2.ulzqkzuiru(new rp0.lqeggnwhkg.btonecajqb((ProductRecommendationsBlock) hg.jyumaefscl.weqkydbzbr((List) objWkgbmnqykc)));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.ulzqkzuiru(new rp0.lqeggnwhkg.btonecajqb(null));
                zoijcleaowVar2.crxdokpmqz(new rp0.gxszxtbevo.vdvldrhtss(thDxjokdxxww));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f83493cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f83495jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83496yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83497zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83495jyumaefscl = obj;
            this.f83493cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.j(null, this);
        }
    }

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83499yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83500zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            istkbnxepw istkbnxepwVar = zoijcleaow.this.new istkbnxepw(gxszxtbevoVar);
            istkbnxepwVar.f83499yggfygwlhe = obj;
            return istkbnxepwVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83500zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f83499yggfygwlhe;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zoijcleaowVar.S((sp0.zoijcleaow) it.next());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((istkbnxepw) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83502yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83503zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = zoijcleaow.this.new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f83502yggfygwlhe = obj;
            return iwizpuwonkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83503zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f83502yggfygwlhe;
            zoijcleaow.this.ulzqkzuiru(new rp0.lqeggnwhkg.gxszxtbevo(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83504yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83505zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83505zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f83504yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f83504yggfygwlhe = th2;
            return jyumaefsclVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83507yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83508zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = zoijcleaow.this.new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f83507yggfygwlhe = obj;
            return kcexrzcfytVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83508zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f83507yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                zoijcleaow.this.Q(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                zoijcleaow.this.T(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class lereixgezr implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f83509zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f83510zdlpuopuiu;

            /* JADX INFO: renamed from: rp0.zoijcleaow$lereixgezr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1874iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f83512yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f83513zdlpuopuiu;

                public C1874iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f83513zdlpuopuiu = obj;
                    this.f83512yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f83510zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1874iobyxmoadg c1874iobyxmoadg;
                if (gxszxtbevoVar instanceof C1874iobyxmoadg) {
                    c1874iobyxmoadg = (C1874iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1874iobyxmoadg.f83512yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1874iobyxmoadg.f83512yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1874iobyxmoadg = new C1874iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1874iobyxmoadg = new C1874iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1874iobyxmoadg.f83513zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1874iobyxmoadg.f83512yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f83510zdlpuopuiu;
                    sp0.zoijcleaow.C2651zoijcleaow c2651zoijcleaow = new sp0.zoijcleaow.C2651zoijcleaow((pz0.iobyxmoadg) obj);
                    c1874iobyxmoadg.f83512yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2651zoijcleaow, c1874iobyxmoadg) == objGxszxtbevo) {
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

        public lereixgezr(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f83509zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f83509zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f83514jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ rp0.eablkybsjg f83515yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83516zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(rp0.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83515yggfygwlhe = eablkybsjgVar;
            this.f83514jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new lqeggnwhkg(this.f83515yggfygwlhe, this.f83514jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Unexpected iteration count in SwitchBreakVisitor. Please report as an issue */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            switch (this.f83516zdlpuopuiu) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    rp0.eablkybsjg eablkybsjgVar = this.f83515yggfygwlhe;
                    if (!(eablkybsjgVar instanceof rp0.eablkybsjg.iobyxmoadg)) {
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.ppxfxbqfkf.f83315iobyxmoadg)) {
                            if (!(eablkybsjgVar instanceof rp0.eablkybsjg.wkgbmnqykc)) {
                                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.C1868eablkybsjg.f83298iobyxmoadg)) {
                                    zoijcleaow zoijcleaowVar = this.f83514jyumaefscl;
                                    this.f83516zdlpuopuiu = 3;
                                    if (zoijcleaowVar.h(this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.gxszxtbevo) {
                                    this.f83514jyumaefscl.D(((rp0.eablkybsjg.gxszxtbevo) this.f83515yggfygwlhe).zoijcleaow(), ((rp0.eablkybsjg.gxszxtbevo) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.lqeggnwhkg) {
                                    zoijcleaow zoijcleaowVar2 = this.f83514jyumaefscl;
                                    ComboSetProduct comboSetProductIobyxmoadg = ((rp0.eablkybsjg.lqeggnwhkg) this.f83515yggfygwlhe).iobyxmoadg();
                                    ComboSetProduct comboSetProductZoijcleaow = ((rp0.eablkybsjg.lqeggnwhkg) this.f83515yggfygwlhe).zoijcleaow();
                                    this.f83516zdlpuopuiu = 5;
                                    if (zoijcleaowVar2.G(comboSetProductIobyxmoadg, comboSetProductZoijcleaow, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.nufgyqmvbu) {
                                    this.f83514jyumaefscl.c0(((rp0.eablkybsjg.nufgyqmvbu) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.dxjokdxxww) {
                                    zoijcleaow zoijcleaowVar3 = this.f83514jyumaefscl;
                                    String strIobyxmoadg = ((rp0.eablkybsjg.dxjokdxxww) this.f83515yggfygwlhe).iobyxmoadg();
                                    String str = this.f83514jyumaefscl.f83414hcddaimhww;
                                    if (str == null) {
                                        str = "";
                                    }
                                    this.f83516zdlpuopuiu = 6;
                                    if (zoijcleaowVar3.F(strIobyxmoadg, str, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.btonecajqb.f83292iobyxmoadg)) {
                                    this.f83514jyumaefscl.H();
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.draadjrbmk) {
                                    this.f83514jyumaefscl.I(((rp0.eablkybsjg.draadjrbmk) this.f83515yggfygwlhe).ppxfxbqfkf(), ((rp0.eablkybsjg.draadjrbmk) this.f83515yggfygwlhe).iobyxmoadg(), ((rp0.eablkybsjg.draadjrbmk) this.f83515yggfygwlhe).zoijcleaow());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.wflxmlrfwp) {
                                    this.f83514jyumaefscl.istkbnxepw(((rp0.eablkybsjg.wflxmlrfwp) this.f83515yggfygwlhe).iobyxmoadg(), zoijcleaow.c(this.f83514jyumaefscl).getPayload().wflxmlrfwp());
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.agtfadlqog.f83291iobyxmoadg)) {
                                    this.f83514jyumaefscl.crxdokpmqz(rp0.gxszxtbevo.wkgbmnqykc.f83363iobyxmoadg);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.ojitshcjhn.f83313iobyxmoadg)) {
                                    this.f83514jyumaefscl.J();
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.rgvfuqvkyq) {
                                    zoijcleaow zoijcleaowVar4 = this.f83514jyumaefscl;
                                    String strZoijcleaow = ((rp0.eablkybsjg.rgvfuqvkyq) this.f83515yggfygwlhe).zoijcleaow();
                                    ProductCardEvent productCardEventPpxfxbqfkf = ((rp0.eablkybsjg.rgvfuqvkyq) this.f83515yggfygwlhe).ppxfxbqfkf();
                                    AnalyticsLocation analyticsLocationIobyxmoadg = ((rp0.eablkybsjg.rgvfuqvkyq) this.f83515yggfygwlhe).iobyxmoadg();
                                    this.f83516zdlpuopuiu = 7;
                                    if (zoijcleaowVar4.K(strZoijcleaow, productCardEventPpxfxbqfkf, analyticsLocationIobyxmoadg, this) == objGxszxtbevo) {
                                        return objGxszxtbevo;
                                    }
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.vdvldrhtss) {
                                    this.f83514jyumaefscl.C(((rp0.eablkybsjg.vdvldrhtss) this.f83515yggfygwlhe).wkgbmnqykc(), ((rp0.eablkybsjg.vdvldrhtss) this.f83515yggfygwlhe).ppxfxbqfkf(), ((rp0.eablkybsjg.vdvldrhtss) this.f83515yggfygwlhe).zoijcleaow(), ((rp0.eablkybsjg.vdvldrhtss) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.kcexrzcfyt.f83307iobyxmoadg)) {
                                    zoijcleaow.W(this.f83514jyumaefscl, false, 1, null);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.zdlpuopuiu.f83326iobyxmoadg)) {
                                    this.f83514jyumaefscl.B();
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.yggfygwlhe.f83325iobyxmoadg)) {
                                    zoijcleaow.o0(this.f83514jyumaefscl, AnalyticsPage.Scan.f92372iwizpuwonk, null, null, 6, null);
                                    this.f83514jyumaefscl.crxdokpmqz(rp0.gxszxtbevo.dxjokdxxww.f83336iobyxmoadg);
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.jyumaefscl.f83306iobyxmoadg)) {
                                    this.f83514jyumaefscl.M();
                                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.iwizpuwonk.f83305iobyxmoadg)) {
                                    this.f83514jyumaefscl.Y();
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.cqumvgiudr) {
                                    this.f83514jyumaefscl.N(((rp0.eablkybsjg.cqumvgiudr) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.lereixgezr) {
                                    this.f83514jyumaefscl.O(((rp0.eablkybsjg.lereixgezr) this.f83515yggfygwlhe).zoijcleaow(), ((rp0.eablkybsjg.lereixgezr) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.gtknphoqwx) {
                                    this.f83514jyumaefscl.a0(((rp0.eablkybsjg.gtknphoqwx) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.esjtqupxsv) {
                                    this.f83514jyumaefscl.b0(((rp0.eablkybsjg.esjtqupxsv) this.f83515yggfygwlhe).iobyxmoadg());
                                } else if (eablkybsjgVar instanceof rp0.eablkybsjg.zoijcleaow) {
                                    this.f83514jyumaefscl.P(((rp0.eablkybsjg.zoijcleaow) this.f83515yggfygwlhe).ppxfxbqfkf(), ((rp0.eablkybsjg.zoijcleaow) this.f83515yggfygwlhe).zoijcleaow(), ((rp0.eablkybsjg.zoijcleaow) this.f83515yggfygwlhe).iobyxmoadg());
                                } else {
                                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, rp0.eablkybsjg.oxmwwwfdhm.f83314iobyxmoadg)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f83514jyumaefscl.L();
                                }
                                break;
                            } else {
                                zoijcleaow zoijcleaowVar5 = this.f83514jyumaefscl;
                                String strIobyxmoadg2 = ((rp0.eablkybsjg.wkgbmnqykc) this.f83515yggfygwlhe).iobyxmoadg();
                                this.f83516zdlpuopuiu = 2;
                                if (zoijcleaowVar5.E(strIobyxmoadg2, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                            }
                        } else {
                            this.f83514jyumaefscl.crxdokpmqz(new rp0.gxszxtbevo.zoijcleaow(zoijcleaow.c(this.f83514jyumaefscl).getPayload().getWasOpenedViaNavLink()));
                            break;
                        }
                    } else {
                        zoijcleaow zoijcleaowVar6 = this.f83514jyumaefscl;
                        String strIobyxmoadg3 = ((rp0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg();
                        this.f83516zdlpuopuiu = 1;
                        if (zoijcleaowVar6.g(strIobyxmoadg3, this) == objGxszxtbevo) {
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
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f83517iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ pz0.iobyxmoadg f83518jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f83519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83520zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(String str, pz0.iobyxmoadg iobyxmoadgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83519yggfygwlhe = str;
            this.f83518jyumaefscl = iobyxmoadgVar;
            this.f83517iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f83519yggfygwlhe, this.f83518jyumaefscl, this.f83517iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83520zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    r01.eablkybsjg.iobyxmoadg iobyxmoadgVar = new r01.eablkybsjg.iobyxmoadg(this.f83519yggfygwlhe, this.f83518jyumaefscl.wkgbmnqykc());
                    zoijcleaow zoijcleaowVar = this.f83517iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    r01.eablkybsjg eablkybsjgVar = zoijcleaowVar.f83403agtfadlqog;
                    this.f83520zdlpuopuiu = 1;
                    obj = eablkybsjgVar.zoijcleaow(iobyxmoadgVar, this);
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
            zoijcleaow zoijcleaowVar2 = this.f83517iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zoijcleaowVar2.ulzqkzuiru(new rp0.lqeggnwhkg.oxmwwwfdhm((CatalogWithSubCatalogs) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zoijcleaowVar2.Q(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83522zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83522zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f83522zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(100L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.crxdokpmqz(rp0.gxszxtbevo.gtknphoqwx.f83340iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f83523iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f83524jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f83525yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83526zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar, zoijcleaow zoijcleaowVar) {
            super(3, gxszxtbevoVar);
            this.f83523iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83526zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f83525yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f83524jyumaefscl).booleanValue() ? this.f83523iwizpuwonk.y().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f83526zdlpuopuiu = 1;
                if (sj.dxjokdxxww.iwizpuwonk(nufgyqmvbuVar, lqeggnwhkgVarZoijcleaow, this) == objGxszxtbevo) {
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

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(gxszxtbevoVar, this.f83523iwizpuwonk);
            oxmwwwfdhmVar.f83525yggfygwlhe = nufgyqmvbuVar;
            oxmwwwfdhmVar.f83524jyumaefscl = obj;
            return oxmwwwfdhmVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class pmvmpeiblj implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f83527zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f83528zdlpuopuiu;

            /* JADX INFO: renamed from: rp0.zoijcleaow$pmvmpeiblj$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1875iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f83530yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f83531zdlpuopuiu;

                public C1875iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f83531zdlpuopuiu = obj;
                    this.f83530yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f83528zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1875iobyxmoadg c1875iobyxmoadg;
                if (gxszxtbevoVar instanceof C1875iobyxmoadg) {
                    c1875iobyxmoadg = (C1875iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1875iobyxmoadg.f83530yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1875iobyxmoadg.f83530yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1875iobyxmoadg = new C1875iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1875iobyxmoadg = new C1875iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1875iobyxmoadg.f83531zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1875iobyxmoadg.f83530yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f83528zdlpuopuiu;
                    sp0.zoijcleaow.iobyxmoadg iobyxmoadgVar = new sp0.zoijcleaow.iobyxmoadg((List) obj);
                    c1875iobyxmoadg.f83530yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(iobyxmoadgVar, c1875iobyxmoadg) == objGxszxtbevo) {
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
            this.f83527zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f83527zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f83532iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83534yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83535zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83534yggfygwlhe = obj;
            this.f83532iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.f(null, null, this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f83536jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83538zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83536jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new rgvfuqvkyq(this.f83536jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83538zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarY = zoijcleaow.this.y();
                ChangeProductParams changeProductParams = this.f83536jyumaefscl;
                this.f83538zdlpuopuiu = 1;
                if (btonecajqbVarY.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f83539jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83541zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83539jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new vdvldrhtss(this.f83539jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            CatalogSection rootCatalogSection;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83541zdlpuopuiu;
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
                ah1.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f83409dxjokdxxww;
                hh1.gtknphoqwx.eablkybsjg eablkybsjgVar = new hh1.gtknphoqwx.eablkybsjg(this.f83539jyumaefscl);
                AnalyticsPage.ProductList productList = new AnalyticsPage.ProductList(name, this.f83539jyumaefscl);
                this.f83541zdlpuopuiu = 1;
                if (iobyxmoadgVar.gxszxtbevo(eablkybsjgVar, productList, this) == objGxszxtbevo) {
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
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f83542cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f83544jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83545yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83546zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83544jyumaefscl = obj;
            this.f83542cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.E(null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f83548esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f83549iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f83550jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f83551yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83552zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83549iwizpuwonk = obj;
            this.f83548esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.g(null, this);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83554yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83555zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = zoijcleaow.this.new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f83554yggfygwlhe = obj;
            return yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f83555zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            i01.iobyxmoadg.C0973iobyxmoadg c0973iobyxmoadg = (i01.iobyxmoadg.C0973iobyxmoadg) this.f83554yggfygwlhe;
            zoijcleaow.this.f83415hkdspvbjdz = c0973iobyxmoadg.iobyxmoadg();
            zoijcleaow.this.d0(true);
            zoijcleaow.t(zoijcleaow.this, 1, false, false, false, 14, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i01.iobyxmoadg.C0973iobyxmoadg c0973iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(c0973iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class zdlpuopuiu implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f83556yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f83557zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zoijcleaow f83558yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f83559zdlpuopuiu;

            /* JADX INFO: renamed from: rp0.zoijcleaow$zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1876iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f83561yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f83562zdlpuopuiu;

                public C1876iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f83562zdlpuopuiu = obj;
                    this.f83561yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, zoijcleaow zoijcleaowVar) {
                this.f83559zdlpuopuiu = nufgyqmvbuVar;
                this.f83558yggfygwlhe = zoijcleaowVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1876iobyxmoadg c1876iobyxmoadg;
                if (gxszxtbevoVar instanceof C1876iobyxmoadg) {
                    c1876iobyxmoadg = (C1876iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1876iobyxmoadg.f83561yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1876iobyxmoadg.f83561yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1876iobyxmoadg = new C1876iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1876iobyxmoadg = new C1876iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1876iobyxmoadg.f83562zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1876iobyxmoadg.f83561yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f83559zdlpuopuiu;
                    if (hg.jyumaefscl.rgvfuqvkyq(this.f83558yggfygwlhe.f83414hcddaimhww, zoijcleaow.c(this.f83558yggfygwlhe).getPayload().getBrandId()).contains(((i01.iobyxmoadg.C0973iobyxmoadg) obj).zoijcleaow())) {
                        c1876iobyxmoadg.f83561yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1876iobyxmoadg) == objGxszxtbevo) {
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

        public zdlpuopuiu(sj.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar) {
            this.f83557zdlpuopuiu = lqeggnwhkgVar;
            this.f83556yggfygwlhe = zoijcleaowVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f83557zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f83556yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX INFO: renamed from: rp0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1877zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f83563iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83565yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83566zdlpuopuiu;

        C1877zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83565yggfygwlhe = obj;
            this.f83563iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.e(null, null, this);
        }
    }

    public static final class zynmafqrjb implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f83567zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f83568zdlpuopuiu;

            /* JADX INFO: renamed from: rp0.zoijcleaow$zynmafqrjb$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1878iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f83570yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f83571zdlpuopuiu;

                public C1878iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f83571zdlpuopuiu = obj;
                    this.f83570yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f83568zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1878iobyxmoadg c1878iobyxmoadg;
                if (gxszxtbevoVar instanceof C1878iobyxmoadg) {
                    c1878iobyxmoadg = (C1878iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1878iobyxmoadg.f83570yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1878iobyxmoadg.f83570yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1878iobyxmoadg = new C1878iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1878iobyxmoadg = new C1878iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1878iobyxmoadg.f83571zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1878iobyxmoadg.f83570yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f83568zdlpuopuiu;
                    sp0.zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new sp0.zoijcleaow.ppxfxbqfkf((Double) obj);
                    c1878iobyxmoadg.f83570yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c1878iobyxmoadg) == objGxszxtbevo) {
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
            this.f83567zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f83567zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ow1.esjtqupxsv isAuthUseCase, dz0.gtknphoqwx productChangesSourceProvider, vm0.zoijcleaow analyticsTracker, p01.btonecajqb subscribeToOrderDeliveryPriceUseCase, t81.iobyxmoadg featureManager, ah1.iobyxmoadg popupsObserver, i01.iobyxmoadg changeCatalogFiltersObserver, lw1.iobyxmoadg changeFavoritesInteractor, r01.ppxfxbqfkf getCatalogBannersUseCase, r01.btonecajqb getProductsUseCase, r01.eablkybsjg getCatalogWithChildUseCase, r01.lqeggnwhkg getIsProductsGridUseCase, r01.gtknphoqwx setIsProductsGridUseCase, m01.gxszxtbevo getOrderDeliveryType, s01.iobyxmoadg getComboSetUseCase, ut1.iobyxmoadg getOnboardingStoryUseCase, ek1.iobyxmoadg purchasesListComponentApi, ow1.wflxmlrfwp fetchAndSaveIsAgreementAcceptedUseCase, w01.iobyxmoadg addComboSetEditOrderUseCase, cz0.iobyxmoadg cartInteractor, p01.ppxfxbqfkf clearCartUseCase, ow1.zoijcleaow changeAdultCheckedUseCase, ow1.iwizpuwonk isAdultCheckedUseCase, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, m01.iobyxmoadg getCurrentDeliveryDataUseCase, r01.dxjokdxxww getProductRecommendationsUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupsObserver, "popupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogBannersUseCase, "getCatalogBannersUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogWithChildUseCase, "getCatalogWithChildUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIsProductsGridUseCase, "getIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIsProductsGridUseCase, "setIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderDeliveryType, "getOrderDeliveryType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOnboardingStoryUseCase, "getOnboardingStoryUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fetchAndSaveIsAgreementAcceptedUseCase, "fetchAndSaveIsAgreementAcceptedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addComboSetEditOrderUseCase, "addComboSetEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clearCartUseCase, "clearCartUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductRecommendationsUseCase, "getProductRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f83430ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f83434wkgbmnqykc = isAuthUseCase;
        this.f83410eablkybsjg = productChangesSourceProvider;
        this.f83413gxszxtbevo = analyticsTracker;
        this.f83424lqeggnwhkg = subscribeToOrderDeliveryPriceUseCase;
        this.f83425nufgyqmvbu = featureManager;
        this.f83409dxjokdxxww = popupsObserver;
        this.f83404btonecajqb = changeCatalogFiltersObserver;
        this.f83412gtknphoqwx = changeFavoritesInteractor;
        this.f83408draadjrbmk = getCatalogBannersUseCase;
        this.f83433wflxmlrfwp = getProductsUseCase;
        this.f83403agtfadlqog = getCatalogWithChildUseCase;
        this.f83426ojitshcjhn = getIsProductsGridUseCase;
        this.f83431rgvfuqvkyq = setIsProductsGridUseCase;
        this.f83432vdvldrhtss = getOrderDeliveryType;
        this.f83427oxmwwwfdhm = getComboSetUseCase;
        this.f83421kcexrzcfyt = getOnboardingStoryUseCase;
        this.f83439zdlpuopuiu = purchasesListComponentApi;
        this.f83437yggfygwlhe = fetchAndSaveIsAgreementAcceptedUseCase;
        this.f83420jyumaefscl = addComboSetEditOrderUseCase;
        this.f83418iwizpuwonk = cartInteractor;
        this.f83407cqumvgiudr = clearCartUseCase;
        this.f83411esjtqupxsv = changeAdultCheckedUseCase;
        this.f83422lereixgezr = isAdultCheckedUseCase;
        this.f83429pmvmpeiblj = subscribeToCurrentDeliveryDataUseCase;
        this.f83440zynmafqrjb = getCurrentDeliveryDataUseCase;
        this.f83417istkbnxepw = getProductRecommendationsUseCase;
        this.f83438ylkuphrtab = 1;
        this.f83406cllcsxoeiz = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: rp0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zoijcleaow.U(this.f83369zdlpuopuiu);
            }
        });
    }

    private final void A() {
        cr0.iobyxmoadg.iobyxmoadg(this.f83423lmojexxdyd);
        this.f83423lmojexxdyd = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B() {
        String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
        if (orderEditId != null) {
            crxdokpmqz(new rp0.gxszxtbevo.ppxfxbqfkf(orderEditId));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str, String str2, String str3, AnalyticsLocation analyticsLocation) {
        o0(this, new AnalyticsPage.ItemDetail(str3, str), null, analyticsLocation, 2, null);
        crxdokpmqz(new rp0.gxszxtbevo.nufgyqmvbu(str2, ((State) jlmebxxoox()).getPayload().getOrderEditId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(ComboSetProduct comboSetProduct, wm0.zoijcleaow zoijcleaowVar) {
        String article = comboSetProduct.getArticle();
        String name = comboSetProduct.getName();
        n0(new AnalyticsPage.ItemDetail(article, name), new AnalyticElement.ProductItemElement(article, name), new AnalyticsLocation.Combo(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow()));
        crxdokpmqz(new rp0.gxszxtbevo.lqeggnwhkg(article, ((State) jlmebxxoox()).getPayload().getOrderEditId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        Object next;
        CatalogBanner catalogBanner;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f83542cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f83542cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object objZoijcleaow = wflxmlrfwpVar.f83544jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar.f83542cqumvgiudr;
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
                ut1.iobyxmoadg.C2836iobyxmoadg c2836iobyxmoadg = new ut1.iobyxmoadg.C2836iobyxmoadg(onboardingId);
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ut1.iobyxmoadg iobyxmoadgVar2 = this.f83421kcexrzcfyt;
                    wflxmlrfwpVar.f83546zdlpuopuiu = this;
                    wflxmlrfwpVar.f83545yggfygwlhe = catalogBanner;
                    wflxmlrfwpVar.f83542cqumvgiudr = 1;
                    objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c2836iobyxmoadg, wflxmlrfwpVar);
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
                String str2 = this.f83414hcddaimhww;
                if (str2 == null) {
                    str2 = "";
                }
                crxdokpmqz(new rp0.gxszxtbevo.draadjrbmk(new AnalyticsPayload(new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str2), new AnalyticsLocation.BannerFeed(null, null, 3, null), new AnalyticElement.BannerItemElement(catalogBanner.getId(), strValueOf)), catalogBanner));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        catalogBanner = (CatalogBanner) wflxmlrfwpVar.f83545yggfygwlhe;
        zoijcleaowVar = (zoijcleaow) wflxmlrfwpVar.f83546zdlpuopuiu;
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
            zoijcleaowVar.crxdokpmqz(new rp0.gxszxtbevo.cqumvgiudr(storyItem, new StoryNavLink(catalogBanner.getNavigationLink().btonecajqb(), catalogBanner.getReference())));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(String str, String str2, lg.gxszxtbevo gxszxtbevoVar) {
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
        Object objLqeggnwhkg = this.f83412gtknphoqwx.lqeggnwhkg(product.getId(), product.getIsFavorite(), new xm0.zoijcleaow.C3095zoijcleaow(new AnalyticsPage.ProductList(state.gtknphoqwx(), str2), null, new AnalyticElement.ProductItemElement(product.getArticle(), product.getName())), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        boolean zWflxmlrfwp = ((State) jlmebxxoox()).getPayload().wflxmlrfwp();
        ow1.esjtqupxsv esjtqupxsvVarWkgbmnqykc = wkgbmnqykc();
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) esjtqupxsvVarWkgbmnqykc.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            d0(false);
            if (!zWflxmlrfwp) {
                crxdokpmqz(rp0.gxszxtbevo.C1869gxszxtbevo.f83341iobyxmoadg);
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
    public final void H() {
        o0(this, AnalyticsPage.ProductListFilters.f92355iwizpuwonk, null, null, 6, null);
        String str = this.f83414hcddaimhww;
        String brandId = ((State) jlmebxxoox()).getPayload().getBrandId();
        List list = this.f83415hkdspvbjdz;
        String str2 = this.f83419jpowsppfya;
        ProductListData productListData = ((State) jlmebxxoox()).getProductListData();
        crxdokpmqz(new rp0.gxszxtbevo.eablkybsjg(new FiltersArgs(str, brandId, null, list, str2, productListData != null ? productListData.getColorsModel() : null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(HintUiModel hintUiModel, AnalyticElement.ProductItemElement productItemElement, AnalyticsLocation analyticsLocation) {
        String str = this.f83414hcddaimhww;
        if (str == null) {
            str = "";
        }
        crxdokpmqz(new rp0.gxszxtbevo.yggfygwlhe(hintUiModel, new HintDialogAnalyticsInfo(productItemElement, new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str), analyticsLocation)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J() {
        Paging paging;
        auzgnhcxok auzgnhcxokVar = this.f83416iozdgvuglv;
        boolean z13 = false;
        if (auzgnhcxokVar != null && !auzgnhcxokVar.agtfadlqog()) {
            z13 = true;
        }
        ProductListData productListData = ((State) jlmebxxoox()).getProductListData();
        if ((productListData == null || (paging = productListData.getPaging()) == null || this.f83438ylkuphrtab < paging.getPagesCount()) && !z13) {
            t(this, this.f83438ylkuphrtab + 1, false, false, false, 14, null);
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
    public final Object K(String str, ProductCardEvent productCardEvent, AnalyticsLocation analyticsLocation, lg.gxszxtbevo gxszxtbevoVar) {
        Iterator it;
        Object next;
        Iterator it2;
        Object next2;
        List limits;
        List limits2;
        Object agtfadlqogVar;
        State state = (State) jlmebxxoox();
        Product productIozdgvuglv = state.iozdgvuglv();
        Object obj = null;
        if (productIozdgvuglv == null) {
            it = state.getRecommendations().getProducts().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getArticle(), str));
            productIozdgvuglv = (Product) next;
            if (productIozdgvuglv == null) {
                it2 = state.iwizpuwonk().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next2).getArticle(), str));
                productIozdgvuglv = (Product) next2;
                if (productIozdgvuglv == null) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productIozdgvuglv.getArticle(), str)) {
                productIozdgvuglv = null;
            }
            if (productIozdgvuglv == null) {
                it = state.getRecommendations().getProducts().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getArticle(), str));
                productIozdgvuglv = (Product) next;
                if (productIozdgvuglv == null) {
                    it2 = state.iwizpuwonk().iterator();
                    do {
                        if (it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next2).getArticle(), str));
                    productIozdgvuglv = (Product) next2;
                    if (productIozdgvuglv == null) {
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
            }
        }
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                agtfadlqogVar = new rp0.lqeggnwhkg.iobyxmoadg(productIozdgvuglv.getId());
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                agtfadlqogVar = new rp0.lqeggnwhkg.agtfadlqog(productIozdgvuglv.getId());
            }
            ulzqkzuiru(agtfadlqogVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        for (Object obj2 : state.getProductDataList()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), productIozdgvuglv.getId())) {
                obj = obj2;
                break;
            }
        }
        ProductUIData productUIData = (ProductUIData) obj;
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        String str2 = this.f83414hcddaimhww;
        if (str2 == null) {
            str2 = "";
        }
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str2), analyticsLocation, productIozdgvuglv.getName());
        String id2 = productIozdgvuglv.getId();
        String article = productIozdgvuglv.getArticle();
        boolean isAvailableToBuy = productIozdgvuglv.getIsAvailableToBuy();
        boolean isPmProduct = productIozdgvuglv.getIsPmProduct();
        MeasureTypeModel measureTypeModel = productIozdgvuglv.getMeasureTypeModel();
        Double avgWeight = productIozdgvuglv.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = q11.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = productIozdgvuglv.getLimits();
        }
        Object objJ = j(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, measureTypeModel, avgWeight, limits, changeProductAnalyticParams), gxszxtbevoVar);
        return objJ == mg.zoijcleaow.gxszxtbevo() ? objJ : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        ProductsPromoBanner promoBanner = ((State) jlmebxxoox()).getPromoBanner();
        if (promoBanner != null) {
            String str = this.f83414hcddaimhww;
            if (str == null) {
                str = "";
            }
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(new AnalyticsPayload(new AnalyticsPage.ProductList(((State) jlmebxxoox()).gtknphoqwx(), str), AnalyticsLocation.PromoBanner.f92281iwizpuwonk, new AnalyticElement.PromoBanner(promoBanner.getId())), promoBanner);
            if (vdvldrhtssVarIobyxmoadg != null) {
                AnalyticsPayload analyticsPayload = (AnalyticsPayload) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
                ProductsPromoBanner productsPromoBanner = (ProductsPromoBanner) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
                crxdokpmqz(new rp0.gxszxtbevo.iobyxmoadg(productsPromoBanner.getNavLink(), productsPromoBanner.getReference(), analyticsPayload));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        o0(this, AnalyticsPage.Search.f92373iwizpuwonk, null, null, 6, null);
        crxdokpmqz(new rp0.gxszxtbevo.btonecajqb(((State) jlmebxxoox()).getPayload()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(mz0.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13 = ((State) jlmebxxoox()).getSelectedSort() != ppxfxbqfkfVar;
        ulzqkzuiru(new rp0.lqeggnwhkg.nufgyqmvbu(ppxfxbqfkfVar));
        d0(true);
        t(this, 1, z13, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public final void O(String str, String str2) {
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
        boolean zBooleanValue = ((Boolean) this.f83422lereixgezr.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        if (!ageCheckedNeeded || zBooleanValue) {
            R(str, str2);
        } else {
            crxdokpmqz(new rp0.gxszxtbevo.wflxmlrfwp(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(boolean z13, String str, String str2) {
        if (z13) {
            this.f83411esjtqupxsv.zoijcleaow(Boolean.TRUE);
            R(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Throwable th2) {
        crxdokpmqz(new rp0.gxszxtbevo.vdvldrhtss(th2));
    }

    private final void R(String str, String str2) {
        ulzqkzuiru(new rp0.lqeggnwhkg.gtknphoqwx(str2));
        this.f83415hkdspvbjdz = hg.jyumaefscl.wflxmlrfwp();
        if (((State) jlmebxxoox()).getPayload().getSelectionId() != null) {
            this.f83419jpowsppfya = str2;
        } else {
            this.f83414hcddaimhww = str2;
        }
        o0(this, new AnalyticsPage.ProductList(str, str2), null, null, 6, null);
        V(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(sp0.zoijcleaow zoijcleaowVar) {
        if (!(zoijcleaowVar instanceof sp0.zoijcleaow.C2651zoijcleaow)) {
            if (zoijcleaowVar instanceof sp0.zoijcleaow.iobyxmoadg) {
                ulzqkzuiru(new rp0.lqeggnwhkg.vdvldrhtss(((sp0.zoijcleaow.iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                return;
            } else {
                if (!(zoijcleaowVar instanceof sp0.zoijcleaow.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(rp0.gxszxtbevo.zdlpuopuiu.f83367iobyxmoadg);
                return;
            }
        }
        sp0.zoijcleaow.C2651zoijcleaow c2651zoijcleaow = (sp0.zoijcleaow.C2651zoijcleaow) zoijcleaowVar;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(x(), c2651zoijcleaow.iobyxmoadg())) {
            ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
            String catalogId = payload.getCatalogId();
            if (catalogId != null) {
                if (payload.getSelectionId() != null) {
                    catalogId = null;
                }
                if (catalogId != null) {
                    q(catalogId, c2651zoijcleaow.iobyxmoadg());
                }
            }
            W(this, false, 1, null);
        }
        Z(c2651zoijcleaow.iobyxmoadg());
        tg.iobyxmoadg iobyxmoadgVarV = v();
        if (iobyxmoadgVarV != null) {
            iobyxmoadgVarV.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new rp0.gxszxtbevo.lereixgezr(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb U(zoijcleaow zoijcleaowVar) {
        ProductListPayload payload = ((State) zoijcleaowVar.jlmebxxoox()).getPayload();
        String orderEditId = payload.getOrderEditId();
        return zoijcleaowVar.f83410eablkybsjg.iobyxmoadg((!payload.wflxmlrfwp() || orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? dz0.btonecajqb.iobyxmoadg.zoijcleaow.f29973iobyxmoadg : new dz0.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId));
    }

    private final void V(boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(z13, null), 3, null);
    }

    static /* synthetic */ void W(zoijcleaow zoijcleaowVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        zoijcleaowVar.V(z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    public final void Y() {
        mz0.ppxfxbqfkf sortType;
        List childCatalogSections;
        Object next;
        State state = (State) jlmebxxoox();
        o0(this, AnalyticsPage.ProductSort.f92358iwizpuwonk, null, null, 6, null);
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
        List listWkgbmnqykc = mz0.wkgbmnqykc.wkgbmnqykc(mz0.ppxfxbqfkf.f68192yggfygwlhe, sortType);
        mz0.ppxfxbqfkf selectedSort = state.getSelectedSort();
        ProductListData productListData = state.getProductListData();
        crxdokpmqz(new rp0.gxszxtbevo.iwizpuwonk(selectedSort, listWkgbmnqykc, productListData != null ? productListData.getColorsModel() : null));
    }

    public static final /* synthetic */ State c(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(String str) {
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
        crxdokpmqz(new rp0.gxszxtbevo.ojitshcjhn(comboSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(boolean z13) {
        ulzqkzuiru(new rp0.lqeggnwhkg.draadjrbmk(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        C1877zoijcleaow c1877zoijcleaow;
        Object objAgtfadlqog;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C1877zoijcleaow) {
            c1877zoijcleaow = (C1877zoijcleaow) gxszxtbevoVar;
            int i13 = c1877zoijcleaow.f83563iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1877zoijcleaow.f83563iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1877zoijcleaow = new C1877zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1877zoijcleaow = new C1877zoijcleaow(gxszxtbevoVar);
        }
        Object obj = c1877zoijcleaow.f83565yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1877zoijcleaow.f83563iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(true));
            cz0.iobyxmoadg iobyxmoadgVar = this.f83418iwizpuwonk;
            c1877zoijcleaow.f83566zdlpuopuiu = this;
            c1877zoijcleaow.f83563iwizpuwonk = 1;
            objAgtfadlqog = iobyxmoadgVar.agtfadlqog(comboSetProduct, comboSetProduct2, c1877zoijcleaow);
            if (objAgtfadlqog == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c1877zoijcleaow.f83566zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            objAgtfadlqog = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (gg.kcexrzcfyt.agtfadlqog(objAgtfadlqog)) {
            Warning warningZoijcleaow = ((kz0.iobyxmoadg) objAgtfadlqog).zoijcleaow();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warningZoijcleaow, Warning.Empty.f95255jyumaefscl)) {
                zoijcleaowVar.crxdokpmqz(rp0.gxszxtbevo.agtfadlqog.f83330iobyxmoadg);
            } else if ((warningZoijcleaow instanceof Warning.WithCodeAndMessage) || (warningZoijcleaow instanceof Warning.DailyLimit)) {
                zoijcleaowVar.crxdokpmqz(new rp0.gxszxtbevo.lereixgezr(warningZoijcleaow.getMessage()));
            } else if (!(warningZoijcleaow instanceof Warning.AvailableOnlyForPickup) && !(warningZoijcleaow instanceof Warning.Interval)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objAgtfadlqog);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.Q(thDxjokdxxww);
        }
        zoijcleaowVar.ppxfxbqfkf(null);
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(boolean z13) {
        ulzqkzuiru(new rp0.lqeggnwhkg.C1870lqeggnwhkg(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f83532iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f83532iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f83534yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f83532iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(true));
            String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            if (orderEditId == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            w01.iobyxmoadg.C2943iobyxmoadg c2943iobyxmoadg = new w01.iobyxmoadg.C2943iobyxmoadg(orderEditId, comboSetProduct, comboSetProduct2);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                w01.iobyxmoadg iobyxmoadgVar2 = this.f83420jyumaefscl;
                ppxfxbqfkfVar.f83535zdlpuopuiu = this;
                ppxfxbqfkfVar.f83532iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c2943iobyxmoadg, ppxfxbqfkfVar);
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
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f83535zdlpuopuiu;
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
                zoijcleaowVar.crxdokpmqz(rp0.gxszxtbevo.esjtqupxsv.f83339iobyxmoadg);
            } else if (warning instanceof Warning.DailyLimit) {
                zoijcleaowVar.crxdokpmqz(new rp0.gxszxtbevo.lereixgezr(((Warning.DailyLimit) warning).getMessage()));
            } else if (warning instanceof Warning.WithCodeAndMessage) {
                zoijcleaowVar.T(warning);
            } else if (!(warning instanceof Warning.AvailableOnlyForPickup) && !(warning instanceof Warning.Interval)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.Q(thDxjokdxxww);
        }
        zoijcleaowVar.ppxfxbqfkf(null);
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void f0(String str) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:91:0x0097 A[SYNTHETIC] */
    public final Object g(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
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
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f83548esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f83548esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f83549iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f83548esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ow1.esjtqupxsv esjtqupxsvVarWkgbmnqykc = wkgbmnqykc();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) esjtqupxsvVarWkgbmnqykc.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(rp0.gxszxtbevo.C1869gxszxtbevo.f83341iobyxmoadg);
                return wwaezpbzknVar;
            }
            State state = (State) jlmebxxoox();
            Product productIozdgvuglv = state.iozdgvuglv();
            if (productIozdgvuglv == null) {
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
                productIozdgvuglv = product;
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(productIozdgvuglv.getId(), str)) {
                    productIozdgvuglv = null;
                }
                if (productIozdgvuglv == null) {
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
                    productIozdgvuglv = product;
                }
            }
            Iterator it2 = state.getProductDataList().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next2).getId(), productIozdgvuglv.getId()));
            productUIData = (ProductUIData) next2;
            ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar2 = this.f83439zdlpuopuiu;
                wkgbmnqykcVar.f83552zdlpuopuiu = this;
                wkgbmnqykcVar.f83551yggfygwlhe = productIozdgvuglv;
                wkgbmnqykcVar.f83550jyumaefscl = productUIData;
                wkgbmnqykcVar.f83548esjtqupxsv = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
                product2 = productIozdgvuglv;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                product2 = productIozdgvuglv;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productUIData = (ProductUIData) wkgbmnqykcVar.f83550jyumaefscl;
            product2 = (Product) wkgbmnqykcVar.f83551yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f83552zdlpuopuiu;
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
            if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.mbcevpiqjq(product2.getMeasureTypeModel())) == null) {
                currentMeasure = product2.getMeasureTypeModel().getCurrentMeasure();
            }
            String article = product2.getArticle();
            if (productUIData != null) {
                Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(productUIData.getQuantity());
                Double d13 = dZoijcleaow.doubleValue() > 0.0d ? dZoijcleaow : null;
                if (d13 != null) {
                    basketDefault = d13.doubleValue();
                } else {
                    basketDefault = currentMeasure.getBasketDefault();
                }
            } else {
                basketDefault = currentMeasure.getBasketDefault();
            }
            zoijcleaowVar.crxdokpmqz(new rp0.gxszxtbevo.rgvfuqvkyq(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list)));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.Q(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.wkgbmnqykc(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(ProductListData productListData, int i13) {
        String textModal = productListData.getTextModal();
        if (textModal == null || this.f83428pkzmftpjix || i13 != 1) {
            return;
        }
        crxdokpmqz(new rp0.gxszxtbevo.oxmwwwfdhm(new sp0.iobyxmoadg(productListData.getHeaderModal(), textModal, productListData.getButtonModal())));
        this.f83428pkzmftpjix = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc;
        boolean z13 = !((State) jlmebxxoox()).getIsGridType();
        r01.gtknphoqwx.iobyxmoadg iobyxmoadgVar = new r01.gtknphoqwx.iobyxmoadg(z13);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            this.f83431rgvfuqvkyq.zoijcleaow(iobyxmoadgVar);
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            ulzqkzuiru(new rp0.lqeggnwhkg.eablkybsjg(z13));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            Q(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void h0() {
        this.f83413gxszxtbevo.ppxfxbqfkf(new ym0.lqeggnwhkg.iobyxmoadg(null, 1, null));
    }

    private final void i() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
    }

    private final void i0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(z(), new oxmwwwfdhm(null, this)), new kcexrzcfyt(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        Object next;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f83493cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f83493cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f83495jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f83493cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ow1.wflxmlrfwp wflxmlrfwpVar = this.f83437yggfygwlhe;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                gxszxtbevoVar2.f83497zdlpuopuiu = this;
                gxszxtbevoVar2.f83496yggfygwlhe = changeProductParams;
                gxszxtbevoVar2.f83493cqumvgiudr = 1;
                objZoijcleaow = wflxmlrfwpVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar2);
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
            changeProductParams = (ChangeProductParams) gxszxtbevoVar2.f83496yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar2.f83497zdlpuopuiu;
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
            zoijcleaowVar.istkbnxepw(changeProductParams, ((State) zoijcleaowVar.jlmebxxoox()).getPayload().wflxmlrfwp());
        } else {
            zoijcleaowVar.crxdokpmqz(new rp0.gxszxtbevo.kcexrzcfyt(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void j0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new zdlpuopuiu(this.f83404btonecajqb.nufgyqmvbu(), this), new yggfygwlhe(null)), new jyumaefscl(null)), sopmlzcsov());
    }

    private final void k0() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f83412gtknphoqwx.dxjokdxxww(), new iwizpuwonk(null)), new cqumvgiudr(null)), sopmlzcsov());
    }

    private final void l0(String str, boolean z13) {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(er0.lqeggnwhkg.iobyxmoadg(z(), new lereixgezr(this.f83429pmvmpeiblj.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)), new pmvmpeiblj(y().iobyxmoadg()), new zynmafqrjb(new esjtqupxsv(this.f83424lqeggnwhkg.zoijcleaow(str), z13))), new istkbnxepw(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(List list) {
        if (((State) jlmebxxoox()).getPayload().wflxmlrfwp() || !((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() || list.isEmpty()) {
            n(this);
            p(this);
            o(this);
            return;
        }
        if (list.contains(a01.ppxfxbqfkf.COMBO)) {
            A();
        } else {
            n(this);
        }
        if (list.contains(a01.ppxfxbqfkf.RECOMMENDATIONS)) {
            u();
        } else {
            p(this);
        }
        if (list.contains(a01.ppxfxbqfkf.PROMO_BANNER)) {
            r();
        } else {
            o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(int i13, pz0.iobyxmoadg iobyxmoadgVar) {
        State state = (State) jlmebxxoox();
        String brandId = state.getPayload().getBrandId();
        String strLqeggnwhkg = state.getSelectedSort().lqeggnwhkg();
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        String strValueOf = String.valueOf(i13);
        String str = this.f83414hcddaimhww;
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strName = deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.name() : null;
        List listWflxmlrfwp = this.f83415hkdspvbjdz;
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        }
        this.f83413gxszxtbevo.eablkybsjg(new ym0.lqeggnwhkg.iobyxmoadg(strWkgbmnqykc, strValueOf, str, strName, brandId, strLqeggnwhkg, listWflxmlrfwp.toString()));
    }

    private static final void n(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.zoijcleaow(hg.jyumaefscl.wflxmlrfwp()));
    }

    private final void n0(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        String strGtknphoqwx = ((State) jlmebxxoox()).gtknphoqwx();
        String str = this.f83414hcddaimhww;
        if (str == null) {
            str = "";
        }
        this.f83413gxszxtbevo.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.ProductList(strGtknphoqwx, str), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    private static final void o(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.dxjokdxxww(null));
    }

    static /* synthetic */ void o0(zoijcleaow zoijcleaowVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        zoijcleaowVar.n0(analyticsPage, analyticElement, analyticsLocation);
    }

    private static final void p(zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.ulzqkzuiru(new rp0.lqeggnwhkg.btonecajqb(null));
    }

    private final void q(String str, pz0.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(str, iobyxmoadgVar, this, null), 3, null);
    }

    private final void r() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(null), 3, null);
    }

    private final void s(int i13, boolean z13, boolean z14, boolean z15) {
        cr0.iobyxmoadg.iobyxmoadg(this.f83416iozdgvuglv);
        this.f83416iozdgvuglv = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(i13, z15, z13, z14, null), 3, null);
    }

    static /* synthetic */ void t(zoijcleaow zoijcleaowVar, int i13, boolean z13, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        if ((i14 & 4) != 0) {
            z14 = false;
        }
        if ((i14 & 8) != 0) {
            z15 = false;
        }
        zoijcleaowVar.s(i13, z13, z14, z15);
    }

    private final void u() {
        auzgnhcxok auzgnhcxokVar = this.f83435wwaezpbzkn;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f83435wwaezpbzkn = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(lg.gxszxtbevo gxszxtbevoVar) {
        ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
        mz0.iobyxmoadg flow = payload.getFlow();
        String orderEditId = payload.getOrderEditId();
        pz0.iobyxmoadg iobyxmoadgVarX = x();
        return this.f83432vdvldrhtss.zoijcleaow(new m01.gxszxtbevo.iobyxmoadg(flow, iobyxmoadgVarX != null ? iobyxmoadgVarX.ppxfxbqfkf() : null, orderEditId), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb y() {
        return (dz0.btonecajqb) this.f83406cllcsxoeiz.getValue();
    }

    public void Z(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f83405cdpycssgdh = iobyxmoadgVar;
    }

    public void a0(boolean z13) {
        this.f83430ppxfxbqfkf.eablkybsjg(z13);
    }

    public void b0(boolean z13) {
        this.f83430ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(params, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(rp0.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.zoijcleaow.f83400iobyxmoadg)) {
            this.f83414hcddaimhww = ((State) jlmebxxoox()).getPayload().getSectionId();
            this.f83419jpowsppfya = ((State) jlmebxxoox()).getPayload().getSelectionId();
            h0();
            ProductListPayload payload = ((State) jlmebxxoox()).getPayload();
            String orderEditId = payload.getOrderEditId();
            l0(orderEditId != null ? orderEditId : "", payload.wflxmlrfwp());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.iobyxmoadg.f83397iobyxmoadg)) {
            i();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.ppxfxbqfkf.f83398iobyxmoadg)) {
            if (((State) jlmebxxoox()).getPayload().wflxmlrfwp()) {
                return;
            }
            String str = this.f83414hcddaimhww;
            f0(str != null ? str : "");
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.eablkybsjg.f83395iobyxmoadg)) {
            j0();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.gxszxtbevo.f83396iobyxmoadg)) {
            k0();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, rp0.wkgbmnqykc.C1871wkgbmnqykc.f83399iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i0();
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(rp0.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(intent, this, null), 3, null);
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f83436yadqdtsiqt = iobyxmoadgVar;
    }

    public tg.iobyxmoadg v() {
        return this.f83436yadqdtsiqt;
    }

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f83434wkgbmnqykc;
    }

    public pz0.iobyxmoadg x() {
        return this.f83405cdpycssgdh;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        crxdokpmqz(rp0.gxszxtbevo.jyumaefscl.f83349iobyxmoadg);
    }

    public sj.lqeggnwhkg z() {
        return this.f83430ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        crxdokpmqz(rp0.gxszxtbevo.C1869gxszxtbevo.f83341iobyxmoadg);
    }
}
