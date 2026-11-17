package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.rlfsiqarku;
import androidx.collection.xrmfcynszj;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f12185cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final Map f12186yadqdtsiqt = new LinkedHashMap();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final List f12187cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final xrmfcynszj f12188esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private gg.gtknphoqwx f12189istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private CharSequence f12190iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private String f12191jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Map f12192lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f12193pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private nufgyqmvbu f12194yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f12195zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private String f12196zynmafqrjb;

    static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ String f12197zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(String str) {
            super(0);
            this.f12197zdlpuopuiu = str;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.gxszxtbevo invoke() {
            return new androidx.navigation.gxszxtbevo.iobyxmoadg().wkgbmnqykc(this.f12197zdlpuopuiu).iobyxmoadg();
        }
    }

    static final class gxszxtbevo extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.gxszxtbevo f12198zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        gxszxtbevo(androidx.navigation.gxszxtbevo gxszxtbevoVar) {
            super(1);
            this.f12198zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            zdlpuopuiu.btonecajqb(key, "key");
            return Boolean.valueOf(!this.f12198zdlpuopuiu.btonecajqb().contains(key));
        }
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: androidx.navigation.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0175iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C0175iobyxmoadg f12199zdlpuopuiu = new C0175iobyxmoadg();

            C0175iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final lqeggnwhkg invoke(lqeggnwhkg it) {
                zdlpuopuiu.btonecajqb(it, "it");
                return it.wflxmlrfwp();
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final String iobyxmoadg(String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final lj.btonecajqb ppxfxbqfkf(lqeggnwhkg lqeggnwhkgVar) {
            zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
            return lj.wflxmlrfwp.agtfadlqog(lqeggnwhkgVar, C0175iobyxmoadg.f12199zdlpuopuiu);
        }

        public final String zoijcleaow(Context context, int i13) {
            String strValueOf;
            zdlpuopuiu.btonecajqb(context, "context");
            if (i13 <= 16777215) {
                return String.valueOf(i13);
            }
            try {
                strValueOf = context.getResources().getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i13);
            }
            zdlpuopuiu.dxjokdxxww(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.gxszxtbevo f12200zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(androidx.navigation.gxszxtbevo gxszxtbevoVar) {
            super(1);
            this.f12200zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            zdlpuopuiu.btonecajqb(key, "key");
            return Boolean.valueOf(!this.f12200zdlpuopuiu.btonecajqb().contains(key));
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Bundle f12201zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(Bundle bundle) {
            super(1);
            this.f12201zdlpuopuiu = bundle;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            zdlpuopuiu.btonecajqb(key, "key");
            return Boolean.valueOf(!this.f12201zdlpuopuiu.containsKey(key));
        }
    }

    public static final class zoijcleaow implements Comparable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final boolean f12202cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private final int f12203esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final int f12204iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f12205jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Bundle f12206yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lqeggnwhkg f12207zdlpuopuiu;

        public zoijcleaow(lqeggnwhkg destination, Bundle bundle, boolean z13, int i13, boolean z14, int i14) {
            zdlpuopuiu.btonecajqb(destination, "destination");
            this.f12207zdlpuopuiu = destination;
            this.f12206yggfygwlhe = bundle;
            this.f12205jyumaefscl = z13;
            this.f12204iwizpuwonk = i13;
            this.f12202cqumvgiudr = z14;
            this.f12203esjtqupxsv = i14;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(zoijcleaow other) {
            zdlpuopuiu.btonecajqb(other, "other");
            boolean z13 = this.f12205jyumaefscl;
            if (z13 && !other.f12205jyumaefscl) {
                return 1;
            }
            if (!z13 && other.f12205jyumaefscl) {
                return -1;
            }
            int i13 = this.f12204iwizpuwonk - other.f12204iwizpuwonk;
            if (i13 > 0) {
                return 1;
            }
            if (i13 < 0) {
                return -1;
            }
            Bundle bundle = this.f12206yggfygwlhe;
            if (bundle != null && other.f12206yggfygwlhe == null) {
                return 1;
            }
            if (bundle == null && other.f12206yggfygwlhe != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f12206yggfygwlhe;
                zdlpuopuiu.lqeggnwhkg(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z14 = this.f12202cqumvgiudr;
            if (z14 && !other.f12202cqumvgiudr) {
                return 1;
            }
            if (z14 || !other.f12202cqumvgiudr) {
                return this.f12203esjtqupxsv - other.f12203esjtqupxsv;
            }
            return -1;
        }

        public final Bundle ppxfxbqfkf() {
            return this.f12206yggfygwlhe;
        }

        public final boolean wkgbmnqykc(Bundle bundle) {
            Bundle bundle2;
            Object objIobyxmoadg;
            if (bundle == null || (bundle2 = this.f12206yggfygwlhe) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            zdlpuopuiu.dxjokdxxww(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) this.f12207zdlpuopuiu.f12192lereixgezr.get(key);
                Object objIobyxmoadg2 = null;
                wflxmlrfwp wflxmlrfwpVarIobyxmoadg = zoijcleaowVar != null ? zoijcleaowVar.iobyxmoadg() : null;
                if (wflxmlrfwpVarIobyxmoadg != null) {
                    Bundle bundle3 = this.f12206yggfygwlhe;
                    zdlpuopuiu.dxjokdxxww(key, "key");
                    objIobyxmoadg = wflxmlrfwpVarIobyxmoadg.iobyxmoadg(bundle3, key);
                } else {
                    objIobyxmoadg = null;
                }
                if (wflxmlrfwpVarIobyxmoadg != null) {
                    zdlpuopuiu.dxjokdxxww(key, "key");
                    objIobyxmoadg2 = wflxmlrfwpVarIobyxmoadg.iobyxmoadg(bundle, key);
                }
                if (wflxmlrfwpVarIobyxmoadg != null && !wflxmlrfwpVarIobyxmoadg.btonecajqb(objIobyxmoadg, objIobyxmoadg2)) {
                    return false;
                }
            }
            return true;
        }

        public final lqeggnwhkg zoijcleaow() {
            return this.f12207zdlpuopuiu;
        }
    }

    public lqeggnwhkg(String navigatorName) {
        zdlpuopuiu.btonecajqb(navigatorName, "navigatorName");
        this.f12195zdlpuopuiu = navigatorName;
        this.f12187cqumvgiudr = new ArrayList();
        this.f12188esjtqupxsv = new xrmfcynszj(0, 1, null);
        this.f12192lereixgezr = new LinkedHashMap();
    }

    public static /* synthetic */ int[] gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i13 & 1) != 0) {
            lqeggnwhkgVar2 = null;
        }
        return lqeggnwhkgVar.eablkybsjg(lqeggnwhkgVar2);
    }

    private final boolean ojitshcjhn(androidx.navigation.gxszxtbevo gxszxtbevoVar, Uri uri, Map map) {
        return h5.eablkybsjg.iobyxmoadg(map, new wkgbmnqykc(gxszxtbevoVar.rgvfuqvkyq(uri, map))).isEmpty();
    }

    public final String agtfadlqog() {
        return this.f12196zynmafqrjb;
    }

    public String btonecajqb() {
        String str = this.f12191jyumaefscl;
        return str == null ? String.valueOf(this.f12193pmvmpeiblj) : str;
    }

    public final void cqumvgiudr(String str) {
        if (str == null) {
            jyumaefscl(0);
        } else {
            if (kcexrzcfyt.zfvoamnweg(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strIobyxmoadg = f12185cdpycssgdh.iobyxmoadg(str);
            List listIobyxmoadg = h5.eablkybsjg.iobyxmoadg(this.f12192lereixgezr, new gxszxtbevo(new androidx.navigation.gxszxtbevo.iobyxmoadg().wkgbmnqykc(strIobyxmoadg).iobyxmoadg()));
            if (!listIobyxmoadg.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listIobyxmoadg).toString());
            }
            this.f12189istkbnxepw = gg.draadjrbmk.zoijcleaow(new eablkybsjg(strIobyxmoadg));
            jyumaefscl(strIobyxmoadg.hashCode());
        }
        this.f12196zynmafqrjb = str;
    }

    public final String draadjrbmk() {
        return this.f12195zdlpuopuiu;
    }

    public final Map dxjokdxxww() {
        return tzroggbefp.yggfygwlhe(this.f12192lereixgezr);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public final int[] eablkybsjg(lqeggnwhkg lqeggnwhkgVar) {
        hg.wflxmlrfwp wflxmlrfwpVar = new hg.wflxmlrfwp();
        lqeggnwhkg lqeggnwhkgVar2 = this;
        while (true) {
            zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVar2);
            nufgyqmvbu nufgyqmvbuVar = lqeggnwhkgVar2.f12194yggfygwlhe;
            if ((lqeggnwhkgVar != null ? lqeggnwhkgVar.f12194yggfygwlhe : null) != null) {
                nufgyqmvbu nufgyqmvbuVar2 = lqeggnwhkgVar.f12194yggfygwlhe;
                zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVar2);
                if (nufgyqmvbuVar2.pmvmpeiblj(lqeggnwhkgVar2.f12193pmvmpeiblj) != lqeggnwhkgVar2) {
                    if (nufgyqmvbuVar != null || nufgyqmvbuVar.wwaezpbzkn() != lqeggnwhkgVar2.f12193pmvmpeiblj) {
                        wflxmlrfwpVar.addFirst(lqeggnwhkgVar2);
                    }
                    if (!zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, lqeggnwhkgVar) || nufgyqmvbuVar == null) {
                        break;
                    }
                    lqeggnwhkgVar2 = nufgyqmvbuVar;
                } else {
                    wflxmlrfwpVar.addFirst(lqeggnwhkgVar2);
                    break;
                }
            } else {
                if (nufgyqmvbuVar != null) {
                    wflxmlrfwpVar.addFirst(lqeggnwhkgVar2);
                } else {
                    wflxmlrfwpVar.addFirst(lqeggnwhkgVar2);
                }
                if (!zdlpuopuiu.eablkybsjg(nufgyqmvbuVar, lqeggnwhkgVar)) {
                    break;
                }
                lqeggnwhkgVar2 = nufgyqmvbuVar;
            }
        }
        List listM = hg.jyumaefscl.m(wflxmlrfwpVar);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((lqeggnwhkg) it.next()).f12193pmvmpeiblj));
        }
        return hg.jyumaefscl.l(arrayList);
    }

    public boolean equals(Object obj) {
        boolean z13;
        boolean z14;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        boolean zEablkybsjg = zdlpuopuiu.eablkybsjg(this.f12187cqumvgiudr, lqeggnwhkgVar.f12187cqumvgiudr);
        if (this.f12188esjtqupxsv.ojitshcjhn() != lqeggnwhkgVar.f12188esjtqupxsv.ojitshcjhn()) {
            z13 = false;
            break;
        }
        Iterator it = lj.wflxmlrfwp.lqeggnwhkg(rlfsiqarku.iobyxmoadg(this.f12188esjtqupxsv)).iterator();
        while (true) {
            if (!it.hasNext()) {
                z13 = true;
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (!zdlpuopuiu.eablkybsjg(this.f12188esjtqupxsv.eablkybsjg(iIntValue), lqeggnwhkgVar.f12188esjtqupxsv.eablkybsjg(iIntValue))) {
                z13 = false;
                break;
            }
        }
        if (this.f12192lereixgezr.size() != lqeggnwhkgVar.f12192lereixgezr.size()) {
            z14 = false;
            break;
        }
        Iterator it2 = tzroggbefp.cqumvgiudr(this.f12192lereixgezr).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z14 = true;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (!lqeggnwhkgVar.f12192lereixgezr.containsKey(entry.getKey()) || !zdlpuopuiu.eablkybsjg(lqeggnwhkgVar.f12192lereixgezr.get(entry.getKey()), entry.getValue())) {
                z14 = false;
                break;
            }
        }
        return this.f12193pmvmpeiblj == lqeggnwhkgVar.f12193pmvmpeiblj && zdlpuopuiu.eablkybsjg(this.f12196zynmafqrjb, lqeggnwhkgVar.f12196zynmafqrjb) && zEablkybsjg && z13 && z14;
    }

    public boolean esjtqupxsv() {
        return true;
    }

    public final int gtknphoqwx() {
        return this.f12193pmvmpeiblj;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i13 = this.f12193pmvmpeiblj * 31;
        String str = this.f12196zynmafqrjb;
        int iHashCode = i13 + (str != null ? str.hashCode() : 0);
        for (androidx.navigation.gxszxtbevo gxszxtbevoVar : this.f12187cqumvgiudr) {
            int i14 = iHashCode * 31;
            String strEsjtqupxsv = gxszxtbevoVar.esjtqupxsv();
            int iHashCode2 = (i14 + (strEsjtqupxsv != null ? strEsjtqupxsv.hashCode() : 0)) * 31;
            String strDxjokdxxww = gxszxtbevoVar.dxjokdxxww();
            int iHashCode3 = (iHashCode2 + (strDxjokdxxww != null ? strDxjokdxxww.hashCode() : 0)) * 31;
            String strZdlpuopuiu = gxszxtbevoVar.zdlpuopuiu();
            iHashCode = iHashCode3 + (strZdlpuopuiu != null ? strZdlpuopuiu.hashCode() : 0);
        }
        Iterator itZoijcleaow = rlfsiqarku.zoijcleaow(this.f12188esjtqupxsv);
        while (itZoijcleaow.hasNext()) {
            h5.wkgbmnqykc wkgbmnqykcVar = (h5.wkgbmnqykc) itZoijcleaow.next();
            int iZoijcleaow = ((iHashCode * 31) + wkgbmnqykcVar.zoijcleaow()) * 31;
            gtknphoqwx gtknphoqwxVarPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf();
            iHashCode = iZoijcleaow + (gtknphoqwxVarPpxfxbqfkf != null ? gtknphoqwxVarPpxfxbqfkf.hashCode() : 0);
            Bundle bundleIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
            if (bundleIobyxmoadg != null && (setKeySet = bundleIobyxmoadg.keySet()) != null) {
                zdlpuopuiu.dxjokdxxww(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i15 = iHashCode * 31;
                    Bundle bundleIobyxmoadg2 = wkgbmnqykcVar.iobyxmoadg();
                    zdlpuopuiu.lqeggnwhkg(bundleIobyxmoadg2);
                    Object obj = bundleIobyxmoadg2.get(str2);
                    iHashCode = i15 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.f12192lereixgezr.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            Object obj2 = this.f12192lereixgezr.get(str3);
            iHashCode = iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void iwizpuwonk(nufgyqmvbu nufgyqmvbuVar) {
        this.f12194yggfygwlhe = nufgyqmvbuVar;
    }

    public final void jyumaefscl(int i13) {
        this.f12193pmvmpeiblj = i13;
        this.f12191jyumaefscl = null;
    }

    public void kcexrzcfyt(Context context, AttributeSet attrs) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, i5.iobyxmoadg.Navigator);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        cqumvgiudr(typedArrayObtainAttributes.getString(i5.iobyxmoadg.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(i5.iobyxmoadg.Navigator_android_id)) {
            jyumaefscl(typedArrayObtainAttributes.getResourceId(i5.iobyxmoadg.Navigator_android_id, 0));
            this.f12191jyumaefscl = f12185cdpycssgdh.zoijcleaow(context, this.f12193pmvmpeiblj);
        }
        this.f12190iwizpuwonk = typedArrayObtainAttributes.getText(i5.iobyxmoadg.Navigator_android_label);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainAttributes.recycle();
    }

    public final zoijcleaow oxmwwwfdhm(String route) {
        androidx.navigation.gxszxtbevo gxszxtbevoVar;
        zdlpuopuiu.btonecajqb(route, "route");
        gg.gtknphoqwx gtknphoqwxVar = this.f12189istkbnxepw;
        if (gtknphoqwxVar == null || (gxszxtbevoVar = (androidx.navigation.gxszxtbevo) gtknphoqwxVar.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(f12185cdpycssgdh.iobyxmoadg(route));
        zdlpuopuiu.gxszxtbevo(uri, "Uri.parse(this)");
        Bundle bundleOjitshcjhn = gxszxtbevoVar.ojitshcjhn(uri, this.f12192lereixgezr);
        if (bundleOjitshcjhn == null) {
            return null;
        }
        return new zoijcleaow(this, bundleOjitshcjhn, gxszxtbevoVar.lereixgezr(), gxszxtbevoVar.nufgyqmvbu(uri), false, -1);
    }

    public final void ppxfxbqfkf(androidx.navigation.gxszxtbevo navDeepLink) {
        zdlpuopuiu.btonecajqb(navDeepLink, "navDeepLink");
        List listIobyxmoadg = h5.eablkybsjg.iobyxmoadg(this.f12192lereixgezr, new ppxfxbqfkf(navDeepLink));
        if (listIobyxmoadg.isEmpty()) {
            this.f12187cqumvgiudr.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.esjtqupxsv() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listIobyxmoadg).toString());
    }

    public final boolean rgvfuqvkyq(String route, Bundle bundle) {
        zdlpuopuiu.btonecajqb(route, "route");
        if (zdlpuopuiu.eablkybsjg(this.f12196zynmafqrjb, route)) {
            return true;
        }
        zoijcleaow zoijcleaowVarOxmwwwfdhm = oxmwwwfdhm(route);
        if (zdlpuopuiu.eablkybsjg(this, zoijcleaowVarOxmwwwfdhm != null ? zoijcleaowVarOxmwwwfdhm.zoijcleaow() : null)) {
            return zoijcleaowVarOxmwwwfdhm.wkgbmnqykc(bundle);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("(");
        String str = this.f12191jyumaefscl;
        if (str == null) {
            sb3.append("0x");
            sb3.append(Integer.toHexString(this.f12193pmvmpeiblj));
        } else {
            sb3.append(str);
        }
        sb3.append(")");
        String str2 = this.f12196zynmafqrjb;
        if (str2 != null && !kcexrzcfyt.zfvoamnweg(str2)) {
            sb3.append(" route=");
            sb3.append(this.f12196zynmafqrjb);
        }
        if (this.f12190iwizpuwonk != null) {
            sb3.append(" label=");
            sb3.append(this.f12190iwizpuwonk);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    public zoijcleaow vdvldrhtss(h5.lqeggnwhkg navDeepLinkRequest) {
        zdlpuopuiu.btonecajqb(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f12187cqumvgiudr.isEmpty()) {
            return null;
        }
        zoijcleaow zoijcleaowVar = null;
        for (androidx.navigation.gxszxtbevo gxszxtbevoVar : this.f12187cqumvgiudr) {
            Uri uriPpxfxbqfkf = navDeepLinkRequest.ppxfxbqfkf();
            Bundle bundleOjitshcjhn = uriPpxfxbqfkf != null ? gxszxtbevoVar.ojitshcjhn(uriPpxfxbqfkf, this.f12192lereixgezr) : null;
            int iNufgyqmvbu = gxszxtbevoVar.nufgyqmvbu(uriPpxfxbqfkf);
            String strIobyxmoadg = navDeepLinkRequest.iobyxmoadg();
            boolean z13 = strIobyxmoadg != null && zdlpuopuiu.eablkybsjg(strIobyxmoadg, gxszxtbevoVar.dxjokdxxww());
            String strZoijcleaow = navDeepLinkRequest.zoijcleaow();
            int iYggfygwlhe = strZoijcleaow != null ? gxszxtbevoVar.yggfygwlhe(strZoijcleaow) : -1;
            if (bundleOjitshcjhn == null) {
                if (z13 || iYggfygwlhe > -1) {
                    if (ojitshcjhn(gxszxtbevoVar, uriPpxfxbqfkf, this.f12192lereixgezr)) {
                    }
                }
            }
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(this, bundleOjitshcjhn, gxszxtbevoVar.lereixgezr(), iNufgyqmvbu, z13, iYggfygwlhe);
            if (zoijcleaowVar == null || zoijcleaowVar2.compareTo(zoijcleaowVar) > 0) {
                zoijcleaowVar = zoijcleaowVar2;
            }
        }
        return zoijcleaowVar;
    }

    public final nufgyqmvbu wflxmlrfwp() {
        return this.f12194yggfygwlhe;
    }

    public final Bundle wkgbmnqykc(Bundle bundle) {
        if (bundle == null && this.f12192lereixgezr.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f12192lereixgezr.entrySet()) {
            ((androidx.navigation.zoijcleaow) entry.getValue()).eablkybsjg((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f12192lereixgezr.entrySet()) {
                String str = (String) entry2.getKey();
                androidx.navigation.zoijcleaow zoijcleaowVar = (androidx.navigation.zoijcleaow) entry2.getValue();
                if (!zoijcleaowVar.ppxfxbqfkf() && !zoijcleaowVar.gxszxtbevo(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + zoijcleaowVar.iobyxmoadg().zoijcleaow() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public final void zdlpuopuiu(int i13, h5.wkgbmnqykc action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (esjtqupxsv()) {
            if (i13 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f12188esjtqupxsv.draadjrbmk(i13, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i13 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void zoijcleaow(String argumentName, androidx.navigation.zoijcleaow argument) {
        zdlpuopuiu.btonecajqb(argumentName, "argumentName");
        zdlpuopuiu.btonecajqb(argument, "argument");
        this.f12192lereixgezr.put(argumentName, argument);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(agtfadlqog navigator) {
        this(ojitshcjhn.f12218zoijcleaow.iobyxmoadg(navigator.getClass()));
        zdlpuopuiu.btonecajqb(navigator, "navigator");
    }
}
