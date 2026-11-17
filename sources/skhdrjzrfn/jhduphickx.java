package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public abstract class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f107443iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final g0.cdpycssgdh f107444ppxfxbqfkf = new g0.cdpycssgdh("SelectionHandleInfo", (tg.rgvfuqvkyq) null, 2, (kotlin.jvm.internal.gtknphoqwx) null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float f107445zoijcleaow;

    static {
        float f13 = 25;
        f107443iobyxmoadg = w0.nufgyqmvbu.lqeggnwhkg(f13);
        f107445zoijcleaow = w0.nufgyqmvbu.lqeggnwhkg(f13);
    }

    public static final boolean eablkybsjg(v0.dxjokdxxww dxjokdxxwwVar, boolean z13) {
        return (dxjokdxxwwVar == v0.dxjokdxxww.Ltr && !z13) || (dxjokdxxwwVar == v0.dxjokdxxww.Rtl && z13);
    }

    public static final boolean gxszxtbevo(boolean z13, v0.dxjokdxxww dxjokdxxwwVar, boolean z14) {
        if (z13) {
            return eablkybsjg(dxjokdxxwwVar, z14);
        }
        return !eablkybsjg(dxjokdxxwwVar, z14);
    }

    public static final long iobyxmoadg(long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public static final float ppxfxbqfkf() {
        return f107443iobyxmoadg;
    }

    public static final g0.cdpycssgdh wkgbmnqykc() {
        return f107444ppxfxbqfkf;
    }

    public static final float zoijcleaow() {
        return f107445zoijcleaow;
    }
}
