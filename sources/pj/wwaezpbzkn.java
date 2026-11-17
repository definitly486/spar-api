package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wwaezpbzkn {
    public static final lg.btonecajqb btonecajqb(lg.btonecajqb btonecajqbVar, lg.btonecajqb btonecajqbVar2) {
        return !nufgyqmvbu(btonecajqbVar2) ? btonecajqbVar.plus(btonecajqbVar2) : wkgbmnqykc(btonecajqbVar, btonecajqbVar2, false);
    }

    public static final h draadjrbmk(kotlin.coroutines.jvm.internal.eablkybsjg eablkybsjgVar) {
        while (!(eablkybsjgVar instanceof jlmebxxoox) && (eablkybsjgVar = eablkybsjgVar.getCallerFrame()) != null) {
            if (eablkybsjgVar instanceof h) {
                return (h) eablkybsjgVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(boolean z13, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lg.btonecajqb eablkybsjg(kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, boolean z13, lg.btonecajqb btonecajqbVar, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        return btonecajqbVar.plus(zoijcleaowVar);
    }

    public static final lg.btonecajqb gtknphoqwx(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar) {
        lg.btonecajqb btonecajqbVarWkgbmnqykc = wkgbmnqykc(cllcsxoeizVar.getCoroutineContext(), btonecajqbVar, true);
        return (btonecajqbVarWkgbmnqykc == ikoacuggdj.iobyxmoadg() || btonecajqbVarWkgbmnqykc.get(lg.lqeggnwhkg.f62508dxjokdxxww) != null) ? btonecajqbVarWkgbmnqykc : btonecajqbVarWkgbmnqykc.plus(ikoacuggdj.iobyxmoadg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lg.btonecajqb gxszxtbevo(lg.btonecajqb btonecajqbVar, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        return btonecajqbVar.plus(zoijcleaowVar);
    }

    public static final String lqeggnwhkg(lg.btonecajqb btonecajqbVar) {
        return null;
    }

    private static final boolean nufgyqmvbu(lg.btonecajqb btonecajqbVar) {
        return ((Boolean) btonecajqbVar.fold(Boolean.FALSE, new tg.rgvfuqvkyq() { // from class: pj.yadqdtsiqt
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(wwaezpbzkn.dxjokdxxww(((Boolean) obj).booleanValue(), (lg.btonecajqb.zoijcleaow) obj2));
            }
        })).booleanValue();
    }

    public static final h wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar, lg.btonecajqb btonecajqbVar, Object obj) {
        if (!(gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) || btonecajqbVar.get(i.f76715zdlpuopuiu) == null) {
            return null;
        }
        h hVarDraadjrbmk = draadjrbmk((kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar);
        if (hVarDraadjrbmk != null) {
            hVarDraadjrbmk.c(btonecajqbVar, obj);
        }
        return hVarDraadjrbmk;
    }

    private static final lg.btonecajqb wkgbmnqykc(lg.btonecajqb btonecajqbVar, lg.btonecajqb btonecajqbVar2, final boolean z13) {
        boolean zNufgyqmvbu = nufgyqmvbu(btonecajqbVar);
        boolean zNufgyqmvbu2 = nufgyqmvbu(btonecajqbVar2);
        if (!zNufgyqmvbu && !zNufgyqmvbu2) {
            return btonecajqbVar.plus(btonecajqbVar2);
        }
        final kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = btonecajqbVar2;
        lg.gtknphoqwx gtknphoqwxVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        lg.btonecajqb btonecajqbVar3 = (lg.btonecajqb) btonecajqbVar.fold(gtknphoqwxVar, new tg.rgvfuqvkyq() { // from class: pj.iozdgvuglv
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return wwaezpbzkn.eablkybsjg(hkdspvbjdzVar, z13, (lg.btonecajqb) obj, (lg.btonecajqb.zoijcleaow) obj2);
            }
        });
        if (zNufgyqmvbu2) {
            hkdspvbjdzVar.f60015zdlpuopuiu = ((lg.btonecajqb) hkdspvbjdzVar.f60015zdlpuopuiu).fold(gtknphoqwxVar, new tg.rgvfuqvkyq() { // from class: pj.lmojexxdyd
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return wwaezpbzkn.gxszxtbevo((lg.btonecajqb) obj, (lg.btonecajqb.zoijcleaow) obj2);
                }
            });
        }
        return btonecajqbVar3.plus((lg.btonecajqb) hkdspvbjdzVar.f60015zdlpuopuiu);
    }
}
