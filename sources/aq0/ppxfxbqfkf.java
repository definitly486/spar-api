package aq0;

import gg.wwaezpbzkn;
import j0.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.hkdspvbjdz;
import ow1.ylkuphrtab;
import p0.tzroggbefp;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.impl.search.domain.State;
import ru.myspar.proloyalty.catalog.impl.search.models.SearchCategoryUiModel;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.product.ProductListData;
import ru.myspar.proloyalty.core.domain.models.searchquery.HistoryItemModel;
import ru.myspar.proloyalty.core.domain.models.searchquery.SearchHistoryModel;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends e8.iobyxmoadg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f14189cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f14190yadqdtsiqt = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final m01.nufgyqmvbu f14191agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final r01.gtknphoqwx f14192btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private String f14193cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final i01.iobyxmoadg f14194draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final k01.vdvldrhtss f14195dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ylkuphrtab f14196eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f14197esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final m01.gxszxtbevo f14198gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ow1.zoijcleaow f14199gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private pz0.iobyxmoadg f14200istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final sj.pmvmpeiblj f14201iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private auzgnhcxok f14202jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final aq0.iobyxmoadg f14203kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f14204lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ow1.iwizpuwonk f14205lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final p01.btonecajqb f14206nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final ek1.iobyxmoadg f14207ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final m01.iobyxmoadg f14208oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private String f14209pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f14210ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final lw1.iobyxmoadg f14211rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final t81.iobyxmoadg f14212vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final dz0.gtknphoqwx f14213wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r01.btonecajqb f14214wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final gg.gtknphoqwx f14215yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ow1.esjtqupxsv f14216zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private tg.iobyxmoadg f14217zynmafqrjb;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f14218cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f14220jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f14221yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14222zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14220jyumaefscl = obj;
            this.f14218cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.w(this);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f14223cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f14225jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14226yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14227zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14225jyumaefscl = obj;
            this.f14223cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.c(null, this);
        }
    }

    /* synthetic */ class cdpycssgdh extends kotlin.jvm.internal.vdvldrhtss implements tg.rgvfuqvkyq {
        cdpycssgdh(Object obj) {
            super(2, obj, ppxfxbqfkf.class, "refreshProductsByQuery", "refreshProductsByQuery(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Object invoke(tzroggbefp tzroggbefpVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) this.receiver).y(tzroggbefpVar, gxszxtbevoVar);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14229yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14230zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            cqumvgiudr cqumvgiudrVar = ppxfxbqfkf.this.new cqumvgiudr(gxszxtbevoVar);
            cqumvgiudrVar.f14229yggfygwlhe = obj;
            return cqumvgiudrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14230zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.ulzqkzuiru(new aq0.nufgyqmvbu.zoijcleaow((List) ((gg.vdvldrhtss) this.f14229yggfygwlhe).iobyxmoadg()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(vdvldrhtssVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ tzroggbefp f14231jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14233zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(tzroggbefp tzroggbefpVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14231jyumaefscl = tzroggbefpVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new draadjrbmk(this.f14231jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14233zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.pmvmpeiblj pmvmpeibljVar = ppxfxbqfkf.this.f14201iwizpuwonk;
                tzroggbefp tzroggbefpVar = this.f14231jyumaefscl;
                this.f14233zdlpuopuiu = 1;
                if (pmvmpeibljVar.emit(tzroggbefpVar, this) == objGxszxtbevo) {
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
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductUiModel f14234jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14236zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14234jyumaefscl = productUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new dxjokdxxww(this.f14234jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14236zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                ProductUiModel productUiModel = this.f14234jyumaefscl;
                this.f14236zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.dvvnrvtcbc(productUiModel, this) == objGxszxtbevo) {
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
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14238zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14238zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                this.f14238zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.h(this) == objGxszxtbevo) {
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

    public static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f14239iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f14240jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f14241yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14242zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar, ppxfxbqfkf ppxfxbqfkfVar) {
            super(3, gxszxtbevoVar);
            this.f14239iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14242zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f14241yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f14240jyumaefscl).booleanValue() ? this.f14239iwizpuwonk.jrbgnlbqoe().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f14242zdlpuopuiu = 1;
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
            esjtqupxsv esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar, this.f14239iwizpuwonk);
            esjtqupxsvVar.f14241yggfygwlhe = nufgyqmvbuVar;
            esjtqupxsvVar.f14240jyumaefscl = obj;
            return esjtqupxsvVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f14243cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f14245jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14246yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14247zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14245jyumaefscl = obj;
            this.f14243cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.h(this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ aq0.gxszxtbevo f14248jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14250zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(aq0.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
            super(2, gxszxtbevoVar2);
            this.f14248jyumaefscl = gxszxtbevoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new gxszxtbevo(this.f14248jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14250zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                String strIobyxmoadg = ((aq0.gxszxtbevo.nufgyqmvbu) this.f14248jyumaefscl).iobyxmoadg();
                this.f14250zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.c(strIobyxmoadg, this) == objGxszxtbevo) {
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
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class istkbnxepw extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14252zdlpuopuiu;

        istkbnxepw(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new istkbnxepw(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14252zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.crxdokpmqz(aq0.lqeggnwhkg.dxjokdxxww.f14148iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Double d13, lg.gxszxtbevo gxszxtbevoVar) {
            return ((istkbnxepw) create(d13, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ boolean f14253jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14254yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14255zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // tg.vdvldrhtss
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return ojitshcjhn((List) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14255zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.cqumvgiudr.iobyxmoadg((List) this.f14254yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f14253jyumaefscl));
        }

        public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(gxszxtbevoVar);
            iwizpuwonkVar.f14254yggfygwlhe = list;
            iwizpuwonkVar.f14253jyumaefscl = z13;
            return iwizpuwonkVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f14256zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f14257zdlpuopuiu;

            /* JADX INFO: renamed from: aq0.ppxfxbqfkf$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0220iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f14259yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f14260zdlpuopuiu;

                public C0220iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f14260zdlpuopuiu = obj;
                    this.f14259yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f14257zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0220iobyxmoadg c0220iobyxmoadg;
                if (gxszxtbevoVar instanceof C0220iobyxmoadg) {
                    c0220iobyxmoadg = (C0220iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0220iobyxmoadg.f14259yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0220iobyxmoadg.f14259yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0220iobyxmoadg = new C0220iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0220iobyxmoadg = new C0220iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0220iobyxmoadg.f14260zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0220iobyxmoadg.f14259yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f14257zdlpuopuiu;
                    if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                        c0220iobyxmoadg.f14259yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0220iobyxmoadg) == objGxszxtbevo) {
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

        public jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f14256zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f14256zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14262yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14263zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14263zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.s((Throwable) this.f14262yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = ppxfxbqfkf.this.new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f14262yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14265yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14266zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = ppxfxbqfkf.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f14265yggfygwlhe = obj;
            return lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14266zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f14265yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                ppxfxbqfkf.this.s(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                ppxfxbqfkf.this.u(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lereixgezr) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f14267cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f14269iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f14270jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f14271lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f14272yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14273zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14267cqumvgiudr = obj;
            this.f14271lereixgezr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wizcaqwiak(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ List f14274cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ int f14275esjtqupxsv;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f14277jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        final /* synthetic */ String f14278lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        final /* synthetic */ boolean f14279pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14280yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14281zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(List list, int i13, String str, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14274cqumvgiudr = list;
            this.f14275esjtqupxsv = i13;
            this.f14278lereixgezr = str;
            this.f14279pmvmpeiblj = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new nufgyqmvbu(this.f14274cqumvgiudr, this.f14275esjtqupxsv, this.f14278lereixgezr, this.f14279pmvmpeiblj, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            int i13;
            boolean z13;
            String str;
            List list;
            ppxfxbqfkf ppxfxbqfkfVar;
            bq0.iobyxmoadg iobyxmoadgVar;
            Object obj2;
            ppxfxbqfkf ppxfxbqfkfVar2;
            Throwable thDxjokdxxww;
            Object objZoijcleaow;
            Object objZoijcleaow2;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i14 = this.f14277jyumaefscl;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        objZoijcleaow = obj;
                    } else {
                        if (i14 == 2) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            objZoijcleaow2 = obj;
                            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
                            i13 = this.f14275esjtqupxsv;
                            z13 = this.f14279pmvmpeiblj;
                            str = this.f14278lereixgezr;
                            list = this.f14274cqumvgiudr;
                            ppxfxbqfkfVar = ppxfxbqfkf.this;
                            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                                iobyxmoadgVar = new bq0.iobyxmoadg(i13, z13, str, list);
                                this.f14281zdlpuopuiu = objWkgbmnqykc;
                                this.f14280yggfygwlhe = ppxfxbqfkfVar;
                                this.f14277jyumaefscl = 3;
                                if (ppxfxbqfkfVar.t((ProductListData) objWkgbmnqykc, i13, iobyxmoadgVar, this) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                obj2 = objWkgbmnqykc;
                                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                            }
                            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                            if (thDxjokdxxww != null) {
                                if (thDxjokdxxww instanceof CancellationException) {
                                    return wwaezpbzkn.f37140iobyxmoadg;
                                }
                                ppxfxbqfkfVar.s(thDxjokdxxww);
                            }
                            ppxfxbqfkf.this.H(this.f14275esjtqupxsv);
                            ppxfxbqfkf.this.f14203kcexrzcfyt.lqeggnwhkg();
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ppxfxbqfkfVar2 = (ppxfxbqfkf) this.f14280yggfygwlhe;
                        obj2 = this.f14281zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    ppxfxbqfkfVar = ppxfxbqfkfVar2;
                    objWkgbmnqykc = obj2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        if (thDxjokdxxww instanceof CancellationException) {
                            return wwaezpbzkn.f37140iobyxmoadg;
                        }
                        ppxfxbqfkfVar.s(thDxjokdxxww);
                    }
                    ppxfxbqfkf.this.H(this.f14275esjtqupxsv);
                    ppxfxbqfkf.this.f14203kcexrzcfyt.lqeggnwhkg();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf.this.f14204lereixgezr = this.f14274cqumvgiudr;
                ppxfxbqfkf.this.G(this.f14275esjtqupxsv);
                m01.iobyxmoadg iobyxmoadgVar2 = ppxfxbqfkf.this.f14208oxmwwwfdhm;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f14277jyumaefscl = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                pz0.iobyxmoadg iobyxmoadgVar3 = (pz0.iobyxmoadg) objZoijcleaow;
                String str2 = this.f14278lereixgezr;
                if (str2 == null) {
                    str2 = "";
                }
                DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf();
                r01.btonecajqb.iobyxmoadg iobyxmoadgVar4 = new r01.btonecajqb.iobyxmoadg(iobyxmoadgVar3.wkgbmnqykc(), deliveryCodePpxfxbqfkf, str2, null, ppxfxbqfkf.auzgnhcxok(ppxfxbqfkf.this).getSearchQuery().draadjrbmk(), kotlin.coroutines.jvm.internal.zoijcleaow.wkgbmnqykc(this.f14275esjtqupxsv), ppxfxbqfkf.auzgnhcxok(ppxfxbqfkf.this).getSortType().lqeggnwhkg(), this.f14274cqumvgiudr, null, null, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f14279pmvmpeiblj), 776, null);
                ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                r01.btonecajqb btonecajqbVar = ppxfxbqfkfVar3.f14214wkgbmnqykc;
                this.f14277jyumaefscl = 2;
                objZoijcleaow2 = btonecajqbVar.zoijcleaow(iobyxmoadgVar4, this);
                if (objZoijcleaow2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((ProductListData) objZoijcleaow2);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            i13 = this.f14275esjtqupxsv;
            z13 = this.f14279pmvmpeiblj;
            str = this.f14278lereixgezr;
            list = this.f14274cqumvgiudr;
            ppxfxbqfkfVar = ppxfxbqfkf.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar = new bq0.iobyxmoadg(i13, z13, str, list);
                this.f14281zdlpuopuiu = objWkgbmnqykc;
                this.f14280yggfygwlhe = ppxfxbqfkfVar;
                this.f14277jyumaefscl = 3;
                if (ppxfxbqfkfVar.t((ProductListData) objWkgbmnqykc, i13, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                ppxfxbqfkfVar2 = ppxfxbqfkfVar;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
                objWkgbmnqykc = obj2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                if (thDxjokdxxww instanceof CancellationException) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                ppxfxbqfkfVar.s(thDxjokdxxww);
            }
            ppxfxbqfkf.this.H(this.f14275esjtqupxsv);
            ppxfxbqfkf.this.f14203kcexrzcfyt.lqeggnwhkg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f14282jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f14283yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14284zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(String str, ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14283yggfygwlhe = str;
            this.f14282jyumaefscl = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ojitshcjhn(this.f14283yggfygwlhe, this.f14282jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14284zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    HistoryItemModel historyItemModel = new HistoryItemModel(this.f14283yggfygwlhe);
                    ppxfxbqfkf ppxfxbqfkfVar = this.f14282jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    k01.vdvldrhtss vdvldrhtssVar = ppxfxbqfkfVar.f14195dxjokdxxww;
                    this.f14284zdlpuopuiu = 1;
                    obj = vdvldrhtssVar.ppxfxbqfkf(historyItemModel, this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            w11.iobyxmoadg iobyxmoadgVar3 = w11.iobyxmoadg.f118559iobyxmoadg;
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar3.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14286yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14287zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = ppxfxbqfkf.this.new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f14286yggfygwlhe = obj;
            return oxmwwwfdhmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14287zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.fiwbwshyhd(ppxfxbqfkf.this, 0, false, null, ((i01.iobyxmoadg.C0973iobyxmoadg) this.f14286yggfygwlhe).iobyxmoadg(), 5, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i01.iobyxmoadg.C0973iobyxmoadg c0973iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(c0973iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14289zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.oxmwwwfdhm {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            /* synthetic */ boolean f14290iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ Object f14291jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ boolean f14292yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f14293zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(4, gxszxtbevoVar);
            }

            @Override // tg.oxmwwwfdhm
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ojitshcjhn(((Boolean) obj).booleanValue(), (pz0.iobyxmoadg) obj2, ((Boolean) obj3).booleanValue(), (lg.gxszxtbevo) obj4);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f14293zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                boolean z13 = this.f14292yggfygwlhe;
                return new gg.iwizpuwonk(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13), (pz0.iobyxmoadg) this.f14291jyumaefscl, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f14290iwizpuwonk));
            }

            public final Object ojitshcjhn(boolean z13, pz0.iobyxmoadg iobyxmoadgVar, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f14292yggfygwlhe = z13;
                iobyxmoadgVar2.f14291jyumaefscl = iobyxmoadgVar;
                iobyxmoadgVar2.f14290iwizpuwonk = z14;
                return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX INFO: renamed from: aq0.ppxfxbqfkf$pmvmpeiblj$ppxfxbqfkf, reason: collision with other inner class name */
        public static final class C0221ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f14294zdlpuopuiu;

            /* JADX INFO: renamed from: aq0.ppxfxbqfkf$pmvmpeiblj$ppxfxbqfkf$iobyxmoadg */
            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f14295zdlpuopuiu;

                /* JADX INFO: renamed from: aq0.ppxfxbqfkf$pmvmpeiblj$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C0222iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f14297yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f14298zdlpuopuiu;

                    public C0222iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f14298zdlpuopuiu = obj;
                        this.f14297yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f14295zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C0222iobyxmoadg c0222iobyxmoadg;
                    if (gxszxtbevoVar instanceof C0222iobyxmoadg) {
                        c0222iobyxmoadg = (C0222iobyxmoadg) gxszxtbevoVar;
                        int i13 = c0222iobyxmoadg.f14297yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c0222iobyxmoadg.f14297yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c0222iobyxmoadg = new C0222iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c0222iobyxmoadg = new C0222iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c0222iobyxmoadg.f14298zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c0222iobyxmoadg.f14297yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f14295zdlpuopuiu;
                        if (((Boolean) ((gg.iwizpuwonk) obj).lqeggnwhkg()).booleanValue()) {
                            c0222iobyxmoadg.f14297yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c0222iobyxmoadg) == objGxszxtbevo) {
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

            public C0221ppxfxbqfkf(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f14294zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f14294zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f14299yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ hkdspvbjdz f14300zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
                int f14302esjtqupxsv;

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                /* synthetic */ Object f14303iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                int f14304jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                Object f14305yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f14306zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f14303iwizpuwonk = obj;
                    this.f14302esjtqupxsv |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(hkdspvbjdz hkdspvbjdzVar, ppxfxbqfkf ppxfxbqfkfVar) {
                this.f14300zdlpuopuiu = hkdspvbjdzVar;
                this.f14299yggfygwlhe = ppxfxbqfkfVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.iwizpuwonk iwizpuwonkVar, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar;
                pz0.iobyxmoadg iobyxmoadgVar2;
                int i13;
                zoijcleaow zoijcleaowVar;
                if (gxszxtbevoVar instanceof iobyxmoadg) {
                    iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                    int i14 = iobyxmoadgVar.f14302esjtqupxsv;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f14302esjtqupxsv = i14 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object obj = iobyxmoadgVar.f14303iwizpuwonk;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i15 = iobyxmoadgVar.f14302esjtqupxsv;
                int i16 = 1;
                if (i15 != 0) {
                    if (i15 == 1) {
                        i13 = iobyxmoadgVar.f14304jyumaefscl;
                        iobyxmoadgVar2 = (pz0.iobyxmoadg) iobyxmoadgVar.f14305yggfygwlhe;
                        zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f14306zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                boolean zBooleanValue = ((Boolean) iwizpuwonkVar.iobyxmoadg()).booleanValue();
                iobyxmoadgVar2 = (pz0.iobyxmoadg) iwizpuwonkVar.wkgbmnqykc();
                if (this.f14300zdlpuopuiu.f60015zdlpuopuiu != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue), this.f14300zdlpuopuiu.f60015zdlpuopuiu)) {
                    this.f14299yggfygwlhe.f14197esjtqupxsv = false;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue), this.f14300zdlpuopuiu.f60015zdlpuopuiu)) {
                    i13 = 0;
                    zoijcleaowVar = this;
                } else {
                    this.f14300zdlpuopuiu.f60015zdlpuopuiu = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(zBooleanValue);
                    ppxfxbqfkf ppxfxbqfkfVar = this.f14299yggfygwlhe;
                    iobyxmoadgVar.f14306zdlpuopuiu = this;
                    iobyxmoadgVar.f14305yggfygwlhe = iobyxmoadgVar2;
                    iobyxmoadgVar.f14304jyumaefscl = 1;
                    iobyxmoadgVar.f14302esjtqupxsv = 1;
                    if (ppxfxbqfkfVar.w(iobyxmoadgVar) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                    i13 = 1;
                }
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaowVar.f14299yggfygwlhe.grlcpdaxtj(), iobyxmoadgVar2)) {
                    i16 = i13;
                } else {
                    zoijcleaowVar.f14299yggfygwlhe.B(iobyxmoadgVar2);
                    tg.iobyxmoadg iobyxmoadgVarFyldjkxazc = zoijcleaowVar.f14299yggfygwlhe.fyldjkxazc();
                    if (iobyxmoadgVarFyldjkxazc != null) {
                        iobyxmoadgVarFyldjkxazc.invoke();
                    }
                }
                if (i16 == 0 || mj.kcexrzcfyt.p(ppxfxbqfkf.auzgnhcxok(zoijcleaowVar.f14299yggfygwlhe).getSearchQuery().draadjrbmk()).toString().length() < 2) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f14299yggfygwlhe;
                tzroggbefp searchQuery = ppxfxbqfkf.auzgnhcxok(ppxfxbqfkfVar2).getSearchQuery();
                iobyxmoadgVar.f14306zdlpuopuiu = null;
                iobyxmoadgVar.f14305yggfygwlhe = null;
                iobyxmoadgVar.f14302esjtqupxsv = 2;
                if (ppxfxbqfkfVar2.y(searchQuery, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        pmvmpeiblj(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new pmvmpeiblj(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14289zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
                ylkuphrtab ylkuphrtabVar = ppxfxbqfkf.this.f14196eablkybsjg;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                C0221ppxfxbqfkf c0221ppxfxbqfkf = new C0221ppxfxbqfkf(sj.dxjokdxxww.draadjrbmk((sj.lqeggnwhkg) ylkuphrtabVar.zoijcleaow(wwaezpbzknVar), ppxfxbqfkf.this.f14191agtfadlqog.zoijcleaow(wwaezpbzknVar), ppxfxbqfkf.this.fmlbqenlif(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(hkdspvbjdzVar, ppxfxbqfkf.this);
                this.f14289zdlpuopuiu = 1;
                if (c0221ppxfxbqfkf.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((pmvmpeiblj) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: aq0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0223ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14308zdlpuopuiu;

        C0223ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new C0223ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14308zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                this.f14308zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.wizcaqwiak(this) == objGxszxtbevo) {
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
            return ((C0223ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f14309jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14311zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f14309jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new rgvfuqvkyq(this.f14309jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14311zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarJrbgnlbqoe = ppxfxbqfkf.this.jrbgnlbqoe();
                ChangeProductParams changeProductParams = this.f14309jyumaefscl;
                this.f14311zdlpuopuiu = 1;
                if (btonecajqbVarJrbgnlbqoe.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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

    public static final class vdvldrhtss implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f14312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f14313zdlpuopuiu;

        public static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f14314yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f14315zdlpuopuiu;

            /* JADX INFO: renamed from: aq0.ppxfxbqfkf$vdvldrhtss$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C0224iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f14317yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f14318zdlpuopuiu;

                public C0224iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f14318zdlpuopuiu = obj;
                    this.f14317yggfygwlhe |= Integer.MIN_VALUE;
                    return iobyxmoadg.this.emit(null, this);
                }
            }

            public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, ppxfxbqfkf ppxfxbqfkfVar) {
                this.f14315zdlpuopuiu = nufgyqmvbuVar;
                this.f14314yggfygwlhe = ppxfxbqfkfVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C0224iobyxmoadg c0224iobyxmoadg;
                if (gxszxtbevoVar instanceof C0224iobyxmoadg) {
                    c0224iobyxmoadg = (C0224iobyxmoadg) gxszxtbevoVar;
                    int i13 = c0224iobyxmoadg.f14317yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c0224iobyxmoadg.f14317yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c0224iobyxmoadg = new C0224iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c0224iobyxmoadg = new C0224iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c0224iobyxmoadg.f14318zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c0224iobyxmoadg.f14317yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f14315zdlpuopuiu;
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((i01.iobyxmoadg.C0973iobyxmoadg) obj).zoijcleaow(), this.f14314yggfygwlhe.f14209pmvmpeiblj)) {
                        c0224iobyxmoadg.f14317yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c0224iobyxmoadg) == objGxszxtbevo) {
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

        public vdvldrhtss(sj.lqeggnwhkg lqeggnwhkgVar, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f14313zdlpuopuiu = lqeggnwhkgVar;
            this.f14312yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f14313zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar, this.f14312yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f14319cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f14321iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f14322jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f14323lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14324yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14325zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14319cqumvgiudr = obj;
            this.f14323lereixgezr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.t(null, 0, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ aq0.gxszxtbevo f14326jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14328zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(aq0.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
            super(2, gxszxtbevoVar2);
            this.f14326jyumaefscl = gxszxtbevoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new wkgbmnqykc(this.f14326jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f14328zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                String strZoijcleaow = ((aq0.gxszxtbevo.dxjokdxxww) this.f14326jyumaefscl).zoijcleaow();
                String strIobyxmoadg = ((aq0.gxszxtbevo.dxjokdxxww) this.f14326jyumaefscl).iobyxmoadg();
                String strPpxfxbqfkf = ((aq0.gxszxtbevo.dxjokdxxww) this.f14326jyumaefscl).ppxfxbqfkf();
                boolean zWkgbmnqykc = ((aq0.gxszxtbevo.dxjokdxxww) this.f14326jyumaefscl).wkgbmnqykc();
                boolean zEablkybsjg = ((aq0.gxszxtbevo.dxjokdxxww) this.f14326jyumaefscl).eablkybsjg();
                this.f14328zdlpuopuiu = 1;
                if (ppxfxbqfkfVar.d(strZoijcleaow, strIobyxmoadg, strPpxfxbqfkf, zWkgbmnqykc, zEablkybsjg, this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14330yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14331zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14331zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.s((Throwable) this.f14330yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = ppxfxbqfkf.this.new yggfygwlhe(gxszxtbevoVar);
            yggfygwlheVar.f14330yggfygwlhe = th2;
            return yggfygwlheVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14333yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14334zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zdlpuopuiu zdlpuopuiuVar = ppxfxbqfkf.this.new zdlpuopuiu(gxszxtbevoVar);
            zdlpuopuiuVar.f14333yggfygwlhe = obj;
            return zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14334zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f14333yggfygwlhe;
            ppxfxbqfkf.this.skhdrjzrfn(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f14336esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f14337iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f14338jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f14339yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f14340zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f14337iwizpuwonk = obj;
            this.f14336esjtqupxsv |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.dvvnrvtcbc(null, this);
        }
    }

    static final class zynmafqrjb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f14342yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f14343zdlpuopuiu;

        zynmafqrjb(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f14343zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ppxfxbqfkf.this.s((Throwable) this.f14342yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            zynmafqrjb zynmafqrjbVar = ppxfxbqfkf.this.new zynmafqrjb(gxszxtbevoVar);
            zynmafqrjbVar.f14342yggfygwlhe = th2;
            return zynmafqrjbVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(r01.btonecajqb getProductsUseCase, ylkuphrtab subscribeuserIsAuthUseCase, ow1.zoijcleaow changeAdultCheckedUseCase, ow1.iwizpuwonk isAdultCheckedUseCase, p01.btonecajqb subscribeToOrderDeliveryPriceUseCase, k01.vdvldrhtss searchHistoryRepository, r01.gtknphoqwx setIsProductsGridUseCase, m01.gxszxtbevo getOrderDeliveryType, i01.iobyxmoadg changeCatalogFiltersObserver, dz0.gtknphoqwx productChangesSourceProvider, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, ek1.iobyxmoadg purchasesListComponentApi, lw1.iobyxmoadg changeFavoritesInteractor, t81.iobyxmoadg featureManager, m01.iobyxmoadg getCurrentDeliveryDataUseCase, aq0.iobyxmoadg analyticsHelper, ow1.esjtqupxsv isAuthUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductsUseCase, "getProductsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeuserIsAuthUseCase, "subscribeuserIsAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeAdultCheckedUseCase, "changeAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAdultCheckedUseCase, "isAdultCheckedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(searchHistoryRepository, "searchHistoryRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setIsProductsGridUseCase, "setIsProductsGridUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getOrderDeliveryType, "getOrderDeliveryType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeCatalogFiltersObserver, "changeCatalogFiltersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsHelper, "analyticsHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f14210ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f14214wkgbmnqykc = getProductsUseCase;
        this.f14196eablkybsjg = subscribeuserIsAuthUseCase;
        this.f14199gxszxtbevo = changeAdultCheckedUseCase;
        this.f14205lqeggnwhkg = isAdultCheckedUseCase;
        this.f14206nufgyqmvbu = subscribeToOrderDeliveryPriceUseCase;
        this.f14195dxjokdxxww = searchHistoryRepository;
        this.f14192btonecajqb = setIsProductsGridUseCase;
        this.f14198gtknphoqwx = getOrderDeliveryType;
        this.f14194draadjrbmk = changeCatalogFiltersObserver;
        this.f14213wflxmlrfwp = productChangesSourceProvider;
        this.f14191agtfadlqog = subscribeToCurrentDeliveryDataUseCase;
        this.f14207ojitshcjhn = purchasesListComponentApi;
        this.f14211rgvfuqvkyq = changeFavoritesInteractor;
        this.f14212vdvldrhtss = featureManager;
        this.f14208oxmwwwfdhm = getCurrentDeliveryDataUseCase;
        this.f14203kcexrzcfyt = analyticsHelper;
        this.f14216zdlpuopuiu = isAuthUseCase;
        this.f14215yggfygwlhe = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: aq0.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ppxfxbqfkf.v(this.f14346zdlpuopuiu);
            }
        });
        this.f14201iwizpuwonk = sj.wwaezpbzkn.zoijcleaow(0, 0, null, 7, null);
        this.f14197esjtqupxsv = ((Boolean) isAdultCheckedUseCase.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue();
    }

    private final void A(String str) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(str, this, null), 3, null);
        }
    }

    private final void E() {
        ulzqkzuiru(new aq0.nufgyqmvbu.lqeggnwhkg(true));
    }

    private final void F() {
        ulzqkzuiru(new aq0.nufgyqmvbu.C0219nufgyqmvbu(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i13) {
        if (i13 == 1) {
            E();
        } else {
            F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int i13) {
        if (i13 == 1) {
            rhgxfdycjh();
        } else {
            yzdjzghtvl();
        }
    }

    private final void I() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(new vdvldrhtss(this.f14194draadjrbmk.nufgyqmvbu(), this), new oxmwwwfdhm(null)), new kcexrzcfyt(null)), sopmlzcsov());
    }

    private final void J() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f14211rgvfuqvkyq.dxjokdxxww(), new zdlpuopuiu(null)), new yggfygwlhe(null)), sopmlzcsov());
    }

    private final void K() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(new jyumaefscl(sj.dxjokdxxww.wflxmlrfwp(jrbgnlbqoe().iobyxmoadg(), fmlbqenlif(), new iwizpuwonk(null))), new cqumvgiudr(null)), sopmlzcsov());
    }

    private final void L() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(fmlbqenlif(), new esjtqupxsv(null, this)), new lereixgezr(null)), sopmlzcsov());
    }

    private final void M() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new pmvmpeiblj(null), 3, null);
    }

    private final void N(boolean z13) {
        if (z13) {
            p01.btonecajqb btonecajqbVar = this.f14206nufgyqmvbu;
            String orderEditId = mhtqkkgtqm().getOrderEditId();
            if (orderEditId == null) {
                orderEditId = "";
            }
            sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.gxszxtbevo(btonecajqbVar.zoijcleaow(orderEditId), new zynmafqrjb(null)), new istkbnxepw(null)), sopmlzcsov());
        }
    }

    private final void O() {
        sj.pmvmpeiblj pmvmpeibljVar = this.f14201iwizpuwonk;
        nj.iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = nj.iobyxmoadg.f70173yggfygwlhe;
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.vdvldrhtss(sj.dxjokdxxww.rgvfuqvkyq(pmvmpeibljVar, nj.ppxfxbqfkf.kcexrzcfyt(500, nj.wkgbmnqykc.MILLISECONDS))), new cdpycssgdh(this)), sopmlzcsov());
    }

    private final void a() {
        boolean z13 = !((State) jlmebxxoox()).getIsGridType();
        this.f14192btonecajqb.zoijcleaow(new r01.gtknphoqwx.iobyxmoadg(z13));
        ulzqkzuiru(new aq0.nufgyqmvbu.eablkybsjg(z13));
    }

    private final boolean ageimvtcrz(String str) {
        return mj.kcexrzcfyt.p(str).toString().length() >= 2;
    }

    public static final /* synthetic */ State auzgnhcxok(ppxfxbqfkf ppxfxbqfkfVar) {
        return (State) ppxfxbqfkfVar.jlmebxxoox();
    }

    private final void b() {
        this.f14193cqumvgiudr = ((State) jlmebxxoox()).getSearchQuery().draadjrbmk();
        this.f14204lereixgezr = null;
        ulzqkzuiru(aq0.nufgyqmvbu.wflxmlrfwp.f14183iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        w11.iobyxmoadg iobyxmoadgVar;
        Object obj;
        w11.iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f14223cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f14223cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object objWkgbmnqykc2 = btonecajqbVar.f14225jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f14223cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) btonecajqbVar.f14227zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc2);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (w11.iobyxmoadg) btonecajqbVar.f14226yggfygwlhe;
                obj = btonecajqbVar.f14227zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc2);
            }
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc2);
        ulzqkzuiru(new aq0.nufgyqmvbu.agtfadlqog(str));
        HistoryItemModel historyItemModel = new HistoryItemModel(str);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            k01.vdvldrhtss vdvldrhtssVar = this.f14195dxjokdxxww;
            btonecajqbVar.f14227zdlpuopuiu = this;
            btonecajqbVar.f14223cqumvgiudr = 1;
            objWkgbmnqykc2 = vdvldrhtssVar.wkgbmnqykc(historyItemModel, btonecajqbVar);
            if (objWkgbmnqykc2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } catch (Throwable th3) {
            th = th3;
            ppxfxbqfkfVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objWkgbmnqykc2).booleanValue()));
        iobyxmoadgVar = w11.iobyxmoadg.f118559iobyxmoadg;
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc) && !((Boolean) objWkgbmnqykc).booleanValue()) {
            btonecajqbVar.f14227zdlpuopuiu = objWkgbmnqykc;
            btonecajqbVar.f14226yggfygwlhe = iobyxmoadgVar;
            btonecajqbVar.f14223cqumvgiudr = 2;
            if (ppxfxbqfkfVar.w(btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar = iobyxmoadgVar2;
            objWkgbmnqykc = obj;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(String str, String str2, String str3, boolean z13, boolean z14, lg.gxszxtbevo gxszxtbevoVar) {
        skhdrjzrfn(str, !z13);
        Object objLqeggnwhkg = this.f14211rgvfuqvkyq.lqeggnwhkg(str, z13, this.f14203kcexrzcfyt.iobyxmoadg(str2, str3, z14, ezmngbhpjk((State) jlmebxxoox())), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dvvnrvtcbc(ProductUiModel productUiModel, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object next;
        ProductUiModel productUiModel2;
        ProductUIData productUIData;
        Throwable th2;
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        MeasureType currentMeasure;
        double basketDefault;
        MeasureType measureType;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f14336esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f14336esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f14337iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f14336esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            E();
            Iterator it = ((State) jlmebxxoox()).getCartProductDataList().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
            ProductUIData productUIData2 = (ProductUIData) next;
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar2 = this.f14207ojitshcjhn;
                zoijcleaowVar.f14340zdlpuopuiu = this;
                zoijcleaowVar.f14339yggfygwlhe = productUiModel;
                zoijcleaowVar.f14338jyumaefscl = productUIData2;
                zoijcleaowVar.f14336esjtqupxsv = 1;
                Object objZoijcleaow = iobyxmoadgVar2.zoijcleaow(zoijcleaowVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                productUiModel2 = productUiModel;
                productUIData = productUIData2;
                obj = objZoijcleaow;
                ppxfxbqfkfVar = this;
            } catch (Throwable th3) {
                productUiModel2 = productUiModel;
                productUIData = productUIData2;
                th2 = th3;
                ppxfxbqfkfVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productUIData = (ProductUIData) zoijcleaowVar.f14338jyumaefscl;
            productUiModel2 = (ProductUiModel) zoijcleaowVar.f14339yggfygwlhe;
            ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f14340zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th4) {
                th2 = th4;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) obj);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            List list = (List) objWkgbmnqykc;
            if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.mbcevpiqjq(productUiModel2.getMeasureTypeModel())) == null) {
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
            ppxfxbqfkfVar.crxdokpmqz(new aq0.lqeggnwhkg.nufgyqmvbu(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list)));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ppxfxbqfkfVar.s(thDxjokdxxww);
        }
        ppxfxbqfkfVar.rhgxfdycjh();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void e(String str, String str2, k21.ojitshcjhn ojitshcjhnVar, String str3) {
        crxdokpmqz(new aq0.lqeggnwhkg.ppxfxbqfkf(ojitshcjhnVar, str3, this.f14203kcexrzcfyt.ppxfxbqfkf(str, str2)));
    }

    private final void eslsurpljm(ProductUiModel productUiModel) {
        if (((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(productUiModel, null), 3, null);
        } else {
            crxdokpmqz(aq0.lqeggnwhkg.wkgbmnqykc.f14163iobyxmoadg);
        }
    }

    private final String ezmngbhpjk(State state) {
        String strDraadjrbmk = state.getSearchQuery().draadjrbmk();
        if (strDraadjrbmk.length() >= 2) {
            return strDraadjrbmk;
        }
        return null;
    }

    private final void f() {
        this.f14203kcexrzcfyt.nufgyqmvbu();
        String str = this.f14209pmvmpeiblj;
        String strDraadjrbmk = ((State) jlmebxxoox()).getSearchQuery().draadjrbmk();
        if (str != null && str.length() != 0) {
            strDraadjrbmk = null;
        }
        crxdokpmqz(new aq0.lqeggnwhkg.eablkybsjg(strDraadjrbmk, str, this.f14204lereixgezr));
    }

    static /* synthetic */ void fiwbwshyhd(ppxfxbqfkf ppxfxbqfkfVar, int i13, boolean z13, String str, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 1;
        }
        if ((i14 & 4) != 0) {
            str = null;
        }
        if ((i14 & 8) != 0) {
            list = ppxfxbqfkfVar.f14204lereixgezr;
        }
        ppxfxbqfkfVar.hszhottldk(i13, z13, str, list);
    }

    private final void g(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        crxdokpmqz(new aq0.lqeggnwhkg.btonecajqb(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, AnalyticsPage.Search.f92373iwizpuwonk, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        w11.iobyxmoadg iobyxmoadgVar;
        Object obj;
        w11.iobyxmoadg iobyxmoadgVar2;
        Throwable thDxjokdxxww;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f14243cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f14243cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        Object objIobyxmoadg = gtknphoqwxVar.f14245jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gtknphoqwxVar.f14243cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) gtknphoqwxVar.f14247zdlpuopuiu;
                try {
                    gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                } catch (Throwable th2) {
                    th = th2;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar2 = (w11.iobyxmoadg) gtknphoqwxVar.f14246yggfygwlhe;
                obj = gtknphoqwxVar.f14247zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            objWkgbmnqykc = obj;
            iobyxmoadgVar = iobyxmoadgVar2;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        ulzqkzuiru(aq0.nufgyqmvbu.draadjrbmk.f14167iobyxmoadg);
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            k01.vdvldrhtss vdvldrhtssVar = this.f14195dxjokdxxww;
            gtknphoqwxVar.f14247zdlpuopuiu = this;
            gtknphoqwxVar.f14243cqumvgiudr = 1;
            objIobyxmoadg = vdvldrhtssVar.iobyxmoadg(gtknphoqwxVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } catch (Throwable th3) {
            th = th3;
            ppxfxbqfkfVar = this;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((Boolean) objIobyxmoadg).booleanValue()));
        iobyxmoadgVar = w11.iobyxmoadg.f118559iobyxmoadg;
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc) && !((Boolean) objWkgbmnqykc).booleanValue()) {
            gtknphoqwxVar.f14247zdlpuopuiu = objWkgbmnqykc;
            gtknphoqwxVar.f14246yggfygwlhe = iobyxmoadgVar;
            gtknphoqwxVar.f14243cqumvgiudr = 2;
            if (ppxfxbqfkfVar.w(gtknphoqwxVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            obj = objWkgbmnqykc;
            iobyxmoadgVar2 = iobyxmoadgVar;
            objWkgbmnqykc = obj;
            iobyxmoadgVar = iobyxmoadgVar2;
        }
        thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.zoijcleaow(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void hszhottldk(int i13, boolean z13, String str, List list) {
        auzgnhcxok auzgnhcxokVar = this.f14202jyumaefscl;
        if (auzgnhcxokVar != null) {
            cr0.iobyxmoadg.iobyxmoadg(auzgnhcxokVar);
        }
        this.f14202jyumaefscl = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(list, i13, str, z13, null), 3, null);
    }

    private final void i(String str) {
        this.f14193cqumvgiudr = ((State) jlmebxxoox()).getSearchQuery().draadjrbmk();
        ulzqkzuiru(new aq0.nufgyqmvbu.dxjokdxxww(new tzroggbefp(str, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null)));
        fiwbwshyhd(this, 1, true, null, null, 12, null);
        this.f14203kcexrzcfyt.dxjokdxxww(str);
    }

    private final Object ipoelvxyzq(lg.gxszxtbevo gxszxtbevoVar) {
        SearchPayload payload = ((State) jlmebxxoox()).getPayload();
        mz0.iobyxmoadg flow = payload.getFlow();
        String orderEditId = payload.getOrderEditId();
        pz0.iobyxmoadg iobyxmoadgVarGrlcpdaxtj = grlcpdaxtj();
        return this.f14198gtknphoqwx.zoijcleaow(new m01.gxszxtbevo.iobyxmoadg(flow, iobyxmoadgVarGrlcpdaxtj != null ? iobyxmoadgVarGrlcpdaxtj.ppxfxbqfkf() : null, orderEditId), gxszxtbevoVar);
    }

    private final dz0.btonecajqb.iobyxmoadg ixidwrxhsl(SearchPayload searchPayload) {
        String orderEditId = searchPayload.getOrderEditId();
        return (searchPayload.getFlow() != mz0.iobyxmoadg.ORDER_EDIT || orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? dz0.btonecajqb.iobyxmoadg.zoijcleaow.f29973iobyxmoadg : new dz0.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId);
    }

    private final void j() {
        State state = (State) jlmebxxoox();
        auzgnhcxok auzgnhcxokVar = this.f14202jyumaefscl;
        boolean z13 = false;
        if (auzgnhcxokVar != null && !auzgnhcxokVar.agtfadlqog()) {
            z13 = true;
        }
        int currentPage = state.getCurrentPage();
        ProductListData productListData = state.getProductListData();
        Paging paging = productListData != null ? productListData.getPaging() : null;
        if ((paging == null || currentPage < paging.getPagesCount()) && !z13) {
            fiwbwshyhd(this, currentPage + 1, false, null, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb jrbgnlbqoe() {
        return (dz0.btonecajqb) this.f14215yggfygwlhe.getValue();
    }

    private final void k(ProductUiModel productUiModel, ProductCardEvent productCardEvent, boolean z13) {
        Object next;
        List limits;
        List limits2;
        Object rgvfuqvkyqVar;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                rgvfuqvkyqVar = new aq0.nufgyqmvbu.iobyxmoadg(productUiModel.getId());
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                rgvfuqvkyqVar = new aq0.nufgyqmvbu.rgvfuqvkyq(productUiModel.getId());
            }
            ulzqkzuiru(rgvfuqvkyqVar);
            return;
        }
        A(productUiModel.getName());
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        Iterator it = ((State) jlmebxxoox()).getCartProductDataList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), productUiModel.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        String id2 = productUiModel.getId();
        String article = productUiModel.getArticle();
        boolean isAvailableToBuy = productUiModel.getAvailabilityModel().getIsAvailableToBuy();
        boolean isPmProduct = productUiModel.getIsPmProduct();
        MeasureTypeModel measureTypeModel = productUiModel.getMeasureTypeModel();
        Double avgWeight = productUiModel.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = q11.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = productUiModel.getLimits();
        }
        istkbnxepw(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, measureTypeModel, avgWeight, limits, this.f14203kcexrzcfyt.zoijcleaow(productUiModel.getName(), z13, ezmngbhpjk((State) jlmebxxoox()))), mhtqkkgtqm().getFlow() == mz0.iobyxmoadg.ORDER_EDIT);
    }

    private final void krqnebusok(bq0.iobyxmoadg iobyxmoadgVar) {
        this.f14199gxszxtbevo.zoijcleaow(Boolean.TRUE);
        this.f14197esjtqupxsv = true;
        hszhottldk(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.zoijcleaow());
    }

    private final void l(String str, String str2, String str3, boolean z13) {
        A(str3);
        if (z13) {
            this.f14203kcexrzcfyt.wflxmlrfwp(str2, str3, ezmngbhpjk((State) jlmebxxoox()));
        } else {
            this.f14203kcexrzcfyt.draadjrbmk(str2, str3);
        }
        crxdokpmqz(new aq0.lqeggnwhkg.gxszxtbevo(str, mhtqkkgtqm().getOrderEditId()));
    }

    private final void m(SearchCategoryUiModel searchCategoryUiModel) {
        x(searchCategoryUiModel);
        aq0.iobyxmoadg iobyxmoadgVar = this.f14203kcexrzcfyt;
        String id2 = searchCategoryUiModel.getId();
        if (id2 == null) {
            id2 = "";
        }
        String title = searchCategoryUiModel.getTitle();
        iobyxmoadgVar.ojitshcjhn(id2, title != null ? title : "");
    }

    private final SearchPayload mhtqkkgtqm() {
        return ((State) jlmebxxoox()).getPayload();
    }

    private final void n(tzroggbefp tzroggbefpVar) {
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(tzroggbefpVar.draadjrbmk(), ((State) jlmebxxoox()).getSearchQuery().draadjrbmk())) {
            if (mj.kcexrzcfyt.p(tzroggbefpVar.draadjrbmk()).toString().length() < 2) {
                ulzqkzuiru(aq0.nufgyqmvbu.gtknphoqwx.f14170iobyxmoadg);
            }
            ulzqkzuiru(new aq0.nufgyqmvbu.lqeggnwhkg(mj.kcexrzcfyt.p(tzroggbefpVar.draadjrbmk()).toString().length() >= 2));
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(tzroggbefpVar, null), 3, null);
        }
        ulzqkzuiru(new aq0.nufgyqmvbu.dxjokdxxww(tzroggbefpVar));
    }

    private final void o(String str) {
        z(str);
        this.f14203kcexrzcfyt.rgvfuqvkyq(str);
    }

    private final void p() {
        String strDraadjrbmk = ((State) jlmebxxoox()).getSearchQuery().draadjrbmk();
        if (strDraadjrbmk.length() >= 2) {
            A(strDraadjrbmk);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strDraadjrbmk, this.f14193cqumvgiudr)) {
            return;
        }
        this.f14193cqumvgiudr = strDraadjrbmk;
        this.f14203kcexrzcfyt.vdvldrhtss(strDraadjrbmk);
    }

    private final void q() {
        crxdokpmqz(new aq0.lqeggnwhkg.draadjrbmk(((State) jlmebxxoox()).getSortType(), mz0.wkgbmnqykc.iobyxmoadg(mz0.ppxfxbqfkf.f68192yggfygwlhe)));
    }

    private final void r(mz0.ppxfxbqfkf ppxfxbqfkfVar) {
        if (((State) jlmebxxoox()).getSortType() == ppxfxbqfkfVar) {
            return;
        }
        ulzqkzuiru(new aq0.nufgyqmvbu.btonecajqb(ppxfxbqfkfVar));
        fiwbwshyhd(this, 0, false, null, null, 13, null);
    }

    private final void rhgxfdycjh() {
        ulzqkzuiru(new aq0.nufgyqmvbu.lqeggnwhkg(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Throwable th2) {
        w11.iobyxmoadg.f118559iobyxmoadg.zoijcleaow(th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn(String str, boolean z13) {
        ulzqkzuiru(new aq0.nufgyqmvbu.ppxfxbqfkf(str, z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(ProductListData productListData, int i13, bq0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i14 = wflxmlrfwpVar.f14323lereixgezr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f14323lereixgezr = i14 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object objIpoelvxyzq = wflxmlrfwpVar.f14319cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wflxmlrfwpVar.f14323lereixgezr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIpoelvxyzq);
            boolean z13 = (((Boolean) this.f14205lqeggnwhkg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() || this.f14197esjtqupxsv) ? false : true;
            if (productListData.getIsAgeCheckNeeded() && z13) {
                crxdokpmqz(new aq0.lqeggnwhkg.C0218lqeggnwhkg(iobyxmoadgVar));
            } else {
                wflxmlrfwpVar.f14325zdlpuopuiu = this;
                wflxmlrfwpVar.f14324yggfygwlhe = iobyxmoadgVar;
                wflxmlrfwpVar.f14322jyumaefscl = productListData;
                wflxmlrfwpVar.f14321iwizpuwonk = i13;
                wflxmlrfwpVar.f14323lereixgezr = 1;
                objIpoelvxyzq = ipoelvxyzq(wflxmlrfwpVar);
                if (objIpoelvxyzq == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar = this;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i13 = wflxmlrfwpVar.f14321iwizpuwonk;
        productListData = (ProductListData) wflxmlrfwpVar.f14322jyumaefscl;
        iobyxmoadgVar = (bq0.iobyxmoadg) wflxmlrfwpVar.f14324yggfygwlhe;
        ppxfxbqfkfVar = (ppxfxbqfkf) wflxmlrfwpVar.f14325zdlpuopuiu;
        gg.zdlpuopuiu.zoijcleaow(objIpoelvxyzq);
        ppxfxbqfkfVar.ulzqkzuiru(new aq0.nufgyqmvbu.ojitshcjhn(productListData, (DeliveryCode) objIpoelvxyzq, i13, !iobyxmoadgVar.ppxfxbqfkf()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new aq0.lqeggnwhkg.agtfadlqog(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb v(ppxfxbqfkf ppxfxbqfkfVar) {
        return ppxfxbqfkfVar.f14213wflxmlrfwp.iobyxmoadg(ppxfxbqfkfVar.ixidwrxhsl(ppxfxbqfkfVar.mhtqkkgtqm()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(lg.gxszxtbevo gxszxtbevoVar) {
        agtfadlqog agtfadlqogVar;
        int i13;
        Throwable th2;
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof agtfadlqog) {
            agtfadlqogVar = (agtfadlqog) gxszxtbevoVar;
            int i14 = agtfadlqogVar.f14218cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                agtfadlqogVar.f14218cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
            }
        } else {
            agtfadlqogVar = new agtfadlqog(gxszxtbevoVar);
        }
        Object obj = agtfadlqogVar.f14220jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = agtfadlqogVar.f14218cqumvgiudr;
        if (i15 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            State state = (State) jlmebxxoox();
            int i16 = (mj.kcexrzcfyt.p(state.getSearchQuery().draadjrbmk()).toString().length() < 2 && state.getIsSearchSuggestionsEnabled() && ((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) ? 1 : 0;
            if (i16 == 0) {
                ulzqkzuiru(aq0.nufgyqmvbu.draadjrbmk.f14167iobyxmoadg);
            }
            E();
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                k01.vdvldrhtss vdvldrhtssVar = this.f14195dxjokdxxww;
                agtfadlqogVar.f14222zdlpuopuiu = this;
                agtfadlqogVar.f14221yggfygwlhe = i16;
                agtfadlqogVar.f14218cqumvgiudr = 1;
                Object objZoijcleaow = vdvldrhtssVar.zoijcleaow(agtfadlqogVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i13 = i16;
                obj = objZoijcleaow;
                ppxfxbqfkfVar = this;
            } catch (Throwable th3) {
                i13 = i16;
                th2 = th3;
                ppxfxbqfkfVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = agtfadlqogVar.f14221yggfygwlhe;
            ppxfxbqfkfVar = (ppxfxbqfkf) agtfadlqogVar.f14222zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th4) {
                th2 = th4;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((SearchHistoryModel) obj);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            SearchHistoryModel searchHistoryModel = (SearchHistoryModel) objWkgbmnqykc;
            List history = searchHistoryModel.getHistory();
            if (i13 == 0) {
                history = null;
            }
            if (history == null) {
                history = hg.jyumaefscl.wflxmlrfwp();
            }
            ppxfxbqfkfVar.ulzqkzuiru(new aq0.nufgyqmvbu.gxszxtbevo(history, searchHistoryModel.getRecommendations()));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            ppxfxbqfkfVar.s(thDxjokdxxww);
        }
        ppxfxbqfkfVar.rhgxfdycjh();
        ppxfxbqfkfVar.f14203kcexrzcfyt.gxszxtbevo();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wizcaqwiak(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        boolean z13;
        ppxfxbqfkf ppxfxbqfkfVar2;
        boolean zBooleanValue;
        Object objPpxfxbqfkf;
        boolean z14;
        boolean z15;
        boolean zBooleanValue2;
        Object objPpxfxbqfkf2;
        boolean z16;
        boolean z17;
        ppxfxbqfkf ppxfxbqfkfVar3;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f14271lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f14271lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf3 = lqeggnwhkgVar.f14267cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f14271lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                ppxfxbqfkfVar = (ppxfxbqfkf) lqeggnwhkgVar.f14273zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf3);
            } else if (i14 == 2) {
                z13 = lqeggnwhkgVar.f14272yggfygwlhe;
                ppxfxbqfkfVar2 = (ppxfxbqfkf) lqeggnwhkgVar.f14273zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf3);
                zBooleanValue = ((Boolean) objPpxfxbqfkf3).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar = ppxfxbqfkfVar2.f14212vdvldrhtss;
                s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105737mbcevpiqjq;
                lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar2;
                lqeggnwhkgVar.f14272yggfygwlhe = z13;
                lqeggnwhkgVar.f14270jyumaefscl = zBooleanValue;
                lqeggnwhkgVar.f14271lereixgezr = 3;
                objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, lqeggnwhkgVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                boolean z18 = z13;
                z14 = zBooleanValue;
                objPpxfxbqfkf3 = objPpxfxbqfkf;
                z15 = z18;
                zBooleanValue2 = ((Boolean) objPpxfxbqfkf3).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkfVar2.f14212vdvldrhtss;
                s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105744tzroggbefp;
                lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar2;
                lqeggnwhkgVar.f14272yggfygwlhe = z15;
                lqeggnwhkgVar.f14270jyumaefscl = z14;
                lqeggnwhkgVar.f14269iwizpuwonk = zBooleanValue2;
                lqeggnwhkgVar.f14271lereixgezr = 4;
                objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, lqeggnwhkgVar);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z16 = zBooleanValue2;
                objPpxfxbqfkf3 = objPpxfxbqfkf2;
                z17 = z15;
                ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
            } else if (i14 == 3) {
                z14 = lqeggnwhkgVar.f14270jyumaefscl;
                z15 = lqeggnwhkgVar.f14272yggfygwlhe;
                ppxfxbqfkfVar2 = (ppxfxbqfkf) lqeggnwhkgVar.f14273zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf3);
                zBooleanValue2 = ((Boolean) objPpxfxbqfkf3).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar5 = ppxfxbqfkfVar2.f14212vdvldrhtss;
                s81.iobyxmoadg iobyxmoadgVar6 = s81.iobyxmoadg.f105744tzroggbefp;
                lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar2;
                lqeggnwhkgVar.f14272yggfygwlhe = z15;
                lqeggnwhkgVar.f14270jyumaefscl = z14;
                lqeggnwhkgVar.f14269iwizpuwonk = zBooleanValue2;
                lqeggnwhkgVar.f14271lereixgezr = 4;
                objPpxfxbqfkf2 = iobyxmoadgVar5.ppxfxbqfkf(iobyxmoadgVar6, lqeggnwhkgVar);
                if (objPpxfxbqfkf2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z16 = zBooleanValue2;
                objPpxfxbqfkf3 = objPpxfxbqfkf2;
                z17 = z15;
                ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z16 = lqeggnwhkgVar.f14269iwizpuwonk;
                z14 = lqeggnwhkgVar.f14270jyumaefscl;
                z17 = lqeggnwhkgVar.f14272yggfygwlhe;
                ppxfxbqfkfVar3 = (ppxfxbqfkf) lqeggnwhkgVar.f14273zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf3);
            }
            ppxfxbqfkfVar3.ulzqkzuiru(new aq0.nufgyqmvbu.wkgbmnqykc(z17, z14, z16, ((Boolean) objPpxfxbqfkf3).booleanValue()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf3);
        t81.iobyxmoadg iobyxmoadgVar7 = this.f14212vdvldrhtss;
        s81.iobyxmoadg iobyxmoadgVar8 = s81.iobyxmoadg.f105724esjtqupxsv;
        lqeggnwhkgVar.f14273zdlpuopuiu = this;
        lqeggnwhkgVar.f14271lereixgezr = 1;
        objPpxfxbqfkf3 = iobyxmoadgVar7.ppxfxbqfkf(iobyxmoadgVar8, lqeggnwhkgVar);
        if (objPpxfxbqfkf3 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        boolean zBooleanValue3 = ((Boolean) objPpxfxbqfkf3).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar9 = ppxfxbqfkfVar.f14212vdvldrhtss;
        s81.iobyxmoadg iobyxmoadgVar10 = s81.iobyxmoadg.f105732jpowsppfya;
        lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar;
        lqeggnwhkgVar.f14272yggfygwlhe = zBooleanValue3;
        lqeggnwhkgVar.f14271lereixgezr = 2;
        Object objPpxfxbqfkf4 = iobyxmoadgVar9.ppxfxbqfkf(iobyxmoadgVar10, lqeggnwhkgVar);
        if (objPpxfxbqfkf4 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkf ppxfxbqfkfVar4 = ppxfxbqfkfVar;
        z13 = zBooleanValue3;
        objPpxfxbqfkf3 = objPpxfxbqfkf4;
        ppxfxbqfkfVar2 = ppxfxbqfkfVar4;
        zBooleanValue = ((Boolean) objPpxfxbqfkf3).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar11 = ppxfxbqfkfVar2.f14212vdvldrhtss;
        s81.iobyxmoadg iobyxmoadgVar12 = s81.iobyxmoadg.f105737mbcevpiqjq;
        lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar2;
        lqeggnwhkgVar.f14272yggfygwlhe = z13;
        lqeggnwhkgVar.f14270jyumaefscl = zBooleanValue;
        lqeggnwhkgVar.f14271lereixgezr = 3;
        objPpxfxbqfkf = iobyxmoadgVar11.ppxfxbqfkf(iobyxmoadgVar12, lqeggnwhkgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        boolean z19 = z13;
        z14 = zBooleanValue;
        objPpxfxbqfkf3 = objPpxfxbqfkf;
        z15 = z19;
        zBooleanValue2 = ((Boolean) objPpxfxbqfkf3).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar13 = ppxfxbqfkfVar2.f14212vdvldrhtss;
        s81.iobyxmoadg iobyxmoadgVar14 = s81.iobyxmoadg.f105744tzroggbefp;
        lqeggnwhkgVar.f14273zdlpuopuiu = ppxfxbqfkfVar2;
        lqeggnwhkgVar.f14272yggfygwlhe = z15;
        lqeggnwhkgVar.f14270jyumaefscl = z14;
        lqeggnwhkgVar.f14269iwizpuwonk = zBooleanValue2;
        lqeggnwhkgVar.f14271lereixgezr = 4;
        objPpxfxbqfkf2 = iobyxmoadgVar13.ppxfxbqfkf(iobyxmoadgVar14, lqeggnwhkgVar);
        if (objPpxfxbqfkf2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        z16 = zBooleanValue2;
        objPpxfxbqfkf3 = objPpxfxbqfkf2;
        z17 = z15;
        ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
        ppxfxbqfkfVar3.ulzqkzuiru(new aq0.nufgyqmvbu.wkgbmnqykc(z17, z14, z16, ((Boolean) objPpxfxbqfkf3).booleanValue()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void x(SearchCategoryUiModel searchCategoryUiModel) {
        String title = searchCategoryUiModel.getTitle();
        if (title != null) {
            A(title);
        }
        String id2 = searchCategoryUiModel.getId();
        if (id2 != null) {
            this.f14209pmvmpeiblj = id2;
            fiwbwshyhd(this, 0, false, id2, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(tzroggbefp tzroggbefpVar, lg.gxszxtbevo gxszxtbevoVar) {
        String strDraadjrbmk = tzroggbefpVar.draadjrbmk();
        if (!ageimvtcrz(strDraadjrbmk)) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        this.f14203kcexrzcfyt.eablkybsjg(strDraadjrbmk);
        ulzqkzuiru(new aq0.nufgyqmvbu.dxjokdxxww(tzroggbefpVar));
        fiwbwshyhd(this, 0, ((State) jlmebxxoox()).getIsSearchSuggestionsEnabled(), null, null, 13, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yzdjzghtvl() {
        ulzqkzuiru(new aq0.nufgyqmvbu.C0219nufgyqmvbu(false));
    }

    private final void z(String str) {
        this.f14193cqumvgiudr = ((State) jlmebxxoox()).getSearchQuery().draadjrbmk();
        ulzqkzuiru(new aq0.nufgyqmvbu.dxjokdxxww(new tzroggbefp(str, 0L, (l) null, 6, (kotlin.jvm.internal.gtknphoqwx) null)));
        A(str);
        fiwbwshyhd(this, 0, false, null, null, 13, null);
    }

    public void B(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f14200istkbnxepw = iobyxmoadgVar;
    }

    public void C(boolean z13) {
        this.f14210ppxfxbqfkf.eablkybsjg(z13);
    }

    public void D(boolean z13) {
        this.f14210ppxfxbqfkf.gxszxtbevo(z13);
    }

    public sj.lqeggnwhkg fmlbqenlif() {
        return this.f14210ppxfxbqfkf.ppxfxbqfkf();
    }

    public tg.iobyxmoadg fyldjkxazc() {
        return this.f14217zynmafqrjb;
    }

    public pz0.iobyxmoadg grlcpdaxtj() {
        return this.f14200istkbnxepw;
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(params, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: igdgnonuha, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(aq0.eablkybsjg action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.zoijcleaow.f14103iobyxmoadg)) {
            this.f14209pmvmpeiblj = ((State) jlmebxxoox()).getPayload().getSectionId();
            this.f14203kcexrzcfyt.wkgbmnqykc();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.iobyxmoadg.f14098iobyxmoadg)) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0223ppxfxbqfkf(null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.dxjokdxxww.f14095iobyxmoadg)) {
            O();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.lqeggnwhkg.f14099iobyxmoadg)) {
            M();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.nufgyqmvbu.f14100iobyxmoadg)) {
            N(mhtqkkgtqm().getFlow() == mz0.iobyxmoadg.ORDER_EDIT);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.C0216eablkybsjg.f14096iobyxmoadg)) {
            K();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.wkgbmnqykc.f14102iobyxmoadg)) {
            J();
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.gxszxtbevo.f14097iobyxmoadg)) {
            L();
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, aq0.eablkybsjg.ppxfxbqfkf.f14101iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            I();
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(aq0.gxszxtbevo intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof aq0.gxszxtbevo.cqumvgiudr) {
            D(((aq0.gxszxtbevo.cqumvgiudr) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.draadjrbmk) {
            C(((aq0.gxszxtbevo.draadjrbmk) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.wkgbmnqykc) {
            crxdokpmqz(aq0.lqeggnwhkg.iobyxmoadg.f14155iobyxmoadg);
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.lqeggnwhkg) {
            b();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.zoijcleaow) {
            krqnebusok(((aq0.gxszxtbevo.zoijcleaow) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.ppxfxbqfkf) {
            this.f14199gxszxtbevo.zoijcleaow(Boolean.FALSE);
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.zdlpuopuiu) {
            n(((aq0.gxszxtbevo.zdlpuopuiu) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.yggfygwlhe) {
            p();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.esjtqupxsv) {
            o(((aq0.gxszxtbevo.esjtqupxsv) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.eablkybsjg) {
            m(((aq0.gxszxtbevo.eablkybsjg) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.rgvfuqvkyq) {
            j();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.oxmwwwfdhm) {
            aq0.gxszxtbevo.oxmwwwfdhm oxmwwwfdhmVar = (aq0.gxszxtbevo.oxmwwwfdhm) intent;
            l(oxmwwwfdhmVar.zoijcleaow(), oxmwwwfdhmVar.iobyxmoadg(), oxmwwwfdhmVar.ppxfxbqfkf(), oxmwwwfdhmVar.wkgbmnqykc());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.dxjokdxxww) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, null), 3, null);
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.ojitshcjhn) {
            i(((aq0.gxszxtbevo.ojitshcjhn) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.agtfadlqog) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.nufgyqmvbu) {
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, null), 3, null);
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.kcexrzcfyt) {
            String orderEditId = mhtqkkgtqm().getOrderEditId();
            if (orderEditId != null) {
                crxdokpmqz(new aq0.lqeggnwhkg.zoijcleaow(orderEditId));
                return;
            }
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.iobyxmoadg) {
            eslsurpljm(((aq0.gxszxtbevo.iobyxmoadg) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.gtknphoqwx) {
            f();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.jyumaefscl) {
            q();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.C0217gxszxtbevo) {
            a();
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.iwizpuwonk) {
            r(((aq0.gxszxtbevo.iwizpuwonk) intent).iobyxmoadg());
            return;
        }
        if (intent instanceof aq0.gxszxtbevo.vdvldrhtss) {
            aq0.gxszxtbevo.vdvldrhtss vdvldrhtssVar = (aq0.gxszxtbevo.vdvldrhtss) intent;
            k(vdvldrhtssVar.zoijcleaow(), vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.ppxfxbqfkf());
        } else if (intent instanceof aq0.gxszxtbevo.btonecajqb) {
            aq0.gxszxtbevo.btonecajqb btonecajqbVar = (aq0.gxszxtbevo.btonecajqb) intent;
            e(btonecajqbVar.iobyxmoadg().iobyxmoadg(), btonecajqbVar.iobyxmoadg().eablkybsjg(), btonecajqbVar.iobyxmoadg().ppxfxbqfkf(), btonecajqbVar.iobyxmoadg().wkgbmnqykc());
        } else {
            if (!(intent instanceof aq0.gxszxtbevo.wflxmlrfwp)) {
                throw new NoWhenBranchMatchedException();
            }
            aq0.gxszxtbevo.wflxmlrfwp wflxmlrfwpVar = (aq0.gxszxtbevo.wflxmlrfwp) intent;
            g(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
        }
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f14217zynmafqrjb = iobyxmoadgVar;
    }

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f14216zdlpuopuiu;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        crxdokpmqz(aq0.lqeggnwhkg.gtknphoqwx.f14152iobyxmoadg);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        crxdokpmqz(aq0.lqeggnwhkg.wkgbmnqykc.f14163iobyxmoadg);
    }
}
