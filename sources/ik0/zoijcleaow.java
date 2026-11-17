package ik0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import pj.ntlheqmsrt;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.products_from_banner.impl.domain.product_set.State;
import ru.myspar.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends e8.iobyxmoadg implements h20.eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private tg.iobyxmoadg f44659agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f44660btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final sm.iobyxmoadg f44661draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final lo.zoijcleaow f44662dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yj0.ppxfxbqfkf f44663eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final j00.zoijcleaow f44664gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final na0.iobyxmoadg f44665gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final c20.eablkybsjg f44666lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final yy1.iobyxmoadg f44667nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private y00.iobyxmoadg f44668ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yj0.iobyxmoadg f44669ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final boolean f44670rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final z10.nufgyqmvbu f44671wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final k00.iobyxmoadg f44672wkgbmnqykc;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final iobyxmoadg f44658vdvldrhtss = new iobyxmoadg(null);

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final int f44657oxmwwwfdhm = 8;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44674zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44674zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.crxdokpmqz(ik0.gxszxtbevo.zoijcleaow.f44632iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44675zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44675zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f44676cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f44678jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f44679yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44680zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44678jyumaefscl = obj;
            this.f44676cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.grlcpdaxtj(null, false, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44682zdlpuopuiu;

        dxjokdxxww(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new dxjokdxxww(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44682zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                na0.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f44665gxszxtbevo;
                this.f44682zdlpuopuiu = 1;
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
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f44683iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ik0.wkgbmnqykc f44684jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f44685yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44686zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(ik0.wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44684jyumaefscl = wkgbmnqykcVar;
            this.f44683iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f44684jyumaefscl, this.f44683iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            zj0.ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44685yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    ppxfxbqfkfVar = (zj0.ppxfxbqfkf) this.f44686zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ik0.wkgbmnqykc wkgbmnqykcVar = this.f44684jyumaefscl;
            if (!(wkgbmnqykcVar instanceof ik0.wkgbmnqykc.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new zj0.ppxfxbqfkf(((ik0.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg(), ((ik0.wkgbmnqykc.iobyxmoadg) this.f44684jyumaefscl).ppxfxbqfkf(), ((ik0.wkgbmnqykc.iobyxmoadg) this.f44684jyumaefscl).zoijcleaow());
            zoijcleaow zoijcleaowVar = this.f44683iwizpuwonk;
            this.f44686zdlpuopuiu = ppxfxbqfkfVar;
            this.f44685yggfygwlhe = 1;
            if (zoijcleaowVar.ipoelvxyzq(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f44683iwizpuwonk.b();
            this.f44683iwizpuwonk.c(((ik0.wkgbmnqykc.iobyxmoadg) this.f44684jyumaefscl).iobyxmoadg());
            this.f44683iwizpuwonk.a();
            zoijcleaow zoijcleaowVar2 = this.f44683iwizpuwonk;
            this.f44686zdlpuopuiu = null;
            this.f44685yggfygwlhe = 2;
            if (zoijcleaowVar2.grlcpdaxtj(ppxfxbqfkfVar, true, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44688zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44688zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                na0.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f44665gxszxtbevo;
                this.f44688zdlpuopuiu = 1;
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
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f44689jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ ik0.eablkybsjg f44690yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44691zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(ik0.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44690yggfygwlhe = eablkybsjgVar;
            this.f44689jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f44690yggfygwlhe, this.f44689jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44691zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ik0.eablkybsjg eablkybsjgVar = this.f44690yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ik0.eablkybsjg.C1035eablkybsjg.f44601iobyxmoadg)) {
                    this.f44689jyumaefscl.crxdokpmqz(ik0.gxszxtbevo.iobyxmoadg.f44622iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ik0.eablkybsjg.draadjrbmk.f44599iobyxmoadg)) {
                    if (zoijcleaow.lrnfpwlwnk(this.f44689jyumaefscl).getIsChangeProductCountEnabled()) {
                        zoijcleaow zoijcleaowVar = this.f44689jyumaefscl;
                        h20.eablkybsjg.jpowsppfya(zoijcleaowVar, zoijcleaowVar.fyldjkxazc(), false, 2, null);
                    } else {
                        this.f44689jyumaefscl.krqnebusok();
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ik0.eablkybsjg.lqeggnwhkg.f44606iobyxmoadg)) {
                    this.f44689jyumaefscl.igdgnonuha();
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.gxszxtbevo) {
                    this.f44689jyumaefscl.jrbgnlbqoe(((ik0.eablkybsjg.gxszxtbevo) this.f44690yggfygwlhe).iobyxmoadg());
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.dxjokdxxww) {
                    this.f44689jyumaefscl.wizcaqwiak(((ik0.eablkybsjg.dxjokdxxww) this.f44690yggfygwlhe).iobyxmoadg());
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.nufgyqmvbu) {
                    zoijcleaow zoijcleaowVar2 = this.f44689jyumaefscl;
                    String strIobyxmoadg = ((ik0.eablkybsjg.nufgyqmvbu) this.f44690yggfygwlhe).iobyxmoadg();
                    this.f44691zdlpuopuiu = 1;
                    if (zoijcleaowVar2.lxfrhoxuzk(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.gtknphoqwx) {
                    zoijcleaow zoijcleaowVar3 = this.f44689jyumaefscl;
                    String strZoijcleaow = ((ik0.eablkybsjg.gtknphoqwx) this.f44690yggfygwlhe).zoijcleaow();
                    ProductCardEvent productCardEventIobyxmoadg = ((ik0.eablkybsjg.gtknphoqwx) this.f44690yggfygwlhe).iobyxmoadg();
                    this.f44691zdlpuopuiu = 2;
                    if (zoijcleaowVar3.rhgxfdycjh(strZoijcleaow, productCardEventIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ik0.eablkybsjg.iobyxmoadg.f44605iobyxmoadg)) {
                    zoijcleaow zoijcleaowVar4 = this.f44689jyumaefscl;
                    this.f44691zdlpuopuiu = 3;
                    if (zoijcleaowVar4.uawqvzlxes(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.ppxfxbqfkf) {
                    zoijcleaow zoijcleaowVar5 = this.f44689jyumaefscl;
                    String strIobyxmoadg2 = ((ik0.eablkybsjg.ppxfxbqfkf) this.f44690yggfygwlhe).iobyxmoadg();
                    this.f44691zdlpuopuiu = 4;
                    if (zoijcleaowVar5.dvvnrvtcbc(strIobyxmoadg2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, ik0.eablkybsjg.wkgbmnqykc.f44609iobyxmoadg)) {
                    zoijcleaow zoijcleaowVar6 = this.f44689jyumaefscl;
                    zoijcleaowVar6.stevsuqkhv(zoijcleaowVar6.fyldjkxazc());
                } else if (eablkybsjgVar instanceof ik0.eablkybsjg.zoijcleaow) {
                    this.f44689jyumaefscl.iwxlajgraz(((ik0.eablkybsjg.zoijcleaow) this.f44690yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof ik0.eablkybsjg.btonecajqb)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f44689jyumaefscl.ezmngbhpjk(((ik0.eablkybsjg.btonecajqb) this.f44690yggfygwlhe).zoijcleaow(), ((ik0.eablkybsjg.btonecajqb) this.f44690yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
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

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44692yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44693zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44693zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo((Throwable) this.f44692yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(gxszxtbevoVar);
            kcexrzcfytVar.f44692yggfygwlhe = th2;
            return kcexrzcfytVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        boolean f44694cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        boolean f44695esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        int f44696istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f44697iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44698jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f44699lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        /* synthetic */ Object f44700pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44701yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44702zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44700pmvmpeiblj = obj;
            this.f44696istkbnxepw |= Integer.MIN_VALUE;
            return zoijcleaow.this.ipoelvxyzq(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44705zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new nufgyqmvbu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44705zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                na0.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f44665gxszxtbevo;
                this.f44705zdlpuopuiu = 1;
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
            return ((nufgyqmvbu) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44707zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44707zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.crxdokpmqz(ik0.gxszxtbevo.gtknphoqwx.f44620iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44709yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44710zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            oxmwwwfdhm oxmwwwfdhmVar = zoijcleaow.this.new oxmwwwfdhm(gxszxtbevoVar);
            oxmwwwfdhmVar.f44709yggfygwlhe = obj;
            return oxmwwwfdhmVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44710zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            j00.zoijcleaow.iobyxmoadg iobyxmoadgVar = (j00.zoijcleaow.iobyxmoadg) this.f44709yggfygwlhe;
            zoijcleaow.this.fmlbqenlif(iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j00.zoijcleaow.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44712zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44712zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                this.f44712zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.crxdokpmqz(new ik0.gxszxtbevo.draadjrbmk(pm.dxjokdxxww.purchases_list_product_list_added_to_the_list));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f44713jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44715zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        rgvfuqvkyq(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44713jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new rgvfuqvkyq(this.f44713jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            ik0.gxszxtbevo gxszxtbevoVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44715zdlpuopuiu;
            try {
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(true));
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    List list = this.f44713jyumaefscl;
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    yj0.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f44669ppxfxbqfkf;
                    List listE = zoijcleaowVar.e(list, zoijcleaow.lrnfpwlwnk(zoijcleaowVar).getProductSetCount());
                    this.f44715zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.iobyxmoadg(listE, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((zj0.iobyxmoadg) obj);
            } catch (Throwable th2) {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                zj0.iobyxmoadg iobyxmoadgVar4 = (zj0.iobyxmoadg) objWkgbmnqykc;
                if (iobyxmoadgVar4.iobyxmoadg().isEmpty()) {
                    gxszxtbevoVar = !iobyxmoadgVar4.zoijcleaow().isEmpty() ? ik0.gxszxtbevo.ojitshcjhn.f44628iobyxmoadg : ik0.gxszxtbevo.wflxmlrfwp.f44630iobyxmoadg;
                } else {
                    gxszxtbevoVar = ik0.gxszxtbevo.agtfadlqog.f44611iobyxmoadg;
                }
                zoijcleaowVar2.crxdokpmqz(gxszxtbevoVar);
            }
            if (gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                zoijcleaowVar2.crxdokpmqz(ik0.gxszxtbevo.dxjokdxxww.f44616iobyxmoadg);
            }
            zoijcleaow.this.ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44717zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44717zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.crxdokpmqz(ik0.gxszxtbevo.C1036gxszxtbevo.f44621iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44719zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44719zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sm.iobyxmoadg iobyxmoadgVar = zoijcleaow.this.f44661draadjrbmk;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f44719zdlpuopuiu = 1;
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
            zoijcleaow.this.crxdokpmqz(new ik0.gxszxtbevo.wkgbmnqykc(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f44721esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f44722iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f44723jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f44724yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44725zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44722iwizpuwonk = obj;
            this.f44721esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.dvvnrvtcbc(null, this);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f44726iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44728yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44729zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        yggfygwlhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f44726iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            yggfygwlhe yggfygwlheVar = zoijcleaow.this.new yggfygwlhe(this.f44726iwizpuwonk, gxszxtbevoVar);
            yggfygwlheVar.f44728yggfygwlhe = obj;
            return yggfygwlheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f44729zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                y00.iobyxmoadg iobyxmoadgVar = (y00.iobyxmoadg) this.f44728yggfygwlhe;
                zoijcleaow.this.eslsurpljm(iobyxmoadgVar);
                zj0.ppxfxbqfkf ppxfxbqfkfVar = new zj0.ppxfxbqfkf(this.f44726iwizpuwonk, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                this.f44729zdlpuopuiu = 1;
                if (zoijcleaow.mhtqkkgtqm(zoijcleaowVar, ppxfxbqfkfVar, false, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            tg.iobyxmoadg iobyxmoadgVarAgeimvtcrz = zoijcleaow.this.ageimvtcrz();
            if (iobyxmoadgVarAgeimvtcrz != null) {
                iobyxmoadgVarAgeimvtcrz.invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y00.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44731yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f44732zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zdlpuopuiu zdlpuopuiuVar = zoijcleaow.this.new zdlpuopuiu(gxszxtbevoVar);
            zdlpuopuiuVar.f44731yggfygwlhe = obj;
            return zdlpuopuiuVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f44732zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.ulzqkzuiru(new ik0.lqeggnwhkg.zoijcleaow((List) this.f44731yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: ik0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1038zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f44733iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f44735yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f44736zdlpuopuiu;

        C1038zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f44735yggfygwlhe = obj;
            this.f44733iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.uawqvzlxes(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(ns.iobyxmoadg dispatchersProvider, yj0.iobyxmoadg componentApi, k00.iobyxmoadg cartInteractor, yj0.ppxfxbqfkf interactor, na0.iobyxmoadg featureManager, c20.eablkybsjg isLoggedInUseCase, yy1.iobyxmoadg purchasesListComponentApi, lo.zoijcleaow analyticsTracker, CreatePurchaseListsResultHelper resultHelper, j00.zoijcleaow changeFavoritesInteractor, sm.iobyxmoadg getUserAddressFlowInfo, z10.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(componentApi, "componentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interactor, "interactor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        this.f44669ppxfxbqfkf = componentApi;
        this.f44672wkgbmnqykc = cartInteractor;
        this.f44663eablkybsjg = interactor;
        this.f44665gxszxtbevo = featureManager;
        this.f44666lqeggnwhkg = isLoggedInUseCase;
        this.f44667nufgyqmvbu = purchasesListComponentApi;
        this.f44662dxjokdxxww = analyticsTracker;
        this.f44660btonecajqb = resultHelper;
        this.f44664gtknphoqwx = changeFavoritesInteractor;
        this.f44661draadjrbmk = getUserAddressFlowInfo;
        this.f44671wflxmlrfwp = subscribeToCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f44664gtknphoqwx.dxjokdxxww(), new oxmwwwfdhm(null)), new kcexrzcfyt(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void auzgnhcxok(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f44660btonecajqb.ppxfxbqfkf(it)) {
            pj.gtknphoqwx.wkgbmnqykc(zoijcleaowVar.sopmlzcsov(), null, null, zoijcleaowVar.new ppxfxbqfkf(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f44663eablkybsjg.iobyxmoadg(), new zdlpuopuiu(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(String str) {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f44671wflxmlrfwp.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new yggfygwlhe(str, null)), sopmlzcsov());
    }

    private final void d(String str) {
        this.f44662dxjokdxxww.ppxfxbqfkf(new no.lqeggnwhkg.zoijcleaow(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object dvvnrvtcbc(String str, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        Object next;
        String article;
        Object next2;
        ProductData productData;
        zoijcleaow zoijcleaowVar;
        String str2;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f44721esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f44721esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f44722iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f44721esjtqupxsv;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c20.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) eablkybsjgVarEablkybsjg.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(ik0.gxszxtbevo.zoijcleaow.f44632iobyxmoadg);
                return wwaezpbzknVar;
            }
            State state = (State) jlmebxxoox();
            Iterator it = state.getProducts().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getId(), str));
            Product product = (Product) next;
            if (product == null || (article = product.getArticle()) == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            Iterator it2 = state.getProductData().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductData) next2).getId(), str));
            productData = (ProductData) next2;
            if (productData == null) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar2 = this.f44667nufgyqmvbu;
                wkgbmnqykcVar.f44725zdlpuopuiu = this;
                wkgbmnqykcVar.f44724yggfygwlhe = article;
                wkgbmnqykcVar.f44723jyumaefscl = productData;
                wkgbmnqykcVar.f44721esjtqupxsv = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
                str2 = article;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                str2 = article;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productData = (ProductData) wkgbmnqykcVar.f44723jyumaefscl;
            str2 = (String) wkgbmnqykcVar.f44724yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f44725zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        String str3 = str2;
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            List list = (List) objWkgbmnqykc;
            Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(productData.getQuantity());
            Double d13 = dZoijcleaow.doubleValue() > 0.0d ? dZoijcleaow : null;
            zoijcleaowVar.crxdokpmqz(new ik0.gxszxtbevo.ppxfxbqfkf(new PurchaseListAddProductDialogArgs.SingleProduct(str3, d13 != null ? d13.doubleValue() : productData.getMeasureType().getBasketDefault(), productData.getMeasureType().getValue(), list)));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.yzdjzghtvl(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List e(List list, int i13) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductData productData = (ProductData) it.next();
            arrayList.add(productData.zoijcleaow((123 & 1) != 0 ? productData.id : null, (123 & 2) != 0 ? productData.article : null, (123 & 4) != 0 ? productData.quantity : qs.eablkybsjg.gxszxtbevo(productData.getQuantity(), i13, null, 2, null), (123 & 8) != 0 ? productData.measureType : null, (123 & 16) != 0 ? productData.isLoading : false, (123 & 32) != 0 ? productData.limits : null, (123 & 64) != 0 ? productData.messageType : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ezmngbhpjk(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        String blockId = ((State) jlmebxxoox()).getBlockId();
        String title = ((State) jlmebxxoox()).getTitle();
        if (title == null) {
            title = "";
        }
        crxdokpmqz(new ik0.gxszxtbevo.btonecajqb(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.ProductsFromBanner(blockId, title), null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fmlbqenlif(String str, boolean z13) {
        ulzqkzuiru(new ik0.lqeggnwhkg.ppxfxbqfkf(str, z13, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List fyldjkxazc() {
        State state = (State) jlmebxxoox();
        boolean z13 = state.getProducts().size() == state.getSelectedProductsIds().size();
        if (!state.getIsChangeProductCountEnabled() || z13) {
            return state.getProductData();
        }
        List productData = state.getProductData();
        ArrayList arrayList = new ArrayList();
        for (Object obj : productData) {
            if (state.getSelectedProductsIds().contains(((ProductData) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object grlcpdaxtj(zj0.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        boolean z14 = z13;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f44676cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f44676cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        Object objZoijcleaow = draadjrbmkVar.f44678jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = draadjrbmkVar.f44676cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            skhdrjzrfn("loadProductList=" + ppxfxbqfkfVar + ", isFirstRequest=" + z14);
            ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                yj0.iobyxmoadg iobyxmoadgVar2 = this.f44669ppxfxbqfkf;
                draadjrbmkVar.f44680zdlpuopuiu = this;
                draadjrbmkVar.f44679yggfygwlhe = z14;
                draadjrbmkVar.f44676cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(ppxfxbqfkfVar, draadjrbmkVar);
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
            z14 = draadjrbmkVar.f44679yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) draadjrbmkVar.f44680zdlpuopuiu;
            try {
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((zj0.zoijcleaow) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            zj0.zoijcleaow zoijcleaowVar2 = (zj0.zoijcleaow) objWkgbmnqykc;
            yj0.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f44663eablkybsjg;
            List listZoijcleaow = zoijcleaowVar2.zoijcleaow();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                arrayList.add(zoijcleaowVar.ixidwrxhsl((Product) it.next()));
            }
            ppxfxbqfkfVar2.zoijcleaow(arrayList);
            if (z14) {
                zoijcleaowVar.d(zoijcleaowVar2.ppxfxbqfkf());
            }
            String strPpxfxbqfkf = zoijcleaowVar2.ppxfxbqfkf();
            String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
            boolean zWkgbmnqykc = zoijcleaowVar2.wkgbmnqykc();
            List<Product> listZoijcleaow2 = zoijcleaowVar2.zoijcleaow();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow2, 10));
            for (Product product : listZoijcleaow2) {
                arrayList2.add(product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.availableOnlyForPickup : false, ((-513) & 4096) != 0 ? product.onlyInShop : false, ((-513) & 8192) != 0 ? product.isAvailableToBuy : false, ((-513) & 16384) != 0 ? product.productPropertyNames : null, ((-513) & 32768) != 0 ? product.productProperties : null, ((-513) & 65536) != 0 ? product.photoUrl : null, ((-513) & 131072) != 0 ? product.photoUrls : null, ((-513) & 262144) != 0 ? product.energy : null, ((-513) & 524288) != 0 ? product.fats : null, ((-513) & 1048576) != 0 ? product.carbs : null, ((-513) & 2097152) != 0 ? product.protein : null, ((-513) & 4194304) != 0 ? product.params : null, ((-513) & 8388608) != 0 ? product.description : null, ((-513) & 16777216) != 0 ? product.chemical : null, ((-513) & 33554432) != 0 ? product.hasDiscount : false, ((-513) & 67108864) != 0 ? product.hints : null, ((-513) & 134217728) != 0 ? product.hidePrice : false, ((-513) & 268435456) != 0 ? product.rating : null, ((-513) & 536870912) != 0 ? product.reviews : 0, ((-513) & 1073741824) != 0 ? product.isPmProduct : false, ((-513) & Integer.MIN_VALUE) != 0 ? product.video : null, (65535 & 1) != 0 ? product.colorsModel : null, (65535 & 2) != 0 ? product.country : null, (65535 & 4) != 0 ? product.region : null, (65535 & 8) != 0 ? product.countryFlagEmoji : null, (65535 & 16) != 0 ? product.type : null, (65535 & 32) != 0 ? product.kind : null, (65535 & 64) != 0 ? product.grape : null, (65535 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.standart : null, (65535 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.countryMapIcon : null, (65535 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.tasting : null, (65535 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.styling : null, (65535 & 2048) != 0 ? product.button : null, (65535 & 4096) != 0 ? product.limits : jyumaefscl.wflxmlrfwp(), (65535 & 8192) != 0 ? product.vivino : null, (65535 & 16384) != 0 ? product.productVariants : null, (65535 & 32768) != 0 ? product.quantity : 0.0d));
            }
            zoijcleaowVar.ulzqkzuiru(new ik0.lqeggnwhkg.gxszxtbevo(strPpxfxbqfkf, strIobyxmoadg, zWkgbmnqykc, arrayList2));
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.yzdjzghtvl(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha() {
        State state = (State) jlmebxxoox();
        ulzqkzuiru(state.getProducts().size() == state.getSelectedProductsIds().size() ? ik0.lqeggnwhkg.nufgyqmvbu.f44645iobyxmoadg : ik0.lqeggnwhkg.C1037lqeggnwhkg.f44644iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object ipoelvxyzq(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        ntlheqmsrt ntlheqmsrtVarZoijcleaow;
        ntlheqmsrt ntlheqmsrtVar;
        ntlheqmsrt ntlheqmsrtVar2;
        zoijcleaow zoijcleaowVar;
        ntlheqmsrt ntlheqmsrtVar3;
        zoijcleaow zoijcleaowVar2;
        boolean z13;
        boolean zBooleanValue;
        Object objLqeggnwhkg;
        zoijcleaow zoijcleaowVar3;
        boolean z14;
        boolean z15;
        boolean zBooleanValue2;
        Object objLqeggnwhkg2;
        boolean z16;
        boolean z17;
        zoijcleaow zoijcleaowVar4;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f44696istkbnxepw;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f44696istkbnxepw = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg3 = lqeggnwhkgVar.f44700pmvmpeiblj;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f44696istkbnxepw;
        if (i14 != 0) {
            if (i14 == 1) {
                ntlheqmsrtVar2 = (ntlheqmsrt) lqeggnwhkgVar.f44697iwizpuwonk;
                ntlheqmsrt ntlheqmsrtVar4 = (ntlheqmsrt) lqeggnwhkgVar.f44698jyumaefscl;
                ntlheqmsrt ntlheqmsrtVar5 = (ntlheqmsrt) lqeggnwhkgVar.f44701yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) lqeggnwhkgVar.f44702zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg3);
                ntlheqmsrtVarZoijcleaow = ntlheqmsrtVar4;
                ntlheqmsrtVar = ntlheqmsrtVar5;
            } else if (i14 == 2) {
                z13 = lqeggnwhkgVar.f44694cqumvgiudr;
                ntlheqmsrtVar3 = (ntlheqmsrt) lqeggnwhkgVar.f44698jyumaefscl;
                ntlheqmsrtVar = (ntlheqmsrt) lqeggnwhkgVar.f44701yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) lqeggnwhkgVar.f44702zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg3);
                zBooleanValue = ((Boolean) objLqeggnwhkg3).booleanValue();
                lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar2;
                lqeggnwhkgVar.f44701yggfygwlhe = ntlheqmsrtVar3;
                lqeggnwhkgVar.f44698jyumaefscl = null;
                lqeggnwhkgVar.f44694cqumvgiudr = z13;
                lqeggnwhkgVar.f44695esjtqupxsv = zBooleanValue;
                lqeggnwhkgVar.f44696istkbnxepw = 3;
                objLqeggnwhkg = ntlheqmsrtVar.lqeggnwhkg(lqeggnwhkgVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar3 = zoijcleaowVar2;
                boolean z18 = z13;
                z14 = zBooleanValue;
                objLqeggnwhkg3 = objLqeggnwhkg;
                z15 = z18;
                zBooleanValue2 = ((Boolean) objLqeggnwhkg3).booleanValue();
                lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar3;
                lqeggnwhkgVar.f44701yggfygwlhe = null;
                lqeggnwhkgVar.f44694cqumvgiudr = z15;
                lqeggnwhkgVar.f44695esjtqupxsv = z14;
                lqeggnwhkgVar.f44699lereixgezr = zBooleanValue2;
                lqeggnwhkgVar.f44696istkbnxepw = 4;
                objLqeggnwhkg2 = ntlheqmsrtVar3.lqeggnwhkg(lqeggnwhkgVar);
                if (objLqeggnwhkg2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z16 = zBooleanValue2;
                objLqeggnwhkg3 = objLqeggnwhkg2;
                z17 = z15;
                zoijcleaowVar4 = zoijcleaowVar3;
            } else if (i14 == 3) {
                z14 = lqeggnwhkgVar.f44695esjtqupxsv;
                z15 = lqeggnwhkgVar.f44694cqumvgiudr;
                ntlheqmsrtVar3 = (ntlheqmsrt) lqeggnwhkgVar.f44701yggfygwlhe;
                zoijcleaowVar3 = (zoijcleaow) lqeggnwhkgVar.f44702zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg3);
                zBooleanValue2 = ((Boolean) objLqeggnwhkg3).booleanValue();
                lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar3;
                lqeggnwhkgVar.f44701yggfygwlhe = null;
                lqeggnwhkgVar.f44694cqumvgiudr = z15;
                lqeggnwhkgVar.f44695esjtqupxsv = z14;
                lqeggnwhkgVar.f44699lereixgezr = zBooleanValue2;
                lqeggnwhkgVar.f44696istkbnxepw = 4;
                objLqeggnwhkg2 = ntlheqmsrtVar3.lqeggnwhkg(lqeggnwhkgVar);
                if (objLqeggnwhkg2 == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z16 = zBooleanValue2;
                objLqeggnwhkg3 = objLqeggnwhkg2;
                z17 = z15;
                zoijcleaowVar4 = zoijcleaowVar3;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z16 = lqeggnwhkgVar.f44699lereixgezr;
                z14 = lqeggnwhkgVar.f44695esjtqupxsv;
                z17 = lqeggnwhkgVar.f44694cqumvgiudr;
                zoijcleaowVar4 = (zoijcleaow) lqeggnwhkgVar.f44702zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg3);
            }
            zoijcleaowVar4.ulzqkzuiru(new ik0.lqeggnwhkg.dxjokdxxww(z17, z14, z16, ((Boolean) objLqeggnwhkg3).booleanValue()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg3);
        ntlheqmsrt ntlheqmsrtVarZoijcleaow2 = pj.gtknphoqwx.zoijcleaow(sopmlzcsov(), null, null, new nufgyqmvbu(null), 3, null);
        ntlheqmsrt ntlheqmsrtVarZoijcleaow3 = pj.gtknphoqwx.zoijcleaow(sopmlzcsov(), null, null, new gtknphoqwx(null), 3, null);
        ntlheqmsrtVarZoijcleaow = pj.gtknphoqwx.zoijcleaow(sopmlzcsov(), null, null, new dxjokdxxww(null), 3, null);
        ntlheqmsrt ntlheqmsrtVarZoijcleaow4 = pj.gtknphoqwx.zoijcleaow(sopmlzcsov(), null, null, new btonecajqb(null), 3, null);
        lqeggnwhkgVar.f44702zdlpuopuiu = this;
        lqeggnwhkgVar.f44701yggfygwlhe = ntlheqmsrtVarZoijcleaow3;
        lqeggnwhkgVar.f44698jyumaefscl = ntlheqmsrtVarZoijcleaow;
        lqeggnwhkgVar.f44697iwizpuwonk = ntlheqmsrtVarZoijcleaow4;
        lqeggnwhkgVar.f44696istkbnxepw = 1;
        objLqeggnwhkg3 = ntlheqmsrtVarZoijcleaow2.lqeggnwhkg(lqeggnwhkgVar);
        if (objLqeggnwhkg3 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ntlheqmsrtVar = ntlheqmsrtVarZoijcleaow3;
        ntlheqmsrtVar2 = ntlheqmsrtVarZoijcleaow4;
        zoijcleaowVar = this;
        boolean zBooleanValue3 = ((Boolean) objLqeggnwhkg3).booleanValue();
        lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar;
        lqeggnwhkgVar.f44701yggfygwlhe = ntlheqmsrtVar;
        lqeggnwhkgVar.f44698jyumaefscl = ntlheqmsrtVarZoijcleaow;
        lqeggnwhkgVar.f44697iwizpuwonk = null;
        lqeggnwhkgVar.f44694cqumvgiudr = zBooleanValue3;
        lqeggnwhkgVar.f44696istkbnxepw = 2;
        Object objLqeggnwhkg4 = ntlheqmsrtVar2.lqeggnwhkg(lqeggnwhkgVar);
        if (objLqeggnwhkg4 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ntlheqmsrtVar3 = ntlheqmsrtVarZoijcleaow;
        zoijcleaowVar2 = zoijcleaowVar;
        z13 = zBooleanValue3;
        objLqeggnwhkg3 = objLqeggnwhkg4;
        zBooleanValue = ((Boolean) objLqeggnwhkg3).booleanValue();
        lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar2;
        lqeggnwhkgVar.f44701yggfygwlhe = ntlheqmsrtVar3;
        lqeggnwhkgVar.f44698jyumaefscl = null;
        lqeggnwhkgVar.f44694cqumvgiudr = z13;
        lqeggnwhkgVar.f44695esjtqupxsv = zBooleanValue;
        lqeggnwhkgVar.f44696istkbnxepw = 3;
        objLqeggnwhkg = ntlheqmsrtVar.lqeggnwhkg(lqeggnwhkgVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar3 = zoijcleaowVar2;
        boolean z19 = z13;
        z14 = zBooleanValue;
        objLqeggnwhkg3 = objLqeggnwhkg;
        z15 = z19;
        zBooleanValue2 = ((Boolean) objLqeggnwhkg3).booleanValue();
        lqeggnwhkgVar.f44702zdlpuopuiu = zoijcleaowVar3;
        lqeggnwhkgVar.f44701yggfygwlhe = null;
        lqeggnwhkgVar.f44694cqumvgiudr = z15;
        lqeggnwhkgVar.f44695esjtqupxsv = z14;
        lqeggnwhkgVar.f44699lereixgezr = zBooleanValue2;
        lqeggnwhkgVar.f44696istkbnxepw = 4;
        objLqeggnwhkg2 = ntlheqmsrtVar3.lqeggnwhkg(lqeggnwhkgVar);
        if (objLqeggnwhkg2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        z16 = zBooleanValue2;
        objLqeggnwhkg3 = objLqeggnwhkg2;
        z17 = z15;
        zoijcleaowVar4 = zoijcleaowVar3;
        zoijcleaowVar4.ulzqkzuiru(new ik0.lqeggnwhkg.dxjokdxxww(z17, z14, z16, ((Boolean) objLqeggnwhkg3).booleanValue()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwxlajgraz(int i13) {
        ulzqkzuiru(new ik0.lqeggnwhkg.eablkybsjg(i13));
        h20.eablkybsjg.jpowsppfya(this, fyldjkxazc(), false, 2, null);
    }

    private final m00.iobyxmoadg ixidwrxhsl(Product product) {
        return new m00.iobyxmoadg(product.getId(), product.getArticle(), product.getQuantity(), product.getMeasureTypeModel().getCurrentMeasure(), product.getLimits(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(String str) {
        State state = (State) jlmebxxoox();
        String blockId = state.getBlockId();
        String title = state.getTitle();
        if (title == null) {
            title = "";
        }
        crxdokpmqz(new ik0.gxszxtbevo.eablkybsjg(str, blockId, title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok() {
        List products;
        List productData;
        State state = (State) jlmebxxoox();
        if (state.getIsChangeProductCountEnabled()) {
            List products2 = state.getProducts();
            products = new ArrayList();
            for (Object obj : products2) {
                if (state.getSelectedProductsIds().contains(((Product) obj).getId())) {
                    products.add(obj);
                }
            }
        } else {
            products = state.getProducts();
        }
        if (state.getIsChangeProductCountEnabled()) {
            List productData2 = state.getProductData();
            productData = new ArrayList();
            for (Object obj2 : productData2) {
                if (state.getSelectedProductsIds().contains(((ProductData) obj2).getId())) {
                    productData.add(obj2);
                }
            }
        } else {
            productData = state.getProductData();
        }
        if (products.isEmpty() || productData.isEmpty() || products.size() != productData.size()) {
            return;
        }
        String title = state.getTitle();
        if (title == null) {
            title = "";
        }
        crxdokpmqz(new ik0.gxszxtbevo.lqeggnwhkg(title, products, productData, null));
    }

    public static final /* synthetic */ State lrnfpwlwnk(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lxfrhoxuzk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        Object next;
        Object objLqeggnwhkg;
        Iterator it = ((State) jlmebxxoox()).getProducts().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Product) next).getId(), str));
        Product product = (Product) next;
        return (product != null && (objLqeggnwhkg = this.f44664gtknphoqwx.lqeggnwhkg(product.getId(), product.getIsFavorite(), null, gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ Object mhtqkkgtqm(zoijcleaow zoijcleaowVar, zj0.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return zoijcleaowVar.grlcpdaxtj(ppxfxbqfkfVar, z13, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object rhgxfdycjh(String str, ProductCardEvent productCardEvent, lg.gxszxtbevo gxszxtbevoVar) {
        m00.zoijcleaow zoijcleaowVarIobyxmoadg;
        Object next;
        skhdrjzrfn("productCardEvent=" + productCardEvent);
        if (!(productCardEvent instanceof ProductCardEvent.CounterInternal) && (zoijcleaowVarIobyxmoadg = ProductCardEvent.INSTANCE.iobyxmoadg(productCardEvent)) != null) {
            Iterator it = ((State) jlmebxxoox()).getProducts().iterator();
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
            Object objPpxfxbqfkf = this.f44663eablkybsjg.ppxfxbqfkf(new ChangeProductParams(str, product.getArticle(), zoijcleaowVarIobyxmoadg, product.getIsAvailableToBuy(), product.getIsPmProduct(), product.getAvailableOnlyForPickup(), product.getMeasureTypeModel(), product.getAvgWeight(), product.getLimits(), null), gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn(String str) {
        rs.wkgbmnqykc.wkgbmnqykc(rs.wkgbmnqykc.f83693iobyxmoadg, "MOB-612", str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object uawqvzlxes(lg.gxszxtbevo gxszxtbevoVar) {
        C1038zoijcleaow c1038zoijcleaow;
        final zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C1038zoijcleaow) {
            c1038zoijcleaow = (C1038zoijcleaow) gxszxtbevoVar;
            int i13 = c1038zoijcleaow.f44733iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1038zoijcleaow.f44733iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c1038zoijcleaow = new C1038zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1038zoijcleaow = new C1038zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c1038zoijcleaow.f44735yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1038zoijcleaow.f44733iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c20.eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) eablkybsjgVarEablkybsjg.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(ik0.gxszxtbevo.zoijcleaow.f44632iobyxmoadg);
                return wwaezpbzknVar;
            }
            ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                yy1.iobyxmoadg iobyxmoadgVar2 = this.f44667nufgyqmvbu;
                c1038zoijcleaow.f44736zdlpuopuiu = this;
                c1038zoijcleaow.f44733iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c1038zoijcleaow);
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
            zoijcleaowVar = (zoijcleaow) c1038zoijcleaow.f44736zdlpuopuiu;
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
            State state = (State) zoijcleaowVar.jlmebxxoox();
            String title = state.getTitle();
            if (title == null) {
                title = "";
            }
            zoijcleaowVar.crxdokpmqz(new ik0.gxszxtbevo.ppxfxbqfkf(new PurchaseListAddProductDialogArgs.ProductsListFromBanner(state.getBlockId(), title, list)));
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(zoijcleaowVar.f44660btonecajqb.zoijcleaow(), new l9.draadjrbmk() { // from class: ik0.iobyxmoadg
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    zoijcleaow.auzgnhcxok(this.f44633iobyxmoadg, obj);
                }
            });
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.yzdjzghtvl(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new ik0.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak(String str) {
        ulzqkzuiru(new ik0.lqeggnwhkg.wkgbmnqykc(str, !((State) jlmebxxoox()).getSelectedProductsIds().contains(str)));
    }

    private final void yzdjzghtvl(Throwable th2) {
        crxdokpmqz(new ik0.gxszxtbevo.nufgyqmvbu(th2));
    }

    public tg.iobyxmoadg ageimvtcrz() {
        return this.f44659agtfadlqog;
    }

    @Override // h20.eablkybsjg
    public boolean btonecajqb() {
        return this.f44670rgvfuqvkyq;
    }

    @Override // h20.eablkybsjg
    public c20.eablkybsjg eablkybsjg() {
        return this.f44666lqeggnwhkg;
    }

    public void eslsurpljm(y00.iobyxmoadg iobyxmoadgVar) {
        this.f44668ojitshcjhn = iobyxmoadgVar;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: fiwbwshyhd, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ik0.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, this, null), 3, null);
    }

    @Override // h20.eablkybsjg
    public void gtknphoqwx(List list) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ojitshcjhn(null), 3, null);
    }

    @Override // h20.eablkybsjg
    public void gxszxtbevo() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wflxmlrfwp(null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: hszhottldk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ik0.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(action, this, null), 3, null);
    }

    @Override // h20.eablkybsjg
    public boolean lereixgezr(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductData) it.next()).getId());
        }
        List<Product> products = ((State) jlmebxxoox()).getProducts();
        if (products != null && products.isEmpty()) {
            return false;
        }
        for (Product product : products) {
            if (product.getAvailableOnlyForPickup() && arrayList.contains(product.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override // h20.eablkybsjg
    public List lqeggnwhkg(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        List<Product> products = ((State) jlmebxxoox()).getProducts();
        ArrayList arrayList = new ArrayList();
        for (Product product : products) {
            String id2 = product.getId();
            if (!product.getIsAvailableToBuy()) {
                id2 = null;
            }
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (arrayList.contains(((ProductData) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // h20.eablkybsjg
    public void nufgyqmvbu(List params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new rgvfuqvkyq(params, null), 3, null);
    }

    @Override // h20.eablkybsjg
    public y00.iobyxmoadg ojitshcjhn() {
        return this.f44668ojitshcjhn;
    }

    @Override // h20.eablkybsjg
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f44659agtfadlqog = iobyxmoadgVar;
    }

    @Override // h20.eablkybsjg
    public void yggfygwlhe(List params, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new vdvldrhtss(null), 3, null);
    }

    @Override // h20.eablkybsjg
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new agtfadlqog(null), 3, null);
    }
}
