package pj;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class btonecajqb {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final Object iobyxmoadg(lg.btonecajqb btonecajqbVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        czzsidtyhn czzsidtyhnVarIobyxmoadg;
        lg.btonecajqb btonecajqbVarGtknphoqwx;
        Thread threadCurrentThread = Thread.currentThread();
        lg.lqeggnwhkg lqeggnwhkgVar = (lg.lqeggnwhkg) btonecajqbVar.get(lg.lqeggnwhkg.f62508dxjokdxxww);
        if (lqeggnwhkgVar == null) {
            czzsidtyhnVarIobyxmoadg = c.f76674iobyxmoadg.zoijcleaow();
            btonecajqbVarGtknphoqwx = wwaezpbzkn.gtknphoqwx(weqkydbzbr.f76789zdlpuopuiu, btonecajqbVar.plus(czzsidtyhnVarIobyxmoadg));
        } else {
            czzsidtyhn czzsidtyhnVar = lqeggnwhkgVar instanceof czzsidtyhn ? (czzsidtyhn) lqeggnwhkgVar : null;
            if (czzsidtyhnVar == null) {
                czzsidtyhnVarIobyxmoadg = c.f76674iobyxmoadg.iobyxmoadg();
            } else {
                czzsidtyhn czzsidtyhnVar2 = czzsidtyhnVar.lxfrhoxuzk() ? czzsidtyhnVar : null;
                if (czzsidtyhnVar2 == null) {
                    czzsidtyhnVarIobyxmoadg = c.f76674iobyxmoadg.iobyxmoadg();
                } else {
                    czzsidtyhnVarIobyxmoadg = czzsidtyhnVar2;
                }
            }
            btonecajqbVarGtknphoqwx = wwaezpbzkn.gtknphoqwx(weqkydbzbr.f76789zdlpuopuiu, btonecajqbVar);
        }
        lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg(btonecajqbVarGtknphoqwx, threadCurrentThread, czzsidtyhnVarIobyxmoadg);
        lqeggnwhkgVar2.a(wypolnanlu.DEFAULT, lqeggnwhkgVar2, rgvfuqvkyqVar);
        return lqeggnwhkgVar2.b();
    }

    public static /* synthetic */ Object zoijcleaow(lg.btonecajqb btonecajqbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        return dxjokdxxww.eablkybsjg(btonecajqbVar, rgvfuqvkyqVar);
    }
}
