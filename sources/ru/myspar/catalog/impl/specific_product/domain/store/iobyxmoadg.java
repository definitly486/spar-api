package ru.myspar.catalog.impl.specific_product.domain.store;

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
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.VideoProduct;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.domain.models.product.ProductVariant;
import ru.myspar.core.domain.models.product.ProductVariants;
import ru.myspar.core.domain.models.product.VivinoRating;
import ru.myspar.core.domain.models.recommendations.Recommendation;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.measure_type.MeasureTypeModel;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.rate.review.api.model.Reviews;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final j20.iobyxmoadg f85730agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final b12.zoijcleaow f85731btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final z10.nufgyqmvbu f85732cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final f20.btonecajqb f85733draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final e30.iobyxmoadg f85734dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final j00.zoijcleaow f85735eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private y00.iobyxmoadg f85736esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final c20.eablkybsjg f85737gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final oa0.ppxfxbqfkf f85738gxszxtbevo;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final sm.iobyxmoadg f85739iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final o20.btonecajqb f85740jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final yy1.iobyxmoadg f85741kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private tg.iobyxmoadg f85742lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final o20.iobyxmoadg f85743lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final k00.iobyxmoadg f85744nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final oa0.wflxmlrfwp f85745ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final l00.gtknphoqwx f85746oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final gg.gtknphoqwx f85747pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f85748ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final oa0.kcexrzcfyt f85749rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final lo.zoijcleaow f85750vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final y02.iobyxmoadg f85751wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final h20.gtknphoqwx f85752wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ye0.iobyxmoadg f85753yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final n00.iobyxmoadg f85754zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final C1958iobyxmoadg f85729zynmafqrjb = new C1958iobyxmoadg(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f85728istkbnxepw = 8;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f85755jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85757zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85755jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new agtfadlqog(this.f85755jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85757zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarFyldjkxazc = iobyxmoadg.this.fyldjkxazc();
                ChangeProductParams changeProductParams = this.f85755jyumaefscl;
                this.f85757zdlpuopuiu = 1;
                if (btonecajqbVarFyldjkxazc.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85758jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ String f85759yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85760zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(String str, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85759yggfygwlhe = str;
            this.f85758jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f85759yggfygwlhe, this.f85758jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85760zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    b12.zoijcleaow.iobyxmoadg iobyxmoadgVar = new b12.zoijcleaow.iobyxmoadg(this.f85759yggfygwlhe, 1);
                    iobyxmoadg iobyxmoadgVar2 = this.f85758jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    b12.zoijcleaow zoijcleaowVar = iobyxmoadgVar2.f85731btonecajqb;
                    this.f85760zdlpuopuiu = 1;
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
            iobyxmoadg iobyxmoadgVar5 = this.f85758jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.gtknphoqwx((Reviews) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.rhgxfdycjh(thDxjokdxxww);
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
        final /* synthetic */ sj.lqeggnwhkg f85761zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1954iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85762zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$cqumvgiudr$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1955iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85764yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85765zdlpuopuiu;

                public C1955iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85765zdlpuopuiu = obj;
                    this.f85764yggfygwlhe |= Integer.MIN_VALUE;
                    return C1954iobyxmoadg.this.emit(null, this);
                }
            }

            public C1954iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f85762zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1955iobyxmoadg c1955iobyxmoadg;
                if (gxszxtbevoVar instanceof C1955iobyxmoadg) {
                    c1955iobyxmoadg = (C1955iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1955iobyxmoadg.f85764yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1955iobyxmoadg.f85764yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1955iobyxmoadg = new C1955iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1955iobyxmoadg = new C1955iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1955iobyxmoadg.f85765zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1955iobyxmoadg.f85764yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85762zdlpuopuiu;
                    zoijcleaow.C1968iobyxmoadg c1968iobyxmoadg = new zoijcleaow.C1968iobyxmoadg((List) obj);
                    c1955iobyxmoadg.f85764yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c1968iobyxmoadg, c1955iobyxmoadg) == objGxszxtbevo) {
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
            this.f85761zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85761zdlpuopuiu.collect(new C1954iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85767zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85767zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f85739iwizpuwonk;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f85767zdlpuopuiu = 1;
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
            iobyxmoadg.this.crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.zoijcleaow(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ y00.iobyxmoadg f85768cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85769iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductPayload f85770jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f85771yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85772zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(ProductPayload productPayload, iobyxmoadg iobyxmoadgVar, y00.iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85770jyumaefscl = productPayload;
            this.f85769iwizpuwonk = iobyxmoadgVar;
            this.f85768cqumvgiudr = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f85770jyumaefscl, this.f85769iwizpuwonk, this.f85768cqumvgiudr, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            iobyxmoadg iobyxmoadgVar;
            Throwable thDxjokdxxww;
            String message;
            String str;
            String strEablkybsjg;
            h20.gtknphoqwx.zoijcleaow c0901zoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85771yggfygwlhe;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f85772zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    objWkgbmnqykc = obj2;
                    iobyxmoadgVar = this.f85769iwizpuwonk;
                    ProductPayload productPayload = this.f85770jyumaefscl;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                    if (thDxjokdxxww != null) {
                        rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                        message = thDxjokdxxww.getMessage();
                        str = null;
                        if (message != null && (strEablkybsjg = k30.draadjrbmk.eablkybsjg(message)) != null && (productPayload.getType() instanceof ProductPayload.Type.Barcode)) {
                            str = strEablkybsjg;
                        }
                        iobyxmoadgVar.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(new SpecificProductStore$Dialog.ProductNotFound(str)));
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                ProductPayload.Type type = this.f85770jyumaefscl.getType();
                if (type instanceof ProductPayload.Type.Article) {
                    c0901zoijcleaow = new h20.gtknphoqwx.zoijcleaow.iobyxmoadg(((ProductPayload.Type.Article) type).getValue());
                } else if (type instanceof ProductPayload.Type.ProductId) {
                    c0901zoijcleaow = new h20.gtknphoqwx.zoijcleaow.ppxfxbqfkf(((ProductPayload.Type.ProductId) type).getValue());
                } else {
                    if (!(type instanceof ProductPayload.Type.Barcode)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0901zoijcleaow = new h20.gtknphoqwx.zoijcleaow.C0901zoijcleaow(this.f85769iwizpuwonk.f85754zdlpuopuiu.iobyxmoadg(((ProductPayload.Type.Barcode) type).getValue()));
                }
                y00.iobyxmoadg iobyxmoadgVar2 = this.f85768cqumvgiudr;
                h20.gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new h20.gtknphoqwx.iobyxmoadg(iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), c0901zoijcleaow);
                iobyxmoadg iobyxmoadgVar4 = this.f85769iwizpuwonk;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                h20.gtknphoqwx gtknphoqwxVar = iobyxmoadgVar4.f85752wkgbmnqykc;
                this.f85771yggfygwlhe = 1;
                obj = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Product) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar6 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar7 = this.f85769iwizpuwonk;
            y00.iobyxmoadg iobyxmoadgVar8 = this.f85768cqumvgiudr;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                this.f85772zdlpuopuiu = objWkgbmnqykc;
                this.f85771yggfygwlhe = 2;
                if (iobyxmoadgVar7.yzdjzghtvl((Product) objWkgbmnqykc, iobyxmoadgVar8, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                obj2 = objWkgbmnqykc;
                objWkgbmnqykc = obj2;
            }
            iobyxmoadgVar = this.f85769iwizpuwonk;
            ProductPayload productPayload2 = this.f85770jyumaefscl;
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
                message = thDxjokdxxww.getMessage();
                str = null;
                if (message != null) {
                    str = strEablkybsjg;
                }
                iobyxmoadgVar.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(new SpecificProductStore$Dialog.ProductNotFound(str)));
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
        final /* synthetic */ no.zoijcleaow.C1522zoijcleaow f85773iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f85774jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85776zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(Product product, no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85774jyumaefscl = product;
            this.f85773iwizpuwonk = c1522zoijcleaow;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f85774jyumaefscl, this.f85773iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85776zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                j00.zoijcleaow zoijcleaowVar = iobyxmoadg.this.f85735eablkybsjg;
                String id2 = this.f85774jyumaefscl.getId();
                boolean isFavorite = this.f85774jyumaefscl.getIsFavorite();
                no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = this.f85773iwizpuwonk;
                this.f85776zdlpuopuiu = 1;
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class esjtqupxsv implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85777zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1956iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85778zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$esjtqupxsv$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1957iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85780yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85781zdlpuopuiu;

                public C1957iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85781zdlpuopuiu = obj;
                    this.f85780yggfygwlhe |= Integer.MIN_VALUE;
                    return C1956iobyxmoadg.this.emit(null, this);
                }
            }

            public C1956iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f85778zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1957iobyxmoadg c1957iobyxmoadg;
                if (gxszxtbevoVar instanceof C1957iobyxmoadg) {
                    c1957iobyxmoadg = (C1957iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1957iobyxmoadg.f85780yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1957iobyxmoadg.f85780yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1957iobyxmoadg = new C1957iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1957iobyxmoadg = new C1957iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1957iobyxmoadg.f85781zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1957iobyxmoadg.f85780yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85778zdlpuopuiu;
                    zoijcleaow.ppxfxbqfkf ppxfxbqfkfVar = new zoijcleaow.ppxfxbqfkf((Double) obj);
                    c1957iobyxmoadg.f85780yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(ppxfxbqfkfVar, c1957iobyxmoadg) == objGxszxtbevo) {
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
            this.f85777zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85777zdlpuopuiu.collect(new C1956iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85782iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f85783jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ y00.iobyxmoadg f85784yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85785zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(y00.iobyxmoadg iobyxmoadgVar, String str, iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85784yggfygwlhe = iobyxmoadgVar;
            this.f85783jyumaefscl = str;
            this.f85782iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gtknphoqwx(this.f85784yggfygwlhe, this.f85783jyumaefscl, this.f85782iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85785zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    e30.iobyxmoadg.C0635iobyxmoadg c0635iobyxmoadg = new e30.iobyxmoadg.C0635iobyxmoadg(this.f85784yggfygwlhe.wkgbmnqykc(), this.f85784yggfygwlhe.ppxfxbqfkf(), hg.jyumaefscl.eablkybsjg(this.f85783jyumaefscl), hg.jyumaefscl.r(n10.iobyxmoadg.wkgbmnqykc()));
                    iobyxmoadg iobyxmoadgVar = this.f85782iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    e30.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f85734dxjokdxxww;
                    this.f85785zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c0635iobyxmoadg, this);
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
            iobyxmoadg iobyxmoadgVar5 = this.f85782iwizpuwonk;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.btonecajqb((Map) objWkgbmnqykc));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
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
        final /* synthetic */ Product f85786jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85788zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(Product product, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85786jyumaefscl = product;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(this.f85786jyumaefscl, gxszxtbevoVar);
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
            int i13 = this.f85788zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    yy1.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f85741kcexrzcfyt;
                    this.f85788zdlpuopuiu = 1;
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
            Product product = this.f85786jyumaefscl;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                List list = (List) objWkgbmnqykc;
                Iterator it = iobyxmoadg.tbqsvytpvh(iobyxmoadgVar5).getProductDataList().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), product.getId()));
                ProductUIData productUIData = (ProductUIData) next;
                if (productUIData == null || (measureType = productUIData.getMeasureType()) == null || (currentMeasure = measureType.L(product.getMeasureTypeModel())) == null) {
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
                iobyxmoadgVar5.crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.dxjokdxxww(new PurchaseListAddProductDialogArgs.SingleProduct(article, basketDefault, currentMeasure.getValue(), list)));
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.rhgxfdycjh(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1958iobyxmoadg {
        public /* synthetic */ C1958iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1958iobyxmoadg() {
        }
    }

    public static final class iwizpuwonk implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85789zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$iwizpuwonk$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1959iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85790zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$iwizpuwonk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1960iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85792yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85793zdlpuopuiu;

                public C1960iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85793zdlpuopuiu = obj;
                    this.f85792yggfygwlhe |= Integer.MIN_VALUE;
                    return C1959iobyxmoadg.this.emit(null, this);
                }
            }

            public C1959iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                this.f85790zdlpuopuiu = nufgyqmvbuVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1960iobyxmoadg c1960iobyxmoadg;
                if (gxszxtbevoVar instanceof C1960iobyxmoadg) {
                    c1960iobyxmoadg = (C1960iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1960iobyxmoadg.f85792yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1960iobyxmoadg.f85792yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1960iobyxmoadg = new C1960iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1960iobyxmoadg = new C1960iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1960iobyxmoadg.f85793zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1960iobyxmoadg.f85792yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85790zdlpuopuiu;
                    zoijcleaow.C1969zoijcleaow c1969zoijcleaow = new zoijcleaow.C1969zoijcleaow((y00.iobyxmoadg) obj);
                    c1960iobyxmoadg.f85792yggfygwlhe = 1;
                    if (nufgyqmvbuVar.emit(c1969zoijcleaow, c1960iobyxmoadg) == objGxszxtbevo) {
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
            this.f85789zdlpuopuiu = lqeggnwhkgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85789zdlpuopuiu.collect(new C1959iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final class jyumaefscl implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85794yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85795zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$jyumaefscl$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1961iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f85796yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85797zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$jyumaefscl$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1962iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
                Object f85798cqumvgiudr;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                Object f85800jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85801yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85802zdlpuopuiu;

                public C1962iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85802zdlpuopuiu = obj;
                    this.f85801yggfygwlhe |= Integer.MIN_VALUE;
                    return C1961iobyxmoadg.this.emit(null, this);
                }
            }

            public C1961iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f85797zdlpuopuiu = nufgyqmvbuVar;
                this.f85796yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0092 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1962iobyxmoadg c1962iobyxmoadg;
                sj.nufgyqmvbu nufgyqmvbuVar;
                y00.iobyxmoadg iobyxmoadgVarZoijcleaow;
                if (gxszxtbevoVar instanceof C1962iobyxmoadg) {
                    c1962iobyxmoadg = (C1962iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1962iobyxmoadg.f85801yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1962iobyxmoadg.f85801yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1962iobyxmoadg = new C1962iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1962iobyxmoadg = new C1962iobyxmoadg(gxszxtbevoVar);
                }
                Object objZoijcleaow = c1962iobyxmoadg.f85802zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1962iobyxmoadg.f85801yggfygwlhe;
                if (i14 != 0) {
                    if (i14 == 1) {
                        iobyxmoadgVarZoijcleaow = (y00.iobyxmoadg) c1962iobyxmoadg.f85798cqumvgiudr;
                        nufgyqmvbuVar = (sj.nufgyqmvbu) c1962iobyxmoadg.f85800jyumaefscl;
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
                nufgyqmvbuVar = this.f85797zdlpuopuiu;
                iobyxmoadgVarZoijcleaow = (y00.iobyxmoadg) obj;
                String orderEditId = iobyxmoadg.tbqsvytpvh(this.f85796yggfygwlhe).getPayload().getOrderEditId();
                if (orderEditId != null && !mj.kcexrzcfyt.zfvoamnweg(orderEditId)) {
                    o20.btonecajqb btonecajqbVar = this.f85796yggfygwlhe.f85740jyumaefscl;
                    o20.btonecajqb.iobyxmoadg iobyxmoadgVar = new o20.btonecajqb.iobyxmoadg(orderEditId);
                    c1962iobyxmoadg.f85800jyumaefscl = nufgyqmvbuVar;
                    c1962iobyxmoadg.f85798cqumvgiudr = iobyxmoadgVarZoijcleaow;
                    c1962iobyxmoadg.f85801yggfygwlhe = 1;
                    objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar, c1962iobyxmoadg);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                c1962iobyxmoadg.f85800jyumaefscl = null;
                c1962iobyxmoadg.f85798cqumvgiudr = null;
                c1962iobyxmoadg.f85801yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(iobyxmoadgVarZoijcleaow, c1962iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVarZoijcleaow = y00.iobyxmoadg.zoijcleaow(iobyxmoadgVarZoijcleaow, null, ((e10.iobyxmoadg) objZoijcleaow).eablkybsjg(), null, 5, null);
                c1962iobyxmoadg.f85800jyumaefscl = null;
                c1962iobyxmoadg.f85798cqumvgiudr = null;
                c1962iobyxmoadg.f85801yggfygwlhe = 2;
                if (nufgyqmvbuVar.emit(iobyxmoadgVarZoijcleaow, c1962iobyxmoadg) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public jyumaefscl(sj.lqeggnwhkg lqeggnwhkgVar, iobyxmoadg iobyxmoadgVar) {
            this.f85795zdlpuopuiu = lqeggnwhkgVar;
            this.f85794yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85795zdlpuopuiu.collect(new C1961iobyxmoadg(nufgyqmvbuVar, this.f85794yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85803yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85804zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85804zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f85803yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f85803yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85806yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85807zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            lereixgezr lereixgezrVar = iobyxmoadg.this.new lereixgezr(gxszxtbevoVar);
            lereixgezrVar.f85806yggfygwlhe = obj;
            return lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85807zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            List list = (List) this.f85806yggfygwlhe;
            iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iobyxmoadgVar.krqnebusok((zoijcleaow) it.next());
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
        final /* synthetic */ boolean f85808cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ AnalyticsLocation.ItemFeed f85809esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc f85810iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f85811jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85813zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(Product product, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc wkgbmnqykcVar, boolean z13, AnalyticsLocation.ItemFeed itemFeed, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85811jyumaefscl = product;
            this.f85810iwizpuwonk = wkgbmnqykcVar;
            this.f85808cqumvgiudr = z13;
            this.f85809esjtqupxsv = itemFeed;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new lqeggnwhkg(this.f85811jyumaefscl, this.f85810iwizpuwonk, this.f85808cqumvgiudr, this.f85809esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85813zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.fmlbqenlif(this.f85811jyumaefscl, ((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp) this.f85810iwizpuwonk).iobyxmoadg(), this.f85808cqumvgiudr, this.f85809esjtqupxsv);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85814iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f85815jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ y00.iobyxmoadg f85816yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85817zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(y00.iobyxmoadg iobyxmoadgVar, String str, iobyxmoadg iobyxmoadgVar2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85816yggfygwlhe = iobyxmoadgVar;
            this.f85815jyumaefscl = str;
            this.f85814iwizpuwonk = iobyxmoadgVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f85816yggfygwlhe, this.f85815jyumaefscl, this.f85814iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85817zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow zoijcleaowVar = new j20.iobyxmoadg.InterfaceC1083iobyxmoadg.zoijcleaow(this.f85816yggfygwlhe.wkgbmnqykc(), w00.zoijcleaow.PRODUCT_SCREEN, this.f85816yggfygwlhe.ppxfxbqfkf(), null, this.f85815jyumaefscl, 8, null);
                    iobyxmoadg iobyxmoadgVar = this.f85814iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    j20.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f85730agtfadlqog;
                    this.f85817zdlpuopuiu = 1;
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
                this.f85814iwizpuwonk.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.C1953gxszxtbevo(list));
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85819yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85820zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = iobyxmoadg.this.new ojitshcjhn(gxszxtbevoVar);
            ojitshcjhnVar.f85819yggfygwlhe = obj;
            return ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85820zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f85819yggfygwlhe;
            iobyxmoadg.this.auzgnhcxok(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class oxmwwwfdhm implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85821yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85822zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$oxmwwwfdhm$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1963iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f85823yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85824zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$oxmwwwfdhm$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1964iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85826yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85827zdlpuopuiu;

                public C1964iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85827zdlpuopuiu = obj;
                    this.f85826yggfygwlhe |= Integer.MIN_VALUE;
                    return C1963iobyxmoadg.this.emit(null, this);
                }
            }

            public C1963iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f85824zdlpuopuiu = nufgyqmvbuVar;
                this.f85823yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1964iobyxmoadg c1964iobyxmoadg;
                if (gxszxtbevoVar instanceof C1964iobyxmoadg) {
                    c1964iobyxmoadg = (C1964iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1964iobyxmoadg.f85826yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1964iobyxmoadg.f85826yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1964iobyxmoadg = new C1964iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1964iobyxmoadg = new C1964iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1964iobyxmoadg.f85827zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1964iobyxmoadg.f85826yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85824zdlpuopuiu;
                    y02.iobyxmoadg.C3119iobyxmoadg c3119iobyxmoadg = (y02.iobyxmoadg.C3119iobyxmoadg) obj;
                    Product mainProduct = iobyxmoadg.tbqsvytpvh(this.f85823yggfygwlhe).getMainProduct();
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainProduct != null ? mainProduct.getArticle() : null, c3119iobyxmoadg.iobyxmoadg())) {
                        c1964iobyxmoadg.f85826yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1964iobyxmoadg) == objGxszxtbevo) {
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
            this.f85822zdlpuopuiu = lqeggnwhkgVar;
            this.f85821yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85822zdlpuopuiu.collect(new C1963iobyxmoadg(nufgyqmvbuVar, this.f85821yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class pmvmpeiblj extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Product f85828jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85830zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        pmvmpeiblj(Product product, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85828jyumaefscl = product;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new pmvmpeiblj(this.f85828jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85830zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (!iobyxmoadg.tbqsvytpvh(iobyxmoadg.this).getPayload().getIsOrderEdit()) {
                    ye0.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f85753yggfygwlhe;
                    ze0.iobyxmoadg.eablkybsjg eablkybsjgVar = new ze0.iobyxmoadg.eablkybsjg(this.f85828jyumaefscl.getArticle());
                    AnalyticsPage.ItemDetail itemDetail = new AnalyticsPage.ItemDetail(this.f85828jyumaefscl.getArticle(), this.f85828jyumaefscl.getName());
                    this.f85830zdlpuopuiu = 1;
                    if (iobyxmoadgVar.lqeggnwhkg(eablkybsjgVar, itemDetail, this) == objGxszxtbevo) {
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
        final /* synthetic */ ComboSetProduct f85831iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f85832jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85834zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85832jyumaefscl = comboSetProduct;
            this.f85831iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f85832jyumaefscl, this.f85831iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objVdvldrhtss;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85834zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                k00.iobyxmoadg iobyxmoadgVar = iobyxmoadg.this.f85744nufgyqmvbu;
                ComboSetProduct comboSetProduct = this.f85832jyumaefscl;
                ComboSetProduct comboSetProduct2 = this.f85831iwizpuwonk;
                this.f85834zdlpuopuiu = 1;
                objVdvldrhtss = iobyxmoadgVar.vdvldrhtss(comboSetProduct, comboSetProduct2, this);
                if (objVdvldrhtss == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                objVdvldrhtss = ((gg.kcexrzcfyt) obj).rgvfuqvkyq();
            }
            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
            if (gg.kcexrzcfyt.agtfadlqog(objVdvldrhtss)) {
                iobyxmoadgVar2.eslsurpljm(((t00.iobyxmoadg) objVdvldrhtss).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objVdvldrhtss);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar2.rhgxfdycjh(thDxjokdxxww);
            }
            iobyxmoadg.this.ppxfxbqfkf(null);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f85835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85836zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f85836zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f85835yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            rgvfuqvkyq rgvfuqvkyqVar = new rgvfuqvkyq(gxszxtbevoVar);
            rgvfuqvkyqVar.f85835yggfygwlhe = th2;
            return rgvfuqvkyqVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85838zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$vdvldrhtss$iobyxmoadg, reason: collision with other inner class name */
        static final class C1965iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f85839zdlpuopuiu;

            C1965iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
                this.f85839zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                    this.f85839zdlpuopuiu.rhgxfdycjh(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f85839zdlpuopuiu.a(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85838zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = iobyxmoadg.this.fyldjkxazc().zoijcleaow();
                C1965iobyxmoadg c1965iobyxmoadg = new C1965iobyxmoadg(iobyxmoadg.this);
                this.f85838zdlpuopuiu = 1;
                if (lqeggnwhkgVarZoijcleaow.collect(c1965iobyxmoadg, this) == objGxszxtbevo) {
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
        Object f85840cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f85841esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        int f85842istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f85843iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f85844jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f85845lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        /* synthetic */ Object f85846pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f85847yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f85848zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f85846pmvmpeiblj = obj;
            this.f85842istkbnxepw |= Integer.MIN_VALUE;
            return iobyxmoadg.this.yzdjzghtvl(null, null, this);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f85850iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ComboSetProduct f85851jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85853zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85851jyumaefscl = comboSetProduct;
            this.f85850iwizpuwonk = comboSetProduct2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(this.f85851jyumaefscl, this.f85850iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85853zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(true));
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    ComboSetProduct comboSetProduct = this.f85851jyumaefscl;
                    ComboSetProduct comboSetProduct2 = this.f85850iwizpuwonk;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    o20.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f85743lqeggnwhkg;
                    String orderEditId = iobyxmoadg.tbqsvytpvh(iobyxmoadgVar).getPayload().getOrderEditId();
                    if (orderEditId == null) {
                        orderEditId = "";
                    }
                    o20.iobyxmoadg.C1549iobyxmoadg c1549iobyxmoadg = new o20.iobyxmoadg.C1549iobyxmoadg(orderEditId, comboSetProduct, comboSetProduct2);
                    this.f85853zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(c1549iobyxmoadg, this);
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
                iobyxmoadgVar5.eslsurpljm((Warning) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.rhgxfdycjh(thDxjokdxxww);
            }
            iobyxmoadg.this.ppxfxbqfkf(null);
            iobyxmoadg.this.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.nufgyqmvbu(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class yggfygwlhe implements sj.lqeggnwhkg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f85854yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f85855zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1966iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f85856yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.nufgyqmvbu f85857zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$yggfygwlhe$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            public static final class C1967iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                int f85859yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                /* synthetic */ Object f85860zdlpuopuiu;

                public C1967iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f85860zdlpuopuiu = obj;
                    this.f85859yggfygwlhe |= Integer.MIN_VALUE;
                    return C1966iobyxmoadg.this.emit(null, this);
                }
            }

            public C1966iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
                this.f85857zdlpuopuiu = nufgyqmvbuVar;
                this.f85856yggfygwlhe = iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1967iobyxmoadg c1967iobyxmoadg;
                if (gxszxtbevoVar instanceof C1967iobyxmoadg) {
                    c1967iobyxmoadg = (C1967iobyxmoadg) gxszxtbevoVar;
                    int i13 = c1967iobyxmoadg.f85859yggfygwlhe;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1967iobyxmoadg.f85859yggfygwlhe = i13 - Integer.MIN_VALUE;
                    } else {
                        c1967iobyxmoadg = new C1967iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    c1967iobyxmoadg = new C1967iobyxmoadg(gxszxtbevoVar);
                }
                Object obj2 = c1967iobyxmoadg.f85860zdlpuopuiu;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = c1967iobyxmoadg.f85859yggfygwlhe;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj2);
                    sj.nufgyqmvbu nufgyqmvbuVar = this.f85857zdlpuopuiu;
                    if (iobyxmoadg.tbqsvytpvh(this.f85856yggfygwlhe).getPayload().getIsOrderEdit()) {
                        c1967iobyxmoadg.f85859yggfygwlhe = 1;
                        if (nufgyqmvbuVar.emit(obj, c1967iobyxmoadg) == objGxszxtbevo) {
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
            this.f85855zdlpuopuiu = lqeggnwhkgVar;
            this.f85854yggfygwlhe = iobyxmoadgVar;
        }

        @Override // sj.lqeggnwhkg
        public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCollect = this.f85855zdlpuopuiu.collect(new C1966iobyxmoadg(nufgyqmvbuVar, this.f85854yggfygwlhe), gxszxtbevoVar);
            return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85862zdlpuopuiu;

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
            if (this.f85862zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            Product mainProduct = iobyxmoadg.tbqsvytpvh(iobyxmoadg.this).getMainProduct();
            if (mainProduct != null && (article = mainProduct.getArticle()) != null) {
                iobyxmoadg.this.wizcaqwiak(article);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y02.iobyxmoadg.C3119iobyxmoadg c3119iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(c3119iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    private static abstract class zoijcleaow implements os.iobyxmoadg {

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1968iobyxmoadg extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final List f85863iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f85864zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1968iobyxmoadg(List productUIData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productUIData, "productUIData");
                this.f85863iobyxmoadg = productUIData;
                this.f85864zoijcleaow = "cartProducts";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1968iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85863iobyxmoadg, ((C1968iobyxmoadg) obj).f85863iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f85864zoijcleaow;
            }

            public int hashCode() {
                return this.f85863iobyxmoadg.hashCode();
            }

            public final List iobyxmoadg() {
                return this.f85863iobyxmoadg;
            }

            public String toString() {
                return "CartProducts(productUIData=" + this.f85863iobyxmoadg + ")";
            }
        }

        public static final class ppxfxbqfkf extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final Double f85865iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f85866zoijcleaow;

            public ppxfxbqfkf(Double d13) {
                super(null);
                this.f85865iobyxmoadg = d13;
                this.f85866zoijcleaow = "deliveryPrice";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85865iobyxmoadg, ((ppxfxbqfkf) obj).f85865iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f85866zoijcleaow;
            }

            public int hashCode() {
                Double d13 = this.f85865iobyxmoadg;
                if (d13 == null) {
                    return 0;
                }
                return d13.hashCode();
            }

            public String toString() {
                return "DeliveryPrice(newPrice=" + this.f85865iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1969zoijcleaow extends zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final y00.iobyxmoadg f85867iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f85868zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1969zoijcleaow(y00.iobyxmoadg deliveryData) {
                super(null);
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryData, "deliveryData");
                this.f85867iobyxmoadg = deliveryData;
                this.f85868zoijcleaow = "changeCurrentShop";
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1969zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f85867iobyxmoadg, ((C1969zoijcleaow) obj).f85867iobyxmoadg);
            }

            @Override // os.iobyxmoadg
            public String getKey() {
                return this.f85868zoijcleaow;
            }

            public int hashCode() {
                return this.f85867iobyxmoadg.hashCode();
            }

            public final y00.iobyxmoadg iobyxmoadg() {
                return this.f85867iobyxmoadg;
            }

            public String toString() {
                return "ChangeCurrentShop(deliveryData=" + this.f85867iobyxmoadg + ")";
            }
        }

        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(h20.gtknphoqwx getProductDetailsUseCase, j00.zoijcleaow changeFavoritesInteractor, oa0.ppxfxbqfkf getCatalogRatingEnableUseCase, o20.iobyxmoadg addComboSetEditOrderUseCase, k00.iobyxmoadg cartInteractor, e30.iobyxmoadg getRecommendationsUseCase, b12.zoijcleaow getReviewsUseCase, c20.eablkybsjg isLoggedInUseCase, f20.btonecajqb subscribeToOrderDeliveryPriceUseCase, y02.iobyxmoadg changeProductReviewObserver, j20.iobyxmoadg getComboSetUseCase, oa0.wflxmlrfwp isPurchaseListsFeatureEnabledUseCase, oa0.kcexrzcfyt isVivinoFeatureEnabledUseCase, lo.zoijcleaow analyticsTracker, l00.gtknphoqwx productChangesSourceProvider, yy1.iobyxmoadg purchasesListComponentApi, n00.iobyxmoadg barcodeMapper, ye0.iobyxmoadg loymaxPopupsObserver, o20.btonecajqb getEditOrderUseCase, sm.iobyxmoadg getUserAddressFlowInfo, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getProductDetailsUseCase, "getProductDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCatalogRatingEnableUseCase, "getCatalogRatingEnableUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addComboSetEditOrderUseCase, "addComboSetEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRecommendationsUseCase, "getRecommendationsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getReviewsUseCase, "getReviewsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToOrderDeliveryPriceUseCase, "subscribeToOrderDeliveryPriceUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductReviewObserver, "changeProductReviewObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getComboSetUseCase, "getComboSetUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isPurchaseListsFeatureEnabledUseCase, "isPurchaseListsFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isVivinoFeatureEnabledUseCase, "isVivinoFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcodeMapper, "barcodeMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loymaxPopupsObserver, "loymaxPopupsObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f85748ppxfxbqfkf = new sx.ppxfxbqfkf();
        this.f85752wkgbmnqykc = getProductDetailsUseCase;
        this.f85735eablkybsjg = changeFavoritesInteractor;
        this.f85738gxszxtbevo = getCatalogRatingEnableUseCase;
        this.f85743lqeggnwhkg = addComboSetEditOrderUseCase;
        this.f85744nufgyqmvbu = cartInteractor;
        this.f85734dxjokdxxww = getRecommendationsUseCase;
        this.f85731btonecajqb = getReviewsUseCase;
        this.f85737gtknphoqwx = isLoggedInUseCase;
        this.f85733draadjrbmk = subscribeToOrderDeliveryPriceUseCase;
        this.f85751wflxmlrfwp = changeProductReviewObserver;
        this.f85730agtfadlqog = getComboSetUseCase;
        this.f85745ojitshcjhn = isPurchaseListsFeatureEnabledUseCase;
        this.f85749rgvfuqvkyq = isVivinoFeatureEnabledUseCase;
        this.f85750vdvldrhtss = analyticsTracker;
        this.f85746oxmwwwfdhm = productChangesSourceProvider;
        this.f85741kcexrzcfyt = purchasesListComponentApi;
        this.f85754zdlpuopuiu = barcodeMapper;
        this.f85753yggfygwlhe = loymaxPopupsObserver;
        this.f85740jyumaefscl = getEditOrderUseCase;
        this.f85739iwizpuwonk = getUserAddressFlowInfo;
        this.f85732cqumvgiudr = subscribeToCurrentDeliveryDataUseCase;
        this.f85747pmvmpeiblj = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: rr.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ru.myspar.catalog.impl.specific_product.domain.store.iobyxmoadg.b(this.f83677zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Warning warning) {
        ah.wkgbmnqykc[] wkgbmnqykcVarArr = {kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class), kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.DailyLimit.class)};
        for (int i13 = 0; i13 < 2; i13++) {
            if (wkgbmnqykcVarArr[i13].zdlpuopuiu(warning)) {
                return;
            }
        }
        crxdokpmqz(new rr.gxszxtbevo(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok(String str, boolean z13) {
        ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.zoijcleaow(str, z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb b(iobyxmoadg iobyxmoadgVar) {
        String orderEditId = ((State) iobyxmoadgVar.jlmebxxoox()).getPayload().getOrderEditId();
        return iobyxmoadgVar.f85746oxmwwwfdhm.iobyxmoadg((orderEditId == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId)) ? l00.btonecajqb.iobyxmoadg.zoijcleaow.f61220iobyxmoadg : new l00.btonecajqb.iobyxmoadg.ppxfxbqfkf(orderEditId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eslsurpljm(Warning warning) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(warning, Warning.Empty.f87479jyumaefscl)) {
            if (((State) jlmebxxoox()).getPayload().getIsOrderEdit()) {
                crxdokpmqz(rr.eablkybsjg.f83675iobyxmoadg);
                return;
            } else {
                ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(SpecificProductStore$Dialog.ComboAddedToBasket.f85674zdlpuopuiu));
                return;
            }
        }
        if (warning instanceof Warning.WithCodeAndMessage) {
            a(warning);
        } else if (warning instanceof Warning.DailyLimit) {
            crxdokpmqz(new rr.gxszxtbevo(((Warning.DailyLimit) warning).getMessage()));
        }
    }

    private final void ezmngbhpjk(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        boolean isOrderEdit = ((State) jlmebxxoox()).getPayload().getIsOrderEdit();
        if (!((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() && !isOrderEdit) {
            crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.C1952eablkybsjg(NonAuthorizedPayload.zoijcleaow.BUY));
        } else if (!isOrderEdit) {
            roivzttewh(comboSetProduct, comboSetProduct2);
        } else {
            ppxfxbqfkf(null);
            uawqvzlxes(comboSetProduct, comboSetProduct2);
        }
    }

    private final void f() {
        this.f85750vdvldrhtss.wkgbmnqykc(new oo.gxszxtbevo.iobyxmoadg(null, 1, null));
    }

    private final Product fiwbwshyhd(Map map, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(Product product, ProductCardEvent productCardEvent, boolean z13, AnalyticsLocation analyticsLocation) {
        Object next;
        List limits;
        List limits2;
        Object ppxfxbqfkfVar;
        if (productCardEvent instanceof ProductCardEvent.CounterInternal) {
            ProductCardEvent.CounterInternal counterInternal = (ProductCardEvent.CounterInternal) productCardEvent;
            if (counterInternal instanceof ProductCardEvent.CounterInternal.ShowMessage) {
                ppxfxbqfkfVar = new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.iobyxmoadg(product.getId());
            } else {
                if (!(counterInternal instanceof ProductCardEvent.CounterInternal.HideMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                ppxfxbqfkfVar = new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.ppxfxbqfkf(product.getId());
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
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        String id2 = product.getId();
        String article = product.getArticle();
        boolean isAvailableToBuy = product.getIsAvailableToBuy();
        boolean isPmProduct = product.getIsPmProduct();
        boolean availableOnlyForPickup = product.getAvailableOnlyForPickup();
        MeasureTypeModel measureTypeModel = product.getMeasureTypeModel();
        Double avgWeight = product.getAvgWeight();
        if (productUIData == null || (limits2 = productUIData.getLimits()) == null || (limits = k30.zoijcleaow.iobyxmoadg(limits2)) == null) {
            limits = product.getLimits();
        }
        hkdspvbjdz(new ChangeProductParams(id2, article, zoijcleaowVarIobyxmoadg, isAvailableToBuy, isPmProduct, availableOnlyForPickup, measureTypeModel, avgWeight, limits, new ChangeProductAnalyticParams(new AnalyticsPage.ItemDetail(product.getName(), product.getId()), analyticsLocation, product.getName())), z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb fyldjkxazc() {
        return (l00.btonecajqb) this.f85747pmvmpeiblj.getValue();
    }

    private final void g() {
        if (((State) jlmebxxoox()).getAnalyticLoadCompletedFirstTime()) {
            return;
        }
        this.f85750vdvldrhtss.zoijcleaow(new oo.gxszxtbevo.iobyxmoadg(null, 1, null));
        ulzqkzuiru(ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.wkgbmnqykc.f85725iobyxmoadg);
    }

    private final void grlcpdaxtj() {
        f();
        h();
        k();
        i();
        j();
    }

    private final void h() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f85735eablkybsjg.dxjokdxxww(), new ojitshcjhn(null)), new rgvfuqvkyq(null)), sopmlzcsov());
    }

    private final auzgnhcxok hszhottldk(String str, y00.iobyxmoadg iobyxmoadgVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(iobyxmoadgVar, str, this, null), 3, null);
    }

    private final auzgnhcxok i() {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(null), 3, null);
    }

    private final auzgnhcxok igdgnonuha(String str, y00.iobyxmoadg iobyxmoadgVar) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new nufgyqmvbu(iobyxmoadgVar, str, this, null), 3, null);
    }

    private final void iwxlajgraz(ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc interfaceC1970wkgbmnqykc) {
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
        if (mainProduct == null) {
            return;
        }
        AnalyticsPage.ItemDetail itemDetail = new AnalyticsPage.ItemDetail(mainProduct.getArticle(), mainProduct.getName());
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(interfaceC1970wkgbmnqykc, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.iobyxmoadg.f85898iobyxmoadg)) {
            vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(mainProduct, new no.zoijcleaow.C1522zoijcleaow(itemDetail, null, new AnalyticElement.ProductItemElement(mainProduct.getArticle(), mainProduct.getName())));
        } else {
            if (!(interfaceC1970wkgbmnqykc instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.zoijcleaow zoijcleaowVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc.zoijcleaow) interfaceC1970wkgbmnqykc;
            Product productFiwbwshyhd = fiwbwshyhd(((State) jlmebxxoox()).getRecommendations(), zoijcleaowVar.ppxfxbqfkf());
            AnalyticsLocation.ItemFeed itemFeedZoijcleaow = zoijcleaowVar.zoijcleaow();
            String article = productFiwbwshyhd != null ? productFiwbwshyhd.getArticle() : null;
            if (article == null) {
                article = "";
            }
            String name = productFiwbwshyhd != null ? productFiwbwshyhd.getName() : null;
            vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(productFiwbwshyhd, new no.zoijcleaow.C1522zoijcleaow(itemDetail, itemFeedZoijcleaow, new AnalyticElement.ProductItemElement(article, name != null ? name : "")));
        }
        Product product = (Product) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
        no.zoijcleaow.C1522zoijcleaow c1522zoijcleaow = (no.zoijcleaow.C1522zoijcleaow) vdvldrhtssVarIobyxmoadg.wkgbmnqykc();
        if (product == null) {
            return;
        }
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(product, c1522zoijcleaow, null), 3, null);
    }

    private final void ixidwrxhsl(Product product) {
        crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.draadjrbmk(new ProductPayload(new ProductPayload.Type.ProductId(product.getId()), ((State) jlmebxxoox()).getPayload().getOrderEditId())));
    }

    private final void j() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.gxszxtbevo(new oxmwwwfdhm(this.f85751wflxmlrfwp.btonecajqb(), this), new kcexrzcfyt(null)), new zdlpuopuiu(null)), sopmlzcsov());
    }

    private final void jrbgnlbqoe(HintUiModel hintUiModel, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.ojitshcjhn(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.ItemDetail(analyticElement.getId(), analyticElement.getModern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl.NAME java.lang.String()), analyticsLocation)));
    }

    private final auzgnhcxok k() {
        sj.lqeggnwhkg lqeggnwhkgVarIpoelvxyzq = ipoelvxyzq();
        iwizpuwonk iwizpuwonkVar = new iwizpuwonk(new jyumaefscl(this.f85732cqumvgiudr.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), this));
        cqumvgiudr cqumvgiudrVar = new cqumvgiudr(fyldjkxazc().iobyxmoadg());
        f20.btonecajqb btonecajqbVar = this.f85733draadjrbmk;
        String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
        if (orderEditId == null) {
            orderEditId = "";
        }
        return sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(os.lqeggnwhkg.iobyxmoadg(lqeggnwhkgVarIpoelvxyzq, iwizpuwonkVar, cqumvgiudrVar, new esjtqupxsv(new yggfygwlhe(btonecajqbVar.zoijcleaow(orderEditId), this))), new lereixgezr(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok(zoijcleaow zoijcleaowVar) {
        if (!(zoijcleaowVar instanceof zoijcleaow.C1969zoijcleaow)) {
            if (zoijcleaowVar instanceof zoijcleaow.C1968iobyxmoadg) {
                ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.eablkybsjg(((zoijcleaow.C1968iobyxmoadg) zoijcleaowVar).iobyxmoadg()));
                return;
            } else {
                if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(rr.zoijcleaow.f83680iobyxmoadg);
                return;
            }
        }
        zoijcleaow.C1969zoijcleaow c1969zoijcleaow = (zoijcleaow.C1969zoijcleaow) zoijcleaowVar;
        c(c1969zoijcleaow.iobyxmoadg());
        lxfrhoxuzk(c1969zoijcleaow.iobyxmoadg());
        tg.iobyxmoadg iobyxmoadgVarAgeimvtcrz = ageimvtcrz();
        if (iobyxmoadgVarAgeimvtcrz != null) {
            iobyxmoadgVarAgeimvtcrz.invoke();
        }
    }

    private final void l(Product product, y00.iobyxmoadg iobyxmoadgVar) {
        ProductPayload.Type type = ((State) jlmebxxoox()).getPayload().getType();
        ProductPayload.Type.Barcode barcode = type instanceof ProductPayload.Type.Barcode ? (ProductPayload.Type.Barcode) type : null;
        String value = barcode != null ? barcode.getValue() : null;
        String strWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        String id2 = product.getId();
        String article = product.getArticle();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        this.f85750vdvldrhtss.eablkybsjg(new oo.gxszxtbevo.iobyxmoadg(strWkgbmnqykc, id2, article, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.getServerCode() : null, value));
    }

    private final void lxfrhoxuzk(y00.iobyxmoadg iobyxmoadgVar) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(((State) jlmebxxoox()).getPayload(), this, iobyxmoadgVar, null), 3, null);
    }

    private final auzgnhcxok m(Product product) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new pmvmpeiblj(product, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    private final Product mhtqkkgtqm(Product product, ProductUIData productUIData) {
        MeasureType originalMeasure;
        if (productUIData == null) {
            return product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.availableOnlyForPickup : false, ((-513) & 4096) != 0 ? product.onlyInShop : false, ((-513) & 8192) != 0 ? product.isAvailableToBuy : false, ((-513) & 16384) != 0 ? product.productPropertyNames : null, ((-513) & 32768) != 0 ? product.productProperties : null, ((-513) & 65536) != 0 ? product.photoUrl : null, ((-513) & 131072) != 0 ? product.photoUrls : null, ((-513) & 262144) != 0 ? product.energy : null, ((-513) & 524288) != 0 ? product.fats : null, ((-513) & 1048576) != 0 ? product.carbs : null, ((-513) & 2097152) != 0 ? product.protein : null, ((-513) & 4194304) != 0 ? product.params : null, ((-513) & 8388608) != 0 ? product.description : null, ((-513) & 16777216) != 0 ? product.chemical : null, ((-513) & 33554432) != 0 ? product.hasDiscount : false, ((-513) & 67108864) != 0 ? product.hints : null, ((-513) & 134217728) != 0 ? product.hidePrice : false, ((-513) & 268435456) != 0 ? product.rating : null, ((-513) & 536870912) != 0 ? product.reviews : 0, ((-513) & 1073741824) != 0 ? product.isPmProduct : false, ((-513) & Integer.MIN_VALUE) != 0 ? product.video : null, (65535 & 1) != 0 ? product.colorsModel : null, (65535 & 2) != 0 ? product.country : null, (65535 & 4) != 0 ? product.region : null, (65535 & 8) != 0 ? product.countryFlagEmoji : null, (65535 & 16) != 0 ? product.type : null, (65535 & 32) != 0 ? product.kind : null, (65535 & 64) != 0 ? product.grape : null, (65535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.standart : null, (65535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.countryMapIcon : null, (65535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.tasting : null, (65535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.styling : null, (65535 & 2048) != 0 ? product.button : null, (65535 & 4096) != 0 ? product.limits : null, (65535 & 8192) != 0 ? product.vivino : null, (65535 & 16384) != 0 ? product.productVariants : null, (65535 & 32768) != 0 ? product.quantity : 0.0d);
        }
        MeasureType measureType = productUIData.getMeasureType();
        if (measureType == null || (originalMeasure = measureType.L(product.getMeasureTypeModel())) == null) {
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
        return product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : measureTypeModelPpxfxbqfkf, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.availableOnlyForPickup : false, ((-513) & 4096) != 0 ? product.onlyInShop : false, ((-513) & 8192) != 0 ? product.isAvailableToBuy : false, ((-513) & 16384) != 0 ? product.productPropertyNames : null, ((-513) & 32768) != 0 ? product.productProperties : null, ((-513) & 65536) != 0 ? product.photoUrl : null, ((-513) & 131072) != 0 ? product.photoUrls : null, ((-513) & 262144) != 0 ? product.energy : null, ((-513) & 524288) != 0 ? product.fats : null, ((-513) & 1048576) != 0 ? product.carbs : null, ((-513) & 2097152) != 0 ? product.protein : null, ((-513) & 4194304) != 0 ? product.params : null, ((-513) & 8388608) != 0 ? product.description : null, ((-513) & 16777216) != 0 ? product.chemical : null, ((-513) & 33554432) != 0 ? product.hasDiscount : false, ((-513) & 67108864) != 0 ? product.hints : null, ((-513) & 134217728) != 0 ? product.hidePrice : false, ((-513) & 268435456) != 0 ? product.rating : null, ((-513) & 536870912) != 0 ? product.reviews : 0, ((-513) & 1073741824) != 0 ? product.isPmProduct : false, ((-513) & Integer.MIN_VALUE) != 0 ? product.video : null, (65535 & 1) != 0 ? product.colorsModel : null, (65535 & 2) != 0 ? product.country : null, (65535 & 4) != 0 ? product.region : null, (65535 & 8) != 0 ? product.countryFlagEmoji : null, (65535 & 16) != 0 ? product.type : null, (65535 & 32) != 0 ? product.kind : null, (65535 & 64) != 0 ? product.grape : null, (65535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.standart : null, (65535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.countryMapIcon : null, (65535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.tasting : null, (65535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.styling : null, (65535 & 2048) != 0 ? product.button : null, (65535 & 4096) != 0 ? product.limits : limits, (65535 & 8192) != 0 ? product.vivino : null, (65535 & 16384) != 0 ? product.productVariants : null, (65535 & 32768) != 0 ? product.quantity : productUIData.getQuantity());
    }

    private final void n(AnalyticsPage analyticsPage, AnalyticElement analyticElement, AnalyticsLocation analyticsLocation) {
        Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
        String name = mainProduct != null ? mainProduct.getName() : null;
        if (name == null) {
            name = "";
        }
        Product mainProduct2 = ((State) jlmebxxoox()).getMainProduct();
        String article = mainProduct2 != null ? mainProduct2.getArticle() : null;
        this.f85750vdvldrhtss.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.ProductList(name, article != null ? article : ""), analyticsPage, analyticsLocation, analyticElement, null, 16, null)));
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

    private final void roivzttewh(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    public static final /* synthetic */ State tbqsvytpvh(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void uawqvzlxes(ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(comboSetProduct, comboSetProduct2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final auzgnhcxok wizcaqwiak(String str) {
        return pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(str, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object yzdjzghtvl(Product product, y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        wflxmlrfwp wflxmlrfwpVar;
        Product product2;
        DeliveryCode deliveryCode;
        y00.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        iobyxmoadg iobyxmoadgVar4;
        boolean z13;
        iobyxmoadg iobyxmoadgVar5;
        boolean zBooleanValue;
        Object objZoijcleaow;
        Product product3;
        iobyxmoadg iobyxmoadgVar6;
        boolean z14;
        DeliveryCode deliveryCode2;
        boolean z15;
        iobyxmoadg iobyxmoadgVar7;
        y00.iobyxmoadg iobyxmoadgVar8;
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            wflxmlrfwpVar = (wflxmlrfwp) gxszxtbevoVar;
            int i13 = wflxmlrfwpVar.f85842istkbnxepw;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wflxmlrfwpVar.f85842istkbnxepw = i13 - Integer.MIN_VALUE;
            } else {
                wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            }
        } else {
            wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
        }
        Object obj = wflxmlrfwpVar.f85846pmvmpeiblj;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wflxmlrfwpVar.f85842istkbnxepw;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar3 = (iobyxmoadg) wflxmlrfwpVar.f85840cqumvgiudr;
                deliveryCode = (DeliveryCode) wflxmlrfwpVar.f85843iwizpuwonk;
                iobyxmoadgVar2 = (y00.iobyxmoadg) wflxmlrfwpVar.f85844jyumaefscl;
                product2 = (Product) wflxmlrfwpVar.f85847yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) wflxmlrfwpVar.f85848zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else if (i14 == 2) {
                z13 = wflxmlrfwpVar.f85841esjtqupxsv;
                iobyxmoadgVar5 = (iobyxmoadg) wflxmlrfwpVar.f85840cqumvgiudr;
                deliveryCode = (DeliveryCode) wflxmlrfwpVar.f85843iwizpuwonk;
                iobyxmoadgVar2 = (y00.iobyxmoadg) wflxmlrfwpVar.f85844jyumaefscl;
                product2 = (Product) wflxmlrfwpVar.f85847yggfygwlhe;
                iobyxmoadgVar4 = (iobyxmoadg) wflxmlrfwpVar.f85848zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                oa0.ppxfxbqfkf ppxfxbqfkfVar = iobyxmoadgVar4.f85738gxszxtbevo;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                wflxmlrfwpVar.f85848zdlpuopuiu = iobyxmoadgVar4;
                wflxmlrfwpVar.f85847yggfygwlhe = product2;
                wflxmlrfwpVar.f85844jyumaefscl = iobyxmoadgVar2;
                wflxmlrfwpVar.f85843iwizpuwonk = deliveryCode;
                wflxmlrfwpVar.f85840cqumvgiudr = iobyxmoadgVar5;
                wflxmlrfwpVar.f85841esjtqupxsv = z13;
                wflxmlrfwpVar.f85845lereixgezr = zBooleanValue;
                wflxmlrfwpVar.f85842istkbnxepw = 3;
                objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, wflxmlrfwpVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                product3 = product2;
                iobyxmoadgVar6 = iobyxmoadgVar5;
                z14 = z13;
                deliveryCode2 = deliveryCode;
                z15 = zBooleanValue;
                obj = objZoijcleaow;
                iobyxmoadgVar7 = iobyxmoadgVar4;
                iobyxmoadgVar8 = iobyxmoadgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z16 = wflxmlrfwpVar.f85845lereixgezr;
                boolean z17 = wflxmlrfwpVar.f85841esjtqupxsv;
                iobyxmoadg iobyxmoadgVar9 = (iobyxmoadg) wflxmlrfwpVar.f85840cqumvgiudr;
                DeliveryCode deliveryCode3 = (DeliveryCode) wflxmlrfwpVar.f85843iwizpuwonk;
                y00.iobyxmoadg iobyxmoadgVar10 = (y00.iobyxmoadg) wflxmlrfwpVar.f85844jyumaefscl;
                Product product4 = (Product) wflxmlrfwpVar.f85847yggfygwlhe;
                iobyxmoadgVar7 = (iobyxmoadg) wflxmlrfwpVar.f85848zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar6 = iobyxmoadgVar9;
                iobyxmoadgVar8 = iobyxmoadgVar10;
                product3 = product4;
                z15 = z16;
                z14 = z17;
                deliveryCode2 = deliveryCode3;
            }
            iobyxmoadgVar6.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.dxjokdxxww(deliveryCode2, product3, z14, z15, ((Boolean) obj).booleanValue()));
            iobyxmoadgVar7.wizcaqwiak(product3.getArticle());
            iobyxmoadgVar7.hszhottldk(product3.getId(), iobyxmoadgVar8);
            if (!((State) iobyxmoadgVar7.jlmebxxoox()).getPayload().getIsOrderEdit()) {
                iobyxmoadgVar7.igdgnonuha(product3.getArticle(), iobyxmoadgVar8);
            }
            if (((State) iobyxmoadgVar7.jlmebxxoox()).getMainProduct() == null) {
                iobyxmoadgVar7.m(product3);
            }
            iobyxmoadgVar7.l(product3, iobyxmoadgVar8);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        oa0.wflxmlrfwp wflxmlrfwpVar2 = this.f85745ojitshcjhn;
        wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
        wflxmlrfwpVar.f85848zdlpuopuiu = this;
        product2 = product;
        wflxmlrfwpVar.f85847yggfygwlhe = product2;
        wflxmlrfwpVar.f85844jyumaefscl = iobyxmoadgVar;
        wflxmlrfwpVar.f85843iwizpuwonk = deliveryCodePpxfxbqfkf;
        wflxmlrfwpVar.f85840cqumvgiudr = this;
        wflxmlrfwpVar.f85842istkbnxepw = 1;
        Object objZoijcleaow2 = wflxmlrfwpVar2.zoijcleaow(wwaezpbzknVar2, wflxmlrfwpVar);
        if (objZoijcleaow2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        deliveryCode = deliveryCodePpxfxbqfkf;
        obj = objZoijcleaow2;
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar3 = this;
        iobyxmoadgVar4 = iobyxmoadgVar3;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        oa0.kcexrzcfyt kcexrzcfytVar = iobyxmoadgVar4.f85749rgvfuqvkyq;
        wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
        wflxmlrfwpVar.f85848zdlpuopuiu = iobyxmoadgVar4;
        wflxmlrfwpVar.f85847yggfygwlhe = product2;
        wflxmlrfwpVar.f85844jyumaefscl = iobyxmoadgVar2;
        wflxmlrfwpVar.f85843iwizpuwonk = deliveryCode;
        wflxmlrfwpVar.f85840cqumvgiudr = iobyxmoadgVar3;
        wflxmlrfwpVar.f85841esjtqupxsv = zBooleanValue2;
        wflxmlrfwpVar.f85842istkbnxepw = 2;
        Object objZoijcleaow3 = kcexrzcfytVar.zoijcleaow(wwaezpbzknVar3, wflxmlrfwpVar);
        if (objZoijcleaow3 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadg iobyxmoadgVar11 = iobyxmoadgVar3;
        z13 = zBooleanValue2;
        obj = objZoijcleaow3;
        iobyxmoadgVar5 = iobyxmoadgVar11;
        zBooleanValue = ((Boolean) obj).booleanValue();
        oa0.ppxfxbqfkf ppxfxbqfkfVar2 = iobyxmoadgVar4.f85738gxszxtbevo;
        wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
        wflxmlrfwpVar.f85848zdlpuopuiu = iobyxmoadgVar4;
        wflxmlrfwpVar.f85847yggfygwlhe = product2;
        wflxmlrfwpVar.f85844jyumaefscl = iobyxmoadgVar2;
        wflxmlrfwpVar.f85843iwizpuwonk = deliveryCode;
        wflxmlrfwpVar.f85840cqumvgiudr = iobyxmoadgVar5;
        wflxmlrfwpVar.f85841esjtqupxsv = z13;
        wflxmlrfwpVar.f85845lereixgezr = zBooleanValue;
        wflxmlrfwpVar.f85842istkbnxepw = 3;
        objZoijcleaow = ppxfxbqfkfVar2.zoijcleaow(wwaezpbzknVar4, wflxmlrfwpVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        product3 = product2;
        iobyxmoadgVar6 = iobyxmoadgVar5;
        z14 = z13;
        deliveryCode2 = deliveryCode;
        z15 = zBooleanValue;
        obj = objZoijcleaow;
        iobyxmoadgVar7 = iobyxmoadgVar4;
        iobyxmoadgVar8 = iobyxmoadgVar2;
        iobyxmoadgVar6.ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.dxjokdxxww(deliveryCode2, product3, z14, z15, ((Boolean) obj).booleanValue()));
        iobyxmoadgVar7.wizcaqwiak(product3.getArticle());
        iobyxmoadgVar7.hszhottldk(product3.getId(), iobyxmoadgVar8);
        if (!((State) iobyxmoadgVar7.jlmebxxoox()).getPayload().getIsOrderEdit()) {
            iobyxmoadgVar7.igdgnonuha(product3.getArticle(), iobyxmoadgVar8);
        }
        if (((State) iobyxmoadgVar7.jlmebxxoox()).getMainProduct() == null) {
            iobyxmoadgVar7.m(product3);
        }
        iobyxmoadgVar7.l(product3, iobyxmoadgVar8);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public tg.iobyxmoadg ageimvtcrz() {
        return this.f85742lereixgezr;
    }

    public void c(y00.iobyxmoadg iobyxmoadgVar) {
        this.f85736esjtqupxsv = iobyxmoadgVar;
    }

    public void d(boolean z13) {
        this.f85748ppxfxbqfkf.eablkybsjg(z13);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: dvvnrvtcbc, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ru.myspar.catalog.impl.specific_product.domain.store.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, ru.myspar.catalog.impl.specific_product.domain.store.ppxfxbqfkf.iobyxmoadg.f85871iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        grlcpdaxtj();
    }

    public void e(boolean z13) {
        this.f85748ppxfxbqfkf.gxszxtbevo(z13);
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f85737gtknphoqwx;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new draadjrbmk(null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(new SpecificProductStore$Dialog.AvailableOnlyForPickup(params, str)));
    }

    public sj.lqeggnwhkg ipoelvxyzq() {
        return this.f85748ppxfxbqfkf.ppxfxbqfkf();
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f85736esjtqupxsv;
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f85742lereixgezr = iobyxmoadgVar;
    }

    public final void rhgxfdycjh(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        crxdokpmqz(new rr.ppxfxbqfkf(error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: skhdrjzrfn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc intent) {
        ProductVariants productVariants;
        VideoProduct video;
        VivinoRating vivino;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg;
        Product productFiwbwshyhd;
        String id2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc) {
            iwxlajgraz((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.InterfaceC1970wkgbmnqykc) intent);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ojitshcjhn.f85888iobyxmoadg)) {
            Product mainProduct = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct == null || (id2 = mainProduct.getId()) == null) {
                return;
            }
            crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.gtknphoqwx(id2));
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.btonecajqb) {
            g();
            return;
        }
        Object article = null;
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf) {
            if (!((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.C1952eablkybsjg(null, 1, null));
                return;
            }
            ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf) intent;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg.f85890iobyxmoadg)) {
                productFiwbwshyhd = ((State) jlmebxxoox()).getMainProduct();
            } else {
                if (!(ppxfxbqfkfVar instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                productFiwbwshyhd = fiwbwshyhd(((State) jlmebxxoox()).getRecommendations(), ((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.ppxfxbqfkf.zoijcleaow) intent).zoijcleaow());
            }
            if (productFiwbwshyhd == null) {
                return;
            }
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(productFiwbwshyhd, null), 3, null);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.agtfadlqog.f85872iobyxmoadg)) {
            String orderEditId = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            if (orderEditId != null) {
                crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.gxszxtbevo(orderEditId));
                return;
            }
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp) {
            Product mainProduct2 = ((State) jlmebxxoox()).getMainProduct();
            ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp) intent;
            if (!(wflxmlrfwpVar instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.iobyxmoadg)) {
                if (!(wflxmlrfwpVar instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.zoijcleaow zoijcleaowVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.wflxmlrfwp.zoijcleaow) intent;
                Product productFiwbwshyhd2 = fiwbwshyhd(((State) jlmebxxoox()).getRecommendations(), zoijcleaowVar.ppxfxbqfkf());
                if (productFiwbwshyhd2 == null) {
                    return;
                } else {
                    vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(productFiwbwshyhd2, zoijcleaowVar.zoijcleaow());
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
                    article = obj;
                    break;
                }
            }
            Product productMhtqkkgtqm = mhtqkkgtqm(product, (ProductUIData) article);
            String orderEditId2 = ((State) jlmebxxoox()).getPayload().getOrderEditId();
            pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new lqeggnwhkg(productMhtqkkgtqm, intent, !(orderEditId2 == null || mj.kcexrzcfyt.zfvoamnweg(orderEditId2)), itemFeed, null), 3, null);
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk) {
            ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk draadjrbmkVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.draadjrbmk) intent;
            Product productFiwbwshyhd3 = fiwbwshyhd(((State) jlmebxxoox()).getRecommendations(), draadjrbmkVar.ppxfxbqfkf());
            if (productFiwbwshyhd3 == null) {
                return;
            }
            n(new AnalyticsPage.ItemDetail(productFiwbwshyhd3.getArticle(), productFiwbwshyhd3.getName()), new AnalyticElement.ProductItemElement(productFiwbwshyhd3.getArticle(), productFiwbwshyhd3.getName()), draadjrbmkVar.zoijcleaow());
            ixidwrxhsl(productFiwbwshyhd3);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.zoijcleaow.f85903iobyxmoadg)) {
            Product mainProduct3 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct3 != null) {
                if (!((Boolean) eablkybsjg().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                    crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.C1952eablkybsjg(null, 1, null));
                    return;
                } else {
                    o(this, new AnalyticsPage.AddProductReview(mainProduct3.getName(), mainProduct3.getArticle()), null, null, 6, null);
                    crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.btonecajqb(mainProduct3.getArticle(), mainProduct3.getName()));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.kcexrzcfyt.f85885iobyxmoadg)) {
            Product mainProduct4 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct4 != null) {
                o(this, new AnalyticsPage.ProductReviews(mainProduct4.getName(), mainProduct4.getArticle()), null, null, 6, null);
                crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.nufgyqmvbu(mainProduct4.getArticle(), mainProduct4.getName(), mainProduct4.getRating(), mainProduct4.getColorsModel()));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.jyumaefscl.f85884iobyxmoadg)) {
            Product mainProduct5 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct5 == null || (vivino = mainProduct5.getVivino()) == null) {
                return;
            }
            o(this, AnalyticsPage.Vivino.f84365iwizpuwonk, null, null, 6, null);
            crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.agtfadlqog(vivino));
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu) {
            Product mainProduct6 = ((State) jlmebxxoox()).getMainProduct();
            String name = mainProduct6 != null ? mainProduct6.getName() : null;
            if (name == null) {
                name = "";
            }
            Product mainProduct7 = ((State) jlmebxxoox()).getMainProduct();
            article = mainProduct7 != null ? mainProduct7.getArticle() : null;
            o(this, new AnalyticsPage.ProductDetailsPhoto(name, article != null ? article : ""), null, null, 6, null);
            crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.lqeggnwhkg(((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.zdlpuopuiu) intent).zoijcleaow()));
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.oxmwwwfdhm) {
            Product mainProduct8 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct8 == null || (video = mainProduct8.getVideo()) == null) {
                return;
            }
            o(this, AnalyticsPage.Video.f84364iwizpuwonk, null, null, 6, null);
            crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.wflxmlrfwp(video.getFile()));
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.rgvfuqvkyq) {
            List comboSetList = ((State) jlmebxxoox()).getComboSetList();
            if (comboSetList != null) {
                for (Object obj2 : comboSetList) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ComboSet) obj2).getId(), ((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.rgvfuqvkyq) intent).zoijcleaow())) {
                        article = obj2;
                        break;
                    }
                }
                ComboSet comboSet = (ComboSet) article;
                if (comboSet != null) {
                    o(this, new AnalyticsPage.Combo(comboSet.getName(), comboSet.getId()), null, new AnalyticsLocation.Combo(comboSet.getName(), comboSet.getId()), 2, null);
                    crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.wkgbmnqykc(comboSet));
                    return;
                }
                return;
            }
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg) {
            ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.iobyxmoadg) intent;
            ezmngbhpjk(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf());
            return;
        }
        if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss) {
            Product mainProduct9 = ((State) jlmebxxoox()).getMainProduct();
            if (mainProduct9 != null) {
                ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss vdvldrhtssVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.vdvldrhtss) intent;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(mainProduct9.getArticle(), vdvldrhtssVar.zoijcleaow().getArticle())) {
                    return;
                }
                n(new AnalyticsPage.ItemDetail(mainProduct9.getArticle(), mainProduct9.getName()), new AnalyticElement.ProductItemElement(mainProduct9.getArticle(), mainProduct9.getName()), new AnalyticsLocation.Combo(vdvldrhtssVar.zoijcleaow().getId(), vdvldrhtssVar.zoijcleaow().getName()));
                crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.draadjrbmk(new ProductPayload(new ProductPayload.Type.Article(vdvldrhtssVar.zoijcleaow().getArticle()), ((State) jlmebxxoox()).getPayload().getOrderEditId())));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.eablkybsjg.f85879iobyxmoadg)) {
            SpecificProductStore$Dialog dialog = ((State) jlmebxxoox()).getDialog();
            ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(null));
            if (dialog instanceof SpecificProductStore$Dialog.ProductNotFound) {
                crxdokpmqz(ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f85698iobyxmoadg);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.gxszxtbevo.f85881iobyxmoadg)) {
            SpecificProductStore$Dialog dialog2 = ((State) jlmebxxoox()).getDialog();
            ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.lqeggnwhkg(null));
            if (dialog2 instanceof SpecificProductStore$Dialog.AvailableOnlyForPickup) {
                ylkuphrtab(((SpecificProductStore$Dialog.AvailableOnlyForPickup) dialog2).getParams());
                return;
            }
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dialog2, SpecificProductStore$Dialog.ComboAddedToBasket.f85674zdlpuopuiu)) {
                crxdokpmqz(ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.ppxfxbqfkf.f85707iobyxmoadg);
                return;
            } else if (dialog2 instanceof SpecificProductStore$Dialog.ProductNotFound) {
                crxdokpmqz(ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f85698iobyxmoadg);
                return;
            } else {
                if (dialog2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (!(intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe)) {
            if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu) {
                d(((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.nufgyqmvbu) intent).zoijcleaow());
                return;
            }
            if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.gtknphoqwx) {
                e(((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.gtknphoqwx) intent).zoijcleaow());
                return;
            }
            if (intent instanceof ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww) {
                ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww dxjokdxxwwVar = (ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.dxjokdxxww) intent;
                jrbgnlbqoe(dxjokdxxwwVar.wkgbmnqykc(), dxjokdxxwwVar.zoijcleaow(), dxjokdxxwwVar.ppxfxbqfkf());
                return;
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.lqeggnwhkg.f85886iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                crxdokpmqz(ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.iobyxmoadg.f85698iobyxmoadg);
                return;
            }
        }
        Product mainProduct10 = ((State) jlmebxxoox()).getMainProduct();
        if (mainProduct10 == null || (productVariants = mainProduct10.getProductVariants()) == null) {
            return;
        }
        for (Object obj3 : productVariants.getItems()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductVariant) obj3).getId(), ((ru.myspar.catalog.impl.specific_product.domain.store.wkgbmnqykc.yggfygwlhe) intent).zoijcleaow())) {
                article = obj3;
                break;
            }
        }
        ProductVariant productVariant = (ProductVariant) article;
        if (productVariant != null) {
            ulzqkzuiru(new ru.myspar.catalog.impl.specific_product.domain.store.gxszxtbevo.draadjrbmk(productVariant));
        }
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        crxdokpmqz(rr.wkgbmnqykc.f83679iobyxmoadg);
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(params, null), 3, null);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        crxdokpmqz(new ru.myspar.catalog.impl.specific_product.domain.store.eablkybsjg.C1952eablkybsjg(NonAuthorizedPayload.zoijcleaow.BUY));
    }
}
