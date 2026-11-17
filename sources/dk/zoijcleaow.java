package dk;

import fk.iwxlajgraz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static final ah.wkgbmnqykc iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            return ((ppxfxbqfkf) gxszxtbevoVar).f29101zoijcleaow;
        }
        if (gxszxtbevoVar instanceof iwxlajgraz) {
            return iobyxmoadg(((iwxlajgraz) gxszxtbevoVar).btonecajqb());
        }
        return null;
    }

    public static final gxszxtbevo ppxfxbqfkf(gxszxtbevo gxszxtbevoVar, ah.wkgbmnqykc context) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        zdlpuopuiu.btonecajqb(context, "context");
        return new ppxfxbqfkf(gxszxtbevoVar, context);
    }

    public static final gxszxtbevo zoijcleaow(ik.zoijcleaow zoijcleaowVar, gxszxtbevo descriptor) {
        bk.zoijcleaow zoijcleaowVarPpxfxbqfkf;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        ah.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = iobyxmoadg(descriptor);
        if (wkgbmnqykcVarIobyxmoadg == null || (zoijcleaowVarPpxfxbqfkf = ik.zoijcleaow.ppxfxbqfkf(zoijcleaowVar, wkgbmnqykcVarIobyxmoadg, null, 2, null)) == null) {
            return null;
        }
        return zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
    }
}
