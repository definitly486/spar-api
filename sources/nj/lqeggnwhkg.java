package nj;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {
    private static final long iobyxmoadg(long j13) {
        return j13 < 0 ? iobyxmoadg.f70173yggfygwlhe.zoijcleaow() : iobyxmoadg.f70173yggfygwlhe.iobyxmoadg();
    }

    public static final long ppxfxbqfkf(long j13, long j14, wkgbmnqykc unit) {
        zdlpuopuiu.btonecajqb(unit, "unit");
        if (((j14 - 1) | 1) == Long.MAX_VALUE) {
            return j13 == j14 ? iobyxmoadg.f70173yggfygwlhe.ppxfxbqfkf() : iobyxmoadg.pkzmftpjix(iobyxmoadg(j14));
        }
        return (1 | (j13 - 1)) == Long.MAX_VALUE ? iobyxmoadg(j13) : zoijcleaow(j13, j14, unit);
    }

    private static final long zoijcleaow(long j13, long j14, wkgbmnqykc wkgbmnqykcVar) {
        long j15 = j13 - j14;
        if (((j15 ^ j13) & (~(j15 ^ j14))) >= 0) {
            return ppxfxbqfkf.zdlpuopuiu(j15, wkgbmnqykcVar);
        }
        wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykc.MILLISECONDS;
        if (wkgbmnqykcVar.compareTo(wkgbmnqykcVar2) >= 0) {
            return iobyxmoadg.pkzmftpjix(iobyxmoadg(j15));
        }
        long jZoijcleaow = eablkybsjg.zoijcleaow(1L, wkgbmnqykcVar2, wkgbmnqykcVar);
        long j16 = (j13 / jZoijcleaow) - (j14 / jZoijcleaow);
        long j17 = (j13 % jZoijcleaow) - (j14 % jZoijcleaow);
        iobyxmoadg.C1516iobyxmoadg c1516iobyxmoadg = iobyxmoadg.f70173yggfygwlhe;
        return iobyxmoadg.iozdgvuglv(ppxfxbqfkf.zdlpuopuiu(j16, wkgbmnqykcVar2), ppxfxbqfkf.zdlpuopuiu(j17, wkgbmnqykcVar));
    }
}
