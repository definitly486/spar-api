package hg;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jztzpxfvev extends okpsazkaxt {
    public static Set dxjokdxxww(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return agtfadlqog.u(elements);
    }

    public static Set eablkybsjg() {
        return jpowsppfya.f40244zdlpuopuiu;
    }

    public static LinkedHashSet gxszxtbevo(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return (LinkedHashSet) kcexrzcfyt.krqnebusok(elements, new LinkedHashSet(tzroggbefp.eablkybsjg(elements.length)));
    }

    public static Set lqeggnwhkg(Object... elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return (Set) kcexrzcfyt.krqnebusok(elements, new LinkedHashSet(tzroggbefp.eablkybsjg(elements.length)));
    }

    public static final Set nufgyqmvbu(Set set) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : ikoacuggdj.wkgbmnqykc(set.iterator().next());
        }
        return ikoacuggdj.eablkybsjg();
    }
}
