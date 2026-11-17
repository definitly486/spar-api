package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private String f12146agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final gg.gtknphoqwx f12147btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final gg.gtknphoqwx f12148draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f12149dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f12150eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gg.gtknphoqwx f12151gtknphoqwx;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f12153iobyxmoadg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final gg.gtknphoqwx f12155nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final gg.gtknphoqwx f12156ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f12157ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f12158rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final gg.gtknphoqwx f12159wflxmlrfwp;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f12161zoijcleaow;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final zoijcleaow f12145vdvldrhtss = new zoijcleaow(null);

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private static final Pattern f12144oxmwwwfdhm = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final Pattern f12143kcexrzcfyt = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f12160wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final gg.gtknphoqwx f12152gxszxtbevo = gg.draadjrbmk.zoijcleaow(new draadjrbmk());

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gg.gtknphoqwx f12154lqeggnwhkg = gg.draadjrbmk.zoijcleaow(new btonecajqb());

    static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {
        btonecajqb() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final Boolean invoke() {
            return Boolean.valueOf((gxszxtbevo.this.esjtqupxsv() == null || Uri.parse(gxszxtbevo.this.esjtqupxsv()).getQuery() == null) ? false : true);
        }
    }

    static final class draadjrbmk extends jyumaefscl implements tg.iobyxmoadg {
        draadjrbmk() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = gxszxtbevo.this.f12150eablkybsjg;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    static final class dxjokdxxww extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Bundle f12164zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(Bundle bundle) {
            super(1);
            this.f12164zdlpuopuiu = bundle;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            zdlpuopuiu.btonecajqb(argName, "argName");
            return Boolean.valueOf(!this.f12164zdlpuopuiu.containsKey(argName));
        }
    }

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {
        eablkybsjg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List list;
            vdvldrhtss vdvldrhtssVarDraadjrbmk = gxszxtbevo.this.draadjrbmk();
            return (vdvldrhtssVarDraadjrbmk == null || (list = (List) vdvldrhtssVarDraadjrbmk.lqeggnwhkg()) == null) ? new ArrayList() : list;
        }
    }

    static final class gtknphoqwx extends jyumaefscl implements tg.iobyxmoadg {
        gtknphoqwx() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = gxszxtbevo.this.f12146agtfadlqog;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.gxszxtbevo$gxszxtbevo, reason: collision with other inner class name */
    static final class C0172gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {
        C0172gxszxtbevo() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final vdvldrhtss invoke() {
            return gxszxtbevo.this.cdpycssgdh();
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final C0173iobyxmoadg f12168wkgbmnqykc = new C0173iobyxmoadg(null);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f12169iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f12170ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f12171zoijcleaow;

        /* JADX INFO: renamed from: androidx.navigation.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C0173iobyxmoadg {
            public /* synthetic */ C0173iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C0173iobyxmoadg() {
            }
        }

        public final gxszxtbevo iobyxmoadg() {
            return new gxszxtbevo(this.f12169iobyxmoadg, this.f12171zoijcleaow, this.f12170ppxfxbqfkf);
        }

        public final iobyxmoadg ppxfxbqfkf(String mimeType) {
            zdlpuopuiu.btonecajqb(mimeType, "mimeType");
            this.f12170ppxfxbqfkf = mimeType;
            return this;
        }

        public final iobyxmoadg wkgbmnqykc(String uriPattern) {
            zdlpuopuiu.btonecajqb(uriPattern, "uriPattern");
            this.f12169iobyxmoadg = uriPattern;
            return this;
        }

        public final iobyxmoadg zoijcleaow(String action) {
            zdlpuopuiu.btonecajqb(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f12171zoijcleaow = action;
            return this;
        }
    }

    static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {
        lqeggnwhkg() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strAgtfadlqog = gxszxtbevo.this.agtfadlqog();
            if (strAgtfadlqog != null) {
                return Pattern.compile(strAgtfadlqog, 2);
            }
            return null;
        }
    }

    static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {
        nufgyqmvbu() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        public final String invoke() {
            vdvldrhtss vdvldrhtssVarDraadjrbmk = gxszxtbevo.this.draadjrbmk();
            if (vdvldrhtssVarDraadjrbmk != null) {
                return (String) vdvldrhtssVarDraadjrbmk.nufgyqmvbu();
            }
            return null;
        }
    }

    private static final class ppxfxbqfkf implements Comparable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private String f12174yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private String f12175zdlpuopuiu;

        public ppxfxbqfkf(String mimeType) {
            List listWflxmlrfwp;
            zdlpuopuiu.btonecajqb(mimeType, "mimeType");
            List listKcexrzcfyt = new rgvfuqvkyq(CardDateFormatTextWatcher.DIVIDER_CHARACTER).kcexrzcfyt(mimeType, 0);
            if (listKcexrzcfyt.isEmpty()) {
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            } else {
                ListIterator listIterator = listKcexrzcfyt.listIterator(listKcexrzcfyt.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listWflxmlrfwp = hg.jyumaefscl.f(listKcexrzcfyt, listIterator.nextIndex() + 1);
                    }
                }
                listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            }
            this.f12175zdlpuopuiu = (String) listWflxmlrfwp.get(0);
            this.f12174yggfygwlhe = (String) listWflxmlrfwp.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(ppxfxbqfkf other) {
            zdlpuopuiu.btonecajqb(other, "other");
            int i13 = zdlpuopuiu.eablkybsjg(this.f12175zdlpuopuiu, other.f12175zdlpuopuiu) ? 2 : 0;
            return zdlpuopuiu.eablkybsjg(this.f12174yggfygwlhe, other.f12174yggfygwlhe) ? i13 + 1 : i13;
        }

        public final String ppxfxbqfkf() {
            return this.f12175zdlpuopuiu;
        }

        public final String zoijcleaow() {
            return this.f12174yggfygwlhe;
        }
    }

    static final class wflxmlrfwp extends jyumaefscl implements tg.iobyxmoadg {
        wflxmlrfwp() {
            super(0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return gxszxtbevo.this.wwaezpbzkn();
        }
    }

    private static final class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f12177iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f12178zoijcleaow = new ArrayList();

        public final void iobyxmoadg(String name) {
            zdlpuopuiu.btonecajqb(name, "name");
            this.f12178zoijcleaow.add(name);
        }

        public final String ppxfxbqfkf() {
            return this.f12177iobyxmoadg;
        }

        public final void wkgbmnqykc(String str) {
            this.f12177iobyxmoadg = str;
        }

        public final List zoijcleaow() {
            return this.f12178zoijcleaow;
        }
    }

    private static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public gxszxtbevo(String str, String str2, String str3) {
        this.f12153iobyxmoadg = str;
        this.f12161zoijcleaow = str2;
        this.f12157ppxfxbqfkf = str3;
        gg.ojitshcjhn ojitshcjhnVar = gg.ojitshcjhn.NONE;
        this.f12155nufgyqmvbu = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new wflxmlrfwp());
        this.f12147btonecajqb = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new C0172gxszxtbevo());
        this.f12151gtknphoqwx = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new eablkybsjg());
        this.f12148draadjrbmk = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new nufgyqmvbu());
        this.f12159wflxmlrfwp = gg.draadjrbmk.zoijcleaow(new lqeggnwhkg());
        this.f12156ojitshcjhn = gg.draadjrbmk.zoijcleaow(new gtknphoqwx());
        lmojexxdyd();
        iozdgvuglv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String agtfadlqog() {
        return (String) this.f12148draadjrbmk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vdvldrhtss cdpycssgdh() {
        String str = this.f12153iobyxmoadg;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f12153iobyxmoadg).getFragment();
        StringBuilder sb3 = new StringBuilder();
        zdlpuopuiu.lqeggnwhkg(fragment);
        lqeggnwhkg(fragment, arrayList, sb3);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "fragRegex.toString()");
        return cqumvgiudr.iobyxmoadg(arrayList, string);
    }

    private final Map cqumvgiudr() {
        return (Map) this.f12155nufgyqmvbu.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vdvldrhtss draadjrbmk() {
        return (vdvldrhtss) this.f12147btonecajqb.getValue();
    }

    private final List gtknphoqwx() {
        return (List) this.f12151gtknphoqwx.getValue();
    }

    private final void iozdgvuglv() {
        if (this.f12157ppxfxbqfkf == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f12157ppxfxbqfkf).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.f12157ppxfxbqfkf + " does not match to required \"type/subtype\" format").toString());
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f12157ppxfxbqfkf);
        this.f12146agtfadlqog = kcexrzcfyt.hcddaimhww("^(" + ppxfxbqfkfVar.ppxfxbqfkf() + "|[*]+)/(" + ppxfxbqfkfVar.zoijcleaow() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final boolean istkbnxepw(Bundle bundle, String str, String str2, androidx.navigation.zoijcleaow zoijcleaowVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (zoijcleaowVar == null) {
            return false;
        }
        androidx.navigation.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        wflxmlrfwpVarIobyxmoadg.eablkybsjg(bundle, str, str2, wflxmlrfwpVarIobyxmoadg.iobyxmoadg(bundle, str));
        return false;
    }

    private final Pattern iwizpuwonk() {
        return (Pattern) this.f12152gxszxtbevo.getValue();
    }

    private final Pattern jyumaefscl() {
        return (Pattern) this.f12156ojitshcjhn.getValue();
    }

    private final void kcexrzcfyt(String str, Bundle bundle, Map map) {
        Pattern patternWflxmlrfwp = wflxmlrfwp();
        Matcher matcher = patternWflxmlrfwp != null ? patternWflxmlrfwp.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List listGtknphoqwx = gtknphoqwx();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listGtknphoqwx, 10));
            int i13 = 0;
            for (Object obj : listGtknphoqwx) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i14));
                androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) map.get(str2);
                try {
                    zdlpuopuiu.dxjokdxxww(value, "value");
                    zynmafqrjb(bundle, str2, value, zoijcleaowVar);
                    arrayList.add(wwaezpbzkn.f37140iobyxmoadg);
                    i13 = i14;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final void lmojexxdyd() {
        if (this.f12153iobyxmoadg == null) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("^");
        if (!f12144oxmwwwfdhm.matcher(this.f12153iobyxmoadg).find()) {
            sb3.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f12153iobyxmoadg);
        matcher.find();
        boolean z13 = false;
        String strSubstring = this.f12153iobyxmoadg.substring(0, matcher.start());
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        lqeggnwhkg(strSubstring, this.f12160wkgbmnqykc, sb3);
        if (!kcexrzcfyt.sopmlzcsov(sb3, ".*", false, 2, null) && !kcexrzcfyt.sopmlzcsov(sb3, "([^/]+?)", false, 2, null)) {
            z13 = true;
        }
        this.f12158rgvfuqvkyq = z13;
        sb3.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "uriRegex.toString()");
        this.f12150eablkybsjg = kcexrzcfyt.hcddaimhww(string, ".*", "\\E.*\\Q", false, 4, null);
    }

    private final void lqeggnwhkg(String str, List list, StringBuilder sb3) {
        Matcher matcher = f12143kcexrzcfyt.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            zdlpuopuiu.nufgyqmvbu(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                sb3.append(Pattern.quote(strSubstring));
            }
            sb3.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
            sb3.append(Pattern.quote(strSubstring2));
        }
    }

    private final boolean oxmwwwfdhm(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : cqumvgiudr().entrySet()) {
            String str = (String) entry.getKey();
            wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.f12149dxjokdxxww && (query = uri.getQuery()) != null && !zdlpuopuiu.eablkybsjg(query, uri.toString())) {
                inputParams = hg.jyumaefscl.eablkybsjg(query);
            }
            zdlpuopuiu.dxjokdxxww(inputParams, "inputParams");
            if (!yadqdtsiqt(inputParams, wkgbmnqykcVar, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final boolean pmvmpeiblj() {
        return ((Boolean) this.f12154lqeggnwhkg.getValue()).booleanValue();
    }

    private final boolean vdvldrhtss(Matcher matcher, Bundle bundle, Map map) {
        List list = this.f12160wkgbmnqykc;
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i14));
            androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) map.get(str);
            try {
                zdlpuopuiu.dxjokdxxww(value, "value");
                zynmafqrjb(bundle, str, value, zoijcleaowVar);
                arrayList.add(wwaezpbzkn.f37140iobyxmoadg);
                i13 = i14;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final Pattern wflxmlrfwp() {
        return (Pattern) this.f12159wflxmlrfwp.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map wwaezpbzkn() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!pmvmpeiblj()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.f12153iobyxmoadg);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb3 = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.f12153iobyxmoadg + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            zdlpuopuiu.dxjokdxxww(queryParams, "queryParams");
            String queryParam = (String) hg.jyumaefscl.weqkydbzbr(queryParams);
            if (queryParam == null) {
                this.f12149dxjokdxxww = true;
                queryParam = paramName;
            }
            Matcher matcher = f12143kcexrzcfyt.matcher(queryParam);
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
            int iEnd = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                zdlpuopuiu.nufgyqmvbu(strGroup, "null cannot be cast to non-null type kotlin.String");
                wkgbmnqykcVar.iobyxmoadg(strGroup);
                zdlpuopuiu.dxjokdxxww(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                sb3.append(Pattern.quote(strSubstring));
                sb3.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                zdlpuopuiu.dxjokdxxww(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                zdlpuopuiu.dxjokdxxww(strSubstring2, "substring(...)");
                sb3.append(Pattern.quote(strSubstring2));
            }
            String string = sb3.toString();
            zdlpuopuiu.dxjokdxxww(string, "argRegex.toString()");
            wkgbmnqykcVar.wkgbmnqykc(kcexrzcfyt.hcddaimhww(string, ".*", "\\E.*\\Q", false, 4, null));
            zdlpuopuiu.dxjokdxxww(paramName, "paramName");
            linkedHashMap.put(paramName, wkgbmnqykcVar);
        }
        return linkedHashMap;
    }

    private final boolean yadqdtsiqt(List list, wkgbmnqykc wkgbmnqykcVar, Bundle bundle, Map map) {
        Object objValueOf;
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow(new vdvldrhtss[0]);
        Iterator it = wkgbmnqykcVar.zoijcleaow().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) map.get(str);
            androidx.navigation.wflxmlrfwp wflxmlrfwpVarIobyxmoadg = zoijcleaowVar != null ? zoijcleaowVar.iobyxmoadg() : null;
            if ((wflxmlrfwpVarIobyxmoadg instanceof h5.zoijcleaow) && !zoijcleaowVar.zoijcleaow()) {
                wflxmlrfwpVarIobyxmoadg.nufgyqmvbu(bundleZoijcleaow, str, ((h5.zoijcleaow) wflxmlrfwpVarIobyxmoadg).gtknphoqwx());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            String strPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
            Matcher matcher = strPpxfxbqfkf != null ? Pattern.compile(strPpxfxbqfkf, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List listZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
            int i13 = 0;
            for (Object obj : listZoijcleaow) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i14);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    zdlpuopuiu.dxjokdxxww(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                androidx.navigation.zoijcleaow zoijcleaowVar2 = (androidx.navigation.zoijcleaow) map.get(str3);
                try {
                    if (bundleZoijcleaow.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(istkbnxepw(bundleZoijcleaow, str3, strGroup, zoijcleaowVar2));
                    } else {
                        zynmafqrjb(bundleZoijcleaow, str3, strGroup, zoijcleaowVar2);
                        objValueOf = wwaezpbzkn.f37140iobyxmoadg;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = wwaezpbzkn.f37140iobyxmoadg;
                }
                arrayList.add(objValueOf);
                i13 = i14;
            }
        }
        bundle.putAll(bundleZoijcleaow);
        return true;
    }

    private final void zynmafqrjb(Bundle bundle, String str, String str2, androidx.navigation.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg().wkgbmnqykc(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    public final List btonecajqb() {
        List list = this.f12160wkgbmnqykc;
        Collection collectionValues = cqumvgiudr().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            hg.jyumaefscl.istkbnxepw(arrayList, ((wkgbmnqykc) it.next()).zoijcleaow());
        }
        return hg.jyumaefscl.ixidwrxhsl(hg.jyumaefscl.ixidwrxhsl(list, arrayList), gtknphoqwx());
    }

    public final String dxjokdxxww() {
        return this.f12161zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f12153iobyxmoadg, gxszxtbevoVar.f12153iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f12161zoijcleaow, gxszxtbevoVar.f12161zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f12157ppxfxbqfkf, gxszxtbevoVar.f12157ppxfxbqfkf);
    }

    public final String esjtqupxsv() {
        return this.f12153iobyxmoadg;
    }

    public int hashCode() {
        String str = this.f12153iobyxmoadg;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f12161zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12157ppxfxbqfkf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean lereixgezr() {
        return this.f12158rgvfuqvkyq;
    }

    public final int nufgyqmvbu(Uri uri) {
        if (uri == null || this.f12153iobyxmoadg == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.f12153iobyxmoadg).getPathSegments();
        zdlpuopuiu.dxjokdxxww(requestedPathSegments, "requestedPathSegments");
        zdlpuopuiu.dxjokdxxww(uriPathSegments, "uriPathSegments");
        return hg.jyumaefscl.tbqsvytpvh(requestedPathSegments, uriPathSegments).size();
    }

    public final Bundle ojitshcjhn(Uri deepLink, Map arguments) {
        zdlpuopuiu.btonecajqb(deepLink, "deepLink");
        zdlpuopuiu.btonecajqb(arguments, "arguments");
        Pattern patternIwizpuwonk = iwizpuwonk();
        Matcher matcher = patternIwizpuwonk != null ? patternIwizpuwonk.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!vdvldrhtss(matcher, bundle, arguments)) {
            return null;
        }
        if (pmvmpeiblj() && !oxmwwwfdhm(deepLink, bundle, arguments)) {
            return null;
        }
        kcexrzcfyt(deepLink.getFragment(), bundle, arguments);
        if (h5.eablkybsjg.iobyxmoadg(arguments, new dxjokdxxww(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle rgvfuqvkyq(Uri uri, Map arguments) {
        zdlpuopuiu.btonecajqb(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternIwizpuwonk = iwizpuwonk();
        Matcher matcher = patternIwizpuwonk != null ? patternIwizpuwonk.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        vdvldrhtss(matcher, bundle, arguments);
        if (pmvmpeiblj()) {
            oxmwwwfdhm(uri, bundle, arguments);
        }
        return bundle;
    }

    public final int yggfygwlhe(String mimeType) {
        zdlpuopuiu.btonecajqb(mimeType, "mimeType");
        if (this.f12157ppxfxbqfkf != null) {
            Pattern patternJyumaefscl = jyumaefscl();
            zdlpuopuiu.lqeggnwhkg(patternJyumaefscl);
            if (patternJyumaefscl.matcher(mimeType).matches()) {
                return new ppxfxbqfkf(this.f12157ppxfxbqfkf).compareTo(new ppxfxbqfkf(mimeType));
            }
        }
        return -1;
    }

    public final String zdlpuopuiu() {
        return this.f12157ppxfxbqfkf;
    }
}
