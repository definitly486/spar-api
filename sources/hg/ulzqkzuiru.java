package hg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ulzqkzuiru extends ntlheqmsrt {
    public static final Map agtfadlqog(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : ntlheqmsrt.lqeggnwhkg(map);
        }
        return tzroggbefp.dxjokdxxww();
    }

    public static Object btonecajqb(Map map, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        return mbcevpiqjq.iobyxmoadg(map, obj);
    }

    public static Map draadjrbmk(gg.vdvldrhtss... pairs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pairs, "pairs");
        return pairs.length > 0 ? jyumaefscl(pairs, new LinkedHashMap(tzroggbefp.eablkybsjg(pairs.length))) : tzroggbefp.dxjokdxxww();
    }

    public static Map dxjokdxxww() {
        hcddaimhww hcddaimhwwVar = hcddaimhww.f40231zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hcddaimhwwVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return hcddaimhwwVar;
    }

    public static HashMap gtknphoqwx(gg.vdvldrhtss... pairs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pairs, "pairs");
        HashMap map = new HashMap(tzroggbefp.eablkybsjg(pairs.length));
        oxmwwwfdhm(map, pairs);
        return map;
    }

    public static Map iwizpuwonk(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map jyumaefscl(gg.vdvldrhtss[] vdvldrhtssVarArr, Map destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(vdvldrhtssVarArr, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        oxmwwwfdhm(destination, vdvldrhtssVarArr);
        return destination;
    }

    public static Map kcexrzcfyt(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return agtfadlqog(zdlpuopuiu(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return tzroggbefp.dxjokdxxww();
        }
        if (size != 1) {
            return zdlpuopuiu(iterable, new LinkedHashMap(tzroggbefp.eablkybsjg(collection.size())));
        }
        return tzroggbefp.gxszxtbevo((gg.vdvldrhtss) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static Map ojitshcjhn(Map map, gg.vdvldrhtss pair) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pair, "pair");
        if (map.isEmpty()) {
            return tzroggbefp.gxszxtbevo(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.lqeggnwhkg(), pair.nufgyqmvbu());
        return linkedHashMap;
    }

    public static final void oxmwwwfdhm(Map map, gg.vdvldrhtss[] pairs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pairs, "pairs");
        for (gg.vdvldrhtss vdvldrhtssVar : pairs) {
            map.put(vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.wkgbmnqykc());
        }
    }

    public static Map rgvfuqvkyq(Map map, Map map2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void vdvldrhtss(Map map, Iterable pairs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            gg.vdvldrhtss vdvldrhtssVar = (gg.vdvldrhtss) it.next();
            map.put(vdvldrhtssVar.iobyxmoadg(), vdvldrhtssVar.wkgbmnqykc());
        }
    }

    public static Map wflxmlrfwp(gg.vdvldrhtss... pairs) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(tzroggbefp.eablkybsjg(pairs.length));
        oxmwwwfdhm(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map yggfygwlhe(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? tzroggbefp.iwizpuwonk(map) : ntlheqmsrt.lqeggnwhkg(map);
        }
        return tzroggbefp.dxjokdxxww();
    }

    public static final Map zdlpuopuiu(Iterable iterable, Map destination) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(destination, "destination");
        vdvldrhtss(destination, iterable);
        return destination;
    }
}
