package sh;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final oxmwwwfdhm f106594iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f106595ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f106596zoijcleaow;

    static {
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm();
        f106594iobyxmoadg = oxmwwwfdhmVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f106596zoijcleaow = linkedHashMap;
        ii.dxjokdxxww dxjokdxxwwVar = ii.dxjokdxxww.f44377iobyxmoadg;
        oxmwwwfdhmVar.ppxfxbqfkf(dxjokdxxwwVar.draadjrbmk(), oxmwwwfdhmVar.iobyxmoadg("java.util.ArrayList", "java.util.LinkedList"));
        oxmwwwfdhmVar.ppxfxbqfkf(dxjokdxxwwVar.agtfadlqog(), oxmwwwfdhmVar.iobyxmoadg("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        oxmwwwfdhmVar.ppxfxbqfkf(dxjokdxxwwVar.wflxmlrfwp(), oxmwwwfdhmVar.iobyxmoadg("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ii.zoijcleaow.iobyxmoadg iobyxmoadgVar = ii.zoijcleaow.f44488wkgbmnqykc;
        oxmwwwfdhmVar.ppxfxbqfkf(iobyxmoadgVar.ppxfxbqfkf(new ii.ppxfxbqfkf("java.util.function.Function")), oxmwwwfdhmVar.iobyxmoadg("java.util.function.UnaryOperator"));
        oxmwwwfdhmVar.ppxfxbqfkf(iobyxmoadgVar.ppxfxbqfkf(new ii.ppxfxbqfkf("java.util.function.BiFunction")), oxmwwwfdhmVar.iobyxmoadg("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(((ii.zoijcleaow) entry.getKey()).iobyxmoadg(), ((ii.zoijcleaow) entry.getValue()).iobyxmoadg()));
        }
        f106595ppxfxbqfkf = hg.tzroggbefp.kcexrzcfyt(arrayList);
    }

    private oxmwwwfdhm() {
    }

    private final List iobyxmoadg(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(new ii.ppxfxbqfkf(str)));
        }
        return arrayList;
    }

    private final void ppxfxbqfkf(ii.zoijcleaow zoijcleaowVar, List list) {
        Map map = f106596zoijcleaow;
        for (Object obj : list) {
            map.put(obj, zoijcleaowVar);
        }
    }

    public final ii.ppxfxbqfkf zoijcleaow(ii.ppxfxbqfkf classFqName) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classFqName, "classFqName");
        return (ii.ppxfxbqfkf) f106595ppxfxbqfkf.get(classFqName);
    }
}
