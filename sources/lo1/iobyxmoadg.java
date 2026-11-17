package lo1;

import com.google.android.gms.location.DeviceOrientationRequest;
import eo1.dxjokdxxww;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.crxdokpmqz;
import ru.myspar.proloyalty.scango.impl.component.domain.model.ScanExciseStickerDialogArgs;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.dialog.domain.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final C1307iobyxmoadg f63720lqeggnwhkg = new C1307iobyxmoadg(null);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final int f63721nufgyqmvbu = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final eo1.zoijcleaow f63722eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private auzgnhcxok f63723gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final mo1.iobyxmoadg f63724ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f63725wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f63726jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f63728zdlpuopuiu;

        /* JADX INFO: renamed from: lo1.iobyxmoadg$eablkybsjg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1306iobyxmoadg extends draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f63729jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f63730yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f63731zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1306iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f63729jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f63731zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f63729jyumaefscl.weqkydbzbr((Throwable) this.f63730yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                C1306iobyxmoadg c1306iobyxmoadg = new C1306iobyxmoadg(this.f63729jyumaefscl, gxszxtbevoVar);
                c1306iobyxmoadg.f63730yggfygwlhe = th2;
                return c1306iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow implements nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f63732zdlpuopuiu;

            zoijcleaow(iobyxmoadg iobyxmoadgVar) {
                this.f63732zdlpuopuiu = iobyxmoadgVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(ScanGoProductModel scanGoProductModel, lg.gxszxtbevo gxszxtbevoVar) {
                this.f63732zdlpuopuiu.ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(scanGoProductModel));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f63726jyumaefscl = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f63726jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f63728zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(iobyxmoadg.this.f63725wkgbmnqykc.zoijcleaow(new dxjokdxxww.iobyxmoadg(this.f63726jyumaefscl)), new C1306iobyxmoadg(iobyxmoadg.this, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadg.this);
                this.f63728zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: lo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1307iobyxmoadg {
        public /* synthetic */ C1307iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1307iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ boolean f63733cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ State f63734iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ double f63735jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f63737zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(double d13, State state, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f63735jyumaefscl = d13;
            this.f63734iwizpuwonk = state;
            this.f63733cqumvgiudr = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f63735jyumaefscl, this.f63734iwizpuwonk, this.f63733cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f63737zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    iobyxmoadg.this.nuxfzjnpeb();
                    iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(true));
                    double d13 = this.f63735jyumaefscl;
                    boolean z13 = d13 == 0.0d;
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    State state = this.f63734iwizpuwonk;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    eo1.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f63722eablkybsjg;
                    eo1.zoijcleaow.C0679zoijcleaow c0679zoijcleaow = new eo1.zoijcleaow.C0679zoijcleaow(state.getProduct().getArticle(), z13 ? state.getProduct().getMarkCodes() : jyumaefscl.wflxmlrfwp(), d13);
                    this.f63737zdlpuopuiu = 1;
                    obj = zoijcleaowVar.zoijcleaow(c0679zoijcleaow, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((co1.iobyxmoadg) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar4 = iobyxmoadg.this;
            double d14 = this.f63735jyumaefscl;
            boolean z14 = this.f63733cqumvgiudr;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar4.zfvoamnweg((co1.iobyxmoadg) objWkgbmnqykc, d14, z14);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar4.weqkydbzbr(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
            iobyxmoadg.this.zeieaojujs();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f63739zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f63739zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                this.f63739zdlpuopuiu = 1;
                if (crxdokpmqz.zoijcleaow(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadg.this.crxdokpmqz(lo1.eablkybsjg.iobyxmoadg.f63712iobyxmoadg);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f63740iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f63741zoijcleaow;

        static {
            int[] iArr = new int[bo1.iobyxmoadg.values().length];
            try {
                iArr[bo1.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f63740iobyxmoadg = iArr;
            int[] iArr2 = new int[bo1.zoijcleaow.values().length];
            try {
                iArr2[bo1.zoijcleaow.MARK_PIECE_IS_EMPTY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bo1.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f63741zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(mo1.iobyxmoadg checkScanGoAmountMessageShowedUseCase, dxjokdxxww subscribeToProductUseCase, eo1.zoijcleaow changeProductQuantityByArticleUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(checkScanGoAmountMessageShowedUseCase, "checkScanGoAmountMessageShowedUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToProductUseCase, "subscribeToProductUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityByArticleUseCase, "changeProductQuantityByArticleUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f63724ppxfxbqfkf = checkScanGoAmountMessageShowedUseCase;
        this.f63725wkgbmnqykc = subscribeToProductUseCase;
        this.f63722eablkybsjg = changeProductQuantityByArticleUseCase;
    }

    private final void bfopjjpdmp(State state) {
        double quantity;
        int i13 = zoijcleaow.f63740iobyxmoadg[state.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            quantity = state.getProduct().getQuantity() + 1.0d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            quantity = state.getProduct().getQuantity() - 1.0d;
        }
        crxdokpmqz(new lo1.eablkybsjg.C1305eablkybsjg(new ScanGoScanMatrixPayload(state.getProduct().getArticle(), quantity, state.getScanGoAmountMode(), null, 8, null)));
    }

    private final void czzsidtyhn(double d13, State state, boolean z13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new ppxfxbqfkf(d13, state, z13, null), 3, null);
    }

    private final void iyctptxqzt(State state) {
        rlfsiqarku(this, null, 1, null);
        uwvvkdfqfp(this, state.getProduct().getQuantity() + 1.0d, state, false, 4, null);
    }

    private final void lrnfpwlwnk(List list, boolean z13) {
        co1.wkgbmnqykc wkgbmnqykcVar = (co1.wkgbmnqykc) list.get(0);
        int i13 = zoijcleaow.f63741zoijcleaow[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 != 1 && i13 != 2) {
            crxdokpmqz(new lo1.eablkybsjg.wkgbmnqykc(wkgbmnqykcVar.zoijcleaow()));
        } else {
            nuxfzjnpeb();
            crxdokpmqz(new lo1.eablkybsjg.ppxfxbqfkf(new ScanExciseStickerDialogArgs(z13, false, ((State) jlmebxxoox()).getProduct(), ((State) jlmebxxoox()).getScanGoAmountMode(), 2, null)));
        }
    }

    private final void metgxyhuhe(bo1.iobyxmoadg iobyxmoadgVar) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(iobyxmoadgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wwaezpbzkn nuxfzjnpeb() {
        auzgnhcxok auzgnhcxokVar = this.f63723gxszxtbevo;
        if (auzgnhcxokVar == null) {
            return null;
        }
        auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void oipsdeybqn(int i13) {
        tbqsvytpvh(i13);
        yfnezrywwk();
    }

    private final void opjhrmiecq(State state) {
        metgxyhuhe(bo1.iobyxmoadg.DECREASE);
        czzsidtyhn(state.getProduct().getQuantity() - 1.0d, state, true);
    }

    static /* synthetic */ void rlfsiqarku(iobyxmoadg iobyxmoadgVar, bo1.iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iobyxmoadgVar2 = bo1.iobyxmoadg.INCREASE;
        }
        iobyxmoadgVar.metgxyhuhe(iobyxmoadgVar2);
    }

    private final void tbqsvytpvh(int i13) {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(i13, null), 3, null);
    }

    static /* synthetic */ void uwvvkdfqfp(iobyxmoadg iobyxmoadgVar, double d13, State state, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.czzsidtyhn(d13, state, z13);
    }

    private final void yfnezrywwk() {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(!((Boolean) this.f63724ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zeieaojujs() {
        nuxfzjnpeb();
        this.f63723gxszxtbevo = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(co1.iobyxmoadg iobyxmoadgVar, double d13, boolean z13) {
        if (!iobyxmoadgVar.eablkybsjg()) {
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (strPpxfxbqfkf != null) {
                crxdokpmqz(new lo1.eablkybsjg.wkgbmnqykc(strPpxfxbqfkf));
                return;
            }
            return;
        }
        if (!iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
            lrnfpwlwnk(iobyxmoadgVar.wkgbmnqykc(), z13);
        } else if (d13 == 0.0d) {
            crxdokpmqz(lo1.eablkybsjg.iobyxmoadg.f63712iobyxmoadg);
        }
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    public void iobyxmoadg() {
        nuxfzjnpeb();
        super.iobyxmoadg();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(lo1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lo1.wkgbmnqykc.iobyxmoadg.f63746iobyxmoadg)) {
            bfopjjpdmp((State) jlmebxxoox());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lo1.wkgbmnqykc.zoijcleaow.f63749iobyxmoadg)) {
            rlfsiqarku(this, null, 1, null);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lo1.wkgbmnqykc.ppxfxbqfkf.f63747iobyxmoadg)) {
            opjhrmiecq((State) jlmebxxoox());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, lo1.wkgbmnqykc.C1308wkgbmnqykc.f63748iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            iyctptxqzt((State) jlmebxxoox());
        }
    }

    public final void weqkydbzbr(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(false));
        crxdokpmqz(new lo1.eablkybsjg.zoijcleaow(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(lo1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, lo1.ppxfxbqfkf.iobyxmoadg.f63744iobyxmoadg)) {
            oipsdeybqn(((State) jlmebxxoox()).getProductId());
        } else {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, lo1.ppxfxbqfkf.zoijcleaow.f63745iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            zeieaojujs();
        }
    }
}
