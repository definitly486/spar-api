package tj;

import gg.wwaezpbzkn;
import java.util.Iterator;
import pj.cllcsxoeiz;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Iterable f110580iwizpuwonk;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ esjtqupxsv f110581jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f110582yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110583zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(sj.lqeggnwhkg lqeggnwhkgVar, esjtqupxsv esjtqupxsvVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f110582yggfygwlhe = lqeggnwhkgVar;
            this.f110581jyumaefscl = esjtqupxsvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f110582yggfygwlhe, this.f110581jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110583zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVar = this.f110582yggfygwlhe;
                esjtqupxsv esjtqupxsvVar = this.f110581jyumaefscl;
                this.f110583zdlpuopuiu = 1;
                if (lqeggnwhkgVar.collect(esjtqupxsvVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ btonecajqb(Iterable iterable, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iterable, (i14 & 2) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 4) != 0 ? -2 : i13, (i14 & 8) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    public rj.jyumaefscl draadjrbmk(cllcsxoeiz cllcsxoeizVar) {
        return rj.oxmwwwfdhm.ppxfxbqfkf(cllcsxoeizVar, this.f110704zdlpuopuiu, this.f110703yggfygwlhe, dxjokdxxww());
    }

    @Override // tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar = new esjtqupxsv(zdlpuopuiuVar);
        Iterator it = this.f110580iwizpuwonk.iterator();
        while (it.hasNext()) {
            pj.gtknphoqwx.wkgbmnqykc(zdlpuopuiuVar, null, null, new iobyxmoadg((sj.lqeggnwhkg) it.next(), esjtqupxsvVar, null), 3, null);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc
    protected wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new btonecajqb(this.f110580iwizpuwonk, btonecajqbVar, i13, iobyxmoadgVar);
    }

    public btonecajqb(Iterable iterable, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, i13, iobyxmoadgVar);
        this.f110580iwizpuwonk = iterable;
    }
}
