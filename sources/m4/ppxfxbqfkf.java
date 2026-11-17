package m4;

import android.util.Pair;
import h4.draadjrbmk;
import t3.hcddaimhww;
import t3.pkzmftpjix;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long[] f65137iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f65138ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f65139zoijcleaow;

    private ppxfxbqfkf(long[] jArr, long[] jArr2, long j13) {
        this.f65137iobyxmoadg = jArr;
        this.f65139zoijcleaow = jArr2;
        this.f65138ppxfxbqfkf = j13 == -9223372036854775807L ? stevsuqkhv.ixidwrxhsl(jArr2[jArr2.length - 1]) : j13;
    }

    public static ppxfxbqfkf iobyxmoadg(long j13, draadjrbmk draadjrbmkVar, long j14) {
        int length = draadjrbmkVar.f39341eablkybsjg.length;
        int i13 = length + 1;
        long[] jArr = new long[i13];
        long[] jArr2 = new long[i13];
        jArr[0] = j13;
        long j15 = 0;
        jArr2[0] = 0;
        for (int i14 = 1; i14 <= length; i14++) {
            int i15 = i14 - 1;
            j13 += (long) (draadjrbmkVar.f39343ppxfxbqfkf + draadjrbmkVar.f39341eablkybsjg[i15]);
            j15 += (long) (draadjrbmkVar.f39344wkgbmnqykc + draadjrbmkVar.f39342gxszxtbevo[i15]);
            jArr[i14] = j13;
            jArr2[i14] = j15;
        }
        return new ppxfxbqfkf(jArr, jArr2, j14);
    }

    private static Pair zoijcleaow(long j13, long[] jArr, long[] jArr2) {
        int iLqeggnwhkg = stevsuqkhv.lqeggnwhkg(jArr, j13, true, true);
        long j14 = jArr[iLqeggnwhkg];
        long j15 = jArr2[iLqeggnwhkg];
        int i13 = iLqeggnwhkg + 1;
        if (i13 == jArr.length) {
            return Pair.create(Long.valueOf(j14), Long.valueOf(j15));
        }
        long j16 = jArr[i13];
        return Pair.create(Long.valueOf(j13), Long.valueOf(((long) ((j16 == j14 ? 0.0d : (j13 - j14) / (j16 - j14)) * (jArr2[i13] - j15))) + j15));
    }

    @Override // m4.lqeggnwhkg
    public int btonecajqb() {
        return -2147483647;
    }

    @Override // t3.pkzmftpjix
    public long gtknphoqwx() {
        return this.f65138ppxfxbqfkf;
    }

    @Override // m4.lqeggnwhkg
    public long gxszxtbevo() {
        return -1L;
    }

    @Override // t3.pkzmftpjix
    public boolean lqeggnwhkg() {
        return true;
    }

    @Override // m4.lqeggnwhkg
    public long nufgyqmvbu(long j13) {
        return stevsuqkhv.ixidwrxhsl(((Long) zoijcleaow(j13, this.f65137iobyxmoadg, this.f65139zoijcleaow).second).longValue());
    }

    @Override // t3.pkzmftpjix
    public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
        Pair pairZoijcleaow = zoijcleaow(stevsuqkhv.t(stevsuqkhv.rgvfuqvkyq(j13, 0L, this.f65138ppxfxbqfkf)), this.f65139zoijcleaow, this.f65137iobyxmoadg);
        return new pkzmftpjix.iobyxmoadg(new hcddaimhww(stevsuqkhv.ixidwrxhsl(((Long) pairZoijcleaow.first).longValue()), ((Long) pairZoijcleaow.second).longValue()));
    }
}
