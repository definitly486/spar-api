package ih;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final HashMap f44258agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final ii.zoijcleaow f44259btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final HashMap f44260draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final ii.zoijcleaow f44261dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f44262eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final HashMap f44263gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ii.zoijcleaow f44264gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f44265iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final ii.ppxfxbqfkf f44266lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final ii.zoijcleaow f44267nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private static final HashMap f44268ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f44269ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private static final HashMap f44270rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private static final List f44271vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final HashMap f44272wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f44273wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String f44274zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ii.zoijcleaow f44275iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ii.zoijcleaow f44276ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ii.zoijcleaow f44277zoijcleaow;

        public iobyxmoadg(ii.zoijcleaow javaClass, ii.zoijcleaow kotlinReadOnly, ii.zoijcleaow kotlinMutable) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaClass, "javaClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinReadOnly, "kotlinReadOnly");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinMutable, "kotlinMutable");
            this.f44275iobyxmoadg = javaClass;
            this.f44277zoijcleaow = kotlinReadOnly;
            this.f44276ppxfxbqfkf = kotlinMutable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44275iobyxmoadg, iobyxmoadgVar.f44275iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44277zoijcleaow, iobyxmoadgVar.f44277zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44276ppxfxbqfkf, iobyxmoadgVar.f44276ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f44275iobyxmoadg.hashCode() * 31) + this.f44277zoijcleaow.hashCode()) * 31) + this.f44276ppxfxbqfkf.hashCode();
        }

        public final ii.zoijcleaow iobyxmoadg() {
            return this.f44275iobyxmoadg;
        }

        public final ii.zoijcleaow ppxfxbqfkf() {
            return this.f44276ppxfxbqfkf;
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f44275iobyxmoadg + ", kotlinReadOnly=" + this.f44277zoijcleaow + ", kotlinMutable=" + this.f44276ppxfxbqfkf + ')';
        }

        public final ii.zoijcleaow wkgbmnqykc() {
            return this.f44275iobyxmoadg;
        }

        public final ii.zoijcleaow zoijcleaow() {
            return this.f44277zoijcleaow;
        }
    }

    static {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        f44265iobyxmoadg = ppxfxbqfkfVar;
        StringBuilder sb3 = new StringBuilder();
        hh.gxszxtbevo.iobyxmoadg iobyxmoadgVar = hh.gxszxtbevo.iobyxmoadg.f40298eablkybsjg;
        sb3.append(iobyxmoadgVar.zoijcleaow());
        sb3.append('.');
        sb3.append(iobyxmoadgVar.iobyxmoadg());
        f44274zoijcleaow = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        hh.gxszxtbevo.zoijcleaow zoijcleaowVar = hh.gxszxtbevo.zoijcleaow.f40301eablkybsjg;
        sb4.append(zoijcleaowVar.zoijcleaow());
        sb4.append('.');
        sb4.append(zoijcleaowVar.iobyxmoadg());
        f44269ppxfxbqfkf = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        hh.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = hh.gxszxtbevo.wkgbmnqykc.f40300eablkybsjg;
        sb5.append(wkgbmnqykcVar.zoijcleaow());
        sb5.append('.');
        sb5.append(wkgbmnqykcVar.iobyxmoadg());
        f44273wkgbmnqykc = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        hh.gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar2 = hh.gxszxtbevo.ppxfxbqfkf.f40299eablkybsjg;
        sb6.append(ppxfxbqfkfVar2.zoijcleaow());
        sb6.append('.');
        sb6.append(ppxfxbqfkfVar2.iobyxmoadg());
        f44262eablkybsjg = sb6.toString();
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar2 = ii.zoijcleaow.f44488wkgbmnqykc;
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(new ii.ppxfxbqfkf("kotlin.jvm.functions.FunctionN"));
        f44264gxszxtbevo = zoijcleaowVarPpxfxbqfkf;
        f44266lqeggnwhkg = zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
        ii.dxjokdxxww dxjokdxxwwVar = ii.dxjokdxxww.f44377iobyxmoadg;
        f44267nufgyqmvbu = dxjokdxxwwVar.gtknphoqwx();
        f44261dxjokdxxww = dxjokdxxwwVar.btonecajqb();
        f44259btonecajqb = ppxfxbqfkfVar.lqeggnwhkg(Class.class);
        f44263gtknphoqwx = new HashMap();
        f44260draadjrbmk = new HashMap();
        f44272wflxmlrfwp = new HashMap();
        f44258agtfadlqog = new HashMap();
        f44268ojitshcjhn = new HashMap();
        f44270rgvfuqvkyq = new HashMap();
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37340sopmlzcsov);
        iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Iterable.class), zoijcleaowVarPpxfxbqfkf2, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf2.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37312jztzpxfvev, zoijcleaowVarPpxfxbqfkf2.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf3 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37345ulzqkzuiru);
        iobyxmoadg iobyxmoadgVar4 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Iterator.class), zoijcleaowVarPpxfxbqfkf3, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf3.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37328okpsazkaxt, zoijcleaowVarPpxfxbqfkf3.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf4 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37281crxdokpmqz);
        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Collection.class), zoijcleaowVarPpxfxbqfkf4, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf4.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37355xrmfcynszj, zoijcleaowVarPpxfxbqfkf4.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf5 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37308jlmebxxoox);
        iobyxmoadg iobyxmoadgVar6 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(List.class), zoijcleaowVarPpxfxbqfkf5, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf5.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37321metgxyhuhe, zoijcleaowVarPpxfxbqfkf5.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf6 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37348vipkmwdibw);
        iobyxmoadg iobyxmoadgVar7 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Set.class), zoijcleaowVarPpxfxbqfkf6, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf6.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37282czzsidtyhn, zoijcleaowVarPpxfxbqfkf6.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf7 = iobyxmoadgVar2.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37335ribwqtqdhb);
        iobyxmoadg iobyxmoadgVar8 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(ListIterator.class), zoijcleaowVarPpxfxbqfkf7, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf7.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37336rlfsiqarku, zoijcleaowVarPpxfxbqfkf7.gxszxtbevo()), false));
        ii.ppxfxbqfkf ppxfxbqfkfVar3 = gh.ojitshcjhn.iobyxmoadg.f37307jhduphickx;
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf8 = iobyxmoadgVar2.ppxfxbqfkf(ppxfxbqfkfVar3);
        iobyxmoadg iobyxmoadgVar9 = new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Map.class), zoijcleaowVarPpxfxbqfkf8, new ii.zoijcleaow(zoijcleaowVarPpxfxbqfkf8.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37346uwvvkdfqfp, zoijcleaowVarPpxfxbqfkf8.gxszxtbevo()), false));
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf9 = iobyxmoadgVar2.ppxfxbqfkf(ppxfxbqfkfVar3);
        ii.gxszxtbevo gxszxtbevoVarLqeggnwhkg = gh.ojitshcjhn.iobyxmoadg.f37298ikoacuggdj.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, "shortName(...)");
        ii.zoijcleaow zoijcleaowVarWkgbmnqykc = zoijcleaowVarPpxfxbqfkf9.wkgbmnqykc(gxszxtbevoVarLqeggnwhkg);
        List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7, iobyxmoadgVar8, iobyxmoadgVar9, new iobyxmoadg(ppxfxbqfkfVar.lqeggnwhkg(Map.Entry.class), zoijcleaowVarWkgbmnqykc, new ii.zoijcleaow(zoijcleaowVarWkgbmnqykc.gxszxtbevo(), ii.eablkybsjg.lqeggnwhkg(gh.ojitshcjhn.iobyxmoadg.f37358yfnezrywwk, zoijcleaowVarWkgbmnqykc.gxszxtbevo()), false)));
        f44271vdvldrhtss = listRgvfuqvkyq;
        ppxfxbqfkfVar.gxszxtbevo(Object.class, gh.ojitshcjhn.iobyxmoadg.f37364zoijcleaow);
        ppxfxbqfkfVar.gxszxtbevo(String.class, gh.ojitshcjhn.iobyxmoadg.f37324nufgyqmvbu);
        ppxfxbqfkfVar.gxszxtbevo(CharSequence.class, gh.ojitshcjhn.iobyxmoadg.f37317lqeggnwhkg);
        ppxfxbqfkfVar.eablkybsjg(Throwable.class, gh.ojitshcjhn.iobyxmoadg.f37359yggfygwlhe);
        ppxfxbqfkfVar.gxszxtbevo(Cloneable.class, gh.ojitshcjhn.iobyxmoadg.f37352wkgbmnqykc);
        ppxfxbqfkfVar.gxszxtbevo(Number.class, gh.ojitshcjhn.iobyxmoadg.f37330oxmwwwfdhm);
        ppxfxbqfkfVar.eablkybsjg(Comparable.class, gh.ojitshcjhn.iobyxmoadg.f37311jyumaefscl);
        ppxfxbqfkfVar.gxszxtbevo(Enum.class, gh.ojitshcjhn.iobyxmoadg.f37313kcexrzcfyt);
        ppxfxbqfkfVar.eablkybsjg(Annotation.class, gh.ojitshcjhn.iobyxmoadg.f37316lmojexxdyd);
        Iterator it = listRgvfuqvkyq.iterator();
        while (it.hasNext()) {
            f44265iobyxmoadg.wkgbmnqykc((iobyxmoadg) it.next());
        }
        for (qi.eablkybsjg eablkybsjgVar : qi.eablkybsjg.values()) {
            ppxfxbqfkf ppxfxbqfkfVar4 = f44265iobyxmoadg;
            ii.zoijcleaow.iobyxmoadg iobyxmoadgVar10 = ii.zoijcleaow.f44488wkgbmnqykc;
            ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = eablkybsjgVar.draadjrbmk();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk, "getWrapperFqName(...)");
            ii.zoijcleaow zoijcleaowVarPpxfxbqfkf10 = iobyxmoadgVar10.ppxfxbqfkf(ppxfxbqfkfVarDraadjrbmk);
            gh.draadjrbmk draadjrbmkVarBtonecajqb = eablkybsjgVar.btonecajqb();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(draadjrbmkVarBtonecajqb, "getPrimitiveType(...)");
            ppxfxbqfkfVar4.iobyxmoadg(zoijcleaowVarPpxfxbqfkf10, iobyxmoadgVar10.ppxfxbqfkf(gh.ojitshcjhn.ppxfxbqfkf(draadjrbmkVarBtonecajqb)));
        }
        for (ii.zoijcleaow zoijcleaowVar2 : gh.wkgbmnqykc.f37385iobyxmoadg.iobyxmoadg()) {
            f44265iobyxmoadg.iobyxmoadg(ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf("kotlin.jvm.internal." + zoijcleaowVar2.nufgyqmvbu().zoijcleaow() + "CompanionObject")), zoijcleaowVar2.wkgbmnqykc(ii.nufgyqmvbu.f44476wkgbmnqykc));
        }
        for (int i13 = 0; i13 < 23; i13++) {
            ppxfxbqfkf ppxfxbqfkfVar5 = f44265iobyxmoadg;
            ppxfxbqfkfVar5.iobyxmoadg(ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf("kotlin.jvm.functions.Function" + i13)), gh.ojitshcjhn.iobyxmoadg(i13));
            ppxfxbqfkfVar5.ppxfxbqfkf(new ii.ppxfxbqfkf(f44269ppxfxbqfkf + i13), f44267nufgyqmvbu);
        }
        for (int i14 = 0; i14 < 22; i14++) {
            hh.gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar6 = hh.gxszxtbevo.ppxfxbqfkf.f40299eablkybsjg;
            f44265iobyxmoadg.ppxfxbqfkf(new ii.ppxfxbqfkf((ppxfxbqfkfVar6.zoijcleaow() + '.' + ppxfxbqfkfVar6.iobyxmoadg()) + i14), f44267nufgyqmvbu);
        }
        ppxfxbqfkf ppxfxbqfkfVar7 = f44265iobyxmoadg;
        ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk2 = gh.ojitshcjhn.iobyxmoadg.f37333ppxfxbqfkf.draadjrbmk();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk2, "toSafe(...)");
        ppxfxbqfkfVar7.ppxfxbqfkf(ppxfxbqfkfVarDraadjrbmk2, ppxfxbqfkfVar7.lqeggnwhkg(Void.class));
    }

    private ppxfxbqfkf() {
    }

    private final boolean btonecajqb(ii.wkgbmnqykc wkgbmnqykcVar, String str) {
        Integer numVdvldrhtss;
        String strZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
        if (!mj.kcexrzcfyt.stevsuqkhv(strZoijcleaow, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strZoijcleaow.substring(str.length());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return (mj.kcexrzcfyt.ezmngbhpjk(strSubstring, '0', false, 2, null) || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(strSubstring)) == null || numVdvldrhtss.intValue() < 23) ? false : true;
    }

    private final void eablkybsjg(Class cls, ii.ppxfxbqfkf ppxfxbqfkfVar) {
        iobyxmoadg(lqeggnwhkg(cls), ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(ppxfxbqfkfVar));
    }

    private final void gxszxtbevo(Class cls, ii.wkgbmnqykc wkgbmnqykcVar) {
        ii.ppxfxbqfkf ppxfxbqfkfVarDraadjrbmk = wkgbmnqykcVar.draadjrbmk();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarDraadjrbmk, "toSafe(...)");
        eablkybsjg(cls, ppxfxbqfkfVarDraadjrbmk);
    }

    private final void iobyxmoadg(ii.zoijcleaow zoijcleaowVar, ii.zoijcleaow zoijcleaowVar2) {
        zoijcleaow(zoijcleaowVar, zoijcleaowVar2);
        ppxfxbqfkf(zoijcleaowVar2.iobyxmoadg(), zoijcleaowVar);
    }

    private final ii.zoijcleaow lqeggnwhkg(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf(cls.getCanonicalName()));
        }
        ii.zoijcleaow zoijcleaowVarLqeggnwhkg = lqeggnwhkg(declaringClass);
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(cls.getSimpleName());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        return zoijcleaowVarLqeggnwhkg.wkgbmnqykc(gxszxtbevoVarGxszxtbevo);
    }

    private final void ppxfxbqfkf(ii.ppxfxbqfkf ppxfxbqfkfVar, ii.zoijcleaow zoijcleaowVar) {
        f44260draadjrbmk.put(ppxfxbqfkfVar.btonecajqb(), zoijcleaowVar);
    }

    private final void wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
        ii.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ii.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        iobyxmoadg(zoijcleaowVarIobyxmoadg, zoijcleaowVarZoijcleaow);
        ppxfxbqfkf(zoijcleaowVarPpxfxbqfkf.iobyxmoadg(), zoijcleaowVarIobyxmoadg);
        f44268ojitshcjhn.put(zoijcleaowVarPpxfxbqfkf, zoijcleaowVarZoijcleaow);
        f44270rgvfuqvkyq.put(zoijcleaowVarZoijcleaow, zoijcleaowVarPpxfxbqfkf);
        ii.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zoijcleaowVarZoijcleaow.iobyxmoadg();
        ii.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg2 = zoijcleaowVarPpxfxbqfkf.iobyxmoadg();
        f44272wflxmlrfwp.put(zoijcleaowVarPpxfxbqfkf.iobyxmoadg().btonecajqb(), ppxfxbqfkfVarIobyxmoadg);
        f44258agtfadlqog.put(ppxfxbqfkfVarIobyxmoadg.btonecajqb(), ppxfxbqfkfVarIobyxmoadg2);
    }

    private final void zoijcleaow(ii.zoijcleaow zoijcleaowVar, ii.zoijcleaow zoijcleaowVar2) {
        f44263gtknphoqwx.put(zoijcleaowVar.iobyxmoadg().btonecajqb(), zoijcleaowVar2);
    }

    public final ii.zoijcleaow agtfadlqog(ii.wkgbmnqykc kotlinFqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinFqName, "kotlinFqName");
        if (!btonecajqb(kotlinFqName, f44274zoijcleaow) && !btonecajqb(kotlinFqName, f44273wkgbmnqykc)) {
            if (!btonecajqb(kotlinFqName, f44269ppxfxbqfkf) && !btonecajqb(kotlinFqName, f44262eablkybsjg)) {
                return (ii.zoijcleaow) f44260draadjrbmk.get(kotlinFqName);
            }
            return f44267nufgyqmvbu;
        }
        return f44264gxszxtbevo;
    }

    public final boolean draadjrbmk(ii.wkgbmnqykc wkgbmnqykcVar) {
        return f44258agtfadlqog.containsKey(wkgbmnqykcVar);
    }

    public final List dxjokdxxww() {
        return f44271vdvldrhtss;
    }

    public final boolean gtknphoqwx(ii.wkgbmnqykc wkgbmnqykcVar) {
        return f44272wflxmlrfwp.containsKey(wkgbmnqykcVar);
    }

    public final ii.ppxfxbqfkf nufgyqmvbu() {
        return f44266lqeggnwhkg;
    }

    public final ii.ppxfxbqfkf ojitshcjhn(ii.wkgbmnqykc wkgbmnqykcVar) {
        return (ii.ppxfxbqfkf) f44272wflxmlrfwp.get(wkgbmnqykcVar);
    }

    public final ii.ppxfxbqfkf rgvfuqvkyq(ii.wkgbmnqykc wkgbmnqykcVar) {
        return (ii.ppxfxbqfkf) f44258agtfadlqog.get(wkgbmnqykcVar);
    }

    public final ii.zoijcleaow wflxmlrfwp(ii.ppxfxbqfkf fqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        return (ii.zoijcleaow) f44263gtknphoqwx.get(fqName.btonecajqb());
    }
}
