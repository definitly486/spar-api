package tj;

import kotlin.jvm.internal.mbcevpiqjq;
import uj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {
    public static /* synthetic */ Object ppxfxbqfkf(lg.btonecajqb btonecajqbVar, Object obj, Object obj2, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj3) {
        if ((i13 & 4) != 0) {
            obj2 = pkzmftpjix.lqeggnwhkg(btonecajqbVar);
        }
        return zoijcleaow(btonecajqbVar, obj, obj2, rgvfuqvkyqVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sj.nufgyqmvbu wkgbmnqykc(sj.nufgyqmvbu nufgyqmvbuVar, lg.btonecajqb btonecajqbVar) {
        return ((nufgyqmvbuVar instanceof esjtqupxsv) || (nufgyqmvbuVar instanceof oxmwwwfdhm)) ? nufgyqmvbuVar : new zynmafqrjb(nufgyqmvbuVar, btonecajqbVar);
    }

    public static final Object zoijcleaow(lg.btonecajqb btonecajqbVar, Object obj, Object obj2, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objDxjokdxxww = pkzmftpjix.dxjokdxxww(btonecajqbVar, obj2);
        try {
            lereixgezr lereixgezrVar = new lereixgezr(gxszxtbevoVar, btonecajqbVar);
            Object objWkgbmnqykc = !(rgvfuqvkyqVar instanceof kotlin.coroutines.jvm.internal.iobyxmoadg) ? mg.zoijcleaow.wkgbmnqykc(rgvfuqvkyqVar, obj, lereixgezrVar) : ((tg.rgvfuqvkyq) mbcevpiqjq.eablkybsjg(rgvfuqvkyqVar, 2)).invoke(obj, lereixgezrVar);
            pkzmftpjix.gxszxtbevo(btonecajqbVar, objDxjokdxxww);
            if (objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo()) {
                kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
            }
            return objWkgbmnqykc;
        } catch (Throwable th2) {
            pkzmftpjix.gxszxtbevo(btonecajqbVar, objDxjokdxxww);
            throw th2;
        }
    }
}
