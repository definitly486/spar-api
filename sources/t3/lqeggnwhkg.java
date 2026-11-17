package t3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements pkzmftpjix {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final long[] f109497eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f109498gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f109499iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final long[] f109500ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final long[] f109501wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int[] f109502zoijcleaow;

    public lqeggnwhkg(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f109502zoijcleaow = iArr;
        this.f109500ppxfxbqfkf = jArr;
        this.f109501wkgbmnqykc = jArr2;
        this.f109497eablkybsjg = jArr3;
        int length = iArr.length;
        this.f109499iobyxmoadg = length;
        if (length > 0) {
            this.f109498gxszxtbevo = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f109498gxszxtbevo = 0L;
        }
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f109498gxszxtbevo;
    }

    public int iobyxmoadg(long j13) {
        return y2.stevsuqkhv.lqeggnwhkg(this.f109497eablkybsjg, j13, true, true);
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f109499iobyxmoadg + ", sizes=" + Arrays.toString(this.f109502zoijcleaow) + ", offsets=" + Arrays.toString(this.f109500ppxfxbqfkf) + ", timeUs=" + Arrays.toString(this.f109497eablkybsjg) + ", durationsUs=" + Arrays.toString(this.f109501wkgbmnqykc) + ")";
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        int iIobyxmoadg = iobyxmoadg(j13);
        hcddaimhww hcddaimhwwVar = new hcddaimhww(this.f109497eablkybsjg[iIobyxmoadg], this.f109500ppxfxbqfkf[iIobyxmoadg]);
        if (hcddaimhwwVar.f109432iobyxmoadg >= j13 || iIobyxmoadg == this.f109499iobyxmoadg - 1) {
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar);
        }
        int i13 = iIobyxmoadg + 1;
        return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar, new hcddaimhww(this.f109497eablkybsjg[i13], this.f109500ppxfxbqfkf[i13]));
    }
}
