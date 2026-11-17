package t;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {
    public static final boolean btonecajqb(pmvmpeiblj pmvmpeibljVar) {
        return !g.eablkybsjg.btonecajqb(dxjokdxxww(pmvmpeibljVar, true), g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf());
    }

    private static final long dxjokdxxww(pmvmpeiblj pmvmpeibljVar, boolean z13) {
        long jRgvfuqvkyq = g.eablkybsjg.rgvfuqvkyq(pmvmpeibljVar.nufgyqmvbu(), pmvmpeibljVar.gtknphoqwx());
        return (z13 || !pmvmpeibljVar.rgvfuqvkyq()) ? jRgvfuqvkyq : g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
    }

    public static final boolean eablkybsjg(pmvmpeiblj pmvmpeibljVar, long j13) {
        long jNufgyqmvbu = pmvmpeibljVar.nufgyqmvbu();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jNufgyqmvbu >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jNufgyqmvbu & 4294967295L));
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        return (fIntBitsToFloat > ((float) i13)) | (fIntBitsToFloat < 0.0f) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) i14));
    }

    public static final boolean gxszxtbevo(pmvmpeiblj pmvmpeibljVar, long j13, long j14) {
        boolean zLqeggnwhkg = cllcsxoeiz.lqeggnwhkg(pmvmpeibljVar.agtfadlqog(), cllcsxoeiz.f109054iobyxmoadg.wkgbmnqykc());
        long jNufgyqmvbu = pmvmpeibljVar.nufgyqmvbu();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jNufgyqmvbu >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jNufgyqmvbu & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j14 >> 32));
        float f13 = zLqeggnwhkg ? 1.0f : 0.0f;
        float f14 = fIntBitsToFloat3 * f13;
        float f15 = ((int) (j13 >> 32)) + f14;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j14 & 4294967295L)) * f13;
        return (fIntBitsToFloat > f15) | (fIntBitsToFloat < (-f14)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j13 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final boolean iobyxmoadg(pmvmpeiblj pmvmpeibljVar) {
        return (pmvmpeibljVar.rgvfuqvkyq() || pmvmpeibljVar.draadjrbmk() || !pmvmpeibljVar.dxjokdxxww()) ? false : true;
    }

    public static final long lqeggnwhkg(pmvmpeiblj pmvmpeibljVar) {
        return dxjokdxxww(pmvmpeibljVar, false);
    }

    public static final long nufgyqmvbu(pmvmpeiblj pmvmpeibljVar) {
        return dxjokdxxww(pmvmpeibljVar, true);
    }

    public static final boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        return (pmvmpeibljVar.rgvfuqvkyq() || !pmvmpeibljVar.draadjrbmk() || pmvmpeibljVar.dxjokdxxww()) ? false : true;
    }

    public static final boolean wkgbmnqykc(pmvmpeiblj pmvmpeibljVar) {
        return pmvmpeibljVar.draadjrbmk() && !pmvmpeibljVar.dxjokdxxww();
    }

    public static final boolean zoijcleaow(pmvmpeiblj pmvmpeibljVar) {
        return !pmvmpeibljVar.draadjrbmk() && pmvmpeibljVar.dxjokdxxww();
    }
}
