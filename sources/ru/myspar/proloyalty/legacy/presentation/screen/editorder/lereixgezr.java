package ru.myspar.proloyalty.legacy.presentation.screen.editorder;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.api.model.CatalogArgs;
import ru.myspar.proloyalty.common.view.product.model.cart.CartProductUiModel;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductUIData;
import ru.myspar.proloyalty.core.domain.models.payload.EditOrderPayload;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.delivery.api.model.DeliveryIntervalPayload;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsArgs;
import ru.myspar.proloyalty.delivery.api.model.DeliveryOptionsScreenMode;
import ru.myspar.proloyalty.delivery.api.model.OrderFlowType;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public final class lereixgezr extends sw0.eablkybsjg implements r01.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ha1.ppxfxbqfkf f96831agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final w01.zoijcleaow f96832btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private List f96833cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final w01.wkgbmnqykc f96834cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final w01.gtknphoqwx f96835draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final w01.wflxmlrfwp f96836dxjokdxxww;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final an0.iobyxmoadg f96837esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final w01.rgvfuqvkyq f96838gtknphoqwx;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final gg.gtknphoqwx f96839iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private tg.iobyxmoadg f96840istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final w01.lqeggnwhkg f96841iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final w01.draadjrbmk f96842jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final ow1.esjtqupxsv f96843kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final vm0.zoijcleaow f96844lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final /* synthetic */ pw0.ppxfxbqfkf f96845lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final w01.nufgyqmvbu f96846nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final i01.wkgbmnqykc f96847ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final c51.iobyxmoadg f96848oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final rg1.iobyxmoadg f96849pmvmpeiblj;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final EditOrderPayload f96850rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final xo0.iobyxmoadg f96851vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final w01.ojitshcjhn f96852wflxmlrfwp;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private DeliveryCode f96853yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ga1.iobyxmoadg f96854yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final dz0.gtknphoqwx f96855zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final w01.btonecajqb f96856zynmafqrjb;

    public static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ lereixgezr f96857iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f96858jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f96859yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96860zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(lg.gxszxtbevo gxszxtbevoVar, lereixgezr lereixgezrVar) {
            super(3, gxszxtbevoVar);
            this.f96857iwizpuwonk = lereixgezrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96860zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f96859yggfygwlhe;
                sj.lqeggnwhkg lqeggnwhkgVarZoijcleaow = ((Boolean) this.f96858jyumaefscl).booleanValue() ? this.f96857iwizpuwonk.czzsidtyhn().zoijcleaow() : sj.dxjokdxxww.cqumvgiudr();
                this.f96860zdlpuopuiu = 1;
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
            agtfadlqog agtfadlqogVar = new agtfadlqog(gxszxtbevoVar, this.f96857iwizpuwonk);
            agtfadlqogVar.f96859yggfygwlhe = nufgyqmvbuVar;
            agtfadlqogVar.f96858jyumaefscl = obj;
            return agtfadlqogVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f96861jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f96863zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f96863zdlpuopuiu = obj;
            this.f96861jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.igdgnonuha(null, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f96864jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96866zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        draadjrbmk(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96864jyumaefscl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new draadjrbmk(this.f96864jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96866zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    w01.ojitshcjhn.iobyxmoadg iobyxmoadgVar = new w01.ojitshcjhn.iobyxmoadg(lereixgezr.this.f96850rgvfuqvkyq.getOrderId(), this.f96864jyumaefscl);
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w01.ojitshcjhn ojitshcjhnVar = lereixgezrVar.f96852wflxmlrfwp;
                    this.f96866zdlpuopuiu = 1;
                    obj = ojitshcjhnVar.zoijcleaow(iobyxmoadgVar, this);
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
        int f96867jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f96869zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f96869zdlpuopuiu = obj;
            this.f96867jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.skhdrjzrfn(null, this);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ CartProductUiModel f96870jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96872zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(CartProductUiModel cartProductUiModel, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96870jyumaefscl = cartProductUiModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new eablkybsjg(this.f96870jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96872zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lereixgezr.this.ageimvtcrz();
                    w01.draadjrbmk.zoijcleaow zoijcleaowVar = new w01.draadjrbmk.zoijcleaow(lereixgezr.this.f96850rgvfuqvkyq.getOrderId(), this.f96870jyumaefscl.getId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w01.draadjrbmk draadjrbmkVar = lereixgezrVar.f96842jyumaefscl;
                    this.f96872zdlpuopuiu = 1;
                    obj = draadjrbmkVar.zoijcleaow(zoijcleaowVar, this);
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
            lereixgezr.this.sflfametgt();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ChangeProductParams f96873jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96875zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(ChangeProductParams changeProductParams, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f96873jyumaefscl = changeProductParams;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new gtknphoqwx(this.f96873jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96875zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                dz0.btonecajqb btonecajqbVarCzzsidtyhn = lereixgezr.this.czzsidtyhn();
                ChangeProductParams changeProductParams = this.f96873jyumaefscl;
                this.f96875zdlpuopuiu = 1;
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
        int f96877iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f96878jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96879yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96880zdlpuopuiu;

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
            int i13 = this.f96877iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f96879yggfygwlhe;
                        obj2 = this.f96880zdlpuopuiu;
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
                w01.wflxmlrfwp.iobyxmoadg iobyxmoadgVar = new w01.wflxmlrfwp.iobyxmoadg(lereixgezr.this.f96850rgvfuqvkyq.getOrderId());
                lereixgezr lereixgezrVar3 = lereixgezr.this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                w01.wflxmlrfwp wflxmlrfwpVar = lereixgezrVar3.f96836dxjokdxxww;
                this.f96877iwizpuwonk = 1;
                obj = wflxmlrfwpVar.zoijcleaow(iobyxmoadgVar, this);
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
                this.f96880zdlpuopuiu = obj2;
                this.f96879yggfygwlhe = lereixgezrVar;
                this.f96878jyumaefscl = obj2;
                this.f96877iwizpuwonk = 2;
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
        int f96882zdlpuopuiu;

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
            int i13 = this.f96882zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    w01.wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVar = new w01.wkgbmnqykc.zoijcleaow.iobyxmoadg(lereixgezr.this.f96850rgvfuqvkyq.getOrderId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w01.wkgbmnqykc wkgbmnqykcVar = lereixgezrVar.f96834cqumvgiudr;
                    this.f96882zdlpuopuiu = 1;
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
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((w01.wkgbmnqykc.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.wizcaqwiak(((w01.wkgbmnqykc.iobyxmoadg) objWkgbmnqykc).zoijcleaow());
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
        int f96884zdlpuopuiu;

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
            int i13 = this.f96884zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                i01.wkgbmnqykc wkgbmnqykcVar = lereixgezr.this.f96847ojitshcjhn;
                this.f96884zdlpuopuiu = 1;
                if (wkgbmnqykcVar.btonecajqb(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((lqeggnwhkg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f96885jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f96887zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f96887zdlpuopuiu = obj;
            this.f96885jyumaefscl |= Integer.MIN_VALUE;
            return lereixgezr.this.dvvnrvtcbc(this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f96889yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96890zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = lereixgezr.this.new ojitshcjhn(gxszxtbevoVar);
            ojitshcjhnVar.f96889yggfygwlhe = obj;
            return ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f96890zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            dz0.eablkybsjg eablkybsjgVar = (dz0.eablkybsjg) this.f96889yggfygwlhe;
            if (eablkybsjgVar instanceof dz0.eablkybsjg.iobyxmoadg) {
                lereixgezr.this.zdlpuopuiu(((dz0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg());
            } else {
                if (!(eablkybsjgVar instanceof dz0.eablkybsjg.ppxfxbqfkf)) {
                    throw new NoWhenBranchMatchedException();
                }
                lereixgezr.this.wizcaqwiak(((dz0.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(eablkybsjgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96892zdlpuopuiu;

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
            int i13 = this.f96892zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    w01.gtknphoqwx.iobyxmoadg iobyxmoadgVar = new w01.gtknphoqwx.iobyxmoadg(lereixgezr.this.f96850rgvfuqvkyq.getOrderId());
                    lereixgezr lereixgezrVar = lereixgezr.this;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    w01.gtknphoqwx gtknphoqwxVar = lereixgezrVar.f96835draadjrbmk;
                    this.f96892zdlpuopuiu = 1;
                    obj = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((uz0.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            lereixgezr lereixgezrVar2 = lereixgezr.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                lereixgezrVar2.lxfrhoxuzk((uz0.iobyxmoadg) objWkgbmnqykc);
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

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96894zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f96895jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f96896yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f96897zdlpuopuiu;

            iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return ojitshcjhn((uz0.iobyxmoadg) obj, ((Boolean) obj2).booleanValue(), (lg.gxszxtbevo) obj3);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f96897zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((uz0.iobyxmoadg) this.f96896yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f96895jyumaefscl));
            }

            public final Object ojitshcjhn(uz0.iobyxmoadg iobyxmoadgVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar2.f96896yggfygwlhe = iobyxmoadgVar;
                iobyxmoadgVar2.f96895jyumaefscl = z13;
                return iobyxmoadgVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class ppxfxbqfkf implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ lereixgezr f96898zdlpuopuiu;

            ppxfxbqfkf(lereixgezr lereixgezrVar) {
                this.f96898zdlpuopuiu = lereixgezrVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(gg.vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
                this.f96898zdlpuopuiu.ydmasvzmpa((uz0.iobyxmoadg) vdvldrhtssVar.iobyxmoadg());
                this.f96898zdlpuopuiu.xrmfcynszj();
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        public static final class wkgbmnqykc implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f96899zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f96900zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.editorder.lereixgezr$rgvfuqvkyq$wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2285iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f96902yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f96903zdlpuopuiu;

                    public C2285iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f96903zdlpuopuiu = obj;
                        this.f96902yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f96900zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2285iobyxmoadg c2285iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2285iobyxmoadg) {
                        c2285iobyxmoadg = (C2285iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2285iobyxmoadg.f96902yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2285iobyxmoadg.f96902yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2285iobyxmoadg = new C2285iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2285iobyxmoadg = new C2285iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2285iobyxmoadg.f96903zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2285iobyxmoadg.f96902yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f96900zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2285iobyxmoadg.f96902yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2285iobyxmoadg) == objGxszxtbevo) {
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
                this.f96899zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f96899zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ lereixgezr f96904jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f96905yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f96906zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(lereixgezr lereixgezrVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f96904jyumaefscl = lereixgezrVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f96906zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f96904jyumaefscl.zdlpuopuiu((Throwable) this.f96905yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(this.f96904jyumaefscl, gxszxtbevoVar);
                zoijcleaowVar.f96905yggfygwlhe = th2;
                return zoijcleaowVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return lereixgezr.this.new rgvfuqvkyq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f96894zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(new wkgbmnqykc(sj.dxjokdxxww.wflxmlrfwp(lereixgezr.this.f96838gtknphoqwx.zoijcleaow(new w01.rgvfuqvkyq.iobyxmoadg(lereixgezr.this.f96850rgvfuqvkyq.getOrderId())), lereixgezr.this.uwvvkdfqfp(), new iobyxmoadg(null))), new zoijcleaow(lereixgezr.this, null));
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(lereixgezr.this);
                this.f96894zdlpuopuiu = 1;
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
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f96908zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            /* synthetic */ boolean f96909jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f96910yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f96911zdlpuopuiu;

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
                if (this.f96911zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                return gg.cqumvgiudr.iobyxmoadg((List) this.f96910yggfygwlhe, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(this.f96909jyumaefscl));
            }

            public final Object ojitshcjhn(List list, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                iobyxmoadgVar.f96910yggfygwlhe = list;
                iobyxmoadgVar.f96909jyumaefscl = z13;
                return iobyxmoadgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        public static final class ppxfxbqfkf implements sj.lqeggnwhkg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f96912zdlpuopuiu;

            public static final class iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ sj.nufgyqmvbu f96913zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.editorder.lereixgezr$wflxmlrfwp$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                public static final class C2286iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    int f96915yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    /* synthetic */ Object f96916zdlpuopuiu;

                    public C2286iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.f96916zdlpuopuiu = obj;
                        this.f96915yggfygwlhe |= Integer.MIN_VALUE;
                        return iobyxmoadg.this.emit(null, this);
                    }
                }

                public iobyxmoadg(sj.nufgyqmvbu nufgyqmvbuVar) {
                    this.f96913zdlpuopuiu = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    C2286iobyxmoadg c2286iobyxmoadg;
                    if (gxszxtbevoVar instanceof C2286iobyxmoadg) {
                        c2286iobyxmoadg = (C2286iobyxmoadg) gxszxtbevoVar;
                        int i13 = c2286iobyxmoadg.f96915yggfygwlhe;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c2286iobyxmoadg.f96915yggfygwlhe = i13 - Integer.MIN_VALUE;
                        } else {
                            c2286iobyxmoadg = new C2286iobyxmoadg(gxszxtbevoVar);
                        }
                    } else {
                        c2286iobyxmoadg = new C2286iobyxmoadg(gxszxtbevoVar);
                    }
                    Object obj2 = c2286iobyxmoadg.f96916zdlpuopuiu;
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = c2286iobyxmoadg.f96915yggfygwlhe;
                    if (i14 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        sj.nufgyqmvbu nufgyqmvbuVar = this.f96913zdlpuopuiu;
                        if (((Boolean) ((gg.vdvldrhtss) obj).wkgbmnqykc()).booleanValue()) {
                            c2286iobyxmoadg.f96915yggfygwlhe = 1;
                            if (nufgyqmvbuVar.emit(obj, c2286iobyxmoadg) == objGxszxtbevo) {
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
                this.f96912zdlpuopuiu = lqeggnwhkgVar;
            }

            @Override // sj.lqeggnwhkg
            public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = this.f96912zdlpuopuiu.collect(new iobyxmoadg(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ lereixgezr f96917zdlpuopuiu;

            static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                int f96918iwizpuwonk;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                /* synthetic */ Object f96920yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                Object f96921zdlpuopuiu;

                iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
                    super(gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    this.f96920yggfygwlhe = obj;
                    this.f96918iwizpuwonk |= Integer.MIN_VALUE;
                    return zoijcleaow.this.emit(null, this);
                }
            }

            zoijcleaow(lereixgezr lereixgezrVar) {
                this.f96917zdlpuopuiu = lereixgezrVar;
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
                    int i13 = iobyxmoadgVar.f96918iwizpuwonk;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iobyxmoadgVar.f96918iwizpuwonk = i13 - Integer.MIN_VALUE;
                    } else {
                        iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                    }
                } else {
                    iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
                }
                Object objInvoke = iobyxmoadgVar.f96920yggfygwlhe;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i14 = iobyxmoadgVar.f96918iwizpuwonk;
                if (i14 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                    List list = (List) vdvldrhtssVar.iobyxmoadg();
                    this.f96917zdlpuopuiu.f96833cdpycssgdh = list;
                    ga1.iobyxmoadg iobyxmoadgVar2 = this.f96917zdlpuopuiu.f96854yggfygwlhe;
                    List listOxmwwwfdhm = ((iwizpuwonk) this.f96917zdlpuopuiu.gtknphoqwx()).oxmwwwfdhm();
                    iobyxmoadgVar.f96921zdlpuopuiu = this;
                    iobyxmoadgVar.f96918iwizpuwonk = 1;
                    objInvoke = iobyxmoadgVar2.invoke(listOxmwwwfdhm, list, iobyxmoadgVar);
                    if (objInvoke == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar = this;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f96921zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objInvoke);
                }
                List list2 = (List) objInvoke;
                zynmafqrjb zynmafqrjbVarOjitshcjhn = zoijcleaowVar.f96917zdlpuopuiu.ojitshcjhn();
                do {
                    value = zynmafqrjbVarOjitshcjhn.getValue();
                    iwizpuwonkVar = (iwizpuwonk) value;
                } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16776191 & 1) != 0 ? iwizpuwonkVar.f96793iobyxmoadg : null, (16776191 & 2) != 0 ? iwizpuwonkVar.f96808zoijcleaow : null, (16776191 & 4) != 0 ? iwizpuwonkVar.f96801ppxfxbqfkf : null, (16776191 & 8) != 0 ? iwizpuwonkVar.f96805wkgbmnqykc : null, (16776191 & 16) != 0 ? iwizpuwonkVar.f96790eablkybsjg : null, (16776191 & 32) != 0 ? iwizpuwonkVar.f96792gxszxtbevo : null, (16776191 & 64) != 0 ? iwizpuwonkVar.f96797lqeggnwhkg : null, (16776191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f96798nufgyqmvbu : null, (16776191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f96789dxjokdxxww : null, (16776191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f96786btonecajqb : null, (16776191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f96791gtknphoqwx : list2, (16776191 & 2048) != 0 ? iwizpuwonkVar.f96788draadjrbmk : null, (16776191 & 4096) != 0 ? iwizpuwonkVar.f96804wflxmlrfwp : null, (16776191 & 8192) != 0 ? iwizpuwonkVar.f96785agtfadlqog : null, (16776191 & 16384) != 0 ? iwizpuwonkVar.f96799ojitshcjhn : null, (16776191 & 32768) != 0 ? iwizpuwonkVar.f96802rgvfuqvkyq : null, (16776191 & 65536) != 0 ? iwizpuwonkVar.f96803vdvldrhtss : null, (16776191 & 131072) != 0 ? iwizpuwonkVar.f96800oxmwwwfdhm : null, (16776191 & 262144) != 0 ? iwizpuwonkVar.f96796kcexrzcfyt : false, (16776191 & 524288) != 0 ? iwizpuwonkVar.f96807zdlpuopuiu : null, (16776191 & 1048576) != 0 ? iwizpuwonkVar.f96806yggfygwlhe : null, (16776191 & 2097152) != 0 ? iwizpuwonkVar.f96795jyumaefscl : null, (16776191 & 4194304) != 0 ? iwizpuwonkVar.f96794iwizpuwonk : null, (16776191 & 8388608) != 0 ? iwizpuwonkVar.f96787cqumvgiudr : null)));
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
            int i13 = this.f96908zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(sj.dxjokdxxww.wflxmlrfwp(lereixgezr.this.czzsidtyhn().iobyxmoadg(), lereixgezr.this.uwvvkdfqfp(), new iobyxmoadg(null)));
                zoijcleaow zoijcleaowVar = new zoijcleaow(lereixgezr.this);
                this.f96908zdlpuopuiu = 1;
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
        int f96923iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f96924jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96925yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96926zdlpuopuiu;

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
            int i13 = this.f96923iwizpuwonk;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f96925yggfygwlhe;
                        obj2 = this.f96926zdlpuopuiu;
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
                w01.zoijcleaow zoijcleaowVar = lereixgezrVar3.f96832btonecajqb;
                w01.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = new w01.zoijcleaow.iobyxmoadg(lereixgezrVar3.f96850rgvfuqvkyq.getOrderId());
                this.f96923iwizpuwonk = 1;
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
                this.f96926zdlpuopuiu = obj2;
                this.f96925yggfygwlhe = lereixgezrVar;
                this.f96924jyumaefscl = obj2;
                this.f96923iwizpuwonk = 2;
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
        int f96928jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f96929yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f96930zdlpuopuiu;

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
            int i13 = this.f96928jyumaefscl;
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lereixgezrVar2 = (lereixgezr) this.f96929yggfygwlhe;
                        obj2 = this.f96930zdlpuopuiu;
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
                w01.nufgyqmvbu nufgyqmvbuVar = lereixgezrVar3.f96846nufgyqmvbu;
                w01.nufgyqmvbu.iobyxmoadg iobyxmoadgVar2 = new w01.nufgyqmvbu.iobyxmoadg(lereixgezrVar3.f96850rgvfuqvkyq.getOrderId());
                this.f96928jyumaefscl = 1;
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
                this.f96930zdlpuopuiu = obj2;
                this.f96929yggfygwlhe = lereixgezrVar;
                this.f96928jyumaefscl = 2;
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
    public lereixgezr(w01.nufgyqmvbu deleteAndCancelOrderUseCase, w01.wflxmlrfwp saveEditOrderUseCase, w01.zoijcleaow cancelEditOrderUseCase, w01.rgvfuqvkyq subscribeEditOrderUseCase, w01.gtknphoqwx getEditOrderUseCase, w01.ojitshcjhn setPromocodeUseCase, ha1.ppxfxbqfkf editOrderUiMapper, i01.wkgbmnqykc changeOrdersObserver, EditOrderPayload payload, xo0.iobyxmoadg catalogFeatureApi, c51.iobyxmoadg deliveryFeatureApi, ow1.esjtqupxsv isAuthUseCase, dz0.gtknphoqwx productChangesSourceProvider, ga1.iobyxmoadg updateUiModelByCartDataUseCase, w01.draadjrbmk removeProductFromOrderUseCase, w01.lqeggnwhkg checkOrderCompoundChangedUseCase, w01.wkgbmnqykc changeOrderEditOrderUseCase, an0.iobyxmoadg authFeatureApi, vm0.zoijcleaow analyticsTracker, rg1.iobyxmoadg paymentFeatureApi, w01.btonecajqb getActiveEditOrderIdUseCase) {
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
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productChangesSourceProvider, "productChangesSourceProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateUiModelByCartDataUseCase, "updateUiModelByCartDataUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(removeProductFromOrderUseCase, "removeProductFromOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkOrderCompoundChangedUseCase, "checkOrderCompoundChangedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeOrderEditOrderUseCase, "changeOrderEditOrderUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getActiveEditOrderIdUseCase, "getActiveEditOrderIdUseCase");
        this.f96845lqeggnwhkg = new pw0.ppxfxbqfkf();
        this.f96846nufgyqmvbu = deleteAndCancelOrderUseCase;
        this.f96836dxjokdxxww = saveEditOrderUseCase;
        this.f96832btonecajqb = cancelEditOrderUseCase;
        this.f96838gtknphoqwx = subscribeEditOrderUseCase;
        this.f96835draadjrbmk = getEditOrderUseCase;
        this.f96852wflxmlrfwp = setPromocodeUseCase;
        this.f96831agtfadlqog = editOrderUiMapper;
        this.f96847ojitshcjhn = changeOrdersObserver;
        this.f96850rgvfuqvkyq = payload;
        this.f96851vdvldrhtss = catalogFeatureApi;
        this.f96848oxmwwwfdhm = deliveryFeatureApi;
        this.f96843kcexrzcfyt = isAuthUseCase;
        this.f96855zdlpuopuiu = productChangesSourceProvider;
        this.f96854yggfygwlhe = updateUiModelByCartDataUseCase;
        this.f96842jyumaefscl = removeProductFromOrderUseCase;
        this.f96841iwizpuwonk = checkOrderCompoundChangedUseCase;
        this.f96834cqumvgiudr = changeOrderEditOrderUseCase;
        this.f96837esjtqupxsv = authFeatureApi;
        this.f96844lereixgezr = analyticsTracker;
        this.f96849pmvmpeiblj = paymentFeatureApi;
        this.f96856zynmafqrjb = getActiveEditOrderIdUseCase;
        this.f96833cdpycssgdh = hg.jyumaefscl.wflxmlrfwp();
        this.f96839iozdgvuglv = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.legacy.presentation.screen.editorder.esjtqupxsv
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return lereixgezr.hszhottldk(this.f96782zdlpuopuiu);
            }
        });
        getActiveEditOrderIdUseCase.wkgbmnqykc(payload.getOrderId());
        if (payload.getIsStartEditOrder()) {
            yggfygwlhe(cqumvgiudr.eablkybsjg.f96772iobyxmoadg);
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16776191 & 1) != 0 ? iwizpuwonkVar.f96793iobyxmoadg : null, (16776191 & 2) != 0 ? iwizpuwonkVar.f96808zoijcleaow : null, (16776191 & 4) != 0 ? iwizpuwonkVar.f96801ppxfxbqfkf : null, (16776191 & 8) != 0 ? iwizpuwonkVar.f96805wkgbmnqykc : null, (16776191 & 16) != 0 ? iwizpuwonkVar.f96790eablkybsjg : null, (16776191 & 32) != 0 ? iwizpuwonkVar.f96792gxszxtbevo : null, (16776191 & 64) != 0 ? iwizpuwonkVar.f96797lqeggnwhkg : null, (16776191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f96798nufgyqmvbu : null, (16776191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f96789dxjokdxxww : null, (16776191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f96786btonecajqb : null, (16776191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f96791gtknphoqwx : null, (16776191 & 2048) != 0 ? iwizpuwonkVar.f96788draadjrbmk : null, (16776191 & 4096) != 0 ? iwizpuwonkVar.f96804wflxmlrfwp : null, (16776191 & 8192) != 0 ? iwizpuwonkVar.f96785agtfadlqog : null, (16776191 & 16384) != 0 ? iwizpuwonkVar.f96799ojitshcjhn : null, (16776191 & 32768) != 0 ? iwizpuwonkVar.f96802rgvfuqvkyq : null, (16776191 & 65536) != 0 ? iwizpuwonkVar.f96803vdvldrhtss : null, (16776191 & 131072) != 0 ? iwizpuwonkVar.f96800oxmwwwfdhm : null, (16776191 & 262144) != 0 ? iwizpuwonkVar.f96796kcexrzcfyt : true, (16776191 & 524288) != 0 ? iwizpuwonkVar.f96807zdlpuopuiu : null, (16776191 & 1048576) != 0 ? iwizpuwonkVar.f96806yggfygwlhe : null, (16776191 & 2097152) != 0 ? iwizpuwonkVar.f96795jyumaefscl : null, (16776191 & 4194304) != 0 ? iwizpuwonkVar.f96794iwizpuwonk : null, (16776191 & 8388608) != 0 ? iwizpuwonkVar.f96787cqumvgiudr : null)));
    }

    private final void auzgnhcxok() {
        if (((iwizpuwonk) gtknphoqwx()).oxmwwwfdhm().isEmpty()) {
            yggfygwlhe(cqumvgiudr.ppxfxbqfkf.f96777iobyxmoadg);
        } else {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gxszxtbevo(null), 3, null);
        }
    }

    private final void bfopjjpdmp() {
        yggfygwlhe(cqumvgiudr.wkgbmnqykc.f96778iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dz0.btonecajqb czzsidtyhn() {
        return (dz0.btonecajqb) this.f96839iozdgvuglv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dvvnrvtcbc(lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f96885jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f96885jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object obj = nufgyqmvbuVar.f96887zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f96885jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f96774iobyxmoadg);
            i01.wkgbmnqykc wkgbmnqykcVar = this.f96847ojitshcjhn;
            nufgyqmvbuVar.f96885jyumaefscl = 1;
            if (wkgbmnqykcVar.btonecajqb(nufgyqmvbuVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void fiwbwshyhd(String str) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new draadjrbmk(str, null), 3, null);
    }

    private final void fyldjkxazc(int i13) {
        yggfygwlhe(new cqumvgiudr.nufgyqmvbu(i13));
    }

    private final void grlcpdaxtj() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(sj.dxjokdxxww.ikoacuggdj(uwvvkdfqfp(), new agtfadlqog(null, this)), new ojitshcjhn(null)), agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dz0.btonecajqb hszhottldk(lereixgezr lereixgezrVar) {
        return lereixgezrVar.f96855zdlpuopuiu.iobyxmoadg(new dz0.btonecajqb.iobyxmoadg.wkgbmnqykc(lereixgezrVar.f96850rgvfuqvkyq.getOrderId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object igdgnonuha(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        btonecajqb btonecajqbVar;
        if (gxszxtbevoVar instanceof btonecajqb) {
            btonecajqbVar = (btonecajqb) gxszxtbevoVar;
            int i13 = btonecajqbVar.f96861jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                btonecajqbVar.f96861jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                btonecajqbVar = new btonecajqb(gxszxtbevoVar);
            }
        } else {
            btonecajqbVar = new btonecajqb(gxszxtbevoVar);
        }
        Object obj = btonecajqbVar.f96863zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = btonecajqbVar.f96861jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wizcaqwiak(warning);
            yggfygwlhe(cqumvgiudr.lqeggnwhkg.f96775iobyxmoadg);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f96774iobyxmoadg);
            i01.wkgbmnqykc wkgbmnqykcVar = this.f96847ojitshcjhn;
            btonecajqbVar.f96861jyumaefscl = 1;
            if (wkgbmnqykcVar.btonecajqb(btonecajqbVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ipoelvxyzq() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wflxmlrfwp(null), 3, null);
    }

    private final void iwxlajgraz() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new lqeggnwhkg(null), 3, null);
    }

    private final void ixidwrxhsl(AnalyticsPage analyticsPage) {
        this.f96844lereixgezr.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.OrderEdit(((iwizpuwonk) gtknphoqwx()).gtknphoqwx()), analyticsPage, null, null, null, 28, null)));
    }

    private final void iyctptxqzt() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f96848oxmwwwfdhm.iobyxmoadg(new DeliveryOptionsArgs(new DeliveryOptionsScreenMode.ORDER(this.f96850rgvfuqvkyq.getOrderId()))));
    }

    private final void lrnfpwlwnk() {
        ixidwrxhsl(AnalyticsPage.PaymentMethods.f92348iwizpuwonk);
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) ojitshcjhn().getValue();
        String orderId = this.f96850rgvfuqvkyq.getOrderId();
        PaymentCode paymentCodeAgtfadlqog = iwizpuwonkVar.agtfadlqog();
        if (paymentCodeAgtfadlqog == PaymentCode.UNDEFINED) {
            paymentCodeAgtfadlqog = null;
        }
        String serverValue = paymentCodeAgtfadlqog != null ? paymentCodeAgtfadlqog.getServerValue() : null;
        if (serverValue == null) {
            serverValue = "";
        }
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f96849pmvmpeiblj.zoijcleaow(new PaymentMethodsArgs(new PaymentType.Edit(orderId, serverValue, this.f96853yadqdtsiqt), iwizpuwonkVar.jyumaefscl(), iwizpuwonkVar.rgvfuqvkyq(), false, iwizpuwonkVar.wflxmlrfwp())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(uz0.iobyxmoadg iobyxmoadgVar) {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f96848oxmwwwfdhm.zoijcleaow(new DeliveryIntervalPayload(new OrderFlowType.EditOrder(this.f96850rgvfuqvkyq.getOrderId()))));
    }

    private final void metgxyhuhe() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new zoijcleaow(null), 3, null);
    }

    private final void mhtqkkgtqm() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new rgvfuqvkyq(null), 3, null);
    }

    private final void nuxfzjnpeb(CartProductUiModel cartProductUiModel) {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new eablkybsjg(cartProductUiModel, null), 3, null);
    }

    private final void oipsdeybqn() {
        ixidwrxhsl(AnalyticsPage.Catalog.f92304iwizpuwonk);
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f96851vdvldrhtss.zoijcleaow(new CatalogArgs(mz0.iobyxmoadg.ORDER_EDIT, this.f96850rgvfuqvkyq.getOrderId())));
    }

    private final void opjhrmiecq() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new wkgbmnqykc(null), 3, null);
    }

    private final void rlfsiqarku() {
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new ppxfxbqfkf(null), 3, null);
    }

    private final void roivzttewh() {
        ixidwrxhsl(new AnalyticsPage.OrderEditReceiver(this.f96850rgvfuqvkyq.getOrderId()));
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.legacy.presentation.screen.editreceiver.zoijcleaow.zoijcleaow(this.f96850rgvfuqvkyq.getOrderId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sflfametgt() {
        Object value;
        iwizpuwonk iwizpuwonkVar;
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
            iwizpuwonkVar = (iwizpuwonk) value;
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16776191 & 1) != 0 ? iwizpuwonkVar.f96793iobyxmoadg : null, (16776191 & 2) != 0 ? iwizpuwonkVar.f96808zoijcleaow : null, (16776191 & 4) != 0 ? iwizpuwonkVar.f96801ppxfxbqfkf : null, (16776191 & 8) != 0 ? iwizpuwonkVar.f96805wkgbmnqykc : null, (16776191 & 16) != 0 ? iwizpuwonkVar.f96790eablkybsjg : null, (16776191 & 32) != 0 ? iwizpuwonkVar.f96792gxszxtbevo : null, (16776191 & 64) != 0 ? iwizpuwonkVar.f96797lqeggnwhkg : null, (16776191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f96798nufgyqmvbu : null, (16776191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f96789dxjokdxxww : null, (16776191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f96786btonecajqb : null, (16776191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f96791gtknphoqwx : null, (16776191 & 2048) != 0 ? iwizpuwonkVar.f96788draadjrbmk : null, (16776191 & 4096) != 0 ? iwizpuwonkVar.f96804wflxmlrfwp : null, (16776191 & 8192) != 0 ? iwizpuwonkVar.f96785agtfadlqog : null, (16776191 & 16384) != 0 ? iwizpuwonkVar.f96799ojitshcjhn : null, (16776191 & 32768) != 0 ? iwizpuwonkVar.f96802rgvfuqvkyq : null, (16776191 & 65536) != 0 ? iwizpuwonkVar.f96803vdvldrhtss : null, (16776191 & 131072) != 0 ? iwizpuwonkVar.f96800oxmwwwfdhm : null, (16776191 & 262144) != 0 ? iwizpuwonkVar.f96796kcexrzcfyt : false, (16776191 & 524288) != 0 ? iwizpuwonkVar.f96807zdlpuopuiu : null, (16776191 & 1048576) != 0 ? iwizpuwonkVar.f96806yggfygwlhe : null, (16776191 & 2097152) != 0 ? iwizpuwonkVar.f96795jyumaefscl : null, (16776191 & 4194304) != 0 ? iwizpuwonkVar.f96794iwizpuwonk : null, (16776191 & 8388608) != 0 ? iwizpuwonkVar.f96787cqumvgiudr : null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object skhdrjzrfn(Warning warning, lg.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww dxjokdxxwwVar;
        if (gxszxtbevoVar instanceof dxjokdxxww) {
            dxjokdxxwwVar = (dxjokdxxww) gxszxtbevoVar;
            int i13 = dxjokdxxwwVar.f96867jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dxjokdxxwwVar.f96867jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
            }
        } else {
            dxjokdxxwwVar = new dxjokdxxww(gxszxtbevoVar);
        }
        Object obj = dxjokdxxwwVar.f96869zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = dxjokdxxwwVar.f96867jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            wizcaqwiak(warning);
            yggfygwlhe(cqumvgiudr.iobyxmoadg.f96774iobyxmoadg);
            i01.wkgbmnqykc wkgbmnqykcVar = this.f96847ojitshcjhn;
            dxjokdxxwwVar.f96867jyumaefscl = 1;
            if (wkgbmnqykcVar.btonecajqb(dxjokdxxwwVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
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
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVar.iobyxmoadg((16776191 & 1) != 0 ? iwizpuwonkVar.f96793iobyxmoadg : null, (16776191 & 2) != 0 ? iwizpuwonkVar.f96808zoijcleaow : null, (16776191 & 4) != 0 ? iwizpuwonkVar.f96801ppxfxbqfkf : null, (16776191 & 8) != 0 ? iwizpuwonkVar.f96805wkgbmnqykc : null, (16776191 & 16) != 0 ? iwizpuwonkVar.f96790eablkybsjg : null, (16776191 & 32) != 0 ? iwizpuwonkVar.f96792gxszxtbevo : null, (16776191 & 64) != 0 ? iwizpuwonkVar.f96797lqeggnwhkg : null, (16776191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iwizpuwonkVar.f96798nufgyqmvbu : null, (16776191 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iwizpuwonkVar.f96789dxjokdxxww : null, (16776191 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iwizpuwonkVar.f96786btonecajqb : null, (16776191 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iwizpuwonkVar.f96791gtknphoqwx : null, (16776191 & 2048) != 0 ? iwizpuwonkVar.f96788draadjrbmk : null, (16776191 & 4096) != 0 ? iwizpuwonkVar.f96804wflxmlrfwp : null, (16776191 & 8192) != 0 ? iwizpuwonkVar.f96785agtfadlqog : null, (16776191 & 16384) != 0 ? iwizpuwonkVar.f96799ojitshcjhn : null, (16776191 & 32768) != 0 ? iwizpuwonkVar.f96802rgvfuqvkyq : str, (16776191 & 65536) != 0 ? iwizpuwonkVar.f96803vdvldrhtss : iwizpuwonk.iobyxmoadg.NOT_ENTERED, (16776191 & 131072) != 0 ? iwizpuwonkVar.f96800oxmwwwfdhm : null, (16776191 & 262144) != 0 ? iwizpuwonkVar.f96796kcexrzcfyt : false, (16776191 & 524288) != 0 ? iwizpuwonkVar.f96807zdlpuopuiu : null, (16776191 & 1048576) != 0 ? iwizpuwonkVar.f96806yggfygwlhe : null, (16776191 & 2097152) != 0 ? iwizpuwonkVar.f96795jyumaefscl : null, (16776191 & 4194304) != 0 ? iwizpuwonkVar.f96794iwizpuwonk : null, (16776191 & 8388608) != 0 ? iwizpuwonkVar.f96787cqumvgiudr : null)));
    }

    private final void uawqvzlxes() {
        yggfygwlhe(cqumvgiudr.wkgbmnqykc.f96778iobyxmoadg);
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
        if (((Boolean) this.f96841iwizpuwonk.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new iobyxmoadg(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa(uz0.iobyxmoadg iobyxmoadgVar) {
        Object value;
        iwizpuwonk iwizpuwonkVarLqeggnwhkg = this.f96831agtfadlqog.lqeggnwhkg(iobyxmoadgVar, this.f96833cdpycssgdh, true);
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
                fyldjkxazc(vk0.lqeggnwhkg.proloyalty_order_edit_delivery_price_changed);
            }
        }
        this.f96853yadqdtsiqt = iobyxmoadgVar.eablkybsjg();
        zynmafqrjb zynmafqrjbVarOjitshcjhn = ojitshcjhn();
        do {
            value = zynmafqrjbVarOjitshcjhn.getValue();
        } while (!zynmafqrjbVarOjitshcjhn.compareAndSet(value, iwizpuwonkVarLqeggnwhkg));
    }

    private final void zeieaojujs(CartProductUiModel cartProductUiModel, ProductCardEvent productCardEvent) {
        Object next;
        List limits;
        List listIobyxmoadg;
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent);
        if (zoijcleaowVarIobyxmoadg == null) {
            return;
        }
        Iterator it = this.f96833cdpycssgdh.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) next).getId(), cartProductUiModel.getId()));
        ProductUIData productUIData = (ProductUIData) next;
        istkbnxepw(new ChangeProductParams(cartProductUiModel.getId(), cartProductUiModel.getArticle(), zoijcleaowVarIobyxmoadg, cartProductUiModel.getIsAvailable(), false, cartProductUiModel.getMeasureTypeModel(), cartProductUiModel.getAvgWeight(), (productUIData == null || (limits = productUIData.getLimits()) == null || (listIobyxmoadg = q11.zoijcleaow.iobyxmoadg(limits)) == null) ? cartProductUiModel.getLimits() : listIobyxmoadg, null), true);
    }

    private final void zfvoamnweg() {
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
    }

    @Override // r01.iobyxmoadg
    public void hcddaimhww(ChangeProductParams params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(agtfadlqog(), null, null, new gtknphoqwx(params, null), 3, null);
    }

    @Override // sw0.eablkybsjg, androidx.lifecycle.ntlheqmsrt
    protected void onCleared() {
        this.f96856zynmafqrjb.wkgbmnqykc(null);
        super.onCleared();
    }

    @Override // r01.iobyxmoadg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f96840istkbnxepw = iobyxmoadgVar;
    }

    public sj.lqeggnwhkg uwvvkdfqfp() {
        return this.f96845lqeggnwhkg.ppxfxbqfkf();
    }

    @Override // sw0.eablkybsjg
    protected Object vdvldrhtss(pw0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
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

    @Override // r01.iobyxmoadg
    public ow1.esjtqupxsv wkgbmnqykc() {
        return this.f96843kcexrzcfyt;
    }

    @Override // r01.iobyxmoadg
    public void yadqdtsiqt(ChangeProductParams changeProductParams) {
        yggfygwlhe(cqumvgiudr.gxszxtbevo.f96773iobyxmoadg);
    }

    public void yfnezrywwk(pw0.iobyxmoadg event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        this.f96845lqeggnwhkg.wkgbmnqykc(event);
    }

    @Override // r01.iobyxmoadg
    public void zoijcleaow() {
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f96837esjtqupxsv.eablkybsjg());
    }
}
