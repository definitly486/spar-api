package rj;

import gg.wwaezpbzkn;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f82916iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f82917jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f82918yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f82919zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f82917jyumaefscl = obj;
            this.f82916iwizpuwonk |= Integer.MIN_VALUE;
            return oxmwwwfdhm.iobyxmoadg(null, null, this);
        }
    }

    static final class zoijcleaow implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ pj.agtfadlqog f82920zdlpuopuiu;

        zoijcleaow(pj.agtfadlqog agtfadlqogVar) {
            this.f82920zdlpuopuiu = agtfadlqogVar;
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            pj.agtfadlqog agtfadlqogVar = this.f82920zdlpuopuiu;
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            agtfadlqogVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg));
        }
    }

    public static /* synthetic */ jyumaefscl eablkybsjg(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return ppxfxbqfkf(cllcsxoeizVar, btonecajqbVar, i13, rgvfuqvkyqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar2 = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar2.f82916iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar2.f82916iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar2 = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar2.f82917jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f82916iwizpuwonk;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                if (iobyxmoadgVar2.getContext().get(auzgnhcxok.f76671gtknphoqwx) != zdlpuopuiuVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                iobyxmoadgVar2.f82919zdlpuopuiu = zdlpuopuiuVar;
                iobyxmoadgVar2.f82918yggfygwlhe = iobyxmoadgVar;
                iobyxmoadgVar2.f82916iwizpuwonk = 1;
                pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(iobyxmoadgVar2), 1);
                rgvfuqvkyqVar.lereixgezr();
                zdlpuopuiuVar.zoijcleaow(new zoijcleaow(rgvfuqvkyqVar));
                Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(iobyxmoadgVar2);
                }
                if (objZdlpuopuiu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (tg.iobyxmoadg) iobyxmoadgVar2.f82918yggfygwlhe;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            iobyxmoadgVar.invoke();
            return wwaezpbzkn.f37140iobyxmoadg;
        } catch (Throwable th2) {
            iobyxmoadgVar.invoke();
            throw th2;
        }
    }

    public static final jyumaefscl ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, int i13, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return zoijcleaow(cllcsxoeizVar, btonecajqbVar, i13, rj.iobyxmoadg.SUSPEND, wypolnanlu.DEFAULT, null, rgvfuqvkyqVar);
    }

    public static /* synthetic */ jyumaefscl wkgbmnqykc(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, wypolnanlu wypolnanluVar, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        lg.btonecajqb btonecajqbVar2 = btonecajqbVar;
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            iobyxmoadgVar = rj.iobyxmoadg.SUSPEND;
        }
        rj.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if ((i14 & 8) != 0) {
            wypolnanluVar = wypolnanlu.DEFAULT;
        }
        wypolnanlu wypolnanluVar2 = wypolnanluVar;
        if ((i14 & 16) != 0) {
            draadjrbmkVar = null;
        }
        return zoijcleaow(cllcsxoeizVar, btonecajqbVar2, i15, iobyxmoadgVar2, wypolnanluVar2, draadjrbmkVar, rgvfuqvkyqVar);
    }

    public static final jyumaefscl zoijcleaow(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, wypolnanlu wypolnanluVar, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(pj.wwaezpbzkn.gtknphoqwx(cllcsxoeizVar, btonecajqbVar), btonecajqb.zoijcleaow(i13, iobyxmoadgVar, null, 4, null));
        if (draadjrbmkVar != null) {
            kcexrzcfytVar.pmvmpeiblj(draadjrbmkVar);
        }
        kcexrzcfytVar.a(wypolnanluVar, kcexrzcfytVar, rgvfuqvkyqVar);
        return kcexrzcfytVar;
    }
}
