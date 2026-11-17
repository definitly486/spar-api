package u32;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import i22.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.scango.impl.screens.weightproduct.partial.domain.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final C2781iobyxmoadg f112576gxszxtbevo = new C2781iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f112577lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f112578eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ns.iobyxmoadg f112579ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final i22.zoijcleaow f112580wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112582yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112583zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f112583zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.sflfametgt((Throwable) this.f112582yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            eablkybsjg eablkybsjgVar = iobyxmoadg.this.new eablkybsjg(gxszxtbevoVar);
            eablkybsjgVar.f112582yggfygwlhe = th2;
            return eablkybsjgVar.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class gxszxtbevo implements nufgyqmvbu, agtfadlqog {
        gxszxtbevo() {
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
            Object objYdmasvzmpa = iobyxmoadg.ydmasvzmpa(iobyxmoadg.this, scanGoProductModel, gxszxtbevoVar);
            return objYdmasvzmpa == mg.zoijcleaow.gxszxtbevo() ? objYdmasvzmpa : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, iobyxmoadg.this, iobyxmoadg.class, "handleSubscribeToProduct", "handleSubscribeToProduct(Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;)V", 4);
        }
    }

    /* JADX INFO: renamed from: u32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2781iobyxmoadg {
        public /* synthetic */ C2781iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2781iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112585jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ u32.ppxfxbqfkf f112586yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112587zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(u32.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112586yggfygwlhe = ppxfxbqfkfVar;
            this.f112585jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f112586yggfygwlhe, this.f112585jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112587zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!(this.f112586yggfygwlhe instanceof u32.ppxfxbqfkf.iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f112585jyumaefscl;
                int productId = iobyxmoadg.jztzpxfvev(iobyxmoadgVar).getProductId();
                this.f112587zdlpuopuiu = 1;
                if (iobyxmoadgVar.yfnezrywwk(productId, this) == objGxszxtbevo) {
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

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112588jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ u32.wkgbmnqykc f112589yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112590zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(u32.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112589yggfygwlhe = wkgbmnqykcVar;
            this.f112588jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f112589yggfygwlhe, this.f112588jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112590zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u32.wkgbmnqykc wkgbmnqykcVar = this.f112589yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u32.wkgbmnqykc.zoijcleaow.f112599iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f112588jyumaefscl;
                    String article = iobyxmoadg.jztzpxfvev(iobyxmoadgVar).getProduct().getArticle();
                    this.f112590zdlpuopuiu = 1;
                    if (iobyxmoadgVar.xrmfcynszj(article, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u32.wkgbmnqykc.iobyxmoadg.f112598iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f112588jyumaefscl.crxdokpmqz(u32.eablkybsjg.iobyxmoadg.f112570iobyxmoadg);
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112591iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112593yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112594zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112593yggfygwlhe = obj;
            this.f112591iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider, i22.zoijcleaow changeProductQuantityByArticleUseCase, dxjokdxxww subscribeToProductUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityByArticleUseCase, "changeProductQuantityByArticleUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToProductUseCase, "subscribeToProductUseCase");
        this.f112579ppxfxbqfkf = dispatchersProvider;
        this.f112580wkgbmnqykc = changeProductQuantityByArticleUseCase;
        this.f112578eablkybsjg = subscribeToProductUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(g22.iobyxmoadg iobyxmoadgVar) {
        ulzqkzuiru(new u32.gxszxtbevo.zoijcleaow(false));
        if (iobyxmoadgVar.eablkybsjg()) {
            if (iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
                crxdokpmqz(u32.eablkybsjg.zoijcleaow.f112572iobyxmoadg);
                return;
            } else {
                ulzqkzuiru(new u32.gxszxtbevo.ppxfxbqfkf(((g22.wkgbmnqykc) jyumaefscl.opjhrmiecq(iobyxmoadgVar.wkgbmnqykc())).zoijcleaow()));
                return;
            }
        }
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        if (strPpxfxbqfkf != null) {
            ulzqkzuiru(new u32.gxszxtbevo.ppxfxbqfkf(strPpxfxbqfkf));
        }
    }

    public static final /* synthetic */ State jztzpxfvev(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    private final void uwvvkdfqfp(ScanGoProductModel scanGoProductModel) {
        ulzqkzuiru(new u32.gxszxtbevo.iobyxmoadg(scanGoProductModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112591iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112591iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f112593yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f112591iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new u32.gxszxtbevo.zoijcleaow(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                i22.zoijcleaow zoijcleaowVar2 = this.f112580wkgbmnqykc;
                i22.zoijcleaow.C0983zoijcleaow c0983zoijcleaow = new i22.zoijcleaow.C0983zoijcleaow(str, jyumaefscl.wflxmlrfwp(), 0.0d);
                zoijcleaowVar.f112594zdlpuopuiu = this;
                zoijcleaowVar.f112591iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar2.zoijcleaow(c0983zoijcleaow, zoijcleaowVar);
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
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f112594zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((g22.iobyxmoadg) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.czzsidtyhn((g22.iobyxmoadg) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.sflfametgt(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ydmasvzmpa(iobyxmoadg iobyxmoadgVar, ScanGoProductModel scanGoProductModel, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.uwvvkdfqfp(scanGoProductModel);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object yfnezrywwk(int i13, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = sj.dxjokdxxww.gxszxtbevo(this.f112578eablkybsjg.zoijcleaow(new dxjokdxxww.iobyxmoadg(i13)), new eablkybsjg(null)).collect(new gxszxtbevo(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(u32.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(u32.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, this, null), 3, null);
    }

    public final void sflfametgt(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new u32.gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new u32.eablkybsjg.ppxfxbqfkf(error));
    }
}
