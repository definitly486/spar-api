package v4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.zdlpuopuiu;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q4.eablkybsjg;
import q4.oxmwwwfdhm;
import y2.kcexrzcfyt;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Pattern f115941wkgbmnqykc = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Pattern f115940eablkybsjg = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final StringBuilder f115942iobyxmoadg = new StringBuilder();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayList f115944zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f115943ppxfxbqfkf = new yadqdtsiqt();

    private String dxjokdxxww(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb3 = new StringBuilder(strTrim);
        Matcher matcher = f115940eablkybsjg.matcher(strTrim);
        int i13 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i13;
            int length = strGroup.length();
            sb3.replace(iStart, iStart + length, "");
            i13 += length;
        }
        return sb3.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private x2.iobyxmoadg eablkybsjg(Spanned spanned, String str) {
        byte b13;
        byte b14;
        x2.iobyxmoadg.zoijcleaow zoijcleaowVarOjitshcjhn = new x2.iobyxmoadg.zoijcleaow().ojitshcjhn(spanned);
        if (str == null) {
            return zoijcleaowVarOjitshcjhn.iobyxmoadg();
        }
        switch (str) {
            case "{\an1}":
                b13 = 0;
                break;
            case "{\an2}":
                b13 = 6;
                break;
            case "{\an3}":
                b13 = 3;
                break;
            case "{\an4}":
                b13 = 1;
                break;
            case "{\an5}":
                b13 = 7;
                break;
            case "{\an6}":
                b13 = 4;
                break;
            case "{\an7}":
                b13 = 2;
                break;
            case "{\an8}":
                b13 = 8;
                break;
            case "{\an9}":
                b13 = 5;
                break;
            default:
                b13 = -1;
                break;
        }
        if (b13 == 0 || b13 == 1 || b13 == 2) {
            zoijcleaowVarOjitshcjhn.draadjrbmk(0);
        } else if (b13 == 3 || b13 == 4 || b13 == 5) {
            zoijcleaowVarOjitshcjhn.draadjrbmk(2);
        } else {
            zoijcleaowVarOjitshcjhn.draadjrbmk(1);
        }
        switch (str) {
            case "{\an1}":
                b14 = 0;
                break;
            case "{\an2}":
                b14 = 1;
                break;
            case "{\an3}":
                b14 = 2;
                break;
            case "{\an4}":
                b14 = 6;
                break;
            case "{\an5}":
                b14 = 7;
                break;
            case "{\an6}":
                b14 = 8;
                break;
            case "{\an7}":
                b14 = 3;
                break;
            case "{\an8}":
                b14 = 4;
                break;
            case "{\an9}":
                b14 = 5;
                break;
            default:
                b14 = -1;
                break;
        }
        if (b14 == 0 || b14 == 1 || b14 == 2) {
            zoijcleaowVarOjitshcjhn.dxjokdxxww(2);
        } else if (b14 == 3 || b14 == 4 || b14 == 5) {
            zoijcleaowVarOjitshcjhn.dxjokdxxww(0);
        } else {
            zoijcleaowVarOjitshcjhn.dxjokdxxww(1);
        }
        return zoijcleaowVarOjitshcjhn.gtknphoqwx(lqeggnwhkg(zoijcleaowVarOjitshcjhn.wkgbmnqykc())).nufgyqmvbu(lqeggnwhkg(zoijcleaowVarOjitshcjhn.ppxfxbqfkf()), 0).iobyxmoadg();
    }

    private Charset gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        Charset charsetKegysxyocb = yadqdtsiqtVar.kegysxyocb();
        return charsetKegysxyocb != null ? charsetKegysxyocb : StandardCharsets.UTF_8;
    }

    public static float lqeggnwhkg(int i13) {
        if (i13 == 0) {
            return 0.08f;
        }
        if (i13 == 1) {
            return 0.5f;
        }
        if (i13 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long nufgyqmvbu(Matcher matcher, int i13) {
        String strGroup = matcher.group(i13 + 1);
        long j13 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(i13 + 2))) * 60000) + (Long.parseLong((String) y2.iobyxmoadg.eablkybsjg(matcher.group(i13 + 3))) * 1000);
        String strGroup2 = matcher.group(i13 + 4);
        if (strGroup2 != null) {
            j13 += Long.parseLong(strGroup2);
        }
        return j13 * 1000;
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        String str;
        String str2;
        wflxmlrfwp wflxmlrfwpVar2;
        wflxmlrfwp wflxmlrfwpVar3 = wflxmlrfwpVar;
        String str3 = "SubripParser";
        this.f115943ppxfxbqfkf.ntlheqmsrt(bArr, i13 + i14);
        this.f115943ppxfxbqfkf.sopmlzcsov(i13);
        Charset charsetGxszxtbevo = gxszxtbevo(this.f115943ppxfxbqfkf);
        ArrayList arrayList = (zoijcleaowVar.f77833iobyxmoadg == -9223372036854775807L || !zoijcleaowVar.f77834zoijcleaow) ? null : new ArrayList();
        while (true) {
            String strZdlpuopuiu = this.f115943ppxfxbqfkf.zdlpuopuiu(charsetGxszxtbevo);
            if (strZdlpuopuiu == null) {
                break;
            }
            if (strZdlpuopuiu.length() != 0) {
                try {
                    Integer.parseInt(strZdlpuopuiu);
                    String strZdlpuopuiu2 = this.f115943ppxfxbqfkf.zdlpuopuiu(charsetGxszxtbevo);
                    if (strZdlpuopuiu2 == null) {
                        kcexrzcfyt.nufgyqmvbu(str3, "Unexpected end");
                        break;
                    }
                    Matcher matcher = f115941wkgbmnqykc.matcher(strZdlpuopuiu2);
                    if (matcher.matches()) {
                        long jNufgyqmvbu = nufgyqmvbu(matcher, 1);
                        long jNufgyqmvbu2 = nufgyqmvbu(matcher, 6);
                        int i15 = 0;
                        this.f115942iobyxmoadg.setLength(0);
                        this.f115944zoijcleaow.clear();
                        String strZdlpuopuiu3 = this.f115943ppxfxbqfkf.zdlpuopuiu(charsetGxszxtbevo);
                        while (!TextUtils.isEmpty(strZdlpuopuiu3)) {
                            if (this.f115942iobyxmoadg.length() > 0) {
                                this.f115942iobyxmoadg.append("<br>");
                            }
                            this.f115942iobyxmoadg.append(dxjokdxxww(strZdlpuopuiu3, this.f115944zoijcleaow));
                            strZdlpuopuiu3 = this.f115943ppxfxbqfkf.zdlpuopuiu(charsetGxszxtbevo);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f115942iobyxmoadg.toString());
                        while (true) {
                            if (i15 >= this.f115944zoijcleaow.size()) {
                                str2 = null;
                                break;
                            }
                            str2 = (String) this.f115944zoijcleaow.get(i15);
                            if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        long j13 = zoijcleaowVar.f77833iobyxmoadg;
                        if (j13 == -9223372036854775807L || jNufgyqmvbu >= j13) {
                            wflxmlrfwpVar2 = wflxmlrfwpVar;
                            wflxmlrfwpVar2.accept(new eablkybsjg(zdlpuopuiu.istkbnxepw(eablkybsjg(spannedFromHtml, str2)), jNufgyqmvbu, jNufgyqmvbu2 - jNufgyqmvbu));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new eablkybsjg(zdlpuopuiu.istkbnxepw(eablkybsjg(spannedFromHtml, str2)), jNufgyqmvbu, jNufgyqmvbu2 - jNufgyqmvbu));
                            }
                            wflxmlrfwpVar2 = wflxmlrfwpVar;
                        }
                        wflxmlrfwpVar3 = wflxmlrfwpVar2;
                        str3 = str3;
                    } else {
                        str = str3;
                        kcexrzcfyt.nufgyqmvbu(str, "Skipping invalid timing: " + strZdlpuopuiu2);
                        wflxmlrfwpVar3 = wflxmlrfwpVar3;
                        str3 = str;
                    }
                } catch (NumberFormatException unused) {
                    str = str3;
                    kcexrzcfyt.nufgyqmvbu(str, "Skipping invalid index: " + strZdlpuopuiu);
                }
            }
        }
        wflxmlrfwp wflxmlrfwpVar4 = wflxmlrfwpVar3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wflxmlrfwpVar4.accept((eablkybsjg) it.next());
            }
        }
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 1;
    }
}
