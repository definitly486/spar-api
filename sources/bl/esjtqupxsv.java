package bl;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv implements Comparable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final String f16669jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f16670yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final gxszxtbevo f16671zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ esjtqupxsv eablkybsjg(iobyxmoadg iobyxmoadgVar, String str, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = false;
            }
            return iobyxmoadgVar.zoijcleaow(str, z13);
        }

        public static /* synthetic */ esjtqupxsv gxszxtbevo(iobyxmoadg iobyxmoadgVar, Path path, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = false;
            }
            return iobyxmoadgVar.ppxfxbqfkf(path, z13);
        }

        public static /* synthetic */ esjtqupxsv wkgbmnqykc(iobyxmoadg iobyxmoadgVar, File file, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = false;
            }
            return iobyxmoadgVar.iobyxmoadg(file, z13);
        }

        public final esjtqupxsv iobyxmoadg(File file, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(file, "<this>");
            String string = file.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString()");
            return zoijcleaow(string, z13);
        }

        public final esjtqupxsv ppxfxbqfkf(Path path, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(path, "<this>");
            return zoijcleaow(path.toString(), z13);
        }

        public final esjtqupxsv zoijcleaow(String str, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
            return cl.dxjokdxxww.gtknphoqwx(str, z13);
        }

        private iobyxmoadg() {
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(separator, "separator");
        f16669jyumaefscl = separator;
    }

    public esjtqupxsv(gxszxtbevo bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        this.f16671zdlpuopuiu = bytes;
    }

    public final Character agtfadlqog() {
        if (gxszxtbevo.cqumvgiudr(zoijcleaow(), cl.dxjokdxxww.f19964iobyxmoadg, 0, 2, null) != -1 || zoijcleaow().hcddaimhww() < 2 || zoijcleaow().draadjrbmk(1) != 58) {
            return null;
        }
        char cDraadjrbmk = (char) zoijcleaow().draadjrbmk(0);
        if (('a' > cDraadjrbmk || cDraadjrbmk >= '{') && ('A' > cDraadjrbmk || cDraadjrbmk >= '[')) {
            return null;
        }
        return Character.valueOf(cDraadjrbmk);
    }

    public final esjtqupxsv btonecajqb(esjtqupxsv child, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(child, "child");
        return cl.dxjokdxxww.btonecajqb(this, child, z13);
    }

    public final File draadjrbmk() {
        return new File(toString());
    }

    public final esjtqupxsv dxjokdxxww(esjtqupxsv other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkf(), other.ppxfxbqfkf())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List listWkgbmnqykc = wkgbmnqykc();
        List listWkgbmnqykc2 = other.wkgbmnqykc();
        int iMin = Math.min(listWkgbmnqykc.size(), listWkgbmnqykc2.size());
        int i13 = 0;
        while (i13 < iMin && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(listWkgbmnqykc.get(i13), listWkgbmnqykc2.get(i13))) {
            i13++;
        }
        if (i13 == iMin && zoijcleaow().hcddaimhww() == other.zoijcleaow().hcddaimhww()) {
            return iobyxmoadg.eablkybsjg(f16670yggfygwlhe, ".", false, 1, null);
        }
        if (listWkgbmnqykc2.subList(i13, listWkgbmnqykc2.size()).indexOf(cl.dxjokdxxww.f19963eablkybsjg) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        gxszxtbevo gxszxtbevoVarWflxmlrfwp = cl.dxjokdxxww.wflxmlrfwp(other);
        if (gxszxtbevoVarWflxmlrfwp == null && (gxszxtbevoVarWflxmlrfwp = cl.dxjokdxxww.wflxmlrfwp(this)) == null) {
            gxszxtbevoVarWflxmlrfwp = cl.dxjokdxxww.kcexrzcfyt(f16669jyumaefscl);
        }
        int size = listWkgbmnqykc2.size();
        for (int i14 = i13; i14 < size; i14++) {
            ppxfxbqfkfVar.t(cl.dxjokdxxww.f19963eablkybsjg);
            ppxfxbqfkfVar.t(gxszxtbevoVarWflxmlrfwp);
        }
        int size2 = listWkgbmnqykc.size();
        while (i13 < size2) {
            ppxfxbqfkfVar.t((gxszxtbevo) listWkgbmnqykc.get(i13));
            ppxfxbqfkfVar.t(gxszxtbevoVarWflxmlrfwp);
            i13++;
        }
        return cl.dxjokdxxww.vdvldrhtss(ppxfxbqfkfVar, false);
    }

    public final boolean eablkybsjg() {
        return cl.dxjokdxxww.ojitshcjhn(this) != -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof esjtqupxsv) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((esjtqupxsv) obj).zoijcleaow(), zoijcleaow());
    }

    public final esjtqupxsv gtknphoqwx(String child) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(child, "child");
        return cl.dxjokdxxww.btonecajqb(this, cl.dxjokdxxww.vdvldrhtss(new ppxfxbqfkf().metgxyhuhe(child), false), false);
    }

    public final String gxszxtbevo() {
        return lqeggnwhkg().wypolnanlu();
    }

    public int hashCode() {
        return zoijcleaow().hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(esjtqupxsv other) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(other, "other");
        return zoijcleaow().compareTo(other.zoijcleaow());
    }

    public final gxszxtbevo lqeggnwhkg() {
        int iDraadjrbmk = cl.dxjokdxxww.draadjrbmk(this);
        if (iDraadjrbmk != -1) {
            return gxszxtbevo.cllcsxoeiz(zoijcleaow(), iDraadjrbmk + 1, 0, 2, null);
        }
        return (agtfadlqog() == null || zoijcleaow().hcddaimhww() != 2) ? zoijcleaow() : gxszxtbevo.f16673cqumvgiudr;
    }

    public final esjtqupxsv nufgyqmvbu() {
        esjtqupxsv esjtqupxsvVar;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), cl.dxjokdxxww.f19966wkgbmnqykc) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), cl.dxjokdxxww.f19964iobyxmoadg) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), cl.dxjokdxxww.f19967zoijcleaow) || cl.dxjokdxxww.agtfadlqog(this)) {
            return null;
        }
        int iDraadjrbmk = cl.dxjokdxxww.draadjrbmk(this);
        if (iDraadjrbmk != 2 || agtfadlqog() == null) {
            if (iDraadjrbmk == 1 && zoijcleaow().jpowsppfya(cl.dxjokdxxww.f19967zoijcleaow)) {
                return null;
            }
            if (iDraadjrbmk != -1 || agtfadlqog() == null) {
                if (iDraadjrbmk == -1) {
                    return new esjtqupxsv(cl.dxjokdxxww.f19966wkgbmnqykc);
                }
                if (iDraadjrbmk != 0) {
                    return new esjtqupxsv(gxszxtbevo.cllcsxoeiz(zoijcleaow(), 0, iDraadjrbmk, 1, null));
                }
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevo.cllcsxoeiz(zoijcleaow(), 0, 1, 1, null));
            } else {
                if (zoijcleaow().hcddaimhww() == 2) {
                    return null;
                }
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevo.cllcsxoeiz(zoijcleaow(), 0, 2, 1, null));
            }
        } else {
            if (zoijcleaow().hcddaimhww() == 3) {
                return null;
            }
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevo.cllcsxoeiz(zoijcleaow(), 0, 3, 1, null));
        }
        return esjtqupxsvVar;
    }

    public final esjtqupxsv ppxfxbqfkf() {
        int iOjitshcjhn = cl.dxjokdxxww.ojitshcjhn(this);
        if (iOjitshcjhn == -1) {
            return null;
        }
        return new esjtqupxsv(zoijcleaow().hkdspvbjdz(0, iOjitshcjhn));
    }

    public String toString() {
        return zoijcleaow().wypolnanlu();
    }

    public final Path wflxmlrfwp() {
        Path path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(path, "get(toString())");
        return path;
    }

    public final List wkgbmnqykc() {
        ArrayList arrayList = new ArrayList();
        int iOjitshcjhn = cl.dxjokdxxww.ojitshcjhn(this);
        if (iOjitshcjhn == -1) {
            iOjitshcjhn = 0;
        } else if (iOjitshcjhn < zoijcleaow().hcddaimhww() && zoijcleaow().draadjrbmk(iOjitshcjhn) == 92) {
            iOjitshcjhn++;
        }
        int iHcddaimhww = zoijcleaow().hcddaimhww();
        int i13 = iOjitshcjhn;
        while (iOjitshcjhn < iHcddaimhww) {
            if (zoijcleaow().draadjrbmk(iOjitshcjhn) == 47 || zoijcleaow().draadjrbmk(iOjitshcjhn) == 92) {
                arrayList.add(zoijcleaow().hkdspvbjdz(i13, iOjitshcjhn));
                i13 = iOjitshcjhn + 1;
            }
            iOjitshcjhn++;
        }
        if (i13 < zoijcleaow().hcddaimhww()) {
            arrayList.add(zoijcleaow().hkdspvbjdz(i13, zoijcleaow().hcddaimhww()));
        }
        return arrayList;
    }

    public final gxszxtbevo zoijcleaow() {
        return this.f16671zdlpuopuiu;
    }
}
