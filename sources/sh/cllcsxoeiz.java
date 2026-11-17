package sh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cllcsxoeiz {
    static /* synthetic */ ii.gxszxtbevo eablkybsjg(ii.gxszxtbevo gxszxtbevoVar, String str, boolean z13, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        if ((i13 & 8) != 0) {
            str2 = null;
        }
        return wkgbmnqykc(gxszxtbevoVar, str, z13, str2);
    }

    public static final List gxszxtbevo(ii.gxszxtbevo methodName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodName, "methodName");
        return hg.jyumaefscl.oxmwwwfdhm(ppxfxbqfkf(methodName, false), ppxfxbqfkf(methodName, true));
    }

    public static final List iobyxmoadg(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        String strZoijcleaow = name.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        if (wwaezpbzkn.ppxfxbqfkf(strZoijcleaow)) {
            return hg.jyumaefscl.vdvldrhtss(zoijcleaow(name));
        }
        return wwaezpbzkn.wkgbmnqykc(strZoijcleaow) ? gxszxtbevo(name) : btonecajqb.f106504iobyxmoadg.zoijcleaow(name);
    }

    public static final ii.gxszxtbevo ppxfxbqfkf(ii.gxszxtbevo methodName, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodName, "methodName");
        return eablkybsjg(methodName, "set", false, z13 ? "is" : null, 4, null);
    }

    private static final ii.gxszxtbevo wkgbmnqykc(ii.gxszxtbevo gxszxtbevoVar, String str, boolean z13, String str2) {
        if (gxszxtbevoVar.lqeggnwhkg()) {
            return null;
        }
        String strWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strWkgbmnqykc, "getIdentifier(...)");
        if (!mj.kcexrzcfyt.stevsuqkhv(strWkgbmnqykc, str, false, 2, null) || strWkgbmnqykc.length() == str.length()) {
            return null;
        }
        char cCharAt = strWkgbmnqykc.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return ii.gxszxtbevo.gxszxtbevo(str2 + mj.kcexrzcfyt.lxfrhoxuzk(strWkgbmnqykc, str));
        }
        if (!z13) {
            return gxszxtbevoVar;
        }
        String strPpxfxbqfkf = hj.iobyxmoadg.ppxfxbqfkf(mj.kcexrzcfyt.lxfrhoxuzk(strWkgbmnqykc, str), true);
        if (ii.gxszxtbevo.nufgyqmvbu(strPpxfxbqfkf)) {
            return ii.gxszxtbevo.gxszxtbevo(strPpxfxbqfkf);
        }
        return null;
    }

    public static final ii.gxszxtbevo zoijcleaow(ii.gxszxtbevo methodName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(methodName, "methodName");
        ii.gxszxtbevo gxszxtbevoVarEablkybsjg = eablkybsjg(methodName, "get", false, null, 12, null);
        return gxszxtbevoVarEablkybsjg == null ? eablkybsjg(methodName, "is", false, null, 8, null) : gxszxtbevoVarEablkybsjg;
    }
}
