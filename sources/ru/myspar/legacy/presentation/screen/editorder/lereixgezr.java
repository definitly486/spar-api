package ru.myspar.legacy.presentation.screen.editorder;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.catalog.api.model.CatalogArgs;
import ru.myspar.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductUIData;
import ru.myspar.core.domain.models.payload.EditOrderPayload;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.delivery.api.model.DeliveryOptionsScreenMode;
import ru.myspar.delivery.api.model.OrderFlowType;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentType;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public final class lereixgezr extends vx.eablkybsjg implements h20.ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ic0.ppxfxbqfkf f89047agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final o20.zoijcleaow f89048btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private List f89049cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final o20.wkgbmnqykc f89050cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final o20.btonecajqb f89051draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final o20.draadjrbmk f89052dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ro.iobyxmoadg f89053esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final o20.ojitshcjhn f89054gtknphoqwx;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final gg.gtknphoqwx f89055iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private tg.iobyxmoadg f89056istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final o20.lqeggnwhkg f89057iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final o20.gtknphoqwx f89058jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final c20.eablkybsjg f89059kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final lo.zoijcleaow f89060lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ sx.ppxfxbqfkf f89061lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final o20.nufgyqmvbu f89062nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final u10.wkgbmnqykc f89063ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final n60.iobyxmoadg f89064oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final qj0.iobyxmoadg f89065pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final EditOrderPayload f89066rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final lq.iobyxmoadg f89067vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final o20.agtfadlqog f89068wflxmlrfwp;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private DeliveryCode f89069yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final hc0.iobyxmoadg f89070yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final l00.gtknphoqwx f89071zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private y00.iobyxmoadg f89072zynmafqrjb;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89074zdlpuopuiu;

        static final class iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ lereixgezr f89075zdlpuopuiu;

            iobyxmoadg(lereixgezr lereixgezrVar) {
                this.f89075zdlpuopuiu = lereixgezrVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(l00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (eablkybsjgVar instanceof l00.eablkybsjg.iobyxmoadg) {
                    this.f89075zdlpuopuiu.zdlpuopuiu(((l00.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof l00.eablkybsjg.ppxfxbqfkf)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f89075zdlpuopuiu.wizcaqwiak(((l00.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89074zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = lereixgezr.this.czzsidtyhn().zoijcleaow();
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(lereixgezr.this);
                this.f89074zdlpuopuiu = 1;
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
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89076jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f89078zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89078zdlpuopuiu = obj;
            this.f89076jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.igdgnonuha(null, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f89079jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89081zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89079jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new draadjrbmk(this.f89079jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89081zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    o20.agtfadlqog.iobyxmoadg iobyxmoadgVar = new o20.agtfadlqog.iobyxmoadg(lereixgezr.this.f89066rgvfuqvkyq.getOrderId(), this.f89079jyumaefscl);
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    o20.agtfadlqog agtfadlqogVar = lereixgezrVar.f89068wflxmlrfwp;
                    this.f89081zdlpuopuiu = 1;
                    obj = agtfadlqogVar.zoijcleaow(iobyxmoadgVar, this);
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
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.wizcaqwiak((Warning) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                lereixgezrVar2.zdlpuopuiu(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89082jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f89084zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89084zdlpuopuiu = obj;
            this.f89082jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.skhdrjzrfn(null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ CartProductUiModel f89085jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89087zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(CartProductUiModel cartProductUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89085jyumaefscl = cartProductUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new eablkybsjg(this.f89085jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object value;
            iwizpuwonk iwizpuwonkVar;
            Object value2;
            iwizpuwonk iwizpuwonkVar2;
            Object objZoijcleaow;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89087zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zynmafqrjb zynmafqrjbVarOjitshcjhn = lereixgezr.this.ojitshcjhn();
                    do {
                        value2 = zynmafqrjbVarOjitshcjhn.getValue();
                        iwizpuwonkVar2 = (iwizpuwonk) value2;
                    } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value2, iwizpuwonkVar2.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar2.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar2.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar2.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar2.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar2.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar2.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar2.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar2.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar2.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar2.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar2.f89007gtknphoqwx : null, (16515071 & 2048) != 0 ? iwizpuwonkVar2.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar2.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar2.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar2.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar2.f89018rgvfuqvkyq : null, (16515071 & 65536) != 0 ? iwizpuwonkVar2.f89019vdvldrhtss : null, (16515071 & 131072) != 0 ? iwizpuwonkVar2.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar2.f89012kcexrzcfyt : true, (16515071 & 524288) != 0 ? iwizpuwonkVar2.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar2.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar2.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar2.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar2.f89003cqumvgiudr : null)));
                    o20.gtknphoqwx.zoijcleaow zoijcleaowVar = new o20.gtknphoqwx.zoijcleaow(lereixgezr.this.f89066rgvfuqvkyq.getOrderId(), this.f89085jyumaefscl.getId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    o20.gtknphoqwx gtknphoqwxVar = lereixgezrVar.f89058jyumaefscl;
                    this.f89087zdlpuopuiu = 1;
                    objZoijcleaow = gtknphoqwxVar.zoijcleaow(zoijcleaowVar, this);
                    if (objZoijcleaow == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    objZoijcleaow = obj;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) objZoijcleaow);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.wizcaqwiak((Warning) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                lereixgezrVar2.zdlpuopuiu(thDxjokdxxww);
            }
            zynmafqrjb zynmafqrjbVarOjitshcjhn2 = lereixgezr.this.ojitshcjhn();
            do {
                value = zynmafqrjbVarOjitshcjhn2.getValue();
                iwizpuwonkVar = (iwizpuwonk) value;
            } while (!zynmafqrjbVarOjitshcjhn2.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f89007gtknphoqwx : null, (16515071 & 2048) != 0 ? iwizpuwonkVar.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar.f89018rgvfuqvkyq : null, (16515071 & 65536) != 0 ? iwizpuwonkVar.f89019vdvldrhtss : null, (16515071 & 131072) != 0 ? iwizpuwonkVar.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar.f89012kcexrzcfyt : false, (16515071 & 524288) != 0 ? iwizpuwonkVar.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar.f89003cqumvgiudr : null)));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f89088jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89090zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f89088jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new gtknphoqwx(this.f89088jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89090zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                l00.btonecajqb btonecajqbVarCzzsidtyhn = lereixgezr.this.czzsidtyhn();
                ChangeProductParams changeProductParams = this.f89088jyumaefscl;
                this.f89090zdlpuopuiu = 1;
                if (btonecajqbVarCzzsidtyhn.ppxfxbqfkf(changeProductParams, this) == objGxszxtbevo) {
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
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f89092iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f89093jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f89094yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f89095zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new gxszxtbevo(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0083  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            lereixgezr lereixgezrVar;
            lereixgezr lereixgezrVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89092iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f89094yggfygwlhe;
                        obj2 = this.f89095zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    lereixgezrVar = lereixgezrVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    lereixgezr.this.sflfametgt();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                lereixgezr.this.ageimvtcrz();
                o20.draadjrbmk.iobyxmoadg iobyxmoadgVar = new o20.draadjrbmk.iobyxmoadg(lereixgezr.this.f89066rgvfuqvkyq.getOrderId());
                lereixgezr lereixgezrVar3 = lereixgezr.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                o20.draadjrbmk draadjrbmkVar = lereixgezrVar3.f89052dxjokdxxww;
                this.f89092iwizpuwonk = 1;
                obj = draadjrbmkVar.zoijcleaow(iobyxmoadgVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            lereixgezrVar = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                this.f89095zdlpuopuiu = obj2;
                this.f89094yggfygwlhe = lereixgezrVar;
                this.f89093jyumaefscl = obj2;
                this.f89092iwizpuwonk = 2;
                if (lereixgezrVar.igdgnonuha((Warning) obj2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                lereixgezrVar2 = lereixgezrVar;
                lereixgezrVar = lereixgezrVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
            }
            lereixgezr.this.sflfametgt();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89097zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new iobyxmoadg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89097zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    o20.wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVar = new o20.wkgbmnqykc.zoijcleaow.iobyxmoadg(lereixgezr.this.f89066rgvfuqvkyq.getOrderId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    o20.wkgbmnqykc wkgbmnqykcVar = lereixgezrVar.f89050cqumvgiudr;
                    this.f89097zdlpuopuiu = 1;
                    obj = wkgbmnqykcVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((o20.wkgbmnqykc.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.wizcaqwiak(((o20.wkgbmnqykc.iobyxmoadg) objWkgbmnqykc).zoijcleaow());
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                lereixgezrVar2.zdlpuopuiu(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89099zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new lqeggnwhkg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89099zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                u10.wkgbmnqykc wkgbmnqykcVar = lereixgezr.this.f89063ojitshcjhn;
                this.f89099zdlpuopuiu = 1;
                if (wkgbmnqykcVar.gtknphoqwx(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89100jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f89102zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f89102zdlpuopuiu = obj;
            this.f89100jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.dvvnrvtcbc(this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89104zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f89105jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f89106yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89107zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((e10.iobyxmoadg) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f89107zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((e10.iobyxmoadg) this.f89106yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f89105jyumaefscl));
            }

            public final Object ojitshcjhn(e10.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f89106yggfygwlhe = iobyxmoadgVar;
                iobyxmoadgVar2.f89105jyumaefscl = z13;
                return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ lereixgezr f89108zdlpuopuiu;

            ppxfxbqfkf(lereixgezr lereixgezrVar) {
                this.f89108zdlpuopuiu = lereixgezrVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
                this.f89108zdlpuopuiu.ydmasvzmpa((e10.iobyxmoadg) vdvldrhtssVar.iobyxmoadg());
                this.f89108zdlpuopuiu.xrmfcynszj();
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f89109zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f89110zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.editorder.lereixgezr$ojitshcjhn$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2040iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f89112yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f89113zdlpuopuiu;

                    public C2040iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f89113zdlpuopuiu = obj;
                        this.f89112yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f89110zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2040iobyxmoadg c2040iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2040iobyxmoadg) {
                        c2040iobyxmoadg = (C2040iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2040iobyxmoadg.f89112yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2040iobyxmoadg.f89112yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2040iobyxmoadg = new C2040iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2040iobyxmoadg = new C2040iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2040iobyxmoadg.f89113zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2040iobyxmoadg.f89112yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f89110zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2040iobyxmoadg.f89112yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2040iobyxmoadg) == objGxszxtbevo) {
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

            public wkgbmnqykc(sj.lqeggnwhkg lqeggnwhkgVar) {
                this.f89109zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f89109zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ lereixgezr f89114jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f89115yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89116zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(lereixgezr lereixgezrVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f89114jyumaefscl = lereixgezrVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f89116zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f89114jyumaefscl.zdlpuopuiu((Throwable) this.f89115yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f89114jyumaefscl, gxszxtbevoVar);
                zoijcleaowVar.f89115yggfygwlhe = th2;
                return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89104zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(new wkgbmnqykc(sj.dxjokdxxww.wflxmlrfwp(lereixgezr.this.f89054gtknphoqwx.zoijcleaow(new o20.ojitshcjhn.iobyxmoadg(lereixgezr.this.f89066rgvfuqvkyq.getOrderId())), lereixgezr.this.uwvvkdfqfp(), new iobyxmoadg(null))), new zoijcleaow(lereixgezr.this, null));
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(lereixgezr.this);
                this.f89104zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(ppxfxbqfkfVar, this) == objGxszxtbevo) {
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

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89118zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89118zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    o20.btonecajqb.iobyxmoadg iobyxmoadgVar = new o20.btonecajqb.iobyxmoadg(lereixgezr.this.f89066rgvfuqvkyq.getOrderId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    o20.btonecajqb btonecajqbVar = lereixgezrVar.f89051draadjrbmk;
                    this.f89118zdlpuopuiu = 1;
                    obj = btonecajqbVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((e10.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.lxfrhoxuzk((e10.iobyxmoadg) objWkgbmnqykc);
            }
            Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                lereixgezrVar2.zdlpuopuiu(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89120zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f89121jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f89122yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89123zdlpuopuiu;

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
                if (this.f89123zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((List) this.f89122yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f89121jyumaefscl));
            }

            public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar.f89122yggfygwlhe = list;
                iobyxmoadgVar.f89121jyumaefscl = z13;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f89124zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f89125zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.editorder.lereixgezr$wflxmlrfwp$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2041iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f89127yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f89128zdlpuopuiu;

                    public C2041iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f89128zdlpuopuiu = obj;
                        this.f89127yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f89125zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2041iobyxmoadg c2041iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2041iobyxmoadg) {
                        c2041iobyxmoadg = (C2041iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2041iobyxmoadg.f89127yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2041iobyxmoadg.f89127yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2041iobyxmoadg = new C2041iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2041iobyxmoadg = new C2041iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2041iobyxmoadg.f89128zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2041iobyxmoadg.f89127yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f89125zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2041iobyxmoadg.f89127yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2041iobyxmoadg) == objGxszxtbevo) {
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
                this.f89124zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f89124zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ lereixgezr f89129zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                int f89130iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f89132yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f89133zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f89132yggfygwlhe = obj;
                    this.f89130iwizpuwonk |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(lereixgezr lereixgezrVar) {
                this.f89129zdlpuopuiu = lereixgezrVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar;
                zoijcleaow zoijcleaowVar;
                Object value;
                iwizpuwonk iwizpuwonkVar;
                if (gxszxtbevoVar instanceof iobyxmoadg) {
                    iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
                    int i13 = iobyxmoadgVar.f89130iwizpuwonk;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f89130iwizpuwonk = i13 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object objInvoke = iobyxmoadgVar.f89132yggfygwlhe;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = iobyxmoadgVar.f89130iwizpuwonk;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    List list = (List) vdvldrhtssVar.iobyxmoadg();
                    this.f89129zdlpuopuiu.f89049cdpycssgdh = list;
                    hc0.iobyxmoadg iobyxmoadgVar2 = this.f89129zdlpuopuiu.f89070yggfygwlhe;
                    List listOxmwwwfdhm = ((iwizpuwonk) this.f89129zdlpuopuiu.gtknphoqwx()).oxmwwwfdhm();
                    iobyxmoadgVar.f89133zdlpuopuiu = this;
                    iobyxmoadgVar.f89130iwizpuwonk = 1;
                    objInvoke = iobyxmoadgVar2.invoke(listOxmwwwfdhm, list, iobyxmoadgVar);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f89133zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                }
                List list2 = (List) objInvoke;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = zoijcleaowVar.f89129zdlpuopuiu.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    iwizpuwonkVar = (iwizpuwonk) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f89007gtknphoqwx : list2, (16515071 & 2048) != 0 ? iwizpuwonkVar.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar.f89018rgvfuqvkyq : null, (16515071 & 65536) != 0 ? iwizpuwonkVar.f89019vdvldrhtss : null, (16515071 & 131072) != 0 ? iwizpuwonkVar.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar.f89012kcexrzcfyt : false, (16515071 & 524288) != 0 ? iwizpuwonkVar.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar.f89003cqumvgiudr : null)));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89120zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(lereixgezr.this.czzsidtyhn().iobyxmoadg(), lereixgezr.this.uwvvkdfqfp(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(lereixgezr.this);
                this.f89120zdlpuopuiu = 1;
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
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f89135iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f89136jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f89137yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f89138zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            lereixgezr lereixgezrVar;
            lereixgezr lereixgezrVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89135iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f89137yggfygwlhe;
                        obj2 = this.f89138zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    lereixgezrVar = lereixgezrVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    lereixgezr.this.sflfametgt();
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                lereixgezr.this.ageimvtcrz();
                lereixgezr lereixgezrVar3 = lereixgezr.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                o20.zoijcleaow zoijcleaowVar = lereixgezrVar3.f89048btonecajqb;
                o20.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new o20.zoijcleaow.iobyxmoadg(lereixgezrVar3.f89066rgvfuqvkyq.getOrderId());
                this.f89135iwizpuwonk = 1;
                obj = zoijcleaowVar.zoijcleaow(iobyxmoadgVar2, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((Warning) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            lereixgezrVar = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                this.f89138zdlpuopuiu = obj2;
                this.f89137yggfygwlhe = lereixgezrVar;
                this.f89136jyumaefscl = obj2;
                this.f89135iwizpuwonk = 2;
                if (lereixgezrVar.skhdrjzrfn((Warning) obj2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                lereixgezrVar2 = lereixgezrVar;
                lereixgezrVar = lereixgezrVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
            }
            lereixgezr.this.sflfametgt();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f89140jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f89141yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f89142zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new zoijcleaow(gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007a  */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object obj2;
            lereixgezr lereixgezrVar;
            lereixgezr lereixgezrVar2;
            Throwable thDxjokdxxww;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89140jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f89141yggfygwlhe;
                        obj2 = this.f89142zdlpuopuiu;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    lereixgezrVar = lereixgezrVar2;
                    thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
                    if (thDxjokdxxww != null) {
                        lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                lereixgezr lereixgezrVar3 = lereixgezr.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                o20.nufgyqmvbu nufgyqmvbuVar = lereixgezrVar3.f89062nufgyqmvbu;
                o20.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 = new o20.nufgyqmvbu.iobyxmoadg(lereixgezrVar3.f89066rgvfuqvkyq.getOrderId());
                this.f89140jyumaefscl = 1;
                if (nufgyqmvbuVar.zoijcleaow(iobyxmoadgVar2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            obj2 = objWkgbmnqykc;
            lereixgezrVar = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(obj2)) {
                this.f89142zdlpuopuiu = obj2;
                this.f89141yggfygwlhe = lereixgezrVar;
                this.f89140jyumaefscl = 2;
                if (lereixgezrVar.dvvnrvtcbc(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                lereixgezrVar2 = lereixgezrVar;
                lereixgezrVar = lereixgezrVar2;
            }
            thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(obj2);
            if (thDxjokdxxww != null) {
                lereixgezrVar.zdlpuopuiu(thDxjokdxxww);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lereixgezr(o20.nufgyqmvbu deleteAndCancelOrderUseCase, o20.draadjrbmk saveEditOrderUseCase, o20.zoijcleaow cancelEditOrderUseCase, o20.ojitshcjhn subscribeEditOrderUseCase, o20.btonecajqb getEditOrderUseCase, o20.agtfadlqog setPromocodeUseCase, ic0.ppxfxbqfkf editOrderUiMapper, u10.wkgbmnqykc changeOrdersObserver, EditOrderPayload payload, lq.iobyxmoadg catalogFeatureApi, n60.iobyxmoadg deliveryFeatureApi, c20.eablkybsjg isLoggedInUseCase, l00.gtknphoqwx productChangesSourceProvider, hc0.iobyxmoadg updateUiModelByCartDataUseCase, o20.gtknphoqwx removeProductFromOrderUseCase, o20.lqeggnwhkg checkOrderCompoundChangedUseCase, o20.wkgbmnqykc changeOrderEditOrderUseCase, ro.iobyxmoadg authFeatureApi, lo.zoijcleaow analyticsTracker, qj0.iobyxmoadg paymentFeatureApi) {
        super(new iwizpuwonk(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 16777215, null));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deleteAndCancelOrderUseCase, "deleteAndCancelOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(saveEditOrderUseCase, "saveEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancelEditOrderUseCase, "cancelEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeEditOrderUseCase, "subscribeEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setPromocodeUseCase, "setPromocodeUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(editOrderUiMapper, "editOrderUiMapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrdersObserver, "changeOrdersObserver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(catalogFeatureApi, "catalogFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deliveryFeatureApi, "deliveryFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateUiModelByCartDataUseCase, "updateUiModelByCartDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(removeProductFromOrderUseCase, "removeProductFromOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkOrderCompoundChangedUseCase, "checkOrderCompoundChangedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrderEditOrderUseCase, "changeOrderEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        this.f89061lqeggnwhkg = new sx.ppxfxbqfkf();
        this.f89062nufgyqmvbu = deleteAndCancelOrderUseCase;
        this.f89052dxjokdxxww = saveEditOrderUseCase;
        this.f89048btonecajqb = cancelEditOrderUseCase;
        this.f89054gtknphoqwx = subscribeEditOrderUseCase;
        this.f89051draadjrbmk = getEditOrderUseCase;
        this.f89068wflxmlrfwp = setPromocodeUseCase;
        this.f89047agtfadlqog = editOrderUiMapper;
        this.f89063ojitshcjhn = changeOrdersObserver;
        this.f89066rgvfuqvkyq = payload;
        this.f89067vdvldrhtss = catalogFeatureApi;
        this.f89064oxmwwwfdhm = deliveryFeatureApi;
        this.f89059kcexrzcfyt = isLoggedInUseCase;
        this.f89071zdlpuopuiu = productChangesSourceProvider;
        this.f89070yggfygwlhe = updateUiModelByCartDataUseCase;
        this.f89058jyumaefscl = removeProductFromOrderUseCase;
        this.f89057iwizpuwonk = checkOrderCompoundChangedUseCase;
        this.f89050cqumvgiudr = changeOrderEditOrderUseCase;
        this.f89053esjtqupxsv = authFeatureApi;
        this.f89060lereixgezr = analyticsTracker;
        this.f89065pmvmpeiblj = paymentFeatureApi;
        this.f89049cdpycssgdh = hg.jyumaefscl.wflxmlrfwp();
        this.f89055iozdgvuglv = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.editorder.esjtqupxsv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lereixgezr.hszhottldk(this.f88998zdlpuopuiu);
            }
        });
        if (payload.getIsStartEditOrder()) {
            yggfygwlhe(cqumvgiudr.eablkybsjg.f88988iobyxmoadg);
        }
        mhtqkkgtqm();
        ipoelvxyzq();
        grlcpdaxtj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz() {
        Object value;
        iwizpuwonk iwizpuwonkVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f89007gtknphoqwx : null, (16515071 & 2048) != 0 ? iwizpuwonkVar.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar.f89018rgvfuqvkyq : null, (16515071 & 65536) != 0 ? iwizpuwonkVar.f89019vdvldrhtss : null, (16515071 & 131072) != 0 ? iwizpuwonkVar.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar.f89012kcexrzcfyt : true, (16515071 & 524288) != 0 ? iwizpuwonkVar.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar.f89003cqumvgiudr : null)));
    }

    private final void auzgnhcxok() {
        if (((iwizpuwonk) gtknphoqwx()).oxmwwwfdhm().isEmpty()) {
            yggfygwlhe(cqumvgiudr.ppxfxbqfkf.f88993iobyxmoadg);
        } else {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(null), 3, null);
        }
    }

    private final void bfopjjpdmp() {
        yggfygwlhe(cqumvgiudr.wkgbmnqykc.f88994iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l00.btonecajqb czzsidtyhn() {
        return (l00.btonecajqb) this.f89055iozdgvuglv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dvvnrvtcbc(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f89100jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f89100jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object obj = nufgyqmvbuVar.f89102zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f89100jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f88990iobyxmoadg);
            u10.wkgbmnqykc wkgbmnqykcVar = this.f89063ojitshcjhn;
            nufgyqmvbuVar.f89100jyumaefscl = 1;
            if (wkgbmnqykcVar.gtknphoqwx(nufgyqmvbuVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void fiwbwshyhd(String str) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(str, null), 3, null);
    }

    private final void fyldjkxazc(int i13) {
        yggfygwlhe(new cqumvgiudr.nufgyqmvbu(i13));
    }

    private final void grlcpdaxtj() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new agtfadlqog(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l00.btonecajqb hszhottldk(lereixgezr lereixgezrVar) {
        return lereixgezrVar.f89071zdlpuopuiu.iobyxmoadg(new l00.btonecajqb.iobyxmoadg.wkgbmnqykc(lereixgezrVar.f89066rgvfuqvkyq.getOrderId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object igdgnonuha(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f89076jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f89076jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f89078zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f89076jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wizcaqwiak(warning);
            yggfygwlhe(cqumvgiudr.lqeggnwhkg.f88991iobyxmoadg);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f88990iobyxmoadg);
            u10.wkgbmnqykc wkgbmnqykcVar = this.f89063ojitshcjhn;
            btonecajqbVar.f89076jyumaefscl = 1;
            if (wkgbmnqykcVar.gtknphoqwx(btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ipoelvxyzq() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(null), 3, null);
    }

    private final void iwxlajgraz() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void ixidwrxhsl(AnalyticsPage analyticsPage) {
        this.f89060lereixgezr.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.OrderEdit(((iwizpuwonk) gtknphoqwx()).gtknphoqwx()), analyticsPage, null, null, null, 28, null)));
    }

    private final void iyctptxqzt() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89064oxmwwwfdhm.zoijcleaow(new DeliveryOptionsArgs(new DeliveryOptionsScreenMode.ORDER(this.f89066rgvfuqvkyq.getOrderId()))));
    }

    private final void lrnfpwlwnk() {
        ixidwrxhsl(AnalyticsPage.PaymentMethods.f84320iwizpuwonk);
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) ojitshcjhn().getValue();
        String orderId = this.f89066rgvfuqvkyq.getOrderId();
        PaymentCode paymentCodeAgtfadlqog = iwizpuwonkVar.agtfadlqog();
        if (paymentCodeAgtfadlqog == PaymentCode.UNDEFINED) {
            paymentCodeAgtfadlqog = null;
        }
        String serverValue = paymentCodeAgtfadlqog != null ? paymentCodeAgtfadlqog.getServerValue() : null;
        if (serverValue == null) {
            serverValue = "";
        }
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89065pmvmpeiblj.ppxfxbqfkf(new PaymentMethodsArgs(new PaymentType.Edit(orderId, serverValue, this.f89069yadqdtsiqt), iwizpuwonkVar.jyumaefscl(), iwizpuwonkVar.rgvfuqvkyq(), false, iwizpuwonkVar.wflxmlrfwp())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(e10.iobyxmoadg iobyxmoadgVar) {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89064oxmwwwfdhm.iobyxmoadg(new DeliveryIntervalPayload(new OrderFlowType.EditOrder(this.f89066rgvfuqvkyq.getOrderId()))));
    }

    private final void metgxyhuhe() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(null), 3, null);
    }

    private final void mhtqkkgtqm() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ojitshcjhn(null), 3, null);
    }

    private final void nuxfzjnpeb(CartProductUiModel cartProductUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(cartProductUiModel, null), 3, null);
    }

    private final void oipsdeybqn() {
        ixidwrxhsl(AnalyticsPage.Catalog.f84276iwizpuwonk);
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89067vdvldrhtss.eablkybsjg(new CatalogArgs(v00.iobyxmoadg.ORDER_EDIT, this.f89066rgvfuqvkyq.getOrderId())));
    }

    private final void opjhrmiecq() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(null), 3, null);
    }

    private final void rlfsiqarku() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void roivzttewh() {
        ixidwrxhsl(new AnalyticsPage.OrderEditReceiver(this.f89066rgvfuqvkyq.getOrderId()));
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.legacy.presentation.screen.editreceiver.zoijcleaow.zoijcleaow(this.f89066rgvfuqvkyq.getOrderId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt() {
        Object value;
        iwizpuwonk iwizpuwonkVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f89007gtknphoqwx : null, (16515071 & 2048) != 0 ? iwizpuwonkVar.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar.f89018rgvfuqvkyq : null, (16515071 & 65536) != 0 ? iwizpuwonkVar.f89019vdvldrhtss : null, (16515071 & 131072) != 0 ? iwizpuwonkVar.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar.f89012kcexrzcfyt : false, (16515071 & 524288) != 0 ? iwizpuwonkVar.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar.f89003cqumvgiudr : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object skhdrjzrfn(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f89082jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f89082jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object obj = dxjokdxxwwVar.f89084zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f89082jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wizcaqwiak(warning);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f88990iobyxmoadg);
            u10.wkgbmnqykc wkgbmnqykcVar = this.f89063ojitshcjhn;
            dxjokdxxwwVar.f89082jyumaefscl = 1;
            if (wkgbmnqykcVar.gtknphoqwx(dxjokdxxwwVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void tbqsvytpvh(String str) {
        Object value;
        iwizpuwonk iwizpuwonkVar;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, ((iwizpuwonk) gtknphoqwx()).kcexrzcfyt())) {
            return;
        }
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16515071 & 1) != 0 ? iwizpuwonkVar.f89009iobyxmoadg : null, (16515071 & 2) != 0 ? iwizpuwonkVar.f89024zoijcleaow : null, (16515071 & 4) != 0 ? iwizpuwonkVar.f89017ppxfxbqfkf : null, (16515071 & 8) != 0 ? iwizpuwonkVar.f89021wkgbmnqykc : null, (16515071 & 16) != 0 ? iwizpuwonkVar.f89006eablkybsjg : null, (16515071 & 32) != 0 ? iwizpuwonkVar.f89008gxszxtbevo : null, (16515071 & 64) != 0 ? iwizpuwonkVar.f89013lqeggnwhkg : null, (16515071 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f89014nufgyqmvbu : null, (16515071 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f89005dxjokdxxww : null, (16515071 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f89002btonecajqb : null, (16515071 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f89007gtknphoqwx : null, (16515071 & 2048) != 0 ? iwizpuwonkVar.f89004draadjrbmk : null, (16515071 & 4096) != 0 ? iwizpuwonkVar.f89020wflxmlrfwp : null, (16515071 & 8192) != 0 ? iwizpuwonkVar.f89001agtfadlqog : null, (16515071 & 16384) != 0 ? iwizpuwonkVar.f89015ojitshcjhn : null, (16515071 & 32768) != 0 ? iwizpuwonkVar.f89018rgvfuqvkyq : str, (16515071 & 65536) != 0 ? iwizpuwonkVar.f89019vdvldrhtss : iwizpuwonk.iobyxmoadg.NOT_ENTERED, (16515071 & 131072) != 0 ? iwizpuwonkVar.f89016oxmwwwfdhm : null, (16515071 & 262144) != 0 ? iwizpuwonkVar.f89012kcexrzcfyt : false, (16515071 & 524288) != 0 ? iwizpuwonkVar.f89023zdlpuopuiu : null, (16515071 & 1048576) != 0 ? iwizpuwonkVar.f89022yggfygwlhe : null, (16515071 & 2097152) != 0 ? iwizpuwonkVar.f89011jyumaefscl : null, (16515071 & 4194304) != 0 ? iwizpuwonkVar.f89010iwizpuwonk : null, (16515071 & 8388608) != 0 ? iwizpuwonkVar.f89003cqumvgiudr : null)));
    }

    private final void uawqvzlxes() {
        yggfygwlhe(cqumvgiudr.wkgbmnqykc.f88994iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak(Warning warning) {
        if (new ah.wkgbmnqykc[]{kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(Warning.Empty.class)}[0].zdlpuopuiu(warning)) {
            return;
        }
        yggfygwlhe(new cqumvgiudr.dxjokdxxww(warning.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj() {
        if (((Boolean) this.f89057iwizpuwonk.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(e10.iobyxmoadg iobyxmoadgVar) {
        Object value;
        iwizpuwonk iwizpuwonkVarLqeggnwhkg = this.f89047agtfadlqog.lqeggnwhkg(iobyxmoadgVar, this.f89049cdpycssgdh, true);
        LocalDateTime localDateTimeGxszxtbevo = iwizpuwonkVarLqeggnwhkg.gxszxtbevo();
        if (localDateTimeGxszxtbevo != null) {
            yggfygwlhe(new cqumvgiudr.btonecajqb(localDateTimeGxszxtbevo));
        }
        Double dEablkybsjg = ((iwizpuwonk) gtknphoqwx()).eablkybsjg();
        if (dEablkybsjg != null) {
            if (iobyxmoadgVar.rgvfuqvkyq().ppxfxbqfkf() <= dEablkybsjg.doubleValue()) {
                dEablkybsjg = null;
            }
            if (dEablkybsjg != null) {
                fyldjkxazc(pm.dxjokdxxww.order_edit_delivery_price_changed);
            }
        }
        this.f89069yadqdtsiqt = iobyxmoadgVar.eablkybsjg();
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVarLqeggnwhkg));
    }

    private final void zeieaojujs(CartProductUiModel cartProductUiModel, ProductCardEvent productCardEvent) {
        Object next;
        List limits;
        List listIobyxmoadg;
        m00.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        Iterator it = this.f89049cdpycssgdh.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), cartProductUiModel.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        hkdspvbjdz(new ChangeProductParams(cartProductUiModel.getId(), cartProductUiModel.getArticle(), zoijcleaowVarIobyxmoadg, cartProductUiModel.getIsAvailable(), false, false, cartProductUiModel.getMeasureTypeModel(), cartProductUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = k30.zoijcleaow.iobyxmoadg(limits)) == null) ? cartProductUiModel.getLimits() : listIobyxmoadg, null), true);
    }

    private final void zfvoamnweg() {
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
    }

    @Override // h20.ppxfxbqfkf
    public c20.eablkybsjg eablkybsjg() {
        return this.f89059kcexrzcfyt;
    }

    @Override // h20.ppxfxbqfkf
    public void gxszxtbevo() {
    }

    @Override // h20.ppxfxbqfkf
    public void iozdgvuglv(ChangeProductParams params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
    }

    @Override // h20.ppxfxbqfkf
    public y00.iobyxmoadg kcexrzcfyt() {
        return this.f89072zynmafqrjb;
    }

    @Override // h20.ppxfxbqfkf
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f89056istkbnxepw = iobyxmoadgVar;
    }

    @Override // h20.ppxfxbqfkf
    public void tzroggbefp(ChangeProductParams changeProductParams) {
        yggfygwlhe(cqumvgiudr.gxszxtbevo.f88989iobyxmoadg);
    }

    public sj.lqeggnwhkg uwvvkdfqfp() {
        return this.f89061lqeggnwhkg.ppxfxbqfkf();
    }

    @Override // vx.eablkybsjg
    protected Object vdvldrhtss(sx.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        yfnezrywwk(iobyxmoadgVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void weqkydbzbr(jyumaefscl event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof jyumaefscl.wkgbmnqykc) {
            bfopjjpdmp();
            return;
        }
        if (event instanceof jyumaefscl.rgvfuqvkyq) {
            iwxlajgraz();
            return;
        }
        if (event instanceof jyumaefscl.eablkybsjg) {
            opjhrmiecq();
            return;
        }
        if (event instanceof jyumaefscl.agtfadlqog) {
            uawqvzlxes();
            return;
        }
        if (event instanceof jyumaefscl.ojitshcjhn) {
            auzgnhcxok();
            return;
        }
        if (event instanceof jyumaefscl.wflxmlrfwp) {
            roivzttewh();
            return;
        }
        if (event instanceof jyumaefscl.nufgyqmvbu) {
            rlfsiqarku();
            return;
        }
        if (event instanceof jyumaefscl.dxjokdxxww) {
            lrnfpwlwnk();
            return;
        }
        if (event instanceof jyumaefscl.ppxfxbqfkf) {
            fiwbwshyhd(((iwizpuwonk) gtknphoqwx()).kcexrzcfyt());
            return;
        }
        if (event instanceof jyumaefscl.draadjrbmk) {
            tbqsvytpvh(((jyumaefscl.draadjrbmk) event).iobyxmoadg());
            return;
        }
        if (event instanceof jyumaefscl.iobyxmoadg) {
            zfvoamnweg();
            return;
        }
        if (event instanceof jyumaefscl.gxszxtbevo) {
            metgxyhuhe();
            return;
        }
        if (event instanceof jyumaefscl.zoijcleaow) {
            oipsdeybqn();
            return;
        }
        if (event instanceof jyumaefscl.lqeggnwhkg) {
            iyctptxqzt();
            return;
        }
        if (event instanceof jyumaefscl.btonecajqb) {
            jyumaefscl.btonecajqb btonecajqbVar = (jyumaefscl.btonecajqb) event;
            zeieaojujs(btonecajqbVar.iobyxmoadg(), btonecajqbVar.zoijcleaow());
        } else {
            if (!(event instanceof jyumaefscl.gtknphoqwx)) {
                throw new NoWhenBranchMatchedException();
            }
            nuxfzjnpeb(((jyumaefscl.gtknphoqwx) event).iobyxmoadg());
        }
    }

    @Override // h20.ppxfxbqfkf
    public void wwaezpbzkn(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(params, null), 3, null);
    }

    public void yfnezrywwk(sx.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f89061lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // h20.ppxfxbqfkf
    public void zoijcleaow() {
        d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89053esjtqupxsv.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.BUY, null, 2, null)));
    }
}
