package sj;

import pj.auzgnhcxok;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class wflxmlrfwp {
    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar, lg.btonecajqb btonecajqbVar) {
        ppxfxbqfkf(btonecajqbVar);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVar, lg.gtknphoqwx.f62507zdlpuopuiu)) {
            return lqeggnwhkgVar;
        }
        if (lqeggnwhkgVar instanceof tj.rgvfuqvkyq) {
            return tj.rgvfuqvkyq.iobyxmoadg.iobyxmoadg((tj.rgvfuqvkyq) lqeggnwhkgVar, btonecajqbVar, 0, null, 6, null);
        }
        return new tj.nufgyqmvbu(lqeggnwhkgVar, btonecajqbVar, 0, null, 12, null);
    }

    public static final lqeggnwhkg iobyxmoadg(lqeggnwhkg lqeggnwhkgVar, int i13, rj.iobyxmoadg iobyxmoadgVar) {
        if (i13 < 0 && i13 != -2 && i13 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i13).toString());
        }
        if (i13 == -1 && iobyxmoadgVar != rj.iobyxmoadg.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i13 == -1) {
            iobyxmoadgVar = rj.iobyxmoadg.DROP_OLDEST;
            i13 = 0;
        }
        int i14 = i13;
        rj.iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        if (lqeggnwhkgVar instanceof tj.rgvfuqvkyq) {
            return tj.rgvfuqvkyq.iobyxmoadg.iobyxmoadg((tj.rgvfuqvkyq) lqeggnwhkgVar, null, i14, iobyxmoadgVar2, 1, null);
        }
        return new tj.nufgyqmvbu(lqeggnwhkgVar, null, i14, iobyxmoadgVar2, 2, null);
    }

    private static final void ppxfxbqfkf(lg.btonecajqb btonecajqbVar) {
        if (btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + btonecajqbVar).toString());
    }

    public static final lqeggnwhkg wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        return zoijcleaow(lqeggnwhkgVar, -1, null, 2, null);
    }

    public static /* synthetic */ lqeggnwhkg zoijcleaow(lqeggnwhkg lqeggnwhkgVar, int i13, rj.iobyxmoadg iobyxmoadgVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = -2;
        }
        if ((i14 & 2) != 0) {
            iobyxmoadgVar = rj.iobyxmoadg.SUSPEND;
        }
        return dxjokdxxww.ppxfxbqfkf(lqeggnwhkgVar, i13, iobyxmoadgVar);
    }
}
