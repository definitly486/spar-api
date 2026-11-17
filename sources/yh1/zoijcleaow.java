package yh1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ow1.esjtqupxsv;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.products_from_banner.impl.domain.product_set.State;
import ru.myspar.proloyalty.purchases.api.CreatePurchaseListsResultHelper;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends e8.iobyxmoadg implements r01.zoijcleaow {

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    public static final iobyxmoadg f125236rgvfuqvkyq = new iobyxmoadg(null);

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    public static final int f125237vdvldrhtss = 8;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private pz0.iobyxmoadg f125238agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final CreatePurchaseListsResultHelper f125239btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final m01.nufgyqmvbu f125240draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vm0.zoijcleaow f125241dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final oh1.ppxfxbqfkf f125242eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lw1.iobyxmoadg f125243gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final t81.iobyxmoadg f125244gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final esjtqupxsv f125245lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ek1.iobyxmoadg f125246nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final boolean f125247ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final oh1.iobyxmoadg f125248ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private tg.iobyxmoadg f125249wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cz0.iobyxmoadg f125250wkgbmnqykc;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f125252yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125253zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            agtfadlqog agtfadlqogVar = zoijcleaow.this.new agtfadlqog(gxszxtbevoVar);
            agtfadlqogVar.f125252yggfygwlhe = obj;
            return agtfadlqogVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f125253zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.ulzqkzuiru(new yh1.lqeggnwhkg.zoijcleaow((List) this.f125252yggfygwlhe));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(list, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125255zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f125255zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.crxdokpmqz(yh1.gxszxtbevo.dxjokdxxww.f125193iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f125257yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125258zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            draadjrbmk draadjrbmkVar = zoijcleaow.this.new draadjrbmk(gxszxtbevoVar);
            draadjrbmkVar.f125257yggfygwlhe = obj;
            return draadjrbmkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f125258zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg = (lw1.iobyxmoadg.C1331iobyxmoadg) this.f125257yggfygwlhe;
            zoijcleaow.this.ixidwrxhsl(c1331iobyxmoadg.wkgbmnqykc(), c1331iobyxmoadg.eablkybsjg());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lw1.iobyxmoadg.C1331iobyxmoadg c1331iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(c1331iobyxmoadg, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125260zdlpuopuiu;

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
            if (this.f125260zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow.this.crxdokpmqz(yh1.gxszxtbevo.zoijcleaow.f125210iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f125261iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ yh1.wkgbmnqykc f125262jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f125263yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f125264zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(yh1.wkgbmnqykc wkgbmnqykcVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f125262jyumaefscl = wkgbmnqykcVar;
            this.f125261iwizpuwonk = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f125262jyumaefscl, this.f125261iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ph1.ppxfxbqfkf ppxfxbqfkfVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f125263yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    ppxfxbqfkfVar = (ph1.ppxfxbqfkf) this.f125264zdlpuopuiu;
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            yh1.wkgbmnqykc wkgbmnqykcVar = this.f125262jyumaefscl;
            if (!(wkgbmnqykcVar instanceof yh1.wkgbmnqykc.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new ph1.ppxfxbqfkf(((yh1.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg(), ((yh1.wkgbmnqykc.iobyxmoadg) this.f125262jyumaefscl).ppxfxbqfkf(), ((yh1.wkgbmnqykc.iobyxmoadg) this.f125262jyumaefscl).zoijcleaow());
            zoijcleaow zoijcleaowVar = this.f125261iwizpuwonk;
            this.f125264zdlpuopuiu = ppxfxbqfkfVar;
            this.f125263yggfygwlhe = 1;
            if (zoijcleaowVar.ageimvtcrz(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            this.f125261iwizpuwonk.krqnebusok();
            this.f125261iwizpuwonk.a(((yh1.wkgbmnqykc.iobyxmoadg) this.f125262jyumaefscl).iobyxmoadg());
            this.f125261iwizpuwonk.eslsurpljm();
            zoijcleaow zoijcleaowVar2 = this.f125261iwizpuwonk;
            this.f125264zdlpuopuiu = null;
            this.f125263yggfygwlhe = 2;
            if (zoijcleaowVar2.fyldjkxazc(ppxfxbqfkfVar, true, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f125265jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125267zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gtknphoqwx(List list, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f125265jyumaefscl = list;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gtknphoqwx(this.f125265jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            yh1.gxszxtbevo gxszxtbevoVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f125267zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    zoijcleaow.this.ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(true));
                    zoijcleaow zoijcleaowVar = zoijcleaow.this;
                    List list = this.f125265jyumaefscl;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                    oh1.iobyxmoadg iobyxmoadgVar2 = zoijcleaowVar.f125248ppxfxbqfkf;
                    List listC = zoijcleaowVar.c(list, zoijcleaow.iyctptxqzt(zoijcleaowVar).getProductSetCount());
                    this.f125267zdlpuopuiu = 1;
                    obj = iobyxmoadgVar2.iobyxmoadg(listC, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ph1.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.this;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                ph1.iobyxmoadg iobyxmoadgVar4 = (ph1.iobyxmoadg) objWkgbmnqykc;
                if (iobyxmoadgVar4.iobyxmoadg().isEmpty()) {
                    gxszxtbevoVar = !iobyxmoadgVar4.zoijcleaow().isEmpty() ? yh1.gxszxtbevo.wflxmlrfwp.f125206iobyxmoadg : yh1.gxszxtbevo.gtknphoqwx.f125198iobyxmoadg;
                } else {
                    gxszxtbevoVar = yh1.gxszxtbevo.draadjrbmk.f125192iobyxmoadg;
                }
                zoijcleaowVar2.crxdokpmqz(gxszxtbevoVar);
            }
            if (kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
                zoijcleaowVar2.crxdokpmqz(yh1.gxszxtbevo.lqeggnwhkg.f125201iobyxmoadg);
            }
            zoijcleaow.this.ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f125268jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ yh1.eablkybsjg f125269yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125270zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(yh1.eablkybsjg eablkybsjgVar, zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f125269yggfygwlhe = eablkybsjgVar;
            this.f125268jyumaefscl = zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new gxszxtbevo(this.f125269yggfygwlhe, this.f125268jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f125270zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                yh1.eablkybsjg eablkybsjgVar = this.f125269yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, yh1.eablkybsjg.wkgbmnqykc.f125189iobyxmoadg)) {
                    this.f125268jyumaefscl.crxdokpmqz(yh1.gxszxtbevo.iobyxmoadg.f125200iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, yh1.eablkybsjg.gtknphoqwx.f125183iobyxmoadg)) {
                    if (zoijcleaow.iyctptxqzt(this.f125268jyumaefscl).getIsChangeProductCountEnabled()) {
                        zoijcleaow zoijcleaowVar = this.f125268jyumaefscl;
                        r01.zoijcleaow.vdvldrhtss(zoijcleaowVar, zoijcleaowVar.fiwbwshyhd(), false, 2, null);
                    } else {
                        this.f125268jyumaefscl.yzdjzghtvl();
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, yh1.eablkybsjg.gxszxtbevo.f125184iobyxmoadg)) {
                    this.f125268jyumaefscl.dvvnrvtcbc();
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.C3191eablkybsjg) {
                    this.f125268jyumaefscl.mhtqkkgtqm(((yh1.eablkybsjg.C3191eablkybsjg) this.f125269yggfygwlhe).iobyxmoadg());
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.nufgyqmvbu) {
                    this.f125268jyumaefscl.igdgnonuha(((yh1.eablkybsjg.nufgyqmvbu) this.f125269yggfygwlhe).iobyxmoadg());
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.lqeggnwhkg) {
                    zoijcleaow zoijcleaowVar2 = this.f125268jyumaefscl;
                    String strIobyxmoadg = ((yh1.eablkybsjg.lqeggnwhkg) this.f125269yggfygwlhe).iobyxmoadg();
                    this.f125270zdlpuopuiu = 1;
                    if (zoijcleaowVar2.skhdrjzrfn(strIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.btonecajqb) {
                    zoijcleaow zoijcleaowVar3 = this.f125268jyumaefscl;
                    String strZoijcleaow = ((yh1.eablkybsjg.btonecajqb) this.f125269yggfygwlhe).zoijcleaow();
                    ProductCardEvent productCardEventIobyxmoadg = ((yh1.eablkybsjg.btonecajqb) this.f125269yggfygwlhe).iobyxmoadg();
                    this.f125270zdlpuopuiu = 2;
                    if (zoijcleaowVar3.fmlbqenlif(strZoijcleaow, productCardEventIobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVar, yh1.eablkybsjg.iobyxmoadg.f125185iobyxmoadg)) {
                    zoijcleaow zoijcleaowVar4 = this.f125268jyumaefscl;
                    this.f125270zdlpuopuiu = 3;
                    if (zoijcleaowVar4.tbqsvytpvh(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.ppxfxbqfkf) {
                    zoijcleaow zoijcleaowVar5 = this.f125268jyumaefscl;
                    String strIobyxmoadg2 = ((yh1.eablkybsjg.ppxfxbqfkf) this.f125269yggfygwlhe).iobyxmoadg();
                    this.f125270zdlpuopuiu = 4;
                    if (zoijcleaowVar5.auzgnhcxok(strIobyxmoadg2, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (eablkybsjgVar instanceof yh1.eablkybsjg.zoijcleaow) {
                    this.f125268jyumaefscl.uawqvzlxes(((yh1.eablkybsjg.zoijcleaow) this.f125269yggfygwlhe).iobyxmoadg());
                } else {
                    if (!(eablkybsjgVar instanceof yh1.eablkybsjg.dxjokdxxww)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f125268jyumaefscl.jrbgnlbqoe(((yh1.eablkybsjg.dxjokdxxww) this.f125269yggfygwlhe).zoijcleaow(), ((yh1.eablkybsjg.dxjokdxxww) this.f125269yggfygwlhe).iobyxmoadg());
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
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

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f125271cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f125273iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f125274jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f125275lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f125276yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f125277zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f125271cqumvgiudr = obj;
            this.f125275lereixgezr |= Integer.MIN_VALUE;
            return zoijcleaow.this.ageimvtcrz(this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f125278cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f125280jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        boolean f125281yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f125282zdlpuopuiu;

        nufgyqmvbu(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f125280jyumaefscl = obj;
            this.f125278cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.fyldjkxazc(null, false, this);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f125283iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f125285yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125286zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ojitshcjhn(String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f125283iwizpuwonk = str;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            ojitshcjhn ojitshcjhnVar = zoijcleaow.this.new ojitshcjhn(this.f125283iwizpuwonk, gxszxtbevoVar);
            ojitshcjhnVar.f125285yggfygwlhe = obj;
            return ojitshcjhnVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f125286zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                pz0.iobyxmoadg iobyxmoadgVar = (pz0.iobyxmoadg) this.f125285yggfygwlhe;
                zoijcleaow.this.rhgxfdycjh(iobyxmoadgVar);
                ph1.ppxfxbqfkf ppxfxbqfkfVar = new ph1.ppxfxbqfkf(this.f125283iwizpuwonk, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
                zoijcleaow zoijcleaowVar = zoijcleaow.this;
                this.f125286zdlpuopuiu = 1;
                if (zoijcleaow.ipoelvxyzq(zoijcleaowVar, ppxfxbqfkfVar, false, this, 2, null) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            tg.iobyxmoadg iobyxmoadgVarHszhottldk = zoijcleaow.this.hszhottldk();
            if (iobyxmoadgVarHszhottldk != null) {
                iobyxmoadgVarHszhottldk.invoke();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(pz0.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(iobyxmoadgVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125288zdlpuopuiu;

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
            int i13 = this.f125288zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f125288zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(350L, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            zoijcleaow.this.crxdokpmqz(new yh1.gxszxtbevo.btonecajqb(vk0.lqeggnwhkg.proloyalty_purchases_list_product_list_added_to_the_list));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f125289yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f125290zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f125290zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo((Throwable) this.f125289yggfygwlhe, new CrashlyticsKey[0]);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(gxszxtbevoVar);
            wflxmlrfwpVar.f125289yggfygwlhe = th2;
            return wflxmlrfwpVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f125292esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f125293iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f125294jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f125295yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f125296zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f125293iwizpuwonk = obj;
            this.f125292esjtqupxsv |= Integer.MIN_VALUE;
            return zoijcleaow.this.auzgnhcxok(null, this);
        }
    }

    /* JADX INFO: renamed from: yh1.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C3194zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f125297iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f125299yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f125300zdlpuopuiu;

        C3194zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f125299yggfygwlhe = obj;
            this.f125297iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.tbqsvytpvh(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(dr0.iobyxmoadg dispatchersProvider, oh1.iobyxmoadg componentApi, cz0.iobyxmoadg cartInteractor, oh1.ppxfxbqfkf interactor, t81.iobyxmoadg featureManager, esjtqupxsv isAuthUseCase, ek1.iobyxmoadg purchasesListComponentApi, vm0.zoijcleaow analyticsTracker, CreatePurchaseListsResultHelper resultHelper, lw1.iobyxmoadg changeFavoritesInteractor, m01.nufgyqmvbu subscribeToCurrentDeliveryDataUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(componentApi, "componentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(interactor, "interactor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resultHelper, "resultHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeFavoritesInteractor, "changeFavoritesInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCurrentDeliveryDataUseCase, "subscribeToCurrentDeliveryDataUseCase");
        this.f125248ppxfxbqfkf = componentApi;
        this.f125250wkgbmnqykc = cartInteractor;
        this.f125242eablkybsjg = interactor;
        this.f125244gxszxtbevo = featureManager;
        this.f125245lqeggnwhkg = isAuthUseCase;
        this.f125246nufgyqmvbu = purchasesListComponentApi;
        this.f125241dxjokdxxww = analyticsTracker;
        this.f125239btonecajqb = resultHelper;
        this.f125243gtknphoqwx = changeFavoritesInteractor;
        this.f125240draadjrbmk = subscribeToCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f125240draadjrbmk.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new ojitshcjhn(str, null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ageimvtcrz(lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        zoijcleaow zoijcleaowVar;
        boolean z13;
        int i13;
        boolean zBooleanValue;
        Object objPpxfxbqfkf;
        boolean z14;
        zoijcleaow zoijcleaowVar2;
        int i14;
        boolean z15;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i15 = lqeggnwhkgVar.f125275lereixgezr;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f125275lereixgezr = i15 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf2 = lqeggnwhkgVar.f125271cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i16 = lqeggnwhkgVar.f125275lereixgezr;
        if (i16 != 0) {
            if (i16 == 1) {
                zoijcleaowVar = (zoijcleaow) lqeggnwhkgVar.f125277zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
            } else if (i16 == 2) {
                int i17 = lqeggnwhkgVar.f125273iwizpuwonk;
                boolean z16 = lqeggnwhkgVar.f125276yggfygwlhe;
                zoijcleaow zoijcleaowVar3 = (zoijcleaow) lqeggnwhkgVar.f125277zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
                i13 = i17;
                zoijcleaowVar = zoijcleaowVar3;
                z13 = z16;
                zBooleanValue = ((Boolean) objPpxfxbqfkf2).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar = zoijcleaowVar.f125244gxszxtbevo;
                s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105724esjtqupxsv;
                lqeggnwhkgVar.f125277zdlpuopuiu = zoijcleaowVar;
                lqeggnwhkgVar.f125276yggfygwlhe = z13;
                lqeggnwhkgVar.f125273iwizpuwonk = i13;
                lqeggnwhkgVar.f125274jyumaefscl = zBooleanValue;
                lqeggnwhkgVar.f125275lereixgezr = 3;
                objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, lqeggnwhkgVar);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                z14 = zBooleanValue;
                objPpxfxbqfkf2 = objPpxfxbqfkf;
                zoijcleaowVar2 = zoijcleaowVar;
                i14 = i13;
                z15 = z13;
            } else {
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z14 = lqeggnwhkgVar.f125274jyumaefscl;
                i14 = lqeggnwhkgVar.f125273iwizpuwonk;
                z15 = lqeggnwhkgVar.f125276yggfygwlhe;
                zoijcleaowVar2 = (zoijcleaow) lqeggnwhkgVar.f125277zdlpuopuiu;
                zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
            }
            zoijcleaowVar2.ulzqkzuiru(new yh1.lqeggnwhkg.dxjokdxxww(z15, i14 != 0, z14, ((Boolean) objPpxfxbqfkf2).booleanValue()));
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        zdlpuopuiu.zoijcleaow(objPpxfxbqfkf2);
        t81.iobyxmoadg iobyxmoadgVar3 = this.f125244gxszxtbevo;
        s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105732jpowsppfya;
        lqeggnwhkgVar.f125277zdlpuopuiu = this;
        lqeggnwhkgVar.f125275lereixgezr = 1;
        objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, lqeggnwhkgVar);
        if (objPpxfxbqfkf2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        boolean zBooleanValue2 = ((Boolean) objPpxfxbqfkf2).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar5 = zoijcleaowVar.f125244gxszxtbevo;
        s81.iobyxmoadg iobyxmoadgVar6 = s81.iobyxmoadg.f105737mbcevpiqjq;
        lqeggnwhkgVar.f125277zdlpuopuiu = zoijcleaowVar;
        lqeggnwhkgVar.f125276yggfygwlhe = zBooleanValue2;
        lqeggnwhkgVar.f125273iwizpuwonk = 0;
        lqeggnwhkgVar.f125275lereixgezr = 2;
        Object objPpxfxbqfkf3 = iobyxmoadgVar5.ppxfxbqfkf(iobyxmoadgVar6, lqeggnwhkgVar);
        if (objPpxfxbqfkf3 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        z13 = zBooleanValue2;
        objPpxfxbqfkf2 = objPpxfxbqfkf3;
        i13 = 0;
        zBooleanValue = ((Boolean) objPpxfxbqfkf2).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar7 = zoijcleaowVar.f125244gxszxtbevo;
        s81.iobyxmoadg iobyxmoadgVar8 = s81.iobyxmoadg.f105724esjtqupxsv;
        lqeggnwhkgVar.f125277zdlpuopuiu = zoijcleaowVar;
        lqeggnwhkgVar.f125276yggfygwlhe = z13;
        lqeggnwhkgVar.f125273iwizpuwonk = i13;
        lqeggnwhkgVar.f125274jyumaefscl = zBooleanValue;
        lqeggnwhkgVar.f125275lereixgezr = 3;
        objPpxfxbqfkf = iobyxmoadgVar7.ppxfxbqfkf(iobyxmoadgVar8, lqeggnwhkgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        z14 = zBooleanValue;
        objPpxfxbqfkf2 = objPpxfxbqfkf;
        zoijcleaowVar2 = zoijcleaowVar;
        i14 = i13;
        z15 = z13;
        zoijcleaowVar2.ulzqkzuiru(new yh1.lqeggnwhkg.dxjokdxxww(z15, i14 != 0, z14, ((Boolean) objPpxfxbqfkf2).booleanValue()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object auzgnhcxok(String str, lg.gxszxtbevo gxszxtbevoVar) {
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
            int i13 = wkgbmnqykcVar.f125292esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f125292esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f125293iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f125292esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            esjtqupxsv esjtqupxsvVarWkgbmnqykc = wkgbmnqykc();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) esjtqupxsvVarWkgbmnqykc.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(yh1.gxszxtbevo.zoijcleaow.f125210iobyxmoadg);
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
            ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar2 = this.f125246nufgyqmvbu;
                wkgbmnqykcVar.f125296zdlpuopuiu = this;
                wkgbmnqykcVar.f125295yggfygwlhe = article;
                wkgbmnqykcVar.f125294jyumaefscl = productData;
                wkgbmnqykcVar.f125292esjtqupxsv = 1;
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
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productData = (ProductData) wkgbmnqykcVar.f125294jyumaefscl;
            str2 = (String) wkgbmnqykcVar.f125295yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) wkgbmnqykcVar.f125296zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        String str3 = str2;
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            List list = (List) objWkgbmnqykc;
            Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(productData.getQuantity());
            Double d13 = dZoijcleaow.doubleValue() > 0.0d ? dZoijcleaow : null;
            zoijcleaowVar.crxdokpmqz(new yh1.gxszxtbevo.ppxfxbqfkf(new PurchaseListAddProductDialogArgs.SingleProduct(str3, d13 != null ? d13.doubleValue() : productData.getMeasureType().getBasketDefault(), productData.getMeasureType().getValue(), list)));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.ezmngbhpjk(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void b(String str) {
        this.f125241dxjokdxxww.wkgbmnqykc(new xm0.lqeggnwhkg.zoijcleaow(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List c(List list, int i13) {
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ProductData productData = (ProductData) it.next();
            arrayList.add(productData.zoijcleaow((123 & 1) != 0 ? productData.id : null, (123 & 2) != 0 ? productData.article : null, (123 & 4) != 0 ? productData.quantity : jr0.wkgbmnqykc.gxszxtbevo(productData.getQuantity(), i13, null, 2, null), (123 & 8) != 0 ? productData.measureType : null, (123 & 16) != 0 ? productData.isLoading : false, (123 & 32) != 0 ? productData.limits : null, (123 & 64) != 0 ? productData.messageType : null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc() {
        State state = (State) jlmebxxoox();
        ulzqkzuiru(state.getProducts().size() == state.getSelectedProductsIds().size() ? yh1.lqeggnwhkg.nufgyqmvbu.f125223iobyxmoadg : yh1.lqeggnwhkg.C3193lqeggnwhkg.f125222iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eslsurpljm() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.gxszxtbevo(sj.dxjokdxxww.kegysxyocb(this.f125243gtknphoqwx.dxjokdxxww(), new draadjrbmk(null)), new wflxmlrfwp(null)), sopmlzcsov());
    }

    private final void ezmngbhpjk(Throwable th2) {
        crxdokpmqz(new yh1.gxszxtbevo.C3192gxszxtbevo(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List fiwbwshyhd() {
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
    public final Object fmlbqenlif(String str, ProductCardEvent productCardEvent, lg.gxszxtbevo gxszxtbevoVar) {
        ez0.zoijcleaow zoijcleaowVarIobyxmoadg;
        Object next;
        iwxlajgraz("productCardEvent=" + productCardEvent);
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
            Object objPpxfxbqfkf = this.f125242eablkybsjg.ppxfxbqfkf(new ChangeProductParams(str, product.getArticle(), zoijcleaowVarIobyxmoadg, product.getIsAvailableToBuy(), product.getIsPmProduct(), product.getMeasureTypeModel(), product.getAvgWeight(), product.getLimits(), null), gxszxtbevoVar);
            return objPpxfxbqfkf == mg.zoijcleaow.gxszxtbevo() ? objPpxfxbqfkf : wwaezpbzkn.f37140iobyxmoadg;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object fyldjkxazc(ph1.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        nufgyqmvbu nufgyqmvbuVar;
        zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        boolean z14 = z13;
        if (gxszxtbevoVar instanceof nufgyqmvbu) {
            nufgyqmvbuVar = (nufgyqmvbu) gxszxtbevoVar;
            int i13 = nufgyqmvbuVar.f125278cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nufgyqmvbuVar.f125278cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
            }
        } else {
            nufgyqmvbuVar = new nufgyqmvbu(gxszxtbevoVar);
        }
        Object objZoijcleaow = nufgyqmvbuVar.f125280jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = nufgyqmvbuVar.f125278cqumvgiudr;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            iwxlajgraz("loadProductList=" + ppxfxbqfkfVar + ", isFirstRequest=" + z14);
            ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                oh1.iobyxmoadg iobyxmoadgVar2 = this.f125248ppxfxbqfkf;
                nufgyqmvbuVar.f125282zdlpuopuiu = this;
                nufgyqmvbuVar.f125281yggfygwlhe = z14;
                nufgyqmvbuVar.f125278cqumvgiudr = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(ppxfxbqfkfVar, nufgyqmvbuVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z14 = nufgyqmvbuVar.f125281yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) nufgyqmvbuVar.f125282zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ph1.zoijcleaow) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            ph1.zoijcleaow zoijcleaowVar2 = (ph1.zoijcleaow) objWkgbmnqykc;
            oh1.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f125242eablkybsjg;
            List listZoijcleaow = zoijcleaowVar2.zoijcleaow();
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                arrayList.add(zoijcleaowVar.grlcpdaxtj((Product) it.next()));
            }
            ppxfxbqfkfVar2.zoijcleaow(arrayList);
            if (z14) {
                zoijcleaowVar.b(zoijcleaowVar2.ppxfxbqfkf());
            }
            String strPpxfxbqfkf = zoijcleaowVar2.ppxfxbqfkf();
            String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
            boolean zWkgbmnqykc = zoijcleaowVar2.wkgbmnqykc();
            List<Product> listZoijcleaow2 = zoijcleaowVar2.zoijcleaow();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listZoijcleaow2, 10));
            for (Product product : listZoijcleaow2) {
                arrayList2.add(product.zoijcleaow(((-513) & 1) != 0 ? product.id : null, ((-513) & 2) != 0 ? product.name : null, ((-513) & 4) != 0 ? product.article : null, ((-513) & 8) != 0 ? product.price : 0.0d, ((-513) & 16) != 0 ? product.oldPrice : null, ((-513) & 32) != 0 ? product.discount : null, ((-513) & 64) != 0 ? product.isDispPer100 : false, ((-513) & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.measureTypeModel : null, ((-513) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.avgWeight : null, ((-513) & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.isFavorite : false, ((-513) & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.isAvailable : false, ((-513) & 2048) != 0 ? product.isAvailableToBuy : false, ((-513) & 4096) != 0 ? product.productPropertyNames : null, ((-513) & 8192) != 0 ? product.productProperties : null, ((-513) & 16384) != 0 ? product.photoUrl : null, ((-513) & 32768) != 0 ? product.photoUrls : null, ((-513) & 65536) != 0 ? product.energy : null, ((-513) & 131072) != 0 ? product.fats : null, ((-513) & 262144) != 0 ? product.carbs : null, ((-513) & 524288) != 0 ? product.protein : null, ((-513) & 1048576) != 0 ? product.params : null, ((-513) & 2097152) != 0 ? product.description : null, ((-513) & 4194304) != 0 ? product.chemical : null, ((-513) & 8388608) != 0 ? product.hasDiscount : false, ((-513) & 16777216) != 0 ? product.hints : null, ((-513) & 33554432) != 0 ? product.hidePrice : false, ((-513) & 67108864) != 0 ? product.rating : null, ((-513) & 134217728) != 0 ? product.reviews : 0, ((-513) & 268435456) != 0 ? product.isPmProduct : false, ((-513) & 536870912) != 0 ? product.video : null, ((-513) & 1073741824) != 0 ? product.colorsModel : null, ((-513) & Integer.MIN_VALUE) != 0 ? product.country : null, (32767 & 1) != 0 ? product.region : null, (32767 & 2) != 0 ? product.countryFlagEmoji : null, (32767 & 4) != 0 ? product.type : null, (32767 & 8) != 0 ? product.kind : null, (32767 & 16) != 0 ? product.grape : null, (32767 & 32) != 0 ? product.standart : null, (32767 & 64) != 0 ? product.countryMapIcon : null, (32767 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? product.tasting : null, (32767 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? product.styling : null, (32767 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? product.button : null, (32767 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? product.limits : jyumaefscl.wflxmlrfwp(), (32767 & 2048) != 0 ? product.vivino : null, (32767 & 4096) != 0 ? product.productVariants : null, (32767 & 8192) != 0 ? product.quantity : 0.0d, (32767 & 16384) != 0 ? product.declarations : null));
            }
            zoijcleaowVar.ulzqkzuiru(new yh1.lqeggnwhkg.gxszxtbevo(strPpxfxbqfkf, strIobyxmoadg, zWkgbmnqykc, arrayList2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.ezmngbhpjk(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final ez0.iobyxmoadg grlcpdaxtj(Product product) {
        return new ez0.iobyxmoadg(product.getId(), product.getArticle(), product.getQuantity(), product.getMeasureTypeModel().getCurrentMeasure(), product.getLimits(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha(String str) {
        ulzqkzuiru(new yh1.lqeggnwhkg.wkgbmnqykc(str, !((State) jlmebxxoox()).getSelectedProductsIds().contains(str)));
    }

    static /* synthetic */ Object ipoelvxyzq(zoijcleaow zoijcleaowVar, ph1.ppxfxbqfkf ppxfxbqfkfVar, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return zoijcleaowVar.fyldjkxazc(ppxfxbqfkfVar, z13, gxszxtbevoVar);
    }

    private final void iwxlajgraz(String str) {
        kr0.wkgbmnqykc.wkgbmnqykc(kr0.wkgbmnqykc.f60450iobyxmoadg, "MOB-612", str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ixidwrxhsl(String str, boolean z13) {
        ulzqkzuiru(new yh1.lqeggnwhkg.ppxfxbqfkf(str, z13, true));
    }

    public static final /* synthetic */ State iyctptxqzt(zoijcleaow zoijcleaowVar) {
        return (State) zoijcleaowVar.jlmebxxoox();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jrbgnlbqoe(HintUiModel hintUiModel, AnalyticElement analyticElement) {
        String blockId = ((State) jlmebxxoox()).getBlockId();
        String title = ((State) jlmebxxoox()).getTitle();
        if (title == null) {
            title = "";
        }
        crxdokpmqz(new yh1.gxszxtbevo.nufgyqmvbu(hintUiModel, new HintDialogAnalyticsInfo(analyticElement, new AnalyticsPage.ProductsFromBanner(blockId, title), null, 4, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void krqnebusok() {
        sj.dxjokdxxww.hkdspvbjdz(sj.dxjokdxxww.kegysxyocb(this.f125242eablkybsjg.iobyxmoadg(), new agtfadlqog(null)), sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mhtqkkgtqm(String str) {
        State state = (State) jlmebxxoox();
        String blockId = state.getBlockId();
        String title = state.getTitle();
        if (title == null) {
            title = "";
        }
        crxdokpmqz(new yh1.gxszxtbevo.wkgbmnqykc(str, blockId, title));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void roivzttewh(zoijcleaow zoijcleaowVar, Object it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        if (zoijcleaowVar.f125239btonecajqb.ppxfxbqfkf(it)) {
            pj.gtknphoqwx.wkgbmnqykc(zoijcleaowVar.sopmlzcsov(), null, null, zoijcleaowVar.new ppxfxbqfkf(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object skhdrjzrfn(String str, lg.gxszxtbevo gxszxtbevoVar) {
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
        return (product != null && (objLqeggnwhkg = this.f125243gtknphoqwx.lqeggnwhkg(product.getId(), product.getIsFavorite(), null, gxszxtbevoVar)) == mg.zoijcleaow.gxszxtbevo()) ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object tbqsvytpvh(lg.gxszxtbevo gxszxtbevoVar) {
        C3194zoijcleaow c3194zoijcleaow;
        final zoijcleaow zoijcleaowVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof C3194zoijcleaow) {
            c3194zoijcleaow = (C3194zoijcleaow) gxszxtbevoVar;
            int i13 = c3194zoijcleaow.f125297iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3194zoijcleaow.f125297iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c3194zoijcleaow = new C3194zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c3194zoijcleaow = new C3194zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c3194zoijcleaow.f125299yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c3194zoijcleaow.f125297iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            esjtqupxsv esjtqupxsvVarWkgbmnqykc = wkgbmnqykc();
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            if (!((Boolean) esjtqupxsvVarWkgbmnqykc.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
                crxdokpmqz(yh1.gxszxtbevo.zoijcleaow.f125210iobyxmoadg);
                return wwaezpbzknVar;
            }
            ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
                ek1.iobyxmoadg iobyxmoadgVar2 = this.f125246nufgyqmvbu;
                c3194zoijcleaow.f125300zdlpuopuiu = this;
                c3194zoijcleaow.f125297iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar2.zoijcleaow(c3194zoijcleaow);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = this;
            } catch (Throwable th2) {
                th = th2;
                zoijcleaowVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) c3194zoijcleaow.f125300zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            List list = (List) objWkgbmnqykc;
            State state = (State) zoijcleaowVar.jlmebxxoox();
            String title = state.getTitle();
            if (title == null) {
                title = "";
            }
            zoijcleaowVar.crxdokpmqz(new yh1.gxszxtbevo.ppxfxbqfkf(new PurchaseListAddProductDialogArgs.ProductsListFromBanner(state.getBlockId(), title, list)));
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().wkgbmnqykc(zoijcleaowVar.f125239btonecajqb.zoijcleaow(), new l9.draadjrbmk() { // from class: yh1.iobyxmoadg
                @Override // l9.draadjrbmk
                public final void iobyxmoadg(Object obj) {
                    zoijcleaow.roivzttewh(this.f125211iobyxmoadg, obj);
                }
            });
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            zoijcleaowVar.ezmngbhpjk(thDxjokdxxww);
        }
        zoijcleaowVar.ulzqkzuiru(new yh1.lqeggnwhkg.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uawqvzlxes(int i13) {
        ulzqkzuiru(new yh1.lqeggnwhkg.eablkybsjg(i13));
        r01.zoijcleaow.vdvldrhtss(this, fiwbwshyhd(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yzdjzghtvl() {
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
        crxdokpmqz(new yh1.gxszxtbevo.eablkybsjg(title, products, productData, null));
    }

    @Override // r01.zoijcleaow
    public boolean btonecajqb() {
        return this.f125247ojitshcjhn;
    }

    @Override // r01.zoijcleaow
    public void gtknphoqwx(List list) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new btonecajqb(null), 3, null);
    }

    public tg.iobyxmoadg hszhottldk() {
        return this.f125249wflxmlrfwp;
    }

    @Override // r01.zoijcleaow
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

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: lxfrhoxuzk, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(yh1.wkgbmnqykc action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(action, this, null), 3, null);
    }

    @Override // r01.zoijcleaow
    public void nufgyqmvbu(List params) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(params, "params");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gtknphoqwx(params, null), 3, null);
    }

    @Override // r01.zoijcleaow
    public void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
        this.f125249wflxmlrfwp = iobyxmoadgVar;
    }

    public void rhgxfdycjh(pz0.iobyxmoadg iobyxmoadgVar) {
        this.f125238agtfadlqog = iobyxmoadgVar;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: wizcaqwiak, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(yh1.eablkybsjg intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(intent, this, null), 3, null);
    }

    @Override // r01.zoijcleaow
    public esjtqupxsv wkgbmnqykc() {
        return this.f125245lqeggnwhkg;
    }

    @Override // r01.zoijcleaow
    public void zoijcleaow() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new dxjokdxxww(null), 3, null);
    }
}
