package v3;

import com.google.common.collect.ulzqkzuiru;
import com.google.common.collect.zdlpuopuiu;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo implements iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final zdlpuopuiu f115872iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f115873zoijcleaow;

    private gxszxtbevo(int i13, zdlpuopuiu zdlpuopuiuVar) {
        this.f115873zoijcleaow = i13;
        this.f115872iobyxmoadg = zdlpuopuiuVar;
    }

    private static iobyxmoadg iobyxmoadg(int i13, int i14, yadqdtsiqt yadqdtsiqtVar) {
        switch (i13) {
            case 1718776947:
                return lqeggnwhkg.wkgbmnqykc(i14, yadqdtsiqtVar);
            case 1751742049:
                return ppxfxbqfkf.zoijcleaow(yadqdtsiqtVar);
            case 1752331379:
                return wkgbmnqykc.ppxfxbqfkf(yadqdtsiqtVar);
            case 1852994675:
                return nufgyqmvbu.iobyxmoadg(yadqdtsiqtVar);
            default:
                return null;
        }
    }

    public static gxszxtbevo ppxfxbqfkf(int i13, yadqdtsiqt yadqdtsiqtVar) {
        zdlpuopuiu.iobyxmoadg iobyxmoadgVar = new zdlpuopuiu.iobyxmoadg();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        int iZoijcleaow = -2;
        while (yadqdtsiqtVar.iobyxmoadg() > 8) {
            int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.yggfygwlhe();
            yadqdtsiqtVar.ulzqkzuiru(iGxszxtbevo);
            iobyxmoadg iobyxmoadgVarPpxfxbqfkf = iYggfygwlhe == 1414744396 ? ppxfxbqfkf(yadqdtsiqtVar.yggfygwlhe(), yadqdtsiqtVar) : iobyxmoadg(iYggfygwlhe, iZoijcleaow, yadqdtsiqtVar);
            if (iobyxmoadgVarPpxfxbqfkf != null) {
                if (iobyxmoadgVarPpxfxbqfkf.getType() == 1752331379) {
                    iZoijcleaow = ((wkgbmnqykc) iobyxmoadgVarPpxfxbqfkf).zoijcleaow();
                }
                iobyxmoadgVar.iobyxmoadg(iobyxmoadgVarPpxfxbqfkf);
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            yadqdtsiqtVar.ulzqkzuiru(iLqeggnwhkg);
        }
        return new gxszxtbevo(i13, iobyxmoadgVar.gtknphoqwx());
    }

    @Override // v3.iobyxmoadg
    public int getType() {
        return this.f115873zoijcleaow;
    }

    public iobyxmoadg zoijcleaow(Class cls) {
        ulzqkzuiru it = this.f115872iobyxmoadg.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            if (iobyxmoadgVar.getClass() == cls) {
                return iobyxmoadgVar;
            }
        }
        return null;
    }
}
