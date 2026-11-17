package k61;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.domain.feature.rateorder.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bz0.gxszxtbevo f53920ppxfxbqfkf;

    /* JADX INFO: renamed from: k61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1158iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f53921jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f53922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53923zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1158iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53922yggfygwlhe = wkgbmnqykcVar;
            this.f53921jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1158iobyxmoadg(this.f53922yggfygwlhe, this.f53921jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53923zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                wkgbmnqykc wkgbmnqykcVar = this.f53922yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f53934iobyxmoadg)) {
                    this.f53921jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f53914iobyxmoadg);
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.C1159wkgbmnqykc) {
                    this.f53921jyumaefscl.ulzqkzuiru(new gxszxtbevo.zoijcleaow(((wkgbmnqykc.C1159wkgbmnqykc) this.f53922yggfygwlhe).iobyxmoadg()));
                } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                    iobyxmoadg iobyxmoadgVar = this.f53921jyumaefscl;
                    this.f53923zdlpuopuiu = 1;
                    if (iobyxmoadgVar.rlfsiqarku(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (!(wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f53921jyumaefscl.czzsidtyhn(((wkgbmnqykc.iobyxmoadg) this.f53922yggfygwlhe).iobyxmoadg());
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
            return ((C1158iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f53924iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f53926yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f53927zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53926yggfygwlhe = obj;
            this.f53924iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.rlfsiqarku(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(bz0.gxszxtbevo rateOrderInteractor, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(rateOrderInteractor, "rateOrderInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f53920ppxfxbqfkf = rateOrderInteractor;
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
            int i13 = zoijcleaowVar.f53924iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53924iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f53926yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53924iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(obj);
            ulzqkzuiru(new gxszxtbevo.iobyxmoadg(true));
            bz0.gxszxtbevo gxszxtbevoVar2 = this.f53920ppxfxbqfkf;
            String id2 = ((State) jlmebxxoox()).getId();
            int currentRating = ((State) jlmebxxoox()).getCurrentRating();
            zoijcleaowVar.f53927zdlpuopuiu = this;
            zoijcleaowVar.f53924iwizpuwonk = 1;
            objBtonecajqb = gxszxtbevoVar2.btonecajqb(id2, currentRating, null, zoijcleaowVar);
            if (objBtonecajqb == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f53927zdlpuopuiu;
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
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f53916iobyxmoadg);
    }

    private final void yfnezrywwk(String str) {
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(str));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1158iobyxmoadg(intent, this, null), 3, null);
    }
}
