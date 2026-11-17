package u4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q4.eablkybsjg;
import q4.oxmwwwfdhm;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements oxmwwwfdhm {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Pattern f112632lqeggnwhkg = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f112635iobyxmoadg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Map f112637wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f112638zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float f112633eablkybsjg = -3.4028235E38f;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float f112634gxszxtbevo = -3.4028235E38f;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f112636ppxfxbqfkf = new yadqdtsiqt();

    public zoijcleaow(List list) {
        if (list == null || list.isEmpty()) {
            this.f112635iobyxmoadg = false;
            this.f112638zoijcleaow = null;
            return;
        }
        this.f112635iobyxmoadg = true;
        String strLmojexxdyd = stevsuqkhv.lmojexxdyd((byte[]) list.get(0));
        y2.iobyxmoadg.iobyxmoadg(strLmojexxdyd.startsWith("Format:"));
        this.f112638zoijcleaow = (iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadg.iobyxmoadg(strLmojexxdyd));
        gtknphoqwx(new yadqdtsiqt((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    private static long agtfadlqog(String str) {
        Matcher matcher = f112632lqeggnwhkg.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) stevsuqkhv.nufgyqmvbu(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) stevsuqkhv.nufgyqmvbu(matcher.group(2))) * 60000000) + (Long.parseLong((String) stevsuqkhv.nufgyqmvbu(matcher.group(3))) * 1000000) + (Long.parseLong((String) stevsuqkhv.nufgyqmvbu(matcher.group(4))) * DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
        }
        return -9223372036854775807L;
    }

    private void btonecajqb(yadqdtsiqt yadqdtsiqtVar, List list, List list2, Charset charset) {
        iobyxmoadg iobyxmoadgVarIobyxmoadg = this.f112635iobyxmoadg ? this.f112638zoijcleaow : null;
        while (true) {
            String strZdlpuopuiu = yadqdtsiqtVar.zdlpuopuiu(charset);
            if (strZdlpuopuiu == null) {
                return;
            }
            if (strZdlpuopuiu.startsWith("Format:")) {
                iobyxmoadgVarIobyxmoadg = iobyxmoadg.iobyxmoadg(strZdlpuopuiu);
            } else if (strZdlpuopuiu.startsWith("Dialogue:")) {
                if (iobyxmoadgVarIobyxmoadg == null) {
                    kcexrzcfyt.nufgyqmvbu("SsaParser", "Skipping dialogue line before complete format: " + strZdlpuopuiu);
                } else {
                    dxjokdxxww(strZdlpuopuiu, iobyxmoadgVarIobyxmoadg, list, list2);
                }
            }
        }
    }

    private void draadjrbmk(yadqdtsiqt yadqdtsiqtVar, Charset charset) {
        while (true) {
            String strZdlpuopuiu = yadqdtsiqtVar.zdlpuopuiu(charset);
            if (strZdlpuopuiu == null) {
                return;
            }
            if (yadqdtsiqtVar.iobyxmoadg() != 0 && yadqdtsiqtVar.nufgyqmvbu(charset) == '[') {
                return;
            }
            String[] strArrSplit = strZdlpuopuiu.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (strArrSplit.length == 2) {
                String strEablkybsjg = xa.zoijcleaow.eablkybsjg(strArrSplit[0].trim());
                strEablkybsjg.hashCode();
                if (strEablkybsjg.equals("playresx")) {
                    this.f112633eablkybsjg = Float.parseFloat(strArrSplit[1].trim());
                } else if (strEablkybsjg.equals("playresy")) {
                    try {
                        this.f112634gxszxtbevo = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private void dxjokdxxww(String str, iobyxmoadg iobyxmoadgVar, List list, List list2) {
        int i13;
        y2.iobyxmoadg.iobyxmoadg(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(StringUtils.COMMA, iobyxmoadgVar.f112600eablkybsjg);
        if (strArrSplit.length != iobyxmoadgVar.f112600eablkybsjg) {
            kcexrzcfyt.nufgyqmvbu("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long jAgtfadlqog = agtfadlqog(strArrSplit[iobyxmoadgVar.f112601iobyxmoadg]);
        if (jAgtfadlqog == -9223372036854775807L) {
            kcexrzcfyt.nufgyqmvbu("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long jAgtfadlqog2 = agtfadlqog(strArrSplit[iobyxmoadgVar.f112604zoijcleaow]);
        if (jAgtfadlqog2 == -9223372036854775807L || jAgtfadlqog2 <= jAgtfadlqog) {
            kcexrzcfyt.nufgyqmvbu("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.f112637wkgbmnqykc;
        ppxfxbqfkf ppxfxbqfkfVar = (map == null || (i13 = iobyxmoadgVar.f112602ppxfxbqfkf) == -1) ? null : (ppxfxbqfkf) map.get(strArrSplit[i13].trim());
        String str2 = strArrSplit[iobyxmoadgVar.f112603wkgbmnqykc];
        x2.iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(ppxfxbqfkf.zoijcleaow.wkgbmnqykc(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.zoijcleaow(str2), this.f112633eablkybsjg, this.f112634gxszxtbevo);
        int iEablkybsjg = eablkybsjg(jAgtfadlqog2, list2, list);
        for (int iEablkybsjg2 = eablkybsjg(jAgtfadlqog, list2, list); iEablkybsjg2 < iEablkybsjg; iEablkybsjg2++) {
            ((List) list.get(iEablkybsjg2)).add(iobyxmoadgVarLqeggnwhkg);
        }
    }

    private static int eablkybsjg(long j13, List list, List list2) {
        int i13;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i13 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j13) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j13) {
                i13 = size + 1;
                break;
            }
            size--;
        }
        list.add(i13, Long.valueOf(j13));
        list2.add(i13, i13 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i13 - 1)));
        return i13;
    }

    private void gtknphoqwx(yadqdtsiqt yadqdtsiqtVar, Charset charset) {
        while (true) {
            String strZdlpuopuiu = yadqdtsiqtVar.zdlpuopuiu(charset);
            if (strZdlpuopuiu == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZdlpuopuiu)) {
                draadjrbmk(yadqdtsiqtVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZdlpuopuiu)) {
                this.f112637wkgbmnqykc = wflxmlrfwp(yadqdtsiqtVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strZdlpuopuiu)) {
                kcexrzcfyt.gxszxtbevo("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZdlpuopuiu)) {
                return;
            }
        }
    }

    private static float gxszxtbevo(int i13) {
        if (i13 == 0) {
            return 0.05f;
        }
        if (i13 != 1) {
            return i13 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static x2.iobyxmoadg lqeggnwhkg(String str, ppxfxbqfkf ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow zoijcleaowVar, float f13, float f14) {
        SpannableString spannableString = new SpannableString(str);
        x2.iobyxmoadg.zoijcleaow zoijcleaowVarOjitshcjhn = new x2.iobyxmoadg.zoijcleaow().ojitshcjhn(spannableString);
        if (ppxfxbqfkfVar != null) {
            if (ppxfxbqfkfVar.f112612ppxfxbqfkf != null) {
                spannableString.setSpan(new ForegroundColorSpan(ppxfxbqfkfVar.f112612ppxfxbqfkf.intValue()), 0, spannableString.length(), 33);
            }
            if (ppxfxbqfkfVar.f112605btonecajqb == 3 && ppxfxbqfkfVar.f112613wkgbmnqykc != null) {
                spannableString.setSpan(new BackgroundColorSpan(ppxfxbqfkfVar.f112613wkgbmnqykc.intValue()), 0, spannableString.length(), 33);
            }
            float f15 = ppxfxbqfkfVar.f112607eablkybsjg;
            if (f15 != -3.4028235E38f && f14 != -3.4028235E38f) {
                zoijcleaowVarOjitshcjhn.vdvldrhtss(f15 / f14, 1);
            }
            boolean z13 = ppxfxbqfkfVar.f112608gxszxtbevo;
            if (z13 && ppxfxbqfkfVar.f112610lqeggnwhkg) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z13) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ppxfxbqfkfVar.f112610lqeggnwhkg) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ppxfxbqfkfVar.f112611nufgyqmvbu) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ppxfxbqfkfVar.f112606dxjokdxxww) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i13 = zoijcleaowVar.f112630iobyxmoadg;
        if (i13 == -1) {
            i13 = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.f112614zoijcleaow : -1;
        }
        zoijcleaowVarOjitshcjhn.rgvfuqvkyq(vdvldrhtss(i13)).draadjrbmk(rgvfuqvkyq(i13)).dxjokdxxww(ojitshcjhn(i13));
        PointF pointF = zoijcleaowVar.f112631zoijcleaow;
        if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
            zoijcleaowVarOjitshcjhn.gtknphoqwx(gxszxtbevo(zoijcleaowVarOjitshcjhn.wkgbmnqykc()));
            zoijcleaowVarOjitshcjhn.nufgyqmvbu(gxszxtbevo(zoijcleaowVarOjitshcjhn.ppxfxbqfkf()), 0);
        } else {
            zoijcleaowVarOjitshcjhn.gtknphoqwx(pointF.x / f13);
            zoijcleaowVarOjitshcjhn.nufgyqmvbu(zoijcleaowVar.f112631zoijcleaow.y / f14, 0);
        }
        return zoijcleaowVarOjitshcjhn.iobyxmoadg();
    }

    private Charset nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar) {
        Charset charsetKegysxyocb = yadqdtsiqtVar.kegysxyocb();
        return charsetKegysxyocb != null ? charsetKegysxyocb : StandardCharsets.UTF_8;
    }

    private static int ojitshcjhn(int i13) {
        switch (i13) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                kcexrzcfyt.nufgyqmvbu("SsaParser", "Unknown alignment: " + i13);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int rgvfuqvkyq(int i13) {
        switch (i13) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                kcexrzcfyt.nufgyqmvbu("SsaParser", "Unknown alignment: " + i13);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static Layout.Alignment vdvldrhtss(int i13) {
        switch (i13) {
            case -1:
                return null;
            case 0:
            default:
                kcexrzcfyt.nufgyqmvbu("SsaParser", "Unknown alignment: " + i13);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static Map wflxmlrfwp(yadqdtsiqt yadqdtsiqtVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = null;
        while (true) {
            String strZdlpuopuiu = yadqdtsiqtVar.zdlpuopuiu(charset);
            if (strZdlpuopuiu == null || (yadqdtsiqtVar.iobyxmoadg() != 0 && yadqdtsiqtVar.nufgyqmvbu(charset) == '[')) {
                break;
            }
            if (strZdlpuopuiu.startsWith("Format:")) {
                iobyxmoadgVarIobyxmoadg = ppxfxbqfkf.iobyxmoadg.iobyxmoadg(strZdlpuopuiu);
            } else if (strZdlpuopuiu.startsWith("Style:")) {
                if (iobyxmoadgVarIobyxmoadg == null) {
                    kcexrzcfyt.nufgyqmvbu("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + strZdlpuopuiu);
                } else {
                    ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = ppxfxbqfkf.zoijcleaow(strZdlpuopuiu, iobyxmoadgVarIobyxmoadg);
                    if (ppxfxbqfkfVarZoijcleaow != null) {
                        linkedHashMap.put(ppxfxbqfkfVarZoijcleaow.f112609iobyxmoadg, ppxfxbqfkfVarZoijcleaow);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f112636ppxfxbqfkf.ntlheqmsrt(bArr, i13 + i14);
        this.f112636ppxfxbqfkf.sopmlzcsov(i13);
        Charset charsetNufgyqmvbu = nufgyqmvbu(this.f112636ppxfxbqfkf);
        if (!this.f112635iobyxmoadg) {
            gtknphoqwx(this.f112636ppxfxbqfkf, charsetNufgyqmvbu);
        }
        btonecajqb(this.f112636ppxfxbqfkf, arrayList3, arrayList4, charsetNufgyqmvbu);
        ArrayList arrayList5 = (zoijcleaowVar.f77833iobyxmoadg == -9223372036854775807L || !zoijcleaowVar.f77834zoijcleaow) ? null : new ArrayList();
        int i15 = 0;
        while (i15 < arrayList3.size()) {
            List list = (List) arrayList3.get(i15);
            if (list.isEmpty() && i15 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i15 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = ((Long) arrayList4.get(i15)).longValue();
                long jLongValue2 = ((Long) arrayList4.get(i15 + 1)).longValue() - ((Long) arrayList4.get(i15)).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j13 = zoijcleaowVar.f77833iobyxmoadg;
                if (j13 == -9223372036854775807L || jLongValue >= j13) {
                    wflxmlrfwpVar.accept(new eablkybsjg(list, jLongValue, jLongValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new eablkybsjg(list, jLongValue, jLongValue2));
                }
            }
            i15++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                wflxmlrfwpVar.accept((eablkybsjg) it.next());
            }
        }
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 1;
    }
}
