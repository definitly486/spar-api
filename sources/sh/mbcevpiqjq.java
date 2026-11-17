package sh;

import hg.ikoacuggdj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mbcevpiqjq {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private static final Map f106560agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Map f106561btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final Set f106562draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final iobyxmoadg.C2607iobyxmoadg f106563dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Map f106564eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Map f106565gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Map f106566gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f106567iobyxmoadg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final Set f106568lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Set f106569nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final List f106570ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Set f106571wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final List f106572wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final List f106573zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: sh.mbcevpiqjq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2607iobyxmoadg {

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            private final String f106574eablkybsjg;

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f106575iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f106576ppxfxbqfkf;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private final String f106577wkgbmnqykc;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final ii.gxszxtbevo f106578zoijcleaow;

            public C2607iobyxmoadg(String classInternalName, ii.gxszxtbevo name, String parameters, String returnType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classInternalName, "classInternalName");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(returnType, "returnType");
                this.f106575iobyxmoadg = classInternalName;
                this.f106578zoijcleaow = name;
                this.f106576ppxfxbqfkf = parameters;
                this.f106577wkgbmnqykc = returnType;
                this.f106574eablkybsjg = bi.iozdgvuglv.f16272iobyxmoadg.draadjrbmk(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C2607iobyxmoadg zoijcleaow(C2607iobyxmoadg c2607iobyxmoadg, String str, ii.gxszxtbevo gxszxtbevoVar, String str2, String str3, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = c2607iobyxmoadg.f106575iobyxmoadg;
                }
                if ((i13 & 2) != 0) {
                    gxszxtbevoVar = c2607iobyxmoadg.f106578zoijcleaow;
                }
                if ((i13 & 4) != 0) {
                    str2 = c2607iobyxmoadg.f106576ppxfxbqfkf;
                }
                if ((i13 & 8) != 0) {
                    str3 = c2607iobyxmoadg.f106577wkgbmnqykc;
                }
                return c2607iobyxmoadg.iobyxmoadg(str, gxszxtbevoVar, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2607iobyxmoadg)) {
                    return false;
                }
                C2607iobyxmoadg c2607iobyxmoadg = (C2607iobyxmoadg) obj;
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106575iobyxmoadg, c2607iobyxmoadg.f106575iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106578zoijcleaow, c2607iobyxmoadg.f106578zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106576ppxfxbqfkf, c2607iobyxmoadg.f106576ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f106577wkgbmnqykc, c2607iobyxmoadg.f106577wkgbmnqykc);
            }

            public int hashCode() {
                return (((((this.f106575iobyxmoadg.hashCode() * 31) + this.f106578zoijcleaow.hashCode()) * 31) + this.f106576ppxfxbqfkf.hashCode()) * 31) + this.f106577wkgbmnqykc.hashCode();
            }

            public final C2607iobyxmoadg iobyxmoadg(String classInternalName, ii.gxszxtbevo name, String parameters, String returnType) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classInternalName, "classInternalName");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(returnType, "returnType");
                return new C2607iobyxmoadg(classInternalName, name, parameters, returnType);
            }

            public final ii.gxszxtbevo ppxfxbqfkf() {
                return this.f106578zoijcleaow;
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f106575iobyxmoadg + ", name=" + this.f106578zoijcleaow + ", parameters=" + this.f106576ppxfxbqfkf + ", returnType=" + this.f106577wkgbmnqykc + ')';
            }

            public final String wkgbmnqykc() {
                return this.f106574eablkybsjg;
            }
        }

        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2607iobyxmoadg wflxmlrfwp(String str, String str2, String str3, String str4) {
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(str2);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            return new C2607iobyxmoadg(str, gxszxtbevoVarGxszxtbevo, str3, str4);
        }

        public final Map btonecajqb() {
            return mbcevpiqjq.f106565gtknphoqwx;
        }

        public final zoijcleaow draadjrbmk(String builtinSignature) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builtinSignature, "builtinSignature");
            if (ppxfxbqfkf().contains(builtinSignature)) {
                return zoijcleaow.ONE_COLLECTION_PARAMETER;
            }
            return ((ppxfxbqfkf) hg.tzroggbefp.btonecajqb(dxjokdxxww(), builtinSignature)) == ppxfxbqfkf.f106584yggfygwlhe ? zoijcleaow.OBJECT_PARAMETER_GENERIC : zoijcleaow.OBJECT_PARAMETER_NON_GENERIC;
        }

        public final Map dxjokdxxww() {
            return mbcevpiqjq.f106566gxszxtbevo;
        }

        public final Set eablkybsjg() {
            return mbcevpiqjq.f106569nufgyqmvbu;
        }

        public final boolean gtknphoqwx(ii.gxszxtbevo gxszxtbevoVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
            return lqeggnwhkg().contains(gxszxtbevoVar);
        }

        public final Map gxszxtbevo() {
            return mbcevpiqjq.f106560agtfadlqog;
        }

        public final Set lqeggnwhkg() {
            return mbcevpiqjq.f106571wflxmlrfwp;
        }

        public final C2607iobyxmoadg nufgyqmvbu() {
            return mbcevpiqjq.f106563dxjokdxxww;
        }

        public final List ppxfxbqfkf() {
            return mbcevpiqjq.f106570ppxfxbqfkf;
        }

        public final Set wkgbmnqykc() {
            return mbcevpiqjq.f106568lqeggnwhkg;
        }

        public final ii.gxszxtbevo zoijcleaow(ii.gxszxtbevo name) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            return (ii.gxszxtbevo) gxszxtbevo().get(name);
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ppxfxbqfkf[] f106580esjtqupxsv;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f106583lereixgezr;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f106585zdlpuopuiu;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final ppxfxbqfkf f106584yggfygwlhe = new ppxfxbqfkf("NULL", 0, null);

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final ppxfxbqfkf f106582jyumaefscl = new ppxfxbqfkf("INDEX", 1, -1);

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final ppxfxbqfkf f106581iwizpuwonk = new ppxfxbqfkf("FALSE", 2, Boolean.FALSE);

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        public static final ppxfxbqfkf f106579cqumvgiudr = new iobyxmoadg("MAP_GET_OR_DEFAULT", 3);

        static final class iobyxmoadg extends ppxfxbqfkf {
            /* JADX WARN: Illegal instructions before constructor call */
            iobyxmoadg(String str, int i13) {
                kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
                super(str, i13, gtknphoqwxVar, gtknphoqwxVar);
            }
        }

        static {
            ppxfxbqfkf[] ppxfxbqfkfVarArrIobyxmoadg = iobyxmoadg();
            f106580esjtqupxsv = ppxfxbqfkfVarArrIobyxmoadg;
            f106583lereixgezr = ng.zoijcleaow.iobyxmoadg(ppxfxbqfkfVarArrIobyxmoadg);
        }

        public /* synthetic */ ppxfxbqfkf(String str, int i13, Object obj, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(str, i13, obj);
        }

        private static final /* synthetic */ ppxfxbqfkf[] iobyxmoadg() {
            return new ppxfxbqfkf[]{f106584yggfygwlhe, f106582jyumaefscl, f106581iwizpuwonk, f106579cqumvgiudr};
        }

        public static ppxfxbqfkf valueOf(String str) {
            return (ppxfxbqfkf) Enum.valueOf(ppxfxbqfkf.class, str);
        }

        public static ppxfxbqfkf[] values() {
            return (ppxfxbqfkf[]) f106580esjtqupxsv.clone();
        }

        private ppxfxbqfkf(String str, int i13, Object obj) {
            super(str, i13);
            this.f106585zdlpuopuiu = obj;
        }
    }

    public enum zoijcleaow {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f106590lereixgezr = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f106591yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f106592zdlpuopuiu;

        zoijcleaow(String str, boolean z13) {
            this.f106592zdlpuopuiu = str;
            this.f106591yggfygwlhe = z13;
        }
    }

    static {
        Set<String> setDxjokdxxww = ikoacuggdj.dxjokdxxww("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(setDxjokdxxww, 10));
        for (String str : setDxjokdxxww) {
            iobyxmoadg iobyxmoadgVar = f106567iobyxmoadg;
            String strNufgyqmvbu = qi.eablkybsjg.BOOLEAN.nufgyqmvbu();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu, "getDesc(...)");
            arrayList.add(iobyxmoadgVar.wflxmlrfwp("java/util/Collection", str, "Ljava/util/Collection;", strNufgyqmvbu));
        }
        f106573zoijcleaow = arrayList;
        ArrayList arrayList2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((iobyxmoadg.C2607iobyxmoadg) it.next()).wkgbmnqykc());
        }
        f106570ppxfxbqfkf = arrayList2;
        List list = f106573zoijcleaow;
        ArrayList arrayList3 = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((iobyxmoadg.C2607iobyxmoadg) it2.next()).ppxfxbqfkf().zoijcleaow());
        }
        f106572wkgbmnqykc = arrayList3;
        bi.iozdgvuglv iozdgvuglvVar = bi.iozdgvuglv.f16272iobyxmoadg;
        iobyxmoadg iobyxmoadgVar2 = f106567iobyxmoadg;
        String strDxjokdxxww = iozdgvuglvVar.dxjokdxxww("Collection");
        qi.eablkybsjg eablkybsjgVar = qi.eablkybsjg.BOOLEAN;
        String strNufgyqmvbu2 = eablkybsjgVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu2, "getDesc(...)");
        iobyxmoadg.C2607iobyxmoadg c2607iobyxmoadgWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww, "contains", "Ljava/lang/Object;", strNufgyqmvbu2);
        ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.f106581iwizpuwonk;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(c2607iobyxmoadgWflxmlrfwp, ppxfxbqfkfVar);
        String strDxjokdxxww2 = iozdgvuglvVar.dxjokdxxww("Collection");
        String strNufgyqmvbu3 = eablkybsjgVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu3, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww2, "remove", "Ljava/lang/Object;", strNufgyqmvbu3), ppxfxbqfkfVar);
        String strDxjokdxxww3 = iozdgvuglvVar.dxjokdxxww("Map");
        String strNufgyqmvbu4 = eablkybsjgVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu4, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg3 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww3, "containsKey", "Ljava/lang/Object;", strNufgyqmvbu4), ppxfxbqfkfVar);
        String strDxjokdxxww4 = iozdgvuglvVar.dxjokdxxww("Map");
        String strNufgyqmvbu5 = eablkybsjgVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu5, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg4 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww4, "containsValue", "Ljava/lang/Object;", strNufgyqmvbu5), ppxfxbqfkfVar);
        String strDxjokdxxww5 = iozdgvuglvVar.dxjokdxxww("Map");
        String strNufgyqmvbu6 = eablkybsjgVar.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu6, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg5 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strNufgyqmvbu6), ppxfxbqfkfVar);
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg6 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(iozdgvuglvVar.dxjokdxxww("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), ppxfxbqfkf.f106579cqumvgiudr);
        iobyxmoadg.C2607iobyxmoadg c2607iobyxmoadgWflxmlrfwp2 = iobyxmoadgVar2.wflxmlrfwp(iozdgvuglvVar.dxjokdxxww("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.f106584yggfygwlhe;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg7 = gg.cqumvgiudr.iobyxmoadg(c2607iobyxmoadgWflxmlrfwp2, ppxfxbqfkfVar2);
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg8 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(iozdgvuglvVar.dxjokdxxww("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), ppxfxbqfkfVar2);
        String strDxjokdxxww6 = iozdgvuglvVar.dxjokdxxww("List");
        qi.eablkybsjg eablkybsjgVar2 = qi.eablkybsjg.INT;
        String strNufgyqmvbu7 = eablkybsjgVar2.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu7, "getDesc(...)");
        iobyxmoadg.C2607iobyxmoadg c2607iobyxmoadgWflxmlrfwp3 = iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww6, "indexOf", "Ljava/lang/Object;", strNufgyqmvbu7);
        ppxfxbqfkf ppxfxbqfkfVar3 = ppxfxbqfkf.f106582jyumaefscl;
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg9 = gg.cqumvgiudr.iobyxmoadg(c2607iobyxmoadgWflxmlrfwp3, ppxfxbqfkfVar3);
        String strDxjokdxxww7 = iozdgvuglvVar.dxjokdxxww("List");
        String strNufgyqmvbu8 = eablkybsjgVar2.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu8, "getDesc(...)");
        Map mapDraadjrbmk = hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg, vdvldrhtssVarIobyxmoadg2, vdvldrhtssVarIobyxmoadg3, vdvldrhtssVarIobyxmoadg4, vdvldrhtssVarIobyxmoadg5, vdvldrhtssVarIobyxmoadg6, vdvldrhtssVarIobyxmoadg7, vdvldrhtssVarIobyxmoadg8, vdvldrhtssVarIobyxmoadg9, gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar2.wflxmlrfwp(strDxjokdxxww7, "lastIndexOf", "Ljava/lang/Object;", strNufgyqmvbu8), ppxfxbqfkfVar3));
        f106564eablkybsjg = mapDraadjrbmk;
        LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapDraadjrbmk.size()));
        for (Map.Entry entry : mapDraadjrbmk.entrySet()) {
            linkedHashMap.put(((iobyxmoadg.C2607iobyxmoadg) entry.getKey()).wkgbmnqykc(), entry.getValue());
        }
        f106566gxszxtbevo = linkedHashMap;
        Set setDraadjrbmk = ikoacuggdj.draadjrbmk(f106564eablkybsjg.keySet(), f106573zoijcleaow);
        ArrayList arrayList4 = new ArrayList(hg.jyumaefscl.cqumvgiudr(setDraadjrbmk, 10));
        Iterator it3 = setDraadjrbmk.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((iobyxmoadg.C2607iobyxmoadg) it3.next()).ppxfxbqfkf());
        }
        f106568lqeggnwhkg = hg.jyumaefscl.r(arrayList4);
        ArrayList arrayList5 = new ArrayList(hg.jyumaefscl.cqumvgiudr(setDraadjrbmk, 10));
        Iterator it4 = setDraadjrbmk.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((iobyxmoadg.C2607iobyxmoadg) it4.next()).wkgbmnqykc());
        }
        f106569nufgyqmvbu = hg.jyumaefscl.r(arrayList5);
        iobyxmoadg iobyxmoadgVar3 = f106567iobyxmoadg;
        qi.eablkybsjg eablkybsjgVar3 = qi.eablkybsjg.INT;
        String strNufgyqmvbu9 = eablkybsjgVar3.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu9, "getDesc(...)");
        iobyxmoadg.C2607iobyxmoadg c2607iobyxmoadgWflxmlrfwp4 = iobyxmoadgVar3.wflxmlrfwp("java/util/List", "removeAt", strNufgyqmvbu9, "Ljava/lang/Object;");
        f106563dxjokdxxww = c2607iobyxmoadgWflxmlrfwp4;
        bi.iozdgvuglv iozdgvuglvVar2 = bi.iozdgvuglv.f16272iobyxmoadg;
        String strNufgyqmvbu10 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu11 = qi.eablkybsjg.BYTE.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu11, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg10 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu10, "toByte", "", strNufgyqmvbu11), ii.gxszxtbevo.gxszxtbevo("byteValue"));
        String strNufgyqmvbu12 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu13 = qi.eablkybsjg.SHORT.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu13, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg11 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu12, "toShort", "", strNufgyqmvbu13), ii.gxszxtbevo.gxszxtbevo("shortValue"));
        String strNufgyqmvbu14 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu15 = eablkybsjgVar3.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu15, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg12 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu14, "toInt", "", strNufgyqmvbu15), ii.gxszxtbevo.gxszxtbevo("intValue"));
        String strNufgyqmvbu16 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu17 = qi.eablkybsjg.LONG.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu17, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg13 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu16, "toLong", "", strNufgyqmvbu17), ii.gxszxtbevo.gxszxtbevo("longValue"));
        String strNufgyqmvbu18 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu19 = qi.eablkybsjg.FLOAT.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu19, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg14 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu18, "toFloat", "", strNufgyqmvbu19), ii.gxszxtbevo.gxszxtbevo("floatValue"));
        String strNufgyqmvbu20 = iozdgvuglvVar2.nufgyqmvbu("Number");
        String strNufgyqmvbu21 = qi.eablkybsjg.DOUBLE.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu21, "getDesc(...)");
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg15 = gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu20, "toDouble", "", strNufgyqmvbu21), ii.gxszxtbevo.gxszxtbevo("doubleValue"));
        gg.vdvldrhtss vdvldrhtssVarIobyxmoadg16 = gg.cqumvgiudr.iobyxmoadg(c2607iobyxmoadgWflxmlrfwp4, ii.gxszxtbevo.gxszxtbevo("remove"));
        String strNufgyqmvbu22 = iozdgvuglvVar2.nufgyqmvbu("CharSequence");
        String strNufgyqmvbu23 = eablkybsjgVar3.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu23, "getDesc(...)");
        String strNufgyqmvbu24 = qi.eablkybsjg.CHAR.nufgyqmvbu();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu24, "getDesc(...)");
        Map mapDraadjrbmk2 = hg.tzroggbefp.draadjrbmk(vdvldrhtssVarIobyxmoadg10, vdvldrhtssVarIobyxmoadg11, vdvldrhtssVarIobyxmoadg12, vdvldrhtssVarIobyxmoadg13, vdvldrhtssVarIobyxmoadg14, vdvldrhtssVarIobyxmoadg15, vdvldrhtssVarIobyxmoadg16, gg.cqumvgiudr.iobyxmoadg(iobyxmoadgVar3.wflxmlrfwp(strNufgyqmvbu22, "get", strNufgyqmvbu23, strNufgyqmvbu24), ii.gxszxtbevo.gxszxtbevo("charAt")));
        f106561btonecajqb = mapDraadjrbmk2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapDraadjrbmk2.size()));
        for (Map.Entry entry2 : mapDraadjrbmk2.entrySet()) {
            linkedHashMap2.put(((iobyxmoadg.C2607iobyxmoadg) entry2.getKey()).wkgbmnqykc(), entry2.getValue());
        }
        f106565gtknphoqwx = linkedHashMap2;
        Map map = f106561btonecajqb;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            linkedHashSet.add(iobyxmoadg.C2607iobyxmoadg.zoijcleaow((iobyxmoadg.C2607iobyxmoadg) entry3.getKey(), null, (ii.gxszxtbevo) entry3.getValue(), null, null, 13, null).wkgbmnqykc());
        }
        f106562draadjrbmk = linkedHashSet;
        Set setKeySet = f106561btonecajqb.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((iobyxmoadg.C2607iobyxmoadg) it5.next()).ppxfxbqfkf());
        }
        f106571wflxmlrfwp = hashSet;
        Set<Map.Entry> setEntrySet = f106561btonecajqb.entrySet();
        ArrayList<gg.vdvldrhtss> arrayList6 = new ArrayList(hg.jyumaefscl.cqumvgiudr(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList6.add(new gg.vdvldrhtss(((iobyxmoadg.C2607iobyxmoadg) entry4.getKey()).ppxfxbqfkf(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zg.gtknphoqwx.gxszxtbevo(hg.tzroggbefp.eablkybsjg(hg.jyumaefscl.cqumvgiudr(arrayList6, 10)), 16));
        for (gg.vdvldrhtss vdvldrhtssVar : arrayList6) {
            linkedHashMap3.put((ii.gxszxtbevo) vdvldrhtssVar.nufgyqmvbu(), (ii.gxszxtbevo) vdvldrhtssVar.lqeggnwhkg());
        }
        f106560agtfadlqog = linkedHashMap3;
    }
}
