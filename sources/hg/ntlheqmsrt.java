package hg;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ntlheqmsrt extends mbcevpiqjq {
    public static int eablkybsjg(int i13) {
        if (i13 < 0) {
            return i13;
        }
        if (i13 < 3) {
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) ((i13 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map gxszxtbevo(gg.vdvldrhtss pair) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.lqeggnwhkg(), pair.nufgyqmvbu());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map lqeggnwhkg(Map map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap nufgyqmvbu(Map map, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static Map ppxfxbqfkf() {
        return new ig.wkgbmnqykc();
    }

    public static Map wkgbmnqykc(int i13) {
        return new ig.wkgbmnqykc(i13);
    }

    public static Map zoijcleaow(Map builder) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        return ((ig.wkgbmnqykc) builder).zdlpuopuiu();
    }
}
