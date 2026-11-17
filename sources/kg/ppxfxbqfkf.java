package kg;

import java.util.Comparator;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    public static int eablkybsjg(Object obj, Object obj2, draadjrbmk... selectors) {
        zdlpuopuiu.btonecajqb(selectors, "selectors");
        if (selectors.length > 0) {
            return gxszxtbevo(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int gxszxtbevo(Object obj, Object obj2, draadjrbmk[] draadjrbmkVarArr) {
        for (draadjrbmk draadjrbmkVar : draadjrbmkVarArr) {
            int iWkgbmnqykc = iobyxmoadg.wkgbmnqykc((Comparable) draadjrbmkVar.invoke(obj), (Comparable) draadjrbmkVar.invoke(obj2));
            if (iWkgbmnqykc != 0) {
                return iWkgbmnqykc;
            }
        }
        return 0;
    }

    public static Comparator lqeggnwhkg() {
        gxszxtbevo gxszxtbevoVar = gxszxtbevo.f55376zdlpuopuiu;
        zdlpuopuiu.nufgyqmvbu(gxszxtbevoVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return gxszxtbevoVar;
    }

    public static Comparator nufgyqmvbu() {
        lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.f55377zdlpuopuiu;
        zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return lqeggnwhkgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ppxfxbqfkf(draadjrbmk[] draadjrbmkVarArr, Object obj, Object obj2) {
        return gxszxtbevo(obj, obj2, draadjrbmkVarArr);
    }

    public static int wkgbmnqykc(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Comparator zoijcleaow(final draadjrbmk... selectors) {
        zdlpuopuiu.btonecajqb(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kg.zoijcleaow
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ppxfxbqfkf.ppxfxbqfkf(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
