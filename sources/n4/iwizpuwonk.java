package n4;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f68598eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final long[] f68599gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final zdlpuopuiu f68600iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int[] f68601lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final long f68602nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long[] f68603ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int[] f68604wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f68605zoijcleaow;

    public iwizpuwonk(zdlpuopuiu zdlpuopuiuVar, long[] jArr, int[] iArr, int i13, long[] jArr2, int[] iArr2, long j13) {
        y2.iobyxmoadg.iobyxmoadg(iArr.length == jArr2.length);
        y2.iobyxmoadg.iobyxmoadg(jArr.length == jArr2.length);
        y2.iobyxmoadg.iobyxmoadg(iArr2.length == jArr2.length);
        this.f68600iobyxmoadg = zdlpuopuiuVar;
        this.f68603ppxfxbqfkf = jArr;
        this.f68604wkgbmnqykc = iArr;
        this.f68598eablkybsjg = i13;
        this.f68599gxszxtbevo = jArr2;
        this.f68601lqeggnwhkg = iArr2;
        this.f68602nufgyqmvbu = j13;
        this.f68605zoijcleaow = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int iobyxmoadg(long j13) {
        for (int iLqeggnwhkg = stevsuqkhv.lqeggnwhkg(this.f68599gxszxtbevo, j13, true, false); iLqeggnwhkg >= 0; iLqeggnwhkg--) {
            if ((this.f68601lqeggnwhkg[iLqeggnwhkg] & 1) != 0) {
                return iLqeggnwhkg;
            }
        }
        return -1;
    }

    public int zoijcleaow(long j13) {
        for (int iWkgbmnqykc = stevsuqkhv.wkgbmnqykc(this.f68599gxszxtbevo, j13, true, false); iWkgbmnqykc < this.f68599gxszxtbevo.length; iWkgbmnqykc++) {
            if ((this.f68601lqeggnwhkg[iWkgbmnqykc] & 1) != 0) {
                return iWkgbmnqykc;
            }
        }
        return -1;
    }
}
