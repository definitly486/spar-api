package ru.myspar.catalog.impl.search;

import androidx.lifecycle.ulzqkzuiru;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import j0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.core.domain.models.product.SearchFeatureModel;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.domain.feature.filters.store.FiltersArgs;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class zdlpuopuiu extends vx.eablkybsjg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final or.iobyxmoadg f85483agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final c20.eablkybsjg f85484btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final qm.iobyxmoadg f85485cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final gg.gtknphoqwx f85486cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final z10.gxszxtbevo f85487cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private tg.iobyxmoadg f85488crxdokpmqz;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final pb0.ppxfxbqfkf f85489draadjrbmk;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private auzgnhcxok f85490dsvhmnatus;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final h20.wflxmlrfwp f85491dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final SearchPayload f85492esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final c20.dxjokdxxww f85493gtknphoqwx;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f85494hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final z10.iobyxmoadg f85495hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final yy1.iobyxmoadg f85496iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final qr.iobyxmoadg f85497istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final h20.agtfadlqog f85498iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private y00.iobyxmoadg f85499jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final j00.zoijcleaow f85500jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final h20.btonecajqb f85501jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final a20.zoijcleaow f85502kcexrzcfyt;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f85503kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final u10.iobyxmoadg f85504lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final d60.iobyxmoadg f85505lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f85506lqeggnwhkg;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final sj.pmvmpeiblj f85507mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private String f85508ntlheqmsrt;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final oa0.ppxfxbqfkf f85509nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final oa0.wflxmlrfwp f85510ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final a20.iobyxmoadg f85511oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final lo.zoijcleaow f85512pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final l00.gtknphoqwx f85513pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final oa0.ojitshcjhn f85514rgvfuqvkyq;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private List f85515ribwqtqdhb;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private boolean f85516sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private boolean f85517stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f85518tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private zoijcleaow f85519ulzqkzuiru;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final oa0.kcexrzcfyt f85520vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final or.zoijcleaow f85521wflxmlrfwp;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final ro.iobyxmoadg f85522wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f85523wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final sm.iobyxmoadg f85524yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final w10.vdvldrhtss f85525yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final lq.iobyxmoadg f85526ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final f20.btonecajqb f85527zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final z10.nufgyqmvbu f85528zynmafqrjb;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    public static final iobyxmoadg f85482vipkmwdibw = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    public static final int f85481jhduphickx = 8;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f85530jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85531yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85532zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new agtfadlqog(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x007d  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            q30.iobyxmoadg iobyxmoadgVar;
            q30.iobyxmoadg iobyxmoadgVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85530jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (q30.iobyxmoadg) this.f85531yggfygwlhe;
                        obj2 = this.f85532zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                w10.vdvldrhtss vdvldrhtssVar = zdlpuopuiuVar.f85525yggfygwlhe;
                this.f85530jyumaefscl = 1;
                obj = vdvldrhtssVar.iobyxmoadg(this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            zdlpuopuiu zdlpuopuiuVar2 = zdlpuopuiu.this;
            iobyxmoadgVar = q30.iobyxmoadg.f77790iobyxmoadg;
            if (gg.kcexrzcfyt.agtfadlqog(obj2) && !((Boolean) obj2).booleanValue()) {
                this.f85532zdlpuopuiu = obj2;
                this.f85531yggfygwlhe = iobyxmoadgVar;
                this.f85530jyumaefscl = 2;
                if (zdlpuopuiuVar2.B(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ru.myspar.catalog.impl.search.agtfadlqog.zoijcleaow f85533jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85535zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(ru.myspar.catalog.impl.search.agtfadlqog.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85533jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new btonecajqb(this.f85533jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85535zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu.this.f85511oxmwwwfdhm.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(true));
                zdlpuopuiu.this.f85516sopmlzcsov = true;
                zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                ProductListData productListDataZoijcleaow = this.f85533jyumaefscl.zoijcleaow();
                zoijcleaow zoijcleaowVarIobyxmoadg = this.f85533jyumaefscl.iobyxmoadg();
                this.f85535zdlpuopuiu = 1;
                if (zdlpuopuiuVar.y(productListDataZoijcleaow, zoijcleaowVarIobyxmoadg, this) == objGxszxtbevo) {
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
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85537zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f85538jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f85539yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f85540zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((List) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f85540zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((List) this.f85539yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f85538jyumaefscl));
            }

            public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar.f85539yggfygwlhe = list;
                iobyxmoadgVar.f85538jyumaefscl = z13;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f85541zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f85542zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.zdlpuopuiu$cqumvgiudr$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C1947iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f85544yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f85545zdlpuopuiu;

                    public C1947iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f85545zdlpuopuiu = obj;
                        this.f85544yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f85542zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C1947iobyxmoadg c1947iobyxmoadg;
                    if (gxszxtbevoVar instanceof C1947iobyxmoadg) {
                        c1947iobyxmoadg = (C1947iobyxmoadg) gxszxtbevoVar;
                        int i13 = c1947iobyxmoadg.f85544yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c1947iobyxmoadg.f85544yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c1947iobyxmoadg = new C1947iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c1947iobyxmoadg = new C1947iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c1947iobyxmoadg.f85545zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c1947iobyxmoadg.f85544yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f85542zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c1947iobyxmoadg.f85544yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c1947iobyxmoadg) == objGxszxtbevo) {
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

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f85541zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f85541zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85546zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                int f85547iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f85549yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f85550zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85549yggfygwlhe = obj;
                    this.f85547iwizpuwonk |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
                this.f85546zdlpuopuiu = zdlpuopuiuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar;
                zoijcleaow zoijcleaowVar;
                Object value;
                ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
                if (gxszxtbevoVar instanceof iobyxmoadg) {
                    iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                    int i13 = iobyxmoadgVar.f85547iwizpuwonk;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f85547iwizpuwonk = i13 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object objZoijcleaow = iobyxmoadgVar.f85549yggfygwlhe;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = iobyxmoadgVar.f85547iwizpuwonk;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    List list = (List) vdvldrhtssVar.iobyxmoadg();
                    this.f85546zdlpuopuiu.f85515ribwqtqdhb = list;
                    qr.iobyxmoadg iobyxmoadgVar2 = this.f85546zdlpuopuiu.f85497istkbnxepw;
                    List listLqeggnwhkg = this.f85546zdlpuopuiu.fmlbqenlif().lqeggnwhkg();
                    iobyxmoadgVar.f85550zdlpuopuiu = this;
                    iobyxmoadgVar.f85547iwizpuwonk = 1;
                    objZoijcleaow = iobyxmoadgVar2.invoke(listLqeggnwhkg, list, iobyxmoadgVar);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f85550zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                }
                List list2 = (List) objZoijcleaow;
                sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = zoijcleaowVar.f85546zdlpuopuiu.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : list2, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new cqumvgiudr(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85537zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(zdlpuopuiu.this.mhtqkkgtqm().iobyxmoadg(), zdlpuopuiu.this.ixidwrxhsl(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(zdlpuopuiu.this);
                this.f85537zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((cqumvgiudr) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f85551cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f85552iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f85553jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85554yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85555zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(String str, zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85552iwizpuwonk = str;
            this.f85551cqumvgiudr = zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new draadjrbmk(this.f85552iwizpuwonk, this.f85551cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            q30.iobyxmoadg iobyxmoadgVar;
            q30.iobyxmoadg iobyxmoadgVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85553jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar2 = (q30.iobyxmoadg) this.f85554yggfygwlhe;
                        obj2 = this.f85555zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    iobyxmoadgVar = iobyxmoadgVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                r10.iobyxmoadg iobyxmoadgVar3 = new r10.iobyxmoadg(this.f85552iwizpuwonk);
                zdlpuopuiu zdlpuopuiuVar = this.f85551cqumvgiudr;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                w10.vdvldrhtss vdvldrhtssVar = zdlpuopuiuVar.f85525yggfygwlhe;
                this.f85553jyumaefscl = 1;
                obj = vdvldrhtssVar.wkgbmnqykc(iobyxmoadgVar3, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            zdlpuopuiu zdlpuopuiuVar2 = this.f85551cqumvgiudr;
            iobyxmoadgVar = q30.iobyxmoadg.f77790iobyxmoadg;
            if (gg.kcexrzcfyt.agtfadlqog(obj2) && !((Boolean) obj2).booleanValue()) {
                this.f85555zdlpuopuiu = obj2;
                this.f85554yggfygwlhe = iobyxmoadgVar;
                this.f85553jyumaefscl = 2;
                if (zdlpuopuiuVar2.B(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar2 = iobyxmoadgVar;
                iobyxmoadgVar = iobyxmoadgVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85557zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85557zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = zdlpuopuiu.this.f85524yadqdtsiqt;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f85557zdlpuopuiu = 1;
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
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(zdlpuopuiu.this.f85485cdpycssgdh.ppxfxbqfkf(new rm.wkgbmnqykc.zoijcleaow(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow())));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f85559yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85560zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85561jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f85562yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f85563zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85561jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f85561jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zdlpuopuiu zdlpuopuiuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85562yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zdlpuopuiu zdlpuopuiuVar2 = this.f85561jyumaefscl;
                    oa0.wflxmlrfwp wflxmlrfwpVar = zdlpuopuiuVar2.f85510ojitshcjhn;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f85563zdlpuopuiu = zdlpuopuiuVar2;
                    this.f85562yggfygwlhe = 1;
                    Object objZoijcleaow = wflxmlrfwpVar.zoijcleaow(wwaezpbzknVar, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                    obj = objZoijcleaow;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiuVar = (zdlpuopuiu) this.f85563zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zdlpuopuiuVar.f85517stevsuqkhv = ((Boolean) obj).booleanValue();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85564jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f85565yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f85566zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85564jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new ppxfxbqfkf(this.f85564jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zdlpuopuiu zdlpuopuiuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85565yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zdlpuopuiu zdlpuopuiuVar2 = this.f85564jyumaefscl;
                    oa0.ojitshcjhn ojitshcjhnVar = zdlpuopuiuVar2.f85514rgvfuqvkyq;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f85566zdlpuopuiu = zdlpuopuiuVar2;
                    this.f85565yggfygwlhe = 1;
                    Object objZoijcleaow = ojitshcjhnVar.zoijcleaow(wwaezpbzknVar, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                    obj = objZoijcleaow;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiuVar = (zdlpuopuiu) this.f85566zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zdlpuopuiuVar.f85503kegysxyocb = ((Boolean) obj).booleanValue();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85567jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f85568yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f85569zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85567jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new wkgbmnqykc(this.f85567jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zdlpuopuiu zdlpuopuiuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85568yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zdlpuopuiu zdlpuopuiuVar2 = this.f85567jyumaefscl;
                    oa0.kcexrzcfyt kcexrzcfytVar = zdlpuopuiuVar2.f85520vdvldrhtss;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f85569zdlpuopuiu = zdlpuopuiuVar2;
                    this.f85568yggfygwlhe = 1;
                    Object objZoijcleaow = kcexrzcfytVar.zoijcleaow(wwaezpbzknVar, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                    obj = objZoijcleaow;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiuVar = (zdlpuopuiu) this.f85569zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zdlpuopuiuVar.f85518tzroggbefp = ((Boolean) obj).booleanValue();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85570jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f85571yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            Object f85572zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85570jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f85570jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zdlpuopuiu zdlpuopuiuVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85571yggfygwlhe;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zdlpuopuiu zdlpuopuiuVar2 = this.f85570jyumaefscl;
                    oa0.ppxfxbqfkf ppxfxbqfkfVar = zdlpuopuiuVar2.f85509nufgyqmvbu;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    this.f85572zdlpuopuiu = zdlpuopuiuVar2;
                    this.f85571yggfygwlhe = 1;
                    Object objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                    obj = objZoijcleaow;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiuVar = (zdlpuopuiu) this.f85572zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                zdlpuopuiuVar.f85523wypolnanlu = ((Boolean) obj).booleanValue();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = zdlpuopuiu.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f85559yggfygwlhe = obj;
            return eablkybsjgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85560zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f85559yggfygwlhe;
                auzgnhcxok[] auzgnhcxokVarArr = {pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new ppxfxbqfkf(zdlpuopuiu.this, null), 3, null), pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new iobyxmoadg(zdlpuopuiu.this, null), 3, null), pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new zoijcleaow(zdlpuopuiu.this, null), 3, null), pj.gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new wkgbmnqykc(zdlpuopuiu.this, null), 3, null)};
                this.f85560zdlpuopuiu = 1;
                if (pj.gxszxtbevo.zoijcleaow(auzgnhcxokVarArr, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85574zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85575zdlpuopuiu;

            iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
                this.f85575zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                    this.f85575zdlpuopuiu.zdlpuopuiu(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f85575zdlpuopuiu.z(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new esjtqupxsv(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85574zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = zdlpuopuiu.this.mhtqkkgtqm().zoijcleaow();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(zdlpuopuiu.this);
                this.f85574zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((esjtqupxsv) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f85577yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85578zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            int i13;
            Object value;
            ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f85577yggfygwlhe;
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                boolean zDraadjrbmk = zdlpuopuiu.this.fmlbqenlif().draadjrbmk();
                int i15 = !zDraadjrbmk ? 1 : 0;
                zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    h20.agtfadlqog agtfadlqogVar = zdlpuopuiuVar.f85498iwizpuwonk;
                    h20.agtfadlqog.iobyxmoadg iobyxmoadgVar2 = new h20.agtfadlqog.iobyxmoadg(!zDraadjrbmk);
                    this.f85578zdlpuopuiu = i15;
                    this.f85577yggfygwlhe = 1;
                    if (agtfadlqogVar.zoijcleaow(iobyxmoadgVar2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    i13 = i15;
                } catch (Throwable th2) {
                    th = th2;
                    i13 = i15;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f85578zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (Throwable th3) {
                    th = th3;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            }
            gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = zdlpuopuiu.this.ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn.getValue();
                rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : i13 != 0, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f85579iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85581yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85582zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f85581yggfygwlhe = obj;
            this.f85579iwizpuwonk |= Integer.MIN_VALUE;
            return zdlpuopuiu.this.fiwbwshyhd(this);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85583yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85584zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85584zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f85583yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f85583yggfygwlhe = th2;
            return iwizpuwonkVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85586yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85587zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            jyumaefscl jyumaefsclVar = zdlpuopuiu.this.new jyumaefscl(gxszxtbevoVar);
            jyumaefsclVar.f85586yggfygwlhe = obj;
            return jyumaefsclVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85587zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f85586yggfygwlhe;
            zdlpuopuiu.this.wizcaqwiak(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class kcexrzcfyt implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85588zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85589zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.zdlpuopuiu$kcexrzcfyt$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1948iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85591yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85592zdlpuopuiu;

                public C1948iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85592zdlpuopuiu = obj;
                    this.f85591yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f85589zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1948iobyxmoadg c1948iobyxmoadg;
                if (gxszxtbevoVar instanceof C1948iobyxmoadg) {
                    c1948iobyxmoadg = (C1948iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1948iobyxmoadg.f85591yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1948iobyxmoadg.f85591yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1948iobyxmoadg = new C1948iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1948iobyxmoadg = new C1948iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1948iobyxmoadg.f85592zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1948iobyxmoadg.f85591yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85589zdlpuopuiu;
                    List listIobyxmoadg = ((u10.iobyxmoadg.C2774iobyxmoadg) obj).iobyxmoadg();
                    if (listIobyxmoadg != null) {
                        c1948iobyxmoadg.f85591yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(listIobyxmoadg, c1948iobyxmoadg) == objGxszxtbevo) {
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

        public kcexrzcfyt(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f85588zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85588zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85594zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85595jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f85596yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f85597zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f85595jyumaefscl = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f85597zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f85595jyumaefscl.zdlpuopuiu((Throwable) this.f85596yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f85595jyumaefscl, gxszxtbevoVar);
                iobyxmoadgVar.f85596yggfygwlhe = th2;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85598zdlpuopuiu;

            zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
                this.f85598zdlpuopuiu = zdlpuopuiuVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(Double d13, lg.gxszxtbevo gxszxtbevoVar) {
                this.f85598zdlpuopuiu.yggfygwlhe(ru.myspar.catalog.impl.search.vdvldrhtss.wkgbmnqykc.f85474iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new lereixgezr(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85594zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                f20.btonecajqb btonecajqbVar = zdlpuopuiu.this.f85527zdlpuopuiu;
                String orderEditId = zdlpuopuiu.this.f85492esjtqupxsv.getOrderEditId();
                if (orderEditId == null) {
                    orderEditId = "";
                }
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(btonecajqbVar.zoijcleaow(orderEditId), new iobyxmoadg(zdlpuopuiu.this, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(zdlpuopuiu.this);
                this.f85594zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((lereixgezr) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f85599cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f85601jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85602yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85603zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85599cqumvgiudr = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new lqeggnwhkg(this.f85599cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            zdlpuopuiu zdlpuopuiuVar;
            zoijcleaow zoijcleaowVar;
            Object obj2;
            zdlpuopuiu zdlpuopuiuVar2;
            Throwable thDxjokdxxww;
            Object objZoijcleaow;
            Object objZoijcleaow2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85601jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow = obj;
                    } else {
                        if (i13 == 2) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            objZoijcleaow2 = obj;
                            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
                            zdlpuopuiuVar = zdlpuopuiu.this;
                            zoijcleaowVar = this.f85599cqumvgiudr;
                            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                                this.f85603zdlpuopuiu = objWkgbmnqykc;
                                this.f85602yggfygwlhe = zdlpuopuiuVar;
                                this.f85601jyumaefscl = 3;
                                if (zdlpuopuiuVar.y((ProductListData) objWkgbmnqykc, zoijcleaowVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                obj2 = objWkgbmnqykc;
                                zdlpuopuiuVar2 = zdlpuopuiuVar;
                            }
                            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                            if (thDxjokdxxww != null && !(thDxjokdxxww instanceof CancellationException)) {
                                zdlpuopuiuVar.zdlpuopuiu(thDxjokdxxww);
                            }
                            zdlpuopuiu.this.M(this.f85599cqumvgiudr.gxszxtbevo());
                            zdlpuopuiu.this.f85512pkzmftpjix.zoijcleaow(new oo.nufgyqmvbu.zoijcleaow(null, 1, null));
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiuVar2 = (zdlpuopuiu) this.f85602yggfygwlhe;
                        obj2 = this.f85603zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    zdlpuopuiuVar = zdlpuopuiuVar2;
                    objWkgbmnqykc = obj2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        zdlpuopuiuVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    zdlpuopuiu.this.M(this.f85599cqumvgiudr.gxszxtbevo());
                    zdlpuopuiu.this.f85512pkzmftpjix.zoijcleaow(new oo.nufgyqmvbu.zoijcleaow(null, 1, null));
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu.this.L(this.f85599cqumvgiudr.gxszxtbevo());
                z10.iobyxmoadg iobyxmoadgVar = zdlpuopuiu.this.f85495hkdspvbjdz;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f85601jyumaefscl = 1;
                objZoijcleaow = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) objZoijcleaow;
                String strPpxfxbqfkf = this.f85599cqumvgiudr.ppxfxbqfkf();
                if (strPpxfxbqfkf == null) {
                    strPpxfxbqfkf = "";
                }
                String str = strPpxfxbqfkf;
                DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
                String strWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
                String strNufgyqmvbu = this.f85599cqumvgiudr.nufgyqmvbu();
                int iGxszxtbevo = this.f85599cqumvgiudr.gxszxtbevo();
                v00.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = this.f85599cqumvgiudr.dxjokdxxww();
                h20.wflxmlrfwp.iobyxmoadg iobyxmoadgVar3 = new h20.wflxmlrfwp.iobyxmoadg(strWkgbmnqykc, deliveryCodePpxfxbqfkf, str, null, strNufgyqmvbu, kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iGxszxtbevo), ppxfxbqfkfVarDxjokdxxww != null ? ppxfxbqfkfVarDxjokdxxww.lqeggnwhkg() : null, this.f85599cqumvgiudr.wkgbmnqykc(), null, null, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f85599cqumvgiudr.eablkybsjg()), 776, null);
                zdlpuopuiu zdlpuopuiuVar3 = zdlpuopuiu.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                h20.wflxmlrfwp wflxmlrfwpVar = zdlpuopuiuVar3.f85491dxjokdxxww;
                this.f85601jyumaefscl = 2;
                objZoijcleaow2 = wflxmlrfwpVar.zoijcleaow(iobyxmoadgVar3, this);
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            zdlpuopuiuVar = zdlpuopuiu.this;
            zoijcleaowVar = this.f85599cqumvgiudr;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                this.f85603zdlpuopuiu = objWkgbmnqykc;
                this.f85602yggfygwlhe = zdlpuopuiuVar;
                this.f85601jyumaefscl = 3;
                if (zdlpuopuiuVar.y((ProductListData) objWkgbmnqykc, zoijcleaowVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                zdlpuopuiuVar2 = zdlpuopuiuVar;
                zdlpuopuiuVar = zdlpuopuiuVar2;
                objWkgbmnqykc = obj2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zdlpuopuiuVar.zdlpuopuiu(thDxjokdxxww);
            }
            zdlpuopuiu.this.M(this.f85599cqumvgiudr.gxszxtbevo());
            zdlpuopuiu.this.f85512pkzmftpjix.zoijcleaow(new oo.nufgyqmvbu.zoijcleaow(null, 1, null));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f85604cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f85605esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f85606iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f85607jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f85608lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        int f85609pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85610yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85611zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f85613iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f85614jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f85615yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f85616zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn((gg.vdvldrhtss) obj, (y00.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f85616zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return new ru.myspar.catalog.impl.search.ojitshcjhn((gg.vdvldrhtss) this.f85615yggfygwlhe, (y00.iobyxmoadg) this.f85614jyumaefscl, this.f85613iwizpuwonk);
            }

            public final Object ojitshcjhn(gg.vdvldrhtss vdvldrhtssVar, y00.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f85615yggfygwlhe = vdvldrhtssVar;
                iobyxmoadgVar2.f85614jyumaefscl = iobyxmoadgVar;
                iobyxmoadgVar2.f85613iwizpuwonk = z13;
                return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f85617zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f85618zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.zdlpuopuiu$nufgyqmvbu$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C1949iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f85620yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f85621zdlpuopuiu;

                    public C1949iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f85621zdlpuopuiu = obj;
                        this.f85620yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f85618zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C1949iobyxmoadg c1949iobyxmoadg;
                    if (gxszxtbevoVar instanceof C1949iobyxmoadg) {
                        c1949iobyxmoadg = (C1949iobyxmoadg) gxszxtbevoVar;
                        int i13 = c1949iobyxmoadg.f85620yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c1949iobyxmoadg.f85620yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c1949iobyxmoadg = new C1949iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c1949iobyxmoadg = new C1949iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c1949iobyxmoadg.f85621zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c1949iobyxmoadg.f85620yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f85618zdlpuopuiu;
                        if (((ru.myspar.catalog.impl.search.ojitshcjhn) obj).ppxfxbqfkf()) {
                            c1949iobyxmoadg.f85620yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c1949iobyxmoadg) == objGxszxtbevo) {
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

            public ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f85617zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f85617zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85622yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f85623zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
                int f85625esjtqupxsv;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                /* synthetic */ Object f85626iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                int f85627jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                Object f85628yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f85629zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85626iwizpuwonk = obj;
                    this.f85625esjtqupxsv |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(hkdspvbjdz hkdspvbjdzVar, zdlpuopuiu zdlpuopuiuVar) {
                this.f85623zdlpuopuiu = hkdspvbjdzVar;
                this.f85622yggfygwlhe = zdlpuopuiuVar;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x008a  */
            /* JADX WARN: Code duplicated, block: B:31:0x0097  */
            /* JADX WARN: Code duplicated, block: B:32:0x009b  */
            /* JADX WARN: Code duplicated, block: B:34:0x009e  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(ru.myspar.catalog.impl.search.ojitshcjhn ojitshcjhnVar, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar;
                y00.iobyxmoadg iobyxmoadgVarZoijcleaow;
                int i13;
                zoijcleaow zoijcleaowVar;
                y00.iobyxmoadg iobyxmoadgVar2;
                int i14;
                tg.iobyxmoadg iobyxmoadgVarIpoelvxyzq;
                if (gxszxtbevoVar instanceof iobyxmoadg) {
                    iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                    int i15 = iobyxmoadgVar.f85625esjtqupxsv;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f85625esjtqupxsv = i15 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object obj = iobyxmoadgVar.f85626iwizpuwonk;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i16 = iobyxmoadgVar.f85625esjtqupxsv;
                int i17 = 1;
                if (i16 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = ojitshcjhnVar.iobyxmoadg();
                    iobyxmoadgVarZoijcleaow = ojitshcjhnVar.zoijcleaow();
                    Object obj2 = this.f85623zdlpuopuiu.f60015zdlpuopuiu;
                    i13 = 0;
                    if (obj2 != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, obj2)) {
                        this.f85622yggfygwlhe.f85516sopmlzcsov = false;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(vdvldrhtssVarIobyxmoadg, this.f85623zdlpuopuiu.f60015zdlpuopuiu)) {
                        zoijcleaowVar = this;
                    } else {
                        this.f85623zdlpuopuiu.f60015zdlpuopuiu = vdvldrhtssVarIobyxmoadg;
                        zdlpuopuiu zdlpuopuiuVar = this.f85622yggfygwlhe;
                        iobyxmoadgVar.f85629zdlpuopuiu = this;
                        iobyxmoadgVar.f85628yggfygwlhe = iobyxmoadgVarZoijcleaow;
                        iobyxmoadgVar.f85627jyumaefscl = 1;
                        iobyxmoadgVar.f85625esjtqupxsv = 1;
                        if (zdlpuopuiuVar.B(iobyxmoadgVar) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                        zoijcleaowVar = this;
                        iobyxmoadgVar2 = iobyxmoadgVarZoijcleaow;
                        i14 = 1;
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.f85622yggfygwlhe.kcexrzcfyt(), iobyxmoadgVarZoijcleaow)) {
                        i17 = i13;
                    } else {
                        zoijcleaowVar.f85622yggfygwlhe.J(iobyxmoadgVarZoijcleaow);
                        iobyxmoadgVarIpoelvxyzq = zoijcleaowVar.f85622yggfygwlhe.ipoelvxyzq();
                        if (iobyxmoadgVarIpoelvxyzq != null) {
                            iobyxmoadgVarIpoelvxyzq.invoke();
                        }
                    }
                    if (i17 != 0) {
                        zdlpuopuiu zdlpuopuiuVar2 = zoijcleaowVar.f85622yggfygwlhe;
                        zdlpuopuiuVar2.F(((ru.myspar.catalog.impl.search.rgvfuqvkyq) zdlpuopuiuVar2.gtknphoqwx()).eablkybsjg());
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = iobyxmoadgVar.f85627jyumaefscl;
                iobyxmoadgVar2 = (y00.iobyxmoadg) iobyxmoadgVar.f85628yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f85629zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                i13 = i14;
                iobyxmoadgVarZoijcleaow = iobyxmoadgVar2;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.f85622yggfygwlhe.kcexrzcfyt(), iobyxmoadgVarZoijcleaow)) {
                    zoijcleaowVar.f85622yggfygwlhe.J(iobyxmoadgVarZoijcleaow);
                    iobyxmoadgVarIpoelvxyzq = zoijcleaowVar.f85622yggfygwlhe.ipoelvxyzq();
                    if (iobyxmoadgVarIpoelvxyzq != null) {
                        iobyxmoadgVarIpoelvxyzq.invoke();
                    }
                } else {
                    i17 = i13;
                }
                if (i17 != 0) {
                    zdlpuopuiu zdlpuopuiuVar3 = zoijcleaowVar.f85622yggfygwlhe;
                    zdlpuopuiuVar3.F(((ru.myspar.catalog.impl.search.rgvfuqvkyq) zdlpuopuiuVar3.gtknphoqwx()).eablkybsjg());
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0086 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0087  */
        /* JADX WARN: Code duplicated, block: B:21:0x0091  */
        /* JADX WARN: Code duplicated, block: B:22:0x0093  */
        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        /* JADX WARN: Code duplicated, block: B:25:0x0098  */
        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009e  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:33:0x010e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x0112  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:20:0x008f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.myspar.catalog.impl.search.zdlpuopuiu.nufgyqmvbu.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tzroggbefp f85630jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85632zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(tzroggbefp tzroggbefpVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85630jyumaefscl = tzroggbefpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new ojitshcjhn(this.f85630jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85632zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.pmvmpeiblj pmvmpeibljVar = zdlpuopuiu.this.f85507mbcevpiqjq;
                String strDraadjrbmk = this.f85630jyumaefscl.draadjrbmk();
                this.f85632zdlpuopuiu = 1;
                if (pmvmpeibljVar.emit(strDraadjrbmk, this) == objGxszxtbevo) {
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
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f85633jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85635zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85633jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new oxmwwwfdhm(this.f85633jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85635zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarMhtqkkgtqm = zdlpuopuiu.this.mhtqkkgtqm();
                ChangeProductParams changeProductParams = this.f85633jyumaefscl;
                this.f85635zdlpuopuiu = 1;
                if (btonecajqbVarMhtqkkgtqm.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
        final /* synthetic */ sj.lqeggnwhkg f85636zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85637zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.zdlpuopuiu$pmvmpeiblj$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1950iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85639yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85640zdlpuopuiu;

                public C1950iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85640zdlpuopuiu = obj;
                    this.f85639yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f85637zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1950iobyxmoadg c1950iobyxmoadg;
                if (gxszxtbevoVar instanceof C1950iobyxmoadg) {
                    c1950iobyxmoadg = (C1950iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1950iobyxmoadg.f85639yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1950iobyxmoadg.f85639yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1950iobyxmoadg = new C1950iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1950iobyxmoadg = new C1950iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1950iobyxmoadg.f85640zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1950iobyxmoadg.f85639yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85637zdlpuopuiu;
                    String string = mj.kcexrzcfyt.p((String) obj).toString();
                    c1950iobyxmoadg.f85639yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(string, c1950iobyxmoadg) == objGxszxtbevo) {
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
            this.f85636zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85636zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f85641jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85641jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new ppxfxbqfkf(this.f85641jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85643zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                    String str = this.f85641jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w10.vdvldrhtss vdvldrhtssVar = zdlpuopuiuVar.f85525yggfygwlhe;
                    r10.iobyxmoadg iobyxmoadgVar2 = new r10.iobyxmoadg(str);
                    this.f85643zdlpuopuiu = 1;
                    obj = vdvldrhtssVar.ppxfxbqfkf(iobyxmoadgVar2, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) obj).booleanValue()));
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            q30.iobyxmoadg iobyxmoadgVar4 = q30.iobyxmoadg.f77790iobyxmoadg;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f85644cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f85645esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f85646iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f85647jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        /* synthetic */ Object f85648lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85650yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85651zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f85652zynmafqrjb;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f85648lereixgezr = obj;
            this.f85652zynmafqrjb |= Integer.MIN_VALUE;
            return zdlpuopuiu.this.y(null, null, this);
        }
    }

    /* synthetic */ class vdvldrhtss extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        vdvldrhtss(Object obj) {
            super(2, obj, d60.iobyxmoadg.class, "getStringWithArrayArgs", "getStringWithArrayArgs(I[Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return iobyxmoadg(((Number) obj).intValue(), (Object[]) obj2);
        }

        public final String iobyxmoadg(int i13, Object[] objArr) {
            return ((d60.iobyxmoadg) this.receiver).eablkybsjg(i13, objArr);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zdlpuopuiu f85653jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f85654yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85655zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(ProductUiModel productUiModel, zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85654yggfygwlhe = productUiModel;
            this.f85653jyumaefscl = zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wflxmlrfwp(this.f85654yggfygwlhe, this.f85653jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85655zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = new no.zoijcleaow.C1522zoijcleaow(AnalyticsPage.Search.f84345iwizpuwonk, null, new AnalyticElement.ProductItemElement(this.f85654yggfygwlhe.getArticle(), this.f85654yggfygwlhe.getName()));
                j00.zoijcleaow zoijcleaowVar = this.f85653jyumaefscl.f85500jpowsppfya;
                String id2 = this.f85654yggfygwlhe.getId();
                boolean isFavorite = this.f85654yggfygwlhe.getIsFavorite();
                this.f85655zdlpuopuiu = 1;
                if (zoijcleaowVar.lqeggnwhkg(id2, isFavorite, c1522zoijcleaow, this) == objGxszxtbevo) {
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
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f85656iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f85658yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85659zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f85660yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f85661zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85660yggfygwlhe = zdlpuopuiuVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f85660yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85661zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    this.f85661zdlpuopuiu = 1;
                    if (crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                this.f85660yggfygwlhe.yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.lqeggnwhkg(pm.dxjokdxxww.purchases_list_product_added_to_the_list));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85656iwizpuwonk = productUiModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void kcexrzcfyt(zdlpuopuiu zdlpuopuiuVar, Object obj) {
            if (zdlpuopuiuVar.f85494hcddaimhww.ppxfxbqfkf(obj)) {
                pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar.agtfadlqog(), null, null, new iobyxmoadg(zdlpuopuiuVar, null), 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.this.new wkgbmnqykc(this.f85656iwizpuwonk, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object next;
            ProductUIData productUIData;
            Throwable th2;
            Object objWkgbmnqykc;
            MeasureType currentMeasure;
            double basketDefault;
            MeasureType measureType;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85658yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu.this.K();
                List list = zdlpuopuiu.this.f85515ribwqtqdhb;
                ProductUiModel productUiModel = this.f85656iwizpuwonk;
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
                ProductUIData productUIData2 = (ProductUIData) next;
                zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    yy1.iobyxmoadg iobyxmoadgVar2 = zdlpuopuiuVar.f85496iozdgvuglv;
                    this.f85659zdlpuopuiu = productUIData2;
                    this.f85658yggfygwlhe = 1;
                    Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    productUIData = productUIData2;
                    obj = objZoijcleaow;
                } catch (Throwable th3) {
                    productUIData = productUIData2;
                    th2 = th3;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                productUIData = (ProductUIData) this.f85659zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } catch (Throwable th4) {
                    th2 = th4;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
            }
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
            ProductUiModel productUiModel2 = this.f85656iwizpuwonk;
            final zdlpuopuiu zdlpuopuiuVar2 = zdlpuopuiu.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                List list2 = (List) objWkgbmnqykc;
                if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.L(productUiModel2.getMeasureTypeModel())) == null) {
                    currentMeasure = productUiModel2.getMeasureTypeModel().getCurrentMeasure();
                }
                String article = productUiModel2.getArticle();
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
                zdlpuopuiuVar2.yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.ppxfxbqfkf(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list2)));
                d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(zdlpuopuiuVar2.f85494hcddaimhww.zoijcleaow(), new l9.draadjrbmk() { // from class: ru.myspar.catalog.impl.search.yggfygwlhe
                    @Override // l9.draadjrbmk
                    public final void iobyxmoadg(Object obj2) {
                        zdlpuopuiu.wkgbmnqykc.kcexrzcfyt(zdlpuopuiuVar2, obj2);
                    }
                });
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                zdlpuopuiuVar2.zdlpuopuiu(thDxjokdxxww);
            }
            zdlpuopuiu.this.yzdjzghtvl();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85662yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85663zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85663zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f85662yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f85662yggfygwlhe = th2;
            return yggfygwlheVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.zdlpuopuiu$zdlpuopuiu, reason: collision with other inner class name */
    /* synthetic */ class C1951zdlpuopuiu extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        C1951zdlpuopuiu(Object obj) {
            super(2, obj, zdlpuopuiu.class, "refreshProductsByFilters", "refreshProductsByFilters(Ljava/util/List;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.O((zdlpuopuiu) this.f60022zdlpuopuiu, list, gxszxtbevoVar);
        }
    }

    /* synthetic */ class zynmafqrjb extends kotlin.jvm.internal.iobyxmoadg implements tg.rgvfuqvkyq {
        zynmafqrjb(Object obj) {
            super(2, obj, zdlpuopuiu.class, "refreshProductsByQuery", "refreshProductsByQuery(Ljava/lang/String;)V", 4);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, lg.gxszxtbevo gxszxtbevoVar) {
            return zdlpuopuiu.U((zdlpuopuiu) this.f60022zdlpuopuiu, str, gxszxtbevoVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdlpuopuiu(oa0.ppxfxbqfkf getCatalogRatingEnableUseCase, h20.wflxmlrfwp getProductsUseCase, c20.eablkybsjg isLoggedInUseCase, c20.dxjokdxxww subscribeToLoggedInUseCase, pb0.ppxfxbqfkf productUiMapper, or.zoijcleaow searchCategoriesUiMapper, or.iobyxmoadg historyItemsUiMapper, oa0.wflxmlrfwp isPurchaseListsFeatureEnabledUseCase, oa0.ojitshcjhn isSearchSuggestionsFeatureEnabledUseCase, oa0.kcexrzcfyt isVivinoFeatureEnabledUseCase, a20.iobyxmoadg changeAdultCheckedUseCase, a20.zoijcleaow isAdultCheckedUseCase, f20.btonecajqb subscribeToOrderDeliveryPriceUseCase, w10.vdvldrhtss searchHistoryRepository, h20.btonecajqb getIsProductsGridUseCase, h20.agtfadlqog setIsProductsGridUseCase, z10.gxszxtbevo getOrderDeliveryType, SearchPayload payload, u10.iobyxmoadg changeCatalogFiltersObserver, l00.gtknphoqwx productChangesSourceProvider, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, qr.iobyxmoadg updateUiProductsByCartDataUseCase, qm.iobyxmoadg addressFeatureApi, sm.iobyxmoadg getUserAddressFlowInfo, yy1.iobyxmoadg purchasesListComponentApi, d60.iobyxmoadg resourcesManager, ro.iobyxmoadg authFeatureApi, lq.iobyxmoadg catalogFeatureApi, lo.zoijcleaow analyticsTracker, CreatePurchaseListsResultHelper resultHelper, j00.zoijcleaow changeFavoritesInteractor, z10.iobyxmoadg getCurrentDeliveryDataUseCase) {
        super(new ru.myspar.catalog.impl.search.rgvfuqvkyq(false, payload.getFlow() == v00.iobyxmoadg.ORDER_EDIT, null, payload.getSectionId(), null, null, false, v00.wkgbmnqykc.ppxfxbqfkf(payload.getSortType()), null, false, false, 1909, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogRatingEnableUseCase, "getCatalogRatingEnableUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToLoggedInUseCase, "subscribeToLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productUiMapper, "productUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchCategoriesUiMapper, "searchCategoriesUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(historyItemsUiMapper, "historyItemsUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isPurchaseListsFeatureEnabledUseCase, "isPurchaseListsFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isSearchSuggestionsFeatureEnabledUseCase, "isSearchSuggestionsFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isVivinoFeatureEnabledUseCase, "isVivinoFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchHistoryRepository, "searchHistoryRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getIsProductsGridUseCase, "getIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIsProductsGridUseCase, "setIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderDeliveryType, "getOrderDeliveryType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateUiProductsByCartDataUseCase, "updateUiProductsByCartDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addressFeatureApi, "addressFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f85506lqeggnwhkg = new sx.ppxfxbqfkf();
        this.f85509nufgyqmvbu = getCatalogRatingEnableUseCase;
        this.f85491dxjokdxxww = getProductsUseCase;
        this.f85484btonecajqb = isLoggedInUseCase;
        this.f85493gtknphoqwx = subscribeToLoggedInUseCase;
        this.f85489draadjrbmk = productUiMapper;
        this.f85521wflxmlrfwp = searchCategoriesUiMapper;
        this.f85483agtfadlqog = historyItemsUiMapper;
        this.f85510ojitshcjhn = isPurchaseListsFeatureEnabledUseCase;
        this.f85514rgvfuqvkyq = isSearchSuggestionsFeatureEnabledUseCase;
        this.f85520vdvldrhtss = isVivinoFeatureEnabledUseCase;
        this.f85511oxmwwwfdhm = changeAdultCheckedUseCase;
        this.f85502kcexrzcfyt = isAdultCheckedUseCase;
        this.f85527zdlpuopuiu = subscribeToOrderDeliveryPriceUseCase;
        this.f85525yggfygwlhe = searchHistoryRepository;
        this.f85501jyumaefscl = getIsProductsGridUseCase;
        this.f85498iwizpuwonk = setIsProductsGridUseCase;
        this.f85487cqumvgiudr = getOrderDeliveryType;
        this.f85492esjtqupxsv = payload;
        this.f85504lereixgezr = changeCatalogFiltersObserver;
        this.f85513pmvmpeiblj = productChangesSourceProvider;
        this.f85528zynmafqrjb = subscribeToCurrentDeliveryDataUseCase;
        this.f85497istkbnxepw = updateUiProductsByCartDataUseCase;
        this.f85485cdpycssgdh = addressFeatureApi;
        this.f85524yadqdtsiqt = getUserAddressFlowInfo;
        this.f85496iozdgvuglv = purchasesListComponentApi;
        this.f85505lmojexxdyd = resourcesManager;
        this.f85522wwaezpbzkn = authFeatureApi;
        this.f85526ylkuphrtab = catalogFeatureApi;
        this.f85512pkzmftpjix = analyticsTracker;
        this.f85494hcddaimhww = resultHelper;
        this.f85500jpowsppfya = changeFavoritesInteractor;
        this.f85495hkdspvbjdz = getCurrentDeliveryDataUseCase;
        this.f85486cllcsxoeiz = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.kcexrzcfyt
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return zdlpuopuiu.A(this.f85434zdlpuopuiu);
            }
        });
        this.f85507mbcevpiqjq = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
        this.f85519ulzqkzuiru = new zoijcleaow(null, null, null, null, 0, false, null, 127, null);
        this.f85516sopmlzcsov = ((Boolean) isAdultCheckedUseCase.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
        this.f85515ribwqtqdhb = hg.jyumaefscl.wflxmlrfwp();
        analyticsTracker.wkgbmnqykc(oo.nufgyqmvbu.iobyxmoadg.f73286gxszxtbevo);
        eslsurpljm();
        T();
        S();
        Q();
        P();
        R();
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb A(zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar.f85513pmvmpeiblj.iobyxmoadg(zdlpuopuiuVar.grlcpdaxtj(zdlpuopuiuVar.f85492esjtqupxsv));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(lg.gxszxtbevo gxszxtbevoVar) {
        if (mj.kcexrzcfyt.p(((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg()).toString().length() < 2 && this.f85503kegysxyocb) {
            c20.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (((Boolean) eablkybsjgVarEablkybsjg.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                Object objFiwbwshyhd = fiwbwshyhd(gxszxtbevoVar);
                return objFiwbwshyhd == mg.zoijcleaow.gxszxtbevo() ? objFiwbwshyhd : wwaezpbzknVar;
            }
        }
        List listJrbgnlbqoe = jrbgnlbqoe();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJrbgnlbqoe) {
            if (!(((pu.ppxfxbqfkf) obj) instanceof pr.eablkybsjg)) {
                arrayList.add(obj);
            }
        }
        a0(arrayList);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final zoijcleaow C(SearchCategoryUiModel searchCategoryUiModel) {
        String title = searchCategoryUiModel.getTitle();
        if (title != null) {
            igdgnonuha(title);
        }
        String id2 = searchCategoryUiModel.getId();
        if (id2 == null) {
            return null;
        }
        zoijcleaow zoijcleaowVar = new zoijcleaow(null, id2, null, null, 0, false, null, 93, null);
        ageimvtcrz(zoijcleaowVar);
        return zoijcleaowVar;
    }

    private final void D(List list) {
        ageimvtcrz(zoijcleaow.zoijcleaow(this.f85519ulzqkzuiru, null, null, list, null, 1, false, null, 75, null));
    }

    private final void E(String str) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : new tzroggbefp(str, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
        this.f85508ntlheqmsrt = ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg();
        ageimvtcrz(new zoijcleaow(str, null, null, null, 0, true, null, 94, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(String str) {
        if (fyldjkxazc(str)) {
            this.f85512pkzmftpjix.wkgbmnqykc(new oo.nufgyqmvbu.zoijcleaow(str));
            ageimvtcrz(new zoijcleaow(str, null, null, null, 0, this.f85503kegysxyocb, null, 94, null));
        }
    }

    private final void G(v00.ppxfxbqfkf ppxfxbqfkfVar) {
        ageimvtcrz(zoijcleaow.zoijcleaow(this.f85519ulzqkzuiru, null, null, null, ppxfxbqfkfVar, 1, false, null, 71, null));
    }

    private final void H(String str) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : new tzroggbefp(str, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
        this.f85508ntlheqmsrt = ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg();
        igdgnonuha(str);
        ageimvtcrz(new zoijcleaow(str, null, null, null, 0, false, null, 94, null));
    }

    private final void I() {
        String orderEditId = this.f85492esjtqupxsv.getOrderEditId();
        if (orderEditId != null) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(ru.myspar.legacy.presentation.screen.editorder.yggfygwlhe.zoijcleaow(new EditOrderPayload(orderEditId, false, 2, null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : true, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i13) {
        if (i13 == 1) {
            K();
            return;
        }
        List listJrbgnlbqoe = hg.jyumaefscl.jrbgnlbqoe(jrbgnlbqoe(), pu.iobyxmoadg.f77322zdlpuopuiu);
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        while (true) {
            Object value = zynmafqrjbVarOjitshcjhn.getValue();
            ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
            List list = listJrbgnlbqoe;
            if (zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : listJrbgnlbqoe, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false))) {
                return;
            } else {
                listJrbgnlbqoe = list;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i13) {
        if (i13 == 1) {
            yzdjzghtvl();
            return;
        }
        List listIpoelvxyzq = hg.jyumaefscl.ipoelvxyzq(jrbgnlbqoe(), pu.iobyxmoadg.f77322zdlpuopuiu);
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        while (true) {
            Object value = zynmafqrjbVarOjitshcjhn.getValue();
            ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
            List list = listIpoelvxyzq;
            if (zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : listIpoelvxyzq, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false))) {
                return;
            } else {
                listIpoelvxyzq = list;
            }
        }
    }

    private final void N() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new kcexrzcfyt(this.f85504lereixgezr.btonecajqb()), new C1951zdlpuopuiu(this)), new yggfygwlhe(null)), agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object O(zdlpuopuiu zdlpuopuiuVar, List list, lg.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiuVar.D(list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void P() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f85500jpowsppfya.dxjokdxxww(), new jyumaefscl(null)), new iwizpuwonk(null)), agtfadlqog());
    }

    private final void Q() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new cqumvgiudr(null), 3, null);
    }

    private final void R() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new esjtqupxsv(null), 3, null);
    }

    private final void S() {
        if (this.f85492esjtqupxsv.getFlow() == v00.iobyxmoadg.ORDER_EDIT) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lereixgezr(null), 3, null);
        }
    }

    private final void T() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new pmvmpeiblj(sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.ojitshcjhn(this.f85507mbcevpiqjq, 500L))), new zynmafqrjb(this)), agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object U(zdlpuopuiu zdlpuopuiuVar, String str, lg.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiuVar.F(str);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void V(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        this.f85512pkzmftpjix.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.Search.f84345iwizpuwonk, analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    static /* synthetic */ void W(zdlpuopuiu zdlpuopuiuVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        zdlpuopuiuVar.V(analyticsPage, analyticElement, analyticsLocation);
    }

    private final void X(AnalyticElement analyticElement, AnalyticsLocation.Search search) {
        this.f85512pkzmftpjix.ppxfxbqfkf(new no.nufgyqmvbu(new no.nufgyqmvbu.iobyxmoadg(search, analyticElement)));
    }

    private final void Y(ProductUiModel productUiModel, boolean z13, String str, boolean z14) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        List listLqeggnwhkg;
        CounterModel counterModel;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
            listLqeggnwhkg = fmlbqenlif().lqeggnwhkg();
            counterModel = productUiModel.getCounterModel();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : qs.eablkybsjg.dxjokdxxww(listLqeggnwhkg, productUiModel, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : false, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : counterModel.zoijcleaow((10235 & 1) != 0 ? counterModel.isLoading : false, (10235 & 2) != 0 ? counterModel.isAvailableToBuy : false, (10235 & 4) != 0 ? counterModel.isExpand : z13, (10235 & 8) != 0 ? counterModel.priceModel : null, (10235 & 16) != 0 ? counterModel.oldPriceModel : null, (10235 & 32) != 0 ? counterModel.avgWeight : null, (10235 & 64) != 0 ? counterModel.isDispPer100 : false, (10235 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? counterModel.quantity : 0.0d, (10235 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? counterModel.isMeasureTypeSwitchable : false, (10235 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? counterModel.measureType : null, (10235 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? counterModel.productLimitText : null, (10235 & 2048) != 0 ? counterModel.message : str, (10235 & 4096) != 0 ? counterModel.autoHideMessage : z14, (10235 & 8192) != 0 ? counterModel.colorsModel : null), (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null)), (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
    }

    static /* synthetic */ void Z(zdlpuopuiu zdlpuopuiuVar, ProductUiModel productUiModel, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        zdlpuopuiuVar.Y(productUiModel, z13, str, z14);
    }

    private final void a(ru.myspar.catalog.impl.search.agtfadlqog.iobyxmoadg iobyxmoadgVar) {
        if (((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            lxfrhoxuzk(iobyxmoadgVar.iobyxmoadg());
        } else {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85522wwaezpbzkn.ppxfxbqfkf(new NonAuthorizedPayload(null, null, 3, null)));
        }
    }

    private final void a0(List list) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : list, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : ezmngbhpjk(list, ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg()), (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
    }

    private final void ageimvtcrz(zoijcleaow zoijcleaowVar) {
        auzgnhcxok auzgnhcxokVar = this.f85490dsvhmnatus;
        if (auzgnhcxokVar != null) {
            ms.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f85490dsvhmnatus = pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(zoijcleaowVar, null), 3, null);
    }

    private final auzgnhcxok b(ru.myspar.catalog.impl.search.agtfadlqog.zoijcleaow zoijcleaowVar) {
        return pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new btonecajqb(zoijcleaowVar, null), 3, null);
    }

    private final void c() {
        this.f85511oxmwwwfdhm.zoijcleaow(Boolean.FALSE);
    }

    private final void d() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    private final void e() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(null), 3, null);
    }

    private final void eslsurpljm() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new nufgyqmvbu(null), 3, null);
    }

    private final ru.myspar.catalog.impl.search.oxmwwwfdhm ezmngbhpjk(List list, String str) {
        if (list.isEmpty()) {
            return mj.kcexrzcfyt.zfvoamnweg(str) ? ru.myspar.catalog.impl.search.oxmwwwfdhm.EMPTY_QUERY : ru.myspar.catalog.impl.search.oxmwwwfdhm.EMPTY_LIST;
        }
        return null;
    }

    private final void f() {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : new tzroggbefp("", 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null), (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
        this.f85508ntlheqmsrt = ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg();
        a0(hg.jyumaefscl.wflxmlrfwp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fiwbwshyhd(lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        zdlpuopuiu zdlpuopuiuVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f85579iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f85579iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f85581yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f85579iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            K();
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                w10.vdvldrhtss vdvldrhtssVar = this.f85525yggfygwlhe;
                gxszxtbevoVar2.f85582zdlpuopuiu = this;
                gxszxtbevoVar2.f85579iwizpuwonk = 1;
                objZoijcleaow = vdvldrhtssVar.zoijcleaow(gxszxtbevoVar2);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zdlpuopuiuVar = this;
            } catch (Throwable th2) {
                th = th2;
                zdlpuopuiuVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiuVar = (zdlpuopuiu) gxszxtbevoVar2.f85582zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zdlpuopuiuVar.x((List) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zdlpuopuiuVar.zdlpuopuiu(thDxjokdxxww);
        }
        zdlpuopuiuVar.yzdjzghtvl();
        zdlpuopuiuVar.f85512pkzmftpjix.zoijcleaow(oo.nufgyqmvbu.iobyxmoadg.f73286gxszxtbevo);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.myspar.catalog.impl.search.rgvfuqvkyq fmlbqenlif() {
        return (ru.myspar.catalog.impl.search.rgvfuqvkyq) ojitshcjhn().getValue();
    }

    private final boolean fyldjkxazc(String str) {
        if (mj.kcexrzcfyt.p(str).toString().length() >= 2) {
            return true;
        }
        if (!(hg.jyumaefscl.weqkydbzbr(jrbgnlbqoe()) instanceof pr.eablkybsjg)) {
            a0(hg.jyumaefscl.wflxmlrfwp());
        }
        return false;
    }

    private final void g(String str) {
        List listJrbgnlbqoe = jrbgnlbqoe();
        ArrayList arrayList = new ArrayList();
        Iterator it = listJrbgnlbqoe.iterator();
        while (true) {
            if (!it.hasNext()) {
                a0(arrayList);
                pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(str, this, null), 3, null);
                return;
            }
            pu.ppxfxbqfkf ppxfxbqfkfVar = (pu.ppxfxbqfkf) it.next();
            if (ppxfxbqfkfVar instanceof pr.eablkybsjg) {
                pr.eablkybsjg eablkybsjgVar = (pr.eablkybsjg) ppxfxbqfkfVar;
                List listWkgbmnqykc = eablkybsjgVar.wkgbmnqykc();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listWkgbmnqykc) {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((String) obj, str)) {
                        arrayList2.add(obj);
                    }
                }
                pr.eablkybsjg eablkybsjgVarIobyxmoadg = eablkybsjgVar.iobyxmoadg(arrayList2);
                ppxfxbqfkfVar = eablkybsjgVarIobyxmoadg.wkgbmnqykc().isEmpty() ? null : eablkybsjgVarIobyxmoadg;
            }
            if (ppxfxbqfkfVar != null) {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
    }

    private final l00.btonecajqb.iobyxmoadg grlcpdaxtj(SearchPayload searchPayload) {
        String orderEditId = searchPayload.getOrderEditId();
        return (searchPayload.getFlow() != v00.iobyxmoadg.ORDER_EDIT || orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? l00.btonecajqb.iobyxmoadg.zoijcleaow.f61220iobyxmoadg : new l00.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok hszhottldk() {
        return pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new eablkybsjg(null), 3, null);
    }

    private final void i(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(productUiModel, this, null), 3, null);
    }

    private final void igdgnonuha(String str) {
        if (((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(str, null), 3, null);
        }
    }

    private final void j(pr.iobyxmoadg iobyxmoadgVar) {
        AnalyticElement.SearchItemElement.Features features = new AnalyticElement.SearchItemElement.Features(iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.eablkybsjg());
        X(features, AnalyticsLocation.Search.Features.f84256iwizpuwonk);
        d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.Search.f84345iwizpuwonk, null, features, 2, null), false, 188, null));
    }

    private final List jrbgnlbqoe() {
        return fmlbqenlif().lqeggnwhkg();
    }

    private final void k() {
        W(this, AnalyticsPage.ProductListFilters.f84327iwizpuwonk, null, null, 6, null);
        b40.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm();
        String strEablkybsjg = ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg();
        String strPpxfxbqfkf = this.f85519ulzqkzuiru.ppxfxbqfkf();
        if (strPpxfxbqfkf != null && strPpxfxbqfkf.length() != 0) {
            strEablkybsjg = null;
        }
        wkgbmnqykcVarOxmwwwfdhm.lqeggnwhkg(ru.myspar.legacy.presentation.screen.filters.zoijcleaow.zoijcleaow(new FiltersArgs(this.f85519ulzqkzuiru.ppxfxbqfkf(), null, strEablkybsjg, this.f85519ulzqkzuiru.wkgbmnqykc(), null, null, 50, null)));
    }

    private final void krqnebusok(int i13) {
        ageimvtcrz(zoijcleaow.zoijcleaow(this.f85519ulzqkzuiru, null, null, null, null, i13, false, null, 79, null));
    }

    private final void l(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.eablkybsjg(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, AnalyticsPage.Search.f84345iwizpuwonk, null)));
    }

    private final void lxfrhoxuzk(ProductUiModel productUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(productUiModel, null), 3, null);
    }

    private final void m() {
        List listJrbgnlbqoe = jrbgnlbqoe();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJrbgnlbqoe) {
            if (!(((pu.ppxfxbqfkf) obj) instanceof pr.eablkybsjg)) {
                arrayList.add(obj);
            }
        }
        a0(arrayList);
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new agtfadlqog(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb mhtqkkgtqm() {
        return (l00.btonecajqb) this.f85486cllcsxoeiz.getValue();
    }

    private final void n(String str) {
        E(str);
        X(new AnalyticElement.SearchItemElement.History(str), AnalyticsLocation.Search.History.f84257iwizpuwonk);
    }

    private final void o() {
        auzgnhcxok auzgnhcxokVar = this.f85490dsvhmnatus;
        boolean z13 = false;
        if (auzgnhcxokVar != null && !auzgnhcxokVar.agtfadlqog()) {
            z13 = true;
        }
        int iGxszxtbevo = this.f85519ulzqkzuiru.gxszxtbevo();
        Paging pagingLqeggnwhkg = this.f85519ulzqkzuiru.lqeggnwhkg();
        if ((pagingLqeggnwhkg == null || iGxszxtbevo < pagingLqeggnwhkg.getPagesCount()) && !z13) {
            krqnebusok(iGxszxtbevo + 1);
        }
    }

    private final void p(ProductUiModel productUiModel, ProductCardEvent productCardEvent) {
        List limits;
        List listIobyxmoadg;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ProductCardEvent.CounterInternal.ShowMessage showMessage = (ProductCardEvent.CounterInternal.ShowMessage) productCardEvent;
                Y(productUiModel, true, showMessage.getMessage(), showMessage.getAutoHide());
                return;
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                Z(this, productUiModel, false, null, false, 12, null);
                return;
            }
        }
        igdgnonuha(productUiModel.getName());
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        Object obj = null;
        ChangeProductAnalyticParams changeProductAnalyticParams = new ChangeProductAnalyticParams(AnalyticsPage.Search.f84345iwizpuwonk, null, productUiModel.getName());
        for (Object obj2 : this.f85515ribwqtqdhb) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), productUiModel.getId())) {
                obj = obj2;
                break;
            }
        }
        ProductUIData productUIData = (ProductUIData) obj;
        hkdspvbjdz(new ChangeProductParams(productUiModel.getId(), productUiModel.getArticle(), zoijcleaowVarIobyxmoadg, productUiModel.getAvailabilityModel().getIsAvailableToBuy(), productUiModel.getIsPmProduct(), productUiModel.getAvailabilityModel().getAvailableOnlyForPickup(), productUiModel.getMeasureTypeModel(), productUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(limits)) == null) ? productUiModel.getLimits() : listIobyxmoadg, changeProductAnalyticParams), this.f85492esjtqupxsv.getFlow() == v00.iobyxmoadg.ORDER_EDIT);
    }

    private final void q(ProductUiModel productUiModel) {
        igdgnonuha(productUiModel.getName());
        W(this, new AnalyticsPage.ItemDetail(productUiModel.getArticle(), productUiModel.getName()), new AnalyticElement.ProductItemElement(productUiModel.getArticle(), productUiModel.getName()), null, 4, null);
        X(new AnalyticElement.SearchItemElement.Item(productUiModel.getArticle(), productUiModel.getName()), AnalyticsLocation.Search.Item.f84258iwizpuwonk);
        d40.iobyxmoadg.f26931iobyxmoadg.kcexrzcfyt().lqeggnwhkg(this.f85526ylkuphrtab.gxszxtbevo(new ProductPayload(new ProductPayload.Type.ProductId(productUiModel.getId()), this.f85492esjtqupxsv.getOrderEditId())));
    }

    private final void r(SearchCategoryUiModel searchCategoryUiModel) {
        C(searchCategoryUiModel);
        AnalyticsLocation.Search.Category category = AnalyticsLocation.Search.Category.f84255iwizpuwonk;
        String id2 = searchCategoryUiModel.getId();
        if (id2 == null) {
            id2 = "";
        }
        String title = searchCategoryUiModel.getTitle();
        X(new AnalyticElement.SearchItemElement.Categories(id2, title != null ? title : ""), category);
    }

    private final void s(tzroggbefp tzroggbefpVar) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.draadjrbmk(), ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg())) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ojitshcjhn(tzroggbefpVar, null), 3, null);
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : tzroggbefpVar, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
    }

    private final void t(String str) {
        H(str);
        X(new AnalyticElement.SearchItemElement.Suggestions(str), AnalyticsLocation.Search.Suggestions.f84260iwizpuwonk);
    }

    private final void u() {
        if (((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg().length() >= 2) {
            igdgnonuha(((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg());
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg(), this.f85508ntlheqmsrt)) {
            return;
        }
        X(new AnalyticElement.SearchItemElement.Query(((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg()), AnalyticsLocation.Search.Query.f84259iwizpuwonk);
        this.f85508ntlheqmsrt = ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg();
    }

    private final void v() {
        yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.nufgyqmvbu(fmlbqenlif().btonecajqb(), v00.wkgbmnqykc.iobyxmoadg(v00.ppxfxbqfkf.f115048yggfygwlhe)));
    }

    private final void w(v00.ppxfxbqfkf ppxfxbqfkfVar) {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        if (fmlbqenlif().btonecajqb() == ppxfxbqfkfVar) {
            return;
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : ppxfxbqfkfVar, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
        G(ppxfxbqfkfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak(String str, boolean z13) {
        if (jrbgnlbqoe().isEmpty() && ((ru.myspar.catalog.impl.search.rgvfuqvkyq) gtknphoqwx()).eablkybsjg().length() == 0) {
            return;
        }
        List listJrbgnlbqoe = jrbgnlbqoe();
        Iterator it = listJrbgnlbqoe.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            pu.ppxfxbqfkf ppxfxbqfkfVar = (pu.ppxfxbqfkf) it.next();
            if ((ppxfxbqfkfVar instanceof ProductUiModel) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.getItemId(), str)) {
                break;
            }
            i13++;
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Object obj = listJrbgnlbqoe.get(iIntValue);
            ProductUiModel productUiModel = (ProductUiModel) (obj instanceof ProductUiModel ? obj : null);
            if (productUiModel != null) {
                listJrbgnlbqoe = hg.jyumaefscl.p(listJrbgnlbqoe);
                listJrbgnlbqoe.set(iIntValue, productUiModel.lqeggnwhkg(((-1025) & 1) != 0 ? productUiModel.id : null, ((-1025) & 2) != 0 ? productUiModel.name : null, ((-1025) & 4) != 0 ? productUiModel.article : null, ((-1025) & 8) != 0 ? productUiModel.isProductWithZeroPrice : false, ((-1025) & 16) != 0 ? productUiModel.price : 0.0d, ((-1025) & 32) != 0 ? productUiModel.oldPrice : null, ((-1025) & 64) != 0 ? productUiModel.discount : null, ((-1025) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.discountString : null, ((-1025) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.hasDiscount : false, ((-1025) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.isDispPer100 : false, ((-1025) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.measureTypeModel : null, ((-1025) & 2048) != 0 ? productUiModel.avgWeight : null, ((-1025) & 4096) != 0 ? productUiModel.isFavorite : z13, ((-1025) & 8192) != 0 ? productUiModel.favoriteEnabledState : false, ((-1025) & 16384) != 0 ? productUiModel.inCart : false, ((-1025) & 32768) != 0 ? productUiModel.photoUrl : null, ((-1025) & 65536) != 0 ? productUiModel.photoUrls : null, ((-1025) & 131072) != 0 ? productUiModel.isMultiPhotos : false, ((-1025) & 262144) != 0 ? productUiModel.fats : null, ((-1025) & 524288) != 0 ? productUiModel.carbs : null, ((-1025) & 1048576) != 0 ? productUiModel.protein : null, ((-1025) & 2097152) != 0 ? productUiModel.energy : null, ((-1025) & 4194304) != 0 ? productUiModel.params : null, ((-1025) & 8388608) != 0 ? productUiModel.description : null, ((-1025) & 16777216) != 0 ? productUiModel.chemical : null, ((-1025) & 33554432) != 0 ? productUiModel.buyState : null, ((-1025) & 67108864) != 0 ? productUiModel.stickers : null, ((-1025) & 134217728) != 0 ? productUiModel.hidePrice : false, ((-1025) & 268435456) != 0 ? productUiModel.rating : null, ((-1025) & 536870912) != 0 ? productUiModel.reviewsCount : 0, ((-1025) & 1073741824) != 0 ? productUiModel.basketQuantity : null, ((-1025) & Integer.MIN_VALUE) != 0 ? productUiModel.isPmProduct : false, (16777215 & 1) != 0 ? productUiModel.video : null, (16777215 & 2) != 0 ? productUiModel.isRatingFeatureEnabled : false, (16777215 & 4) != 0 ? productUiModel.isPurchaseListsFeatureEnabled : false, (16777215 & 8) != 0 ? productUiModel.country : null, (16777215 & 16) != 0 ? productUiModel.region : null, (16777215 & 32) != 0 ? productUiModel.countryFlagEmoji : null, (16777215 & 64) != 0 ? productUiModel.type : null, (16777215 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productUiModel.kind : null, (16777215 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? productUiModel.grape : null, (16777215 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productUiModel.standart : null, (16777215 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productUiModel.countryMapIcon : null, (16777215 & 2048) != 0 ? productUiModel.tasting : null, (16777215 & 4096) != 0 ? productUiModel.styling : null, (16777215 & 8192) != 0 ? productUiModel.button : null, (16777215 & 16384) != 0 ? productUiModel.hints : null, (16777215 & 32768) != 0 ? productUiModel.colorsUiModel : null, (16777215 & 65536) != 0 ? productUiModel.counterModel : null, (16777215 & 131072) != 0 ? productUiModel.deliveryCode : null, (16777215 & 262144) != 0 ? productUiModel.vivino : null, (16777215 & 524288) != 0 ? productUiModel.limits : null, (16777215 & 1048576) != 0 ? productUiModel.availabilityModel : null, (16777215 & 2097152) != 0 ? productUiModel.productVariants : null, (16777215 & 4194304) != 0 ? productUiModel.isSelected : null, (16777215 & 8388608) != 0 ? productUiModel.adv : null));
            }
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        while (true) {
            Object value = zynmafqrjbVarOjitshcjhn.getValue();
            ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
            List list = listJrbgnlbqoe;
            if (zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : listJrbgnlbqoe, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false))) {
                return;
            } else {
                listJrbgnlbqoe = list;
            }
        }
    }

    private final void x(List list) {
        pr.eablkybsjg eablkybsjgVarInvoke = this.f85483agtfadlqog.invoke(list);
        if (eablkybsjgVarInvoke != null) {
            a0(hg.jyumaefscl.eablkybsjg(eablkybsjgVarInvoke));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(ProductListData productListData, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        rgvfuqvkyq rgvfuqvkyqVar;
        int i13;
        zdlpuopuiu zdlpuopuiuVar;
        List list;
        List list2;
        pb0.ppxfxbqfkf ppxfxbqfkfVar;
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar2;
        Object value2;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar3;
        int iGxszxtbevo;
        String strNufgyqmvbu;
        Object value3;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar4;
        ProductListData productListData2 = productListData;
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        if (gxszxtbevoVar instanceof rgvfuqvkyq) {
            rgvfuqvkyqVar = (rgvfuqvkyq) gxszxtbevoVar;
            int i14 = rgvfuqvkyqVar.f85652zynmafqrjb;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rgvfuqvkyqVar.f85652zynmafqrjb = i14 - Integer.MIN_VALUE;
            } else {
                rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
            }
        } else {
            rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
        }
        rgvfuqvkyq rgvfuqvkyqVar5 = rgvfuqvkyqVar;
        Object obj = rgvfuqvkyqVar5.f85648lereixgezr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = rgvfuqvkyqVar5.f85652zynmafqrjb;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            if (productListData.getIsAgeCheckNeeded()) {
                a20.zoijcleaow zoijcleaowVar3 = this.f85502kcexrzcfyt;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                if (!((Boolean) zoijcleaowVar3.zoijcleaow(wwaezpbzknVar)).booleanValue() && !this.f85516sopmlzcsov) {
                    yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.iobyxmoadg(productListData2, zoijcleaowVar2));
                    return wwaezpbzknVar;
                }
            }
            i13 = 1;
            this.f85519ulzqkzuiru = zoijcleaow.zoijcleaow(zoijcleaowVar, null, null, null, null, 0, false, productListData.getPaging(), 63, null);
            pb0.ppxfxbqfkf ppxfxbqfkfVar2 = this.f85489draadjrbmk;
            List productList = productListData.getProductList();
            List list3 = this.f85515ribwqtqdhb;
            z10.gxszxtbevo gxszxtbevoVar2 = this.f85487cqumvgiudr;
            v00.iobyxmoadg flow = this.f85492esjtqupxsv.getFlow();
            String orderEditId = this.f85492esjtqupxsv.getOrderEditId();
            y00.iobyxmoadg iobyxmoadgVarKcexrzcfyt = kcexrzcfyt();
            z10.gxszxtbevo.iobyxmoadg iobyxmoadgVar = new z10.gxszxtbevo.iobyxmoadg(flow, iobyxmoadgVarKcexrzcfyt != null ? iobyxmoadgVarKcexrzcfyt.ppxfxbqfkf() : null, orderEditId);
            rgvfuqvkyqVar5.f85651zdlpuopuiu = this;
            rgvfuqvkyqVar5.f85650yggfygwlhe = productListData2;
            rgvfuqvkyqVar5.f85647jyumaefscl = zoijcleaowVar2;
            rgvfuqvkyqVar5.f85646iwizpuwonk = ppxfxbqfkfVar2;
            rgvfuqvkyqVar5.f85644cqumvgiudr = productList;
            rgvfuqvkyqVar5.f85645esjtqupxsv = list3;
            rgvfuqvkyqVar5.f85652zynmafqrjb = 1;
            Object objZoijcleaow = gxszxtbevoVar2.zoijcleaow(iobyxmoadgVar, rgvfuqvkyqVar5);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zdlpuopuiuVar = this;
            list = list3;
            obj = objZoijcleaow;
            list2 = productList;
            ppxfxbqfkfVar = ppxfxbqfkfVar2;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list4 = (List) rgvfuqvkyqVar5.f85645esjtqupxsv;
            List list5 = (List) rgvfuqvkyqVar5.f85644cqumvgiudr;
            pb0.ppxfxbqfkf ppxfxbqfkfVar3 = (pb0.ppxfxbqfkf) rgvfuqvkyqVar5.f85646iwizpuwonk;
            zoijcleaow zoijcleaowVar4 = (zoijcleaow) rgvfuqvkyqVar5.f85647jyumaefscl;
            ProductListData productListData3 = (ProductListData) rgvfuqvkyqVar5.f85650yggfygwlhe;
            zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) rgvfuqvkyqVar5.f85651zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaowVar2 = zoijcleaowVar4;
            zdlpuopuiuVar = zdlpuopuiuVar2;
            i13 = 1;
            list2 = list5;
            ppxfxbqfkfVar = ppxfxbqfkfVar3;
            list = list4;
            productListData2 = productListData3;
        }
        List listIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(list2, list, (DeliveryCode) obj, zdlpuopuiuVar.f85523wypolnanlu, zdlpuopuiuVar.f85517stevsuqkhv, zdlpuopuiuVar.f85518tzroggbefp, new vdvldrhtss(zdlpuopuiuVar.f85505lmojexxdyd));
        if (zoijcleaowVar2.gxszxtbevo() != i13) {
            sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = zdlpuopuiuVar.ojitshcjhn();
            do {
                value3 = zynmafqrjbVarOjitshcjhn.getValue();
                rgvfuqvkyqVar4 = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value3;
            } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value3, rgvfuqvkyqVar4.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar4.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar4.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar4.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar4.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar4.f85454eablkybsjg : kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(zoijcleaowVar2.gxszxtbevo()), (2015 & 32) != 0 ? rgvfuqvkyqVar4.f85456gxszxtbevo : hg.jyumaefscl.ixidwrxhsl(zdlpuopuiuVar.jrbgnlbqoe(), listIobyxmoadg), (2015 & 64) != 0 ? rgvfuqvkyqVar4.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar4.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar4.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar4.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar4.f85455gtknphoqwx : false)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn2 = zdlpuopuiuVar.ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn2.getValue();
            rgvfuqvkyqVar2 = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, rgvfuqvkyqVar2.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar2.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar2.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar2.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar2.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar2.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar2.f85456gxszxtbevo : hg.jyumaefscl.wflxmlrfwp(), (2015 & 64) != 0 ? rgvfuqvkyqVar2.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar2.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar2.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar2.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar2.f85455gtknphoqwx : false)));
        ArrayList arrayList = new ArrayList();
        List searchSuggestions = productListData2.getSearchSuggestions();
        if (searchSuggestions != null) {
            kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(arrayList.add(new pr.gxszxtbevo(searchSuggestions)));
        }
        List features = productListData2.getFeatures();
        if (features != null) {
            if (zdlpuopuiuVar.f85492esjtqupxsv.getFlow() == v00.iobyxmoadg.ORDER_EDIT || features.isEmpty()) {
                features = null;
            }
            if (features != null) {
                ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(features, 10));
                Iterator it = features.iterator();
                while (it.hasNext()) {
                    arrayList2.add(pr.zoijcleaow.iobyxmoadg((SearchFeatureModel) it.next()));
                }
                kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(arrayList.add(new pr.wkgbmnqykc(arrayList2)));
            }
        }
        List searchCategories = productListData2.getSearchCategories();
        if (searchCategories != null) {
            kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(arrayList.add(new pr.ppxfxbqfkf(zdlpuopuiuVar.f85521wflxmlrfwp.invoke(searchCategories))));
        }
        arrayList.addAll(listIobyxmoadg);
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn3 = zdlpuopuiuVar.ojitshcjhn();
        do {
            value2 = zynmafqrjbVarOjitshcjhn3.getValue();
            rgvfuqvkyqVar3 = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value2;
            iGxszxtbevo = zoijcleaowVar2.gxszxtbevo();
            strNufgyqmvbu = zoijcleaowVar2.nufgyqmvbu();
            if (strNufgyqmvbu == null) {
                strNufgyqmvbu = "";
            }
        } while (!zynmafqrjbVarOjitshcjhn3.compareAndSet(value2, rgvfuqvkyqVar3.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar3.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar3.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar3.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar3.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar3.f85454eablkybsjg : kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(iGxszxtbevo), (2015 & 32) != 0 ? rgvfuqvkyqVar3.f85456gxszxtbevo : arrayList, (2015 & 64) != 0 ? rgvfuqvkyqVar3.f85458lqeggnwhkg : (zoijcleaowVar2.eablkybsjg() || !zdlpuopuiuVar.f85503kegysxyocb) ? 0 : i13, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar3.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar3.f85453dxjokdxxww : zdlpuopuiuVar.ezmngbhpjk(arrayList, strNufgyqmvbu), (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar3.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar3.f85455gtknphoqwx : listIobyxmoadg.size() > i13 ? i13 : 0)));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yzdjzghtvl() {
        Object value;
        ru.myspar.catalog.impl.search.rgvfuqvkyq rgvfuqvkyqVar;
        sj.zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            rgvfuqvkyqVar = (ru.myspar.catalog.impl.search.rgvfuqvkyq) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, rgvfuqvkyqVar.iobyxmoadg((2015 & 1) != 0 ? rgvfuqvkyqVar.f85457iobyxmoadg : false, (2015 & 2) != 0 ? rgvfuqvkyqVar.f85462zoijcleaow : false, (2015 & 4) != 0 ? rgvfuqvkyqVar.f85460ppxfxbqfkf : null, (2015 & 8) != 0 ? rgvfuqvkyqVar.f85461wkgbmnqykc : null, (2015 & 16) != 0 ? rgvfuqvkyqVar.f85454eablkybsjg : null, (2015 & 32) != 0 ? rgvfuqvkyqVar.f85456gxszxtbevo : null, (2015 & 64) != 0 ? rgvfuqvkyqVar.f85458lqeggnwhkg : false, (2015 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? rgvfuqvkyqVar.f85459nufgyqmvbu : null, (2015 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? rgvfuqvkyqVar.f85453dxjokdxxww : null, (2015 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? rgvfuqvkyqVar.f85451btonecajqb : false, (2015 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? rgvfuqvkyqVar.f85455gtknphoqwx : false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.dxjokdxxww(warning.getMessage()));
    }

    public void J(y00.iobyxmoadg iobyxmoadgVar) {
        this.f85499jlmebxxoox = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f85484btonecajqb;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new dxjokdxxww(null), 3, null);
    }

    public final void h(ru.myspar.catalog.impl.search.agtfadlqog event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.eablkybsjg) {
            d();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.nufgyqmvbu) {
            f();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.zoijcleaow) {
            b((ru.myspar.catalog.impl.search.agtfadlqog.zoijcleaow) event);
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.ppxfxbqfkf) {
            c();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.zdlpuopuiu) {
            s(((ru.myspar.catalog.impl.search.agtfadlqog.zdlpuopuiu) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.yggfygwlhe) {
            u();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.cqumvgiudr) {
            t(((ru.myspar.catalog.impl.search.agtfadlqog.cqumvgiudr) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.gxszxtbevo) {
            r(((ru.myspar.catalog.impl.search.agtfadlqog.gxszxtbevo) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.rgvfuqvkyq) {
            o();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.oxmwwwfdhm) {
            q(((ru.myspar.catalog.impl.search.agtfadlqog.oxmwwwfdhm) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.btonecajqb) {
            i(((ru.myspar.catalog.impl.search.agtfadlqog.btonecajqb) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.ojitshcjhn) {
            n(((ru.myspar.catalog.impl.search.agtfadlqog.ojitshcjhn) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.C1946agtfadlqog) {
            m();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.dxjokdxxww) {
            g(((ru.myspar.catalog.impl.search.agtfadlqog.dxjokdxxww) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.kcexrzcfyt) {
            I();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.iobyxmoadg) {
            a((ru.myspar.catalog.impl.search.agtfadlqog.iobyxmoadg) event);
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.wkgbmnqykc) {
            ylkuphrtab(((ru.myspar.catalog.impl.search.agtfadlqog.wkgbmnqykc) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.draadjrbmk) {
            k();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.jyumaefscl) {
            v();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.lqeggnwhkg) {
            e();
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.iwizpuwonk) {
            w(((ru.myspar.catalog.impl.search.agtfadlqog.iwizpuwonk) event).iobyxmoadg());
            return;
        }
        if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.vdvldrhtss) {
            ru.myspar.catalog.impl.search.agtfadlqog.vdvldrhtss vdvldrhtssVar = (ru.myspar.catalog.impl.search.agtfadlqog.vdvldrhtss) event;
            p(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.iobyxmoadg());
        } else if (event instanceof ru.myspar.catalog.impl.search.agtfadlqog.gtknphoqwx) {
            j(((ru.myspar.catalog.impl.search.agtfadlqog.gtknphoqwx) event).iobyxmoadg());
        } else {
            if (!(event instanceof ru.myspar.catalog.impl.search.agtfadlqog.wflxmlrfwp)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.catalog.impl.search.agtfadlqog.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.catalog.impl.search.agtfadlqog.wflxmlrfwp) event;
            l(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
        }
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        if (str == null) {
            str = this.f85505lmojexxdyd.getString(pm.dxjokdxxww.available_only_for_pickup_product);
        }
        yggfygwlhe(new ru.myspar.catalog.impl.search.vdvldrhtss.zoijcleaow(params, str));
    }

    public tg.iobyxmoadg ipoelvxyzq() {
        return this.f85488crxdokpmqz;
    }

    public sj.lqeggnwhkg ixidwrxhsl() {
        return this.f85506lqeggnwhkg.ppxfxbqfkf();
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f85499jlmebxxoox;
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f85488crxdokpmqz = iobyxmoadgVar;
    }

    public void rhgxfdycjh(sx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f85506lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        yggfygwlhe(ru.myspar.catalog.impl.search.vdvldrhtss.gxszxtbevo.f85467iobyxmoadg);
    }

    @Override // vx.eablkybsjg
    protected Object vdvldrhtss(sx.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        rhgxfdycjh(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new oxmwwwfdhm(params, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f85522wwaezpbzkn.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f85664eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f85665gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f85666iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Paging f85667lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final List f85668ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final v00.ppxfxbqfkf f85669wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f85670zoijcleaow;

        public zoijcleaow(String str, String str2, List list, v00.ppxfxbqfkf ppxfxbqfkfVar, int i13, boolean z13, Paging paging) {
            this.f85666iobyxmoadg = str;
            this.f85670zoijcleaow = str2;
            this.f85668ppxfxbqfkf = list;
            this.f85669wkgbmnqykc = ppxfxbqfkfVar;
            this.f85664eablkybsjg = i13;
            this.f85665gxszxtbevo = z13;
            this.f85667lqeggnwhkg = paging;
        }

        public static /* synthetic */ zoijcleaow zoijcleaow(zoijcleaow zoijcleaowVar, String str, String str2, List list, v00.ppxfxbqfkf ppxfxbqfkfVar, int i13, boolean z13, Paging paging, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = zoijcleaowVar.f85666iobyxmoadg;
            }
            if ((i14 & 2) != 0) {
                str2 = zoijcleaowVar.f85670zoijcleaow;
            }
            String str3 = str2;
            if ((i14 & 4) != 0) {
                list = zoijcleaowVar.f85668ppxfxbqfkf;
            }
            List list2 = list;
            if ((i14 & 8) != 0) {
                ppxfxbqfkfVar = zoijcleaowVar.f85669wkgbmnqykc;
            }
            v00.ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
            if ((i14 & 16) != 0) {
                i13 = zoijcleaowVar.f85664eablkybsjg;
            }
            int i15 = i13;
            if ((i14 & 32) != 0) {
                z13 = zoijcleaowVar.f85665gxszxtbevo;
            }
            boolean z14 = z13;
            if ((i14 & 64) != 0) {
                paging = zoijcleaowVar.f85667lqeggnwhkg;
            }
            return zoijcleaowVar.iobyxmoadg(str, str3, list2, ppxfxbqfkfVar2, i15, z14, paging);
        }

        public final v00.ppxfxbqfkf dxjokdxxww() {
            return this.f85669wkgbmnqykc;
        }

        public final boolean eablkybsjg() {
            return this.f85665gxszxtbevo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85666iobyxmoadg, zoijcleaowVar.f85666iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85670zoijcleaow, zoijcleaowVar.f85670zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85668ppxfxbqfkf, zoijcleaowVar.f85668ppxfxbqfkf) && this.f85669wkgbmnqykc == zoijcleaowVar.f85669wkgbmnqykc && this.f85664eablkybsjg == zoijcleaowVar.f85664eablkybsjg && this.f85665gxszxtbevo == zoijcleaowVar.f85665gxszxtbevo && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85667lqeggnwhkg, zoijcleaowVar.f85667lqeggnwhkg);
        }

        public final int gxszxtbevo() {
            return this.f85664eablkybsjg;
        }

        public int hashCode() {
            String str = this.f85666iobyxmoadg;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f85670zoijcleaow;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.f85668ppxfxbqfkf;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            v00.ppxfxbqfkf ppxfxbqfkfVar = this.f85669wkgbmnqykc;
            int iHashCode4 = (((((iHashCode3 + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode())) * 31) + Integer.hashCode(this.f85664eablkybsjg)) * 31) + Boolean.hashCode(this.f85665gxszxtbevo)) * 31;
            Paging paging = this.f85667lqeggnwhkg;
            return iHashCode4 + (paging != null ? paging.hashCode() : 0);
        }

        public final zoijcleaow iobyxmoadg(String str, String str2, List list, v00.ppxfxbqfkf ppxfxbqfkfVar, int i13, boolean z13, Paging paging) {
            return new zoijcleaow(str, str2, list, ppxfxbqfkfVar, i13, z13, paging);
        }

        public final Paging lqeggnwhkg() {
            return this.f85667lqeggnwhkg;
        }

        public final String nufgyqmvbu() {
            return this.f85666iobyxmoadg;
        }

        public final String ppxfxbqfkf() {
            return this.f85670zoijcleaow;
        }

        public String toString() {
            return "SearchParams(searchQuery=" + this.f85666iobyxmoadg + ", categoryId=" + this.f85670zoijcleaow + ", filterSections=" + this.f85668ppxfxbqfkf + ", sortState=" + this.f85669wkgbmnqykc + ", page=" + this.f85664eablkybsjg + ", getSuggest=" + this.f85665gxszxtbevo + ", paging=" + this.f85667lqeggnwhkg + ")";
        }

        public final List wkgbmnqykc() {
            return this.f85668ppxfxbqfkf;
        }

        public /* synthetic */ zoijcleaow(String str, String str2, List list, v00.ppxfxbqfkf ppxfxbqfkfVar, int i13, boolean z13, Paging paging, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : ppxfxbqfkfVar, (i14 & 16) != 0 ? 1 : i13, (i14 & 32) != 0 ? true : z13, (i14 & 64) != 0 ? null : paging);
        }
    }
}
