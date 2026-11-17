package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public abstract class ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final g.lqeggnwhkg f107664iobyxmoadg = new g.lqeggnwhkg(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean iobyxmoadg(g.lqeggnwhkg lqeggnwhkgVar, long j13) {
        float fNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        float fDxjokdxxww = lqeggnwhkgVar.dxjokdxxww();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        if (fNufgyqmvbu <= fIntBitsToFloat && fIntBitsToFloat <= fDxjokdxxww) {
            float fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
            float fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
            if (fGtknphoqwx <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fEablkybsjg) {
                return true;
            }
        }
        return false;
    }

    public static final g.lqeggnwhkg zoijcleaow(x.rgvfuqvkyq rgvfuqvkyqVar) {
        g.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = x.vdvldrhtss.ppxfxbqfkf(rgvfuqvkyqVar);
        return g.nufgyqmvbu.iobyxmoadg(rgvfuqvkyqVar.lmojexxdyd(lqeggnwhkgVarPpxfxbqfkf.draadjrbmk()), rgvfuqvkyqVar.lmojexxdyd(lqeggnwhkgVarPpxfxbqfkf.gxszxtbevo()));
    }
}
