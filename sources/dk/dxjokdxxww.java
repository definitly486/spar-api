package dk;

import fk.weqkydbzbr;
import fk.ydmasvzmpa;
import gg.cqumvgiudr;
import hg.cllcsxoeiz;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww implements gxszxtbevo, fk.wflxmlrfwp {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final Map f29065btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final gg.gtknphoqwx f29066draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final boolean[] f29067dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Set f29068eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final gxszxtbevo[] f29069gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String[] f29070gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29071iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gxszxtbevo[] f29072lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final List[] f29073nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f29074ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f29075wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final agtfadlqog f29076zoijcleaow;

    public dxjokdxxww(String serialName, agtfadlqog kind, int i13, List typeParameters, iobyxmoadg builder) {
        zdlpuopuiu.btonecajqb(serialName, "serialName");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(typeParameters, "typeParameters");
        zdlpuopuiu.btonecajqb(builder, "builder");
        this.f29071iobyxmoadg = serialName;
        this.f29076zoijcleaow = kind;
        this.f29074ppxfxbqfkf = i13;
        this.f29075wkgbmnqykc = builder.ppxfxbqfkf();
        this.f29068eablkybsjg = jyumaefscl.k(builder.gxszxtbevo());
        String[] strArr = (String[]) builder.gxszxtbevo().toArray(new String[0]);
        this.f29070gxszxtbevo = strArr;
        this.f29072lqeggnwhkg = ydmasvzmpa.zoijcleaow(builder.eablkybsjg());
        this.f29073nufgyqmvbu = (List[]) builder.wkgbmnqykc().toArray(new List[0]);
        this.f29067dxjokdxxww = jyumaefscl.h(builder.lqeggnwhkg());
        Iterable<cllcsxoeiz> iterableV = hg.agtfadlqog.v(strArr);
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(iterableV, 10));
        for (cllcsxoeiz cllcsxoeizVar : iterableV) {
            arrayList.add(cqumvgiudr.iobyxmoadg(cllcsxoeizVar.wkgbmnqykc(), Integer.valueOf(cllcsxoeizVar.ppxfxbqfkf())));
        }
        this.f29065btonecajqb = tzroggbefp.kcexrzcfyt(arrayList);
        this.f29069gtknphoqwx = ydmasvzmpa.zoijcleaow(typeParameters);
        this.f29066draadjrbmk = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: dk.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(dxjokdxxww.draadjrbmk(this.f29093zdlpuopuiu));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence agtfadlqog(dxjokdxxww dxjokdxxwwVar, int i13) {
        return dxjokdxxwwVar.eablkybsjg(i13) + ": " + dxjokdxxwwVar.lqeggnwhkg(i13).nufgyqmvbu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int draadjrbmk(dxjokdxxww dxjokdxxwwVar) {
        return weqkydbzbr.iobyxmoadg(dxjokdxxwwVar, dxjokdxxwwVar.f29069gtknphoqwx);
    }

    private final int wflxmlrfwp() {
        return ((Number) this.f29066draadjrbmk.getValue()).intValue();
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        return this.f29067dxjokdxxww[i13];
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        return this.f29070gxszxtbevo[i13];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dxjokdxxww) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            if (zdlpuopuiu.eablkybsjg(nufgyqmvbu(), gxszxtbevoVar.nufgyqmvbu()) && Arrays.equals(this.f29069gtknphoqwx, ((dxjokdxxww) obj).f29069gtknphoqwx) && wkgbmnqykc() == gxszxtbevoVar.wkgbmnqykc()) {
                int iWkgbmnqykc = wkgbmnqykc();
                for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
                    if (zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).nufgyqmvbu(), gxszxtbevoVar.lqeggnwhkg(i13).nufgyqmvbu()) && zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).getKind(), gxszxtbevoVar.lqeggnwhkg(i13).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return this.f29075wkgbmnqykc;
    }

    @Override // dk.gxszxtbevo
    public agtfadlqog getKind() {
        return this.f29076zoijcleaow;
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        return this.f29073nufgyqmvbu[i13];
    }

    public int hashCode() {
        return wflxmlrfwp();
    }

    @Override // fk.wflxmlrfwp
    public Set iobyxmoadg() {
        return this.f29068eablkybsjg;
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }

    @Override // dk.gxszxtbevo
    public gxszxtbevo lqeggnwhkg(int i13) {
        return this.f29072lqeggnwhkg[i13];
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f29071iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        zdlpuopuiu.btonecajqb(name, "name");
        Integer num = (Integer) this.f29065btonecajqb.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public String toString() {
        return jyumaefscl.iwxlajgraz(zg.gtknphoqwx.jyumaefscl(0, wkgbmnqykc()), ", ", nufgyqmvbu() + '(', ")", 0, null, new tg.draadjrbmk() { // from class: dk.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return dxjokdxxww.agtfadlqog(this.f29094zdlpuopuiu, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return this.f29074ppxfxbqfkf;
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
    }
}
