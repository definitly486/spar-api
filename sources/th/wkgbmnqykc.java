package th;

import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import sh.ylkuphrtab;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Map f110515eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f110516iobyxmoadg = new wkgbmnqykc();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ii.gxszxtbevo f110517ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ii.gxszxtbevo f110518wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ii.gxszxtbevo f110519zoijcleaow;

    static {
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo("message");
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        f110519zoijcleaow = gxszxtbevoVarGxszxtbevo;
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo2 = ii.gxszxtbevo.gxszxtbevo("allowedTargets");
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo2, "identifier(...)");
        f110517ppxfxbqfkf = gxszxtbevoVarGxszxtbevo2;
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo3 = ii.gxszxtbevo.gxszxtbevo("value");
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo3, "identifier(...)");
        f110518wkgbmnqykc = gxszxtbevoVarGxszxtbevo3;
        f110515eablkybsjg = tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg(gh.ojitshcjhn.iobyxmoadg.f37353wwaezpbzkn, ylkuphrtab.f106664wkgbmnqykc), cqumvgiudr.iobyxmoadg(gh.ojitshcjhn.iobyxmoadg.f37309jpowsppfya, ylkuphrtab.f106651gxszxtbevo), cqumvgiudr.iobyxmoadg(gh.ojitshcjhn.iobyxmoadg.f37354wypolnanlu, ylkuphrtab.f106648dxjokdxxww));
    }

    private wkgbmnqykc() {
    }

    public static /* synthetic */ kh.ppxfxbqfkf gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, zh.iobyxmoadg iobyxmoadgVar, vh.gtknphoqwx gtknphoqwxVar, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return wkgbmnqykcVar.eablkybsjg(iobyxmoadgVar, gtknphoqwxVar, z13);
    }

    public final kh.ppxfxbqfkf eablkybsjg(zh.iobyxmoadg annotation, vh.gtknphoqwx c13, boolean z13) {
        zdlpuopuiu.btonecajqb(annotation, "annotation");
        zdlpuopuiu.btonecajqb(c13, "c");
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = annotation.ppxfxbqfkf();
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        ii.ppxfxbqfkf TARGET_ANNOTATION = ylkuphrtab.f106664wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVarPpxfxbqfkf, iobyxmoadgVar.ppxfxbqfkf(TARGET_ANNOTATION))) {
            return new agtfadlqog(annotation, c13);
        }
        ii.ppxfxbqfkf RETENTION_ANNOTATION = ylkuphrtab.f106651gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVarPpxfxbqfkf, iobyxmoadgVar.ppxfxbqfkf(RETENTION_ANNOTATION))) {
            return new draadjrbmk(annotation, c13);
        }
        ii.ppxfxbqfkf DOCUMENTED_ANNOTATION = ylkuphrtab.f106648dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVarPpxfxbqfkf, iobyxmoadgVar.ppxfxbqfkf(DOCUMENTED_ANNOTATION))) {
            return new ppxfxbqfkf(c13, annotation, gh.ojitshcjhn.iobyxmoadg.f37354wypolnanlu);
        }
        ii.ppxfxbqfkf DEPRECATED_ANNOTATION = ylkuphrtab.f106657nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVarPpxfxbqfkf, iobyxmoadgVar.ppxfxbqfkf(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new wh.btonecajqb(c13, annotation, z13);
    }

    public final kh.ppxfxbqfkf iobyxmoadg(ii.ppxfxbqfkf kotlinName, zh.wkgbmnqykc annotationOwner, vh.gtknphoqwx c13) {
        zh.iobyxmoadg iobyxmoadgVarLqeggnwhkg;
        zdlpuopuiu.btonecajqb(kotlinName, "kotlinName");
        zdlpuopuiu.btonecajqb(annotationOwner, "annotationOwner");
        zdlpuopuiu.btonecajqb(c13, "c");
        if (zdlpuopuiu.eablkybsjg(kotlinName, gh.ojitshcjhn.iobyxmoadg.f37288esjtqupxsv)) {
            ii.ppxfxbqfkf DEPRECATED_ANNOTATION = ylkuphrtab.f106657nufgyqmvbu;
            zdlpuopuiu.dxjokdxxww(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            zh.iobyxmoadg iobyxmoadgVarLqeggnwhkg2 = annotationOwner.lqeggnwhkg(DEPRECATED_ANNOTATION);
            if (iobyxmoadgVarLqeggnwhkg2 != null || annotationOwner.cdpycssgdh()) {
                return new nufgyqmvbu(iobyxmoadgVarLqeggnwhkg2, c13);
            }
        }
        ii.ppxfxbqfkf ppxfxbqfkfVar = (ii.ppxfxbqfkf) f110515eablkybsjg.get(kotlinName);
        if (ppxfxbqfkfVar == null || (iobyxmoadgVarLqeggnwhkg = annotationOwner.lqeggnwhkg(ppxfxbqfkfVar)) == null) {
            return null;
        }
        return gxszxtbevo(f110516iobyxmoadg, iobyxmoadgVarLqeggnwhkg, c13, false, 4, null);
    }

    public final ii.gxszxtbevo ppxfxbqfkf() {
        return f110518wkgbmnqykc;
    }

    public final ii.gxszxtbevo wkgbmnqykc() {
        return f110517ppxfxbqfkf;
    }

    public final ii.gxszxtbevo zoijcleaow() {
        return f110519zoijcleaow;
    }
}
