package z4;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f127737ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Map f127738wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Pattern f127736iobyxmoadg = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Pattern f127739zoijcleaow = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: z4.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    private static final class C3264eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public CharSequence f127748ppxfxbqfkf;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public long f127745iobyxmoadg = 0;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f127750zoijcleaow = 0;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public int f127749wkgbmnqykc = 2;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public float f127742eablkybsjg = -3.4028235E38f;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public int f127744gxszxtbevo = 1;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        public int f127746lqeggnwhkg = 0;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public float f127747nufgyqmvbu = -3.4028235E38f;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public int f127741dxjokdxxww = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public float f127740btonecajqb = 1.0f;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public int f127743gtknphoqwx = Integer.MIN_VALUE;

        private static float eablkybsjg(int i13) {
            if (i13 != 4) {
                return i13 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int gxszxtbevo(int i13) {
            if (i13 == 1) {
                return 0;
            }
            if (i13 == 3) {
                return 2;
            }
            if (i13 != 4) {
                return i13 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment ppxfxbqfkf(int i13) {
            if (i13 != 1) {
                if (i13 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Unknown textAlignment: " + i13);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float wkgbmnqykc(int i13, float f13) {
            if (i13 == 0) {
                return 1.0f - f13;
            }
            if (i13 == 1) {
                return f13 <= 0.5f ? f13 * 2.0f : (1.0f - f13) * 2.0f;
            }
            if (i13 == 2) {
                return f13;
            }
            throw new IllegalStateException(String.valueOf(i13));
        }

        private static float zoijcleaow(float f13, int i13) {
            if (f13 != -3.4028235E38f && i13 == 0 && (f13 < 0.0f || f13 > 1.0f)) {
                return 1.0f;
            }
            if (f13 != -3.4028235E38f) {
                return f13;
            }
            return i13 == 0 ? 1.0f : -3.4028235E38f;
        }

        public z4.wkgbmnqykc iobyxmoadg() {
            return new z4.wkgbmnqykc(lqeggnwhkg().iobyxmoadg(), this.f127745iobyxmoadg, this.f127750zoijcleaow);
        }

        public x2.iobyxmoadg.zoijcleaow lqeggnwhkg() {
            float fEablkybsjg = this.f127747nufgyqmvbu;
            if (fEablkybsjg == -3.4028235E38f) {
                fEablkybsjg = eablkybsjg(this.f127749wkgbmnqykc);
            }
            int iGxszxtbevo = this.f127741dxjokdxxww;
            if (iGxszxtbevo == Integer.MIN_VALUE) {
                iGxszxtbevo = gxszxtbevo(this.f127749wkgbmnqykc);
            }
            x2.iobyxmoadg.zoijcleaow zoijcleaowVarOxmwwwfdhm = new x2.iobyxmoadg.zoijcleaow().rgvfuqvkyq(ppxfxbqfkf(this.f127749wkgbmnqykc)).nufgyqmvbu(zoijcleaow(this.f127742eablkybsjg, this.f127744gxszxtbevo), this.f127744gxszxtbevo).dxjokdxxww(this.f127746lqeggnwhkg).gtknphoqwx(fEablkybsjg).draadjrbmk(iGxszxtbevo).agtfadlqog(Math.min(this.f127740btonecajqb, wkgbmnqykc(iGxszxtbevo, fEablkybsjg))).oxmwwwfdhm(this.f127743gtknphoqwx);
            CharSequence charSequence = this.f127748ppxfxbqfkf;
            if (charSequence != null) {
                zoijcleaowVarOxmwwwfdhm.ojitshcjhn(charSequence);
            }
            return zoijcleaowVarOxmwwwfdhm;
        }
    }

    private static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f127751iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final String f127752ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final Set f127753wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f127754zoijcleaow;

        private ppxfxbqfkf(String str, int i13, String str2, Set set) {
            this.f127754zoijcleaow = i13;
            this.f127751iobyxmoadg = str;
            this.f127752ppxfxbqfkf = str2;
            this.f127753wkgbmnqykc = set;
        }

        public static ppxfxbqfkf iobyxmoadg(String str, int i13) {
            String str2;
            String strTrim = str.trim();
            y2.iobyxmoadg.iobyxmoadg(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrK = stevsuqkhv.k(strTrim, "\\.");
            String str3 = strArrK[0];
            HashSet hashSet = new HashSet();
            for (int i14 = 1; i14 < strArrK.length; i14++) {
                hashSet.add(strArrK[i14]);
            }
            return new ppxfxbqfkf(str3, i13, str2, hashSet);
        }

        public static ppxfxbqfkf zoijcleaow() {
            return new ppxfxbqfkf("", 0, "", Collections.emptySet());
        }
    }

    private static final class wkgbmnqykc implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final z4.ppxfxbqfkf f127755yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f127756zdlpuopuiu;

        public wkgbmnqykc(int i13, z4.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f127756zdlpuopuiu = i13;
            this.f127755yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
            return Integer.compare(this.f127756zdlpuopuiu, wkgbmnqykcVar.f127756zdlpuopuiu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private static final Comparator f127757ppxfxbqfkf = new Comparator() { // from class: z4.gxszxtbevo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return eablkybsjg.zoijcleaow.eablkybsjg((eablkybsjg.zoijcleaow) obj, (eablkybsjg.zoijcleaow) obj2);
            }
        };

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f127758iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f127759zoijcleaow;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int eablkybsjg(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
            return Integer.compare(zoijcleaowVar.f127758iobyxmoadg.f127754zoijcleaow, zoijcleaowVar2.f127758iobyxmoadg.f127754zoijcleaow);
        }

        private zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, int i13) {
            this.f127758iobyxmoadg = ppxfxbqfkfVar;
            this.f127759zoijcleaow = i13;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f127737ppxfxbqfkf = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f127738wkgbmnqykc = Collections.unmodifiableMap(map2);
    }

    private static z4.wkgbmnqykc agtfadlqog(String str, Matcher matcher, yadqdtsiqt yadqdtsiqtVar, List list) {
        C3264eablkybsjg c3264eablkybsjg = new C3264eablkybsjg();
        try {
            c3264eablkybsjg.f127745iobyxmoadg = nufgyqmvbu.ppxfxbqfkf((String) y2.iobyxmoadg.eablkybsjg(matcher.group(1)));
            c3264eablkybsjg.f127750zoijcleaow = nufgyqmvbu.ppxfxbqfkf((String) y2.iobyxmoadg.eablkybsjg(matcher.group(2)));
            vdvldrhtss((String) y2.iobyxmoadg.eablkybsjg(matcher.group(3)), c3264eablkybsjg);
            StringBuilder sb3 = new StringBuilder();
            String strKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
            while (!TextUtils.isEmpty(strKcexrzcfyt)) {
                if (sb3.length() > 0) {
                    sb3.append("\n");
                }
                sb3.append(strKcexrzcfyt.trim());
                strKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
            }
            c3264eablkybsjg.f127748ppxfxbqfkf = oxmwwwfdhm(str, sb3.toString(), list);
            return c3264eablkybsjg.iobyxmoadg();
        } catch (IllegalArgumentException unused) {
            kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static int btonecajqb(List list, String str, ppxfxbqfkf ppxfxbqfkfVar) {
        List listDxjokdxxww = dxjokdxxww(list, str, ppxfxbqfkfVar);
        for (int i13 = 0; i13 < listDxjokdxxww.size(); i13++) {
            z4.ppxfxbqfkf ppxfxbqfkfVar2 = ((wkgbmnqykc) listDxjokdxxww.get(i13)).f127755yggfygwlhe;
            if (ppxfxbqfkfVar2.lqeggnwhkg() != -1) {
                return ppxfxbqfkfVar2.lqeggnwhkg();
            }
        }
        return -1;
    }

    private static int cqumvgiudr(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    private static boolean draadjrbmk(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    private static List dxjokdxxww(List list, String str, ppxfxbqfkf ppxfxbqfkfVar) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            z4.ppxfxbqfkf ppxfxbqfkfVar2 = (z4.ppxfxbqfkf) list.get(i13);
            int iNufgyqmvbu = ppxfxbqfkfVar2.nufgyqmvbu(str, ppxfxbqfkfVar.f127751iobyxmoadg, ppxfxbqfkfVar.f127753wkgbmnqykc, ppxfxbqfkfVar.f127752ppxfxbqfkf);
            if (iNufgyqmvbu > 0) {
                arrayList.add(new wkgbmnqykc(iNufgyqmvbu, ppxfxbqfkfVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void eablkybsjg(SpannableStringBuilder spannableStringBuilder, z4.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        if (ppxfxbqfkfVar == null) {
            return;
        }
        if (ppxfxbqfkfVar.dxjokdxxww() != -1) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new StyleSpan(ppxfxbqfkfVar.dxjokdxxww()), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.draadjrbmk()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.wflxmlrfwp()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.gtknphoqwx()) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new ForegroundColorSpan(ppxfxbqfkfVar.ppxfxbqfkf()), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.btonecajqb()) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new BackgroundColorSpan(ppxfxbqfkfVar.iobyxmoadg()), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.wkgbmnqykc() != null) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new TypefaceSpan(ppxfxbqfkfVar.wkgbmnqykc()), i13, i14, 33);
        }
        int iGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
        if (iGxszxtbevo == 1) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new AbsoluteSizeSpan((int) ppxfxbqfkfVar.eablkybsjg(), true), i13, i14, 33);
        } else if (iGxszxtbevo == 2) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new RelativeSizeSpan(ppxfxbqfkfVar.eablkybsjg()), i13, i14, 33);
        } else if (iGxszxtbevo == 3) {
            x2.lqeggnwhkg.zoijcleaow(spannableStringBuilder, new RelativeSizeSpan(ppxfxbqfkfVar.eablkybsjg() / 100.0f), i13, i14, 33);
        }
        if (ppxfxbqfkfVar.zoijcleaow()) {
            spannableStringBuilder.setSpan(new x2.wkgbmnqykc(), i13, i14, 33);
        }
    }

    private static String gtknphoqwx(String str) {
        String strTrim = str.trim();
        y2.iobyxmoadg.iobyxmoadg(!strTrim.isEmpty());
        return stevsuqkhv.l(strTrim, "[ \\.]")[0];
    }

    private static void gxszxtbevo(SpannableStringBuilder spannableStringBuilder, String str, int i13, int i14) {
        spannableStringBuilder.setSpan(new x2.dxjokdxxww(str), i13, i14, 33);
    }

    private static void iobyxmoadg(SpannableStringBuilder spannableStringBuilder, Set set, int i13, int i14) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f127737ppxfxbqfkf;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i13, i14, 33);
            } else {
                Map map2 = f127738wkgbmnqykc;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i13, i14, 33);
                }
            }
        }
    }

    private static int iwizpuwonk(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    private static void jyumaefscl(String str, C3264eablkybsjg c3264eablkybsjg) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c3264eablkybsjg.f127741dxjokdxxww = yggfygwlhe(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        c3264eablkybsjg.f127747nufgyqmvbu = nufgyqmvbu.zoijcleaow(str);
    }

    private static int kcexrzcfyt(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static int lqeggnwhkg(String str, int i13) {
        int iIndexOf = str.indexOf(62, i13);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static int nufgyqmvbu(int i13, int i14, int i15) {
        if (i13 != -1) {
            return i13;
        }
        if (i14 != -1) {
            return i14;
        }
        if (i15 != -1) {
            return i15;
        }
        throw new IllegalArgumentException();
    }

    public static z4.wkgbmnqykc ojitshcjhn(yadqdtsiqt yadqdtsiqtVar, List list) {
        String strKcexrzcfyt = yadqdtsiqtVar.kcexrzcfyt();
        if (strKcexrzcfyt == null) {
            return null;
        }
        Pattern pattern = f127736iobyxmoadg;
        Matcher matcher = pattern.matcher(strKcexrzcfyt);
        if (matcher.matches()) {
            return agtfadlqog(null, matcher, yadqdtsiqtVar, list);
        }
        String strKcexrzcfyt2 = yadqdtsiqtVar.kcexrzcfyt();
        if (strKcexrzcfyt2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strKcexrzcfyt2);
        if (matcher2.matches()) {
            return agtfadlqog(strKcexrzcfyt.trim(), matcher2, yadqdtsiqtVar, list);
        }
        return null;
    }

    static SpannedString oxmwwwfdhm(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < str2.length()) {
            char cCharAt = str2.charAt(i13);
            if (cCharAt == '&') {
                i13++;
                int iIndexOf = str2.indexOf(59, i13);
                int iIndexOf2 = str2.indexOf(32, i13);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    zoijcleaow(str2.substring(i13, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i13 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i13++;
            } else {
                int iLqeggnwhkg = i13 + 1;
                if (iLqeggnwhkg < str2.length()) {
                    boolean z13 = str2.charAt(iLqeggnwhkg) == '/';
                    iLqeggnwhkg = lqeggnwhkg(str2, iLqeggnwhkg);
                    int i14 = iLqeggnwhkg - 2;
                    boolean z14 = str2.charAt(i14) == '/';
                    int i15 = i13 + (z13 ? 2 : 1);
                    if (!z14) {
                        i14 = iLqeggnwhkg - 1;
                    }
                    String strSubstring = str2.substring(i15, i14);
                    if (!strSubstring.trim().isEmpty()) {
                        String strGtknphoqwx = gtknphoqwx(strSubstring);
                        if (draadjrbmk(strGtknphoqwx)) {
                            if (z13) {
                                while (!arrayDeque.isEmpty()) {
                                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) arrayDeque.pop();
                                    wkgbmnqykc(str, ppxfxbqfkfVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zoijcleaow(ppxfxbqfkfVar, spannableStringBuilder.length()));
                                    }
                                    if (ppxfxbqfkfVar.f127751iobyxmoadg.equals(strGtknphoqwx)) {
                                        break;
                                    }
                                }
                            } else if (!z14) {
                                arrayDeque.push(ppxfxbqfkf.iobyxmoadg(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i13 = iLqeggnwhkg;
            }
        }
        while (!arrayDeque.isEmpty()) {
            wkgbmnqykc(str, (ppxfxbqfkf) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        wkgbmnqykc(str, ppxfxbqfkf.zoijcleaow(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void ppxfxbqfkf(SpannableStringBuilder spannableStringBuilder, String str, ppxfxbqfkf ppxfxbqfkfVar, List list, List list2) {
        int iBtonecajqb = btonecajqb(list2, str, ppxfxbqfkfVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, zoijcleaow.f127757ppxfxbqfkf);
        int i13 = ppxfxbqfkfVar.f127754zoijcleaow;
        int length = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if ("rt".equals(((zoijcleaow) arrayList.get(i14)).f127758iobyxmoadg.f127751iobyxmoadg)) {
                zoijcleaow zoijcleaowVar = (zoijcleaow) arrayList.get(i14);
                int iNufgyqmvbu = nufgyqmvbu(btonecajqb(list2, str, zoijcleaowVar.f127758iobyxmoadg), iBtonecajqb, 1);
                int i15 = zoijcleaowVar.f127758iobyxmoadg.f127754zoijcleaow - length;
                int i16 = zoijcleaowVar.f127759zoijcleaow - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i15, i16);
                spannableStringBuilder.delete(i15, i16);
                spannableStringBuilder.setSpan(new x2.gxszxtbevo(charSequenceSubSequence.toString(), iNufgyqmvbu), i13, i15, 33);
                length += charSequenceSubSequence.length();
                i13 = i15;
            }
        }
    }

    static x2.iobyxmoadg.zoijcleaow rgvfuqvkyq(String str) {
        C3264eablkybsjg c3264eablkybsjg = new C3264eablkybsjg();
        vdvldrhtss(str, c3264eablkybsjg);
        return c3264eablkybsjg.lqeggnwhkg();
    }

    private static void vdvldrhtss(String str, C3264eablkybsjg c3264eablkybsjg) {
        Matcher matcher = f127739zoijcleaow.matcher(str);
        while (matcher.find()) {
            String str2 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(1));
            String str3 = (String) y2.iobyxmoadg.eablkybsjg(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    zdlpuopuiu(str3, c3264eablkybsjg);
                } else if ("align".equals(str2)) {
                    c3264eablkybsjg.f127749wkgbmnqykc = iwizpuwonk(str3);
                } else if ("position".equals(str2)) {
                    jyumaefscl(str3, c3264eablkybsjg);
                } else if ("size".equals(str2)) {
                    c3264eablkybsjg.f127740btonecajqb = nufgyqmvbu.zoijcleaow(str3);
                } else if ("vertical".equals(str2)) {
                    c3264eablkybsjg.f127743gtknphoqwx = cqumvgiudr(str3);
                } else {
                    kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Unknown cue setting " + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3);
                }
            } catch (NumberFormatException unused) {
                kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static x2.iobyxmoadg wflxmlrfwp(CharSequence charSequence) {
        C3264eablkybsjg c3264eablkybsjg = new C3264eablkybsjg();
        c3264eablkybsjg.f127748ppxfxbqfkf = charSequence;
        return c3264eablkybsjg.lqeggnwhkg().iobyxmoadg();
    }

    private static void wkgbmnqykc(String str, ppxfxbqfkf ppxfxbqfkfVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i13 = ppxfxbqfkfVar.f127754zoijcleaow;
        int length = spannableStringBuilder.length();
        String str2 = ppxfxbqfkfVar.f127751iobyxmoadg;
        str2.hashCode();
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case "c":
                iobyxmoadg(spannableStringBuilder, ppxfxbqfkfVar.f127753wkgbmnqykc, i13, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case "v":
                gxszxtbevo(spannableStringBuilder, ppxfxbqfkfVar.f127752ppxfxbqfkf, i13, length);
                break;
            case "ruby":
                ppxfxbqfkf(spannableStringBuilder, str, ppxfxbqfkfVar, list, list2);
                break;
            default:
                return;
        }
        List listDxjokdxxww = dxjokdxxww(list2, str, ppxfxbqfkfVar);
        for (int i14 = 0; i14 < listDxjokdxxww.size(); i14++) {
            eablkybsjg(spannableStringBuilder, ((wkgbmnqykc) listDxjokdxxww.get(i14)).f127755yggfygwlhe, i13, length);
        }
    }

    private static int yggfygwlhe(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    private static void zdlpuopuiu(String str, C3264eablkybsjg c3264eablkybsjg) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            c3264eablkybsjg.f127746lqeggnwhkg = kcexrzcfyt(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c3264eablkybsjg.f127742eablkybsjg = nufgyqmvbu.zoijcleaow(str);
            c3264eablkybsjg.f127744gxszxtbevo = 0;
        } else {
            c3264eablkybsjg.f127742eablkybsjg = Integer.parseInt(str);
            c3264eablkybsjg.f127744gxszxtbevo = 1;
        }
    }

    private static void zoijcleaow(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                kcexrzcfyt.nufgyqmvbu("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }
}
