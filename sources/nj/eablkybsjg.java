package nj;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
abstract class eablkybsjg {
    public static final double iobyxmoadg(double d13, wkgbmnqykc sourceUnit, wkgbmnqykc targetUnit) {
        zdlpuopuiu.btonecajqb(sourceUnit, "sourceUnit");
        zdlpuopuiu.btonecajqb(targetUnit, "targetUnit");
        long jConvert = targetUnit.wkgbmnqykc().convert(1L, sourceUnit.wkgbmnqykc());
        return jConvert > 0 ? d13 * jConvert : d13 / sourceUnit.wkgbmnqykc().convert(1L, targetUnit.wkgbmnqykc());
    }

    public static final long ppxfxbqfkf(long j13, wkgbmnqykc sourceUnit, wkgbmnqykc targetUnit) {
        zdlpuopuiu.btonecajqb(sourceUnit, "sourceUnit");
        zdlpuopuiu.btonecajqb(targetUnit, "targetUnit");
        return targetUnit.wkgbmnqykc().convert(j13, sourceUnit.wkgbmnqykc());
    }

    public static final long zoijcleaow(long j13, wkgbmnqykc sourceUnit, wkgbmnqykc targetUnit) {
        zdlpuopuiu.btonecajqb(sourceUnit, "sourceUnit");
        zdlpuopuiu.btonecajqb(targetUnit, "targetUnit");
        return targetUnit.wkgbmnqykc().convert(j13, sourceUnit.wkgbmnqykc());
    }
}
