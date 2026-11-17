package fk;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class iyctptxqzt implements dk.gxszxtbevo, wflxmlrfwp {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final gg.gtknphoqwx f34169btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final gg.gtknphoqwx f34170draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private Map f34171dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String[] f34172eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gg.gtknphoqwx f34173gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List[] f34174gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34175iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private List f34176lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean[] f34177nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f34178ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f34179wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iozdgvuglv f34180zoijcleaow;

    public iyctptxqzt(String serialName, iozdgvuglv iozdgvuglvVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serialName, "serialName");
        this.f34175iobyxmoadg = serialName;
        this.f34180zoijcleaow = iozdgvuglvVar;
        this.f34178ppxfxbqfkf = i13;
        this.f34179wkgbmnqykc = -1;
        String[] strArr = new String[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            strArr[i14] = "[UNINITIALIZED]";
        }
        this.f34172eablkybsjg = strArr;
        int i15 = this.f34178ppxfxbqfkf;
        this.f34174gxszxtbevo = new List[i15];
        this.f34177nufgyqmvbu = new boolean[i15];
        this.f34171dxjokdxxww = hg.tzroggbefp.dxjokdxxww();
        gg.ojitshcjhn ojitshcjhnVar = gg.ojitshcjhn.PUBLICATION;
        this.f34169btonecajqb = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: fk.oipsdeybqn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return iyctptxqzt.oxmwwwfdhm(this.f34213zdlpuopuiu);
            }
        });
        this.f34173gtknphoqwx = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: fk.bfopjjpdmp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return iyctptxqzt.esjtqupxsv(this.f34105zdlpuopuiu);
            }
        });
        this.f34170draadjrbmk = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: fk.opjhrmiecq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(iyctptxqzt.agtfadlqog(this.f34217zdlpuopuiu));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int agtfadlqog(iyctptxqzt iyctptxqztVar) {
        return weqkydbzbr.iobyxmoadg(iyctptxqztVar, iyctptxqztVar.zdlpuopuiu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence cqumvgiudr(iyctptxqzt iyctptxqztVar, int i13) {
        return iyctptxqztVar.eablkybsjg(i13) + ": " + iyctptxqztVar.lqeggnwhkg(i13).nufgyqmvbu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo[] esjtqupxsv(iyctptxqzt iyctptxqztVar) {
        ArrayList arrayList;
        bk.zoijcleaow[] zoijcleaowVarArrPpxfxbqfkf;
        iozdgvuglv iozdgvuglvVar = iyctptxqztVar.f34180zoijcleaow;
        if (iozdgvuglvVar == null || (zoijcleaowVarArrPpxfxbqfkf = iozdgvuglvVar.ppxfxbqfkf()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(zoijcleaowVarArrPpxfxbqfkf.length);
            for (bk.zoijcleaow zoijcleaowVar : zoijcleaowVarArrPpxfxbqfkf) {
                arrayList.add(zoijcleaowVar.iobyxmoadg());
            }
        }
        return ydmasvzmpa.zoijcleaow(arrayList);
    }

    private final bk.zoijcleaow[] kcexrzcfyt() {
        return (bk.zoijcleaow[]) this.f34169btonecajqb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bk.zoijcleaow[] oxmwwwfdhm(iyctptxqzt iyctptxqztVar) {
        bk.zoijcleaow[] zoijcleaowVarArrEablkybsjg;
        iozdgvuglv iozdgvuglvVar = iyctptxqztVar.f34180zoijcleaow;
        return (iozdgvuglvVar == null || (zoijcleaowVarArrEablkybsjg = iozdgvuglvVar.eablkybsjg()) == null) ? lrnfpwlwnk.f34202iobyxmoadg : zoijcleaowVarArrEablkybsjg;
    }

    public static /* synthetic */ void rgvfuqvkyq(iyctptxqzt iyctptxqztVar, String str, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        iyctptxqztVar.ojitshcjhn(str, z13);
    }

    private final Map vdvldrhtss() {
        HashMap map = new HashMap();
        int length = this.f34172eablkybsjg.length;
        for (int i13 = 0; i13 < length; i13++) {
            map.put(this.f34172eablkybsjg[i13], Integer.valueOf(i13));
        }
        return map;
    }

    private final int yggfygwlhe() {
        return ((Number) this.f34170draadjrbmk.getValue()).intValue();
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        return this.f34177nufgyqmvbu[i13];
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        return this.f34172eablkybsjg[i13];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iyctptxqzt) {
            dk.gxszxtbevo gxszxtbevoVar = (dk.gxszxtbevo) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), gxszxtbevoVar.nufgyqmvbu()) && Arrays.equals(zdlpuopuiu(), ((iyctptxqzt) obj).zdlpuopuiu()) && wkgbmnqykc() == gxszxtbevoVar.wkgbmnqykc()) {
                int iWkgbmnqykc = wkgbmnqykc();
                for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).nufgyqmvbu(), gxszxtbevoVar.lqeggnwhkg(i13).nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).getKind(), gxszxtbevoVar.lqeggnwhkg(i13).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        List list = this.f34176lqeggnwhkg;
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }

    @Override // dk.gxszxtbevo
    public dk.agtfadlqog getKind() {
        return dk.ojitshcjhn.iobyxmoadg.f29095iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        List list = this.f34174gxszxtbevo[i13];
        return list == null ? hg.jyumaefscl.wflxmlrfwp() : list;
    }

    public int hashCode() {
        return yggfygwlhe();
    }

    @Override // fk.wflxmlrfwp
    public Set iobyxmoadg() {
        return this.f34171dxjokdxxww.keySet();
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return dk.gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }

    public final void iwizpuwonk(Annotation a13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        if (this.f34176lqeggnwhkg == null) {
            this.f34176lqeggnwhkg = new ArrayList(1);
        }
        List list = this.f34176lqeggnwhkg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
        list.add(a13);
    }

    public final void jyumaefscl(Annotation annotation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotation, "annotation");
        List arrayList = this.f34174gxszxtbevo[this.f34179wkgbmnqykc];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f34174gxszxtbevo[this.f34179wkgbmnqykc] = arrayList;
        }
        arrayList.add(annotation);
    }

    @Override // dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        return kcexrzcfyt()[i13].iobyxmoadg();
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f34175iobyxmoadg;
    }

    public final void ojitshcjhn(String name, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        String[] strArr = this.f34172eablkybsjg;
        int i13 = this.f34179wkgbmnqykc + 1;
        this.f34179wkgbmnqykc = i13;
        strArr[i13] = name;
        this.f34177nufgyqmvbu[i13] = z13;
        this.f34174gxszxtbevo[i13] = null;
        if (i13 == this.f34178ppxfxbqfkf - 1) {
            this.f34171dxjokdxxww = vdvldrhtss();
        }
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        Integer num = (Integer) this.f34171dxjokdxxww.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public String toString() {
        return hg.jyumaefscl.iwxlajgraz(zg.gtknphoqwx.jyumaefscl(0, this.f34178ppxfxbqfkf), ", ", nufgyqmvbu() + '(', ")", 0, null, new tg.draadjrbmk() { // from class: fk.zfvoamnweg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return iyctptxqzt.cqumvgiudr(this.f34260zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    @Override // dk.gxszxtbevo
    public final int wkgbmnqykc() {
        return this.f34178ppxfxbqfkf;
    }

    public final dk.gxszxtbevo[] zdlpuopuiu() {
        return (dk.gxszxtbevo[]) this.f34173gtknphoqwx.getValue();
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return dk.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
    }

    public /* synthetic */ iyctptxqzt(String str, iozdgvuglv iozdgvuglvVar, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i14 & 2) != 0 ? null : iozdgvuglvVar, i13);
    }
}
