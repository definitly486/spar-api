package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long zoijcleaow(long j13, g.lqeggnwhkg lqeggnwhkgVar) {
        float fDxjokdxxww;
        float fEablkybsjg;
        int i13 = (int) (j13 >> 32);
        if (Float.intBitsToFloat(i13) < lqeggnwhkgVar.nufgyqmvbu()) {
            fDxjokdxxww = lqeggnwhkgVar.nufgyqmvbu();
        } else {
            fDxjokdxxww = Float.intBitsToFloat(i13) > lqeggnwhkgVar.dxjokdxxww() ? lqeggnwhkgVar.dxjokdxxww() : Float.intBitsToFloat(i13);
        }
        int i14 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i14) < lqeggnwhkgVar.gtknphoqwx()) {
            fEablkybsjg = lqeggnwhkgVar.gtknphoqwx();
        } else {
            fEablkybsjg = Float.intBitsToFloat(i14) > lqeggnwhkgVar.eablkybsjg() ? lqeggnwhkgVar.eablkybsjg() : Float.intBitsToFloat(i14);
        }
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fDxjokdxxww)) << 32) | (((long) Float.floatToRawIntBits(fEablkybsjg)) & 4294967295L));
    }
}
