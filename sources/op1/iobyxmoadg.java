package op1;

import com.google.android.gms.location.DeviceOrientationRequest;
import eo1.dxjokdxxww;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.screens.weightproduct.dialog.domain.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C1602iobyxmoadg f73393gxszxtbevo = new C1602iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f73394lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private auzgnhcxok f73395eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eo1.zoijcleaow f73396ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f73397wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73399zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73399zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f73399zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(op1.eablkybsjg.iobyxmoadg.f73381iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73401yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73402zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f73402zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.czzsidtyhn((Throwable) this.f73401yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f73401yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: op1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1602iobyxmoadg {
        public /* synthetic */ C1602iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1602iobyxmoadg() {
        }
    }

    /* synthetic */ class lqeggnwhkg implements nufgyqmvbu, agtfadlqog {
        lqeggnwhkg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(ScanGoProductModel scanGoProductModel, lg.gxszxtbevo gxszxtbevoVar) {
            Object objOipsdeybqn = iobyxmoadg.oipsdeybqn(iobyxmoadg.this, scanGoProductModel, gxszxtbevoVar);
            return objOipsdeybqn == mg.zoijcleaow.gxszxtbevo() ? objOipsdeybqn : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, iobyxmoadg.this, iobyxmoadg.class, "updateUiState", "updateUiState(Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;)V", 4);
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f73404jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ op1.wkgbmnqykc f73405yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73406zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(op1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73405yggfygwlhe = wkgbmnqykcVar;
            this.f73404jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f73405yggfygwlhe, this.f73404jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73406zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73405yggfygwlhe, op1.wkgbmnqykc.iobyxmoadg.f73418iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f73404jyumaefscl;
                this.f73406zdlpuopuiu = 1;
                if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f73407iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73409yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73410zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73409yggfygwlhe = obj;
            this.f73407iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f73411jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ op1.ppxfxbqfkf f73412yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73413zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(op1.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73412yggfygwlhe = ppxfxbqfkfVar;
            this.f73411jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f73412yggfygwlhe, this.f73411jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73413zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                op1.ppxfxbqfkf ppxfxbqfkfVar = this.f73412yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, op1.ppxfxbqfkf.iobyxmoadg.f73416iobyxmoadg)) {
                    this.f73411jyumaefscl.ydmasvzmpa();
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, op1.ppxfxbqfkf.zoijcleaow.f73417iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f73411jyumaefscl;
                    this.f73413zdlpuopuiu = 1;
                    if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eo1.zoijcleaow changeProductQuantityByArticleUseCase, dxjokdxxww subscribeToProductUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityByArticleUseCase, "changeProductQuantityByArticleUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToProductUseCase, "subscribeToProductUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f73396ppxfxbqfkf = changeProductQuantityByArticleUseCase;
        this.f73397wkgbmnqykc = subscribeToProductUseCase;
    }

    private final void bfopjjpdmp(ScanGoProductModel scanGoProductModel) {
        ulzqkzuiru(new op1.gxszxtbevo.zoijcleaow(scanGoProductModel.getId(), scanGoProductModel.getArticle(), scanGoProductModel.getName(), scanGoProductModel.getPictureUrl(), scanGoProductModel.getQuantity(), scanGoProductModel.getMeasure(), scanGoProductModel.getMarkCodes(), scanGoProductModel.getPrice()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object oipsdeybqn(iobyxmoadg iobyxmoadgVar, ScanGoProductModel scanGoProductModel, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.bfopjjpdmp(scanGoProductModel);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f73407iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f73407iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f73409yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f73407iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            sflfametgt();
            ulzqkzuiru(new op1.gxszxtbevo.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                eo1.zoijcleaow zoijcleaowVar = this.f73396ppxfxbqfkf;
                eo1.zoijcleaow.C0679zoijcleaow c0679zoijcleaow = new eo1.zoijcleaow.C0679zoijcleaow(((State) jlmebxxoox()).getArticle(), ((State) jlmebxxoox()).getMarkCodes(), 0.0d);
                wkgbmnqykcVar.f73410zdlpuopuiu = this;
                wkgbmnqykcVar.f73407iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(c0679zoijcleaow, wkgbmnqykcVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) wkgbmnqykcVar.f73410zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((co1.iobyxmoadg) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.uwvvkdfqfp((co1.iobyxmoadg) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new op1.gxszxtbevo.iobyxmoadg(false));
        iobyxmoadgVar.ydmasvzmpa();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wwaezpbzkn sflfametgt() {
        auzgnhcxok auzgnhcxokVar = this.f73395eablkybsjg;
        if (auzgnhcxokVar == null) {
            return null;
        }
        auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(co1.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.eablkybsjg()) {
            if (iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
                crxdokpmqz(op1.eablkybsjg.iobyxmoadg.f73381iobyxmoadg);
                return;
            } else {
                yfnezrywwk(iobyxmoadgVar.wkgbmnqykc());
                return;
            }
        }
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (strPpxfxbqfkf != null) {
            ulzqkzuiru(new op1.gxszxtbevo.ppxfxbqfkf(strPpxfxbqfkf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ydmasvzmpa() {
        sflfametgt();
        this.f73395eablkybsjg = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(null), 3, null);
    }

    private final void yfnezrywwk(List list) {
        ulzqkzuiru(new op1.gxszxtbevo.ppxfxbqfkf(((co1.wkgbmnqykc) list.get(0)).zoijcleaow()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = sj.dxjokdxxww.gxszxtbevo(this.f73397wkgbmnqykc.zoijcleaow(new dxjokdxxww.iobyxmoadg(((State) jlmebxxoox()).getId())), new gxszxtbevo(null)).collect(new lqeggnwhkg(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void czzsidtyhn(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new op1.gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(new op1.eablkybsjg.zoijcleaow(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        sflfametgt();
        super.iobyxmoadg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(op1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(intent, this, null), 3, null);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(op1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }
}
