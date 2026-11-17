package i61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import pj.cllcsxoeiz;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.domain.feature.promotiononboarding.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h11.zoijcleaow f42023ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final C0987iobyxmoadg f42022wkgbmnqykc = new C0987iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f42021eablkybsjg = 8;

    /* JADX INFO: renamed from: i61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0987iobyxmoadg {
        public /* synthetic */ C0987iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0987iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f42024iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f42026yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f42027zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42026yggfygwlhe = obj;
            this.f42024iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.xrmfcynszj(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f42028jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ i61.ppxfxbqfkf f42029yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f42030zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(i61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f42029yggfygwlhe = ppxfxbqfkfVar;
            this.f42028jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f42029yggfygwlhe, this.f42028jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f42030zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42029yggfygwlhe, i61.ppxfxbqfkf.iobyxmoadg.f42033iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f42028jyumaefscl;
                this.f42030zdlpuopuiu = 1;
                if (iobyxmoadgVar.xrmfcynszj(this) == objGxszxtbevo) {
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
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider, h11.zoijcleaow getPromoUseCase) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        this.f42023ppxfxbqfkf = getPromoUseCase;
    }

    private final void czzsidtyhn() {
        crxdokpmqz(eablkybsjg.zoijcleaow.f42017iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jztzpxfvev(Promotion promotion) {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(promotion));
    }

    private final boolean metgxyhuhe(int i13) {
        return i13 == ((State) jlmebxxoox()).getItems().size() - 1;
    }

    private final void rlfsiqarku(int i13) {
        if (i13 == 0) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f42015iobyxmoadg);
        } else {
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(i13 - 1));
        }
    }

    private final void uwvvkdfqfp(int i13) {
        if (metgxyhuhe(i13)) {
            crxdokpmqz(eablkybsjg.zoijcleaow.f42017iobyxmoadg);
        } else {
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(i13 + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object xrmfcynszj(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f42024iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f42024iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f42026yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f42024iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                h11.zoijcleaow zoijcleaowVar = this.f42023ppxfxbqfkf;
                h11.zoijcleaow.iobyxmoadg iobyxmoadgVar3 = new h11.zoijcleaow.iobyxmoadg(true, null, 2, null);
                ppxfxbqfkfVar.f42027zdlpuopuiu = this;
                ppxfxbqfkfVar.f42024iwizpuwonk = 1;
                objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar3, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f42027zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((Promotion) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.jztzpxfvev((Promotion) objWkgbmnqykc);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.yfnezrywwk(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yfnezrywwk(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(i61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof wkgbmnqykc.iobyxmoadg) {
            rlfsiqarku(((wkgbmnqykc.iobyxmoadg) intent).iobyxmoadg());
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f42036iobyxmoadg)) {
            czzsidtyhn();
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            uwvvkdfqfp(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg());
        }
    }
}
