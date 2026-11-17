package tj;

import gg.wwaezpbzkn;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu extends lqeggnwhkg {
    public /* synthetic */ nufgyqmvbu(sj.lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(lqeggnwhkgVar, (i14 & 2) != 0 ? lg.gtknphoqwx.f62507zdlpuopuiu : btonecajqbVar, (i14 & 4) != 0 ? -3 : i13, (i14 & 8) != 0 ? rj.iobyxmoadg.SUSPEND : iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    protected wkgbmnqykc gxszxtbevo(lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        return new nufgyqmvbu(this.f110695iwizpuwonk, btonecajqbVar, i13, iobyxmoadgVar);
    }

    @Override // tj.wkgbmnqykc
    public sj.lqeggnwhkg nufgyqmvbu() {
        return this.f110695iwizpuwonk;
    }

    @Override // tj.lqeggnwhkg
    protected Object rgvfuqvkyq(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objCollect = this.f110695iwizpuwonk.collect(nufgyqmvbuVar, gxszxtbevoVar);
        return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
    }

    public nufgyqmvbu(sj.lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        super(lqeggnwhkgVar, btonecajqbVar, i13, iobyxmoadgVar);
    }
}
