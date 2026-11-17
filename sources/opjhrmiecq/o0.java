package opjhrmiecq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static final boolean iobyxmoadg(j0.f fVar, j0.eablkybsjg eablkybsjgVar, j0.n nVar, List list, int i13, boolean z13, int i14, w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, long j13) {
        j0.e eVarDraadjrbmk = fVar.draadjrbmk();
        if (fVar.iwizpuwonk().wflxmlrfwp().ppxfxbqfkf() || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eVarDraadjrbmk.btonecajqb(), eablkybsjgVar) || !eVarDraadjrbmk.dxjokdxxww().lmojexxdyd(nVar) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eVarDraadjrbmk.lqeggnwhkg(), list) || eVarDraadjrbmk.eablkybsjg() != i13 || eVarDraadjrbmk.nufgyqmvbu() != z13 || !v0.jyumaefscl.lqeggnwhkg(eVarDraadjrbmk.gxszxtbevo(), i14) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eVarDraadjrbmk.zoijcleaow(), wkgbmnqykcVar) || eVarDraadjrbmk.wkgbmnqykc() != zdlpuopuiuVar || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eVarDraadjrbmk.ppxfxbqfkf(), zoijcleaowVar) || w0.zoijcleaow.agtfadlqog(j13) != w0.zoijcleaow.agtfadlqog(eVarDraadjrbmk.iobyxmoadg())) {
            return false;
        }
        if (z13 || v0.jyumaefscl.lqeggnwhkg(i14, v0.jyumaefscl.f114986iobyxmoadg.zoijcleaow())) {
            return w0.zoijcleaow.draadjrbmk(j13) == w0.zoijcleaow.draadjrbmk(eVarDraadjrbmk.iobyxmoadg()) && w0.zoijcleaow.gtknphoqwx(j13) == w0.zoijcleaow.gtknphoqwx(eVarDraadjrbmk.iobyxmoadg());
        }
        return true;
    }

    public static final float zoijcleaow(j0.f fVar, int i13) {
        if (i13 < 0 || fVar.draadjrbmk().btonecajqb().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(fVar.iwizpuwonk().kcexrzcfyt(i13), Math.min(fVar.iwizpuwonk().lereixgezr() - 1, fVar.iwizpuwonk().rgvfuqvkyq() - 1));
        if (i13 > j0.yggfygwlhe.oxmwwwfdhm(fVar.iwizpuwonk(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return fVar.iwizpuwonk().yggfygwlhe(iMin);
    }
}
