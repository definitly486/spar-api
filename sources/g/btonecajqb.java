package g;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {
    public static final boolean eablkybsjg(dxjokdxxww dxjokdxxwwVar) {
        long jNufgyqmvbu = dxjokdxxwwVar.nufgyqmvbu();
        return (jNufgyqmvbu >>> 32) == (jNufgyqmvbu & 4294967295L) && dxjokdxxwwVar.nufgyqmvbu() == dxjokdxxwwVar.dxjokdxxww() && dxjokdxxwwVar.nufgyqmvbu() == dxjokdxxwwVar.ppxfxbqfkf() && dxjokdxxwwVar.nufgyqmvbu() == dxjokdxxwwVar.zoijcleaow();
    }

    public static final dxjokdxxww iobyxmoadg(float f13, float f14, float f15, float f16, float f17, float f18) {
        long jZoijcleaow = iobyxmoadg.zoijcleaow((((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L));
        return new dxjokdxxww(f13, f14, f15, f16, jZoijcleaow, jZoijcleaow, jZoijcleaow, jZoijcleaow, null);
    }

    public static final dxjokdxxww ppxfxbqfkf(float f13, float f14, float f15, float f16, long j13) {
        return iobyxmoadg(f13, f14, f15, f16, Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    public static final lqeggnwhkg wkgbmnqykc(dxjokdxxww dxjokdxxwwVar) {
        return new lqeggnwhkg(dxjokdxxwwVar.eablkybsjg(), dxjokdxxwwVar.lqeggnwhkg(), dxjokdxxwwVar.gxszxtbevo(), dxjokdxxwwVar.iobyxmoadg());
    }

    public static final dxjokdxxww zoijcleaow(lqeggnwhkg lqeggnwhkgVar, long j13, long j14, long j15, long j16) {
        return new dxjokdxxww(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg(), j13, j14, j15, j16, null);
    }
}
