package aj;

import zi.grlcpdaxtj;
import zi.kegysxyocb;
import zi.lrnfpwlwnk;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss implements rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final li.ojitshcjhn f2073eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f2074ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f2075wkgbmnqykc;

    public vdvldrhtss(lqeggnwhkg kotlinTypeRefiner, gxszxtbevo kotlinTypePreparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypePreparator, "kotlinTypePreparator");
        this.f2074ppxfxbqfkf = kotlinTypeRefiner;
        this.f2075wkgbmnqykc = kotlinTypePreparator;
        li.ojitshcjhn ojitshcjhnVarWflxmlrfwp = li.ojitshcjhn.wflxmlrfwp(wkgbmnqykc());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ojitshcjhnVarWflxmlrfwp, "createWithTypeRefiner(...)");
        this.f2073eablkybsjg = ojitshcjhnVarWflxmlrfwp;
    }

    public final boolean eablkybsjg(lrnfpwlwnk lrnfpwlwnkVar, grlcpdaxtj a13, grlcpdaxtj b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lrnfpwlwnkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(b13, "b");
        return zi.lqeggnwhkg.f130055iobyxmoadg.wflxmlrfwp(lrnfpwlwnkVar, a13, b13);
    }

    public gxszxtbevo gxszxtbevo() {
        return this.f2075wkgbmnqykc;
    }

    @Override // aj.rgvfuqvkyq
    public li.ojitshcjhn iobyxmoadg() {
        return this.f2073eablkybsjg;
    }

    public final boolean lqeggnwhkg(lrnfpwlwnk lrnfpwlwnkVar, grlcpdaxtj subType, grlcpdaxtj superType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lrnfpwlwnkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subType, "subType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(superType, "superType");
        return zi.lqeggnwhkg.jyumaefscl(zi.lqeggnwhkg.f130055iobyxmoadg, lrnfpwlwnkVar, subType, superType, false, 8, null);
    }

    @Override // aj.eablkybsjg
    public boolean ppxfxbqfkf(kegysxyocb a13, kegysxyocb b13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(a13, "a");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(b13, "b");
        return eablkybsjg(iobyxmoadg.zoijcleaow(false, false, null, gxszxtbevo(), wkgbmnqykc(), 6, null), a13.jrbgnlbqoe(), b13.jrbgnlbqoe());
    }

    @Override // aj.rgvfuqvkyq
    public lqeggnwhkg wkgbmnqykc() {
        return this.f2074ppxfxbqfkf;
    }

    @Override // aj.eablkybsjg
    public boolean zoijcleaow(kegysxyocb subtype, kegysxyocb supertype) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subtype, "subtype");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(supertype, "supertype");
        return lqeggnwhkg(iobyxmoadg.zoijcleaow(true, false, null, gxszxtbevo(), wkgbmnqykc(), 6, null), subtype.jrbgnlbqoe(), supertype.jrbgnlbqoe());
    }

    public /* synthetic */ vdvldrhtss(lqeggnwhkg lqeggnwhkgVar, gxszxtbevo gxszxtbevoVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(lqeggnwhkgVar, (i13 & 2) != 0 ? gxszxtbevo.iobyxmoadg.f2058iobyxmoadg : gxszxtbevoVar);
    }
}
