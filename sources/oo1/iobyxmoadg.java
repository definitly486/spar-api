package oo1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import eo1.dxjokdxxww;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.domain.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final C1600iobyxmoadg f73316eablkybsjg = new C1600iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eo1.zoijcleaow f73317ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final dxjokdxxww f73318wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f73319jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ oo1.wkgbmnqykc f73320yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73321zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(oo1.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73320yggfygwlhe = wkgbmnqykcVar;
            this.f73319jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f73320yggfygwlhe, this.f73319jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73321zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                oo1.wkgbmnqykc wkgbmnqykcVar = this.f73320yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, oo1.wkgbmnqykc.iobyxmoadg.f73341iobyxmoadg)) {
                    this.f73319jyumaefscl.weqkydbzbr();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, oo1.wkgbmnqykc.zoijcleaow.f73344iobyxmoadg)) {
                    iobyxmoadg.yfnezrywwk(this.f73319jyumaefscl, null, 1, null);
                    this.f73319jyumaefscl.ulzqkzuiru(new oo1.gxszxtbevo.iobyxmoadg(true));
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, oo1.wkgbmnqykc.ppxfxbqfkf.f73342iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar = this.f73319jyumaefscl;
                    this.f73321zdlpuopuiu = 1;
                    if (iobyxmoadgVar.lrnfpwlwnk(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, oo1.wkgbmnqykc.C1601wkgbmnqykc.f73343iobyxmoadg)) {
                    iobyxmoadg iobyxmoadgVar2 = this.f73319jyumaefscl;
                    this.f73321zdlpuopuiu = 2;
                    if (iobyxmoadgVar2.zeieaojujs(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof oo1.wkgbmnqykc.eablkybsjg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f73319jyumaefscl.crxdokpmqz(new oo1.eablkybsjg.wkgbmnqykc(((oo1.wkgbmnqykc.eablkybsjg) this.f73320yggfygwlhe).iobyxmoadg()));
                }
            } else {
                if (i13 != 1 && i13 != 2) {
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

    static final class gxszxtbevo extends draadjrbmk implements vdvldrhtss {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f73323yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73324zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f73324zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            iobyxmoadg.this.tbqsvytpvh((Throwable) this.f73323yggfygwlhe);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
            gxszxtbevo gxszxtbevoVar2 = iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
            gxszxtbevoVar2.f73323yggfygwlhe = th2;
            return gxszxtbevoVar2.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: oo1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1600iobyxmoadg {
        public /* synthetic */ C1600iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1600iobyxmoadg() {
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
            Object objIyctptxqzt = iobyxmoadg.iyctptxqzt(iobyxmoadg.this, scanGoProductModel, gxszxtbevoVar);
            return objIyctptxqzt == mg.zoijcleaow.gxszxtbevo() ? objIyctptxqzt : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, iobyxmoadg.this, iobyxmoadg.class, "updateState", "updateState(Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoProductModel;)V", 4);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f73327esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f73328iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f73329jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        double f73330yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f73331zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f73328iwizpuwonk = obj;
            this.f73327esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ydmasvzmpa(0.0d, false, this);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f73332jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ oo1.ppxfxbqfkf f73333yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73334zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(oo1.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73333yggfygwlhe = ppxfxbqfkfVar;
            this.f73332jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f73333yggfygwlhe, this.f73332jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f73334zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f73333yggfygwlhe, oo1.ppxfxbqfkf.iobyxmoadg.f73339iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f73332jyumaefscl;
                this.f73334zdlpuopuiu = 1;
                if (iobyxmoadgVar.opjhrmiecq(this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f73335iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f73336zoijcleaow;

        static {
            int[] iArr = new int[bo1.zoijcleaow.values().length];
            try {
                iArr[bo1.zoijcleaow.MARK_PIECE_IS_EMPTY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.zoijcleaow.MARK_WEIGHT_IS_EMPTY_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f73335iobyxmoadg = iArr;
            int[] iArr2 = new int[bo1.iobyxmoadg.values().length];
            try {
                iArr2[bo1.iobyxmoadg.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bo1.iobyxmoadg.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f73336zoijcleaow = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(eo1.zoijcleaow changeProductQuantityByArticleUseCase, dxjokdxxww subscribeToProductUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(changeProductQuantityByArticleUseCase, "changeProductQuantityByArticleUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToProductUseCase, "subscribeToProductUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f73317ppxfxbqfkf = changeProductQuantityByArticleUseCase;
        this.f73318wkgbmnqykc = subscribeToProductUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp(co1.iobyxmoadg iobyxmoadgVar, double d13, boolean z13) {
        if (!iobyxmoadgVar.eablkybsjg()) {
            String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            if (strPpxfxbqfkf != null) {
                ulzqkzuiru(new oo1.gxszxtbevo.eablkybsjg(strPpxfxbqfkf));
            }
        } else if (!iobyxmoadgVar.wkgbmnqykc().isEmpty()) {
            roivzttewh(iobyxmoadgVar.wkgbmnqykc(), z13);
        } else if (d13 == 0.0d) {
            crxdokpmqz(oo1.eablkybsjg.iobyxmoadg.f73305iobyxmoadg);
        }
        ulzqkzuiru(new oo1.gxszxtbevo.iobyxmoadg(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object iyctptxqzt(iobyxmoadg iobyxmoadgVar, ScanGoProductModel scanGoProductModel, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadgVar.uawqvzlxes(scanGoProductModel);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lrnfpwlwnk(lg.gxszxtbevo gxszxtbevoVar) {
        State state = (State) jlmebxxoox();
        if (!state.getAllowChangeQuantityAction()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ulzqkzuiru(new oo1.gxszxtbevo.iobyxmoadg(false));
        uwvvkdfqfp(bo1.iobyxmoadg.DECREASE);
        Object objYdmasvzmpa = ydmasvzmpa(state.getQuantity() - 1.0d, true, gxszxtbevoVar);
        return objYdmasvzmpa == mg.zoijcleaow.gxszxtbevo() ? objYdmasvzmpa : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nuxfzjnpeb(Throwable th2) {
        tbqsvytpvh(th2);
        ulzqkzuiru(new oo1.gxszxtbevo.iobyxmoadg(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object opjhrmiecq(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = sj.dxjokdxxww.gxszxtbevo(this.f73318wkgbmnqykc.zoijcleaow(new dxjokdxxww.iobyxmoadg(((State) jlmebxxoox()).getId())), new gxszxtbevo(null)).collect(new lqeggnwhkg(), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void roivzttewh(List list, boolean z13) {
        co1.wkgbmnqykc wkgbmnqykcVar = (co1.wkgbmnqykc) list.get(0);
        int i13 = zoijcleaow.f73335iobyxmoadg[wkgbmnqykcVar.iobyxmoadg().ordinal()];
        if (i13 == 1 || i13 == 2) {
            crxdokpmqz(new oo1.eablkybsjg.C1599eablkybsjg(z13));
        } else {
            ulzqkzuiru(new oo1.gxszxtbevo.eablkybsjg(wkgbmnqykcVar.zoijcleaow()));
        }
    }

    static /* synthetic */ Object sflfametgt(iobyxmoadg iobyxmoadgVar, double d13, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        return iobyxmoadgVar.ydmasvzmpa(d13, z13, gxszxtbevoVar);
    }

    private final void uawqvzlxes(ScanGoProductModel scanGoProductModel) {
        State state = (State) jlmebxxoox();
        ulzqkzuiru(new oo1.gxszxtbevo.zoijcleaow(state.zoijcleaow((2047 & 1) != 0 ? state.article : scanGoProductModel.getArticle(), (2047 & 2) != 0 ? state.id : scanGoProductModel.getId(), (2047 & 4) != 0 ? state.measure : scanGoProductModel.getMeasure(), (2047 & 8) != 0 ? state.name : scanGoProductModel.getName(), (2047 & 16) != 0 ? state.pictureUrl : scanGoProductModel.getPictureUrl(), (2047 & 32) != 0 ? state.price : scanGoProductModel.getPrice(), (2047 & 64) != 0 ? state.quantity : scanGoProductModel.getQuantity(), (2047 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? state.markCodes : scanGoProductModel.getMarkCodes(), (2047 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? state.warningMessage : null, (2047 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? state.scanGoAmountMode : null, (2047 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? state.allowChangeQuantityAction : false, (2047 & 2048) != 0 ? state.isLoading : false)));
    }

    private final void uwvvkdfqfp(bo1.iobyxmoadg iobyxmoadgVar) {
        ulzqkzuiru(new oo1.gxszxtbevo.wkgbmnqykc(iobyxmoadgVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr() {
        double quantity;
        State state = (State) jlmebxxoox();
        int i13 = zoijcleaow.f73336zoijcleaow[state.getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            quantity = state.getQuantity() + 1.0d;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            quantity = state.getQuantity() - 1.0d;
        }
        crxdokpmqz(new oo1.eablkybsjg.zoijcleaow(state.getArticle(), quantity, state.getScanGoAmountMode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ydmasvzmpa(double d13, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f73327esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f73327esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f73328iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f73327esjtqupxsv;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new oo1.gxszxtbevo.ppxfxbqfkf(true));
            State state = (State) jlmebxxoox();
            boolean z14 = d13 == 0.0d;
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                eo1.zoijcleaow zoijcleaowVar = this.f73317ppxfxbqfkf;
                eo1.zoijcleaow.C0679zoijcleaow c0679zoijcleaow = new eo1.zoijcleaow.C0679zoijcleaow(state.getArticle(), z14 ? state.getMarkCodes() : jyumaefscl.wflxmlrfwp(), d13);
                ppxfxbqfkfVar.f73331zdlpuopuiu = this;
                ppxfxbqfkfVar.f73330yggfygwlhe = d13;
                ppxfxbqfkfVar.f73329jyumaefscl = z13;
                ppxfxbqfkfVar.f73327esjtqupxsv = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(c0679zoijcleaow, ppxfxbqfkfVar);
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
            z13 = ppxfxbqfkfVar.f73329jyumaefscl;
            d13 = ppxfxbqfkfVar.f73330yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f73331zdlpuopuiu;
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
            iobyxmoadgVar.bfopjjpdmp((co1.iobyxmoadg) objWkgbmnqykc, d13, z13);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.nuxfzjnpeb(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new oo1.gxszxtbevo.ppxfxbqfkf(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    static /* synthetic */ void yfnezrywwk(iobyxmoadg iobyxmoadgVar, bo1.iobyxmoadg iobyxmoadgVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iobyxmoadgVar2 = bo1.iobyxmoadg.INCREASE;
        }
        iobyxmoadgVar.uwvvkdfqfp(iobyxmoadgVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zeieaojujs(lg.gxszxtbevo gxszxtbevoVar) {
        State state = (State) jlmebxxoox();
        if (!state.getAllowChangeQuantityAction()) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        ulzqkzuiru(new oo1.gxszxtbevo.iobyxmoadg(false));
        yfnezrywwk(this, null, 1, null);
        Object objSflfametgt = sflfametgt(this, state.getQuantity() + 1.0d, false, gxszxtbevoVar, 2, null);
        return objSflfametgt == mg.zoijcleaow.gxszxtbevo() ? objSflfametgt : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(oo1.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(intent, this, null), 3, null);
    }

    public final void tbqsvytpvh(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new oo1.gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new oo1.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: zfvoamnweg, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(oo1.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(action, this, null), 3, null);
    }
}
