package hh;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f40304ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final lqeggnwhkg f40305wkgbmnqykc = new lqeggnwhkg(jyumaefscl.rgvfuqvkyq(gxszxtbevo.iobyxmoadg.f40298eablkybsjg, gxszxtbevo.wkgbmnqykc.f40300eablkybsjg, gxszxtbevo.zoijcleaow.f40301eablkybsjg, gxszxtbevo.ppxfxbqfkf.f40299eablkybsjg));

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f40306iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f40307zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg() {
            return lqeggnwhkg.f40305wkgbmnqykc;
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final gxszxtbevo f40308iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f40309zoijcleaow;

        public zoijcleaow(gxszxtbevo kind, int i13) {
            zdlpuopuiu.btonecajqb(kind, "kind");
            this.f40308iobyxmoadg = kind;
            this.f40309zoijcleaow = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f40308iobyxmoadg, zoijcleaowVar.f40308iobyxmoadg) && this.f40309zoijcleaow == zoijcleaowVar.f40309zoijcleaow;
        }

        public int hashCode() {
            return (this.f40308iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f40309zoijcleaow);
        }

        public final gxszxtbevo iobyxmoadg() {
            return this.f40308iobyxmoadg;
        }

        public final gxszxtbevo ppxfxbqfkf() {
            return this.f40308iobyxmoadg;
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f40308iobyxmoadg + ", arity=" + this.f40309zoijcleaow + ')';
        }

        public final int zoijcleaow() {
            return this.f40309zoijcleaow;
        }
    }

    public lqeggnwhkg(List kinds) {
        zdlpuopuiu.btonecajqb(kinds, "kinds");
        this.f40306iobyxmoadg = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            ii.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = ((gxszxtbevo) obj).zoijcleaow();
            Object arrayList = linkedHashMap.get(ppxfxbqfkfVarZoijcleaow);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(ppxfxbqfkfVarZoijcleaow, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f40307zoijcleaow = linkedHashMap;
    }

    private final Integer wkgbmnqykc(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int iCharAt = str.charAt(i14) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i13 = (i13 * 10) + iCharAt;
        }
        return Integer.valueOf(i13);
    }

    public final zoijcleaow ppxfxbqfkf(ii.ppxfxbqfkf packageFqName, String className) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(className, "className");
        List<gxszxtbevo> list = (List) this.f40307zoijcleaow.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (gxszxtbevo gxszxtbevoVar : list) {
            if (kcexrzcfyt.stevsuqkhv(className, gxszxtbevoVar.iobyxmoadg(), false, 2, null)) {
                String strSubstring = className.substring(gxszxtbevoVar.iobyxmoadg().length());
                zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
                Integer numWkgbmnqykc = wkgbmnqykc(strSubstring);
                if (numWkgbmnqykc != null) {
                    return new zoijcleaow(gxszxtbevoVar, numWkgbmnqykc.intValue());
                }
            }
        }
        return null;
    }

    public final gxszxtbevo zoijcleaow(ii.ppxfxbqfkf packageFqName, String className) {
        zdlpuopuiu.btonecajqb(packageFqName, "packageFqName");
        zdlpuopuiu.btonecajqb(className, "className");
        zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf(packageFqName, className);
        if (zoijcleaowVarPpxfxbqfkf != null) {
            return zoijcleaowVarPpxfxbqfkf.ppxfxbqfkf();
        }
        return null;
    }
}
