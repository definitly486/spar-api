package ai;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final kh.nufgyqmvbu f2002iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final gxszxtbevo f2003zoijcleaow;

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f2004iobyxmoadg;

        static {
            int[] iArr = new int[gtknphoqwx.values().length];
            try {
                iArr[gtknphoqwx.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gtknphoqwx.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2004iobyxmoadg = iArr;
        }
    }

    static {
        ii.ppxfxbqfkf ENHANCED_NULLABILITY_ANNOTATION = sh.ylkuphrtab.f106654jyumaefscl;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f2002iobyxmoadg = new gxszxtbevo(ENHANCED_NULLABILITY_ANNOTATION);
        ii.ppxfxbqfkf ENHANCED_MUTABILITY_ANNOTATION = sh.ylkuphrtab.f106653iwizpuwonk;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f2003zoijcleaow = new gxszxtbevo(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final boolean dxjokdxxww(zi.kegysxyocb kegysxyocbVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kegysxyocbVar, "<this>");
        return yfnezrywwk.ppxfxbqfkf(aj.kcexrzcfyt.f2059iobyxmoadg, kegysxyocbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kh.nufgyqmvbu eablkybsjg(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new kh.ojitshcjhn(hg.jyumaefscl.m(list)) : (kh.nufgyqmvbu) hg.jyumaefscl.yzdjzghtvl(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jh.nufgyqmvbu gxszxtbevo(jh.nufgyqmvbu nufgyqmvbuVar, nufgyqmvbu nufgyqmvbuVar2, metgxyhuhe metgxyhuheVar) {
        ih.wkgbmnqykc wkgbmnqykcVar = ih.wkgbmnqykc.f44282iobyxmoadg;
        if (!rlfsiqarku.iobyxmoadg(metgxyhuheVar) || !(nufgyqmvbuVar instanceof jh.eablkybsjg)) {
            return null;
        }
        if (nufgyqmvbuVar2.eablkybsjg() == dxjokdxxww.READ_ONLY && metgxyhuheVar == metgxyhuhe.FLEXIBLE_LOWER) {
            jh.eablkybsjg eablkybsjgVar = (jh.eablkybsjg) nufgyqmvbuVar;
            if (wkgbmnqykcVar.ppxfxbqfkf(eablkybsjgVar)) {
                return wkgbmnqykcVar.iobyxmoadg(eablkybsjgVar);
            }
        }
        if (nufgyqmvbuVar2.eablkybsjg() != dxjokdxxww.MUTABLE || metgxyhuheVar != metgxyhuhe.FLEXIBLE_UPPER) {
            return null;
        }
        jh.eablkybsjg eablkybsjgVar2 = (jh.eablkybsjg) nufgyqmvbuVar;
        if (wkgbmnqykcVar.wkgbmnqykc(eablkybsjgVar2)) {
            return wkgbmnqykcVar.zoijcleaow(eablkybsjgVar2);
        }
        return null;
    }

    public static final kh.nufgyqmvbu lqeggnwhkg() {
        return f2002iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean nufgyqmvbu(nufgyqmvbu nufgyqmvbuVar, metgxyhuhe metgxyhuheVar) {
        if (!rlfsiqarku.iobyxmoadg(metgxyhuheVar)) {
            return null;
        }
        gtknphoqwx gtknphoqwxVarGxszxtbevo = nufgyqmvbuVar.gxszxtbevo();
        int i13 = gtknphoqwxVarGxszxtbevo == null ? -1 : iobyxmoadg.f2004iobyxmoadg[gtknphoqwxVarGxszxtbevo.ordinal()];
        if (i13 == 1) {
            return Boolean.TRUE;
        }
        if (i13 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }
}
