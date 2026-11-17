package aj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.yfnezrywwk;
import zi.grlcpdaxtj;
import zi.iwxlajgraz;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class agtfadlqog implements mi.zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gg.gtknphoqwx f2042eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f2043iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final agtfadlqog f2044ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yfnezrywwk f2045wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private tg.iobyxmoadg f2046zoijcleaow;

    public agtfadlqog(iwxlajgraz projection, tg.iobyxmoadg iobyxmoadgVar, agtfadlqog agtfadlqogVar, yfnezrywwk yfnezrywwkVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(projection, "projection");
        this.f2043iobyxmoadg = projection;
        this.f2046zoijcleaow = iobyxmoadgVar;
        this.f2044ppxfxbqfkf = agtfadlqogVar;
        this.f2045wkgbmnqykc = yfnezrywwkVar;
        this.f2042eablkybsjg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new btonecajqb(this));
    }

    private final List agtfadlqog() {
        return (List) this.f2042eablkybsjg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gxszxtbevo(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List lqeggnwhkg(agtfadlqog agtfadlqogVar) {
        tg.iobyxmoadg iobyxmoadgVar = agtfadlqogVar.f2046zoijcleaow;
        if (iobyxmoadgVar != null) {
            return (List) iobyxmoadgVar.invoke();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List oxmwwwfdhm(agtfadlqog agtfadlqogVar, lqeggnwhkg lqeggnwhkgVar) {
        List listZoijcleaow = agtfadlqogVar.zoijcleaow();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listZoijcleaow, 10));
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            arrayList.add(((grlcpdaxtj) it.next()).ezmngbhpjk(lqeggnwhkgVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rgvfuqvkyq(List list) {
        return list;
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public List zoijcleaow() {
        List listAgtfadlqog = agtfadlqog();
        return listAgtfadlqog == null ? hg.jyumaefscl.wflxmlrfwp() : listAgtfadlqog;
    }

    @Override // zi.zeieaojujs
    public boolean eablkybsjg() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(agtfadlqog.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        agtfadlqog agtfadlqogVar2 = this.f2044ppxfxbqfkf;
        if (agtfadlqogVar2 == null) {
            agtfadlqogVar2 = this;
        }
        agtfadlqog agtfadlqogVar3 = agtfadlqogVar.f2044ppxfxbqfkf;
        if (agtfadlqogVar3 != null) {
            obj = agtfadlqogVar3;
        }
        return agtfadlqogVar2 == obj;
    }

    @Override // zi.zeieaojujs
    public List getParameters() {
        return hg.jyumaefscl.wflxmlrfwp();
    }

    public int hashCode() {
        agtfadlqog agtfadlqogVar = this.f2044ppxfxbqfkf;
        return agtfadlqogVar != null ? agtfadlqogVar.hashCode() : super.hashCode();
    }

    public final void ojitshcjhn(List supertypes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supertypes, "supertypes");
        this.f2046zoijcleaow = new draadjrbmk(supertypes);
    }

    @Override // mi.zoijcleaow
    public iwxlajgraz ppxfxbqfkf() {
        return this.f2043iobyxmoadg;
    }

    public String toString() {
        return "CapturedType(" + ppxfxbqfkf() + ')';
    }

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public agtfadlqog iobyxmoadg(lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        iwxlajgraz iwxlajgrazVarIobyxmoadg = ppxfxbqfkf().iobyxmoadg(kotlinTypeRefiner);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iwxlajgrazVarIobyxmoadg, "refine(...)");
        wflxmlrfwp wflxmlrfwpVar = this.f2046zoijcleaow != null ? new wflxmlrfwp(this, kotlinTypeRefiner) : null;
        agtfadlqog agtfadlqogVar = this.f2044ppxfxbqfkf;
        if (agtfadlqogVar == null) {
            agtfadlqogVar = this;
        }
        return new agtfadlqog(iwxlajgrazVarIobyxmoadg, wflxmlrfwpVar, agtfadlqogVar, this.f2045wkgbmnqykc);
    }

    @Override // zi.zeieaojujs
    public gh.dxjokdxxww wflxmlrfwp() {
        kegysxyocb type = ppxfxbqfkf().getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return ej.wkgbmnqykc.agtfadlqog(type);
    }

    @Override // zi.zeieaojujs
    public jh.nufgyqmvbu wkgbmnqykc() {
        return null;
    }

    public /* synthetic */ agtfadlqog(iwxlajgraz iwxlajgrazVar, tg.iobyxmoadg iobyxmoadgVar, agtfadlqog agtfadlqogVar, yfnezrywwk yfnezrywwkVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iwxlajgrazVar, (i13 & 2) != 0 ? null : iobyxmoadgVar, (i13 & 4) != 0 ? null : agtfadlqogVar, (i13 & 8) != 0 ? null : yfnezrywwkVar);
    }

    public /* synthetic */ agtfadlqog(iwxlajgraz iwxlajgrazVar, List list, agtfadlqog agtfadlqogVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iwxlajgrazVar, list, (i13 & 4) != 0 ? null : agtfadlqogVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(iwxlajgraz projection, List supertypes, agtfadlqog agtfadlqogVar) {
        this(projection, new gtknphoqwx(supertypes), agtfadlqogVar, null, 8, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(projection, "projection");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supertypes, "supertypes");
    }
}
