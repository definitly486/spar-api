package opjhrmiecq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final int iobyxmoadg(float f13) {
        return Math.round((float) Math.ceil(f13));
    }

    public static final a zoijcleaow(a aVar, j0.eablkybsjg eablkybsjgVar, j0.n nVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, boolean z13, int i13, int i14, int i15, List list) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(aVar.gtknphoqwx(), eablkybsjgVar) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(aVar.btonecajqb(), nVar) && aVar.dxjokdxxww() == z13) {
            if (v0.jyumaefscl.lqeggnwhkg(aVar.lqeggnwhkg(), i13)) {
                if (aVar.wkgbmnqykc() == i14) {
                    if (aVar.eablkybsjg() == i15 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(aVar.iobyxmoadg(), wkgbmnqykcVar)) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(aVar.nufgyqmvbu(), list) && aVar.zoijcleaow() == zoijcleaowVar) {
                            return aVar;
                        }
                    }
                }
            }
        }
        return new a(eablkybsjgVar, nVar, i14, i15, z13, i13, wkgbmnqykcVar, zoijcleaowVar, list, null);
    }
}
