package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public final class lxfrhoxuzk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final metgxyhuhe.btonecajqb f73791iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f73794zoijcleaow = 1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f73792ppxfxbqfkf = 2;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f73793wkgbmnqykc = 4;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final androidx.compose.runtime.uawqvzlxes f73790eablkybsjg = androidx.compose.runtime.j0.iobyxmoadg(0);

    static final class iobyxmoadg implements sj.nufgyqmvbu {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ lxfrhoxuzk f73795yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.collection.jpowsppfya f73796zdlpuopuiu;

        iobyxmoadg(androidx.collection.jpowsppfya jpowsppfyaVar, lxfrhoxuzk lxfrhoxuzkVar) {
            this.f73796zdlpuopuiu = jpowsppfyaVar;
            this.f73795yggfygwlhe = lxfrhoxuzkVar;
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Object emit(metgxyhuhe.dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
            int i13;
            if ((dxjokdxxwwVar instanceof metgxyhuhe.lqeggnwhkg) || (dxjokdxxwwVar instanceof metgxyhuhe.wkgbmnqykc) || (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.zoijcleaow)) {
                this.f73796zdlpuopuiu.agtfadlqog(dxjokdxxwwVar);
            } else if (dxjokdxxwwVar instanceof metgxyhuhe.nufgyqmvbu) {
                this.f73796zdlpuopuiu.lereixgezr(((metgxyhuhe.nufgyqmvbu) dxjokdxxwwVar).iobyxmoadg());
            } else if (dxjokdxxwwVar instanceof metgxyhuhe.eablkybsjg) {
                this.f73796zdlpuopuiu.lereixgezr(((metgxyhuhe.eablkybsjg) dxjokdxxwwVar).iobyxmoadg());
            } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.ppxfxbqfkf) {
                this.f73796zdlpuopuiu.lereixgezr(((metgxyhuhe.agtfadlqog.ppxfxbqfkf) dxjokdxxwwVar).iobyxmoadg());
            } else if (dxjokdxxwwVar instanceof metgxyhuhe.agtfadlqog.iobyxmoadg) {
                this.f73796zdlpuopuiu.lereixgezr(((metgxyhuhe.agtfadlqog.iobyxmoadg) dxjokdxxwwVar).iobyxmoadg());
            }
            androidx.collection.jpowsppfya jpowsppfyaVar = this.f73796zdlpuopuiu;
            lxfrhoxuzk lxfrhoxuzkVar = this.f73795yggfygwlhe;
            Object[] objArr = jpowsppfyaVar.f4343iobyxmoadg;
            int i14 = jpowsppfyaVar.f4344zoijcleaow;
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                metgxyhuhe.dxjokdxxww dxjokdxxwwVar2 = (metgxyhuhe.dxjokdxxww) objArr[i16];
                if (dxjokdxxwwVar2 instanceof metgxyhuhe.lqeggnwhkg) {
                    i13 = lxfrhoxuzkVar.f73792ppxfxbqfkf;
                } else if (dxjokdxxwwVar2 instanceof metgxyhuhe.wkgbmnqykc) {
                    i13 = lxfrhoxuzkVar.f73794zoijcleaow;
                } else {
                    if (dxjokdxxwwVar2 instanceof metgxyhuhe.agtfadlqog.zoijcleaow) {
                        i13 = lxfrhoxuzkVar.f73793wkgbmnqykc;
                    }
                }
                i15 |= i13;
            }
            this.f73795yggfygwlhe.f73790eablkybsjg.btonecajqb(i15);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public lxfrhoxuzk(metgxyhuhe.btonecajqb btonecajqbVar) {
        this.f73791iobyxmoadg = btonecajqbVar;
    }

    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f73791iobyxmoadg.ppxfxbqfkf().collect(new iobyxmoadg(new androidx.collection.jpowsppfya(0, 1, null), this), gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final boolean gxszxtbevo() {
        return (this.f73790eablkybsjg.gxszxtbevo() & this.f73794zoijcleaow) != 0;
    }

    public final boolean lqeggnwhkg() {
        return (this.f73790eablkybsjg.gxszxtbevo() & this.f73792ppxfxbqfkf) != 0;
    }

    public final boolean nufgyqmvbu() {
        return (this.f73790eablkybsjg.gxszxtbevo() & this.f73793wkgbmnqykc) != 0;
    }
}
