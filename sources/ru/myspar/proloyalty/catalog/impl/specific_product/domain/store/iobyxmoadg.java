package ru.myspar.proloyalty.catalog.impl.specific_product.domain.store;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.VideoProduct;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.domain.models.product.ProductDeclarations;
import ru.myspar.proloyalty.core.domain.models.product.ProductVariant;
import ru.myspar.proloyalty.core.domain.models.product.ProductVariants;
import ru.myspar.proloyalty.core.domain.models.product.VivinoRating;
import ru.myspar.proloyalty.core.domain.models.recommendations.Recommendation;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.rate.review.api.model.Reviews;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public static final C2197iobyxmoadg f93458esjtqupxsv = new C2197iobyxmoadg(null);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public static final int f93459lereixgezr = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final vm0.zoijcleaow f93460agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ow1.esjtqupxsv f93461btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final gg.gtknphoqwx f93462cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final pm1.iobyxmoadg f93463draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final sm1.zoijcleaow f93464dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lw1.iobyxmoadg f93465eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final p01.btonecajqb f93466gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final w01.iobyxmoadg f93467gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private tg.iobyxmoadg f93468iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private pz0.iobyxmoadg f93469jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final w01.gtknphoqwx f93470kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final cz0.iobyxmoadg f93471lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final j11.iobyxmoadg f93472nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final dz0.gtknphoqwx f93473ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final ah1.iobyxmoadg f93474oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f93475ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final ek1.iobyxmoadg f93476rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final fz0.iobyxmoadg f93477vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final s01.iobyxmoadg f93478wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final r01.nufgyqmvbu f93479wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final m01.nufgyqmvbu f93480yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final t81.iobyxmoadg f93481zdlpuopuiu;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93483yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93484zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = iobyxmoadg.this.new agtfadlqog(gxszxtbevoVar);
            agtfadlqogVar.f93483yggfygwlhe = obj;
            return agtfadlqogVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93484zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f93483yggfygwlhe;
            iobyxmoadg.this.uawqvzlxes(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93485jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f93486yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93487zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93486yggfygwlhe = str;
            this.f93485jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f93486yggfygwlhe, this.f93485jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93487zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sm1.zoijcleaow.iobyxmoadg iobyxmoadgVar = new sm1.zoijcleaow.iobyxmoadg(this.f93486yggfygwlhe, 1);
                    iobyxmoadg iobyxmoadgVar2 = this.f93485jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    sm1.zoijcleaow zoijcleaowVar = iobyxmoadgVar2.f93464dxjokdxxww;
                    this.f93487zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Reviews) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = this.f93485jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.gtknphoqwx((Reviews) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ezmngbhpjk(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class cqumvgiudr implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93488zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2193iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93489zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2194iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93491yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93492zdlpuopuiu;

                public C2194iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93492zdlpuopuiu = obj;
                    this.f93491yggfygwlhe |= Integer.MIN_VALUE;
                    return C2193iobyxmoadg.this.emit(null, this);
                }
            }

            public C2193iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f93489zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2194iobyxmoadg c2194iobyxmoadg;
                if (gxszxtbevoVar instanceof C2194iobyxmoadg) {
                    c2194iobyxmoadg = (C2194iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2194iobyxmoadg.f93491yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2194iobyxmoadg.f93491yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2194iobyxmoadg = new C2194iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2194iobyxmoadg = new C2194iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2194iobyxmoadg.f93492zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2194iobyxmoadg.f93491yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f93489zdlpuopuiu;
                    zoijcleaow.C2206iobyxmoadg c2206iobyxmoadg = new zoijcleaow.C2206iobyxmoadg((List) obj);
                    c2194iobyxmoadg.f93491yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2206iobyxmoadg, c2194iobyxmoadg) == objGxszxtbevo) {
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

        public cqumvgiudr(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f93488zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93488zdlpuopuiu.collect(new C2193iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f93493cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f93494esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        int f93495istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f93496iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f93497jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f93498lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        /* synthetic */ Object f93499pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f93500yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93501zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f93499pmvmpeiblj = obj;
            this.f93495istkbnxepw |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rhgxfdycjh(null, null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ pz0.iobyxmoadg f93503cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93504iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductPayload f93505jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f93506yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f93507zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ProductPayload productPayload, iobyxmoadg iobyxmoadgVar, pz0.iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93505jyumaefscl = productPayload;
            this.f93504iwizpuwonk = iobyxmoadgVar;
            this.f93503cqumvgiudr = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f93505jyumaefscl, this.f93504iwizpuwonk, this.f93503cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            r01.nufgyqmvbu.zoijcleaow c1812zoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93506yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f93507zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = obj2;
                    iobyxmoadgVar = this.f93504iwizpuwonk;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                        iobyxmoadgVar.crxdokpmqz(new eq0.eablkybsjg(thDxjokdxxww.getMessage()));
                        iobyxmoadgVar.crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f93430iobyxmoadg);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ProductPayload.Type type = this.f93505jyumaefscl.getType();
                if (type instanceof ProductPayload.Type.Article) {
                    c1812zoijcleaow = new r01.nufgyqmvbu.zoijcleaow.iobyxmoadg(((ProductPayload.Type.Article) type).getValue());
                } else if (type instanceof ProductPayload.Type.ProductId) {
                    c1812zoijcleaow = new r01.nufgyqmvbu.zoijcleaow.ppxfxbqfkf(((ProductPayload.Type.ProductId) type).getValue());
                } else {
                    if (!(type instanceof ProductPayload.Type.Barcode)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c1812zoijcleaow = new r01.nufgyqmvbu.zoijcleaow.C1812zoijcleaow(this.f93504iwizpuwonk.f93477vdvldrhtss.iobyxmoadg(((ProductPayload.Type.Barcode) type).getValue()));
                }
                pz0.iobyxmoadg iobyxmoadgVar2 = this.f93503cqumvgiudr;
                r01.nufgyqmvbu.iobyxmoadg iobyxmoadgVar3 = new r01.nufgyqmvbu.iobyxmoadg(iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), c1812zoijcleaow);
                iobyxmoadg iobyxmoadgVar4 = this.f93504iwizpuwonk;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                r01.nufgyqmvbu nufgyqmvbuVar = iobyxmoadgVar4.f93479wkgbmnqykc;
                this.f93506yggfygwlhe = 1;
                obj = nufgyqmvbuVar.zoijcleaow(iobyxmoadgVar3, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Product) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar7 = this.f93504iwizpuwonk;
            pz0.iobyxmoadg iobyxmoadgVar8 = this.f93503cqumvgiudr;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                this.f93507zdlpuopuiu = objWkgbmnqykc;
                this.f93506yggfygwlhe = 2;
                if (iobyxmoadgVar7.rhgxfdycjh((Product) objWkgbmnqykc, iobyxmoadgVar8, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                objWkgbmnqykc = obj2;
            }
            iobyxmoadgVar = this.f93504iwizpuwonk;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                iobyxmoadgVar.crxdokpmqz(new eq0.eablkybsjg(thDxjokdxxww.getMessage()));
                iobyxmoadgVar.crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f93430iobyxmoadg);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ xm0.zoijcleaow.C3095zoijcleaow f93508iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f93509jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93511zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(Product product, xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93509jyumaefscl = product;
            this.f93508iwizpuwonk = c3095zoijcleaow;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f93509jyumaefscl, this.f93508iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93511zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                lw1.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f93465eablkybsjg;
                String id2 = this.f93509jyumaefscl.getId();
                boolean isFavorite = this.f93509jyumaefscl.getIsFavorite();
                xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = this.f93508iwizpuwonk;
                this.f93511zdlpuopuiu = 1;
                if (iobyxmoadgVar.lqeggnwhkg(id2, isFavorite, c3095zoijcleaow, this) == objGxszxtbevo) {
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

    public static final class esjtqupxsv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93512zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2195iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93513zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2196iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93515yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93516zdlpuopuiu;

                public C2196iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93516zdlpuopuiu = obj;
                    this.f93515yggfygwlhe |= Integer.MIN_VALUE;
                    return C2195iobyxmoadg.this.emit(null, this);
                }
            }

            public C2195iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f93513zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2196iobyxmoadg c2196iobyxmoadg;
                if (gxszxtbevoVar instanceof C2196iobyxmoadg) {
                    c2196iobyxmoadg = (C2196iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2196iobyxmoadg.f93515yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2196iobyxmoadg.f93515yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2196iobyxmoadg = new C2196iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2196iobyxmoadg = new C2196iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2196iobyxmoadg.f93516zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2196iobyxmoadg.f93515yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f93513zdlpuopuiu;
                    zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new zoijcleaow.ppxfxbqfkf((Double) obj);
                    c2196iobyxmoadg.f93515yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c2196iobyxmoadg) == objGxszxtbevo) {
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

        public esjtqupxsv(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f93512zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93512zdlpuopuiu.collect(new C2195iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93517iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f93518jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ pz0.iobyxmoadg f93519yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93520zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(pz0.iobyxmoadg iobyxmoadgVar, String str, iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93519yggfygwlhe = iobyxmoadgVar;
            this.f93518jyumaefscl = str;
            this.f93517iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gtknphoqwx(this.f93519yggfygwlhe, this.f93518jyumaefscl, this.f93517iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93520zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    j11.iobyxmoadg.C1081iobyxmoadg c1081iobyxmoadg = new j11.iobyxmoadg.C1081iobyxmoadg(this.f93519yggfygwlhe.wkgbmnqykc(), this.f93519yggfygwlhe.ppxfxbqfkf(), hg.jyumaefscl.eablkybsjg(this.f93518jyumaefscl), hg.jyumaefscl.r(d01.iobyxmoadg.wkgbmnqykc()));
                    iobyxmoadg iobyxmoadgVar = this.f93517iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    j11.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f93472nufgyqmvbu;
                    this.f93520zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c1081iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Map) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = this.f93517iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.btonecajqb((Map) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f93521jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93523zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(Product product, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93521jyumaefscl = product;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f93521jyumaefscl, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object next;
            MeasureType currentMeasure;
            double basketDefault;
            MeasureType measureType;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93523zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    ek1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f93476rgvfuqvkyq;
                    this.f93523zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            Product product = this.f93521jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                List list = (List) objWkgbmnqykc;
                Iterator it = iobyxmoadg.nuxfzjnpeb(iobyxmoadgVar5).getProductDataList().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), product.getId()));
                ProductUIData productUIData = (ProductUIData) next;
                if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.mbcevpiqjq(product.getMeasureTypeModel())) == null) {
                    currentMeasure = product.getMeasureTypeModel().getCurrentMeasure();
                }
                String article = product.getArticle();
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
                iobyxmoadgVar5.crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.nufgyqmvbu(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list)));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2197iobyxmoadg {
        public /* synthetic */ C2197iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2197iobyxmoadg() {
        }
    }

    public static final class iwizpuwonk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93524zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$iwizpuwonk$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2198iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93525zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$iwizpuwonk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2199iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93527yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93528zdlpuopuiu;

                public C2199iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93528zdlpuopuiu = obj;
                    this.f93527yggfygwlhe |= Integer.MIN_VALUE;
                    return C2198iobyxmoadg.this.emit(null, this);
                }
            }

            public C2198iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f93525zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2199iobyxmoadg c2199iobyxmoadg;
                if (gxszxtbevoVar instanceof C2199iobyxmoadg) {
                    c2199iobyxmoadg = (C2199iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2199iobyxmoadg.f93527yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2199iobyxmoadg.f93527yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2199iobyxmoadg = new C2199iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2199iobyxmoadg = new C2199iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2199iobyxmoadg.f93528zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2199iobyxmoadg.f93527yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f93525zdlpuopuiu;
                    zoijcleaow.C2207zoijcleaow c2207zoijcleaow = new zoijcleaow.C2207zoijcleaow((pz0.iobyxmoadg) obj);
                    c2199iobyxmoadg.f93527yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c2207zoijcleaow, c2199iobyxmoadg) == objGxszxtbevo) {
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

        public iwizpuwonk(sj.lqeggnwhkg lqeggnwhkgVar) {
            this.f93524zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93524zdlpuopuiu.collect(new C2198iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93529yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93530zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$jyumaefscl$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2200iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f93531yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93532zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2201iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                Object f93533cqumvgiudr;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f93535jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93536yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93537zdlpuopuiu;

                public C2201iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93537zdlpuopuiu = obj;
                    this.f93536yggfygwlhe |= Integer.MIN_VALUE;
                    return C2200iobyxmoadg.this.emit(null, this);
                }
            }

            public C2200iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f93532zdlpuopuiu = nufgyqmvbuVar;
                this.f93531yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0092 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2201iobyxmoadg c2201iobyxmoadg;
                sj.nufgyqmvbu nufgyqmvbuVar;
                pz0.iobyxmoadg iobyxmoadgVarZoijcleaow;
                if (gxszxtbevoVar instanceof C2201iobyxmoadg) {
                    c2201iobyxmoadg = (C2201iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2201iobyxmoadg.f93536yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2201iobyxmoadg.f93536yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2201iobyxmoadg = new C2201iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2201iobyxmoadg = new C2201iobyxmoadg(gxszxtbevoVar);
                }
                Object objZoijcleaow = c2201iobyxmoadg.f93537zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2201iobyxmoadg.f93536yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        iobyxmoadgVarZoijcleaow = (pz0.iobyxmoadg) c2201iobyxmoadg.f93533cqumvgiudr;
                        nufgyqmvbuVar = (sj.nufgyqmvbu) c2201iobyxmoadg.f93535jyumaefscl;
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                nufgyqmvbuVar = this.f93532zdlpuopuiu;
                iobyxmoadgVarZoijcleaow = (pz0.iobyxmoadg) obj;
                String orderEditId = iobyxmoadg.nuxfzjnpeb(this.f93531yggfygwlhe).getPayload().getOrderEditId();
                if (orderEditId != null && !mj.kcexrzcfyt.zfvoamnweg(orderEditId)) {
                    w01.gtknphoqwx gtknphoqwxVar = this.f93531yggfygwlhe.f93470kcexrzcfyt;
                    w01.gtknphoqwx.iobyxmoadg iobyxmoadgVar = new w01.gtknphoqwx.iobyxmoadg(orderEditId);
                    c2201iobyxmoadg.f93535jyumaefscl = nufgyqmvbuVar;
                    c2201iobyxmoadg.f93533cqumvgiudr = iobyxmoadgVarZoijcleaow;
                    c2201iobyxmoadg.f93536yggfygwlhe = 1;
                    objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar, c2201iobyxmoadg);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                c2201iobyxmoadg.f93535jyumaefscl = null;
                c2201iobyxmoadg.f93533cqumvgiudr = null;
                c2201iobyxmoadg.f93536yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(iobyxmoadgVarZoijcleaow, c2201iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVarZoijcleaow = pz0.iobyxmoadg.zoijcleaow(iobyxmoadgVarZoijcleaow, null, ((uz0.iobyxmoadg) objZoijcleaow).eablkybsjg(), null, 5, null);
                c2201iobyxmoadg.f93535jyumaefscl = null;
                c2201iobyxmoadg.f93533cqumvgiudr = null;
                c2201iobyxmoadg.f93536yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(iobyxmoadgVarZoijcleaow, c2201iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f93530zdlpuopuiu = lqeggnwhkgVar;
            this.f93529yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93530zdlpuopuiu.collect(new C2200iobyxmoadg(nufgyqmvbuVar, this.f93529yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93538yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93539zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93539zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f93538yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f93538yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93541yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93542zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = iobyxmoadg.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f93541yggfygwlhe = obj;
            return lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93542zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f93541yggfygwlhe;
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iobyxmoadgVar.eslsurpljm((zoijcleaow) it.next());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lereixgezr) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f93543cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ AnalyticsLocation.ItemFeed f93544esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc f93545iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f93546jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93548zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(Product product, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc wkgbmnqykcVar, boolean z13, AnalyticsLocation.ItemFeed itemFeed, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93546jyumaefscl = product;
            this.f93545iwizpuwonk = wkgbmnqykcVar;
            this.f93543cqumvgiudr = z13;
            this.f93544esjtqupxsv = itemFeed;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f93546jyumaefscl, this.f93545iwizpuwonk, this.f93543cqumvgiudr, this.f93544esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93548zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.jrbgnlbqoe(this.f93546jyumaefscl, ((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog) this.f93545iwizpuwonk).iobyxmoadg(), this.f93543cqumvgiudr, this.f93544esjtqupxsv);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93549jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f93550yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93551zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93550yggfygwlhe = str;
            this.f93549jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f93550yggfygwlhe, this.f93549jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93551zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    s01.iobyxmoadg.InterfaceC2556iobyxmoadg.zoijcleaow zoijcleaowVar = new s01.iobyxmoadg.InterfaceC2556iobyxmoadg.zoijcleaow(nz0.zoijcleaow.PRODUCT_SCREEN, null, this.f93550yggfygwlhe, 2, null);
                    iobyxmoadg iobyxmoadgVar = this.f93549jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    s01.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f93478wflxmlrfwp;
                    this.f93551zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                objWkgbmnqykc = null;
            }
            List list = (List) objWkgbmnqykc;
            if (list != null) {
                this.f93549jyumaefscl.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.C2192gxszxtbevo(list));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93552yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93553zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93553zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f93552yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = new ojitshcjhn(gxszxtbevoVar);
            ojitshcjhnVar.f93552yggfygwlhe = th2;
            return ojitshcjhnVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class oxmwwwfdhm implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93554yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93555zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$oxmwwwfdhm$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2202iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f93556yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93557zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$oxmwwwfdhm$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2203iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93559yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93560zdlpuopuiu;

                public C2203iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93560zdlpuopuiu = obj;
                    this.f93559yggfygwlhe |= Integer.MIN_VALUE;
                    return C2202iobyxmoadg.this.emit(null, this);
                }
            }

            public C2202iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f93557zdlpuopuiu = nufgyqmvbuVar;
                this.f93556yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2203iobyxmoadg c2203iobyxmoadg;
                if (gxszxtbevoVar instanceof C2203iobyxmoadg) {
                    c2203iobyxmoadg = (C2203iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2203iobyxmoadg.f93559yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2203iobyxmoadg.f93559yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2203iobyxmoadg = new C2203iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2203iobyxmoadg = new C2203iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2203iobyxmoadg.f93560zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2203iobyxmoadg.f93559yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f93557zdlpuopuiu;
                    pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg = (pm1.iobyxmoadg.C1703iobyxmoadg) obj;
                    Product mainProduct = iobyxmoadg.nuxfzjnpeb(this.f93556yggfygwlhe).getMainProduct();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainProduct != null ? mainProduct.getArticle() : null, c1703iobyxmoadg.iobyxmoadg())) {
                        c2203iobyxmoadg.f93559yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2203iobyxmoadg) == objGxszxtbevo) {
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

        public oxmwwwfdhm(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f93555zdlpuopuiu = lqeggnwhkgVar;
            this.f93554yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93555zdlpuopuiu.collect(new C2202iobyxmoadg(nufgyqmvbuVar, this.f93554yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f93561jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93563zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        pmvmpeiblj(Product product, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93561jyumaefscl = product;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new pmvmpeiblj(this.f93561jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93563zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!iobyxmoadg.nuxfzjnpeb(iobyxmoadg.this).getPayload().getIsOrderEdit()) {
                    ah1.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f93474oxmwwwfdhm;
                    hh1.gtknphoqwx.gxszxtbevo gxszxtbevoVar = new hh1.gtknphoqwx.gxszxtbevo(this.f93561jyumaefscl.getArticle());
                    AnalyticsPage.ItemDetail itemDetail = new AnalyticsPage.ItemDetail(this.f93561jyumaefscl.getArticle(), this.f93561jyumaefscl.getName());
                    this.f93563zdlpuopuiu = 1;
                    if (iobyxmoadgVar.gxszxtbevo(gxszxtbevoVar, itemDetail, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
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

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f93564iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f93565jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93567zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93565jyumaefscl = comboSetProduct;
            this.f93564iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f93565jyumaefscl, this.f93564iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objAgtfadlqog;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93567zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                cz0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f93471lqeggnwhkg;
                ComboSetProduct comboSetProduct = this.f93565jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f93564iwizpuwonk;
                this.f93567zdlpuopuiu = 1;
                objAgtfadlqog = iobyxmoadgVar.agtfadlqog(comboSetProduct, comboSetProduct2, this);
                if (objAgtfadlqog == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objAgtfadlqog = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objAgtfadlqog)) {
                iobyxmoadgVar2.yzdjzghtvl(((kz0.iobyxmoadg) objAgtfadlqog).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objAgtfadlqog);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ppxfxbqfkf(null);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93568iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f93569jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f93570yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93571zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar, iobyxmoadg iobyxmoadgVar) {
            super(3, gxszxtbevoVar);
            this.f93568iwizpuwonk = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93571zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f93570yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f93569jyumaefscl).booleanValue() ? this.f93568iwizpuwonk.ageimvtcrz().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f93571zdlpuopuiu = 1;
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
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar, this.f93568iwizpuwonk);
            rgvfuqvkyqVar.f93570yggfygwlhe = nufgyqmvbuVar;
            rgvfuqvkyqVar.f93569jyumaefscl = obj;
            return rgvfuqvkyqVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f93573yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93574zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            vdvldrhtss vdvldrhtssVar = iobyxmoadg.this.new vdvldrhtss(gxszxtbevoVar);
            vdvldrhtssVar.f93573yggfygwlhe = obj;
            return vdvldrhtssVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93574zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f93573yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                iobyxmoadg.this.ezmngbhpjk(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg.this.krqnebusok(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f93575jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93577zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93575jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wflxmlrfwp(this.f93575jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93577zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarAgeimvtcrz = iobyxmoadg.this.ageimvtcrz();
                ChangeProductParams changeProductParams = this.f93575jyumaefscl;
                this.f93577zdlpuopuiu = 1;
                if (btonecajqbVarAgeimvtcrz.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
        final /* synthetic */ ComboSetProduct f93578iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f93579jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93581zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f93579jyumaefscl = comboSetProduct;
            this.f93578iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f93579jyumaefscl, this.f93578iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93581zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    ComboSetProduct comboSetProduct = this.f93579jyumaefscl;
                    ComboSetProduct comboSetProduct2 = this.f93578iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w01.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f93467gxszxtbevo;
                    String orderEditId = iobyxmoadg.nuxfzjnpeb(iobyxmoadgVar).getPayload().getOrderEditId();
                    if (orderEditId == null) {
                        orderEditId = "";
                    }
                    w01.iobyxmoadg.C2943iobyxmoadg c2943iobyxmoadg = new w01.iobyxmoadg.C2943iobyxmoadg(orderEditId, comboSetProduct, comboSetProduct2);
                    this.f93581zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c2943iobyxmoadg, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.yzdjzghtvl((Warning) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.ezmngbhpjk(thDxjokdxxww);
            }
            iobyxmoadg.this.ppxfxbqfkf(null);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f93582yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f93583zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2204iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f93584yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f93585zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C2205iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f93587yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f93588zdlpuopuiu;

                public C2205iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f93588zdlpuopuiu = obj;
                    this.f93587yggfygwlhe |= Integer.MIN_VALUE;
                    return C2204iobyxmoadg.this.emit(null, this);
                }
            }

            public C2204iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f93585zdlpuopuiu = nufgyqmvbuVar;
                this.f93584yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2205iobyxmoadg c2205iobyxmoadg;
                if (gxszxtbevoVar instanceof C2205iobyxmoadg) {
                    c2205iobyxmoadg = (C2205iobyxmoadg) gxszxtbevoVar;
                    int i13 = c2205iobyxmoadg.f93587yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c2205iobyxmoadg.f93587yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c2205iobyxmoadg = new C2205iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c2205iobyxmoadg = new C2205iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c2205iobyxmoadg.f93588zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c2205iobyxmoadg.f93587yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f93585zdlpuopuiu;
                    if (iobyxmoadg.nuxfzjnpeb(this.f93584yggfygwlhe).getPayload().getIsOrderEdit()) {
                        c2205iobyxmoadg.f93587yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c2205iobyxmoadg) == objGxszxtbevo) {
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

        public yggfygwlhe(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f93583zdlpuopuiu = lqeggnwhkgVar;
            this.f93582yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f93583zdlpuopuiu.collect(new C2204iobyxmoadg(nufgyqmvbuVar, this.f93582yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93590zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new zdlpuopuiu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String article;
            mg.zoijcleaow.gxszxtbevo();
            if (this.f93590zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            Product mainProduct = iobyxmoadg.nuxfzjnpeb(iobyxmoadg.this).getMainProduct();
            if (mainProduct != null && (article = mainProduct.getArticle()) != null) {
                iobyxmoadg.this.lxfrhoxuzk(article);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pm1.iobyxmoadg.C1703iobyxmoadg c1703iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(c1703iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static abstract class zoijcleaow implements er0.iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2206iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f93591iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f93592zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2206iobyxmoadg(List productUIData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productUIData, "productUIData");
                this.f93591iobyxmoadg = productUIData;
                this.f93592zoijcleaow = "cartProducts";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2206iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93591iobyxmoadg, ((C2206iobyxmoadg) obj).f93591iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f93592zoijcleaow;
            }

            public int hashCode() {
                return this.f93591iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f93591iobyxmoadg;
            }

            public String toString() {
                return "CartProducts(productUIData=" + this.f93591iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Double f93593iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f93594zoijcleaow;

            public ppxfxbqfkf(Double d13) {
                super(null);
                this.f93593iobyxmoadg = d13;
                this.f93594zoijcleaow = "deliveryPrice";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93593iobyxmoadg, ((ppxfxbqfkf) obj).f93593iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f93594zoijcleaow;
            }

            public int hashCode() {
                Double d13 = this.f93593iobyxmoadg;
                if (d13 == null) {
                    return 0;
                }
                return d13.hashCode();
            }

            public String toString() {
                return "DeliveryPrice(newPrice=" + this.f93593iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2207zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final pz0.iobyxmoadg f93595iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f93596zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2207zoijcleaow(pz0.iobyxmoadg deliveryData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
                this.f93595iobyxmoadg = deliveryData;
                this.f93596zoijcleaow = "changeCurrentShop";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2207zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f93595iobyxmoadg, ((C2207zoijcleaow) obj).f93595iobyxmoadg);
            }

            @Override // er0.iobyxmoadg
            public String getKey() {
                return this.f93596zoijcleaow;
            }

            public int hashCode() {
                return this.f93595iobyxmoadg.hashCode();
            }

            public final pz0.iobyxmoadg iobyxmoadg() {
                return this.f93595iobyxmoadg;
            }

            public String toString() {
                return "ChangeCurrentShop(deliveryData=" + this.f93595iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(r01.nufgyqmvbu getProductDetailsUseCase, lw1.iobyxmoadg changeFavoritesInteractor, w01.iobyxmoadg addComboSetEditOrderUseCase, cz0.iobyxmoadg cartInteractor, j11.iobyxmoadg getRecommendationsUseCase, sm1.zoijcleaow getReviewsUseCase, ow1.esjtqupxsv isAuthUseCase, p01.btonecajqb subscribeToOrderDeliveryPriceUseCase, pm1.iobyxmoadg changeProductReviewObserver, s01.iobyxmoadg getComboSetUseCase, vm0.zoijcleaow analyticsTracker, dz0.gtknphoqwx productChangesSourceProvider, ek1.iobyxmoadg purchasesListComponentApi, fz0.iobyxmoadg barcodeMapper, ah1.iobyxmoadg popupsObserver, w01.gtknphoqwx getEditOrderUseCase, t81.iobyxmoadg featureManager, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductDetailsUseCase, "getProductDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addComboSetEditOrderUseCase, "addComboSetEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRecommendationsUseCase, "getRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getReviewsUseCase, "getReviewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcodeMapper, "barcodeMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(popupsObserver, "popupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f93475ppxfxbqfkf = new pw0.ppxfxbqfkf();
        this.f93479wkgbmnqykc = getProductDetailsUseCase;
        this.f93465eablkybsjg = changeFavoritesInteractor;
        this.f93467gxszxtbevo = addComboSetEditOrderUseCase;
        this.f93471lqeggnwhkg = cartInteractor;
        this.f93472nufgyqmvbu = getRecommendationsUseCase;
        this.f93464dxjokdxxww = getReviewsUseCase;
        this.f93461btonecajqb = isAuthUseCase;
        this.f93466gtknphoqwx = subscribeToOrderDeliveryPriceUseCase;
        this.f93463draadjrbmk = changeProductReviewObserver;
        this.f93478wflxmlrfwp = getComboSetUseCase;
        this.f93460agtfadlqog = analyticsTracker;
        this.f93473ojitshcjhn = productChangesSourceProvider;
        this.f93476rgvfuqvkyq = purchasesListComponentApi;
        this.f93477vdvldrhtss = barcodeMapper;
        this.f93474oxmwwwfdhm = popupsObserver;
        this.f93470kcexrzcfyt = getEditOrderUseCase;
        this.f93481zdlpuopuiu = featureManager;
        this.f93480yggfygwlhe = subscribeToCurrentDeliveryDataUseCase;
        this.f93462cqumvgiudr = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: eq0.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.iobyxmoadg.a(this.f31772zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb a(iobyxmoadg iobyxmoadgVar) {
        String orderEditId = ((State) iobyxmoadgVar.jlmebxxoox()).getPayload().getOrderEditId();
        return iobyxmoadgVar.f93473ojitshcjhn.iobyxmoadg((orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? dz0.btonecajqb.iobyxmoadg.zoijcleaow.f29973iobyxmoadg : new dz0.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb ageimvtcrz() {
        return (dz0.btonecajqb) this.f93462cqumvgiudr.getValue();
    }

    private final void auzgnhcxok(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc interfaceC2208wkgbmnqykc) {
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
        if (mainProduct == null) {
            return;
        }
        AnalyticsPage.ItemDetail itemDetail = new AnalyticsPage.ItemDetail(mainProduct.getArticle(), mainProduct.getName());
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(interfaceC2208wkgbmnqykc, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.iobyxmoadg.f93628iobyxmoadg)) {
            vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(mainProduct, new xm0.zoijcleaow.C3095zoijcleaow(itemDetail, null, new AnalyticElement.ProductItemElement(mainProduct.getArticle(), mainProduct.getName())));
        } else {
            if (!(interfaceC2208wkgbmnqykc instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc.zoijcleaow) interfaceC2208wkgbmnqykc;
            Product productHszhottldk = hszhottldk(((State) jlmebxxoox()).getRecommendations(), zoijcleaowVar.ppxfxbqfkf());
            AnalyticsLocation.ItemFeed itemFeedZoijcleaow = zoijcleaowVar.zoijcleaow();
            String article = productHszhottldk != null ? productHszhottldk.getArticle() : null;
            if (article == null) {
                article = "";
            }
            String name = productHszhottldk != null ? productHszhottldk.getName() : null;
            vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(productHszhottldk, new xm0.zoijcleaow.C3095zoijcleaow(itemDetail, itemFeedZoijcleaow, new AnalyticElement.ProductItemElement(article, name != null ? name : "")));
        }
        Product product = (Product) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
        xm0.zoijcleaow.C3095zoijcleaow c3095zoijcleaow = (xm0.zoijcleaow.C3095zoijcleaow) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
        if (product == null) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(product, c3095zoijcleaow, null), 3, null);
    }

    private final void e() {
        ProductDeclarations declarations;
        List items;
        Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
        if (mainProduct == null || (declarations = mainProduct.getDeclarations()) == null || (items = declarations.getItems()) == null) {
            return;
        }
        if (items.isEmpty()) {
            items = null;
        }
        if (items != null) {
            crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.ojitshcjhn(items));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eslsurpljm(zoijcleaow zoijcleaowVar) {
        if (!(zoijcleaowVar instanceof zoijcleaow.C2207zoijcleaow)) {
            if (zoijcleaowVar instanceof zoijcleaow.C2206iobyxmoadg) {
                ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.eablkybsjg(((zoijcleaow.C2206iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                return;
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(eq0.zoijcleaow.f31776iobyxmoadg);
                return;
            }
        }
        zoijcleaow.C2207zoijcleaow c2207zoijcleaow = (zoijcleaow.C2207zoijcleaow) zoijcleaowVar;
        b(c2207zoijcleaow.iobyxmoadg());
        igdgnonuha(c2207zoijcleaow.iobyxmoadg());
        tg.iobyxmoadg iobyxmoadgVarFiwbwshyhd = fiwbwshyhd();
        if (iobyxmoadgVarFiwbwshyhd != null) {
            iobyxmoadgVarFiwbwshyhd.invoke();
        }
    }

    private final void f() {
        this.f93460agtfadlqog.ppxfxbqfkf(new ym0.gxszxtbevo.iobyxmoadg(null, 1, null));
    }

    private final void fmlbqenlif(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        boolean isOrderEdit = ((State) jlmebxxoox()).getPayload().getIsOrderEdit();
        if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() && !isOrderEdit) {
            crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow.f93440iobyxmoadg);
        } else if (!isOrderEdit) {
            tbqsvytpvh(comboSetProduct, comboSetProduct2);
        } else {
            ppxfxbqfkf(null);
            roivzttewh(comboSetProduct, comboSetProduct2);
        }
    }

    private final void g() {
        if (((State) jlmebxxoox()).getAnalyticLoadCompletedFirstTime()) {
            return;
        }
        this.f93460agtfadlqog.zoijcleaow(new ym0.gxszxtbevo.iobyxmoadg(null, 1, null));
        ulzqkzuiru(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.wkgbmnqykc.f93455iobyxmoadg);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    private final Product grlcpdaxtj(Product product, ProductUIData productUIData) {
        MeasureType originalMeasure;
        if (productUIData == null) {
            return product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.isAvailableToBuy : false, ((-513) & 4096) != 0 ? product.productPropertyNames : null, ((-513) & 8192) != 0 ? product.productProperties : null, ((-513) & 16384) != 0 ? product.photoUrl : null, ((-513) & 32768) != 0 ? product.photoUrls : null, ((-513) & 65536) != 0 ? product.energy : null, ((-513) & 131072) != 0 ? product.fats : null, ((-513) & 262144) != 0 ? product.carbs : null, ((-513) & 524288) != 0 ? product.protein : null, ((-513) & 1048576) != 0 ? product.params : null, ((-513) & 2097152) != 0 ? product.description : null, ((-513) & 4194304) != 0 ? product.chemical : null, ((-513) & 8388608) != 0 ? product.hasDiscount : false, ((-513) & 16777216) != 0 ? product.hints : null, ((-513) & 33554432) != 0 ? product.hidePrice : false, ((-513) & 67108864) != 0 ? product.rating : null, ((-513) & 134217728) != 0 ? product.reviews : 0, ((-513) & 268435456) != 0 ? product.isPmProduct : false, ((-513) & 536870912) != 0 ? product.video : null, ((-513) & 1073741824) != 0 ? product.colorsModel : null, ((-513) & Integer.MIN_VALUE) != 0 ? product.country : null, (32767 & 1) != 0 ? product.region : null, (32767 & 2) != 0 ? product.countryFlagEmoji : null, (32767 & 4) != 0 ? product.type : null, (32767 & 8) != 0 ? product.kind : null, (32767 & 16) != 0 ? product.grape : null, (32767 & 32) != 0 ? product.standart : null, (32767 & 64) != 0 ? product.countryMapIcon : null, (32767 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.tasting : null, (32767 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.styling : null, (32767 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.button : null, (32767 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.limits : null, (32767 & 2048) != 0 ? product.vivino : null, (32767 & 4096) != 0 ? product.productVariants : null, (32767 & 8192) != 0 ? product.quantity : 0.0d, (32767 & 16384) != 0 ? product.declarations : null);
        }
        MeasureType measureType = productUIData.getMeasureType();
        if (measureType == null || (originalMeasure = measureType.mbcevpiqjq(product.getMeasureTypeModel())) == null) {
            originalMeasure = product.getMeasureTypeModel().getOriginalMeasure();
        }
        MeasureTypeModel measureTypeModelPpxfxbqfkf = MeasureTypeModel.ppxfxbqfkf(product.getMeasureTypeModel(), null, null, originalMeasure, 3, null);
        List limits = productUIData.getLimits();
        if (limits == null) {
            limits = product.getLimits();
        } else {
            if (limits.isEmpty()) {
                limits = null;
            }
            if (limits == null) {
                limits = product.getLimits();
            }
        }
        return product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : measureTypeModelPpxfxbqfkf, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.isAvailableToBuy : false, ((-513) & 4096) != 0 ? product.productPropertyNames : null, ((-513) & 8192) != 0 ? product.productProperties : null, ((-513) & 16384) != 0 ? product.photoUrl : null, ((-513) & 32768) != 0 ? product.photoUrls : null, ((-513) & 65536) != 0 ? product.energy : null, ((-513) & 131072) != 0 ? product.fats : null, ((-513) & 262144) != 0 ? product.carbs : null, ((-513) & 524288) != 0 ? product.protein : null, ((-513) & 1048576) != 0 ? product.params : null, ((-513) & 2097152) != 0 ? product.description : null, ((-513) & 4194304) != 0 ? product.chemical : null, ((-513) & 8388608) != 0 ? product.hasDiscount : false, ((-513) & 16777216) != 0 ? product.hints : null, ((-513) & 33554432) != 0 ? product.hidePrice : false, ((-513) & 67108864) != 0 ? product.rating : null, ((-513) & 134217728) != 0 ? product.reviews : 0, ((-513) & 268435456) != 0 ? product.isPmProduct : false, ((-513) & 536870912) != 0 ? product.video : null, ((-513) & 1073741824) != 0 ? product.colorsModel : null, ((-513) & Integer.MIN_VALUE) != 0 ? product.country : null, (32767 & 1) != 0 ? product.region : null, (32767 & 2) != 0 ? product.countryFlagEmoji : null, (32767 & 4) != 0 ? product.type : null, (32767 & 8) != 0 ? product.kind : null, (32767 & 16) != 0 ? product.grape : null, (32767 & 32) != 0 ? product.standart : null, (32767 & 64) != 0 ? product.countryMapIcon : null, (32767 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.tasting : null, (32767 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.styling : null, (32767 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.button : null, (32767 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.limits : limits, (32767 & 2048) != 0 ? product.vivino : null, (32767 & 4096) != 0 ? product.productVariants : null, (32767 & 8192) != 0 ? product.quantity : productUIData.getQuantity(), (32767 & 16384) != 0 ? product.declarations : null);
    }

    private final void h() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f93465eablkybsjg.dxjokdxxww(), new agtfadlqog(null)), new ojitshcjhn(null)), sopmlzcsov());
    }

    private final Product hszhottldk(Map map, String str) {
        Collection collectionValues;
        Object obj = null;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((Recommendation) it.next()).getProductList());
        }
        for (Object obj2 : arrayList) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) obj2).getId(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Product) obj;
    }

    private final void i() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(fyldjkxazc(), new rgvfuqvkyq(null, this)), new vdvldrhtss(null)), sopmlzcsov());
    }

    private final void igdgnonuha(pz0.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(((State) jlmebxxoox()).getPayload(), this, iobyxmoadgVar, null), 3, null);
    }

    private final void ipoelvxyzq() {
        f();
        h();
        k();
        i();
        j();
    }

    private final void ixidwrxhsl(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.agtfadlqog(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.ItemDetail(analyticElement.getId(), analyticElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), analyticsLocation)));
    }

    private final void j() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.gxszxtbevo(new oxmwwwfdhm(this.f93463draadjrbmk.nufgyqmvbu(), this), new kcexrzcfyt(null)), new zdlpuopuiu(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(Product product, ProductCardEvent productCardEvent, boolean z13, AnalyticsLocation analyticsLocation) {
        Object next;
        List limits;
        List limits2;
        Object ppxfxbqfkfVar;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ppxfxbqfkfVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.iobyxmoadg(product.getId());
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                ppxfxbqfkfVar = new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.ppxfxbqfkf(product.getId());
            }
            ulzqkzuiru(ppxfxbqfkfVar);
            return;
        }
        Iterator it = ((State) jlmebxxoox()).getProductDataList().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), product.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        String id2 = product.getId();
        String article = product.getArticle();
        boolean isAvailableToBuy = product.getIsAvailableToBuy();
        boolean isPmProduct = product.getIsPmProduct();
        MeasureTypeModel measureTypeModel = product.getMeasureTypeModel();
        Double avgWeight = product.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = q11.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = product.getLimits();
        }
        istkbnxepw(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, measureTypeModel, avgWeight, limits, new ChangeProductAnalyticParams(new AnalyticsPage.ItemDetail(product.getName(), product.getId()), analyticsLocation, product.getName())), z13);
    }

    private final auzgnhcxok k() {
        sj.lqeggnwhkg lqeggnwhkgVarFyldjkxazc = fyldjkxazc();
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk(new jyumaefscl(this.f93480yggfygwlhe.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), this));
        cqumvgiudr cqumvgiudrVar = new cqumvgiudr(ageimvtcrz().iobyxmoadg());
        p01.btonecajqb btonecajqbVar = this.f93466gtknphoqwx;
        String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
        if (orderEditId == null) {
            orderEditId = "";
        }
        return sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(er0.lqeggnwhkg.iobyxmoadg(lqeggnwhkgVarFyldjkxazc, iwizpuwonkVar, cqumvgiudrVar, new esjtqupxsv(new yggfygwlhe(btonecajqbVar.zoijcleaow(orderEditId), this))), new lereixgezr(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new eq0.lqeggnwhkg(warning.getMessage()));
    }

    private final void l(Product product, pz0.iobyxmoadg iobyxmoadgVar) {
        ProductPayload.Type type = ((State) jlmebxxoox()).getPayload().getType();
        ProductPayload.Type.Barcode barcode = type instanceof ProductPayload.Type.Barcode ? (ProductPayload.Type.Barcode) type : null;
        String value = barcode != null ? barcode.getValue() : null;
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        String id2 = product.getId();
        String article = product.getArticle();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        this.f93460agtfadlqog.eablkybsjg(new ym0.gxszxtbevo.iobyxmoadg(strWkgbmnqykc, id2, article, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.getServerCode() : null, value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok lxfrhoxuzk(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(str, this, null), 3, null);
    }

    private final auzgnhcxok m(Product product) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new pmvmpeiblj(product, null), 3, null);
    }

    private final void mhtqkkgtqm(Product product) {
        crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gtknphoqwx(new ProductPayload(new ProductPayload.Type.ProductId(product.getId()), ((State) jlmebxxoox()).getPayload().getOrderEditId())));
    }

    private final void n(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
        String name = mainProduct != null ? mainProduct.getName() : null;
        if (name == null) {
            name = "";
        }
        Product mainProduct2 = ((State) jlmebxxoox()).getMainProduct();
        String article = mainProduct2 != null ? mainProduct2.getArticle() : null;
        this.f93460agtfadlqog.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.ProductList(name, article != null ? article : ""), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
    }

    public static final /* synthetic */ State nuxfzjnpeb(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    static /* synthetic */ void o(iobyxmoadg iobyxmoadgVar, AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            analyticElement = null;
        }
        if ((i13 & 4) != 0) {
            analyticsLocation = null;
        }
        iobyxmoadgVar.n(analyticsPage, analyticElement, analyticsLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object rhgxfdycjh(Product product, pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        Product product2;
        DeliveryCode deliveryCode;
        pz0.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        iobyxmoadg iobyxmoadgVar4;
        boolean z13;
        iobyxmoadg iobyxmoadgVar5;
        boolean zBooleanValue;
        Object objPpxfxbqfkf;
        Product product3;
        iobyxmoadg iobyxmoadgVar6;
        boolean z14;
        DeliveryCode deliveryCode2;
        boolean z15;
        iobyxmoadg iobyxmoadgVar7;
        pz0.iobyxmoadg iobyxmoadgVar8;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f93495istkbnxepw;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f93495istkbnxepw = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object obj = draadjrbmkVar.f93499pmvmpeiblj;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f93495istkbnxepw;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar3 = (iobyxmoadg) draadjrbmkVar.f93493cqumvgiudr;
                deliveryCode = (DeliveryCode) draadjrbmkVar.f93496iwizpuwonk;
                iobyxmoadgVar2 = (pz0.iobyxmoadg) draadjrbmkVar.f93497jyumaefscl;
                product2 = (Product) draadjrbmkVar.f93500yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) draadjrbmkVar.f93501zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                z13 = draadjrbmkVar.f93494esjtqupxsv;
                iobyxmoadgVar5 = (iobyxmoadg) draadjrbmkVar.f93493cqumvgiudr;
                deliveryCode = (DeliveryCode) draadjrbmkVar.f93496iwizpuwonk;
                iobyxmoadgVar2 = (pz0.iobyxmoadg) draadjrbmkVar.f93497jyumaefscl;
                product2 = (Product) draadjrbmkVar.f93500yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) draadjrbmkVar.f93501zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar9 = iobyxmoadgVar4.f93481zdlpuopuiu;
                s81.iobyxmoadg iobyxmoadgVar10 = s81.iobyxmoadg.f105724esjtqupxsv;
                draadjrbmkVar.f93501zdlpuopuiu = iobyxmoadgVar4;
                draadjrbmkVar.f93500yggfygwlhe = product2;
                draadjrbmkVar.f93497jyumaefscl = iobyxmoadgVar2;
                draadjrbmkVar.f93496iwizpuwonk = deliveryCode;
                draadjrbmkVar.f93493cqumvgiudr = iobyxmoadgVar5;
                draadjrbmkVar.f93494esjtqupxsv = z13;
                draadjrbmkVar.f93498lereixgezr = zBooleanValue;
                draadjrbmkVar.f93495istkbnxepw = 3;
                objPpxfxbqfkf = iobyxmoadgVar9.ppxfxbqfkf(iobyxmoadgVar10, draadjrbmkVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                product3 = product2;
                iobyxmoadgVar6 = iobyxmoadgVar5;
                z14 = z13;
                deliveryCode2 = deliveryCode;
                z15 = zBooleanValue;
                obj = objPpxfxbqfkf;
                iobyxmoadgVar7 = iobyxmoadgVar4;
                iobyxmoadgVar8 = iobyxmoadgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z16 = draadjrbmkVar.f93498lereixgezr;
                boolean z17 = draadjrbmkVar.f93494esjtqupxsv;
                iobyxmoadg iobyxmoadgVar11 = (iobyxmoadg) draadjrbmkVar.f93493cqumvgiudr;
                DeliveryCode deliveryCode3 = (DeliveryCode) draadjrbmkVar.f93496iwizpuwonk;
                pz0.iobyxmoadg iobyxmoadgVar12 = (pz0.iobyxmoadg) draadjrbmkVar.f93497jyumaefscl;
                Product product4 = (Product) draadjrbmkVar.f93500yggfygwlhe;
                iobyxmoadgVar7 = (iobyxmoadg) draadjrbmkVar.f93501zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar6 = iobyxmoadgVar11;
                iobyxmoadgVar8 = iobyxmoadgVar12;
                product3 = product4;
                z15 = z16;
                z14 = z17;
                deliveryCode2 = deliveryCode3;
            }
            iobyxmoadgVar6.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.dxjokdxxww(deliveryCode2, product3, z14, z15, ((Boolean) obj).booleanValue()));
            iobyxmoadgVar7.lxfrhoxuzk(product3.getArticle());
            iobyxmoadgVar7.wizcaqwiak(product3.getId(), iobyxmoadgVar8);
            if (!((State) iobyxmoadgVar7.jlmebxxoox()).getPayload().getIsOrderEdit()) {
                iobyxmoadgVar7.skhdrjzrfn(product3.getArticle());
            }
            iobyxmoadgVar7.m(product3);
            iobyxmoadgVar7.l(product3, iobyxmoadgVar8);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        t81.iobyxmoadg iobyxmoadgVar13 = this.f93481zdlpuopuiu;
        s81.iobyxmoadg iobyxmoadgVar14 = s81.iobyxmoadg.f105732jpowsppfya;
        draadjrbmkVar.f93501zdlpuopuiu = this;
        product2 = product;
        draadjrbmkVar.f93500yggfygwlhe = product2;
        draadjrbmkVar.f93497jyumaefscl = iobyxmoadgVar;
        draadjrbmkVar.f93496iwizpuwonk = deliveryCodePpxfxbqfkf;
        draadjrbmkVar.f93493cqumvgiudr = this;
        draadjrbmkVar.f93495istkbnxepw = 1;
        Object objPpxfxbqfkf2 = iobyxmoadgVar13.ppxfxbqfkf(iobyxmoadgVar14, draadjrbmkVar);
        if (objPpxfxbqfkf2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        deliveryCode = deliveryCodePpxfxbqfkf;
        obj = objPpxfxbqfkf2;
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar3 = this;
        iobyxmoadgVar4 = iobyxmoadgVar3;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar15 = iobyxmoadgVar4.f93481zdlpuopuiu;
        s81.iobyxmoadg iobyxmoadgVar16 = s81.iobyxmoadg.f105737mbcevpiqjq;
        draadjrbmkVar.f93501zdlpuopuiu = iobyxmoadgVar4;
        draadjrbmkVar.f93500yggfygwlhe = product2;
        draadjrbmkVar.f93497jyumaefscl = iobyxmoadgVar2;
        draadjrbmkVar.f93496iwizpuwonk = deliveryCode;
        draadjrbmkVar.f93493cqumvgiudr = iobyxmoadgVar3;
        draadjrbmkVar.f93494esjtqupxsv = zBooleanValue2;
        draadjrbmkVar.f93495istkbnxepw = 2;
        Object objPpxfxbqfkf3 = iobyxmoadgVar15.ppxfxbqfkf(iobyxmoadgVar16, draadjrbmkVar);
        if (objPpxfxbqfkf3 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadg iobyxmoadgVar17 = iobyxmoadgVar3;
        z13 = zBooleanValue2;
        obj = objPpxfxbqfkf3;
        iobyxmoadgVar5 = iobyxmoadgVar17;
        zBooleanValue = ((Boolean) obj).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar18 = iobyxmoadgVar4.f93481zdlpuopuiu;
        s81.iobyxmoadg iobyxmoadgVar19 = s81.iobyxmoadg.f105724esjtqupxsv;
        draadjrbmkVar.f93501zdlpuopuiu = iobyxmoadgVar4;
        draadjrbmkVar.f93500yggfygwlhe = product2;
        draadjrbmkVar.f93497jyumaefscl = iobyxmoadgVar2;
        draadjrbmkVar.f93496iwizpuwonk = deliveryCode;
        draadjrbmkVar.f93493cqumvgiudr = iobyxmoadgVar5;
        draadjrbmkVar.f93494esjtqupxsv = z13;
        draadjrbmkVar.f93498lereixgezr = zBooleanValue;
        draadjrbmkVar.f93495istkbnxepw = 3;
        objPpxfxbqfkf = iobyxmoadgVar18.ppxfxbqfkf(iobyxmoadgVar19, draadjrbmkVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        product3 = product2;
        iobyxmoadgVar6 = iobyxmoadgVar5;
        z14 = z13;
        deliveryCode2 = deliveryCode;
        z15 = zBooleanValue;
        obj = objPpxfxbqfkf;
        iobyxmoadgVar7 = iobyxmoadgVar4;
        iobyxmoadgVar8 = iobyxmoadgVar2;
        iobyxmoadgVar6.ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.dxjokdxxww(deliveryCode2, product3, z14, z15, ((Boolean) obj).booleanValue()));
        iobyxmoadgVar7.lxfrhoxuzk(product3.getArticle());
        iobyxmoadgVar7.wizcaqwiak(product3.getId(), iobyxmoadgVar8);
        if (!((State) iobyxmoadgVar7.jlmebxxoox()).getPayload().getIsOrderEdit()) {
            iobyxmoadgVar7.skhdrjzrfn(product3.getArticle());
        }
        iobyxmoadgVar7.m(product3);
        iobyxmoadgVar7.l(product3, iobyxmoadgVar8);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void roivzttewh(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    private final auzgnhcxok skhdrjzrfn(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(str, this, null), 3, null);
    }

    private final void tbqsvytpvh(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uawqvzlxes(String str, boolean z13) {
        ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.zoijcleaow(str, z13));
    }

    private final auzgnhcxok wizcaqwiak(String str, pz0.iobyxmoadg iobyxmoadgVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(iobyxmoadgVar, str, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yzdjzghtvl(Warning warning) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f95255jyumaefscl)) {
            if (((State) jlmebxxoox()).getPayload().getIsOrderEdit()) {
                crxdokpmqz(eq0.gxszxtbevo.f31771iobyxmoadg);
                return;
            } else {
                ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(SpecificProductStore$Dialog.ComboAddedToBasket.f93404zdlpuopuiu));
                return;
            }
        }
        if (warning instanceof Warning.WithCodeAndMessage) {
            krqnebusok(warning);
        } else if (warning instanceof Warning.DailyLimit) {
            crxdokpmqz(new eq0.lqeggnwhkg(((Warning.DailyLimit) warning).getMessage()));
        }
    }

    public void b(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f93469jyumaefscl = iobyxmoadgVar;
    }

    public void c(boolean z13) {
        this.f93475ppxfxbqfkf.eablkybsjg(z13);
    }

    public void d(boolean z13) {
        this.f93475ppxfxbqfkf.gxszxtbevo(z13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: dvvnrvtcbc, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc intent) {
        ProductVariants productVariants;
        VideoProduct video;
        VivinoRating vivino;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        Product productHszhottldk;
        String article;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc) {
            auzgnhcxok((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC2208wkgbmnqykc) intent);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.rgvfuqvkyq.f93624iobyxmoadg)) {
            Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct == null || (article = mainProduct.getArticle()) == null) {
                return;
            }
            crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.btonecajqb(article));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.btonecajqb) {
            g();
            return;
        }
        Object article2 = null;
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf) {
            if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow.f93440iobyxmoadg);
                return;
            }
            ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf) intent;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.f93622iobyxmoadg)) {
                productHszhottldk = ((State) jlmebxxoox()).getMainProduct();
            } else {
                if (!(ppxfxbqfkfVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                productHszhottldk = hszhottldk(((State) jlmebxxoox()).getRecommendations(), ((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow) intent).zoijcleaow());
            }
            if (productHszhottldk == null) {
                return;
            }
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(productHszhottldk, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.ojitshcjhn.f93620iobyxmoadg)) {
            String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            if (orderEditId != null) {
                crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.C2191eablkybsjg(orderEditId));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.gtknphoqwx.f93611iobyxmoadg)) {
            e();
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog) {
            Product mainProduct2 = ((State) jlmebxxoox()).getMainProduct();
            ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog agtfadlqogVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog) intent;
            if (!(agtfadlqogVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.iobyxmoadg)) {
                if (!(agtfadlqogVar instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.zoijcleaow) intent;
                Product productHszhottldk2 = hszhottldk(((State) jlmebxxoox()).getRecommendations(), zoijcleaowVar.ppxfxbqfkf());
                if (productHszhottldk2 == null) {
                    return;
                } else {
                    vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(productHszhottldk2, zoijcleaowVar.zoijcleaow());
                }
            } else if (mainProduct2 == null) {
                return;
            } else {
                vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(mainProduct2, null);
            }
            Product product = (Product) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
            AnalyticsLocation.ItemFeed itemFeed = (AnalyticsLocation.ItemFeed) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
            for (Object obj : ((State) jlmebxxoox()).getProductDataList()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj).getId(), product.getId())) {
                    article2 = obj;
                    break;
                }
            }
            Product productGrlcpdaxtj = grlcpdaxtj(product, (ProductUIData) article2);
            String orderEditId2 = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(productGrlcpdaxtj, intent, !(orderEditId2 == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId2)), itemFeed, null), 3, null);
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp) {
            ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp) intent;
            Product productHszhottldk3 = hszhottldk(((State) jlmebxxoox()).getRecommendations(), wflxmlrfwpVar.ppxfxbqfkf());
            if (productHszhottldk3 == null) {
                return;
            }
            n(new AnalyticsPage.ItemDetail(productHszhottldk3.getArticle(), productHszhottldk3.getName()), new AnalyticElement.ProductItemElement(productHszhottldk3.getArticle(), productHszhottldk3.getName()), wflxmlrfwpVar.zoijcleaow());
            mhtqkkgtqm(productHszhottldk3);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.zoijcleaow.f93633iobyxmoadg)) {
            Product mainProduct3 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct3 != null) {
                if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow.f93440iobyxmoadg);
                    return;
                } else {
                    o(this, new AnalyticsPage.AddProductReview(mainProduct3.getName(), mainProduct3.getArticle()), null, null, 6, null);
                    crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.dxjokdxxww(mainProduct3.getArticle(), mainProduct3.getName()));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu.f93632iobyxmoadg)) {
            Product mainProduct4 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct4 != null) {
                o(this, new AnalyticsPage.ProductReviews(mainProduct4.getName(), mainProduct4.getArticle()), null, null, 6, null);
                crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.lqeggnwhkg(mainProduct4.getArticle(), mainProduct4.getName(), mainProduct4.getRating(), mainProduct4.getColorsModel()));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iwizpuwonk.f93615iobyxmoadg)) {
            Product mainProduct5 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct5 == null || (vivino = mainProduct5.getVivino()) == null) {
                return;
            }
            o(this, AnalyticsPage.Vivino.f92393iwizpuwonk, null, null, 6, null);
            crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wflxmlrfwp(vivino));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe) {
            Product mainProduct6 = ((State) jlmebxxoox()).getMainProduct();
            String name = mainProduct6 != null ? mainProduct6.getName() : null;
            if (name == null) {
                name = "";
            }
            Product mainProduct7 = ((State) jlmebxxoox()).getMainProduct();
            article2 = mainProduct7 != null ? mainProduct7.getArticle() : null;
            o(this, new AnalyticsPage.ProductDetailsPhoto(name, article2 != null ? article2 : ""), null, null, 6, null);
            crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gxszxtbevo(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe) intent).zoijcleaow()));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.kcexrzcfyt) {
            Product mainProduct8 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct8 == null || (video = mainProduct8.getVideo()) == null) {
                return;
            }
            o(this, AnalyticsPage.Video.f92392iwizpuwonk, null, null, 6, null);
            crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.draadjrbmk(video.getFile()));
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss) {
            List comboSetList = ((State) jlmebxxoox()).getComboSetList();
            if (comboSetList != null) {
                for (Object obj2 : comboSetList) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ComboSet) obj2).getId(), ((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss) intent).zoijcleaow())) {
                        article2 = obj2;
                        break;
                    }
                }
                ComboSet comboSet = (ComboSet) article2;
                if (comboSet != null) {
                    o(this, new AnalyticsPage.Combo(comboSet.getName(), comboSet.getId()), null, new AnalyticsLocation.Combo(comboSet.getName(), comboSet.getId()), 2, null);
                    crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.wkgbmnqykc(comboSet));
                    return;
                }
                return;
            }
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg) {
            ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg) intent;
            fmlbqenlif(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf());
            return;
        }
        if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm) {
            Product mainProduct9 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct9 != null) {
                ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm oxmwwwfdhmVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm) intent;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainProduct9.getArticle(), oxmwwwfdhmVar.zoijcleaow().getArticle())) {
                    return;
                }
                n(new AnalyticsPage.ItemDetail(mainProduct9.getArticle(), mainProduct9.getName()), new AnalyticElement.ProductItemElement(mainProduct9.getArticle(), mainProduct9.getName()), new AnalyticsLocation.Combo(oxmwwwfdhmVar.zoijcleaow().getId(), oxmwwwfdhmVar.zoijcleaow().getName()));
                crxdokpmqz(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.gtknphoqwx(new ProductPayload(new ProductPayload.Type.Article(oxmwwwfdhmVar.zoijcleaow().getArticle()), ((State) jlmebxxoox()).getPayload().getOrderEditId())));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.eablkybsjg.f93610iobyxmoadg)) {
            ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(null));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.gxszxtbevo.f93612iobyxmoadg)) {
            SpecificProductStore$Dialog dialog = ((State) jlmebxxoox()).getDialog();
            ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(null));
            if (dialog instanceof SpecificProductStore$Dialog.ComboAddedToBasket) {
                crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.ppxfxbqfkf.f93437iobyxmoadg);
                return;
            } else if (dialog instanceof SpecificProductStore$Dialog.ProductNotFound) {
                crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f93430iobyxmoadg);
                return;
            } else {
                if (dialog != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.jyumaefscl)) {
            if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu) {
                c(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu) intent).zoijcleaow());
                return;
            }
            if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk) {
                d(((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk) intent).zoijcleaow());
                return;
            }
            if (intent instanceof ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww) {
                ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww) intent;
                ixidwrxhsl(dxjokdxxwwVar.wkgbmnqykc(), dxjokdxxwwVar.zoijcleaow(), dxjokdxxwwVar.ppxfxbqfkf());
                return;
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.lqeggnwhkg.f93618iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f93430iobyxmoadg);
                return;
            }
        }
        Product mainProduct10 = ((State) jlmebxxoox()).getMainProduct();
        if (mainProduct10 == null || (productVariants = mainProduct10.getProductVariants()) == null) {
            return;
        }
        for (Object obj3 : productVariants.getItems()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductVariant) obj3).getId(), ((ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.wkgbmnqykc.jyumaefscl) intent).zoijcleaow())) {
                article2 = obj3;
                break;
            }
        }
        ProductVariant productVariant = (ProductVariant) article2;
        if (productVariant != null) {
            ulzqkzuiru(new ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.gxszxtbevo.draadjrbmk(productVariant));
        }
    }

    public final void ezmngbhpjk(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new eq0.ppxfxbqfkf(error));
    }

    public tg.iobyxmoadg fiwbwshyhd() {
        return this.f93468iwizpuwonk;
    }

    public sj.lqeggnwhkg fyldjkxazc() {
        return this.f93475ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(params, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: iwxlajgraz, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.ppxfxbqfkf.iobyxmoadg.f93600iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ipoelvxyzq();
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f93468iwizpuwonk = iobyxmoadgVar;
    }

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f93461btonecajqb;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        crxdokpmqz(eq0.wkgbmnqykc.f31775iobyxmoadg);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        crxdokpmqz(ru.myspar.proloyalty.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow.f93440iobyxmoadg);
    }
}
