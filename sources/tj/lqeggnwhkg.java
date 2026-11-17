package tj;

import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg extends wkgbmnqykc {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    protected final sj.lqeggnwhkg f110695iwizpuwonk;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f110697yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f110698zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = lqeggnwhkg.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f110697yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f110698zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                sj.nufgyqmvbu nufgyqmvbuVar = (sj.nufgyqmvbu) this.f110697yggfygwlhe;
                lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                this.f110698zdlpuopuiu = 1;
                if (lqeggnwhkgVar.rgvfuqvkyq(nufgyqmvbuVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public lqeggnwhkg(sj.lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(btonecajqbVar, i13, iobyxmoadgVar);
        this.f110695iwizpuwonk = lqeggnwhkgVar;
    }

    static /* synthetic */ Object agtfadlqog(lqeggnwhkg lqeggnwhkgVar, rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objRgvfuqvkyq = lqeggnwhkgVar.rgvfuqvkyq(new esjtqupxsv(zdlpuopuiuVar), gxszxtbevoVar);
        return objRgvfuqvkyq == mg.zoijcleaow.gxszxtbevo() ? objRgvfuqvkyq : wwaezpbzkn.f37140iobyxmoadg;
    }

    private final Object ojitshcjhn(sj.nufgyqmvbu nufgyqmvbuVar, lg.btonecajqb btonecajqbVar, lg.gxszxtbevo gxszxtbevoVar) {
        return eablkybsjg.ppxfxbqfkf(btonecajqbVar, eablkybsjg.wkgbmnqykc(nufgyqmvbuVar, gxszxtbevoVar.getContext()), null, new iobyxmoadg(null), gxszxtbevoVar, 4, null);
    }

    static /* synthetic */ Object wflxmlrfwp(lqeggnwhkg lqeggnwhkgVar, sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (lqeggnwhkgVar.f110703yggfygwlhe == -3) {
            lg.btonecajqb context = gxszxtbevoVar.getContext();
            lg.btonecajqb btonecajqbVarBtonecajqb = pj.wwaezpbzkn.btonecajqb(context, lqeggnwhkgVar.f110704zdlpuopuiu);
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVarBtonecajqb, context)) {
                Object objRgvfuqvkyq = lqeggnwhkgVar.rgvfuqvkyq(nufgyqmvbuVar, gxszxtbevoVar);
                return objRgvfuqvkyq == mg.zoijcleaow.gxszxtbevo() ? objRgvfuqvkyq : wwaezpbzkn.f37140iobyxmoadg;
            }
            lg.lqeggnwhkg.zoijcleaow zoijcleaowVar = lg.lqeggnwhkg.f62508dxjokdxxww;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVarBtonecajqb.get(zoijcleaowVar), context.get(zoijcleaowVar))) {
                Object objOjitshcjhn = lqeggnwhkgVar.ojitshcjhn(nufgyqmvbuVar, btonecajqbVarBtonecajqb, gxszxtbevoVar);
                return objOjitshcjhn == mg.zoijcleaow.gxszxtbevo() ? objOjitshcjhn : wwaezpbzkn.f37140iobyxmoadg;
            }
        }
        Object objCollect = super.collect(nufgyqmvbuVar, gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // tj.wkgbmnqykc, sj.lqeggnwhkg
    public Object collect(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        return wflxmlrfwp(this, nufgyqmvbuVar, gxszxtbevoVar);
    }

    @Override // tj.wkgbmnqykc
    protected Object eablkybsjg(rj.zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
        return agtfadlqog(this, zdlpuopuiuVar, gxszxtbevoVar);
    }

    protected abstract Object rgvfuqvkyq(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar);

    @Override // tj.wkgbmnqykc
    public String toString() {
        return this.f110695iwizpuwonk + " -> " + super.toString();
    }
}
