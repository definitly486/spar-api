package z70;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.domain.feature.rateorder.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final j00.lqeggnwhkg f129254ppxfxbqfkf;

    /* JADX INFO: renamed from: z70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C3282iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f129255jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f129256yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f129257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3282iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f129256yggfygwlhe = wkgbmnqykcVar;
            this.f129255jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C3282iobyxmoadg(this.f129256yggfygwlhe, this.f129255jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f129257zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f129256yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f129268iobyxmoadg)) {
                    this.f129255jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f129248iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.C3283wkgbmnqykc) {
                    this.f129255jyumaefscl.ulzqkzuiru(new gxszxtbevo.zoijcleaow(((wkgbmnqykc.C3283wkgbmnqykc) this.f129256yggfygwlhe).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                    iobyxmoadg iobyxmoadgVar = this.f129255jyumaefscl;
                    this.f129257zdlpuopuiu = 1;
                    if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f129255jyumaefscl.czzsidtyhn(((wkgbmnqykc.iobyxmoadg) this.f129256yggfygwlhe).iobyxmoadg());
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
            return ((C3282iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129258iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f129260yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129261zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129260yggfygwlhe = obj;
            this.f129258iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(j00.lqeggnwhkg rateOrderInteractor, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderInteractor, "rateOrderInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f129254ppxfxbqfkf = rateOrderInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void czzsidtyhn(String str) {
        yfnezrywwk(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object rlfsiqarku(lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Object objBtonecajqb;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f129258iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f129258iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f129260yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f129258iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            j00.lqeggnwhkg lqeggnwhkgVar = this.f129254ppxfxbqfkf;
            String id2 = ((State) jlmebxxoox()).getId();
            int currentRating = ((State) jlmebxxoox()).getCurrentRating();
            zoijcleaowVar.f129261zdlpuopuiu = this;
            zoijcleaowVar.f129258iwizpuwonk = 1;
            objBtonecajqb = lqeggnwhkgVar.btonecajqb(id2, currentRating, null, zoijcleaowVar);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f129261zdlpuopuiu;
            zdlpuopuiu.zoijcleaow(obj);
            objBtonecajqb = ((kcexrzcfyt) obj).rgvfuqvkyq();
        }
        if (kcexrzcfyt.agtfadlqog(objBtonecajqb)) {
            iobyxmoadgVar.xrmfcynszj();
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objBtonecajqb);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.uwvvkdfqfp(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uwvvkdfqfp(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(new eablkybsjg.zoijcleaow(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xrmfcynszj() {
        ulzqkzuiru(new gxszxtbevo.iobyxmoadg(false));
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f129250iobyxmoadg);
    }

    private final void yfnezrywwk(String str) {
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(str));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C3282iobyxmoadg(intent, this, null), 3, null);
    }
}
