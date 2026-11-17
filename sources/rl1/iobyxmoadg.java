package rl1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import p0.tzroggbefp;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.rate.rate_bonus_product.impl.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final sm1.iobyxmoadg f83090ppxfxbqfkf;

    /* JADX INFO: renamed from: rl1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1865iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f83091jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f83092yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f83093zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1865iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f83092yggfygwlhe = wkgbmnqykcVar;
            this.f83091jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1865iobyxmoadg(this.f83092yggfygwlhe, this.f83091jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f83093zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f83092yggfygwlhe;
                if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
                    this.f83091jyumaefscl.jztzpxfvev(((wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow) {
                    this.f83091jyumaefscl.xrmfcynszj(((wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                    this.f83091jyumaefscl.metgxyhuhe(((wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg());
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.C1866wkgbmnqykc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iobyxmoadg iobyxmoadgVar = this.f83091jyumaefscl;
                    this.f83093zdlpuopuiu = 1;
                    if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
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
            return ((C1865iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f83094iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f83096yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f83097zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f83096yggfygwlhe = obj;
            this.f83094iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(sm1.iobyxmoadg addReviewUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(addReviewUseCase, "addReviewUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f83090ppxfxbqfkf = addReviewUseCase;
    }

    private final void czzsidtyhn(Throwable th2) {
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jztzpxfvev(String str) {
        crxdokpmqz(new eablkybsjg.iobyxmoadg(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void metgxyhuhe(tzroggbefp tzroggbefpVar) {
        ulzqkzuiru(new gxszxtbevo.zoijcleaow(tzroggbefpVar, ((State) jlmebxxoox()).getStarsQuantity() != 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f83094iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f83094iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f83096yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f83094iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                State state = (State) jlmebxxoox();
                sm1.iobyxmoadg iobyxmoadgVar3 = this.f83090ppxfxbqfkf;
                sm1.iobyxmoadg.C2646iobyxmoadg c2646iobyxmoadg = new sm1.iobyxmoadg.C2646iobyxmoadg(state.getArticle(), state.getStarsQuantity(), state.getReview().draadjrbmk());
                zoijcleaowVar.f83097zdlpuopuiu = this;
                zoijcleaowVar.f83094iwizpuwonk = 1;
                if (iobyxmoadgVar3.zoijcleaow(c2646iobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f83097zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(obj);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.crxdokpmqz(new eablkybsjg.iobyxmoadg(true));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.czzsidtyhn(thDxjokdxxww);
        }
        iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj(int i13) {
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(i13, i13 != 0));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1865iobyxmoadg(intent, this, null), 3, null);
    }
}
