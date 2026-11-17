package z4;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import y2.gtknphoqwx;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f127784ppxfxbqfkf = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f127785wkgbmnqykc = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f127786iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final StringBuilder f127787zoijcleaow = new StringBuilder();

    static void agtfadlqog(yadqdtsiqt yadqdtsiqtVar) {
        while (true) {
            for (boolean z13 = true; yadqdtsiqtVar.iobyxmoadg() > 0 && z13; z13 = false) {
                if (!ppxfxbqfkf(yadqdtsiqtVar) && !zoijcleaow(yadqdtsiqtVar)) {
                }
            }
            return;
        }
    }

    private static void btonecajqb(yadqdtsiqt yadqdtsiqtVar, ppxfxbqfkf ppxfxbqfkfVar, StringBuilder sb3) {
        agtfadlqog(yadqdtsiqtVar);
        String strGxszxtbevo = gxszxtbevo(yadqdtsiqtVar, sb3);
        if (!"".equals(strGxszxtbevo) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(lqeggnwhkg(yadqdtsiqtVar, sb3))) {
            agtfadlqog(yadqdtsiqtVar);
            String strNufgyqmvbu = nufgyqmvbu(yadqdtsiqtVar, sb3);
            if (strNufgyqmvbu == null || "".equals(strNufgyqmvbu)) {
                return;
            }
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            String strLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, sb3);
            if (!";".equals(strLqeggnwhkg)) {
                if (!"}".equals(strLqeggnwhkg)) {
                    return;
                } else {
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                }
            }
            if ("color".equals(strGxszxtbevo)) {
                ppxfxbqfkfVar.vdvldrhtss(gtknphoqwx.zoijcleaow(strNufgyqmvbu));
                return;
            }
            if ("background-color".equals(strGxszxtbevo)) {
                ppxfxbqfkfVar.agtfadlqog(gtknphoqwx.zoijcleaow(strNufgyqmvbu));
                return;
            }
            boolean z13 = true;
            if ("ruby-position".equals(strGxszxtbevo)) {
                if ("over".equals(strNufgyqmvbu)) {
                    ppxfxbqfkfVar.jyumaefscl(1);
                    return;
                } else {
                    if ("under".equals(strNufgyqmvbu)) {
                        ppxfxbqfkfVar.jyumaefscl(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strGxszxtbevo)) {
                if (!"all".equals(strNufgyqmvbu) && !strNufgyqmvbu.startsWith("digits")) {
                    z13 = false;
                }
                ppxfxbqfkfVar.rgvfuqvkyq(z13);
                return;
            }
            if ("text-decoration".equals(strGxszxtbevo)) {
                if ("underline".equals(strNufgyqmvbu)) {
                    ppxfxbqfkfVar.pmvmpeiblj(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strGxszxtbevo)) {
                ppxfxbqfkfVar.oxmwwwfdhm(strNufgyqmvbu);
                return;
            }
            if ("font-weight".equals(strGxszxtbevo)) {
                if ("bold".equals(strNufgyqmvbu)) {
                    ppxfxbqfkfVar.ojitshcjhn(true);
                }
            } else if ("font-style".equals(strGxszxtbevo)) {
                if ("italic".equals(strNufgyqmvbu)) {
                    ppxfxbqfkfVar.yggfygwlhe(true);
                }
            } else if ("font-size".equals(strGxszxtbevo)) {
                eablkybsjg(strNufgyqmvbu, ppxfxbqfkfVar);
            }
        }
    }

    private static String draadjrbmk(yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        boolean z13 = false;
        while (iGxszxtbevo < iLqeggnwhkg && !z13) {
            int i13 = iGxszxtbevo + 1;
            z13 = ((char) yadqdtsiqtVar.eablkybsjg()[iGxszxtbevo]) == ')';
            iGxszxtbevo = i13;
        }
        return yadqdtsiqtVar.yadqdtsiqt((iGxszxtbevo - 1) - yadqdtsiqtVar.gxszxtbevo()).trim();
    }

    private static String dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, StringBuilder sb3) {
        agtfadlqog(yadqdtsiqtVar);
        if (yadqdtsiqtVar.iobyxmoadg() < 5 || !"::cue".equals(yadqdtsiqtVar.yadqdtsiqt(5))) {
            return null;
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        String strLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, sb3);
        if (strLqeggnwhkg == null) {
            return null;
        }
        if ("{".equals(strLqeggnwhkg)) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            return "";
        }
        String strDraadjrbmk = "(".equals(strLqeggnwhkg) ? draadjrbmk(yadqdtsiqtVar) : null;
        if (")".equals(lqeggnwhkg(yadqdtsiqtVar, sb3))) {
            return strDraadjrbmk;
        }
        return null;
    }

    private static void eablkybsjg(String str, ppxfxbqfkf ppxfxbqfkfVar) {
        Matcher matcher = f127785wkgbmnqykc.matcher(xa.zoijcleaow.eablkybsjg(str));
        if (!matcher.matches()) {
            kcexrzcfyt.nufgyqmvbu("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                ppxfxbqfkfVar.zdlpuopuiu(3);
                break;
            case "em":
                ppxfxbqfkfVar.zdlpuopuiu(2);
                break;
            case "px":
                ppxfxbqfkfVar.zdlpuopuiu(1);
                break;
            default:
                throw new IllegalStateException();
        }
        ppxfxbqfkfVar.kcexrzcfyt(Float.parseFloat((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1))));
    }

    private static char gtknphoqwx(yadqdtsiqt yadqdtsiqtVar, int i13) {
        return (char) yadqdtsiqtVar.eablkybsjg()[i13];
    }

    private static String gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, StringBuilder sb3) {
        boolean z13 = false;
        sb3.setLength(0);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        while (iGxszxtbevo < iLqeggnwhkg && !z13) {
            char c13 = (char) yadqdtsiqtVar.eablkybsjg()[iGxszxtbevo];
            if ((c13 < 'A' || c13 > 'Z') && ((c13 < 'a' || c13 > 'z') && !((c13 >= '0' && c13 <= '9') || c13 == '#' || c13 == '-' || c13 == '.' || c13 == '_'))) {
                z13 = true;
            } else {
                iGxszxtbevo++;
                sb3.append(c13);
            }
        }
        yadqdtsiqtVar.crxdokpmqz(iGxszxtbevo - yadqdtsiqtVar.gxszxtbevo());
        return sb3.toString();
    }

    private void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = f127784ppxfxbqfkf.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                ppxfxbqfkfVar.lereixgezr((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrK = stevsuqkhv.k(str, "\\.");
        String str2 = strArrK[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            ppxfxbqfkfVar.esjtqupxsv(str2.substring(0, iIndexOf2));
            ppxfxbqfkfVar.cqumvgiudr(str2.substring(iIndexOf2 + 1));
        } else {
            ppxfxbqfkfVar.esjtqupxsv(str2);
        }
        if (strArrK.length > 1) {
            ppxfxbqfkfVar.iwizpuwonk((String[]) stevsuqkhv.eslsurpljm(strArrK, 1, strArrK.length));
        }
    }

    static String lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar, StringBuilder sb3) {
        agtfadlqog(yadqdtsiqtVar);
        if (yadqdtsiqtVar.iobyxmoadg() == 0) {
            return null;
        }
        String strGxszxtbevo = gxszxtbevo(yadqdtsiqtVar, sb3);
        if (!"".equals(strGxszxtbevo)) {
            return strGxszxtbevo;
        }
        return "" + ((char) yadqdtsiqtVar.wwaezpbzkn());
    }

    private static String nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar, StringBuilder sb3) {
        StringBuilder sb4 = new StringBuilder();
        boolean z13 = false;
        while (!z13) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            String strLqeggnwhkg = lqeggnwhkg(yadqdtsiqtVar, sb3);
            if (strLqeggnwhkg == null) {
                return null;
            }
            if ("}".equals(strLqeggnwhkg) || ";".equals(strLqeggnwhkg)) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                z13 = true;
            } else {
                sb4.append(strLqeggnwhkg);
            }
        }
        return sb4.toString();
    }

    private static boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        char cGtknphoqwx = gtknphoqwx(yadqdtsiqtVar, yadqdtsiqtVar.gxszxtbevo());
        if (cGtknphoqwx != '\t' && cGtknphoqwx != '\n' && cGtknphoqwx != '\f' && cGtknphoqwx != '\r' && cGtknphoqwx != ' ') {
            return false;
        }
        yadqdtsiqtVar.crxdokpmqz(1);
        return true;
    }

    static void wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar) {
        while (!TextUtils.isEmpty(yadqdtsiqtVar.kcexrzcfyt())) {
        }
    }

    private static boolean zoijcleaow(yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        byte[] bArrEablkybsjg = yadqdtsiqtVar.eablkybsjg();
        if (iGxszxtbevo + 2 > iLqeggnwhkg) {
            return false;
        }
        int i13 = iGxszxtbevo + 1;
        if (bArrEablkybsjg[iGxszxtbevo] != 47) {
            return false;
        }
        int i14 = iGxszxtbevo + 2;
        if (bArrEablkybsjg[i13] != 42) {
            return false;
        }
        while (true) {
            int i15 = i14 + 1;
            if (i15 >= iLqeggnwhkg) {
                yadqdtsiqtVar.crxdokpmqz(iLqeggnwhkg - yadqdtsiqtVar.gxszxtbevo());
                return true;
            }
            if (((char) bArrEablkybsjg[i14]) == '*' && ((char) bArrEablkybsjg[i15]) == '/') {
                i14 += 2;
                iLqeggnwhkg = i14;
            } else {
                i14 = i15;
            }
        }
    }

    public List wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        this.f127787zoijcleaow.setLength(0);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        wflxmlrfwp(yadqdtsiqtVar);
        this.f127786iobyxmoadg.ntlheqmsrt(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo());
        this.f127786iobyxmoadg.sopmlzcsov(iGxszxtbevo);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strDxjokdxxww = dxjokdxxww(this.f127786iobyxmoadg, this.f127787zoijcleaow);
            if (strDxjokdxxww == null || !"{".equals(lqeggnwhkg(this.f127786iobyxmoadg, this.f127787zoijcleaow))) {
                return arrayList;
            }
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            iobyxmoadg(ppxfxbqfkfVar, strDxjokdxxww);
            String str = null;
            boolean z13 = false;
            while (!z13) {
                int iGxszxtbevo2 = this.f127786iobyxmoadg.gxszxtbevo();
                String strLqeggnwhkg = lqeggnwhkg(this.f127786iobyxmoadg, this.f127787zoijcleaow);
                boolean z14 = strLqeggnwhkg == null || "}".equals(strLqeggnwhkg);
                if (!z14) {
                    this.f127786iobyxmoadg.sopmlzcsov(iGxszxtbevo2);
                    btonecajqb(this.f127786iobyxmoadg, ppxfxbqfkfVar, this.f127787zoijcleaow);
                }
                str = strLqeggnwhkg;
                z13 = z14;
            }
            if ("}".equals(str)) {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
    }
}
