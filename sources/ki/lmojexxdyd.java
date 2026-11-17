package ki;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lmojexxdyd {
    private static final boolean eablkybsjg(ii.gxszxtbevo gxszxtbevoVar) {
        String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        if (!zynmafqrjb.f55671iobyxmoadg.contains(strZoijcleaow)) {
            for (int i13 = 0; i13 < strZoijcleaow.length(); i13++) {
                char cCharAt = strZoijcleaow.charAt(i13);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strZoijcleaow.length() != 0 && Character.isJavaIdentifierStart(strZoijcleaow.codePointAt(0))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Instruction removed from duplicated block: B:8:0x003e, please report this as an issue */
    public static final boolean gxszxtbevo(String lower, String upper) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lower, "lower");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upper, "upper");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lower, mj.kcexrzcfyt.hcddaimhww(upper, "?", "", false, 4, null))) {
            if (mj.kcexrzcfyt.zynmafqrjb(upper, "?", false, 2, null)) {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lower + '?', upper)) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg('(' + lower + ")?", upper)) {
                        return false;
                    }
                }
            } else {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg('(' + lower + ")?", upper)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final String iobyxmoadg(ii.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        List listNufgyqmvbu = wkgbmnqykcVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(listNufgyqmvbu, "pathSegments(...)");
        return ppxfxbqfkf(listNufgyqmvbu);
    }

    public static final String ppxfxbqfkf(List pathSegments) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pathSegments, "pathSegments");
        StringBuilder sb3 = new StringBuilder();
        Iterator it = pathSegments.iterator();
        while (it.hasNext()) {
            ii.gxszxtbevo gxszxtbevoVar = (ii.gxszxtbevo) it.next();
            if (sb3.length() > 0) {
                sb3.append(".");
            }
            sb3.append(zoijcleaow(gxszxtbevoVar));
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static final String wkgbmnqykc(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerPrefix, "lowerPrefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperRendered, "upperRendered");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperPrefix, "upperPrefix");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(foldedPrefix, "foldedPrefix");
        if (mj.kcexrzcfyt.stevsuqkhv(lowerRendered, lowerPrefix, false, 2, null) && mj.kcexrzcfyt.stevsuqkhv(upperRendered, upperPrefix, false, 2, null)) {
            String strSubstring = lowerRendered.substring(lowerPrefix.length());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
            String strSubstring2 = upperRendered.substring(upperPrefix.length());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
            String str = foldedPrefix + strSubstring;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strSubstring, strSubstring2)) {
                return str;
            }
            if (gxszxtbevo(strSubstring, strSubstring2)) {
                return str + '!';
            }
        }
        return null;
    }

    public static final String zoijcleaow(ii.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        if (!eablkybsjg(gxszxtbevoVar)) {
            String strZoijcleaow = gxszxtbevoVar.zoijcleaow();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            return strZoijcleaow;
        }
        StringBuilder sb3 = new StringBuilder();
        String strZoijcleaow2 = gxszxtbevoVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow2, "asString(...)");
        sb3.append('`' + strZoijcleaow2);
        sb3.append('`');
        return sb3.toString();
    }
}
