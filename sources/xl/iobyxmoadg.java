package xl;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    zoijcleaow f122693jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private String f122694yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f122695zdlpuopuiu;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final String[] f122692iwizpuwonk = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final Pattern f122690cqumvgiudr = Pattern.compile("[^-a-zA-Z0-9_:.]+");

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final Pattern f122691esjtqupxsv = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    public iobyxmoadg(String str, String str2, zoijcleaow zoijcleaowVar) {
        vl.zoijcleaow.btonecajqb(str);
        String strTrim = str.trim();
        vl.zoijcleaow.lqeggnwhkg(strTrim);
        this.f122695zdlpuopuiu = strTrim;
        this.f122694yggfygwlhe = str2;
        this.f122693jyumaefscl = zoijcleaowVar;
    }

    private static boolean draadjrbmk(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt <= 31 || ((cCharAt >= 127 && cCharAt <= 159) || cCharAt == ' ' || cCharAt == '\"' || cCharAt == '\'' || cCharAt == '/' || cCharAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean gtknphoqwx(String str) {
        return Arrays.binarySearch(f122692iwizpuwonk, wl.gxszxtbevo.iobyxmoadg(str)) >= 0;
    }

    static void gxszxtbevo(String str, String str2, wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        String strPpxfxbqfkf = ppxfxbqfkf(str, iobyxmoadgVar.agtfadlqog());
        if (strPpxfxbqfkf == null) {
            return;
        }
        nufgyqmvbu(strPpxfxbqfkf, str2, lqeggnwhkgVar, iobyxmoadgVar);
    }

    static void nufgyqmvbu(String str, String str2, wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        lqeggnwhkgVar.zoijcleaow(str);
        if (rgvfuqvkyq(str, str2, iobyxmoadgVar)) {
            return;
        }
        lqeggnwhkgVar.zoijcleaow("=\"");
        ojitshcjhn.draadjrbmk(lqeggnwhkgVar, zoijcleaow.draadjrbmk(str2), iobyxmoadgVar, 2);
        lqeggnwhkgVar.iobyxmoadg('\"');
    }

    public static String ppxfxbqfkf(String str, gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg enumC3087iobyxmoadg) {
        if (enumC3087iobyxmoadg == gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml && !wflxmlrfwp(str)) {
            String strReplaceAll = f122690cqumvgiudr.matcher(str).replaceAll("_");
            if (wflxmlrfwp(strReplaceAll)) {
                return strReplaceAll;
            }
            return null;
        }
        if (enumC3087iobyxmoadg != gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.html || draadjrbmk(str)) {
            return str;
        }
        String strReplaceAll2 = f122691esjtqupxsv.matcher(str).replaceAll("_");
        if (draadjrbmk(strReplaceAll2)) {
            return strReplaceAll2;
        }
        return null;
    }

    protected static boolean rgvfuqvkyq(String str, String str2, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        return iobyxmoadgVar.agtfadlqog() == gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.html && (str2 == null || ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && gtknphoqwx(str)));
    }

    private static boolean wflxmlrfwp(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '_' || cCharAt == ':')) {
            return false;
        }
        for (int i13 = 1; i13 < length; i13++) {
            char cCharAt2 = str.charAt(i13);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '-' || cCharAt2 == '_' || cCharAt2 == ':' || cCharAt2 == '.'))) {
                return false;
            }
        }
        return true;
    }

    public String agtfadlqog() {
        int iIndexOf = this.f122695zdlpuopuiu.indexOf(58);
        return iIndexOf == -1 ? "" : this.f122695zdlpuopuiu.substring(0, iIndexOf);
    }

    public String eablkybsjg() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        lqeggnwhkg(wl.lqeggnwhkg.wkgbmnqykc(sbEablkybsjg), new gxszxtbevo.iobyxmoadg());
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return Objects.equals(this.f122695zdlpuopuiu, iobyxmoadgVar.f122695zdlpuopuiu) && Objects.equals(this.f122694yggfygwlhe, iobyxmoadgVar.f122694yggfygwlhe);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hash(this.f122695zdlpuopuiu, this.f122694yggfygwlhe);
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg clone() {
        try {
            return (iobyxmoadg) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    void lqeggnwhkg(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        gxszxtbevo(this.f122695zdlpuopuiu, this.f122694yggfygwlhe, lqeggnwhkgVar, iobyxmoadgVar);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        int iJyumaefscl;
        String strOjitshcjhn = this.f122694yggfygwlhe;
        zoijcleaow zoijcleaowVar = this.f122693jyumaefscl;
        if (zoijcleaowVar != null && (iJyumaefscl = zoijcleaowVar.jyumaefscl(this.f122695zdlpuopuiu)) != -1) {
            strOjitshcjhn = this.f122693jyumaefscl.ojitshcjhn(this.f122695zdlpuopuiu);
            this.f122693jyumaefscl.f122743jyumaefscl[iJyumaefscl] = str;
        }
        this.f122694yggfygwlhe = str;
        return zoijcleaow.draadjrbmk(strOjitshcjhn);
    }

    public String toString() {
        return eablkybsjg();
    }

    public esjtqupxsv.iobyxmoadg vdvldrhtss() {
        zoijcleaow zoijcleaowVar = this.f122693jyumaefscl;
        return zoijcleaowVar == null ? esjtqupxsv.iobyxmoadg.f122664ppxfxbqfkf : zoijcleaowVar.iozdgvuglv(this.f122695zdlpuopuiu);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return zoijcleaow.draadjrbmk(this.f122694yggfygwlhe);
    }

    @Override // java.util.Map.Entry
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.f122695zdlpuopuiu;
    }
}
